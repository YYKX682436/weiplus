package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.v0 f290897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.v0 v0Var) {
        super(1);
        this.f290897d = v0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.v0 v0Var = this.f290897d;
        if (h0Var != null) {
            ((em.l2) ((jz5.n) v0Var.f290909d).mo141623x754a37bb()).b().setVisibility(0);
            android.view.View findViewById = ((em.l2) ((jz5.n) v0Var.f290909d).mo141623x754a37bb()).b().findViewById(com.p314xaae8f345.mm.R.id.f567597k12);
            if (findViewById != null) {
                findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ahm);
            }
        }
        wi5.t0 t0Var = (wi5.t0) state.a(wi5.t0.class);
        if (t0Var != null && (eVar = t0Var.f379600a) != null && (eVar instanceof wi5.w0)) {
            if (((wi5.w0) eVar).f527891b == wi5.u0.f527878d) {
                ri5.j jVar = t0Var.f527874b;
                jVar.getClass();
                if (jVar.f477646h.d(jVar)) {
                    ((em.l2) ((jz5.n) v0Var.f290909d).mo141623x754a37bb()).b().c();
                    ((em.l2) ((jz5.n) v0Var.f290909d).mo141623x754a37bb()).b().clearFocus();
                    v0Var.m174141x36654fab();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
