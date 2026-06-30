package ot0;

/* loaded from: classes9.dex */
public class c extends ot0.h {
    public java.lang.String A;
    public int B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public ot0.j I;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f429942b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f429943c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f429944d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f429945e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f429946f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f429947g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f429948h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f429949i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f429950j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f429951k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f429952l;

    /* renamed from: m, reason: collision with root package name */
    public int f429953m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f429954n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f429955o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f429956p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f429957q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f429958r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f429959s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f429960t;

    /* renamed from: u, reason: collision with root package name */
    public int f429961u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f429962v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f429963w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f429964x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f429965y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f429966z;

    @Override // ot0.h
    public ot0.h a() {
        return new ot0.c();
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        if (qVar.f430199i == 2001) {
            ot0.j jVar = new ot0.j();
            this.I = jVar;
            jVar.d(map, qVar);
            java.lang.String str = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.locallogoicon");
            if (str == null) {
                str = "";
            }
            this.f429942b = str;
            java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.localbubbleicon");
            if (str2 == null) {
                str2 = "";
            }
            this.f429943c = str2;
            java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.effectresource");
            if (str3 == null) {
                str3 = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppContentC2cMsgPiece", "locallogoicon: %s, localbubbleicon: %s, effectResource: %s", this.f429942b, this.f429943c, str3);
            java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.corpname");
            if (str4 == null) {
                str4 = "";
            }
            this.f429944d = str4;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430063b)) {
                java.lang.String str5 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.senderc2cshowsourceurl");
                if (str5 == null) {
                    str5 = "";
                }
                this.f429945e = str5;
            } else {
                this.f429945e = this.I.f430063b;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430064c)) {
                java.lang.String str6 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.senderc2cshowsourcemd5");
                if (str6 == null) {
                    str6 = "";
                }
                this.f429946f = str6;
            } else {
                this.f429946f = this.I.f430064c;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430065d)) {
                java.lang.String str7 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.receiverc2cshowsourceurl");
                if (str7 == null) {
                    str7 = "";
                }
                this.f429947g = str7;
            } else {
                this.f429947g = this.I.f430065d;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430066e)) {
                java.lang.String str8 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.receiverc2cshowsourcemd5");
                if (str8 == null) {
                    str8 = "";
                }
                this.f429948h = str8;
            } else {
                this.f429948h = this.I.f430066e;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430067f)) {
                java.lang.String str9 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.recshowsourceurl");
                if (str9 == null) {
                    str9 = "";
                }
                this.f429949i = str9;
            } else {
                this.f429949i = this.I.f430067f;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430068g)) {
                java.lang.String str10 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.recshowsourcemd5");
                if (str10 == null) {
                    str10 = "";
                }
                this.f429950j = str10;
            } else {
                this.f429950j = this.I.f430068g;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430069h)) {
                java.lang.String str11 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.detailshowsourceurl");
                if (str11 == null) {
                    str11 = "";
                }
                this.f429951k = str11;
            } else {
                this.f429951k = this.I.f430069h;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430070i)) {
                java.lang.String str12 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.detailshowsourcemd5");
                if (str12 == null) {
                    str12 = "";
                }
                this.f429952l = str12;
            } else {
                this.f429952l = this.I.f430070i;
            }
            this.f429953m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.wcpayinfo.subtype"), 0);
            java.lang.String str13 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.exclusive_recv_username");
            this.f429954n = str13 != null ? str13 : "";
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430078q)) {
                this.f429955o = this.I.f430078q;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430079r)) {
                this.f429956p = this.I.f430079r;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430080s)) {
                this.f429957q = this.I.f430080s;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430081t)) {
                this.f429958r = this.I.f430081t;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430082u)) {
                this.f429959s = this.I.f430082u;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430083v)) {
                this.f429960t = this.I.f430083v;
            }
            ot0.j jVar2 = this.I;
            this.f429961u = jVar2.f430084w;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar2.f430085x)) {
                this.f429962v = this.I.f430085x;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430086y)) {
                this.f429963w = this.I.f430086y;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430087z)) {
                this.f429964x = this.I.f430087z;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.A)) {
                this.f429965y = this.I.A;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.B)) {
                this.f429966z = this.I.B;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.C)) {
                this.A = this.I.C;
            }
            ot0.j jVar3 = this.I;
            this.B = jVar3.D;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar3.E)) {
                this.C = this.I.E;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.F)) {
                this.D = this.I.F;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.G)) {
                this.E = this.I.G;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.H)) {
                this.F = this.I.H;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.I)) {
                this.G = this.I.I;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.I.f430062J)) {
                return;
            }
            this.H = this.I.f430062J;
        }
    }
}
