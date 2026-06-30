package ka4;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final ka4.n f387680a = new ka4.n();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f387681b;

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enable", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadStrategy", "not enable for can not play online video");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enable", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableTPPlayer", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_enable_sns_tp, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableTPPlayer", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
        if (!fj6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadStrategy", "not enable for can not use tp player");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enable", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            return false;
        }
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_VDIEO_DOWNLOAD_INT_SYNC, 0);
        if (r17 == -2 || r17 == 1 || r17 == 2) {
            z17 = true;
        } else if (r17 != 3) {
            z17 = ka4.o.f387682a.a();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadStrategy", "enable:" + z17 + " lastEnable:" + f387681b);
        if (f387681b != z17) {
            f387681b = z17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.f246306a.d(-1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enable", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
        return z17;
    }

    public final int b(r45.jj4 media) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaIlogo", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        if (android.text.TextUtils.isEmpty(media.f459391g)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaIlogo", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            return 0;
        }
        java.lang.String Url = media.f459391g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url, "Url");
        if (!r26.n0.B(Url, "ilogo", false)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaIlogo", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            return 0;
        }
        try {
            java.lang.String query = new java.net.URI(media.f459391g).getQuery();
            if (query == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaIlogo", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                return 0;
            }
            boolean z17 = true;
            java.util.List f07 = r26.n0.f0(query, new java.lang.String[]{"&"}, false, 0, 6, null);
            int d17 = kz5.b1.d(kz5.d0.q(f07, 10));
            if (d17 < 16) {
                d17 = 16;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
            java.util.Iterator it = f07.iterator();
            while (it.hasNext()) {
                java.util.List f08 = r26.n0.f0((java.lang.String) it.next(), new java.lang.String[]{"="}, false, 0, 6, null);
                linkedHashMap.put((java.lang.String) f08.get(0), java.net.URLDecoder.decode((java.lang.String) f08.get(1), java.nio.charset.StandardCharsets.UTF_8.toString()));
            }
            java.lang.String str = (java.lang.String) linkedHashMap.get("ilogo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("string2Long", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            long j17 = 0;
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("string2Long", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            } else {
                try {
                    j17 = pm0.d.a(str);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Common.Kt", th6, "", new java.lang.Object[0]);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("string2Long", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            }
            int i17 = (int) j17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaIlogo", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            return i17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsVideoDownloadStrategy", e17, "getMediaIlogo error:", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaIlogo", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04a6 A[Catch: Exception -> 0x04e7, TryCatch #1 {Exception -> 0x04e7, blocks: (B:146:0x0330, B:148:0x0336, B:90:0x0391, B:93:0x03ba, B:94:0x03c4, B:96:0x03d8, B:98:0x03e2, B:99:0x03ef, B:102:0x0414, B:105:0x0436, B:108:0x045e, B:113:0x0484, B:115:0x049a, B:117:0x04a6, B:120:0x04b7, B:121:0x04c7, B:124:0x0468, B:128:0x0472, B:129:0x0440, B:133:0x044a, B:135:0x041d, B:139:0x0427, B:140:0x03f9, B:142:0x03ff), top: B:145:0x0330 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04b7 A[Catch: Exception -> 0x04e7, TryCatch #1 {Exception -> 0x04e7, blocks: (B:146:0x0330, B:148:0x0336, B:90:0x0391, B:93:0x03ba, B:94:0x03c4, B:96:0x03d8, B:98:0x03e2, B:99:0x03ef, B:102:0x0414, B:105:0x0436, B:108:0x045e, B:113:0x0484, B:115:0x049a, B:117:0x04a6, B:120:0x04b7, B:121:0x04c7, B:124:0x0468, B:128:0x0472, B:129:0x0440, B:133:0x044a, B:135:0x041d, B:139:0x0427, B:140:0x03f9, B:142:0x03ff), top: B:145:0x0330 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r41, r45.jj4 r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 1529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka4.n.c(com.tencent.mm.plugin.sns.storage.SnsInfo, r45.jj4, boolean):void");
    }
}
