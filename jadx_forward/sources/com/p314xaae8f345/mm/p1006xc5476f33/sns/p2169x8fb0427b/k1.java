package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k1 f247569a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k1();

    public final r45.jj4 a(java.lang.String str, java.util.Map map) {
        byte[] bytes;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseMedia", "com.tencent.mm.plugin.sns.storage.MediaObjParser");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseMedia", "com.tencent.mm.plugin.sns.storage.MediaObjParser");
            return null;
        }
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseMedia", "com.tencent.mm.plugin.sns.storage.MediaObjParser");
            return null;
        }
        java.lang.String concat = str.concat(".id");
        java.lang.String concat2 = str.concat(".type");
        java.lang.String concat3 = str.concat(".title");
        java.lang.String concat4 = str.concat(".description");
        java.lang.String concat5 = str.concat(".ybTemplate");
        java.lang.String concat6 = str.concat(".url");
        java.lang.String concat7 = str.concat(".url.$videomd5");
        java.lang.String concat8 = str.concat(".thumb");
        java.lang.String concat9 = str.concat(".url.$type");
        java.lang.String concat10 = str.concat(".thumb.$type");
        java.lang.String concat11 = str.concat(".private");
        java.lang.String concat12 = str.concat(".subType");
        java.lang.String concat13 = str.concat(".userData");
        java.lang.String concat14 = str.concat(".lowBandUrl");
        java.lang.String concat15 = str.concat(".lowBandUrl.$type");
        java.lang.String concat16 = str.concat(".songalbumurl");
        java.lang.String concat17 = str.concat(".songlyric");
        java.lang.String concat18 = str.concat(".attachUrl");
        java.lang.String concat19 = str.concat(".attachUrl.$md5");
        java.lang.String concat20 = str.concat(".url.$md5");
        java.lang.String concat21 = str.concat(".videosize.$attachTotalTime");
        java.lang.String concat22 = str.concat(".attachThumbUrl");
        java.lang.String concat23 = str.concat(".attachShareTitle");
        java.lang.String concat24 = str.concat(".enc");
        java.lang.String concat25 = str.concat(".enc.$key");
        java.lang.String concat26 = str.concat(".url.$token");
        java.lang.String concat27 = str.concat(".url.$enc_idx");
        java.lang.String concat28 = str.concat(".url.$key");
        java.lang.String concat29 = str.concat(".thumb.$token");
        java.lang.String concat30 = str.concat(".thumb.$enc_idx");
        java.lang.String concat31 = str.concat(".thumb.$key");
        java.lang.String concat32 = str.concat(".videoDuration");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillContentMediaSize", "com.tencent.mm.plugin.sns.storage.MediaObjParser");
        java.lang.String concat33 = str.concat(".size.$width");
        java.lang.String concat34 = str.concat(".size.$height");
        java.lang.String concat35 = str.concat(".size.$totalSize");
        java.lang.String str2 = (java.lang.String) map.get(concat33);
        java.lang.String str3 = (java.lang.String) map.get(concat34);
        java.lang.String str4 = (java.lang.String) map.get(concat35);
        r45.lj4 lj4Var = new r45.lj4();
        lj4Var.f461054e = 0.0f;
        lj4Var.f461053d = 0.0f;
        lj4Var.f461055f = 0.0f;
        if (str2 != null) {
            lj4Var.f461053d = m21.y.p(str2);
        }
        if (str3 != null) {
            lj4Var.f461054e = m21.y.p(str3);
        }
        if (str4 != null) {
            lj4Var.f461055f = m21.y.p(str4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillContentMediaSize", "com.tencent.mm.plugin.sns.storage.MediaObjParser");
        java.lang.String str5 = (java.lang.String) map.get(concat);
        java.lang.String str6 = (java.lang.String) map.get(concat2);
        java.lang.String str7 = (java.lang.String) map.get(concat3);
        java.lang.String str8 = (java.lang.String) map.get(concat4);
        java.lang.String str9 = (java.lang.String) map.get(concat5);
        java.lang.String str10 = (java.lang.String) map.get(concat6);
        java.lang.String str11 = (java.lang.String) map.get(concat32);
        java.lang.String str12 = (java.lang.String) map.get(concat11);
        java.lang.String str13 = (java.lang.String) map.get(concat8);
        java.lang.String str14 = (java.lang.String) map.get(concat7);
        java.lang.String str15 = (java.lang.String) map.get(concat9);
        java.lang.String str16 = (java.lang.String) map.get(concat10);
        java.lang.String str17 = (java.lang.String) map.get(concat14);
        java.lang.String str18 = (java.lang.String) map.get(concat15);
        java.lang.String str19 = (java.lang.String) map.get(concat16);
        java.lang.String str20 = (java.lang.String) map.get(concat17);
        java.lang.String str21 = (java.lang.String) map.get(concat12);
        java.lang.String str22 = (java.lang.String) map.get(concat13);
        java.lang.String str23 = (java.lang.String) map.get(concat18);
        java.lang.String str24 = (java.lang.String) map.get(concat19);
        java.lang.String str25 = (java.lang.String) map.get(concat20);
        java.lang.String str26 = (java.lang.String) map.get(concat21);
        java.lang.String str27 = (java.lang.String) map.get(concat22);
        java.lang.String str28 = (java.lang.String) map.get(concat23);
        java.lang.String str29 = (java.lang.String) map.get(concat24);
        java.lang.String str30 = (java.lang.String) map.get(concat25);
        java.lang.String str31 = (java.lang.String) map.get(concat26);
        java.lang.String str32 = (java.lang.String) map.get(concat27);
        java.lang.String str33 = (java.lang.String) map.get(concat28);
        java.lang.String str34 = (java.lang.String) map.get(concat29);
        java.lang.String str35 = (java.lang.String) map.get(concat30);
        java.lang.String str36 = (java.lang.String) map.get(concat31);
        if (str6 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseMedia", "com.tencent.mm.plugin.sns.storage.MediaObjParser");
            return null;
        }
        r45.jj4 jj4Var = new r45.jj4();
        jj4Var.f459388d = m21.y.t(str5);
        jj4Var.f459389e = m21.y.r(str6);
        jj4Var.f459397o = m21.y.t(str7);
        jj4Var.f459390f = m21.y.t(str8);
        jj4Var.I1 = m21.y.t(str9);
        jj4Var.f459391g = m21.y.t(str10);
        jj4Var.f459392h = m21.y.r(str15);
        jj4Var.f459393i = m21.y.t(str13);
        jj4Var.f459395m = m21.y.r(str16);
        jj4Var.f459396n = m21.y.r(str12);
        jj4Var.f459398p = lj4Var;
        jj4Var.f459401q = m21.y.t(str17);
        jj4Var.f459402r = m21.y.r(str18);
        jj4Var.P = str19;
        jj4Var.Q = str20;
        jj4Var.f459405u = m21.y.t(str22);
        jj4Var.f459406v = m21.y.r(str21);
        jj4Var.f459408x = m21.y.t(str23);
        jj4Var.f459414z = m21.y.t(str24);
        jj4Var.f459411y = m21.y.t(str25);
        jj4Var.M = m21.y.t(str14);
        jj4Var.A = m21.y.r(str26);
        jj4Var.B = m21.y.t(str27);
        jj4Var.C = m21.y.t(str28);
        jj4Var.D = m21.y.r(str29);
        jj4Var.E = m21.y.s(str30);
        java.lang.String Url = jj4Var.f459391g;
        if (Url == null) {
            bytes = "".getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url, "Url");
            bytes = Url.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        }
        jj4Var.F = kk.k.g(bytes);
        jj4Var.G = str31;
        jj4Var.H = m21.y.r(str32);
        jj4Var.I = str33;
        jj4Var.f459387J = str34;
        jj4Var.K = m21.y.r(str35);
        jj4Var.L = str36;
        jj4Var.R = m21.y.p(str11);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseMedia", "com.tencent.mm.plugin.sns.storage.MediaObjParser");
        return jj4Var;
    }
}
