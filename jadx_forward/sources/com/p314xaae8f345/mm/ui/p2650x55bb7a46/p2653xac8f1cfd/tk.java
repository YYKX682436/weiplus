package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class tk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f281534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f281536f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281537g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f281538h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281539i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281540m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281541n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f281542o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f281543p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281544q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ vg3.a4 f281545r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f281546s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sk f281547t;

    public tk(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sk skVar, boolean z17, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String str2, boolean z18, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, java.util.Map map, java.lang.String str6, vg3.a4 a4Var, android.content.Context context) {
        this.f281547t = skVar;
        this.f281534d = z17;
        this.f281535e = str;
        this.f281536f = z3Var;
        this.f281537g = str2;
        this.f281538h = z18;
        this.f281539i = str3;
        this.f281540m = str4;
        this.f281541n = str5;
        this.f281542o = i17;
        this.f281543p = map;
        this.f281544q = str6;
        this.f281545r = a4Var;
        this.f281546s = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        vg3.a4 a4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SendTextComponent", "doSendMessage begin send txt msg");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f281547t.f280113d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingUI.SendTextComponent", "NULL == mChattingContext");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.a(20);
        boolean z17 = this.f281534d;
        java.lang.String str = this.f281537g;
        if (z17) {
            c01.d9.e().g(new g11.b(this.f281535e, this.f281536f.d1(), str));
            return;
        }
        if (this.f281538h) {
            c01.sc.d().a(10076, 1);
        }
        java.lang.String str2 = this.f281539i;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.SendTextComponent", "toUser is null or nil!");
            return;
        }
        int C = c01.e2.C(str2);
        java.lang.String str3 = this.f281540m;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingUI.SendTextComponent", "tempUser is null");
            return;
        }
        boolean a17 = w11.t1.a(str3);
        java.lang.String str4 = this.f281544q;
        java.util.Map map = this.f281543p;
        int i17 = this.f281542o;
        java.lang.String str5 = this.f281541n;
        if (a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SendTextComponent", "use ppc send Msg");
            w11.r1 a18 = w11.s1.a(str3);
            a18.f523663e = C;
            a18.f523664f = i17;
            a18.e(str5);
            a18.g(str3);
            a18.f523666h = map;
            a18.f523673o = str4;
            a18.b();
        } else {
            w11.r1 a19 = w11.s1.a(str3);
            a19.f523663e = C;
            a19.f523664f = i17;
            a19.e(str5);
            a19.g(str3);
            a19.f523666h = map;
            a19.f523673o = str4;
            a19.f523667i = 5;
            w11.n1 a27 = a19.a();
            com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = a27.f523628a;
            if ((m1Var instanceof w11.r0) && (a4Var = this.f281545r) != null) {
                ((w11.r0) m1Var).f523658q = a4Var;
            }
            a27.a();
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.l4(str2)) {
            c01.d9.e().g(new k14.f0(wo.w0.l(), str + " key " + com.p314xaae8f345.mm.p2621x8fb0427b.la.m0() + " local key " + com.p314xaae8f345.mm.p2621x8fb0427b.la.s0() + "NetType:" + com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40070xdc68a9b2(this.f281546s) + " hasNeon: " + wo.t.e() + " isArmv6: " + wo.t.f() + " isArmv7: " + wo.t.g(), 0));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SendTextComponent", "doSendMessage end cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
