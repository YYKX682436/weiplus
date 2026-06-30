package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract;", "", "()V", "Presenter", "ViewCallback", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract */
/* loaded from: classes3.dex */
public final class C14708x2c892bf7 {

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$Presenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback;", "Companion", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter */
    /* loaded from: classes3.dex */
    public static final class Presenter implements fs2.a {

        /* renamed from: d, reason: collision with root package name */
        public final r45.fd2 f204296d;

        /* renamed from: e, reason: collision with root package name */
        public final java.util.ArrayList f204297e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f204298f;

        /* renamed from: g, reason: collision with root package name */
        public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f204299g;

        /* renamed from: h, reason: collision with root package name */
        public gk2.e f204300h;

        /* renamed from: i, reason: collision with root package name */
        public r45.fd2 f204301i;

        /* renamed from: m, reason: collision with root package name */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xm f204302m;

        /* renamed from: n, reason: collision with root package name */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14708x2c892bf7.ViewCallback f204303n;

        @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$Presenter$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter$Companion */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
                this();
            }
        }

        static {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14708x2c892bf7.Presenter.Companion(null);
        }

        public Presenter(r45.fd2 fd2Var, java.util.ArrayList tagData, boolean z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagData, "tagData");
            this.f204296d = fd2Var;
            this.f204297e = tagData;
            this.f204298f = z17;
        }

        public void c(final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14708x2c892bf7.ViewCallback callback) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttach parentTag:");
            r45.fd2 fd2Var = this.f204296d;
            sb6.append(fd2Var != null ? fd2Var.m75945x2fec8307(1) : null);
            sb6.append(" tagData:");
            java.util.ArrayList arrayList = this.f204297e;
            sb6.append(arrayList);
            sb6.append(" hasNextAction:");
            sb6.append(this.f204298f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSubTagConstract.Presenter", sb6.toString());
            gk2.e eVar = dk2.ef.I;
            if (eVar == null) {
                eVar = new gk2.e("FinderLiveSubTagConstract");
            }
            this.f204300h = eVar;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = ((mm2.g1) eVar.a(mm2.g1.class)).f410605m;
            r45.fd2 fd2Var2 = j2Var != null ? (r45.fd2) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb() : null;
            this.f204301i = fd2Var2;
            this.f204302m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xm(fd2Var2);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter$onAttach$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xm xmVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14708x2c892bf7.Presenter.this.f204302m;
                    if (xmVar != null) {
                        return xmVar;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("convert");
                    throw null;
                }
            }, arrayList, false);
            c22848x6ddd90cf.f374638o = new in5.x() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter$onAttach$2$1
                @Override // in5.x
                public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
                    java.lang.String str;
                    r45.fd2 fd2Var3;
                    in5.s0 holder = (in5.s0) k3Var;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
                    if (holder.f374658i != null) {
                        r45.fd2 fd2Var4 = new r45.fd2();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14708x2c892bf7.Presenter presenter = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14708x2c892bf7.Presenter.this;
                        r45.fd2 fd2Var5 = presenter.f204296d;
                        fd2Var4.set(0, java.lang.Integer.valueOf(fd2Var5 != null ? fd2Var5.m75939xb282bd08(0) : 0));
                        r45.fd2 fd2Var6 = presenter.f204296d;
                        if (fd2Var6 == null || (str = fd2Var6.m75945x2fec8307(1)) == null) {
                            str = "";
                        }
                        fd2Var4.set(1, str);
                        java.lang.String str2 = null;
                        fd2Var4.set(2, fd2Var6 != null ? fd2Var6.m75941xfb821914(2) : null);
                        fd2Var4.set(3, ((so2.u2) holder.f374658i).f492168d);
                        fd2Var4.set(5, java.lang.Integer.valueOf(fd2Var6 != null ? fd2Var6.m75939xb282bd08(5) : 0));
                        presenter.f204301i = fd2Var4;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14708x2c892bf7.ViewCallback viewCallback = presenter.f204303n;
                        if (viewCallback != null) {
                            viewCallback.a();
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xm xmVar = presenter.f204302m;
                        if (xmVar == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("convert");
                            throw null;
                        }
                        xmVar.f186495e = presenter.f204301i;
                        adapter.m8146xced61ae5();
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("sub tag item click. selectedTag:[");
                        r45.fd2 fd2Var7 = presenter.f204301i;
                        sb7.append(fd2Var7 != null ? fd2Var7.m75945x2fec8307(1) : null);
                        sb7.append('-');
                        r45.fd2 fd2Var8 = presenter.f204301i;
                        if (fd2Var8 != null && (fd2Var3 = (r45.fd2) fd2Var8.m75936x14adae67(3)) != null) {
                            str2 = fd2Var3.m75945x2fec8307(1);
                        }
                        sb7.append(str2);
                        sb7.append(']');
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSubTagConstract.Presenter", sb7.toString());
                    }
                }
            };
            this.f204299g = c22848x6ddd90cf;
            this.f204303n = callback;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = callback.f204305d;
            android.view.View findViewById = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.fme);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            callback.f204307f = (android.widget.RelativeLayout) findViewById;
            android.view.View findViewById2 = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.fmg);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            callback.f204308g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
            android.view.View findViewById3 = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.fmh);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            callback.f204309h = (android.widget.TextView) findViewById3;
            android.view.View findViewById4 = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.fmf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
            callback.f204310i = (android.widget.TextView) findViewById4;
            android.view.View findViewById5 = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.fmd);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById5;
            callback.f204311m = c1163xf1deaba4;
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(abstractActivityC21394xb3d2c0cf));
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = callback.f204311m;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tagRecyclerView");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14708x2c892bf7.Presenter presenter = callback.f204306e;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = presenter.f204299g;
            if (c22848x6ddd90cf2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c1163xf1deaba42.mo7960x6cab2c8d(c22848x6ddd90cf2);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = callback.f204311m;
            if (c1163xf1deaba43 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tagRecyclerView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = c1163xf1deaba43.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null && !lk5.s.b(abstractActivityC21394xb3d2c0cf)) {
                marginLayoutParams.bottomMargin += com.p314xaae8f345.mm.ui.bl.c(abstractActivityC21394xb3d2c0cf);
            }
            android.widget.TextView textView = callback.f204309h;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                throw null;
            }
            r45.fd2 fd2Var3 = presenter.f204296d;
            textView.setText(fd2Var3 != null ? fd2Var3.m75945x2fec8307(1) : null);
            android.widget.RelativeLayout relativeLayout = callback.f204307f;
            if (relativeLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null && !lk5.s.b(abstractActivityC21394xb3d2c0cf)) {
                marginLayoutParams2.topMargin += com.p314xaae8f345.mm.ui.bl.h(abstractActivityC21394xb3d2c0cf);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = callback.f204308g;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
                throw null;
            }
            c22699x3dcdb352.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$ViewCallback$initView$3
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view);
                    java.lang.Object[] array = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14708x2c892bf7.ViewCallback viewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14708x2c892bf7.ViewCallback.this;
                    viewCallback.f204305d.setResult(0);
                    viewCallback.f204305d.finish();
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            callback.a();
            if (presenter.f204298f) {
                android.widget.TextView textView2 = callback.f204310i;
                if (textView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("actionBtn");
                    throw null;
                }
                textView2.setText(abstractActivityC21394xb3d2c0cf.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f6o));
            } else {
                android.widget.TextView textView3 = callback.f204310i;
                if (textView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("actionBtn");
                    throw null;
                }
                textView3.setText(abstractActivityC21394xb3d2c0cf.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
            }
            android.widget.TextView textView4 = callback.f204310i;
            if (textView4 != null) {
                textView4.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$ViewCallback$initView$4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        r45.fd2 fd2Var4;
                        r45.fd2 fd2Var5;
                        r45.fd2 fd2Var6;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(view);
                        java.lang.Object[] array = arrayList2.toArray();
                        arrayList2.clear();
                        yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("select live tag finish. lastTag:[");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14708x2c892bf7.ViewCallback viewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14708x2c892bf7.ViewCallback.this;
                        gk2.e eVar2 = viewCallback.f204306e.f204300h;
                        if (eVar2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveData");
                            throw null;
                        }
                        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var2 = ((mm2.g1) eVar2.a(mm2.g1.class)).f410605m;
                        sb7.append((j2Var2 == null || (fd2Var6 = (r45.fd2) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var2).mo144003x754a37bb()) == null) ? null : fd2Var6.m75945x2fec8307(1));
                        sb7.append('-');
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14708x2c892bf7.Presenter presenter2 = viewCallback.f204306e;
                        gk2.e eVar3 = presenter2.f204300h;
                        if (eVar3 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveData");
                            throw null;
                        }
                        r45.fd2 fd2Var7 = (r45.fd2) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) eVar3.a(mm2.g1.class)).f410605m).mo144003x754a37bb();
                        sb7.append((fd2Var7 == null || (fd2Var5 = (r45.fd2) fd2Var7.m75936x14adae67(3)) == null) ? null : fd2Var5.m75945x2fec8307(1));
                        sb7.append("] selectedTag:[");
                        r45.fd2 fd2Var8 = presenter2.f204301i;
                        sb7.append(fd2Var8 != null ? fd2Var8.m75945x2fec8307(1) : null);
                        sb7.append('-');
                        r45.fd2 fd2Var9 = presenter2.f204301i;
                        sb7.append((fd2Var9 == null || (fd2Var4 = (r45.fd2) fd2Var9.m75936x14adae67(3)) == null) ? null : fd2Var4.m75945x2fec8307(1));
                        sb7.append(']');
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSubTagConstract.ViewCallback", sb7.toString());
                        gk2.e eVar4 = presenter2.f204300h;
                        if (eVar4 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveData");
                            throw null;
                        }
                        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) eVar4.a(mm2.g1.class)).f410605m).k(presenter2.f204301i);
                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = viewCallback.f204305d;
                        abstractActivityC21394xb3d2c0cf2.setResult(-1);
                        abstractActivityC21394xb3d2c0cf2.finish();
                        yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("actionBtn");
                throw null;
            }
        }

        @Override // fs2.a
        /* renamed from: onDetach */
        public void mo979x3f5eee52() {
        }
    }

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$Presenter;", "Companion", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$ViewCallback */
    /* loaded from: classes3.dex */
    public static final class ViewCallback implements fs2.c {

        /* renamed from: d, reason: collision with root package name */
        public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204305d;

        /* renamed from: e, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14708x2c892bf7.Presenter f204306e;

        /* renamed from: f, reason: collision with root package name */
        public android.widget.RelativeLayout f204307f;

        /* renamed from: g, reason: collision with root package name */
        public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f204308g;

        /* renamed from: h, reason: collision with root package name */
        public android.widget.TextView f204309h;

        /* renamed from: i, reason: collision with root package name */
        public android.widget.TextView f204310i;

        /* renamed from: m, reason: collision with root package name */
        public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f204311m;

        @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$ViewCallback$Companion */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
                this();
            }
        }

        static {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14708x2c892bf7.ViewCallback.Companion(null);
        }

        public ViewCallback(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14708x2c892bf7.Presenter presenter) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
            this.f204305d = activity;
            this.f204306e = presenter;
        }

        public final void a() {
            android.widget.TextView textView = this.f204310i;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("actionBtn");
                throw null;
            }
            r45.fd2 fd2Var = this.f204306e.f204301i;
            boolean z17 = false;
            if (fd2Var != null) {
                java.lang.String m75945x2fec8307 = fd2Var.m75945x2fec8307(1);
                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                    z17 = true;
                }
            }
            textView.setEnabled(z17);
        }

        @Override // fs2.c
        /* renamed from: getActivity */
        public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
            return this.f204305d;
        }
    }
}
