package t23;

/* loaded from: classes10.dex */
public class r1 extends t23.f {

    /* renamed from: h, reason: collision with root package name */
    public final android.content.ContentResolver f496787h = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0105 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118 A[LOOP:0: B:13:0x00ae->B:32:0x0118, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    @Override // t23.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedList a(java.lang.String r21, int r22, t23.m1 r23, long r24) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.r1.a(java.lang.String, int, t23.m1, long):java.util.LinkedList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r5.moveToFirst() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r7 = c(r5, 1, "bucket_display_name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r7 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r3.contains(r7.f219948d) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r4.put(r7.f219951g, r7);
        r3.add(r7.f219948d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r4.containsKey(r7.f219951g) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r7.f219953i == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) r4.get(r7.f219951g)).f219953i == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (((int) ((r7.f219953i.f219968m - ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) r4.get(r7.f219951g)).f219953i.f219968m) / 1000)) <= 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        r4.put(r7.f219951g, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (r5.moveToNext() != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    @Override // t23.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedList b() {
        /*
            r12 = this;
            java.lang.String r0 = "query image album list failed : [%s]"
            java.lang.String r1 = "MicroMsg.ImageMediaQuery"
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r5 = 0
            android.content.ContentResolver r6 = r12.f496787h     // Catch: java.lang.Exception -> L37
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Exception -> L37
            java.lang.String[] r8 = r12.j()     // Catch: java.lang.Exception -> L37
            boolean r9 = j33.d0.q()     // Catch: java.lang.Exception -> L37
            if (r9 == 0) goto L24
            r9 = r5
            goto L26
        L24:
            java.lang.String r9 = "0==0) GROUP BY (bucket_display_name"
        L26:
            r10 = 0
            boolean r11 = j33.d0.q()     // Catch: java.lang.Exception -> L37
            if (r11 == 0) goto L30
            java.lang.String r11 = "_id desc"
            goto L32
        L30:
            java.lang.String r11 = "max_time desc, _id desc"
        L32:
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L37
            goto L43
        L37:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0, r6)
        L43:
            if (r5 != 0) goto L47
            goto Lb8
        L47:
            r6 = 1
            boolean r7 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            if (r7 == 0) goto Lb5
        L4e:
            java.lang.String r7 = "bucket_display_name"
            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem r7 = r12.c(r5, r6, r7)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            if (r7 == 0) goto La2
            java.lang.String r8 = r7.f219948d     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            boolean r8 = r3.contains(r8)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            if (r8 != 0) goto L69
            java.lang.String r8 = r7.f219951g     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            r4.put(r8, r7)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r7 = r7.f219948d     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            r3.add(r7)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            goto La2
        L69:
            java.lang.String r8 = r7.f219951g     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            boolean r8 = r4.containsKey(r8)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            if (r8 == 0) goto La2
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r8 = r7.f219953i     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            if (r8 == 0) goto La2
            java.lang.String r8 = r7.f219951g     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.Object r8 = r4.get(r8)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) r8     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r8 = r8.f219953i     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            if (r8 == 0) goto La2
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r8 = r7.f219953i     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r9 = r7.f219951g     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.Object r9 = r4.get(r9)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem r9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) r9     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r9 = r9.f219953i     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            long r10 = r8.f219968m     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            long r8 = r9.f219968m     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            long r10 = r10 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r8
            int r8 = (int) r10     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            if (r8 <= 0) goto La2
            java.lang.String r8 = r7.f219951g     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            r4.put(r8, r7)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            goto La2
        L9e:
            r0 = move-exception
            goto Lcc
        La0:
            r3 = move-exception
            goto La9
        La2:
            boolean r7 = r5.moveToNext()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            if (r7 != 0) goto L4e
            goto Lb5
        La9:
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L9e
            r7 = 0
            r6[r7] = r3     // Catch: java.lang.Throwable -> L9e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0, r6)     // Catch: java.lang.Throwable -> L9e
        Lb5:
            r5.close()
        Lb8:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto Lc8
            java.util.Collection r0 = r4.values()
            r2.addAll(r0)
            java.util.Collections.sort(r2)
        Lc8:
            r12.e(r2)
            return r2
        Lcc:
            r5.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.r1.b():java.util.LinkedList");
    }

    @Override // t23.f
    public boolean i() {
        return false;
    }

    public java.lang.String[] j() {
        return j33.d0.q() ? new java.lang.String[]{"_id", "_data", "bucket_display_name", "datetaken", "date_modified", "mime_type", "bucket_id"} : new java.lang.String[]{"_id", "_data", "bucket_display_name", "count(*)", "datetaken", "date_modified", "mime_type", "max(date_modified) as max_time", "bucket_id"};
    }

    public java.lang.String k(boolean z17) {
        return z17 ? "datetaken desc, bucket_display_name desc, _id desc" : "date_modified desc, bucket_display_name desc, _id desc";
    }

    public java.lang.String[] l() {
        return new java.lang.String[]{"_id", "_data", "datetaken", "date_modified", "mime_type", "latitude", "longitude"};
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
