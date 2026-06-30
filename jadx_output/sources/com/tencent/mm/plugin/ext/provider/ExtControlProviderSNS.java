package com.tencent.mm.plugin.ext.provider;

/* loaded from: classes12.dex */
public final class ExtControlProviderSNS extends com.tencent.mm.plugin.ext.provider.ExtContentProviderBase {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f99908r = {"feedId", "desc", "url", "nickname", "avatar", com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "mediaCount", "type", "bigImgUrl", "firstImgWidth", "firstImgHeight"};

    /* renamed from: s, reason: collision with root package name */
    public static final android.content.UriMatcher f99909s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f99910t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.b4 f99911u;

    /* renamed from: o, reason: collision with root package name */
    public boolean f99912o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f99913p = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f99914q = "";

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        f99909s = uriMatcher;
        uriMatcher.addURI(com.tencent.mm.sdk.platformtools.x2.f193072b + ".plugin.ext.SNS", "snsInfo", 17);
        f99910t = false;
        f99911u = new com.tencent.mm.sdk.platformtools.b4(new u62.j(), false);
    }

    public static void o(boolean z17) {
        com.tencent.mm.sdk.platformtools.b4 b4Var = f99911u;
        if (!z17) {
            b4Var.c(0L, 0L);
        } else {
            f99910t = true;
            b4Var.c(15000L, 15000L);
        }
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(android.database.Cursor r18, d95.e r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ext.provider.ExtControlProviderSNS.n(android.database.Cursor, d95.e, boolean):void");
    }

    public final boolean p(long j17) {
        com.tencent.mm.storage.z3 p17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderSNS", "startGetSNSInfo, userId=[%s]", java.lang.Long.valueOf(j17));
        if (j17 == 0) {
            p17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).q(c01.z1.r());
        } else {
            p17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).p(j17);
        }
        if (p17 == null || ((int) p17.E2) <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderSNS", "ct == null");
            return false;
        }
        this.f99912o = p17.r2();
        this.f99913p = c01.z1.J(p17.d1());
        v25.b bVar = new v25.b();
        bVar.b(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, new u62.l(this, p17, bVar));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0128, code lost:
    
        if (r0.moveToFirst() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012a, code lost:
    
        n(r0, r11, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0131, code lost:
    
        if (r0.moveToNext() != false) goto L81;
     */
    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.database.Cursor query(android.net.Uri r8, java.lang.String[] r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ext.provider.ExtControlProviderSNS.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}
