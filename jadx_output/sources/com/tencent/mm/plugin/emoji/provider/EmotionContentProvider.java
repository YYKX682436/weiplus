package com.tencent.mm.plugin.emoji.provider;

/* loaded from: classes12.dex */
public class EmotionContentProvider extends android.content.ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final android.content.UriMatcher f97610d;

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        f97610d = uriMatcher;
        java.lang.String str = qk.d0.f364065a;
        uriMatcher.addURI(str, "EmojiGroupInfo", 1);
        uriMatcher.addURI(str, "userinfo", 2);
        uriMatcher.addURI(str, "GetEmotionListCache", 3);
        uriMatcher.addURI(str, "EmojiInfo", 4);
        uriMatcher.addURI(str, "EmojiInfoDesc", 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0579, code lost:
    
        if (r1.moveToFirst() != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x057b, code lost:
    
        r13 = new com.tencent.mm.storage.emotion.SmileyPanelConfigInfo();
        r13.convertFrom(r1);
        r0.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x058a, code lost:
    
        if (r1.moveToNext() != false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x058c, code lost:
    
        if (r1 != null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x05a0, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanelConfigInfoStorage", "getSmileyPanelConfigInfoList: %s", java.lang.Integer.valueOf(r0.size()));
        r12.putParcelableArrayList("smiley_panel_info", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x05b7, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x059d, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x059b, code lost:
    
        if (r1 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f2, code lost:
    
        if (r1 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x021f, code lost:
    
        java.lang.System.currentTimeMillis();
        r12.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0225, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x021c, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x021a, code lost:
    
        if (r1 == null) goto L69;
     */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle call(java.lang.String r12, java.lang.String r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 1572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emoji.provider.EmotionContentProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        if (!gm0.j1.i().f273218k || !gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmotionContentProvider", "[delete] kernel or account not init.");
            return 0;
        }
        if (f97610d.match(uri) != 3) {
            return 0;
        }
        return gm0.j1.u().f273153f.delete("GetEmotionListCache", str, strArr);
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        if (!gm0.j1.i().f273218k || !gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmotionContentProvider", "[insert] kernel or account not init.");
            return uri;
        }
        if (f97610d.match(uri) != 3) {
            return uri;
        }
        return android.net.Uri.withAppendedPath(uri, gm0.j1.u().f273153f.l("GetEmotionListCache", z85.w.f470826p.f316953b, contentValues) + "");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmotionContentProvider", "[onCreate]");
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        if (!gm0.j1.i().f273218k || !gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmotionContentProvider", "[query] kernel or account not init.");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmotionContentProvider", "[query] path:%s selection:%s", uri.getPath(), str);
        int match = f97610d.match(uri);
        if (match == 1 || match == 3 || match == 4 || match == 5) {
            return gm0.j1.u().f273153f.f(str, strArr2, 2);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        if (!gm0.j1.i().f273218k || !gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmotionContentProvider", "[update] kernel or account not init.");
            return -1;
        }
        int match = f97610d.match(uri);
        if (match == 1) {
            return gm0.j1.u().f273153f.p("EmojiGroupInfo", contentValues, str, strArr);
        }
        if (match != 2) {
            return -1;
        }
        gm0.j1.u().c().w(((java.lang.Integer) contentValues.get("type")).intValue(), contentValues.get("value"));
        return 0;
    }
}
