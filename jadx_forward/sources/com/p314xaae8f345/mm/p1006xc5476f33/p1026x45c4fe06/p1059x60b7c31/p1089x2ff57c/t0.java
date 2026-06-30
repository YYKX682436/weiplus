package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class t0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.v0 f162659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n[] f162661c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f162662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f162663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f162664f;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.v0 v0Var, java.lang.String str, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n[] nVarArr, boolean[] zArr, java.lang.Object[] objArr, long j17) {
        this.f162659a = v0Var;
        this.f162660b = str;
        this.f162661c = nVarArr;
        this.f162662d = zArr;
        this.f162663e = objArr;
        this.f162664f = j17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.v0 v0Var = this.f162659a;
        if (v0Var != null) {
            v0Var.l(this.f162660b, this.f162661c, this.f162662d, this.f162663e, this.f162664f, currentTimeMillis);
        }
    }
}
