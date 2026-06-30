package ot1;

/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f430387a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ot1.j f430388b;

    public l(ot1.j jVar, ot1.k kVar) {
        this.f430388b = jVar;
    }

    public void a() {
        if (this.f430387a) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = yv1.b1.f547530e.a();
        if (a17.i("WxFileIndexDownloadMigration_username_column_ensured", false)) {
            this.f430387a = true;
            return;
        }
        synchronized (this) {
            if (this.f430387a) {
                return;
            }
            if (a17.i("WxFileIndexDownloadMigration_username_column_ensured", false)) {
                this.f430387a = true;
                return;
            }
            if (b()) {
                a17.G("WxFileIndexDownloadMigration_username_column_ensured", true);
                this.f430387a = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
    
        if (r4 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0059, code lost:
    
        if (r4 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.WxFileIndexStorage"
            r1 = 0
            ot1.j r2 = r8.f430388b     // Catch: java.lang.Throwable -> L97
            d95.b0 r2 = r2.f430382d     // Catch: java.lang.Throwable -> L97
            r3 = 0
            java.lang.String r4 = "PRAGMA table_info(WxFileIndexDownloadMigration)"
            android.database.Cursor r4 = r2.B(r4, r3)     // Catch: java.lang.Throwable -> L3e
            if (r4 != 0) goto L18
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L5c
        L14:
            r4.close()     // Catch: java.lang.Throwable -> L5c
            goto L5c
        L18:
            java.lang.String r5 = "name"
            int r5 = r4.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L3c
        L1f:
            boolean r6 = r4.moveToNext()     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L39
            if (r5 < 0) goto L2c
            java.lang.String r6 = r4.getString(r5)     // Catch: java.lang.Throwable -> L3c
            goto L2d
        L2c:
            r6 = r3
        L2d:
            java.lang.String r7 = "username"
            boolean r6 = r7.equals(r6)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L1f
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L3c
            goto L14
        L39:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3c
            goto L14
        L3c:
            r5 = move-exception
            goto L41
        L3e:
            r4 = move-exception
            r5 = r4
            r4 = r3
        L41:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r6.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.String r7 = "ensureDownloadMigrationUsernameColumn, PRAGMA failed: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L90
            r6.append(r5)     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L90
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r5)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L5c
            goto L14
        L5c:
            if (r3 != 0) goto L5f
            return r1
        L5f:
            boolean r3 = r3.booleanValue()
            r4 = 1
            if (r3 == 0) goto L6c
            java.lang.String r1 = "ensureDownloadMigrationUsernameColumn, column already exists"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            return r4
        L6c:
            java.lang.String r3 = "WxFileIndexDownloadMigration"
            java.lang.String r5 = "ALTER TABLE WxFileIndexDownloadMigration ADD COLUMN username TEXT"
            r2.A(r3, r5)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "ensureDownloadMigrationUsernameColumn, ALTER TABLE ADD COLUMN username succ"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)     // Catch: java.lang.Throwable -> L79
            return r4
        L79:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ensureDownloadMigrationUsernameColumn, ALTER TABLE failed: "
            r3.<init>(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r2)
            return r1
        L90:
            r0 = move-exception
            if (r4 == 0) goto L96
            r4.close()     // Catch: java.lang.Throwable -> L96
        L96:
            throw r0
        L97:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ensureDownloadMigrationUsernameColumn, getDB failed: "
            r3.<init>(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ot1.l.b():boolean");
    }
}
