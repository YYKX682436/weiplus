package st2;

/* loaded from: classes3.dex */
public final class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f493846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f493847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f493848f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493849g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493850h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493851i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f493852m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493853n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f493854o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f493855p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo f493856q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ st2.h2 f493857r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493858s;

    public g2(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo customSubjectInfo, st2.h2 h2Var, java.lang.String str5) {
        this.f493846d = i17;
        this.f493847e = k0Var;
        this.f493848f = j17;
        this.f493849g = str;
        this.f493850h = str2;
        this.f493851i = str3;
        this.f493852m = i18;
        this.f493853n = str4;
        this.f493854o = z17;
        this.f493855p = z18;
        this.f493856q = customSubjectInfo;
        this.f493857r = h2Var;
        this.f493858s = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        st2.h2 h2Var;
        int i17;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig shareActionConfig;
        l81.b1 b1Var = new l81.b1();
        int i18 = this.f493846d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f493847e;
        long j17 = this.f493848f;
        java.lang.String str3 = this.f493849g;
        java.lang.String str4 = this.f493850h;
        java.lang.String str5 = this.f493851i;
        int i19 = this.f493852m;
        java.lang.String str6 = this.f493853n;
        boolean z17 = this.f493854o;
        boolean z18 = this.f493855p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo customSubjectInfo = this.f493856q;
        st2.h2 h2Var2 = this.f493857r;
        java.lang.String str7 = this.f493858s;
        cm2.m0 m0Var = null;
        if (i18 == 1) {
            java.util.List a17 = ((mm2.f6) k0Var.m57654xd7793f26().a(mm2.f6.class)).f410572o.a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
            while (it.hasNext()) {
                java.lang.String str8 = str7;
                java.lang.Object next = it.next();
                java.util.Iterator it6 = it;
                if (next instanceof cm2.m0) {
                    arrayList.add(next);
                }
                str7 = str8;
                it = it6;
            }
            str = str7;
            java.util.Iterator it7 = arrayList.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    h2Var = h2Var2;
                    break;
                }
                java.lang.Object next2 = it7.next();
                h2Var = h2Var2;
                if (((cm2.m0) next2).f124902w == j17) {
                    m0Var = next2;
                    break;
                }
                h2Var2 = h2Var;
            }
            m0Var = m0Var;
        } else {
            str = str7;
            h2Var = h2Var2;
        }
        cm2.m0 m0Var2 = m0Var;
        b1Var.f398547b = str3;
        b1Var.f398555f = str4;
        b1Var.f398565k = zl2.r4.f555483a.w1() ? 1176 : 1177;
        b1Var.f398567l = str5;
        k91.s2 s2Var = i19 == 0 ? k91.s2.f387293d : k91.s2.f387294e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str6, "halfPage")) {
            float f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getConfiguration().orientation == 2) {
                f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
            }
            i17 = (int) ((ae2.in.f85221a.h0() / 100.0f) * f17);
        } else {
            i17 = -1;
        }
        java.lang.String str9 = str;
        st2.h2 h2Var3 = h2Var;
        b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, i17, s2Var, false, null, false, null, z17 ? k91.t2.f387300e : k91.t2.f387301f, false, z17, null, null, false, false, null, false, 0, null, 0, 0, 0, z18, false, false, null, false, customSubjectInfo, 0, false, null, true, 0, false, z18, false, false, null, null, null, false, null, null, false, -1142948488, 2045, null);
        if (i18 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h2Var3.f493889a, "share item:" + m0Var2);
            if (m0Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l e17 = b1Var.G.e();
                e17.f159074u = st2.c2.f493782a.b(k0Var.m57654xd7793f26(), m0Var2.f124901v, m0Var2.E);
                b1Var.G = e17.a();
            }
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Dj(str9, b1Var);
        dk2.q4 q4Var = dk2.q4.f315471a;
        if (i17 != -1) {
            android.content.Context context = k0Var.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            q4Var.n(context, k0Var.m57654xd7793f26(), b1Var, k0Var);
            return;
        }
        zl2.b0 b0Var = zl2.b0.f555196a;
        java.lang.String str10 = ((mm2.c1) k0Var.m57654xd7793f26().a(mm2.c1.class)).f410385o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = b1Var.G;
        if (c11816x5915d2c1 == null || (shareActionConfig = c11816x5915d2c1.f158906w) == null || (str2 = shareActionConfig.f158924e) == null) {
            str2 = "";
        }
        b0Var.a(str10, str2, b1Var);
        android.content.Context context2 = k0Var.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        dk2.q4.m(q4Var, context2, k0Var.m57654xd7793f26(), b1Var, true, null, 16, null);
    }
}
