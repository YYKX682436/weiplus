package dk2;

/* loaded from: classes3.dex */
public final class g2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f315019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp f315020c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek2.i2 f315021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f315023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315024g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f315025h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dk2.g f315026i;

    public g2(dk2.r4 r4Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp jpVar, ek2.i2 i2Var, java.lang.String str, java.lang.ref.WeakReference weakReference, java.lang.String str2, int i18, dk2.g gVar) {
        this.f315018a = r4Var;
        this.f315019b = i17;
        this.f315020c = jpVar;
        this.f315021d = i2Var;
        this.f315022e = str;
        this.f315023f = weakReference;
        this.f315024g = str2;
        this.f315025h = i18;
        this.f315026i = gVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        java.lang.String str2 = fVar.f152150c;
        r45.h82 h82Var = (r45.h82) fVar.f152151d;
        dk2.r4 r4Var = this.f315018a;
        java.lang.String str3 = r4Var.f315542d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPostGift errType:");
        sb6.append(i17);
        sb6.append(", errCode:");
        sb6.append(i18);
        sb6.append(", errMsg:");
        sb6.append(str2);
        sb6.append(", bill_no:");
        sb6.append(h82Var != null ? h82Var.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184265a.d(this.f315019b);
        if (i18 == 0 || i18 == -200042) {
            android.content.Context context = (android.content.Context) this.f315023f.get();
            if (context != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = h82Var.m75934xbce7f2f(2);
                byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
                dk2.r4 r4Var2 = this.f315018a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp jpVar = this.f315020c;
                java.lang.String str4 = this.f315024g;
                int i19 = this.f315025h;
                dk2.g gVar = this.f315026i;
                ek2.i2 i2Var = this.f315021d;
                dk2.c2 c2Var = new dk2.c2(r4Var2, jpVar, str4, i19, gVar, i2Var);
                dk2.e2 e2Var = new dk2.e2(r4Var2, jpVar, str4, i19, gVar, i2Var);
                dk2.f2 f2Var = new dk2.f2(r4Var2, jpVar, str4, i19, gVar, i2Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "[WeCoin] sessionID:" + this.f315022e + " consumeGift:" + g17);
                pr4.l lVar = new pr4.l(1, (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context, c2Var, e2Var, f2Var);
                if (g17 == null) {
                    g17 = new byte[0];
                }
                lVar.f439559g = g17;
                ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
                new ls4.u(lVar).f();
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp jpVar2 = this.f315020c;
            if (jpVar2 != null) {
                str = str2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp.b(jpVar2, false, i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ip.f194534e, null, null, 0, null, str2, this.f315021d, 16, null);
            } else {
                str = str2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.d(22129, 1, this.f315022e, "", 1, 3, java.lang.Integer.valueOf(i18), str);
            g0Var.B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184272h, 80L);
        }
        return jz5.f0.f384359a;
    }
}
