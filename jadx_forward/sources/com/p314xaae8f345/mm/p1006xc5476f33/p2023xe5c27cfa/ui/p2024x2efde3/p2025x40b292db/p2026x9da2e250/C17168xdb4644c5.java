package com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoFiveFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "cx3/e", "cx3/f", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFiveFragment */
/* loaded from: classes15.dex */
public final class C17168xdb4644c5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061 {

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f239615f;

    /* renamed from: g, reason: collision with root package name */
    public cx3.f f239616g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239617h = true;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    /* renamed from: getLayoutId */
    public int mo68447x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cf_;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    /* renamed from: initData */
    public void mo68448xff8c0da() {
        if (this.f239617h) {
            this.f239617h = false;
            m0().c();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    public void n0(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.lq8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f239615f = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f568116lr1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f239611e = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) findViewById2;
        cx3.f fVar = new cx3.f(this);
        this.f239616g = fVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f239615f;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba4.mo7960x6cab2c8d(fVar);
        m0().m82945xba09cf09(new cx3.i(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    public void o0() {
        cx3.f fVar = this.f239616g;
        if (fVar != null) {
            fVar.m8146xced61ae5();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
    }
}
