package com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoNineFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "cx3/m", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment */
/* loaded from: classes15.dex */
public final class C17170x7687e6c5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061 {

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f239621f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f239622g;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.p2789x52b58c24.C22852x69dc3be f239624i;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f239623h = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f239625m = true;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    /* renamed from: getLayoutId */
    public int mo68447x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cfb;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    /* renamed from: initData */
    public void mo68448xff8c0da() {
        if (this.f239625m) {
            this.f239625m = false;
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.p2789x52b58c24.C22852x69dc3be c22852x69dc3be = this.f239624i;
            if (c22852x69dc3be != null) {
                c22852x69dc3be.c();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hRefreshLayout");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    public void j0(int i17) {
        java.util.ArrayList arrayList = this.f239623h;
        arrayList.clear();
        arrayList.addAll(q0());
        o0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    public void n0(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.lq8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f239621f = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f568116lr1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f239624i = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.p2789x52b58c24.C22852x69dc3be) findViewById2;
        this.f239622g = new cx3.n(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f239621f;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo7438x76847179(), 0, false));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f239621f;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = this.f239622g;
        if (f2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        c1163xf1deaba42.mo7960x6cab2c8d(f2Var);
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.p2789x52b58c24.C22852x69dc3be c22852x69dc3be = this.f239624i;
        if (c22852x69dc3be != null) {
            c22852x69dc3be.m82945xba09cf09(new cx3.q(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hRefreshLayout");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    public void o0() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = this.f239622g;
        if (f2Var != null) {
            f2Var.m8146xced61ae5();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    public void p0() {
        this.f239623h.addAll(q0());
        o0();
    }

    public final java.util.Collection q0() {
        java.util.List asList = java.util.Arrays.asList(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asList, "asList(...)");
        return asList;
    }
}
