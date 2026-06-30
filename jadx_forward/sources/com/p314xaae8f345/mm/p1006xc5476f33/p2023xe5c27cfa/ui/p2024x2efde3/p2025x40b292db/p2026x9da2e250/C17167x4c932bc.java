package com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoEightFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoEightFragment */
/* loaded from: classes15.dex */
public final class C17167x4c932bc extends com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061 {

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f239612f;

    /* renamed from: g, reason: collision with root package name */
    public bx3.c f239613g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239614h = true;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    /* renamed from: getLayoutId */
    public int mo68447x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cf9;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    /* renamed from: initData */
    public void mo68448xff8c0da() {
        if (this.f239614h) {
            this.f239614h = false;
            m0().c();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    public void n0(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.lq8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f239612f = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f568116lr1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f239611e = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) findViewById2;
        java.util.List list = this.f239610d;
        android.content.Context mo7438x76847179 = mo7438x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7438x76847179);
        this.f239613g = new bx3.c(list, mo7438x76847179);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f239612f;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo7438x76847179()));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f239612f;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        bx3.c cVar = this.f239613g;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        c1163xf1deaba42.mo7960x6cab2c8d(cVar);
        mn5.a aVar = new mn5.a();
        aVar.f411724a = 0.5f;
        aVar.f411725b = 300;
        aVar.f411726c = true;
        aVar.f411728e = true;
        aVar.f411729f = true;
        aVar.f411730g = true;
        aVar.f411731h = true;
        aVar.f411732i = false;
        aVar.f411733j = true;
        aVar.f411734k = true;
        aVar.f411735l = true;
        aVar.f411736m = true;
        aVar.f411737n = false;
        aVar.f411738o = true;
        aVar.f411739p = false;
        aVar.f411740q = false;
        m0().m82934x82b4ca8f(aVar);
        m0().m82945xba09cf09(new cx3.c(this));
        m0().m82944x3d9f5c2e(new cx3.d());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    public void o0() {
        bx3.c cVar = this.f239613g;
        if (cVar != null) {
            cVar.m8146xced61ae5();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
    }
}
