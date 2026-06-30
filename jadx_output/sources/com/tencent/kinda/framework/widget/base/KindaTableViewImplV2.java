package com.tencent.kinda.framework.widget.base;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003@ABB\u0007¢\u0006\u0004\b>\u0010?J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0012\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u001a\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0018\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u000e\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"R\u001c\u0010&\u001a\b\u0018\u00010%R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010-\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010.R\u0016\u00106\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010.R\u0016\u00109\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010.R\u0016\u0010:\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010.R\u0016\u0010;\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<¨\u0006C"}, d2 = {"Lcom/tencent/kinda/framework/widget/base/KindaTableViewImplV2;", "Lcom/tencent/kinda/framework/widget/base/MMKView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/tencent/kinda/gen/KTableViewV2;", "Landroid/view/View;", "view", "", "extractTextFromView", "Landroidx/recyclerview/widget/k3;", "holder", "Ljz5/f0;", "setupCustomLongPressDrag", "Landroid/content/Context;", "context", "createView", "Ljava/util/ArrayList;", "Lcom/tencent/kinda/gen/KTableViewCellManagerV2;", "cells", "setCells", "getCells", "", "enabled", "setEnableFooterRefreshView", "Lcom/tencent/kinda/gen/VoidCallback;", "callback", "setFooterRefreshViewLoadMoreCallbackImpl", "setOnBeginScrollCallbackImpl", "", "position", "setSelection", "y", "setSelectionFromTop", "smoothScrollToPosition", "setDragEnabled", "", "delayMs", "setLongPressDragDelay", "Lcom/tencent/kinda/framework/widget/base/KindaTableViewImplV2$RecyclerAdapter;", "mAdapter", "Lcom/tencent/kinda/framework/widget/base/KindaTableViewImplV2$RecyclerAdapter;", "mDataList", "Ljava/util/ArrayList;", "mLoadMoreCallback", "Lcom/tencent/kinda/gen/VoidCallback;", "mOnScrollBeginCallback", "mEnableRefresh", "Z", "refreshFooterView", "Landroid/view/View;", "mIsScrolling", "Landroidx/recyclerview/widget/g1;", "mItemTouchHelper", "Landroidx/recyclerview/widget/g1;", "mDragEnabled", "mLongPressDragDelay", "J", "isDragging", "first", "last", "dragStartPosition", "I", "dragEndPosition", "<init>", "()V", "Companion", "RecyclerAdapter", "SpaceItemDecoration", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class KindaTableViewImplV2 extends com.tencent.kinda.framework.widget.base.MMKView<androidx.recyclerview.widget.RecyclerView> implements com.tencent.kinda.gen.KTableViewV2 {
    private static final java.lang.String TAG = "MicroMsg.KindaTableViewImplV2";
    private byte _hellAccFlag_;
    private boolean isDragging;
    private boolean last;
    private com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter mAdapter;
    private boolean mDragEnabled;
    private boolean mEnableRefresh;
    private boolean mIsScrolling;
    private androidx.recyclerview.widget.g1 mItemTouchHelper;
    private com.tencent.kinda.gen.VoidCallback mLoadMoreCallback;
    private com.tencent.kinda.gen.VoidCallback mOnScrollBeginCallback;
    private android.view.View refreshFooterView;
    private final java.util.ArrayList<com.tencent.kinda.gen.KTableViewCellManagerV2> mDataList = new java.util.ArrayList<>();
    private long mLongPressDragDelay = 100;
    private boolean first = true;
    private int dragStartPosition = -1;
    private int dragEndPosition = -1;

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/tencent/kinda/framework/widget/base/KindaTableViewImplV2$RecyclerAdapter;", "Landroidx/recyclerview/widget/f2;", "Landroidx/recyclerview/widget/k3;", "", "getItemCount", "position", "getItemViewType", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "holder", "Ljz5/f0;", "onBindViewHolder", "onViewRecycled", "fromPosition", "toPosition", "swapItems", "TYPE_ITEM", "I", "<init>", "(Lcom/tencent/kinda/framework/widget/base/KindaTableViewImplV2;)V", "ItemViewHolder", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes15.dex */
    public final class RecyclerAdapter extends androidx.recyclerview.widget.f2 {
        private final int TYPE_ITEM;

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/tencent/kinda/framework/widget/base/KindaTableViewImplV2$RecyclerAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/k3;", "Ljz5/f0;", "clearLongPressResources", "Landroid/widget/FrameLayout;", "container", "Landroid/widget/FrameLayout;", "getContainer", "()Landroid/widget/FrameLayout;", "Landroid/os/Handler;", "longPressHandler", "Landroid/os/Handler;", "getLongPressHandler", "()Landroid/os/Handler;", "setLongPressHandler", "(Landroid/os/Handler;)V", "Ljava/lang/Runnable;", "longPressRunnable", "Ljava/lang/Runnable;", "getLongPressRunnable", "()Ljava/lang/Runnable;", "setLongPressRunnable", "(Ljava/lang/Runnable;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/tencent/kinda/framework/widget/base/KindaTableViewImplV2$RecyclerAdapter;Landroid/view/View;)V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes15.dex */
        public final class ItemViewHolder extends androidx.recyclerview.widget.k3 {
            private final android.widget.FrameLayout container;
            private android.os.Handler longPressHandler;
            private java.lang.Runnable longPressRunnable;
            final /* synthetic */ com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ItemViewHolder(com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter recyclerAdapter, android.view.View itemView) {
                super(itemView);
                kotlin.jvm.internal.o.g(itemView, "itemView");
                this.this$0 = recyclerAdapter;
                this.container = itemView instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) itemView : null;
            }

            public final void clearLongPressResources() {
                android.os.Handler handler;
                java.lang.Runnable runnable = this.longPressRunnable;
                if (runnable != null && (handler = this.longPressHandler) != null) {
                    handler.removeCallbacks(runnable);
                }
                this.longPressHandler = null;
                this.longPressRunnable = null;
            }

            public final android.widget.FrameLayout getContainer() {
                return this.container;
            }

            public final android.os.Handler getLongPressHandler() {
                return this.longPressHandler;
            }

            public final java.lang.Runnable getLongPressRunnable() {
                return this.longPressRunnable;
            }

            public final void setLongPressHandler(android.os.Handler handler) {
                this.longPressHandler = handler;
            }

            public final void setLongPressRunnable(java.lang.Runnable runnable) {
                this.longPressRunnable = runnable;
            }
        }

        public RecyclerAdapter() {
        }

        @Override // androidx.recyclerview.widget.f2
        public int getItemCount() {
            return com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.mDataList.size();
        }

        @Override // androidx.recyclerview.widget.f2
        public int getItemViewType(int position) {
            return this.TYPE_ITEM;
        }

        @Override // androidx.recyclerview.widget.f2
        public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
            android.widget.FrameLayout container;
            android.widget.FrameLayout container2;
            kotlin.jvm.internal.o.g(holder, "holder");
            com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.TAG, "bind view holder: " + i17);
            com.tencent.kinda.gen.KViewLayout view = ((com.tencent.kinda.gen.KTableViewCellManagerV2) com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.mDataList.get(i17)).getView();
            com.tencent.kinda.framework.widget.base.MMKViewLayout mMKViewLayout = view instanceof com.tencent.kinda.framework.widget.base.MMKViewLayout ? (com.tencent.kinda.framework.widget.base.MMKViewLayout) view : null;
            android.view.ViewGroup viewGroup = mMKViewLayout != null ? (android.view.ViewGroup) mMKViewLayout.view : null;
            if (!(viewGroup instanceof android.view.ViewGroup)) {
                viewGroup = null;
            }
            android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroup);
            }
            com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter.ItemViewHolder itemViewHolder = holder instanceof com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter.ItemViewHolder ? (com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter.ItemViewHolder) holder : null;
            if (itemViewHolder != null && (container2 = itemViewHolder.getContainer()) != null) {
                container2.removeAllViews();
            }
            if (itemViewHolder != null && (container = itemViewHolder.getContainer()) != null) {
                container.addView(viewGroup);
            }
            if (itemViewHolder != null) {
                com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.setupCustomLongPressDrag(itemViewHolder);
            }
        }

        @Override // androidx.recyclerview.widget.f2
        public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
            kotlin.jvm.internal.o.g(parent, "parent");
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(parent.getContext());
            frameLayout.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, -2));
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setCornerRadius(parent.getContext().getResources().getDisplayMetrics().density * 8.0f);
            gradientDrawable.setColor(-1);
            frameLayout.setBackground(gradientDrawable);
            return new com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter.ItemViewHolder(this, frameLayout);
        }

        @Override // androidx.recyclerview.widget.f2
        public void onViewRecycled(androidx.recyclerview.widget.k3 holder) {
            kotlin.jvm.internal.o.g(holder, "holder");
            super.onViewRecycled(holder);
            com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter.ItemViewHolder itemViewHolder = holder instanceof com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter.ItemViewHolder ? (com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter.ItemViewHolder) holder : null;
            if (itemViewHolder != null) {
                itemViewHolder.clearLongPressResources();
            }
        }

        public final void swapItems(int i17, int i18) {
            java.util.Collections.swap(com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.mDataList, i17, i18);
            notifyItemMoved(i17, i18);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/kinda/framework/widget/base/KindaTableViewImplV2$SpaceItemDecoration;", "Landroidx/recyclerview/widget/p2;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/h3;", "state", "Ljz5/f0;", "getItemOffsets", "", "verticalSpacing", "I", "horizontalSpacing", "<init>", "(II)V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes8.dex */
    public static final class SpaceItemDecoration extends androidx.recyclerview.widget.p2 {
        private final int horizontalSpacing;
        private final int verticalSpacing;

        public SpaceItemDecoration(int i17, int i18) {
            this.verticalSpacing = i17;
            this.horizontalSpacing = i18;
        }

        @Override // androidx.recyclerview.widget.p2
        public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
            kotlin.jvm.internal.o.g(outRect, "outRect");
            kotlin.jvm.internal.o.g(view, "view");
            kotlin.jvm.internal.o.g(parent, "parent");
            kotlin.jvm.internal.o.g(state, "state");
            if (parent.u0(view) != 0) {
                outRect.top = this.verticalSpacing;
            }
            outRect.bottom = this.verticalSpacing;
            int i17 = this.horizontalSpacing;
            outRect.left = i17;
            outRect.right = i17;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String extractTextFromView(android.view.View view) {
        if (view instanceof android.widget.TextView) {
            java.lang.CharSequence text = ((android.widget.TextView) view).getText();
            java.lang.String obj = text != null ? text.toString() : null;
            if (!(obj == null || r26.n0.N(obj))) {
                return obj;
            }
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt != null) {
                java.lang.String extractTextFromView = extractTextFromView(childAt);
                if (!(extractTextFromView == null || r26.n0.N(extractTextFromView))) {
                    arrayList.add(extractTextFromView);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return (java.lang.String) kz5.n0.Z(arrayList);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupCustomLongPressDrag(final androidx.recyclerview.widget.k3 k3Var) {
        final com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter.ItemViewHolder itemViewHolder = k3Var instanceof com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter.ItemViewHolder ? (com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter.ItemViewHolder) k3Var : null;
        if (!this.mDragEnabled) {
            if (itemViewHolder != null) {
                itemViewHolder.clearLongPressResources();
            }
            k3Var.itemView.setOnLongClickListener(null);
            k3Var.itemView.setOnTouchListener(null);
            return;
        }
        if (itemViewHolder != null) {
            itemViewHolder.clearLongPressResources();
        }
        final kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        final kotlin.jvm.internal.e0 e0Var2 = new kotlin.jvm.internal.e0();
        final kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        final float f17 = 10.0f;
        k3Var.itemView.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$setupCustomLongPressDrag$1
            /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
            
                if (r0 != 3) goto L49;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(final android.view.View r6, android.view.MotionEvent r7) {
                /*
                    r5 = this;
                    int r0 = r7.getAction()
                    r1 = 0
                    if (r0 == 0) goto L67
                    r6 = 1
                    if (r0 == r6) goto L51
                    r2 = 2
                    if (r0 == r2) goto L12
                    r6 = 3
                    if (r0 == r6) goto L51
                    goto Ld2
                L12:
                    float r0 = r7.getX()
                    kotlin.jvm.internal.e0 r2 = r2
                    float r2 = r2.f310115d
                    float r0 = r0 - r2
                    float r0 = java.lang.Math.abs(r0)
                    float r7 = r7.getY()
                    kotlin.jvm.internal.e0 r2 = r3
                    float r2 = r2.f310115d
                    float r7 = r7 - r2
                    float r7 = java.lang.Math.abs(r7)
                    float r2 = r6
                    int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r0 > 0) goto L36
                    int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                    if (r7 <= 0) goto Ld2
                L36:
                    kotlin.jvm.internal.c0 r7 = r4
                    r7.f310112d = r6
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$RecyclerAdapter$ItemViewHolder r6 = r5
                    if (r6 == 0) goto Ld2
                    java.lang.Runnable r6 = r6.getLongPressRunnable()
                    if (r6 == 0) goto Ld2
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$RecyclerAdapter$ItemViewHolder r7 = r5
                    android.os.Handler r7 = r7.getLongPressHandler()
                    if (r7 == 0) goto Ld2
                    r7.removeCallbacks(r6)
                    goto Ld2
                L51:
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$RecyclerAdapter$ItemViewHolder r6 = r5
                    if (r6 == 0) goto Ld2
                    java.lang.Runnable r6 = r6.getLongPressRunnable()
                    if (r6 == 0) goto Ld2
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$RecyclerAdapter$ItemViewHolder r7 = r5
                    android.os.Handler r7 = r7.getLongPressHandler()
                    if (r7 == 0) goto Ld2
                    r7.removeCallbacks(r6)
                    goto Ld2
                L67:
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2 r0 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this
                    boolean r0 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.access$getMDragEnabled$p(r0)
                    if (r0 == 0) goto Ld2
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2 r0 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this
                    boolean r0 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.access$getMIsScrolling$p(r0)
                    if (r0 != 0) goto Ld2
                    kotlin.jvm.internal.e0 r0 = r2
                    float r2 = r7.getX()
                    r0.f310115d = r2
                    kotlin.jvm.internal.e0 r0 = r3
                    float r7 = r7.getY()
                    r0.f310115d = r7
                    kotlin.jvm.internal.c0 r7 = r4
                    r7.f310112d = r1
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$RecyclerAdapter$ItemViewHolder r7 = r5
                    if (r7 == 0) goto L92
                    r7.clearLongPressResources()
                L92:
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$RecyclerAdapter$ItemViewHolder r7 = r5
                    if (r7 != 0) goto L97
                    goto La3
                L97:
                    android.os.Handler r0 = new android.os.Handler
                    android.os.Looper r2 = android.os.Looper.getMainLooper()
                    r0.<init>(r2)
                    r7.setLongPressHandler(r0)
                La3:
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$RecyclerAdapter$ItemViewHolder r7 = r5
                    if (r7 != 0) goto La8
                    goto Lb6
                La8:
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$setupCustomLongPressDrag$1$1 r0 = new com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$setupCustomLongPressDrag$1$1
                    kotlin.jvm.internal.c0 r2 = r4
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2 r3 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this
                    androidx.recyclerview.widget.k3 r4 = r7
                    r0.<init>()
                    r7.setLongPressRunnable(r0)
                Lb6:
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$RecyclerAdapter$ItemViewHolder r6 = r5
                    if (r6 == 0) goto Ld2
                    android.os.Handler r6 = r6.getLongPressHandler()
                    if (r6 == 0) goto Ld2
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$RecyclerAdapter$ItemViewHolder r7 = r5
                    java.lang.Runnable r7 = r7.getLongPressRunnable()
                    kotlin.jvm.internal.o.d(r7)
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2 r0 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this
                    long r2 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.access$getMLongPressDragDelay$p(r0)
                    r6.postDelayed(r7, r2)
                Ld2:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$setupCustomLongPressDrag$1.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
    }

    @Override // com.tencent.kinda.gen.KTableViewV2
    public java.util.ArrayList<com.tencent.kinda.gen.KTableViewCellManagerV2> getCells() {
        com.tencent.mars.xlog.Log.i(TAG, "get cells: " + this.mDataList.size());
        return this.mDataList;
    }

    @Override // com.tencent.kinda.gen.KTableViewV2
    public void setCells(java.util.ArrayList<com.tencent.kinda.gen.KTableViewCellManagerV2> cells) {
        kotlin.jvm.internal.o.g(cells, "cells");
        com.tencent.mars.xlog.Log.i(TAG, "set cells: " + cells.size());
        this.mDataList.clear();
        this.mDataList.addAll(cells);
        com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter recyclerAdapter = this.mAdapter;
        if (recyclerAdapter != null) {
            recyclerAdapter.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.kinda.gen.KTableViewV2
    public void setDragEnabled(boolean z17) {
        this.mDragEnabled = z17;
    }

    @Override // com.tencent.kinda.gen.KTableViewV2
    public void setEnableFooterRefreshView(boolean z17) {
        this.mEnableRefresh = z17;
        android.view.View view = this.refreshFooterView;
        if (view == null) {
            return;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImplV2", "setEnableFooterRefreshView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/kinda/framework/widget/base/KindaTableViewImplV2", "setEnableFooterRefreshView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.kinda.gen.KTableViewV2
    public void setFooterRefreshViewLoadMoreCallbackImpl(com.tencent.kinda.gen.VoidCallback voidCallback) {
        com.tencent.mars.xlog.Log.i(TAG, "set footer refresh callback");
        this.mLoadMoreCallback = voidCallback;
    }

    public final void setLongPressDragDelay(long j17) {
        this.mLongPressDragDelay = j17;
    }

    @Override // com.tencent.kinda.gen.KTableViewV2
    public void setOnBeginScrollCallbackImpl(com.tencent.kinda.gen.VoidCallback voidCallback) {
        this.mOnScrollBeginCallback = voidCallback;
    }

    @Override // com.tencent.kinda.gen.KTableViewV2
    public void setSelection(int i17) {
        if (i17 < 0 || i17 >= this.mDataList.size()) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) this.view;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImplV2", "setSelection", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/kinda/framework/widget/base/KindaTableViewImplV2", "setSelection", "(I)V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.tencent.kinda.gen.KTableViewV2
    public void setSelectionFromTop(int i17, int i18) {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        if (i17 < 0 || i17 >= this.mDataList.size()) {
            return;
        }
        android.content.Context context = this.mContext;
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            i18 = (int) (i18 * displayMetrics.density);
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = ((androidx.recyclerview.widget.RecyclerView) this.view).getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImplV2", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/kinda/framework/widget/base/KindaTableViewImplV2", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            return;
        }
        com.tencent.mars.xlog.Log.w(TAG, "layoutManager is null");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) this.view;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImplV2", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/kinda/framework/widget/base/KindaTableViewImplV2", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.tencent.kinda.gen.KTableViewV2
    public void smoothScrollToPosition(final int i17) {
        if (i17 < 0 || i17 >= this.mDataList.size()) {
            return;
        }
        ((androidx.recyclerview.widget.RecyclerView) this.view).post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$smoothScrollToPosition$1
            private byte _hellAccFlag_;

            @Override // java.lang.Runnable
            public final void run() {
                androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.view;
                int i18 = i17;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImplV2$smoothScrollToPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(recyclerView, "com/tencent/kinda/framework/widget/base/KindaTableViewImplV2$smoothScrollToPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        });
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public androidx.recyclerview.widget.RecyclerView createView(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(context, null);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        this.view = recyclerView;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.a_, (android.view.ViewGroup) null);
        this.refreshFooterView = inflate;
        if (inflate != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImplV2", "createView", "(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/kinda/framework/widget/base/KindaTableViewImplV2", "createView", "(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter recyclerAdapter = new com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter();
        this.mAdapter = recyclerAdapter;
        ((androidx.recyclerview.widget.RecyclerView) this.view).setAdapter(recyclerAdapter);
        ((androidx.recyclerview.widget.RecyclerView) this.view).N(new com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.SpaceItemDecoration((int) (4 * context.getResources().getDisplayMetrics().density), (int) (16 * context.getResources().getDisplayMetrics().density)));
        int i17 = (int) (40 * context.getResources().getDisplayMetrics().density);
        T t17 = this.view;
        ((androidx.recyclerview.widget.RecyclerView) t17).setPadding(((androidx.recyclerview.widget.RecyclerView) t17).getPaddingLeft(), ((androidx.recyclerview.widget.RecyclerView) this.view).getPaddingTop(), ((androidx.recyclerview.widget.RecyclerView) this.view).getPaddingRight(), i17);
        ((androidx.recyclerview.widget.RecyclerView) this.view).setClipToPadding(false);
        androidx.recyclerview.widget.g1 g1Var = new androidx.recyclerview.widget.g1(new androidx.recyclerview.widget.a1() { // from class: com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$createView$callback$1
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
            
                if (r6 == null) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
            
                r6 = r5.extractTextFromView(r3);
             */
            @Override // androidx.recyclerview.widget.a1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void clearView(androidx.recyclerview.widget.RecyclerView r8, androidx.recyclerview.widget.k3 r9) {
                /*
                    Method dump skipped, instructions count: 350
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$createView$callback$1.clearView(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.k3):void");
            }

            @Override // androidx.recyclerview.widget.a1
            public int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView2, androidx.recyclerview.widget.k3 viewHolder) {
                kotlin.jvm.internal.o.g(recyclerView2, "recyclerView");
                kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
                return androidx.recyclerview.widget.a1.makeMovementFlags(3, 0);
            }

            @Override // androidx.recyclerview.widget.a1
            public boolean isLongPressDragEnabled() {
                return false;
            }

            @Override // androidx.recyclerview.widget.a1
            public void onChildDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView recyclerView2, androidx.recyclerview.widget.k3 viewHolder, float f17, float f18, int i18, boolean z17) {
                boolean z18;
                boolean z19;
                kotlin.jvm.internal.o.g(c17, "c");
                kotlin.jvm.internal.o.g(recyclerView2, "recyclerView");
                kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
                z18 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.first;
                if (z18) {
                    android.view.ViewPropertyAnimator animate = viewHolder.itemView.animate();
                    viewHolder.itemView.setTranslationZ(20.0f);
                    if (animate != null) {
                        animate.start();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.KindaTableViewImplV2", "onChildDraw: 添加阴影 translationZ=20");
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.first = false;
                }
                z19 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.last;
                if (z19) {
                    android.view.ViewPropertyAnimator animate2 = viewHolder.itemView.animate();
                    viewHolder.itemView.setTranslationZ(0.0f);
                    if (animate2 != null) {
                        animate2.start();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.KindaTableViewImplV2", "onChildDraw: 移除阴影 translationZ=0");
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.last = false;
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.first = true;
                }
                super.onChildDraw(c17, recyclerView2, viewHolder, f17, f18, i18, z17);
            }

            @Override // androidx.recyclerview.widget.a1
            public boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView2, androidx.recyclerview.widget.k3 viewHolder, androidx.recyclerview.widget.k3 target) {
                com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.RecyclerAdapter recyclerAdapter2;
                int i18;
                kotlin.jvm.internal.o.g(recyclerView2, "recyclerView");
                kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
                kotlin.jvm.internal.o.g(target, "target");
                int adapterPosition = viewHolder.getAdapterPosition();
                int adapterPosition2 = target.getAdapterPosition();
                if (adapterPosition == -1 || adapterPosition2 == -1) {
                    return true;
                }
                com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.dragEndPosition = adapterPosition2;
                recyclerAdapter2 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.mAdapter;
                if (recyclerAdapter2 != null) {
                    recyclerAdapter2.swapItems(adapterPosition, adapterPosition2);
                }
                viewHolder.itemView.performHapticFeedback(0, 2);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMove: from=");
                sb6.append(adapterPosition);
                sb6.append(", to=");
                sb6.append(adapterPosition2);
                sb6.append(", dragEndPosition=");
                i18 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.dragEndPosition;
                sb6.append(i18);
                com.tencent.mars.xlog.Log.i("MicroMsg.KindaTableViewImplV2", sb6.toString());
                return true;
            }

            @Override // androidx.recyclerview.widget.a1
            public void onSelectedChanged(androidx.recyclerview.widget.k3 k3Var, int i18) {
                int i19;
                int i27;
                com.tencent.mars.xlog.Log.i("MicroMsg.KindaTableViewImplV2", "onSelectedChanged: actionState=" + i18);
                if (i18 != 2 || k3Var == null) {
                    return;
                }
                com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.dragStartPosition = k3Var.getAdapterPosition();
                com.tencent.kinda.framework.widget.base.KindaTableViewImplV2 kindaTableViewImplV2 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this;
                i19 = kindaTableViewImplV2.dragStartPosition;
                kindaTableViewImplV2.dragEndPosition = i19;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("开始拖动: dragStartPosition=");
                i27 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.dragStartPosition;
                sb6.append(i27);
                com.tencent.mars.xlog.Log.i("MicroMsg.KindaTableViewImplV2", sb6.toString());
            }

            @Override // androidx.recyclerview.widget.a1
            public void onSwiped(androidx.recyclerview.widget.k3 viewHolder, int i18) {
                kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
            }
        });
        this.mItemTouchHelper = g1Var;
        g1Var.d((androidx.recyclerview.widget.RecyclerView) this.view);
        ((androidx.recyclerview.widget.RecyclerView) this.view).i(new androidx.recyclerview.widget.w2() { // from class: com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$createView$2
            @Override // androidx.recyclerview.widget.w2
            public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView2, int i18) {
                com.tencent.kinda.gen.VoidCallback voidCallback;
                kotlin.jvm.internal.o.g(recyclerView2, "recyclerView");
                if (i18 == 0) {
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.mIsScrolling = false;
                    return;
                }
                if (i18 != 1) {
                    return;
                }
                com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.mIsScrolling = true;
                voidCallback = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this.mOnScrollBeginCallback;
                if (voidCallback != null) {
                    voidCallback.call();
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
            
                r3 = r4.mLoadMoreCallback;
             */
            @Override // androidx.recyclerview.widget.w2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onScrolled(androidx.recyclerview.widget.RecyclerView r3, int r4, int r5) {
                /*
                    r2 = this;
                    java.lang.String r4 = "recyclerView"
                    kotlin.jvm.internal.o.g(r3, r4)
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2 r4 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this
                    boolean r4 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.access$getMEnableRefresh$p(r4)
                    if (r4 == 0) goto L44
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2 r4 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this
                    boolean r4 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.access$getMIsScrolling$p(r4)
                    if (r4 != 0) goto L44
                    androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r3.getLayoutManager()
                    boolean r4 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
                    if (r4 == 0) goto L20
                    androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
                    goto L21
                L20:
                    r3 = 0
                L21:
                    if (r3 == 0) goto L44
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2 r4 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.this
                    int r3 = r3.y()
                    com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$RecyclerAdapter r5 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.access$getMAdapter$p(r4)
                    r0 = 0
                    if (r5 == 0) goto L39
                    int r5 = r5.getItemCount()
                    r1 = 1
                    int r5 = r5 - r1
                    if (r3 != r5) goto L39
                    r0 = r1
                L39:
                    if (r0 == 0) goto L44
                    com.tencent.kinda.gen.VoidCallback r3 = com.tencent.kinda.framework.widget.base.KindaTableViewImplV2.access$getMLoadMoreCallback$p(r4)
                    if (r3 == 0) goto L44
                    r3.call()
                L44:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.base.KindaTableViewImplV2$createView$2.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
            }
        });
        T view = this.view;
        kotlin.jvm.internal.o.f(view, "view");
        return (androidx.recyclerview.widget.RecyclerView) view;
    }
}
