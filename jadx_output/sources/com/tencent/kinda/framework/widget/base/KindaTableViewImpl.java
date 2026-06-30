package com.tencent.kinda.framework.widget.base;

/* loaded from: classes15.dex */
public class KindaTableViewImpl extends com.tencent.kinda.framework.widget.base.MMKView<androidx.recyclerview.widget.RecyclerView> implements com.tencent.kinda.gen.KTableView {
    private static final java.lang.String TAG = "MicroMsg.KindaTableViewImpl";
    private byte _hellAccFlag_;
    private com.tencent.kinda.framework.widget.base.KindaTableViewImpl.RecyclerAdapter mAdapter;
    private java.util.ArrayList<com.tencent.kinda.gen.KTableViewCellManager> mDataList = new java.util.ArrayList<>();
    private boolean mEnableRefresh = false;
    private boolean mIsScrolling = false;
    private com.tencent.kinda.gen.VoidCallback mLoadMoreCallback;
    private com.tencent.kinda.gen.VoidCallback mOnScrollBeginCallback;
    private android.view.View refreshFooterView;

    /* loaded from: classes15.dex */
    public class RecyclerAdapter extends androidx.recyclerview.widget.f2 {
        private static final int TYPE_ITEM = 0;

        /* loaded from: classes15.dex */
        public class ItemViewHolder extends androidx.recyclerview.widget.k3 {
            android.widget.FrameLayout container;

            public ItemViewHolder(android.view.View view) {
                super(view);
                this.container = (android.widget.FrameLayout) view;
            }
        }

        private RecyclerAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$onBindViewHolder$0(int i17, android.view.View view) {
            com.tencent.kinda.framework.widget.base.KindaTableViewImpl.this.showEditActions(i17);
            return false;
        }

        @Override // androidx.recyclerview.widget.f2
        public int getItemCount() {
            return com.tencent.kinda.framework.widget.base.KindaTableViewImpl.this.mDataList.size();
        }

