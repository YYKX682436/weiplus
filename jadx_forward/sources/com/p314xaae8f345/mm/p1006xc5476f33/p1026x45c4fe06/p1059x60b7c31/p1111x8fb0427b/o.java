package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12245x458323bb f164946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f164947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f164948f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164949g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f164950h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k91.z0 f164951i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f164952m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.p f164953n;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12245x458323bb c12245x458323bb, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, java.lang.String str, long j17, k91.z0 z0Var, long j18) {
        this.f164953n = pVar;
        this.f164946d = c12245x458323bb;
        this.f164947e = lVar;
        this.f164948f = i17;
        this.f164949g = str;
        this.f164950h = j17;
        this.f164951i = z0Var;
        this.f164952m = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12245x458323bb c12245x458323bb = this.f164946d;
        java.lang.String str = c12245x458323bb.f164892q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.p.C(this.f164953n, str == null ? "fail:data not found" : "ok", str, c12245x458323bb.f164893r, this.f164947e, this.f164948f);
        int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.b(this.f164949g, c12245x458323bb.f164892q);
        k91.z0 z0Var = this.f164951i;
        this.f164953n.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y1.a(1, 2, b17, 1, java.lang.System.currentTimeMillis() - this.f164950h, z0Var);
        c12245x458323bb.x();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetStorage", "getStorage: %s, time: %d", c12245x458323bb.f164891p, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f164952m));
    }
}
