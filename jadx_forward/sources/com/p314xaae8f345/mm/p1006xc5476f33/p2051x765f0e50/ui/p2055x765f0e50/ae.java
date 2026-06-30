package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae f242345a = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ae();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f242346b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f242347c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f242348d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f242349e = "";

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f242350f = "";

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f242351g = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f242352h = "";

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f242353i = "";

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f242354j = "";

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f242355k = "";

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f242356l = "";

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f242357m = "";

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f242358n = "";

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f242359o = "";

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.String f242360p = "";

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f242361q = "";

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f242362r = "";

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.String f242363s = "";

    public final r26.t a(java.lang.String str, int i17, boolean z17) {
        if (i17 == 1 || i17 == 3 || i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsHearingAidResourceManager", "createHearingModelSelectorPattern: level is not 1, 3 or 5");
            return new r26.t("");
        }
        if (z17) {
            return new r26.t("HearingModelSelector_" + str + "_SNR_NA_AUD(\\d+)\\.wav");
        }
        return new r26.t("HearingModelSelector_" + str + "_SNR_L" + i17 + "_AUD(\\d+)\\.wav");
    }

    public final java.lang.Integer b(java.lang.String str, r26.t tVar) {
        r26.l lVar;
        r26.k e17;
        java.lang.String str2;
        r26.m b17 = tVar.b(str, 0);
        if (b17 == null || (lVar = ((r26.q) b17).f450444c) == null || (e17 = ((r26.p) lVar).e(1)) == null || (str2 = e17.f450433a) == null) {
            return null;
        }
        return java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2));
    }

    public final java.io.File[] c(java.lang.String str, int i17, boolean z17) {
        java.io.File file = new java.io.File(com.p314xaae8f345.mm.vfs.q7.c("care_mode_hearing_aid"));
        java.io.File[] listFiles = file.listFiles(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yd(a(str, i17, z17)));
        if (listFiles == null) {
            listFiles = new java.io.File[0];
        }
        if (listFiles.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsHearingAidResourceManager", "No matching files found in the directory: " + file.getPath());
            return new java.io.File[0];
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidResourceManager", "getHearingAidModelSelectorFilesArray files count is : " + listFiles.length);
        return listFiles;
    }

    public final java.io.File[] d(int i17) {
        java.io.File file = new java.io.File(com.p314xaae8f345.mm.vfs.q7.c("care_mode_hearing_aid"));
        java.io.File[] listFiles = file.listFiles(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.zd(new r26.t("HearingLevelDetection_YS_SNR_L" + i17 + "_AUD(\\d+)\\.wav")));
        if (listFiles == null) {
            listFiles = new java.io.File[0];
        }
        if (listFiles.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsHearingAidResourceManager", "No matching files found in the directory: " + file.getPath());
            return new java.io.File[0];
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidResourceManager", "getTestDisableFilesArray files count is : " + listFiles.length);
        return listFiles;
    }
}
