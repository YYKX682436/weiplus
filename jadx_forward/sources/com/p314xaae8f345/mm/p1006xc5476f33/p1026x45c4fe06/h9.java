package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class h9 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f159802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159803b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f159804c;

    public h9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, long j17, java.lang.String str) {
        this.f159804c = e9Var;
        this.f159802a = j17;
        this.f159803b = str;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f159802a;
        java.lang.Long valueOf = java.lang.Long.valueOf(currentTimeMillis - j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f159804c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandService", "injectConfig end by evaluateJavascript, cost=%dms, hash=%d", valueOf, java.lang.Integer.valueOf(e9Var.mo50260x9f1221c2()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k9 k9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k9(null);
        e9Var.f159531J = k9Var;
        k9Var.f165603a = this.f159803b;
        k9Var.f165604b = j17;
        k9Var.f165605c = currentTimeMillis;
        k9Var.f165606d = null;
    }
}
