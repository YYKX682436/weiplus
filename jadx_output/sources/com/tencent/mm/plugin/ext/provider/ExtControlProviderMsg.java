package com.tencent.mm.plugin.ext.provider;

/* loaded from: classes12.dex */
public class ExtControlProviderMsg extends com.tencent.mm.plugin.ext.provider.ExtContentProviderBase {

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f99884t = {"msgId", "fromUserId", "fromUserNickName", "msgType", com.tencent.tmassistantsdk.downloadservice.DownloadInfo.CONTENTTYPE, "content", "status", "createTime"};

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f99885u = {"userId", "unReadCount"};

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f99886v = {"userId", "unReadCount"};

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f99887w = {"userId", "retCode", "msgId"};

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f99888x = {"msgId", "retCode"};

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.String[] f99889y = {"msgId", "retCode"};

    /* renamed from: z, reason: collision with root package name */
    public static final android.content.UriMatcher f99890z;

    /* renamed from: o, reason: collision with root package name */
    public android.database.MatrixCursor f99891o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f99892p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String[] f99893q;

    /* renamed from: r, reason: collision with root package name */
    public int f99894r;

    /* renamed from: s, reason: collision with root package name */
    public android.content.Context f99895s;

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        f99890z = uriMatcher;
        uriMatcher.addURI(com.tencent.mm.sdk.platformtools.y8.b(), "oneMsg", 7);
        uriMatcher.addURI(com.tencent.mm.sdk.platformtools.y8.b(), "unReadCount", 8);
        uriMatcher.addURI(com.tencent.mm.sdk.platformtools.y8.b(), "unReadMsgs", 9);
        uriMatcher.addURI(com.tencent.mm.sdk.platformtools.y8.b(), "unReadUserList", 10);
        uriMatcher.addURI(com.tencent.mm.sdk.platformtools.y8.b(), "recordMsg", 11);
        uriMatcher.addURI(com.tencent.mm.sdk.platformtools.y8.b(), com.tencent.mm.plugin.appbrand.jsapi.audio.v2.NAME, 12);
        uriMatcher.addURI(com.tencent.mm.sdk.platformtools.y8.b(), "setReaded", 13);
        uriMatcher.addURI(com.tencent.mm.sdk.platformtools.y8.b(), "sendTextMsg", 14);
    }

    public ExtControlProviderMsg() {
        this.f99891o = null;
        this.f99892p = false;
        this.f99893q = null;
        this.f99894r = -1;
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0103 A[Catch: Exception -> 0x0152, TryCatch #0 {Exception -> 0x0152, blocks: (B:35:0x00fd, B:37:0x0103, B:39:0x010a, B:42:0x0125, B:45:0x013c, B:50:0x00f5), top: B:49:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a A[Catch: Exception -> 0x0152, TryCatch #0 {Exception -> 0x0152, blocks: (B:35:0x00fd, B:37:0x0103, B:39:0x010a, B:42:0x0125, B:45:0x013c, B:50:0x00f5), top: B:49:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(android.database.MatrixCursor r16, com.tencent.mm.storage.f9 r17, com.tencent.mm.storage.z3 r18, boolean r19, java.lang.String r20, boolean r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg.n(android.database.MatrixCursor, com.tencent.mm.storage.f9, com.tencent.mm.storage.z3, boolean, java.lang.String, boolean, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0318, code lost:
    
        if (r0.moveToFirst() != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x031a, code lost:
    
        r2 = r0.getString(r0.getColumnIndex("talker"));
        r3 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0337, code lost:
    
        if (com.tencent.mm.storage.z3.R4(r2) == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0398, code lost:
    
        if (r0.moveToNext() != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0342, code lost:
    
        if (c01.e2.D(r3.d1()) != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x034c, code lost:
    
        if (com.tencent.mm.storage.z3.l4(r3.d1()) != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0356, code lost:
    
        if (com.tencent.mm.storage.z3.D3(r3.f1()) != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0360, code lost:
    
        if (com.tencent.mm.storage.z3.k4(r3.d1()) != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x036a, code lost:
    
        if (com.tencent.mm.storage.z3.b4(r3.d1()) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x036d, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0370, code lost:
    
        if (r2 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0373, code lost:
    
        r1.addRow(new java.lang.Object[]{com.tencent.mm.plugin.ext.key.AESUtil.b((int) r3.E2), java.lang.Integer.valueOf(r0.getInt(r0.getColumnIndex("unReadCount")))});
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x036f, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x039a, code lost:
    
        r0.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0712  */
    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.database.Cursor query(android.net.Uri r26, java.lang.String[] r27, java.lang.String r28, java.lang.String[] r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    public ExtControlProviderMsg(java.lang.String[] strArr, int i17, android.content.Context context) {
        this.f99891o = null;
        this.f99892p = false;
        this.f99893q = null;
        this.f99892p = true;
        this.f99893q = strArr;
        this.f99894r = i17;
        this.f99895s = context;
    }
}