        @Override // androidx.recyclerview.widget.f2
        public int getItemViewType(int i17) {
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.f2
        public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, final int i17) {
            com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.KindaTableViewImpl.TAG, "bind view holder: %d", java.lang.Integer.valueOf(i17));
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((com.tencent.kinda.framework.widget.base.MMKViewLayout) ((com.tencent.kinda.gen.KTableViewCellManager) com.tencent.kinda.framework.widget.base.KindaTableViewImpl.this.mDataList.get(i17)).getView()).getView();
            if (viewGroup.getParent() != null) {
                ((android.view.ViewGroup) viewGroup.getParent()).removeView(viewGroup);
            }
            com.tencent.kinda.framework.widget.base.KindaTableViewImpl.RecyclerAdapter.ItemViewHolder itemViewHolder = (com.tencent.kinda.framework.widget.base.KindaTableViewImpl.RecyclerAdapter.ItemViewHolder) k3Var;
            itemViewHolder.container.removeAllViews();
            itemViewHolder.container.addView(viewGroup);
            if (((com.tencent.kinda.gen.KTableViewCellManager) com.tencent.kinda.framework.widget.base.KindaTableViewImpl.this.mDataList.get(i17)).getEditActions().isEmpty()) {
                viewGroup.setOnLongClickListener(null);
            } else {
                viewGroup.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.tencent.kinda.framework.widget.base.KindaTableViewImpl$RecyclerAdapter$$a
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view) {
                        boolean lambda$onBindViewHolder$0;
                        lambda$onBindViewHolder$0 = com.tencent.kinda.framework.widget.base.KindaTableViewImpl.RecyclerAdapter.this.lambda$onBindViewHolder$0(i17, view);
                        return lambda$onBindViewHolder$0;
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.f2
        public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
            return new com.tencent.kinda.framework.widget.base.KindaTableViewImpl.RecyclerAdapter.ItemViewHolder(frameLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$smoothScrollToPosition$0(int i17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) this.view;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "lambda$smoothScrollToPosition$0", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "lambda$smoothScrollToPosition$0", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showEditActions(int i17) {
        final android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null) {
            return;
        }
        final java.util.ArrayList<com.tencent.kinda.gen.KTableViewCellEditAction> editActions = this.mDataList.get(i17).getEditActions();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) topOrUIPageFragmentActivity, 1, false);
        k0Var.f211872n = new db5.o4() { // from class: com.tencent.kinda.framework.widget.base.KindaTableViewImpl.2
            @Override // db5.o4
            public void onCreateMMMenu(db5.g4 g4Var) {
                java.util.Iterator it = editActions.iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    com.tencent.kinda.gen.KTableViewCellEditAction kTableViewCellEditAction = (com.tencent.kinda.gen.KTableViewCellEditAction) it.next();
                    if (kTableViewCellEditAction.getIsDestructive()) {
                        g4Var.d(i18, topOrUIPageFragmentActivity.getResources().getColor(com.tencent.mm.R.color.f478532ac), kTableViewCellEditAction.getTitle());
                    } else {
                        g4Var.add(0, i18, 0, kTableViewCellEditAction.getTitle());
                    }
                    i18++;
                }
            }
        };
        k0Var.f211881s = new db5.t4() { // from class: com.tencent.kinda.framework.widget.base.KindaTableViewImpl.3
            @Override // db5.t4
            public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                if (i18 < editActions.size()) {
                    ((com.tencent.kinda.gen.KTableViewCellEditAction) editActions.get(i18)).triggered();
                }
            }
        };
        k0Var.v();
    }

    @Override // com.tencent.kinda.gen.KTableView
    public void setCells(java.util.ArrayList<com.tencent.kinda.gen.KTableViewCellManager> arrayList) {
        com.tencent.mars.xlog.Log.i(TAG, "set cells: %s", java.lang.Integer.valueOf(arrayList.size()));
        this.mDataList.clear();
        this.mDataList.addAll(arrayList);
        com.tencent.kinda.framework.widget.base.KindaTableViewImpl.RecyclerAdapter recyclerAdapter = this.mAdapter;
        if (recyclerAdapter != null) {
            recyclerAdapter.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.kinda.gen.KTableView
    public void setEnableFooterRefreshView(boolean z17) {
        this.mEnableRefresh = z17;
        if (z17) {
            android.view.View view = this.refreshFooterView;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setEnableFooterRefreshView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setEnableFooterRefreshView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.refreshFooterView;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setEnableFooterRefreshView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setEnableFooterRefreshView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.kinda.gen.KTableView
    public void setFooterRefreshViewLoadMoreCallbackImpl(com.tencent.kinda.gen.VoidCallback voidCallback) {
        com.tencent.mars.xlog.Log.i(TAG, "set footer refresh callback");
        this.mLoadMoreCallback = voidCallback;
    }

    @Override // com.tencent.kinda.gen.KTableView
    public void setOnBeginScrollCallbackImpl(com.tencent.kinda.gen.VoidCallback voidCallback) {
        this.mOnScrollBeginCallback = voidCallback;
    }

    @Override // com.tencent.kinda.gen.KTableView
    public void setSelection(int i17) {
        if (this.view == 0 || i17 < 0 || i17 >= this.mDataList.size()) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) this.view;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setSelection", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setSelection", "(I)V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.tencent.kinda.gen.KTableView
    public void setSelectionFromTop(int i17, int i18) {
        if (this.view == 0 || i17 < 0 || i17 >= this.mDataList.size()) {
            return;
        }
        android.content.Context context = this.mContext;
        if (context != null && context.getResources() != null && this.mContext.getResources().getDisplayMetrics() != null) {
            i18 = (int) (i18 * this.mContext.getResources().getDisplayMetrics().density);
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) ((androidx.recyclerview.widget.RecyclerView) this.view).getLayoutManager();
        if (linearLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            return;
        }
        com.tencent.mars.xlog.Log.w(TAG, "layoutManager is null");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) this.view;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.tencent.kinda.gen.KTableView
    public void smoothScrollToPosition(final int i17) {
        if (this.view == 0 || i17 < 0 || i17 >= this.mDataList.size()) {
            return;
        }
        ((androidx.recyclerview.widget.RecyclerView) this.view).post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.KindaTableViewImpl$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.kinda.framework.widget.base.KindaTableViewImpl.this.lambda$smoothScrollToPosition$0(i17);
            }
        });
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public androidx.recyclerview.widget.RecyclerView createView(android.content.Context context) {
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(context, null);
        this.view = recyclerView;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.a_, (android.view.ViewGroup) null);
        this.refreshFooterView = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "createView", "(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "createView", "(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.kinda.framework.widget.base.KindaTableViewImpl.RecyclerAdapter recyclerAdapter = new com.tencent.kinda.framework.widget.base.KindaTableViewImpl.RecyclerAdapter();
        this.mAdapter = recyclerAdapter;
        ((androidx.recyclerview.widget.RecyclerView) this.view).setAdapter(recyclerAdapter);
        ((androidx.recyclerview.widget.RecyclerView) this.view).i(new androidx.recyclerview.widget.w2() { // from class: com.tencent.kinda.framework.widget.base.KindaTableViewImpl.1
            @Override // androidx.recyclerview.widget.w2
            public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView2, int i17) {
                if (i17 != 1) {
                    if (i17 == 0) {
                        com.tencent.kinda.framework.widget.base.KindaTableViewImpl.this.mIsScrolling = false;
                    }
                } else {
                    com.tencent.kinda.framework.widget.base.KindaTableViewImpl.this.mIsScrolling = true;
                    if (com.tencent.kinda.framework.widget.base.KindaTableViewImpl.this.mOnScrollBeginCallback != null) {
                        com.tencent.kinda.framework.widget.base.KindaTableViewImpl.this.mOnScrollBeginCallback.call();
                    }
                }
            }

            @Override // androidx.recyclerview.widget.w2
            public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView2, int i17, int i18) {
                if (!com.tencent.kinda.framework.widget.base.KindaTableViewImpl.this.mEnableRefresh || com.tencent.kinda.framework.widget.base.KindaTableViewImpl.this.mIsScrolling || ((androidx.recyclerview.widget.LinearLayoutManager) recyclerView2.getLayoutManager()).y() != com.tencent.kinda.framework.widget.base.KindaTableViewImpl.this.mAdapter.getItemCount() - 1 || com.tencent.kinda.framework.widget.base.KindaTableViewImpl.this.mLoadMoreCallback == null) {
                    return;
                }
                com.tencent.kinda.framework.widget.base.KindaTableViewImpl.this.mLoadMoreCallback.call();
            }
        });
        return (androidx.recyclerview.widget.RecyclerView) this.view;
    }
}
