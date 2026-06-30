package rn2;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: r, reason: collision with root package name */
    public static final rn2.a f479228r = new rn2.a(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f479229s;

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f479230t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.ArrayList f479231u;

    /* renamed from: a, reason: collision with root package name */
    public final r45.gz1 f479232a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.gz1 f479233b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.gz1 f479234c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f479235d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f479236e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vc5 f479237f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f479238g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f479239h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f479240i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f479241j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.LinkedList f479242k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f479243l;

    /* renamed from: m, reason: collision with root package name */
    public int f479244m;

    /* renamed from: n, reason: collision with root package name */
    public int f479245n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f479246o;

    /* renamed from: p, reason: collision with root package name */
    public int f479247p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f479248q;

    static {
        ae2.in inVar = ae2.in.f85221a;
        f479229s = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_lottery_duration, 15);
        f479230t = new int[]{2, 1, 3, 4, 6};
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dpi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dpf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        rn2.b bVar = new rn2.b(string, string2, 0, true, true, 0, 0, null, 224, null);
        java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dpj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dpg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        rn2.b bVar2 = new rn2.b(string3, string4, 1, true, false, 0, 0, null, 224, null);
        java.lang.String string5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dpk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
        java.lang.String string6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dph);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
        f479231u = kz5.c0.d(bVar, bVar2, new rn2.b(string5, string6, 2, true, false, 0, 0, null, 224, null));
    }

    public e() {
        r45.kz0 kz0Var;
        r45.a94 a94Var;
        r45.kz0 kz0Var2;
        r45.a94 a94Var2;
        r45.gz1 gz1Var = new r45.gz1();
        gz1Var.set(0, 0);
        this.f479232a = gz1Var;
        r45.gz1 gz1Var2 = new r45.gz1();
        gz1Var2.set(0, 1);
        gz1Var2.set(1, new r45.yd4());
        this.f479233b = gz1Var2;
        r45.gz1 gz1Var3 = new r45.gz1();
        gz1Var3.set(0, 2);
        r45.vd4 vd4Var = new r45.vd4();
        vd4Var.set(0, -1);
        gz1Var3.set(2, vd4Var);
        this.f479234c = gz1Var3;
        this.f479235d = kz5.z.x0(f479230t);
        kz5.p0 p0Var = kz5.p0.f395529d;
        this.f479236e = p0Var;
        this.f479240i = new java.util.LinkedList();
        this.f479241j = new java.util.LinkedList();
        this.f479242k = new java.util.LinkedList();
        this.f479243l = jz5.h.b(rn2.c.f479191d);
        this.f479244m = 1;
        this.f479245n = 0;
        this.f479246o = p0Var;
        gk2.e eVar = gk2.e.f354004n;
        boolean z17 = !pm0.v.z(eVar != null ? (int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q : 0, 512);
        this.f479238g = z17;
        gk2.e eVar2 = gk2.e.f354004n;
        boolean z18 = !pm0.v.z(eVar2 != null ? (int) ((mm2.c1) eVar2.a(mm2.c1.class)).f410399q : 0, 8);
        this.f479239h = z18;
        g92.b bVar = g92.b.f351302e;
        m92.b I1 = g92.a.I1(bVar, false, 1, null);
        int i17 = (I1 == null || (kz0Var2 = I1.f68702x723e3d5f) == null || (a94Var2 = (r45.a94) kz0Var2.m75936x14adae67(4)) == null) ? 0 : a94Var2.f451391e;
        this.f479244m = i17 == 0 ? 1 : i17;
        m92.b I12 = g92.a.I1(bVar, false, 1, null);
        long j17 = (I12 == null || (kz0Var = I12.f68702x723e3d5f) == null || (a94Var = (r45.a94) kz0Var.m75936x14adae67(4)) == null) ? 0L : a94Var.f451390d;
        boolean z19 = pm0.v.z((int) j17, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCreateConfig", "setEnableRepeatLottery enableRepeatLottery:" + z19);
        this.f479248q = z19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCreateConfig", "initLiveLotterySetting lotteryType:" + i17 + ", setting_flag:" + j17);
        e();
        this.f479245n = 0;
        f(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCreateConfig", "init enableLike:" + z17 + ",enableComment:" + z18 + ",enableRepeatLottery:" + this.f479248q + ",currentLotteryType:" + this.f479244m);
    }

    public final rn2.b a() {
        java.util.LinkedList<rn2.b> linkedList = this.f479240i;
        if (linkedList.isEmpty()) {
            e();
        }
        java.lang.Object obj = null;
        for (rn2.b bVar : linkedList) {
            if (bVar.f479179c == this.f479244m) {
                obj = bVar;
            }
        }
        if (obj == null && (!linkedList.isEmpty())) {
            obj = linkedList.get(0);
            this.f479244m = ((rn2.b) linkedList.get(0)).f479179c;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCreateConfig", "getLastLotteryType currentLotteryTypeItem:" + obj);
        return (rn2.b) obj;
    }

    public final int b() {
        java.lang.Object obj;
        java.util.Iterator it = this.f479236e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((rn2.b) obj).f479179c == this.f479247p) {
                break;
            }
        }
        if (obj != null) {
            return this.f479247p;
        }
        rn2.b bVar = (rn2.b) kz5.n0.Z(this.f479236e);
        if (bVar != null) {
            return bVar.f479179c;
        }
        return 0;
    }

    public final int c() {
        java.lang.Object obj;
        java.util.Iterator it = this.f479236e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((rn2.b) obj).f479179c == b()) {
                break;
            }
        }
        rn2.b bVar = (rn2.b) obj;
        int i17 = bVar != null ? bVar.f479183g : 0;
        if (i17 > 0) {
            return i17 / 60;
        }
        return 3;
    }

    public final int d() {
        int i17;
        jz5.f0 f0Var;
        r45.a94 a94Var;
        gk2.e eVar = gk2.e.f354004n;
        if (eVar == null || (a94Var = ((on2.z2) eVar.a(on2.z2.class)).f428630r) == null) {
            i17 = 0;
            f0Var = null;
        } else {
            if (this.f479248q) {
                int i18 = (int) a94Var.f451390d;
                java.util.regex.Pattern pattern = pm0.v.f438335a;
                i17 = i18 | 1;
            } else {
                int i19 = (int) a94Var.f451390d;
                java.util.regex.Pattern pattern2 = pm0.v.f438335a;
                i17 = i19 & (-2);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var != null) {
            return i17;
        }
        if (this.f479248q) {
            java.util.regex.Pattern pattern3 = pm0.v.f438335a;
            return i17 | 1;
        }
        java.util.regex.Pattern pattern4 = pm0.v.f438335a;
        return i17 & (-2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.e.e():void");
    }

    public final void f(int i17) {
        this.f479245n = i17;
        for (rn2.b bVar : (java.util.ArrayList) ((jz5.n) this.f479243l).mo141623x754a37bb()) {
            bVar.f479181e = bVar.f479179c == i17;
        }
    }

    public final void g(int i17) {
        this.f479247p = i17;
        for (rn2.b bVar : this.f479236e) {
            bVar.f479181e = bVar.f479179c == i17;
        }
    }
}
