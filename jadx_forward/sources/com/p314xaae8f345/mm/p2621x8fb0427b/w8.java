package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes10.dex */
public class w8 extends l75.a1 implements h90.x {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f277844e = {"CREATE TABLE IF NOT EXISTS  MediaDuplication  (md5 text , size int , path text , createtime long, remuxing text, duration int, status int);", "DROP INDEX IF EXISTS MediaDuplicationMD5Index ", "CREATE INDEX IF NOT EXISTS MD5Index ON MediaDuplication ( md5 )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f277845d;

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef A[Catch: all -> 0x0105, Exception -> 0x0107, TRY_LEAVE, TryCatch #3 {all -> 0x0105, blocks: (B:42:0x00e9, B:44:0x00ef, B:47:0x00f5), top: B:41:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w8(l75.k0 r18) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.w8.<init>(l75.k0):void");
    }

    @Override // l75.a1
    public boolean f() {
        return false;
    }

    public java.lang.String g(java.lang.String str, int i17) {
        int k17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCheckDuplicationStorage", "check  md5:%s size:%d", str, java.lang.Integer.valueOf(i17));
            return "";
        }
        java.lang.String str2 = "select path from MediaDuplication where md5 = '" + str + "' and  size = " + i17 + " and status != 100";
        l75.k0 k0Var = this.f277845d;
        android.database.Cursor f17 = k0Var.f(str2, null, 2);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCheckDuplicationStorage", "check query return null sql:%s", str2);
            return null;
        }
        java.lang.String string = f17.moveToNext() ? f17.getString(0) : "";
        f17.close();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) || (k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(string)) > 0) {
            return string;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaCheckDuplicationStorage", "check file size is zero, delete db record now. path[%s], fileSize[%d], size[%d]", string, java.lang.Integer.valueOf(k17), java.lang.Integer.valueOf(i17));
        k0Var.mo70514xb06685ab("MediaDuplication", "md5=? AND size=? AND status!=?", new java.lang.String[]{str, i17 + "", "100"});
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
    
        if (r15 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cb, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r18.f38869x6ac9171) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d5, code lost:
    
        if (((int) com.p314xaae8f345.mm.vfs.w6.k(r18.f38869x6ac9171)) > 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaCheckDuplicationStorage", "remuxing file size is zero, delete db record now. remuxing path : " + r18.f38869x6ac9171);
        r5.mo70514xb06685ab("MediaDuplication", "md5=? AND size=? AND status=?", new java.lang.String[]{r10, r7 + "", "100"});
        r18.f38869x6ac9171 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0109, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010a, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCheckDuplicationStorage", "check remuxing file success. remuxing path[%s], duration [%d], cost time[%d]", r18.f38869x6ac9171, java.lang.Integer.valueOf(r19.f38864x6ac9171), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0124, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(java.lang.String r17, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 r18, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.w8.h(java.lang.String, com.tencent.mm.pointers.PString, com.tencent.mm.pointers.PInt, java.lang.String):boolean");
    }

    public boolean i(java.lang.String str, int i17, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCheckDuplicationStorage", "insert path is null");
            return false;
        }
        long j17 = i17;
        if (i17 <= 0) {
            j17 = (int) com.p314xaae8f345.mm.vfs.w6.k(str2);
            if (j17 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCheckDuplicationStorage", "insert path insize:%d size:%d  path:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str2);
                return false;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = com.p314xaae8f345.mm.vfs.w6.p(str2);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCheckDuplicationStorage", "insert path read md5 failed  path:%s", str2);
                return false;
            }
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("md5", str);
        contentValues.put("size", java.lang.Long.valueOf(j17));
        contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str2);
        contentValues.put("createtime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        contentValues.put("status", (java.lang.Integer) 101);
        long l17 = this.f277845d.l("MediaDuplication", "", contentValues);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCheckDuplicationStorage", "insert Ret:%d size:%d md5:%s path:%s", java.lang.Long.valueOf(l17), java.lang.Long.valueOf(j17), str, str2);
        return l17 > 0;
    }

    public boolean j(java.lang.String str, java.lang.String str2, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaCheckDuplicationStorage", "insert video remuxing info, but path is null. [%s, %s] ", str, str2);
            return false;
        }
        java.lang.String f17 = bm5.y.f104289i.f(str2, false);
        int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
        int k18 = (int) com.p314xaae8f345.mm.vfs.w6.k(f17);
        if (k17 <= 0 || k18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaCheckDuplicationStorage", "insert video remuxing info, but file size is zero.[%d, %d]", java.lang.Integer.valueOf(k17), java.lang.Integer.valueOf(k18));
            return false;
        }
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaCheckDuplicationStorage", "import file is not null, but md5 is null, path " + str + " size : " + k17);
            return false;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("md5", p17);
        contentValues.put("size", java.lang.Integer.valueOf(k17));
        contentValues.put("createtime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        contentValues.put("remuxing", str2);
        contentValues.put("duration", java.lang.Integer.valueOf(i17));
        contentValues.put("status", (java.lang.Integer) 100);
        long l17 = this.f277845d.l("MediaDuplication", "", contentValues);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCheckDuplicationStorage", "insert video remuxing ret[%d], size[%d], md5[%s], remuxingPath[%s], importPath[%s], duration[%d], cost time[%d]", java.lang.Long.valueOf(l17), java.lang.Integer.valueOf(k17), p17, f17, str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return l17 > 0;
    }
}
