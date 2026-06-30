package wa4;

/* loaded from: classes4.dex */
public abstract class a0 {
    public static void a(wa4.z zVar, r45.jj4 jj4Var, java.lang.Boolean bool, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillMediaTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = bool.booleanValue() ? "liveMedia" : "media";
        zVar.e(str);
        zVar.e(dm.i4.f66865x76d1ec5a);
        if (b(jj4Var.f459388d).isEmpty()) {
            zVar.h("0");
        } else {
            zVar.h(b(jj4Var.f459388d));
        }
        zVar.b(dm.i4.f66865x76d1ec5a);
        zVar.e("type");
        zVar.h(jj4Var.f459389e + "");
        zVar.b("type");
        zVar.e(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        zVar.h(c(jj4Var.f459397o));
        zVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        zVar.e("description");
        zVar.h(c(jj4Var.f459390f));
        zVar.b("description");
        if (!android.text.TextUtils.isEmpty(jj4Var.I1)) {
            zVar.e("ybTemplate");
            zVar.h(c(jj4Var.I1));
            zVar.b("ybTemplate");
        }
        zVar.e("private");
        zVar.h(jj4Var.f459396n + "");
        zVar.b("private");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jj4Var.P)) {
            zVar.e("songalbumurl");
            zVar.h(jj4Var.P);
            zVar.b("songalbumurl");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jj4Var.Q)) {
            zVar.e("songlyric");
            zVar.h(jj4Var.Q);
            zVar.b("songlyric");
        }
        hashMap.clear();
        hashMap.put("type", jj4Var.f459392h + "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jj4Var.f459407w)) {
            hashMap.put("md5", jj4Var.f459407w);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jj4Var.M)) {
            hashMap.put("videomd5", jj4Var.M);
        }
        zVar.f("url", hashMap);
        zVar.h(c(jj4Var.f459391g));
        zVar.b("url");
        java.lang.String str2 = jj4Var.f459393i;
        if (str2 != null && !str2.isEmpty()) {
            hashMap.clear();
            hashMap.put("type", jj4Var.f459395m + "");
            zVar.f("thumb", hashMap);
            zVar.h(c(jj4Var.f459393i));
            zVar.b("thumb");
        }
        if (!android.text.TextUtils.isEmpty(jj4Var.f459412y0)) {
            hashMap.clear();
            hashMap.put("type", jj4Var.f459392h + "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jj4Var.f459413y1)) {
                hashMap.put("md5", jj4Var.f459413y1);
            }
            if (jj4Var.f459415z1 != null) {
                hashMap.put("width", jj4Var.f459415z1.f461053d + "");
                hashMap.put("height", jj4Var.f459415z1.f461054e + "");
                hashMap.put("fileSize", jj4Var.f459415z1.f461055f + "");
            }
            zVar.f("uhd", hashMap);
            zVar.h(c(jj4Var.f459412y0));
            zVar.b("uhd");
        }
        if (!android.text.TextUtils.isEmpty(jj4Var.A1)) {
            hashMap.clear();
            hashMap.put("type", jj4Var.f459392h + "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jj4Var.E1)) {
                hashMap.put("md5", jj4Var.E1);
            }
            if (jj4Var.F1 != null) {
                hashMap.put("width", jj4Var.F1.f461053d + "");
                hashMap.put("height", jj4Var.F1.f461054e + "");
                hashMap.put("fileSize", jj4Var.F1.f461055f + "");
            }
            zVar.f("hd", hashMap);
            zVar.h(c(jj4Var.A1));
            zVar.b("hd");
        }
        zVar.e("videoDuration");
        zVar.h(jj4Var.R + "");
        zVar.b("videoDuration");
        if (jj4Var.f459406v > 0) {
            zVar.e("subType");
            zVar.h(jj4Var.f459406v + "");
            zVar.b("subType");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jj4Var.f459405u)) {
            zVar.e("userData");
            zVar.h(jj4Var.f459405u);
            zVar.b("userData");
        }
        java.lang.String str3 = jj4Var.f459401q;
        if (str3 != null && !str3.isEmpty()) {
            hashMap.clear();
            hashMap.put("type", jj4Var.f459402r + "");
            zVar.f("lowBandUrl", hashMap);
            zVar.h(c(jj4Var.f459401q));
            zVar.b("lowBandUrl");
        }
        if (jj4Var.f459398p != null) {
            hashMap.clear();
            if (jj4Var.f459398p.f461053d > 0.0f) {
                hashMap.put("width", jj4Var.f459398p.f461053d + "");
            }
            if (jj4Var.f459398p.f461054e > 0.0f) {
                hashMap.put("height", jj4Var.f459398p.f461054e + "");
            }
            if (jj4Var.f459398p.f461055f > 0.0f) {
                hashMap.put("totalSize", jj4Var.f459398p.f461055f + "");
            }
            zVar.f("size", hashMap);
            zVar.b("size");
        }
        java.util.LinkedList linkedList = jj4Var.V;
        if (linkedList != null && !linkedList.isEmpty()) {
            zVar.e("EmotionList");
            for (int i17 = 0; i17 < jj4Var.V.size(); i17++) {
                zVar.e("emotion");
                zVar.e("wording");
                zVar.d(((r45.x96) jj4Var.V.get(i17)).f471435e);
                zVar.b("wording");
                zVar.e("md5");
                zVar.d(((r45.x96) jj4Var.V.get(i17)).f471434d);
                zVar.b("md5");
                zVar.b("emotion");
            }
            zVar.b("EmotionList");
        }
        if (c19807x593d1720.f39026x8eaeecf7) {
            zVar.e("BizInfo");
            zVar.e("ExcerptUrl");
            zVar.h(c(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(java.net.URLEncoder.encode(c19807x593d1720.f39037x819f4fc6))));
            zVar.b("ExcerptUrl");
            zVar.b("BizInfo");
        }
        if (jj4Var.W != null) {
            m21.t tVar = new m21.t();
            tVar.f404533a = jj4Var.W;
            zVar.a(tVar.a());
        }
        if (jj4Var.f459409x0 != null) {
            m21.o oVar = new m21.o();
            oVar.f404529a = jj4Var.f459409x0;
            zVar.a(oVar.a());
        }
        if (bool.booleanValue()) {
            zVar.e("liveStillImageTimeMs");
            zVar.h(jj4Var.Z + "");
            zVar.b("liveStillImageTimeMs");
        }
        if (jj4Var.X != null) {
            zVar.e("LivePhoto");
            a(zVar, jj4Var.X, java.lang.Boolean.TRUE, c19807x593d1720);
            zVar.b("LivePhoto");
        }
        if (jj4Var.G1 != null) {
            zVar.e("finderInfo");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jj4Var.G1.f469605d)) {
                zVar.e("sourceUrl");
                zVar.h(jj4Var.G1.f469605d);
                zVar.b("sourceUrl");
            }
            zVar.b("finderInfo");
        }
        zVar.b(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillMediaTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
    }

    public static java.lang.String b(java.lang.String str) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("filterId", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterId", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isNumeric", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        if (str.matches("\\d*")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNumeric", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
            z17 = true;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNumeric", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterId", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
            return str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterId", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        return "";
    }

    public static java.lang.String c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("filterNull", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterNull", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterNull", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        return str;
    }

    public static java.lang.String d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pullTimeLineXml", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        wa4.z zVar = new wa4.z();
        java.util.HashMap hashMap = new java.util.HashMap();
        zVar.e("TimelineObject");
        zVar.e(dm.i4.f66865x76d1ec5a);
        java.lang.String str = c19807x593d1720.Id;
        if (str == null || str.equals("")) {
            zVar.d("0");
        } else {
            zVar.d(c19807x593d1720.Id + "");
        }
        zVar.b(dm.i4.f66865x76d1ec5a);
        if (c19807x593d1720.f39018xf3f56116 != null) {
            zVar.e(dm.i4.f66875xa013b0d5);
            zVar.h(c19807x593d1720.f39018xf3f56116 + "");
            zVar.b(dm.i4.f66875xa013b0d5);
        }
        zVar.e("createTime");
        zVar.h(c19807x593d1720.f39015xc86e6609 + "");
        zVar.b("createTime");
        zVar.e("contentDescShowType");
        zVar.g(c19807x593d1720.f39023x3fef4a1);
        zVar.b("contentDescShowType");
        zVar.e("contentDescScene");
        zVar.g(c19807x593d1720.f39022xd5fa8002);
        zVar.b("contentDescScene");
        zVar.e("private");
        zVar.h(c19807x593d1720.f39017xbebdef61 + "");
        zVar.b("private");
        r45.y8 y8Var = c19807x593d1720.f39012x33e0f24f;
        if (y8Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y8Var.f472379d)) {
            zVar.e("appInfo");
            zVar.e(dm.i4.f66865x76d1ec5a);
            zVar.h(c(c19807x593d1720.f39012x33e0f24f.f472379d));
            zVar.b(dm.i4.f66865x76d1ec5a);
            zVar.e("version");
            zVar.h(c(c19807x593d1720.f39012x33e0f24f.f472380e));
            zVar.b("version");
            zVar.e("isHidden");
            zVar.g(c19807x593d1720.f39012x33e0f24f.f472385m);
            zVar.b("isHidden");
            zVar.e("appName");
            zVar.h(c(c19807x593d1720.f39012x33e0f24f.f472381f));
            zVar.b("appName");
            zVar.e("installUrl");
            zVar.h(c(c19807x593d1720.f39012x33e0f24f.f472382g));
            zVar.b("installUrl");
            zVar.e("fromUrl");
            zVar.h(c(c19807x593d1720.f39012x33e0f24f.f472383h));
            zVar.b("fromUrl");
            zVar.b("appInfo");
        }
        r45.tf6 tf6Var = c19807x593d1720.f39042x624074fb;
        if (tf6Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tf6Var.f467912d)) {
            zVar.e("streamvideo");
            zVar.e("streamvideourl");
            zVar.h(c(c19807x593d1720.f39042x624074fb.f467912d));
            zVar.b("streamvideourl");
            zVar.e("streamvideototaltime");
            zVar.g(c19807x593d1720.f39042x624074fb.f467913e);
            zVar.b("streamvideototaltime");
            zVar.e("streamvideotitle");
            zVar.h(c(c19807x593d1720.f39042x624074fb.f467916h));
            zVar.b("streamvideotitle");
            zVar.e("streamvideowording");
            zVar.h(c(c19807x593d1720.f39042x624074fb.f467914f));
            zVar.b("streamvideowording");
            zVar.e("streamvideoweburl");
            zVar.h(c(c19807x593d1720.f39042x624074fb.f467915g));
            zVar.b("streamvideoweburl");
            zVar.e("streamvideothumburl");
            zVar.h(c(c19807x593d1720.f39042x624074fb.f467917i));
            zVar.b("streamvideothumburl");
            zVar.e("streamvideoaduxinfo");
            zVar.h(c(c19807x593d1720.f39042x624074fb.f467918m));
            zVar.b("streamvideoaduxinfo");
            zVar.e("streamvideopublishid");
            zVar.h(c(c19807x593d1720.f39042x624074fb.f467919n));
            zVar.b("streamvideopublishid");
            zVar.b("streamvideo");
        }
        r45.y97 y97Var = c19807x593d1720.f39045x33feb8ea;
        if (y97Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y97Var.f472431d)) {
            zVar.e("websearch");
            zVar.e("relevant_vid");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472431d));
            zVar.b("relevant_vid");
            zVar.e("relevant_expand");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472432e));
            zVar.b("relevant_expand");
            zVar.e("relevant_pre_searchid");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472433f));
            zVar.b("relevant_pre_searchid");
            zVar.e("relevant_shared_openid");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472434g));
            zVar.b("relevant_shared_openid");
            zVar.e("rec_category");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472435h + ""));
            zVar.b("rec_category");
            zVar.e("shareUrl");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472437m));
            zVar.b("shareUrl");
            zVar.e("shareTitle");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472438n));
            zVar.b("shareTitle");
            zVar.e("shareDesc");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472439o));
            zVar.b("shareDesc");
            zVar.e("shareImgUrl");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472440p));
            zVar.b("shareImgUrl");
            zVar.e("shareString");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472441q));
            zVar.b("shareString");
            zVar.e("shareStringUrl");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472442r));
            zVar.b("shareStringUrl");
            zVar.e(ya.b.f77502x92235c1b);
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472443s));
            zVar.b(ya.b.f77502x92235c1b);
            zVar.e("strPlayCount");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472436i));
            zVar.b("strPlayCount");
            zVar.e("titleUrl");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472445u));
            zVar.b("titleUrl");
            zVar.e("extReqParams");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472446v));
            zVar.b("extReqParams");
            zVar.e("tagList");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472447w));
            zVar.b("tagList");
            zVar.e(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56315xfd38653e);
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472448x + ""));
            zVar.b(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56315xfd38653e);
            zVar.e("thumbUrl");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472449y));
            zVar.b("thumbUrl");
            zVar.e("shareTag");
            zVar.h(c(c19807x593d1720.f39045x33feb8ea.f472450z));
            zVar.b("shareTag");
            zVar.b("websearch");
        }
        zVar.e("contentDesc");
        zVar.h(c(c19807x593d1720.f39013x4c306a8a));
        zVar.b("contentDesc");
        zVar.e("contentattr");
        zVar.h(c19807x593d1720.f39024xe8d429ea + "");
        zVar.b("contentattr");
        zVar.e("sourceUserName");
        zVar.h(c(c19807x593d1720.f39039x9ed57e31));
        zVar.b("sourceUserName");
        zVar.e("publicUserName");
        zVar.h(c(c19807x593d1720.f39033x11f29a7f));
        zVar.b("publicUserName");
        zVar.e("sourceNickName");
        zVar.h(c(c19807x593d1720.f39038xb2e29dc9));
        zVar.b("sourceNickName");
        zVar.e("publicFinderUserName");
        zVar.h(c19807x593d1720.f39030x4b52e605);
        zVar.b("publicFinderUserName");
        zVar.e("publicPhotoAccountUserName");
        zVar.h(c19807x593d1720.f39032x742a15ba);
        zVar.b("publicPhotoAccountUserName");
        zVar.e("publicPhotoAccountNickName");
        zVar.h(c19807x593d1720.f39031x88373552);
        zVar.b("publicPhotoAccountNickName");
        zVar.e("publicBrandContactType");
        zVar.g(c19807x593d1720.f39029x81aacdfc);
        zVar.b("publicBrandContactType");
        zVar.e("snsCoverOffset");
        zVar.g(c19807x593d1720.f39036xb9f30e92);
        zVar.b("snsCoverOffset");
        r45.p76 p76Var = c19807x593d1720.f39020xf608b196;
        if (p76Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p76Var.f464348e)) {
            zVar.e("bgmInfo");
            zVar.e("bgmType");
            zVar.h(c19807x593d1720.f39020xf608b196.f464347d + "");
            zVar.b("bgmType");
            zVar.e("listenId");
            zVar.h(c(c19807x593d1720.f39020xf608b196.f464348e));
            zVar.b("listenId");
            zVar.e("isMajorOwned");
            zVar.h(c19807x593d1720.f39020xf608b196.f464349f ? "1" : "0");
            zVar.b("isMajorOwned");
            zVar.b("bgmInfo");
        }
        zVar.e("statisticsData");
        zVar.h(c(c19807x593d1720.f39041x2ca9cb6d));
        zVar.b("statisticsData");
        zVar.e("weappInfo");
        zVar.e("appUserName");
        zVar.h(c(c19807x593d1720.f39044xb84ea7e1.f472397d));
        zVar.b("appUserName");
        zVar.e("pagePath");
        zVar.h(c(c19807x593d1720.f39044xb84ea7e1.f472398e));
        zVar.b("pagePath");
        zVar.e("version");
        zVar.h(c(c19807x593d1720.f39044xb84ea7e1.f472399f + ""));
        zVar.b("version");
        zVar.e("isHidden");
        zVar.g(c19807x593d1720.f39012x33e0f24f.f472385m);
        zVar.b("isHidden");
        zVar.e("debugMode");
        zVar.h(c(c19807x593d1720.f39044xb84ea7e1.f472400g + ""));
        zVar.b("debugMode");
        zVar.e("shareActionId");
        zVar.h(c(c19807x593d1720.f39044xb84ea7e1.f472401h));
        zVar.b("shareActionId");
        zVar.e("isGame");
        zVar.h(c(c19807x593d1720.f39044xb84ea7e1.f472402i + ""));
        zVar.b("isGame");
        zVar.e("messageExtraData");
        zVar.h(c(c19807x593d1720.f39044xb84ea7e1.f472403m));
        zVar.b("messageExtraData");
        zVar.e("subType");
        zVar.h(c(c19807x593d1720.f39044xb84ea7e1.f472404n + ""));
        zVar.b("subType");
        zVar.e("preloadResources");
        zVar.h(c(c19807x593d1720.f39044xb84ea7e1.f472405o));
        zVar.b("preloadResources");
        zVar.b("weappInfo");
        zVar.e("canvasInfoXml");
        zVar.h(c(c19807x593d1720.f39021x5732e226));
        zVar.b("canvasInfoXml");
        r45.ed4 ed4Var = c19807x593d1720.f39016x752a03d5;
        if (ed4Var != null) {
            float f17 = ed4Var.f454844d;
            float f18 = ed4Var.f454845e;
            if (f17 != -1000.0f && f18 != -1000.0f) {
                hashMap.clear();
                hashMap.put("longitude", c19807x593d1720.f39016x752a03d5.f454844d + "");
                hashMap.put("latitude", c19807x593d1720.f39016x752a03d5.f454845e + "");
                hashMap.put("city", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(c(c19807x593d1720.f39016x752a03d5.f454846f)));
                hashMap.put("poiName", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(c(c19807x593d1720.f39016x752a03d5.f454847g)));
                hashMap.put("poiAddress", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(c(c19807x593d1720.f39016x752a03d5.f454848h)));
                hashMap.put("poiScale", c19807x593d1720.f39016x752a03d5.f454852o + "");
                hashMap.put("poiClassifyId", c(c19807x593d1720.f39016x752a03d5.f454849i));
                hashMap.put("poiClassifyType", c19807x593d1720.f39016x752a03d5.f454850m + "");
                hashMap.put("poiClickableStatus", c19807x593d1720.f39016x752a03d5.f454853p + "");
                zVar.f(ya.b.f77489x9ff58fb5, hashMap);
                zVar.b(ya.b.f77489x9ff58fb5);
            }
        }
        zVar.e("ContentObject");
        zVar.e("contentStyle");
        zVar.h(c19807x593d1720.f39014x86965dde.f451370e + "");
        zVar.b("contentStyle");
        zVar.e("contentSubStyle");
        zVar.h(c19807x593d1720.f39014x86965dde.f451374i + "");
        zVar.b("contentSubStyle");
        zVar.e(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        zVar.h(c(c19807x593d1720.f39014x86965dde.f451371f));
        zVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        zVar.e("description");
        zVar.h(c(c19807x593d1720.f39014x86965dde.f451369d));
        zVar.b("description");
        zVar.e("contentUrl");
        zVar.h(c(c19807x593d1720.f39014x86965dde.f451372g));
        zVar.b("contentUrl");
        if (!c19807x593d1720.f39014x86965dde.f451373h.isEmpty()) {
            zVar.e("mediaList");
            java.util.Iterator it = c19807x593d1720.f39014x86965dde.f451373h.iterator();
            while (it.hasNext()) {
                a(zVar, (r45.jj4) it.next(), java.lang.Boolean.FALSE, c19807x593d1720);
            }
            zVar.b("mediaList");
        }
        if (c19807x593d1720.f39014x86965dde.F != null) {
            m21.d dVar = new m21.d();
            dVar.f404517a = c19807x593d1720.f39014x86965dde.F;
            zVar.a(dVar.a());
        }
        if (c19807x593d1720.f39014x86965dde.G != null) {
            new r45.k86();
            r45.k86 k86Var = c19807x593d1720.f39014x86965dde.G;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (k86Var != null) {
                try {
                    sb6.append("<EcsInfo>");
                    sb6.append("<ecsJumpInfoBase64>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(k86Var.f460027d));
                    sb6.append("</ecsJumpInfoBase64>");
                    sb6.append("</EcsInfo>");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsEcsShareInfoObject", e17, "makeContent", new java.lang.Object[0]);
                }
            }
            zVar.a(sb6.toString());
        }
        zVar.f525840a.append(c(c19807x593d1720.f39014x86965dde.f451375m));
        r45.hh4 hh4Var = c19807x593d1720.f39014x86965dde.f451376n;
        if (hh4Var != null && hh4Var.f457682d != -1) {
            zVar.e("mmreadershare");
            zVar.e("itemshowtype");
            zVar.g(c19807x593d1720.f39014x86965dde.f451376n.f457682d);
            zVar.b("itemshowtype");
            zVar.e("ispaysubscribe");
            zVar.g(c19807x593d1720.f39014x86965dde.f451376n.f457692q);
            zVar.b("ispaysubscribe");
            int i17 = c19807x593d1720.f39014x86965dde.f451376n.f457682d;
            if (i17 == 5 || i17 == 16) {
                zVar.e("pubtime");
                zVar.g(c19807x593d1720.f39014x86965dde.f451376n.f457687i);
                zVar.b("pubtime");
                zVar.e(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54503x6397ab9d);
                zVar.h(c19807x593d1720.f39014x86965dde.f451376n.f457689n);
                zVar.b(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54503x6397ab9d);
                zVar.e("funcflag");
                zVar.g(c19807x593d1720.f39014x86965dde.f451376n.f457690o);
                zVar.b("funcflag");
                zVar.e("duration");
                zVar.g(c19807x593d1720.f39014x86965dde.f451376n.f457688m);
                zVar.b("duration");
                zVar.e("digest");
                zVar.h(c19807x593d1720.f39014x86965dde.f451376n.f457684f);
                zVar.b("digest");
                zVar.e("cover");
                zVar.h(c19807x593d1720.f39014x86965dde.f451376n.f457691p);
                zVar.b("cover");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19807x593d1720.f39014x86965dde.f451376n.f457689n)) {
                    zVar.e("nativepage");
                    zVar.g(1);
                    zVar.b("nativepage");
                }
                zVar.e("width");
                zVar.g(c19807x593d1720.f39014x86965dde.f451376n.f457685g);
                zVar.b("width");
                zVar.e("height");
                zVar.g(c19807x593d1720.f39014x86965dde.f451376n.f457686h);
                zVar.b("height");
            }
            r45.hh4 hh4Var2 = c19807x593d1720.f39014x86965dde.f451376n;
            if (hh4Var2.f457682d == 8 && hh4Var2.f457693r > 0) {
                zVar.e("piccount");
                zVar.g(c19807x593d1720.f39014x86965dde.f451376n.f457693r);
                zVar.b("piccount");
            }
            zVar.b("mmreadershare");
        }
        if (c19807x593d1720.f39014x86965dde.f451377o != null) {
            new r45.kv2();
            zVar.a(zy2.d5.f(c19807x593d1720.f39014x86965dde.f451377o));
        }
        if (c19807x593d1720.f39014x86965dde.f451385w != null) {
            new r45.xs4();
            zVar.a(zy2.pc.a(c19807x593d1720.f39014x86965dde.f451385w));
        }
        if (c19807x593d1720.f39014x86965dde.f451382t != null) {
            m21.p pVar = new m21.p();
            pVar.f404530a = c19807x593d1720.f39014x86965dde.f451382t;
            zVar.a(pVar.a());
        }
        if (c19807x593d1720.f39014x86965dde.f451378p != null) {
            new r45.mv2();
            zVar.a(zy2.d5.h(c19807x593d1720.f39014x86965dde.f451378p));
        }
        if (c19807x593d1720.f39014x86965dde.f451384v != null) {
            new r45.mv2();
            r45.mv2 mv2Var = c19807x593d1720.f39014x86965dde.f451384v;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zVar.a(zy2.d5.a(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209166c4).mo141623x754a37bb()).r()).intValue(), zy2.d5.h(mv2Var)));
        }
        if (c19807x593d1720.f39014x86965dde.f451387y != null) {
            new r45.mv2();
            zVar.a(zy2.d5.a(4, zy2.d5.h(c19807x593d1720.f39014x86965dde.f451387y)));
        }
        if (c19807x593d1720.f39014x86965dde.C != null) {
            new r45.mv2();
            zVar.a(zy2.d5.a(6, zy2.d5.h(c19807x593d1720.f39014x86965dde.C)));
        }
        if (c19807x593d1720.f39014x86965dde.A != null) {
            new r45.km6();
            r45.km6 shareObj = c19807x593d1720.f39014x86965dde.A;
            ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObj, "shareObj");
            zVar.a(cl4.g.a(shareObj));
        }
        if (c19807x593d1720.f39014x86965dde.f451379q != null) {
            m21.q qVar = new m21.q();
            qVar.f404531a = c19807x593d1720.f39014x86965dde.f451379q;
            zVar.a(qVar.a());
        }
        if (c19807x593d1720.f39014x86965dde.f451381s != null) {
            new r45.g92();
            r45.g92 g92Var = c19807x593d1720.f39014x86965dde.f451381s;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g92Var, "<set-?>");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
            java.lang.String c17 = zy2.d5.c(g92Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "makeContent(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
            zVar.a(c17);
        }
        if (c19807x593d1720.f39014x86965dde.f451380r != null) {
            new r45.dv2();
            zVar.a(zy2.d5.d(c19807x593d1720.f39014x86965dde.f451380r));
        }
        if (c19807x593d1720.f39014x86965dde.f451388z != null) {
            new r45.hd2();
            r45.hd2 hd2Var = c19807x593d1720.f39014x86965dde.f451388z;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hd2Var, "<set-?>");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
            java.lang.String i18 = zy2.d5.i(hd2Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i18, "makeLiveThemeContent(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
            zVar.a(i18);
        }
        if (c19807x593d1720.f39014x86965dde.f451386x != null) {
            new r45.lv2();
            zVar.a(zy2.d5.a(2, zy2.d5.g(c19807x593d1720.f39014x86965dde.f451386x)));
        }
        r45.fd6 fd6Var = c19807x593d1720.f39014x86965dde.B;
        if (fd6Var != null) {
            zVar.e("SpringFestival");
            if (fd6Var.f455776d != null) {
                m21.h hVar = new m21.h();
                hVar.e(fd6Var.f455776d);
                zVar.a(hVar.c());
            }
            zVar.a("<Source>");
            zVar.a(java.lang.String.valueOf(fd6Var.f455777e));
            zVar.a("</Source>");
            zVar.a("<Year>");
            zVar.a(java.lang.String.valueOf(fd6Var.f455778f));
            zVar.a("</Year>");
            zVar.b("SpringFestival");
        }
        if (c19807x593d1720.f39014x86965dde.E != null) {
            new r45.ev2();
            r45.ev2 ev2Var = c19807x593d1720.f39014x86965dde.E;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev2Var, "<set-?>");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeContent", "com.tencent.mm.modelsns.SnsFinderShareCollection");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
            java.lang.String e18 = zy2.d5.e(ev2Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e18, "makeContent(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeContent", "com.tencent.mm.modelsns.SnsFinderShareCollection");
            zVar.a(e18);
        }
        java.util.LinkedList linkedList = c19807x593d1720.f39014x86965dde.H;
        if (linkedList != null && !linkedList.isEmpty()) {
            zVar.e("snsExperiments");
            java.util.Iterator it6 = c19807x593d1720.f39014x86965dde.H.iterator();
            while (it6.hasNext()) {
                r45.q86 q86Var = (r45.q86) it6.next();
                zVar.e("experiment");
                zVar.e(dm.i4.f66865x76d1ec5a);
                zVar.h(c(q86Var.f465295d));
                zVar.b(dm.i4.f66865x76d1ec5a);
                zVar.e("value");
                zVar.h(c(q86Var.f465296e));
                zVar.b("value");
                zVar.b("experiment");
            }
            zVar.b("snsExperiments");
        }
        zVar.b("ContentObject");
        if (c19807x593d1720.f39019x6e5c4c04 != null) {
            zVar.e("actionInfo");
            if (c19807x593d1720.f39019x6e5c4c04.f465089m != null) {
                zVar.e("appMsg");
                zVar.e("mediaTagName");
                zVar.d(c19807x593d1720.f39019x6e5c4c04.f465089m.f461588e);
                zVar.b("mediaTagName");
                zVar.e("messageExt");
                zVar.d(c19807x593d1720.f39019x6e5c4c04.f465089m.f461589f);
                zVar.b("messageExt");
                zVar.e("messageAction");
                zVar.d(c19807x593d1720.f39019x6e5c4c04.f465089m.f461590g);
                zVar.b("messageAction");
                zVar.b("appMsg");
            }
            zVar.b("actionInfo");
        }
        r45.y8 y8Var2 = c19807x593d1720.f39012x33e0f24f;
        if (y8Var2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y8Var2.f472379d)) {
            java.lang.String str2 = c19807x593d1720.f39040xbd345fc4;
            r45.td6 td6Var = new r45.td6();
            if (str2 != null) {
                try {
                    td6Var.mo11468x92b714fd(android.util.Base64.decode(str2, 0));
                } catch (java.lang.Exception unused) {
                }
            }
            r45.rd6 rd6Var = new r45.rd6();
            td6Var.f467864f = rd6Var;
            rd6Var.f466285d = c19807x593d1720.f39012x33e0f24f.f472379d;
            try {
                str2 = android.util.Base64.encodeToString(td6Var.mo14344x5f01b1f6(), 0).replace("\n", "");
            } catch (java.io.IOException e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TimelineConvert", e19, "", new java.lang.Object[0]);
            }
            c19807x593d1720.f39040xbd345fc4 = str2;
        }
        if (c19807x593d1720.f39040xbd345fc4 != null) {
            zVar.e("statExtStr");
            zVar.h(c19807x593d1720.f39040xbd345fc4 + "");
            zVar.b("statExtStr");
        }
        r45.n74 n74Var = c19807x593d1720.f39027xfe1c2a01;
        if (n74Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n74Var.f462663d)) {
            zVar.e("liteApp");
            zVar.e("appId");
            zVar.h(c(c19807x593d1720.f39027xfe1c2a01.f462663d));
            zVar.b("appId");
            zVar.e(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            zVar.h(c(c19807x593d1720.f39027xfe1c2a01.f462664e));
            zVar.b(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            zVar.e("query");
            zVar.h(c(c19807x593d1720.f39027xfe1c2a01.f462665f));
            zVar.b("query");
            zVar.e("istransparent");
            zVar.h(c19807x593d1720.f39027xfe1c2a01.f462666g ? "1" : "0");
            zVar.b("istransparent");
            zVar.b("liteApp");
        }
        r45.ib6 ib6Var = c19807x593d1720.f39043xa1529a15;
        if (ib6Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ib6Var.f458443e)) {
            zVar.e("VideoTemplate");
            if (c19807x593d1720.f39043xa1529a15.f458442d != null) {
                zVar.e("Type");
                zVar.h(c19807x593d1720.f39043xa1529a15.f458442d);
                zVar.b("Type");
            }
            if (c19807x593d1720.f39043xa1529a15.f458443e != null) {
                zVar.e("TemplateId");
                zVar.h(c19807x593d1720.f39043xa1529a15.f458443e);
                zVar.b("TemplateId");
            }
            if (c19807x593d1720.f39043xa1529a15.f458444f != null) {
                zVar.e("MusicId");
                zVar.h(c19807x593d1720.f39043xa1529a15.f458444f);
                zVar.b("MusicId");
            }
            if (!android.text.TextUtils.isEmpty(c19807x593d1720.f39043xa1529a15.f458448m)) {
                zVar.e("AIModelType");
                zVar.h(c19807x593d1720.f39043xa1529a15.f458448m);
                zVar.b("AIModelType");
            }
            zVar.e("VersionInfo");
            zVar.e("IosSdkVersionMin");
            zVar.h(c19807x593d1720.f39043xa1529a15.f458446h + "");
            zVar.b("IosSdkVersionMin");
            zVar.e("AndroidSdkVersionMin");
            zVar.h(c19807x593d1720.f39043xa1529a15.f458445g + "");
            zVar.b("AndroidSdkVersionMin");
            zVar.b("VersionInfo");
            zVar.b("VideoTemplate");
        }
        if (c19807x593d1720.f39025x96ae695c != null) {
            zVar.e("gameshare");
            zVar.e("appbrandext");
            zVar.e("litegameinfo");
            zVar.h(c(c19807x593d1720.f39025x96ae695c.f454604m));
            zVar.b("litegameinfo");
            zVar.e("appbrandpriority");
            zVar.g(c19807x593d1720.f39025x96ae695c.f454605n);
            zVar.b("appbrandpriority");
            zVar.b("appbrandext");
            zVar.e("liteappext");
            zVar.e("liteappbizdata");
            zVar.h(c(c19807x593d1720.f39025x96ae695c.f454602h));
            zVar.b("liteappbizdata");
            zVar.e("liteapppriority");
            zVar.g(c19807x593d1720.f39025x96ae695c.f454603i);
            zVar.b("liteapppriority");
            zVar.b("liteappext");
            zVar.e("gameshareid");
            zVar.h(c(c19807x593d1720.f39025x96ae695c.f454599e));
            zVar.b("gameshareid");
            zVar.e("sharedata");
            zVar.h(c(c19807x593d1720.f39025x96ae695c.f454598d));
            zVar.b("sharedata");
            zVar.e("isvideo");
            zVar.g(c19807x593d1720.f39025x96ae695c.f454600f);
            zVar.b("isvideo");
            zVar.e("duration");
            zVar.g(c19807x593d1720.f39025x96ae695c.f454601g);
            zVar.b("duration");
            zVar.b("gameshare");
        }
        zVar.b("TimelineObject");
        java.lang.String c18 = zVar.c();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(c18, "TimelineObject", null) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pullTimeLineXml", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
            return c18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimelineConvert", "xml is error");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pullTimeLineXml", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        return "";
    }
}
