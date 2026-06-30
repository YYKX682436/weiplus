package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class i10 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t10 f216221d;

    public i10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t10 t10Var) {
        this.f216221d = t10Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        in5.s0 s0Var;
        java.lang.String string;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        g4Var.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t10 t10Var = this.f216221d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = t10Var.f217492e;
        if (abstractC14490x69736cb5 == null || (s0Var = t10Var.f217494g) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4 y4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a;
        y4Var.k(t10Var.m80379x76847179(), g4Var, abstractC14490x69736cb5);
        y4Var.s(t10Var.m80379x76847179(), g4Var, abstractC14490x69736cb5);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = ((com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) t10Var.m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.m6e)).m82555x4905e9fa();
        if (m82555x4905e9fa != null) {
            string = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.f215168x.a(m82555x4905e9fa);
        } else {
            string = t10Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gue);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        }
        y4Var.G(g4Var, abstractC14490x69736cb5, string);
        y4Var.c(t10Var.m80379x76847179(), g4Var, abstractC14490x69736cb5, s0Var);
        y4Var.q(t10Var.m80379x76847179(), g4Var, abstractC14490x69736cb5);
        y4Var.m(t10Var.m80379x76847179(), g4Var, abstractC14490x69736cb5);
        if (g4Var.z()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.uj ujVar = t10Var.f217491d;
            android.widget.TextView textView = ujVar != null ? ujVar.f214730p : null;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.uj ujVar2 = t10Var.f217491d;
            c1163xf1deaba4 = ujVar2 != null ? ujVar2.f214724j : null;
            if (c1163xf1deaba4 == null) {
                return;
            }
            c1163xf1deaba4.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.uj ujVar3 = t10Var.f217491d;
        android.widget.TextView textView2 = ujVar3 != null ? ujVar3.f214730p : null;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.uj ujVar4 = t10Var.f217491d;
        c1163xf1deaba4 = ujVar4 != null ? ujVar4.f214724j : null;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t10.O6(t10Var, g4Var);
    }
}
