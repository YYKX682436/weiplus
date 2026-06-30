package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaTableViewImpl */
/* loaded from: classes15.dex */
public class C3313x4dc7e226 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3528x92709788 {
    private static final java.lang.String TAG = "MicroMsg.KindaTableViewImpl";

    /* renamed from: _hellAccFlag_ */
    private byte f12883x7f11beae;

    /* renamed from: mAdapter */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.RecyclerAdapter f12884x59855622;

    /* renamed from: mDataList */
    private java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.AbstractC3531xb42eb743> f12885x8f9cd6f5 = new java.util.ArrayList<>();

    /* renamed from: mEnableRefresh */
    private boolean f12886xde7a646b = false;

    /* renamed from: mIsScrolling */
    private boolean f12887x931753e = false;

    /* renamed from: mLoadMoreCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f12888x26df554d;

    /* renamed from: mOnScrollBeginCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f12889xa05bdf75;

    /* renamed from: refreshFooterView */
    private android.view.View f12890x2347f81b;

    /* renamed from: com.tencent.kinda.framework.widget.base.KindaTableViewImpl$RecyclerAdapter */
    /* loaded from: classes15.dex */
    public class RecyclerAdapter extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

        /* renamed from: TYPE_ITEM */
        private static final int f12897xc6cb18f8 = 0;

        /* renamed from: com.tencent.kinda.framework.widget.base.KindaTableViewImpl$RecyclerAdapter$ItemViewHolder */
        /* loaded from: classes15.dex */
        public class ItemViewHolder extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

            /* renamed from: container */
            android.widget.FrameLayout f12899xe7814c81;

