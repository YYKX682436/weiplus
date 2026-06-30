package t23;

/* loaded from: classes10.dex */
public class s2 extends t23.f {

    /* renamed from: h, reason: collision with root package name */
    public final android.content.ContentResolver f496797h = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver();

    /* renamed from: i, reason: collision with root package name */
    public final boolean f496798i;

    public s2() {
        com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2507xdbb7bd.C19927x14beea69 c19927x14beea69 = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2507xdbb7bd.C19927x14beea69();
        int h17 = bm5.o1.f104252a.h(c19927x14beea69);
        boolean z17 = true;
        if (h17 != 1 && (h17 == 2 || 1 != ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(c19927x14beea69))) {
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryQueryConfig", "checkEnableQueryDurationValue: local:" + h17 + ", result:" + z17);
        this.f496798i = z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0105 A[LOOP:0: B:13:0x009c->B:32:0x0105, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    @Override // t23.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedList a(java.lang.String r21, int r22, t23.m1 r23, long r24) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.s2.a(java.lang.String, int, t23.m1, long):java.util.LinkedList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r1.moveToFirst() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        r3 = c(r1, 2, "bucket_display_name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r3 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        r2.put(r3.f219951g, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r1.moveToNext() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        r0.addAll(r2.values());
        e(r0);
     */
    @Override // t23.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedList b() {
        /*
            r7 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            android.content.ContentResolver r1 = r7.f496797h     // Catch: java.lang.Exception -> L63
            android.net.Uri r2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Exception -> L63
            java.lang.String[] r3 = r7.j()     // Catch: java.lang.Exception -> L63
            boolean r4 = j33.d0.q()     // Catch: java.lang.Exception -> L63
            if (r4 == 0) goto L15
            r4 = 0
            goto L17
        L15:
            java.lang.String r4 = "0==0) GROUP BY (bucket_display_name"
        L17:
            r5 = 0
            boolean r6 = j33.d0.q()     // Catch: java.lang.Exception -> L63
            if (r6 == 0) goto L21
            java.lang.String r6 = "_id desc"
            goto L23
        L21:
            java.lang.String r6 = "max_time desc, _id desc"
        L23:
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L63
            if (r1 == 0) goto L5d
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L53
            r2.<init>()     // Catch: java.lang.Throwable -> L53
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L5d
        L34:
            java.lang.String r3 = "bucket_display_name"
            r4 = 2
            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem r3 = r7.c(r1, r4, r3)     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L42
            java.lang.String r4 = r3.f219951g     // Catch: java.lang.Throwable -> L53
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L53
        L42:
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L53
            if (r3 != 0) goto L34
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L53
            r0.addAll(r2)     // Catch: java.lang.Throwable -> L53
            r7.e(r0)     // Catch: java.lang.Throwable -> L53
            goto L5d
        L53:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch: java.lang.Exception -> L63
        L5c:
            throw r2     // Catch: java.lang.Exception -> L63
        L5d:
            if (r1 == 0) goto L73
            r1.close()     // Catch: java.lang.Exception -> L63
            goto L73
        L63:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "MicroMsg.VideoMediaQuery"
            java.lang.String r3 = "query album list failed : [%s]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r3, r1)
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.s2.b():java.util.LinkedList");
    }

    @Override // t23.f
    public boolean i() {
        return this.f496798i;
    }

    public java.lang.String[] j() {
        return j33.d0.q() ? new java.lang.String[]{"_id", "_data", "bucket_display_name", "datetaken", "date_modified", "mime_type", "bucket_id"} : new java.lang.String[]{"_id", "_data", "bucket_display_name", "count(*)", "datetaken", "date_modified", "mime_type", "max(date_modified) as max_time", "bucket_id"};
    }

    public java.lang.String k(boolean z17) {
        return z17 ? "datetaken desc, bucket_display_name desc, _id desc" : "date_modified desc, bucket_display_name desc, _id desc";
    }

    public java.lang.String[] l() {
        return this.f496798i ? new java.lang.String[]{"_id", "_data", "datetaken", "date_modified", "mime_type", "latitude", "longitude", "duration"} : new java.lang.String[]{"_id", "_data", "datetaken", "date_modified", "mime_type", "latitude", "longitude"};
    }

    public java.lang.String m(java.lang.String str, boolean z17) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bucket_display_name='");
        sb6.append(str);
        sb6.append("' AND ");
        if (z17) {
            str2 = "(date_modified>" + java.lang.String.valueOf(Integer.MAX_VALUE) + " OR date_modified<=0 )";
        } else {
            str2 = "date_modified<=" + java.lang.String.valueOf(Integer.MAX_VALUE) + " AND date_modified>0";
        }
        sb6.append(str2);
        return sb6.toString();
    }

    public java.lang.String n(java.lang.String[] strArr, boolean z17) {
        java.lang.String str;
        int i17 = 0;
        if (z17) {
            java.lang.String str2 = "(date_modified>" + java.lang.String.valueOf(Integer.MAX_VALUE) + " OR date_modified<=0 ) AND (_size>" + java.lang.String.valueOf(com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb);
            int length = strArr.length;
            while (i17 < length) {
                str2 = str2 + " or lower(_data) like '%" + strArr[i17] + "%'";
                i17++;
            }
            str = str2 + ")";
        } else {
            java.lang.String str3 = "date_modified<=" + java.lang.String.valueOf(Integer.MAX_VALUE) + " AND date_modified>0 AND (_size>" + java.lang.String.valueOf(com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb);
            int length2 = strArr.length;
            while (i17 < length2) {
                str3 = str3 + " or lower(_data) like '%" + strArr[i17] + "%'";
                i17++;
            }
            str = str3 + ")";
        }
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return str;
        }
        return str + " AND is_pending<>1";
    }
}
