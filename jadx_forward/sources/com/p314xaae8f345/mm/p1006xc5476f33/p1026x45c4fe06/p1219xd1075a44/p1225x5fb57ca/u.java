package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f173199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 f173200e;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 q0Var, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a) {
        this.f173200e = q0Var;
        this.f173199d = c19762x487075a;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandInputInvokeHandler", "ensureInputFocusedWithSoftKeyboard, before run checkForInput");
        this.f173199d.f38859x6ac9171 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 q0Var = this.f173200e;
        java.lang.ref.WeakReference weakReference = q0Var.f173143o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = weakReference == null ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get();
        if (v5Var == null || q0Var.f173145q == null || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.b(v5Var) != q0Var) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandInputInvokeHandler", "ensureInputFocusedWithSoftKeyboard, run checkForInput");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.s.f173179b.b(v5Var.a2());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.a(q0Var.f173145q);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 u3Var = q0Var.f173146r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3 p3Var = q0Var.F;
        if (u3Var != null && u3Var.e(null)) {
            q0Var.f173146r.m(p3Var);
            q0Var.f173146r.z();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 e4Var = q0Var.f173145q;
        android.view.View.OnFocusChangeListener onFocusChangeListener = q0Var.f173138g;
        if (onFocusChangeListener != null) {
            ((x.n) e4Var.f172945i).put(onFocusChangeListener, e4Var);
        } else {
            e4Var.getClass();
        }
        q0Var.f173145q.setFocusable(true);
        q0Var.f173145q.setFocusableInTouchMode(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 u3Var2 = q0Var.f173146r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 e4Var2 = q0Var.f173145q;
        u3Var2.f173224x = e4Var2;
        e4Var2.requestFocus();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.a(q0Var.f173145q);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 u3Var3 = q0Var.f173146r;
        if (u3Var3 != null) {
            u3Var3.k(p3Var);
            q0Var.f173146r.I();
        }
    }
}
