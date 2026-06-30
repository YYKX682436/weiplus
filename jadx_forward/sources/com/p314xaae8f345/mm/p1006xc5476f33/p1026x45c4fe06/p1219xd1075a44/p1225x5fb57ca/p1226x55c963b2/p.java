package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2;

/* loaded from: classes7.dex */
public class p implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f172887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f172888b;

    public p(java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        this.f172887a = weakReference;
        this.f172888b = weakReference2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.e0
    public void a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.d0 d0Var) {
        android.view.KeyEvent.Callback callback = (android.widget.EditText) this.f172887a.get();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) this.f172888b.get();
        if (callback == null || v5Var == null) {
            return;
        }
        int m53464xb251d24f = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4) callback)).m53464xb251d24f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.q();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.f66865x76d1ec5a, str);
        hashMap.put("type", d0Var.name().toLowerCase());
        hashMap.put("inputId", java.lang.Integer.valueOf(m53464xb251d24f));
        qVar.u(v5Var);
        qVar.t(hashMap);
        qVar.m();
    }
}
