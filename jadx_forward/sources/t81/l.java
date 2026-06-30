package t81;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final t81.l f497898a = new t81.l();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f497899b = jz5.h.b(t81.k.f497897d);

    public long a(java.lang.String str) {
        android.database.Cursor query;
        if (str == null || str.length() == 0) {
            return -1L;
        }
        try {
            android.content.ContentResolver contentResolver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver();
            if (contentResolver != null && (query = contentResolver.query((android.net.Uri) ((jz5.n) f497899b).mo141623x754a37bb(), null, "username=?", new java.lang.String[]{str}, null)) != null) {
                try {
                    if (!query.isClosed() && query.moveToFirst()) {
                        t81.h hVar = new t81.h();
                        hVar.mo9015xbf5d97fd(query);
                        long j17 = hVar.f66423x9de75411;
                        vz5.b.a(query, null);
                        return j17;
                    }
                    vz5.b.a(query, null);
                } finally {
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaSyncCmdPersistentContentResolver", "getInvalidContactTimestampForUsername(" + str + ") get exception:" + e17);
        }
        return -1L;
    }
}
