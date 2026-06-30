package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes9.dex */
public final class b9 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f275308a = "";

    /* renamed from: b, reason: collision with root package name */
    public double f275309b = 0.0d;

    /* renamed from: c, reason: collision with root package name */
    public double f275310c = 0.0d;

    /* renamed from: d, reason: collision with root package name */
    public int f275311d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f275312e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f275313f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f275314g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f275315h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f275316i = null;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f275317j = null;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f275318k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f275319l = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f275320m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f275321n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f275322o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f275323p = "";

    /* renamed from: q, reason: collision with root package name */
    public float f275324q = 0.0f;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f275325r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f275326s = "";

    public static com.p314xaae8f345.mm.p2621x8fb0427b.b9 d(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.b9 b9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.b9();
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
        if (d17 != null) {
            java.lang.String str2 = (java.lang.String) d17.get(".msg.location.$fromusername");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            b9Var.f275308a = str2;
            b9Var.f275309b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) d17.get(".msg.location.$x"));
            b9Var.f275310c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) d17.get(".msg.location.$y"));
            java.lang.String str3 = (java.lang.String) d17.get(".msg.location.$label");
            if (str3 == null) {
                str3 = "";
            }
            b9Var.f275312e = str3;
            java.lang.String str4 = (java.lang.String) d17.get(".msg.location.$maptype");
            if (str4 == null) {
                str4 = "";
            }
            b9Var.f275314g = str4;
            b9Var.f275311d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(".msg.location.$scale"), 0);
            java.lang.String str5 = (java.lang.String) d17.get(".msg.location.$localLocationen");
            if (str5 == null) {
                str5 = "";
            }
            b9Var.f275317j = str5;
            java.lang.String str6 = (java.lang.String) d17.get(".msg.location.$localLocationcn");
            if (str6 == null) {
                str6 = "";
            }
            b9Var.f275315h = str6;
            java.lang.String str7 = (java.lang.String) d17.get(".msg.location.$localLocationtw");
            if (str7 == null) {
                str7 = "";
            }
            b9Var.f275316i = str7;
            java.lang.String str8 = (java.lang.String) d17.get(".msg.location.$poiname");
            if (str8 == null) {
                str8 = "";
            }
            b9Var.f275313f = str8;
            java.lang.String str9 = (java.lang.String) d17.get(".msg.location.$infourl");
            if (str9 == null) {
                str9 = "";
            }
            b9Var.f275318k = str9;
            java.lang.String str10 = (java.lang.String) d17.get(".msg.location.$poiid");
            if (str10 == null) {
                str10 = "";
            }
            b9Var.f275319l = str10;
            b9Var.f275320m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y((java.lang.String) d17.get(".msg.location.$isFromPoiList"), false);
            java.lang.String str11 = (java.lang.String) d17.get(".msg.location.$poiCategoryTips");
            if (str11 == null) {
                str11 = "";
            }
            b9Var.f275321n = str11;
            java.lang.String str12 = (java.lang.String) d17.get(".msg.location.$poiBusinessHour");
            if (str12 == null) {
                str12 = "";
            }
            b9Var.f275322o = str12;
            java.lang.String str13 = (java.lang.String) d17.get(".msg.location.$poiPhone");
            if (str13 == null) {
                str13 = "";
            }
            b9Var.f275323p = str13;
            b9Var.f275324q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) d17.get(".msg.location.$poiPriceTips"));
            java.lang.String str14 = (java.lang.String) d17.get(".msg.location.$buildingId");
            if (str14 == null) {
                str14 = "";
            }
            b9Var.f275325r = str14;
            java.lang.String str15 = (java.lang.String) d17.get(".msg.location.$floorName");
            b9Var.f275326s = str15 != null ? str15 : "";
        }
        return b9Var;
    }

    public java.lang.String a() {
        return this.f275313f;
    }

    public boolean b() {
        java.lang.String str = this.f275313f;
        return (str == null || str.equals("") || this.f275313f.equals("[位置]")) ? false : true;
    }

    public boolean c() {
        return java.lang.Math.abs(this.f275310c) <= 180.0d && java.lang.Math.abs(this.f275309b) <= 90.0d;
    }

    /* renamed from: toString */
    public java.lang.String m77955x9616526c() {
        return java.lang.String.format("%d-%d-%d", java.lang.Integer.valueOf((int) (this.f275309b * 1000000.0d)), java.lang.Integer.valueOf((int) (this.f275310c * 1000000.0d)), java.lang.Integer.valueOf(this.f275311d));
    }
}
