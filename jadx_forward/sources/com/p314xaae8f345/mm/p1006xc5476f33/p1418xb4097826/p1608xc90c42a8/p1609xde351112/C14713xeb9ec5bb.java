package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract;", "", "()V", "Presenter", "ViewCallback", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract */
/* loaded from: classes3.dex */
public final class C14713xeb9ec5bb {

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$Presenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback;", "Companion", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$Presenter */
    /* loaded from: classes3.dex */
    public static final class Presenter implements fs2.a {

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int f204314i = 0;

        /* renamed from: d, reason: collision with root package name */
        public final java.util.ArrayList f204315d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f204316e;

        /* renamed from: f, reason: collision with root package name */
        public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f204317f;

        /* renamed from: g, reason: collision with root package name */
        public gk2.e f204318g;

        /* renamed from: h, reason: collision with root package name */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.ViewCallback f204319h;

        @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$Presenter$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$Presenter$Companion */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
                this();
            }
        }

        static {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.Presenter.Companion(null);
        }

        public Presenter(java.util.ArrayList tagData, boolean z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagData, "tagData");
            this.f204315d = tagData;
            this.f204316e = z17;
        }

        public void c(final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.ViewCallback callback) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttach tagData:");
            java.util.ArrayList arrayList = this.f204315d;
            sb6.append(arrayList);
            sb6.append(" hasNextAction:");
            sb6.append(this.f204316e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTagConstract.Presenter", sb6.toString());
            gk2.e eVar = dk2.ef.I;
            if (eVar == null) {
                eVar = new gk2.e("FinderLiveTagConstract");
            }
            this.f204318g = eVar;
            boolean z17 = false;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$Presenter$onAttach$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
                    gk2.e eVar2 = gk2.e.f354004n;
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ym((eVar2 == null || (j2Var = ((mm2.g1) eVar2.a(mm2.g1.class)).f410605m) == null) ? null : (r45.fd2) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb());
                }
            }, arrayList, false);
            c22848x6ddd90cf.f374638o = new in5.x() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$Presenter$onAttach$2$1
                @Override // in5.x
                public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
                    java.util.LinkedList m75941xfb821914;
                    in5.s0 holder = (in5.s0) k3Var;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.Presenter.f204314i;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.Presenter presenter = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.Presenter.this;
                    presenter.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTagConstract.Presenter", "selected tagIndex:" + i17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.ViewCallback viewCallback = presenter.f204319h;
                    if (viewCallback != null) {
                        android.content.Intent intent = new android.content.Intent();
                        java.lang.Class<?> cls = (java.lang.Class) ((jz5.n) jz2.x0.B).mo141623x754a37bb();
                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = viewCallback.f204321d;
                        intent.setClass(abstractActivityC21394xb3d2c0cf, cls);
                        intent.putExtra("KEY_HAS_NEXT_ACTION", presenter.f204316e);
                        so2.j5 j5Var = (so2.j5) kz5.n0.a0(presenter.f204315d, i17);
                        r45.fd2 fd2Var = (j5Var == null || !(j5Var instanceof so2.u2)) ? null : ((so2.u2) j5Var).f492168d;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tagIndex:");
                        sb7.append(i17);
                        sb7.append(", selectTag:");
                        sb7.append(fd2Var != null ? fd2Var.m75945x2fec8307(1) : null);
                        sb7.append(", selectTag.subList:");
                        sb7.append((fd2Var == null || (m75941xfb821914 = fd2Var.m75941xfb821914(2)) == null) ? null : java.lang.Integer.valueOf(m75941xfb821914.size()));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTagConstract.Presenter", sb7.toString());
                        intent.putExtra("KEY_TAG_INFO", fd2Var != null ? fd2Var.mo14344x5f01b1f6() : null);
                        abstractActivityC21394xb3d2c0cf.startActivityForResult(intent, 1);
                    }
                }
            };
            this.f204317f = c22848x6ddd90cf;
            this.f204319h = callback;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = callback.f204321d;
            android.view.View findViewById = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.fmz);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            callback.f204323f = (android.widget.RelativeLayout) findViewById;
            android.view.View findViewById2 = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.f566357fn1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            callback.f204324g = (android.widget.TextView) findViewById2;
            android.view.View findViewById3 = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.f566358fn2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            android.view.View findViewById4 = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.f566356fn0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
            callback.f204325h = (android.widget.TextView) findViewById4;
            android.view.View findViewById5 = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.fmy);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById5;
            callback.f204326i = c1163xf1deaba4;
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(abstractActivityC21394xb3d2c0cf));
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = callback.f204326i;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tagRecyclerView");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.Presenter presenter = callback.f204322e;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = presenter.f204317f;
            if (c22848x6ddd90cf2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c1163xf1deaba42.mo7960x6cab2c8d(c22848x6ddd90cf2);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = callback.f204326i;
            if (c1163xf1deaba43 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tagRecyclerView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = c1163xf1deaba43.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null && !zl2.r4.f555483a.Y1(abstractActivityC21394xb3d2c0cf)) {
                marginLayoutParams.bottomMargin += com.p314xaae8f345.mm.ui.bl.c(abstractActivityC21394xb3d2c0cf);
            }
            android.widget.TextView textView = callback.f204324g;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
                throw null;
            }
            textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$ViewCallback$initView$2
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view);
                    java.lang.Object[] array = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.ViewCallback viewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.ViewCallback.this;
                    viewCallback.f204321d.setResult(0);
                    viewCallback.f204321d.finish();
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            if (!lk5.s.b(abstractActivityC21394xb3d2c0cf)) {
                android.widget.RelativeLayout relativeLayout = callback.f204323f;
                if (relativeLayout == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
                    throw null;
                }
                android.view.ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin += com.p314xaae8f345.mm.ui.bl.h(abstractActivityC21394xb3d2c0cf);
                }
            }
            android.widget.TextView g17 = callback.g();
            gk2.e eVar2 = presenter.f204318g;
            if (eVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveData");
                throw null;
            }
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = ((mm2.g1) eVar2.a(mm2.g1.class)).f410605m;
            if ((j2Var != null ? (r45.fd2) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb() : null) != null) {
                gk2.e eVar3 = presenter.f204318g;
                if (eVar3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveData");
                    throw null;
                }
                r45.fd2 fd2Var = (r45.fd2) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) eVar3.a(mm2.g1.class)).f410605m).mo144003x754a37bb();
                java.lang.String m75945x2fec8307 = fd2Var != null ? fd2Var.m75945x2fec8307(1) : null;
                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                    z17 = true;
                }
            }
            g17.setEnabled(z17);
            if (presenter.f204316e) {
                callback.g().setText(abstractActivityC21394xb3d2c0cf.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f6o));
                callback.g().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$ViewCallback$initView$4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(view);
                        java.lang.Object[] array = arrayList2.toArray();
                        arrayList2.clear();
                        yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.ViewCallback.this.a();
                        yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            } else {
                callback.g().setText(abstractActivityC21394xb3d2c0cf.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
                callback.g().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$ViewCallback$initView$5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(view);
                        java.lang.Object[] array = arrayList2.toArray();
                        arrayList2.clear();
                        yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.ViewCallback.this.a();
                        yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            }
        }

        @Override // fs2.a
        /* renamed from: onDetach */
        public void mo979x3f5eee52() {
        }
    }

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$Presenter;", "Companion", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$ViewCallback */
    /* loaded from: classes3.dex */
    public static final class ViewCallback implements fs2.c {

        /* renamed from: d, reason: collision with root package name */
        public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204321d;

        /* renamed from: e, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.Presenter f204322e;

        /* renamed from: f, reason: collision with root package name */
        public android.widget.RelativeLayout f204323f;

        /* renamed from: g, reason: collision with root package name */
        public android.widget.TextView f204324g;

        /* renamed from: h, reason: collision with root package name */
        public android.widget.TextView f204325h;

        /* renamed from: i, reason: collision with root package name */
        public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f204326i;

        @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$ViewCallback$Companion */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
                this();
            }
        }

        static {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.ViewCallback.Companion(null);
        }

        public ViewCallback(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.Presenter presenter) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
            this.f204321d = activity;
            this.f204322e = presenter;
        }

        public final void a() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finishWithResult hasNextAction:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.Presenter presenter = this.f204322e;
            sb6.append(presenter.f204316e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTagConstract.ViewCallback", sb6.toString());
            boolean z17 = presenter.f204316e;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f204321d;
            if (!z17) {
                abstractActivityC21394xb3d2c0cf.setResult(-1);
                abstractActivityC21394xb3d2c0cf.finish();
                return;
            }
            new android.content.Intent();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_START_LIVE", true);
            abstractActivityC21394xb3d2c0cf.setResult(-1, intent);
            abstractActivityC21394xb3d2c0cf.finish();
        }

        public final android.widget.TextView g() {
            android.widget.TextView textView = this.f204325h;
            if (textView != null) {
                return textView;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("actionBtn");
            throw null;
        }

        @Override // fs2.c
        /* renamed from: getActivity */
        public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
            return this.f204321d;
        }
    }
}
