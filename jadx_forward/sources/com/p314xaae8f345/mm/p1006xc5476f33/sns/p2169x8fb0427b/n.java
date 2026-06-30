package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public int f247599a;

    /* renamed from: adDragInfo */
    @za4.k1
    public s34.k f38337x4c39e945;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f247600b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f247601c;

    /* renamed from: d, reason: collision with root package name */
    public int f247602d = 30;

    /* renamed from: e, reason: collision with root package name */
    public int f247603e;

    /* renamed from: endCoverUrl */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f38338x8f672c33;

    /* renamed from: endCoverViewInfo */
    @za4.k1
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qa f38339xebc26caf;

    /* renamed from: f, reason: collision with root package name */
    public int f247604f;

    /* renamed from: frontCoverUrl */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f38340x19ed5381;

    /* renamed from: g, reason: collision with root package name */
    public s34.l0 f247605g;

    /* renamed from: gestureClickActionInfo */
    @za4.k1(m178630x415c6bfa = 5)
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f38341xd41fa323;

    /* renamed from: h, reason: collision with root package name */
    public float f247606h;

    /* renamed from: i, reason: collision with root package name */
    public int f247607i;

    /* renamed from: j, reason: collision with root package name */
    public int f247608j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x f247609k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.u f247610l;

    public void a(java.util.Map map, java.lang.String str) {
        android.graphics.Rect rect;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdFullCardInfo");
        this.f247599a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".displayType"), 0);
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        if (str2 == null) {
            str2 = "";
        }
        this.f247600b = str2;
        java.lang.String str3 = (java.lang.String) map.get(str + ".description");
        if (str3 == null) {
            str3 = "";
        }
        this.f247601c = str3;
        this.f247602d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".markMaxAlpha"), 30);
        this.f247603e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".titlePosition"), 0);
        java.lang.String str4 = (java.lang.String) map.get(str + ".maskImg");
        if (str4 == null) {
            str4 = "";
        }
        this.f38340x19ed5381 = str4;
        this.f247607i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".maskImgDisappearTime"), 0);
        java.lang.String str5 = (java.lang.String) map.get(str + ".coverImg");
        if (str5 == null) {
            str5 = "";
        }
        this.f38338x8f672c33 = str5;
        this.f247608j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".coverImgAppearTime"), 0);
        java.lang.String str6 = (java.lang.String) map.get(str + ".adGestureInfo.points");
        this.f247606h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str + ".blankViewHeightPercent"));
        this.f247604f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".adGestureInfo.breakFrameFlag"), 0);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
            java.lang.String str7 = str + ".adGestureInfo";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdGestureInfo");
            s34.l0 l0Var = new s34.l0();
            if (str7 != null) {
                l0Var.f484232a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str7.concat(".startTime")), 0);
                l0Var.f484233b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str7.concat(".endTime")), 0);
                java.lang.String str8 = (java.lang.String) map.get(str7.concat(".color"));
                if (str8 == null) {
                    str8 = "";
                }
                l0Var.f484234c = ca4.n0.e(str8, -1);
                java.lang.String str9 = (java.lang.String) map.get(str7.concat(".points"));
                if (str9 == null) {
                    str9 = "";
                }
                l0Var.f484235d = str9;
                l0Var.f484236e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str7.concat(".radius")));
                l0Var.f484237f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str7.concat(".pointsBasicWidth")), 1280);
                l0Var.f484238g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str7.concat(".pointsBasicHeight")), com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdGestureInfo");
            this.f247605g = l0Var;
        }
        java.lang.String str10 = str + ".endCoverInfo";
        if (map.containsKey(str10)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qa qaVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qa();
            this.f38339xebc26caf = qaVar;
            java.lang.String str11 = (java.lang.String) map.get(str10 + ".title");
            if (str11 == null) {
                str11 = "";
            }
            qaVar.f251866a = str11;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qa qaVar2 = this.f38339xebc26caf;
            java.lang.String str12 = (java.lang.String) map.get(str10 + ".description");
            if (str12 == null) {
                str12 = "";
            }
            qaVar2.f251867b = str12;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qa qaVar3 = this.f38339xebc26caf;
            java.lang.String str13 = (java.lang.String) map.get(str10 + ".actionTitle");
            if (str13 == null) {
                str13 = "";
            }
            qaVar3.f251868c = str13;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qa qaVar4 = this.f38339xebc26caf;
            java.lang.String str14 = (java.lang.String) map.get(str10 + ".ambientImageUrl");
            if (str14 == null) {
                str14 = "";
            }
            qaVar4.f38455xe4f35543 = str14;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qa qaVar5 = this.f38339xebc26caf;
            java.lang.String str15 = (java.lang.String) map.get(str10 + ".titleImageUrl");
            if (str15 == null) {
                str15 = "";
            }
            qaVar5.f38456xd58e724 = str15;
            this.f38339xebc26caf.f251869d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str10 + ".endCoverEndTime"), 0);
        }
        this.f247609k = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x.a(map, str + ".adLongPressGestureInfo");
        java.lang.String str16 = str + ".dragImageGestureInfo";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.u uVar = null;
        if (map.containsKey(str16)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromXml", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            s34.k kVar = new s34.k();
            java.lang.String str17 = (java.lang.String) map.get(str16 + ".imageUrl");
            if (str17 == null) {
                str17 = "";
            }
            kVar.f76708xc0bf78f1 = str17;
            if (android.text.TextUtils.isEmpty(str17)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            } else {
                kVar.f484213a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str16 + ".dragStartTime"), 0);
                int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str16 + ".dragEndTime"), 0);
                kVar.f484214b = D1;
                int i17 = kVar.f484213a;
                if (i17 < 0 || D1 < 0 || i17 > D1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
                } else {
                    java.lang.String str18 = (java.lang.String) map.get(str16 + ".srcDisplayRect");
                    if (str18 == null) {
                        str18 = "";
                    }
                    kVar.f484215c = s34.k.d(str18);
                    java.lang.String str19 = (java.lang.String) map.get(str16 + ".destDisplayRect");
                    if (str19 == null) {
                        str19 = "";
                    }
                    kVar.f484216d = s34.k.d(str19);
                    java.lang.String str20 = (java.lang.String) map.get(str16 + ".srcHitRect");
                    if (str20 == null) {
                        str20 = "";
                    }
                    kVar.f484217e = s34.k.d(str20);
                    java.lang.String str21 = (java.lang.String) map.get(str16 + ".destHitRect");
                    if (str21 == null) {
                        str21 = "";
                    }
                    android.graphics.Rect d17 = s34.k.d(str21);
                    kVar.f484218f = d17;
                    if (kVar.f484215c == null || kVar.f484216d == null || (rect = kVar.f484217e) == null || d17 == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
                    } else if (android.graphics.Rect.intersects(rect, d17)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
                        this.f38337x4c39e945 = kVar;
                    }
                }
            }
            kVar = null;
            this.f38337x4c39e945 = kVar;
        }
        java.lang.String str22 = str + ".clickableAnimLabel";
        if (map.containsKey(str22)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ClickableAnimLabelInfo");
            java.lang.String str23 = (java.lang.String) map.get(str22 + ".descText");
            java.lang.String str24 = str23 != null ? str23 : "";
            int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str22 + ".animShowTime"), 0);
            int D13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str22 + ".animHideTime"), 0);
            if (D12 <= 0 || D13 <= 0 || android.text.TextUtils.isEmpty(str24)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ClickableAnimLabelInfo");
            } else if (D12 >= D13) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ClickableAnimLabelInfo");
            } else {
                uVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.u();
                uVar.f247679a = str24;
                uVar.f247680b = D12;
                uVar.f247681c = D13;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ClickableAnimLabelInfo");
            }
            this.f247610l = uVar;
        }
        java.lang.String str25 = str + ".adGestureClickActionInfo";
        if (map.containsKey(str25)) {
            this.f38341xd41fa323 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(map, str25);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdFullCardInfo");
    }
}
