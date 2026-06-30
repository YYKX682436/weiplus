package da4;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f309321a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f309322b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f309323c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f309324d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f309325e;

    /* renamed from: f, reason: collision with root package name */
    public final long f309326f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f309327g;

    /* renamed from: h, reason: collision with root package name */
    public final long f309328h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f309329i;

    /* renamed from: j, reason: collision with root package name */
    public int f309330j;

    /* renamed from: k, reason: collision with root package name */
    public final int f309331k;

    /* renamed from: l, reason: collision with root package name */
    public final int f309332l;

    public i(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, boolean z17, int i17) {
        this.f309330j = 0;
        this.f309331k = 0;
        this.f309321a = str;
        this.f309322b = str2;
        this.f309323c = str3 == null ? "" : str3;
        this.f309324d = str4 == null ? "" : str4;
        this.f309325e = z17;
        this.f309326f = android.os.SystemClock.elapsedRealtime();
        this.f309327g = c17933xe8d1b226;
        this.f309328h = java.lang.System.currentTimeMillis();
        this.f309332l = i17;
    }

    public static da4.i a(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, boolean z17, java.lang.String str5) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
        try {
            da4.i iVar = new da4.i(str, i17, i18, str2, str3, str4, c17933xe8d1b226, z17, str5);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
            return iVar;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
            return null;
        }
    }

    public i(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, boolean z17, java.lang.String str5) {
        this.f309331k = 0;
        this.f309321a = str;
        this.f309330j = i17;
        this.f309331k = i18;
        this.f309322b = str2;
        this.f309323c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? "" : str3;
        this.f309324d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) ? "" : str4;
        this.f309325e = z17;
        this.f309326f = android.os.SystemClock.elapsedRealtime();
        this.f309327g = c17933xe8d1b226;
        this.f309328h = java.lang.System.currentTimeMillis();
        this.f309329i = str5;
    }
}
