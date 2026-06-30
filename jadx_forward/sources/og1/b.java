package og1;

/* loaded from: classes7.dex */
public final class b implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ og1.c f426662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f426663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f426664f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f426665g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f426666h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f426667i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.xw f426668m;

    public b(og1.c cVar, long j17, long j18, long j19, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, r45.xw xwVar) {
        this.f426662d = cVar;
        this.f426663e = j17;
        this.f426664f = j18;
        this.f426665g = j19;
        this.f426666h = h0Var;
        this.f426667i = f0Var;
        this.f426668m = xwVar;
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
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7088xe1c6c983 c7088xe1c6c983 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7088xe1c6c983();
        c7088xe1c6c983.f143963g = this.f426663e;
        c7088xe1c6c983.f143964h = this.f426664f;
        c7088xe1c6c983.f143965i = this.f426665g;
        c7088xe1c6c983.f143966j = c7088xe1c6c983.b("networkType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), true);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f426666h;
        c7088xe1c6c983.f143967k = ((r45.js5) h0Var.f391656d) != null ? r2.mo75928xcd1e8d8() : -1L;
        c7088xe1c6c983.f143968l = this.f426667i.f391649d;
        r45.js5 js5Var = (r45.js5) h0Var.f391656d;
        c7088xe1c6c983.f143969m = (js5Var == null || (ieVar = js5Var.f76492x92037252) == null) ? Integer.MIN_VALUE : ieVar.f458492d;
        og1.c cVar = this.f426662d;
        c7088xe1c6c983.f143970n = cVar.a();
        c7088xe1c6c983.f143971o = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.i.a();
        r45.xw xwVar = this.f426668m;
        c7088xe1c6c983.f143972p = xwVar != null ? xwVar.f472083t : 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169705a;
        java.lang.String f17 = cVar.f();
        java.lang.String str = "";
        if (f17 == null) {
            f17 = "";
        }
        java.lang.String g17 = cVar.g();
        if (g17 == null) {
            g17 = "";
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(f17, true);
            java.lang.String str2 = b17 != null ? b17.f169667d : null;
            if (str2 != null) {
                str = str2;
            }
        } catch (java.lang.IllegalStateException unused) {
        }
        jVar.c(f17, g17, c7088xe1c6c983, str);
    }
}
