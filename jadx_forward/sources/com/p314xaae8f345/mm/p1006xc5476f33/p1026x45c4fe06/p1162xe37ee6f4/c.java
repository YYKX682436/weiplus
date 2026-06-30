package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4;

/* loaded from: classes7.dex */
public final class c implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d f167608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.js5 f167609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f167610f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f167611g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.xw f167612h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f167613i;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d dVar, r45.js5 js5Var, int i17, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, r45.xw xwVar, int i18) {
        this.f167608d = dVar;
        this.f167609e = js5Var;
        this.f167610f = i17;
        this.f167611g = m1Var;
        this.f167612h = xwVar;
        this.f167613i = i18;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "";
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.ie ieVar;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d dVar = this.f167608d;
        long j17 = elapsedRealtime - dVar.f167615n;
        r45.y50 A = dVar.A();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7088xe1c6c983 c7088xe1c6c983 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7088xe1c6c983();
        c7088xe1c6c983.f143963g = dVar.f167614m;
        c7088xe1c6c983.f143964h = currentTimeMillis;
        c7088xe1c6c983.f143965i = j17;
        c7088xe1c6c983.f143966j = c7088xe1c6c983.b("networkType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), true);
        r45.js5 js5Var = this.f167609e;
        c7088xe1c6c983.f143967k = js5Var != null ? js5Var.mo75928xcd1e8d8() : -1L;
        c7088xe1c6c983.f143968l = this.f167610f;
        c7088xe1c6c983.f143969m = (js5Var == null || (ieVar = js5Var.f76492x92037252) == null) ? Integer.MIN_VALUE : ieVar.f458492d;
        c7088xe1c6c983.f143970n = this.f167611g.mo808xfb85f7b0();
        c7088xe1c6c983.f143971o = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.i.a();
        r45.xw xwVar = this.f167612h;
        c7088xe1c6c983.f143972p = xwVar != null ? xwVar.f472083t : 0L;
        c7088xe1c6c983.f143975s = this.f167613i;
        if (A != null) {
            c7088xe1c6c983.f143973q = A.f472332f;
            c7088xe1c6c983.f143974r = A.f472333g;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169705a.c(dVar.y(), dVar.C(), c7088xe1c6c983, dVar.B());
    }
}