            public ItemViewHolder(android.view.View view) {
                super(view);
                this.f12899xe7814c81 = (android.widget.FrameLayout) view;
            }
        }

        private RecyclerAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onBindViewHolder$0 */
        public /* synthetic */ boolean m26693xec0b29d6(int i17, android.view.View view) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.this.m26685xac757056(i17);
            return false;
        }

        @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
        /* renamed from: getItemCount */
        public int mo1894x7e414b06() {
            return com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.this.f12885x8f9cd6f5.size();
        }

        @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
        /* renamed from: getItemViewType */
        public int mo863xcdaf1228(int i17) {
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
        /* renamed from: onBindViewHolder */
        public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, final int i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.TAG, "bind view holder: %d", java.lang.Integer.valueOf(i17));
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a) ((com.p314xaae8f345.p347x615374d.gen.AbstractC3531xb42eb743) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.this.f12885x8f9cd6f5.get(i17)).mo28175xfb86a31b()).mo27110xfb86a31b();
            if (viewGroup.getParent() != null) {
                ((android.view.ViewGroup) viewGroup.getParent()).removeView(viewGroup);
            }
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.RecyclerAdapter.ItemViewHolder itemViewHolder = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.RecyclerAdapter.ItemViewHolder) k3Var;
            itemViewHolder.f12899xe7814c81.removeAllViews();
            itemViewHolder.f12899xe7814c81.addView(viewGroup);
            if (((com.p314xaae8f345.p347x615374d.gen.AbstractC3531xb42eb743) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.this.f12885x8f9cd6f5.get(i17)).mo28174x4d3ba5d().isEmpty()) {
                viewGroup.setOnLongClickListener(null);
            } else {
                viewGroup.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.tencent.kinda.framework.widget.base.KindaTableViewImpl$RecyclerAdapter$$a
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view) {
                        boolean m26693xec0b29d6;
                        m26693xec0b29d6 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.RecyclerAdapter.this.m26693xec0b29d6(i17, view);
                        return m26693xec0b29d6;
                    }
                });
            }
        }

        @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
        /* renamed from: onCreateViewHolder */
        public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
            return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.RecyclerAdapter.ItemViewHolder(frameLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$smoothScrollToPosition$0 */
    public void m26684xbea89448(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) this.f13218x373aa5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "lambda$smoothScrollToPosition$0", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        c1163xf1deaba4.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "lambda$smoothScrollToPosition$0", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showEditActions */
    public void m26685xac757056(int i17) {
        final android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        if (m27313x7608d9c4 == null) {
            return;
        }
        final java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.AbstractC3529xc7a0d18a> mo28174x4d3ba5d = this.f12885x8f9cd6f5.get(i17).mo28174x4d3ba5d();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) m27313x7608d9c4, 1, false);
        k0Var.f293405n = new db5.o4() { // from class: com.tencent.kinda.framework.widget.base.KindaTableViewImpl.2
            @Override // db5.o4
            /* renamed from: onCreateMMMenu */
            public void mo887xc459429a(db5.g4 g4Var) {
                java.util.Iterator it = mo28174x4d3ba5d.iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3529xc7a0d18a abstractC3529xc7a0d18a = (com.p314xaae8f345.p347x615374d.gen.AbstractC3529xc7a0d18a) it.next();
                    if (abstractC3529xc7a0d18a.mo28156xfc40ce42()) {
                        g4Var.d(i18, m27313x7608d9c4.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac), abstractC3529xc7a0d18a.mo28157x7531c8a2());
                    } else {
                        g4Var.add(0, i18, 0, abstractC3529xc7a0d18a.mo28157x7531c8a2());
                    }
                    i18++;
                }
            }
        };
        k0Var.f293414s = new db5.t4() { // from class: com.tencent.kinda.framework.widget.base.KindaTableViewImpl.3
            @Override // db5.t4
            /* renamed from: onMMMenuItemSelected */
            public void mo888x34063ac(android.view.MenuItem menuItem, int i18) {
                if (i18 < mo28174x4d3ba5d.size()) {
                    ((com.p314xaae8f345.p347x615374d.gen.AbstractC3529xc7a0d18a) mo28174x4d3ba5d.get(i18)).mo28158xd954d457();
                }
            }
        };
        k0Var.v();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3528x92709788
    /* renamed from: setCells */
    public void mo26686x52ce640f(java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.AbstractC3531xb42eb743> arrayList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "set cells: %s", java.lang.Integer.valueOf(arrayList.size()));
        this.f12885x8f9cd6f5.clear();
        this.f12885x8f9cd6f5.addAll(arrayList);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.RecyclerAdapter recyclerAdapter = this.f12884x59855622;
        if (recyclerAdapter != null) {
            recyclerAdapter.m8146xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3528x92709788
    /* renamed from: setEnableFooterRefreshView */
    public void mo26687x7f6c0d80(boolean z17) {
        this.f12886xde7a646b = z17;
        if (z17) {
            android.view.View view = this.f12890x2347f81b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setEnableFooterRefreshView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setEnableFooterRefreshView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f12890x2347f81b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setEnableFooterRefreshView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setEnableFooterRefreshView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3528x92709788
    /* renamed from: setFooterRefreshViewLoadMoreCallbackImpl */
    public void mo26688xae86d8e3(com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "set footer refresh callback");
        this.f12888x26df554d = abstractC3623x3b485619;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3528x92709788
    /* renamed from: setOnBeginScrollCallbackImpl */
    public void mo26689x21f00cda(com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        this.f12889xa05bdf75 = abstractC3623x3b485619;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3528x92709788
    /* renamed from: setSelection */
    public void mo26690xf579a34a(int i17) {
        if (this.f13218x373aa5 == 0 || i17 < 0 || i17 >= this.f12885x8f9cd6f5.size()) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) this.f13218x373aa5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setSelection", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setSelection", "(I)V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3528x92709788
    /* renamed from: setSelectionFromTop */
    public void mo26691x46dba6a1(int i17, int i18) {
        if (this.f13218x373aa5 == 0 || i17 < 0 || i17 >= this.f12885x8f9cd6f5.size()) {
            return;
        }
        android.content.Context context = this.f13206xd6cfe882;
        if (context != null && context.getResources() != null && this.f13206xd6cfe882.getResources().getDisplayMetrics() != null) {
            i18 = (int) (i18 * this.f13206xd6cfe882.getResources().getDisplayMetrics().density);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) this.f13218x373aa5).getLayoutManager();
        if (c1162x665295de != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "layoutManager is null");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) this.f13218x373aa5;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3528x92709788
    /* renamed from: smoothScrollToPosition */
    public void mo26692xd1b4653f(final int i17) {
        if (this.f13218x373aa5 == 0 || i17 < 0 || i17 >= this.f12885x8f9cd6f5.size()) {
            return;
        }
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) this.f13218x373aa5).post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.KindaTableViewImpl$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.this.m26684xbea89448(i17);
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo26107x519d71c1(android.content.Context context) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4(context, null);
        this.f13218x373aa5 = c1163xf1deaba4;
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_, (android.view.ViewGroup) null);
        this.f12890x2347f81b = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "createView", "(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "createView", "(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.RecyclerAdapter recyclerAdapter = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.RecyclerAdapter();
        this.f12884x59855622 = recyclerAdapter;
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) this.f13218x373aa5).mo7960x6cab2c8d(recyclerAdapter);
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) this.f13218x373aa5).i(new p012xc85e97e9.p103xe821e364.p104xd1075a44.w2() { // from class: com.tencent.kinda.framework.widget.base.KindaTableViewImpl.1
            @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
            /* renamed from: onScrollStateChanged */
            public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42, int i17) {
                if (i17 != 1) {
                    if (i17 == 0) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.this.f12887x931753e = false;
                    }
                } else {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.this.f12887x931753e = true;
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.this.f12889xa05bdf75 != null) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.this.f12889xa05bdf75.mo25801x2e7a5e();
                    }
                }
            }

            @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
            /* renamed from: onScrolled */
            public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42, int i17, int i18) {
                if (!com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.this.f12886xde7a646b || com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.this.f12887x931753e || ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) c1163xf1deaba42.getLayoutManager()).y() != com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.this.f12884x59855622.mo1894x7e414b06() - 1 || com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.this.f12888x26df554d == null) {
                    return;
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3313x4dc7e226.this.f12888x26df554d.mo25801x2e7a5e();
            }
        });
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) this.f13218x373aa5;
    }
}
