package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv.e0 f264416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h0 f264417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264418f;

    public g0(kv.e0 e0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h0 h0Var, java.lang.String str) {
        this.f264416d = e0Var;
        this.f264417e = h0Var;
        this.f264418f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewShrotcutManager", "expired");
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j0.f264482a;
        kv.e0 e0Var = this.f264416d;
        if (((java.util.LinkedList) list).contains(e0Var)) {
            ((java.util.LinkedList) list).remove(e0Var);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().q(e0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h0 h0Var = this.f264417e;
            if (h0Var != null) {
                h0Var.a(this.f264418f, false);
            }
        }
    }
}
