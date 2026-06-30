package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 f232614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f232615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fm3.q f232616f;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var, int i17, fm3.q qVar) {
        this.f232614d = h4Var;
        this.f232615e = i17;
        this.f232616f = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var = this.f232614d;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g3 g3Var = h4Var.f232704r;
        if (g3Var != null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.f232401u;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a Z6 = ((jm3.c0) g3Var).f381833a.Z6();
            if (Z6 != null) {
                Z6.k();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g3 g3Var2 = h4Var.f232704r;
        if (g3Var2 != null) {
            ((jm3.c0) g3Var2).a(this.f232615e, this.f232616f, true, null);
        }
    }
}
