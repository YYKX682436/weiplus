package com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1;

/* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderSNS */
/* loaded from: classes12.dex */
public final class C13504x5739900b extends com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f181441r = {"feedId", "desc", "url", "nickname", "avatar", com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "mediaCount", "type", "bigImgUrl", "firstImgWidth", "firstImgHeight"};

    /* renamed from: s, reason: collision with root package name */
    public static final android.content.UriMatcher f181442s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f181443t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f181444u;

    /* renamed from: o, reason: collision with root package name */
    public boolean f181445o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f181446p = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f181447q = "";

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        f181442s = uriMatcher;
        uriMatcher.addURI(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ".plugin.ext.SNS", "snsInfo", 17);
        f181443t = false;
        f181444u = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new u62.j(), false);
    }

    public static void o(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = f181444u;
        if (!z17) {
            b4Var.c(0L, 0L);
        } else {
            f181443t = true;
            b4Var.c(15000L, 15000L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13504x5739900b.n(android.database.Cursor, d95.e, boolean):void");
    }

    public final boolean p(long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 p17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderSNS", "startGetSNSInfo, userId=[%s]", java.lang.Long.valueOf(j17));
        if (j17 == 0) {
            p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).q(c01.z1.r());
        } else {
            p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).p(j17);
        }
        if (p17 == null || ((int) p17.E2) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderSNS", "ct == null");
            return false;
        }
        this.f181445o = p17.r2();
        this.f181446p = c01.z1.J(p17.d1());
        v25.b bVar = new v25.b();
        bVar.b(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, new u62.l(this, p17, bVar));
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
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.database.Cursor query(android.net.Uri r8, java.lang.String[] r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13504x5739900b.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}
