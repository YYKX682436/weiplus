package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList;", "Lcom/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$Fragment;", "Lxj1/d0;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList */
/* loaded from: classes7.dex */
public final class C12708x81c12732 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment implements xj1.d0 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f171171t = 0;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f171172h;

    /* renamed from: i, reason: collision with root package name */
    public xj1.b0 f171173i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f171174m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f171175n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f171176o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f171177p = jz5.h.b(new xj1.j(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f171178q = jz5.h.b(new xj1.k(this));

    /* renamed from: r, reason: collision with root package name */
    public final l75.q0 f171179r = new xj1.a(this);

    /* renamed from: s, reason: collision with root package name */
    public final l75.q0 f171180s = new xj1.b(this);

    public static final void p0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732 c12708x81c12732) {
        java.util.ArrayList arrayList;
        xj1.b0 b0Var = c12708x81c12732.f171173i;
        if (b0Var == null) {
            return;
        }
        synchronized (b0Var.f536313d) {
            arrayList = new java.util.ArrayList(b0Var.f536313d.size());
            arrayList.addAll(b0Var.f536313d);
        }
        java.util.List q07 = c12708x81c12732.q0();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) q07;
        if (arrayList2.isEmpty()) {
            c12708x81c12732.n0(new xj1.n(c12708x81c12732));
            return;
        }
        try {
            c12708x81c12732.n0(new xj1.o(c12708x81c12732, q07, p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o3(arrayList, q07), true)));
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandCollectionDisplayVerticalList", e17, "calculateDiff, oldList.size=" + arrayList.size() + ", newList.size=" + arrayList2.size(), new java.lang.Object[0]);
            if (z65.c.a()) {
                throw e17;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment
    /* renamed from: getLayoutId */
    public int mo52909x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment
    /* renamed from: initView */
    public void mo52910x10010bd5() {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x19263085);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4(mo7430x19263085, null);
        final p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630852 = mo7430x19263085();
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo7430x192630852) { // from class: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList$initView$1$1
            @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
            /* renamed from: supportsPredictiveItemAnimations */
            public boolean mo7924x9f0306c5() {
                return false;
            }
        });
        xj1.b0 b0Var = new xj1.b0(new java.util.ArrayList(), this);
        this.f171173i = b0Var;
        c1163xf1deaba4.mo7960x6cab2c8d(b0Var);
        c1163xf1deaba4.setBackgroundColor(c1163xf1deaba4.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560402jf));
        c1163xf1deaba4.N(new xj1.c0());
        c1163xf1deaba4.m7964x8d4ad49c(null);
        this.f171172h = c1163xf1deaba4;
        android.view.View view = this.f170902g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f171172h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba42);
        ((android.widget.FrameLayout) view).addView(c1163xf1deaba42, new android.widget.FrameLayout.LayoutParams(-1, -2));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment
    public void l0() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f171172h;
        if (c1163xf1deaba4 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList", "onTitleDoubleTap", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            c1163xf1deaba4.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList", "onTitleDoubleTap", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityCreated */
    public void mo7495x78cb4fa(android.os.Bundle bundle) {
        super.mo7495x78cb4fa(bundle);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = mo7430x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo7430x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.m78494xd9193382(0, m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571832r4), new xj1.c(this), new xj1.d(this), com.p314xaae8f345.mm.ui.fb.BLACK);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        super.mo7399xa6664a60();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class)).mo49775xc84af884(this.f171179r);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().mo49775xc84af884(this.f171180s);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f171175n;
        if (n3Var != null) {
            n3Var.mo50299x35224f();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        if (this.f171174m) {
            r0(true, xj1.g.f536321d);
            this.f171174m = false;
        }
        if (this.f171176o) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.h(2, "");
            this.f171176o = false;
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        this.f171175n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("AppBrandLauncherCollectionList");
        r0(false, new xj1.f(this));
    }

    public final java.util.List q0() {
        java.util.List xi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class)).xi(Integer.MAX_VALUE, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5.DESC);
        if (xi6 == null) {
            xi6 = kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : xi6) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) obj) != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void r0(boolean z17, yz5.a aVar) {
        xj1.i iVar = new xj1.i(this, z17, aVar);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f171175n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n3Var);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n3Var.mo50284xdd3e8650(), xu5.b.e())) {
            iVar.run();
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = this.f171175n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n3Var2);
        n3Var2.m77784x795fa299(iVar);
    }
}
