package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class s1 implements l81.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f169974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l81.v0 f169975c;

    public s1(int i17, long j17, l81.v0 v0Var) {
        this.f169973a = i17;
        this.f169974b = j17;
        this.f169975c = v0Var;
    }

    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        int i18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onError, requestId:");
        sb6.append(this.f169973a);
        sb6.append(", errCode:");
        sb6.append(l81.u0.f398611a.a(i17));
        sb6.append(", errMsg:");
        sb6.append(str);
        sb6.append(", cost:");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f169974b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPreRenderColdStartService", sb6.toString());
        l81.v0 v0Var = this.f169975c;
        if (v0Var != null) {
            v0Var.a(i17, str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        switch (i17) {
            case -10:
                i18 = 10;
                break;
            case -9:
            default:
                i18 = 10000;
                break;
            case -8:
                i18 = 9;
                break;
            case -7:
                i18 = 8;
                break;
            case -6:
                i18 = 7;
                break;
            case -5:
                i18 = 6;
                break;
            case -4:
                i18 = 5;
                break;
            case -3:
                i18 = 4;
                break;
            case -2:
                i18 = 3;
                break;
            case -1:
                i18 = 2;
                break;
            case 0:
                i18 = 1;
                break;
        }
        g0Var.A(com.p314xaae8f345.mm.p874xaefb6cc9.y.f29758x366c91de, i18);
    }

    @Override // l81.v0
    /* renamed from: onSuccess */
    public void mo50385xe05b4124() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSuccess, requestId:");
        sb6.append(this.f169973a);
        sb6.append(", cost:");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f169974b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPreRenderColdStartService", sb6.toString());
        l81.v0 v0Var = this.f169975c;
        if (v0Var != null) {
            v0Var.mo50385xe05b4124();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p874xaefb6cc9.y.f29758x366c91de, 1);
    }
}
