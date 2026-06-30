package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class a implements com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 f205048a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 o0Var) {
        this.f205048a = o0Var;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e
    public void a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c view, int i17) {
        float f17;
        com.p314xaae8f345.mm.ui.ga mo78514x143f1b92;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 o0Var = this.f205048a;
        o0Var.getClass();
        float min = java.lang.Math.min(1.0f, (java.lang.Math.abs(i17) * 1.0f) / o0Var.N);
        if (min == o0Var.G) {
            return;
        }
        o0Var.G = min;
        jz5.g gVar = o0Var.f205566u;
        jz5.g gVar2 = o0Var.f205571z;
        if (min < 0.5f) {
            f17 = (0.5f - min) / 0.5f;
            o0Var.W6().setBackgroundColor(o0Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            if (!o0Var.m58704xd2e07a89()) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = o0Var.m158354x19263085();
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
                if (abstractActivityC21394xb3d2c0cf != null && (mo78514x143f1b92 = abstractActivityC21394xb3d2c0cf.mo78514x143f1b92()) != null) {
                    mo78514x143f1b92.O0(com.p314xaae8f345.mm.ui.bk.C());
                }
            }
            ((android.widget.FrameLayout) ((jz5.n) gVar).mo141623x754a37bb()).setAlpha(0.0f);
            ((android.widget.FrameLayout) ((jz5.n) gVar2).mo141623x754a37bb()).setVisibility(8);
            o0Var.W6().setAlpha(1.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0.O6(o0Var, min, f17);
            android.app.Activity context = o0Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob.class)).L7();
        } else {
            float f18 = (min - 0.5f) / 0.5f;
            jz5.l lVar = o0Var.f205552J;
            int i18 = o0Var.K;
            int i19 = o0Var.E;
            if (lVar == null) {
                o0Var.I = i19;
                o0Var.L = i18;
                ((android.widget.FrameLayout) ((jz5.n) gVar2).mo141623x754a37bb()).setVisibility(8);
            } else if (((java.lang.Boolean) lVar.f384366d).booleanValue()) {
                java.lang.Number number = (java.lang.Number) lVar.f384367e;
                o0Var.I = number.intValue();
                o0Var.L = number.intValue();
                jz5.n nVar = (jz5.n) gVar2;
                ((android.widget.FrameLayout) nVar.mo141623x754a37bb()).setVisibility(0);
                ((android.widget.FrameLayout) nVar.mo141623x754a37bb()).setAlpha(0.4f * f18);
            } else {
                o0Var.I = i19;
                o0Var.L = i18;
                ((android.widget.FrameLayout) ((jz5.n) gVar2).mo141623x754a37bb()).setVisibility(8);
            }
            java.lang.Object evaluate = o0Var.H.evaluate(f18, java.lang.Integer.valueOf(o0Var.I), java.lang.Integer.valueOf(o0Var.L));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(evaluate, "null cannot be cast to non-null type kotlin.Int");
            o0Var.W6().setBackgroundColor(((java.lang.Integer) evaluate).intValue());
            if (!o0Var.m58704xd2e07a89()) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = o0Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852).mo78514x143f1b92().O0(com.p314xaae8f345.mm.ui.bk.C());
            }
            ((android.widget.FrameLayout) ((jz5.n) gVar).mo141623x754a37bb()).setAlpha(f18);
            o0Var.W6().setAlpha(f18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0.O6(o0Var, min, f18);
            android.app.Activity context2 = o0Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob.class)).g7().setVisibility(8);
            f17 = f18;
        }
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) o0Var.f205560o).mo141623x754a37bb()).setAlpha(f17);
        o0Var.Y6().setAlpha(f17);
    }
}
