package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class j9 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f160007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160008b;

    public j9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, long j17) {
        this.f160008b = e9Var;
        this.f160007a = j17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        boolean parseBoolean = java.lang.Boolean.parseBoolean((java.lang.String) obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f160008b;
        if (parseBoolean) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k9 k9Var = e9Var.f159531J;
            k9Var.f165604b = this.f160007a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            k9Var.f165605c = java.lang.System.currentTimeMillis();
            e9Var.f159531J.f165606d = null;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(parseBoolean);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(e9Var.mo50260x9f1221c2());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k9 k9Var2 = e9Var.f159531J;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandService", "notifyWxConfigReadyIfNeed end by evaluateJavascript, applied=%b, hash=%d, reportWxConfigInjectEnd cost=%dms", valueOf, valueOf2, java.lang.Long.valueOf(k9Var2.f165605c - k9Var2.f165604b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k9 k9Var3 = e9Var.f159531J;
        e9Var.p1(k9Var3.f165603a, k9Var3.f165604b, k9Var3.f165605c, k9Var3.f165606d);
    }
}
