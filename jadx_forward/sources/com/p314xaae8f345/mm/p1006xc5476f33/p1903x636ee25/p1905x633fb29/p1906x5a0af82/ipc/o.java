package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc;

/* loaded from: classes7.dex */
public abstract class o {
    public static java.lang.String a(java.lang.String str) {
        b21.r o17 = kl3.t.l().o();
        if (o17 != null && str.equalsIgnoreCase(o17.f98879e)) {
            return xl3.c.a(o17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("0_");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
        return sb6.toString();
    }

    public static b21.v b(java.lang.String str) {
        ql3.c y07 = ll3.o2.Bi().y0(str);
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDataSourceMainProcessImp", "initData pMusic is null!'");
            return null;
        }
        b21.v vVar = new b21.v();
        vVar.f98901a = y07.f66534xc8c6afdb;
        vVar.f98902b = y07.f66535x500f7aaf;
        vVar.f98903c = y07.f66532xf1e8cfcc;
        vVar.f98905e = y07.f66531xeb81a6ba;
        vVar.f98906f = y07.f66536x1308913;
        vVar.f98904d = y07.f66533x2895804a;
        vVar.f98907g = y07.f66537x607a0a64;
        return vVar;
    }

    public static void c(java.lang.String str, java.lang.String str2) {
        ql3.c y07 = ll3.o2.Bi().y0(str);
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDataSourceMainProcessImp", "setMusicMIMETypeByMusicId pMusic is null!'");
            return;
        }
        if (!android.text.TextUtils.isEmpty(y07.f66536x1308913) && y07.f66536x1308913.equals(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDataSourceMainProcessImp", "don't need update the piece file mime type");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicDataSourceMainProcessImp", "updatePieceFileMIMEType()");
        ql3.d Bi = ll3.o2.Bi();
        Bi.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("pieceFileMIMEType", str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceMusicInfoStorage", "updatePieceFileMIMEType raw=%d musicId=%s", java.lang.Integer.valueOf(Bi.f446118e.p("PieceMusicInfo", contentValues, "musicId=?", new java.lang.String[]{str})), str);
        ql3.c cVar = (ql3.c) ((lt0.f) Bi.f446117d).get(str);
        if (cVar != null) {
            cVar.f66536x1308913 = str2;
        }
    }

    public static void d(java.lang.String str, int i17) {
        ql3.d Bi = ll3.o2.Bi();
        Bi.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("fileCacheComplete", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            contentValues.put("removeDirtyBit", (java.lang.Integer) 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceMusicInfoStorage", "updateMusicFileCacheComplete raw=%d musicId=%s fileCacheComplete=%d", java.lang.Integer.valueOf(Bi.f446118e.p("PieceMusicInfo", contentValues, "musicId=?", new java.lang.String[]{str})), str, java.lang.Integer.valueOf(i17));
        ql3.c cVar = (ql3.c) ((lt0.f) Bi.f446117d).get(str);
        if (cVar != null) {
            cVar.f66531xeb81a6ba = i17;
            if (i17 == 1) {
                cVar.f66537x607a0a64 = 1;
            }
        }
    }

    public static void e(java.lang.String str, byte[] bArr) {
        ql3.d Bi = ll3.o2.Bi();
        Bi.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("indexBitData", bArr);
        int p17 = Bi.f446118e.p("PieceMusicInfo", contentValues, "musicId=?", new java.lang.String[]{str});
        if (p17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceMusicInfoStorage", "updateMusicFileIndexBitCache raw=%d musicId=%s", java.lang.Integer.valueOf(p17), str);
        }
        ql3.c cVar = (ql3.c) ((lt0.f) Bi.f446117d).get(str);
        if (cVar != null) {
            cVar.f66533x2895804a = bArr;
        }
    }

    public static java.lang.String f(java.lang.String str) {
        ql3.c y07;
        boolean z17;
        ql3.d Bi = ll3.o2.Bi();
        Bi.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceMusicInfoStorage", "updatePieceMusicByUrl url is empty!");
            y07 = null;
        } else {
            java.lang.String b17 = xl3.c.b(str);
            y07 = Bi.y0(b17);
            if (y07 == null) {
                y07 = new ql3.c();
                z17 = false;
            } else {
                z17 = true;
            }
            y07.f66534xc8c6afdb = b17;
            y07.f66535x500f7aaf = str;
            java.lang.String d17 = xl3.c.d(str);
            y07.f66532xf1e8cfcc = d17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceMusicInfoStorage", "updatePieceMusicByUrl musicId:%s, field_fileName:%s", b17, d17);
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceMusicInfoStorage", "update PieceMusicInfo");
                Bi.mo9952xce0038c9(y07, new java.lang.String[0]);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceMusicInfoStorage", "insert PieceMusicInfo");
                Bi.mo880xb970c2b9(y07);
            }
            ((lt0.f) Bi.f446117d).put(b17, y07);
        }
        if (y07 != null) {
            return y07.f66534xc8c6afdb;
        }
        return null;
    }
}
