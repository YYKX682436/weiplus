package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class l1 implements du5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f155526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1 f155527b;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1 m1Var, android.content.Context context) {
        this.f155527b = m1Var;
        this.f155526a = context;
    }

    @Override // du5.d
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FingerprintVerifyHalfBottomDialog", "onAuthenticationSucceed");
    }

    @Override // du5.d
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FingerprintVerifyHalfBottomDialog", "onStartAuthentication");
    }

    @Override // du5.d
    public void c(int i17, java.lang.CharSequence charSequence) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FingerprintVerifyHalfBottomDialog", "onAuthenticationHelp");
    }

    @Override // du5.d
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FingerprintVerifyHalfBottomDialog", "onAuthenticationCancelled");
    }

    @Override // du5.d
    public void e(int i17, java.lang.CharSequence charSequence) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FingerprintVerifyHalfBottomDialog", "onAuthenticationError");
    }

    @Override // du5.d
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FingerprintVerifyHalfBottomDialog", "onAuthenticationFailed");
        this.f155527b.b(this.f155526a, true);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k());
        wd0.d1[] d1VarArr = wd0.d1.f526235d;
        hashMap.put("fingerprint_verify_result", 11);
        hashMap.put("login_sessionid", v61.d.a(1));
        ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ai(null, "fingerprint_login_request_end", hashMap);
    }
}
