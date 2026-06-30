package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class l1 implements du5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f73993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.m1 f73994b;

    public l1(com.tencent.mm.plugin.account.ui.m1 m1Var, android.content.Context context) {
        this.f73994b = m1Var;
        this.f73993a = context;
    }

    @Override // du5.d
    public void a() {
        com.tencent.mars.xlog.Log.i("FingerprintVerifyHalfBottomDialog", "onAuthenticationSucceed");
    }

    @Override // du5.d
    public void b() {
        com.tencent.mars.xlog.Log.i("FingerprintVerifyHalfBottomDialog", "onStartAuthentication");
    }

    @Override // du5.d
    public void c(int i17, java.lang.CharSequence charSequence) {
        com.tencent.mars.xlog.Log.i("FingerprintVerifyHalfBottomDialog", "onAuthenticationHelp");
    }

    @Override // du5.d
    public void d() {
        com.tencent.mars.xlog.Log.i("FingerprintVerifyHalfBottomDialog", "onAuthenticationCancelled");
    }

    @Override // du5.d
    public void e(int i17, java.lang.CharSequence charSequence) {
        com.tencent.mars.xlog.Log.i("FingerprintVerifyHalfBottomDialog", "onAuthenticationError");
    }

    @Override // du5.d
    public void f() {
        com.tencent.mars.xlog.Log.i("FingerprintVerifyHalfBottomDialog", "onAuthenticationFailed");
        this.f73994b.b(this.f73993a, true);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, wo.w0.k());
        wd0.d1[] d1VarArr = wd0.d1.f444702d;
        hashMap.put("fingerprint_verify_result", 11);
        hashMap.put("login_sessionid", v61.d.a(1));
        ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ai(null, "fingerprint_login_request_end", hashMap);
    }
}
