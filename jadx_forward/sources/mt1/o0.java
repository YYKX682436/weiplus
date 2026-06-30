package mt1;

/* loaded from: classes12.dex */
public final class o0 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f412779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412781f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412782g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f412783h;

    public o0(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, long j18) {
        this.f412779d = j17;
        this.f412780e = str;
        this.f412781f = str2;
        this.f412782g = str3;
        this.f412783h = j18;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("migrateFromDownload2Attachment, rowid=");
        long j17 = this.f412779d;
        sb6.append(j17);
        sb6.append(", filePath=");
        java.lang.String str = this.f412780e;
        sb6.append(str);
        sb6.append(", newAttachmentName = ");
        java.lang.String str2 = this.f412781f;
        sb6.append(str2);
        sb6.append(", indexFileName = ");
        java.lang.String str3 = this.f412782g;
        sb6.append(str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DuplicateFileLinkifyLogic", sb6.toString());
        java.lang.String d17 = mt1.q0.f412791a.d(str, "_backup");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("DownloadMigrationError", true);
        ot1.j jVar = mt1.q0.f412792b;
        jVar.f430385g.a();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("originalPath", str);
        contentValues.put("targetPath", str2);
        contentValues.put("status", (java.lang.Integer) 0);
        contentValues.put("indexRowId", java.lang.Long.valueOf(j17));
        long j18 = this.f412783h;
        contentValues.put("msgId", java.lang.Long.valueOf(j18));
        contentValues.put(dm.i4.f66875xa013b0d5, "talker-ignore");
        long T = jVar.f430382d.T("WxFileIndexDownloadMigration", dm.i4.f66865x76d1ec5a, contentValues, false);
        if (com.p314xaae8f345.mm.vfs.w6.d(str, d17, false) < 0) {
            return -101;
        }
        jVar.t3(T, 1);
        if (!com.p314xaae8f345.mm.vfs.w6.x(d17, str2, true)) {
            return -102;
        }
        jVar.t3(T, 2);
        try {
            gm0.j1.u().f354686f.H("appattach", "UPDATE appattach SET fileFullPath=? WHERE msgInfoId=?", new java.lang.Object[]{str2, java.lang.Long.valueOf(j18)});
            jVar.t3(T, 3);
            mt1.b0.f412724a.n().v3(j17, str3);
            jVar.t3(T, 4);
            if (!com.p314xaae8f345.mm.vfs.w6.h(str)) {
                return -105;
            }
            jVar.t3(T, 200);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("DownloadMigrationError", false);
            return 200;
        } catch (java.lang.Exception unused) {
            return -103;
        }
    }
}
