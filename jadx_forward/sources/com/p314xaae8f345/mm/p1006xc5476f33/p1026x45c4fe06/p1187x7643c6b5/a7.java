package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes7.dex */
public final class a7 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f170157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r f170158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f170159c;

    public a7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar, long j17) {
        this.f170157a = c0Var;
        this.f170158b = rVar;
        this.f170159c = j17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("ok", str) ? 4 : 6;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("evaluate wxNative.js end. appId:");
        sb6.append(this.f170157a.mo48798x74292566());
        sb6.append(", contextId:");
        sb6.append(this.f170158b.o());
        sb6.append(", result:'");
        sb6.append(str);
        sb6.append("', cost:");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f170159c);
        sb6.append("ms");
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.m96100xed3dc8ef(i17, "MicroMsg.AppBrand.WXNativeInjector", sb6.toString());
    }
}
