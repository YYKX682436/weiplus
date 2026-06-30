package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public abstract class b7 {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #2 {, blocks: (B:11:0x0029, B:13:0x0044, B:19:0x0054), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005a A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri a(android.content.Context r10, java.lang.String r11, android.net.Uri r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.b7.a(android.content.Context, java.lang.String, android.net.Uri):android.net.Uri");
    }

    public static android.net.Uri b(android.content.Context context, long j17, android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        if (android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI.equals(uri) || android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI.equals(uri) || android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.equals(uri) || (android.os.Build.VERSION.SDK_INT >= 29 && (android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI.equals(uri) || android.provider.MediaStore.Files.getContentUri("external").equals(uri)))) {
            return android.net.Uri.withAppendedPath(uri, java.lang.String.valueOf(j17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScopedStorageUtil", "#pathToUri unsupported contentUri: " + uri);
        return null;
    }

    public static android.net.Uri c(android.content.Context context, android.database.Cursor cursor, java.lang.String str, android.net.Uri uri) {
        if (!android.text.TextUtils.isEmpty(str) && uri != null) {
            if (!android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI.equals(uri) && !android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI.equals(uri) && !android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.equals(uri) && (android.os.Build.VERSION.SDK_INT < 29 || (!android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI.equals(uri) && !android.provider.MediaStore.Files.getContentUri("external").equals(uri)))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScopedStorageUtil", "#pathToUri unsupported contentUri: " + uri);
                return null;
            }
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        return android.net.Uri.withAppendedPath(uri, java.lang.String.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("_id"))));
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScopedStorageUtil", th6, "convert uri fail", new java.lang.Object[0]);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x026b, code lost:
    
        if (r11 != null) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029b A[Catch: all -> 0x02ac, TryCatch #2 {all -> 0x02ac, blocks: (B:56:0x019a, B:58:0x01a4, B:61:0x01b2, B:79:0x01d6, B:81:0x01e2, B:83:0x023d, B:85:0x0249, B:87:0x0255, B:88:0x025a, B:92:0x028b, B:100:0x0287, B:110:0x029a, B:109:0x0297, B:111:0x029b, B:113:0x02a7, B:114:0x01f5, B:116:0x0201, B:118:0x0213, B:119:0x022e, B:120:0x0216, B:122:0x021f, B:123:0x0222, B:125:0x022a, B:104:0x0291, B:94:0x026e, B:96:0x0278, B:98:0x0282), top: B:55:0x019a, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0249 A[Catch: all -> 0x02ac, TryCatch #2 {all -> 0x02ac, blocks: (B:56:0x019a, B:58:0x01a4, B:61:0x01b2, B:79:0x01d6, B:81:0x01e2, B:83:0x023d, B:85:0x0249, B:87:0x0255, B:88:0x025a, B:92:0x028b, B:100:0x0287, B:110:0x029a, B:109:0x0297, B:111:0x029b, B:113:0x02a7, B:114:0x01f5, B:116:0x0201, B:118:0x0213, B:119:0x022e, B:120:0x0216, B:122:0x021f, B:123:0x0222, B:125:0x022a, B:104:0x0291, B:94:0x026e, B:96:0x0278, B:98:0x0282), top: B:55:0x019a, inners: #0, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.content.Context r17, java.lang.String r18, android.net.Uri r19, com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 r20) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.b7.d(android.content.Context, java.lang.String, android.net.Uri, com.tencent.mm.sdk.platformtools.y6):void");
    }
}
