package yy0;

/* loaded from: classes5.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f549877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f549879f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549880g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549881h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549882i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549883m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f549884n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(yy0.m7 m7Var, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549877d = m7Var;
        this.f549878e = str;
        this.f549879f = i17;
        this.f549880g = str2;
        this.f549881h = str3;
        this.f549882i = str4;
        this.f549883m = str5;
        this.f549884n = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yy0.u0(this.f549877d, this.f549878e, this.f549879f, this.f549880g, this.f549881h, this.f549882i, this.f549883m, this.f549884n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yy0.u0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f549877d.f549762h = null;
        this.f549877d.f549763i = this.f549878e;
        this.f549877d.f549764m = this.f549879f;
        this.f549877d.f549765n = 0;
        this.f549877d.f549766o = this.f549880g;
        this.f549877d.f549767p = this.f549881h;
        this.f549877d.f549768q = this.f549882i;
        this.f549877d.f549769r = null;
        this.f549877d.f549770s = null;
        this.f549877d.f549771t = 0;
        this.f549877d.f549772u = null;
        this.f549877d.f549773v = 0;
        this.f549877d.f549774w = false;
        this.f549877d.f549775x = false;
        this.f549877d.f549776y = false;
        this.f549877d.f549777z = 1;
        yy0.m7 m7Var = this.f549877d;
        iy1.c cVar = iy1.c.MainUI;
        m7Var.A = 30097;
        this.f549877d.B = true;
        this.f549877d.C = false;
        this.f549877d.E = this.f549883m;
        this.f549877d.f549760f = yy0.q0.f549821e;
        boolean booleanValue = ((java.lang.Boolean) p3325xe03a0797.p3326xc267989b.l.f(null, new yy0.t0(null), 1, null)).booleanValue();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f549877d.f549758d, "initMetrics: load so failed!");
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549877d.f549758d, "initMetrics: entryType=" + this.f549878e + ", enterScene=" + this.f549879f + ", parentEnterScene=" + this.f549884n + ", sourceFeedID=" + this.f549880g + ", sourceSongID=" + this.f549881h + ", followFeedTemplateID=" + this.f549882i);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        az0.i5 i5Var = az0.i5.f97090a;
        sb6.append(az0.i5.f97098i);
        sb6.append("/MetricsLogs");
        com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.e(sb6.toString(), yy0.s0.f549846a);
        if (this.f549877d.f549761g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f549877d.f549758d, "Error: mjPublisherSessionMetrics is not null. Releasing and recreating.");
            this.f549877d.bj("Leaked");
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4082xa6fd740c c4082xa6fd740c = this.f549877d.f549761g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4082xa6fd740c);
            c4082xa6fd740c.q2();
            this.f549877d.f549761g = null;
        }
        jz5.l[] lVarArr = new jz5.l[3];
        java.lang.String str = this.f549877d.f549766o;
        if (str == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("sourceFeedId", str);
        java.lang.String str2 = this.f549877d.f549767p;
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[1] = new jz5.l("sourceSongId", str2);
        java.lang.String str3 = this.f549877d.f549768q;
        lVarArr[2] = new jz5.l("followFeedTemplateId", str3 != null ? str3 : "");
        this.f549877d.f549761g = com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.o(new android.os.Handler(android.os.Looper.getMainLooper()), this.f549878e, this.f549879f, this.f549884n, kz5.c1.k(lVarArr), this.f549877d.E);
        yy0.m7 m7Var2 = this.f549877d;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4082xa6fd740c c4082xa6fd740c2 = m7Var2.f549761g;
        m7Var2.f549762h = c4082xa6fd740c2 != null ? c4082xa6fd740c2.a() : null;
        this.f549877d.f549760f = yy0.q0.f549822f;
        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = ((yy0.m7) l0Var).Ai();
        Ai.put("view_id", "publisher_in");
        cy1.a aVar2 = (cy1.a) rVar;
        aVar2.yj("publisher_in", null, Ai, 6, false);
        Ai.put("view_id", "post_in");
        aVar2.yj("post_in", null, Ai, 6, false);
        return f0Var;
    }
}
