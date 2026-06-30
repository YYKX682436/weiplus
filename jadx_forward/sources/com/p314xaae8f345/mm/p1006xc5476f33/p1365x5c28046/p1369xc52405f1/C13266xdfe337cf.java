package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1369xc52405f1;

/* renamed from: com.tencent.mm.plugin.emoji.provider.EmotionContentProvider */
/* loaded from: classes12.dex */
public class C13266xdfe337cf extends android.content.ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final android.content.UriMatcher f179143d;

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        f179143d = uriMatcher;
        java.lang.String str = qk.d0.f445598a;
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
    
        r13 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21055x16b9a563();
        r13.mo9015xbf5d97fd(r1);
        r0.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x058a, code lost:
    
        if (r1.moveToNext() != false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x058c, code lost:
    
        if (r1 != null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x05a0, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanelConfigInfoStorage", "getSmileyPanelConfigInfoList: %s", java.lang.Integer.valueOf(r0.size()));
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
        r12.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, r3);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1369xc52405f1.C13266xdfe337cf.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        if (!gm0.j1.i().f354751k || !gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmotionContentProvider", "[delete] kernel or account not init.");
            return 0;
        }
        if (f179143d.match(uri) != 3) {
            return 0;
        }
        return gm0.j1.u().f354686f.mo70514xb06685ab("GetEmotionListCache", str, strArr);
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        if (!gm0.j1.i().f354751k || !gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmotionContentProvider", "[insert] kernel or account not init.");
            return uri;
        }
        if (f179143d.match(uri) != 3) {
            return uri;
        }
        return android.net.Uri.withAppendedPath(uri, gm0.j1.u().f354686f.l("GetEmotionListCache", z85.w.f552359p.f398486b, contentValues) + "");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmotionContentProvider", "[onCreate]");
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        if (!gm0.j1.i().f354751k || !gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmotionContentProvider", "[query] kernel or account not init.");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmotionContentProvider", "[query] path:%s selection:%s", uri.getPath(), str);
        int match = f179143d.match(uri);
        if (match == 1 || match == 3 || match == 4 || match == 5) {
            return gm0.j1.u().f354686f.f(str, strArr2, 2);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        if (!gm0.j1.i().f354751k || !gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmotionContentProvider", "[update] kernel or account not init.");
            return -1;
        }
        int match = f179143d.match(uri);
        if (match == 1) {
            return gm0.j1.u().f354686f.p("EmojiGroupInfo", contentValues, str, strArr);
        }
        if (match != 2) {
            return -1;
        }
        gm0.j1.u().c().w(((java.lang.Integer) contentValues.get("type")).intValue(), contentValues.get("value"));
        return 0;
    }
}
