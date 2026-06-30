package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes15.dex */
public final class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.x2 f265953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 f265954e;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.x2 x2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 j3Var) {
        this.f265953d = x2Var;
        this.f265954e = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 j3Var;
        db5.d5 d5Var;
        db5.d5 d5Var2;
        int ordinal = this.f265953d.ordinal();
        if ((ordinal != 0 && ordinal != 5 && ordinal != 2 && ordinal != 3) || (d5Var = (j3Var = this.f265954e).f265995l) == null || d5Var == null) {
            return;
        }
        if (!(d5Var.isShowing()) || (d5Var2 = j3Var.f265995l) == null) {
            return;
        }
        d5Var2.dismiss();
    }
}
