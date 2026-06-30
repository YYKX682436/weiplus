package mb4;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f406909a;

    /* renamed from: attractingAnimationInfo */
    @za4.k1
    public mb4.b f72812x15b9f491;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f406910b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f406911c;

    /* renamed from: cheerIcon */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f72813x1b892766;

    /* renamed from: cheerIconDark */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f72814x5a5b67fc;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f406912d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f406913e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f406914f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f406915g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f406916h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f406917i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f406918j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f406919k = false;

    /* renamed from: l, reason: collision with root package name */
    public mb4.p f406920l;

    /* renamed from: likedIcon */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f72815xf67255c6;

    /* renamed from: likedIconDark */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f72816x2646665c;

    /* renamed from: m, reason: collision with root package name */
    public mb4.r f406921m;

    /* renamed from: n, reason: collision with root package name */
    public mb4.a f406922n;

    /* renamed from: pagAnimationUrl */
    @za4.k1(m178630x415c6bfa = 3)
    public java.lang.String f72817x2b832701;

    public static mb4.c c(java.util.Map map, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        int D1;
        java.lang.String str11;
        java.lang.String str12;
        float B1;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        boolean z17;
        boolean z18;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        java.lang.String str20;
        java.lang.String str21;
        java.lang.String str22;
        java.lang.String str23;
        java.lang.String str24;
        java.lang.String str25;
        java.lang.String str26;
        java.lang.String str27;
        java.lang.String str28 = "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
        if (a84.b0.c(map) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
            return null;
        }
        if (!map.containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
            return null;
        }
        try {
            str3 = (java.lang.String) map.get(str + ".cheerIcon");
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str29 = (java.lang.String) map.get(str + ".cheerIconDark");
            str4 = str29 == null ? "" : str29;
            java.lang.String str30 = (java.lang.String) map.get(str + ".cheerText.zh");
            str5 = str30 == null ? "" : str30;
            java.lang.String str31 = (java.lang.String) map.get(str + ".cheerText.tw");
            str6 = str31 == null ? "" : str31;
            java.lang.String str32 = (java.lang.String) map.get(str + ".cheerText.en");
            str7 = str32 == null ? "" : str32;
            java.lang.String str33 = (java.lang.String) map.get(str + ".cheerFinishText.zh");
            java.lang.String str34 = str33 == null ? "" : str33;
            java.lang.String str35 = (java.lang.String) map.get(str + ".cheerFinishText.tw");
            java.lang.String str36 = str35 == null ? "" : str35;
            java.lang.String str37 = (java.lang.String) map.get(str + ".cheerFinishText.en");
            java.lang.String str38 = str37 == null ? "" : str37;
            java.lang.String str39 = (java.lang.String) map.get(str + ".commentText.zh");
            java.lang.String str40 = str39 == null ? "" : str39;
            str8 = (java.lang.String) map.get(str + ".commentText.tw");
            if (str8 == null) {
                str8 = "";
            }
            str9 = (java.lang.String) map.get(str + ".commentText.en");
            if (str9 == null) {
                str9 = "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            str10 = str40;
            sb6.append(".attractingAnimation.interval");
            D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(sb6.toString()), 0);
            java.lang.String str41 = (java.lang.String) map.get(str + ".attractingAnimation.pagUrl");
            java.lang.String str42 = str41 == null ? "" : str41;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            str11 = str42;
            sb7.append(".attractingAnimation.pagMD5");
            java.lang.String str43 = (java.lang.String) map.get(sb7.toString());
            java.lang.String str44 = str43 == null ? "" : str43;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            str12 = str44;
            sb8.append(".attractingAnimation.offsetY");
            B1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(sb8.toString()));
            java.lang.String str45 = (java.lang.String) map.get(str + ".attractingAnimation.iconPagUrl");
            java.lang.String str46 = str45 == null ? "" : str45;
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            str13 = str46;
            sb9.append(".attractingAnimation.iconPagMD5");
            java.lang.String str47 = (java.lang.String) map.get(sb9.toString());
            java.lang.String str48 = str47 == null ? "" : str47;
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            str14 = str48;
            sb10.append(".attractingAnimation.iconPagDarkUrl");
            java.lang.String str49 = (java.lang.String) map.get(sb10.toString());
            str15 = str49 == null ? "" : str49;
            java.lang.String str50 = (java.lang.String) map.get(str + ".attractingAnimation.iconPagDarkMD5");
            str16 = str50 == null ? "" : str50;
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append(".notShowPag");
            z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(sb11.toString()), 0) == 1;
            z18 = false;
            str17 = str38;
            str18 = str36;
            str19 = str34;
            str20 = str7;
            str21 = str6;
            str22 = str5;
            str23 = str4;
            try {
                str24 = str + ".fireworkCheerInfo";
                str25 = str + ".patInfo";
            } catch (java.lang.Throwable th6) {
                th = th6;
                str2 = "parse";
                str28 = "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo";
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            str2 = "parse";
        }
        if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str3, str4, str5, str6, str7, str19, str18, str17, str10, str8, str9)) && !map.containsKey(str24)) {
            str2 = "parse";
            str28 = "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str28);
            return null;
        }
        mb4.c cVar = new mb4.c();
        cVar.f72813x1b892766 = str3;
        cVar.f72814x5a5b67fc = str23;
        cVar.f406909a = str22;
        cVar.f406910b = str21;
        cVar.f406911c = str20;
        cVar.f406912d = str19;
        cVar.f406913e = str18;
        cVar.f406914f = str17;
        cVar.f406915g = str10;
        cVar.f406916h = str8;
        cVar.f406917i = str9;
        java.lang.String str51 = (java.lang.String) map.get(str + ".likedIcon");
        if (str51 == null) {
            str51 = str3;
        }
        cVar.f72815xf67255c6 = str51;
        java.lang.String str52 = (java.lang.String) map.get(str + ".likedIconDark");
        if (str52 != null) {
            str3 = str52;
        }
        cVar.f72816x2646665c = str3;
        str28 = "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo";
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAttractingAnimationInfoValid", str28);
            if (D1 >= 1000) {
                str26 = str11;
                str27 = str12;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str26, str27)) {
                    z18 = true;
                }
            } else {
                str26 = str11;
                str27 = str12;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAttractingAnimationInfoValid", str28);
            if (z18) {
                mb4.b bVar = new mb4.b();
                cVar.f72812x15b9f491 = bVar;
                bVar.f406904a = D1;
                bVar.f72811xc4a5ccf9 = str26;
                bVar.f406905b = str27;
                bVar.f406906c = B1;
                java.lang.String str53 = str13;
                bVar.f72810xdc30f6d2 = str53;
                java.lang.String str54 = str14;
                bVar.f406907d = str54;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str15)) {
                    str53 = str15;
                }
                bVar.f72809x3a8f69fc = str53;
                mb4.b bVar2 = cVar.f72812x15b9f491;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str16)) {
                    str54 = str16;
                }
                bVar2.f406908e = str54;
            }
            java.lang.String str55 = (java.lang.String) map.get(str + ".pagAnimationUrl");
            if (str55 == null) {
                str55 = "";
            }
            cVar.f72817x2b832701 = str55;
            java.lang.String str56 = (java.lang.String) map.get(str + ".pagAnimationMD5");
            cVar.f406918j = str56 == null ? "" : str56;
            cVar.f406919k = z17;
            java.lang.String str57 = str + ".continuousLikeInfo";
            if (map.containsKey(str57)) {
                cVar.f406920l = mb4.p.d(map, str57);
            }
            if (map.containsKey(str24)) {
                cVar.f406921m = mb4.r.l(map, str24);
            }
            if (map.containsKey(str25)) {
                cVar.f406922n = mb4.a.c(map, str25);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", str28);
            return cVar;
        } catch (java.lang.Throwable th8) {
            th = th8;
            str2 = "parse";
            ca4.q.c("parse adSocialInfo", th);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str28);
            return null;
        }
    }

    public java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAttractPag", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
        mb4.r rVar = this.f406921m;
        if (rVar == null || rVar.a() == null) {
            mb4.b bVar = this.f72812x15b9f491;
            if (bVar == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttractPag", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
                return null;
            }
            java.lang.String str = bVar.f72811xc4a5ccf9;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttractPag", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
            return str;
        }
        mb4.g a17 = this.f406921m.a();
        a17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.AttractPag");
        java.lang.String str2 = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t0) a17.f406942a).a(a17, mb4.g.f406941d[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.AttractPag");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttractPag", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
        return str2;
    }

    public java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLikeIconPag", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
        mb4.r rVar = this.f406921m;
        if (rVar != null && rVar.c() != null) {
            mb4.t c17 = this.f406921m.c();
            c17.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkIconPag");
            java.lang.String str = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t0) c17.f407008a).a(c17, mb4.t.f407007e[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkIconPag");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikeIconPag", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
            return str;
        }
        if (this.f72812x15b9f491 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikeIconPag", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
            return null;
        }
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            java.lang.String str2 = this.f72812x15b9f491.f72809x3a8f69fc;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikeIconPag", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
            return str2;
        }
        java.lang.String str3 = this.f72812x15b9f491.f72810xdc30f6d2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikeIconPag", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
        return str3;
    }
}
