package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public enum z {
    GLOBAL(new java.lang.String[0]),
    FOREGROUND(new java.lang.String[0]),
    BACKGROUND(new java.lang.String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    VOIP("VideoActivity", "VoipCSMainUI", "MultiTalkMainUI", "VoipScoreDialog"),
    /* JADX INFO: Fake field, exist only in values array */
    SNS("Sns.*UI", "SnsOnlineVideoActivity"),
    /* JADX INFO: Fake field, exist only in values array */
    FINDER("Finder.*UI"),
    /* JADX INFO: Fake field, exist only in values array */
    ALBUM_GALLERY("AlbumPreviewUI", "ImagePreviewUI", "ImageGalleryUI"),
    /* JADX INFO: Fake field, exist only in values array */
    STORY("Story.*UI"),
    /* JADX INFO: Fake field, exist only in values array */
    RECORD("MMRecordUI"),
    /* JADX INFO: Fake field, exist only in values array */
    FINDER_LIVE(".*Live.*UI", "NearbyUI"),
    LAUNCHER_BACKGROUND(new java.lang.String[0]);


    /* renamed from: t, reason: collision with root package name */
    public static final int f234690t = Integer.MIN_VALUE >> m67591xcee59d22().length;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f234692d;

    /* renamed from: e, reason: collision with root package name */
    public int f234693e;

    /* renamed from: f, reason: collision with root package name */
    public int f234694f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f234695g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f234696h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f234697i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f234698m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f234699n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f234700o = false;

    z(java.lang.String... strArr) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.y.f234685a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.y.f234685a = i17 + 1;
        this.f234693e = Integer.MIN_VALUE >>> i17;
        this.f234692d = java.util.Arrays.asList(strArr);
    }

    public static java.util.List a(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.z zVar : m67591xcee59d22()) {
            java.util.Iterator it = zVar.f234692d.iterator();
            while (true) {
                if (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    if (!zVar.f234700o && str.matches(str2)) {
                        zVar.name();
                        arrayList.add(zVar);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }
}
