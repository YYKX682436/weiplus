package gl3;

/* loaded from: classes11.dex */
public abstract class e {
    public static java.lang.String a() {
        if (d()) {
            ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
            java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc.n.b();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                return b17;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
        return lp0.b.D();
    }

    public static jl3.a b(java.lang.String str) {
        if (!d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            return new jl3.a();
        }
        ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
        ql3.a y07 = ll3.o2.Ai().y0(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc.o.a(str));
        jl3.a aVar = new jl3.a();
        if (y07 != null) {
            aVar.f381738d = y07.f67012x2704a447;
            aVar.f381740f = y07.f67007xf0f83c51;
            aVar.f381739e = y07.f67013x8633264d;
            aVar.f381735a = y07.f66976xa62c5592;
            aVar.f381736b = y07.f66994x9d34c45c;
            aVar.f381737c = y07.f66977x14bfc4a2;
            aVar.f381741g = y07.f66982xcad78313;
        }
        return aVar;
    }

    public static b21.v c(java.lang.String str) {
        if (!d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            return null;
        }
        ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1904x5a0af82.ipc.C16623xdd3b04d4 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc.n.e(str);
        if (e17 == null) {
            return null;
        }
        b21.v vVar = new b21.v();
        vVar.f98901a = e17.f232157d;
        vVar.f98902b = e17.f232158e;
        vVar.f98903c = e17.f232159f;
        vVar.f98905e = e17.f232161h;
        vVar.f98906f = e17.f232160g;
        vVar.f98904d = e17.f232162i;
        vVar.f98907g = e17.f232163m;
        return vVar;
    }

    public static boolean d() {
        return sl3.b.b(gl3.c.class) != null;
    }

    public static void e(java.lang.String str, jl3.a aVar) {
        if (!d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            return;
        }
        ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc.o.a(str);
        ql3.b Ai = ll3.o2.Ai();
        long j17 = aVar.f381738d;
        Ai.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("wifiDownloadedLength", java.lang.Long.valueOf(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s wifiDownloadedLength=%d", java.lang.Integer.valueOf(Ai.f446114e.p("Music", contentValues, "musicId=?", new java.lang.String[]{a17})), a17, java.lang.Long.valueOf(j17));
        ql3.a aVar2 = (ql3.a) ((lt0.f) Ai.f446113d).get(a17);
        if (aVar2 != null) {
            aVar2.f67012x2704a447 = j17;
        }
        ql3.b Ai2 = ll3.o2.Ai();
        int i17 = aVar.f381739e;
        Ai2.getClass();
        android.content.ContentValues contentValues2 = new android.content.ContentValues();
        contentValues2.put("wifiEndFlag", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s wifiEndFlag=%d", java.lang.Integer.valueOf(Ai2.f446114e.p("Music", contentValues2, "musicId=?", new java.lang.String[]{a17})), a17, java.lang.Integer.valueOf(i17));
        ql3.a aVar3 = (ql3.a) ((lt0.f) Ai2.f446113d).get(a17);
        if (aVar3 != null) {
            aVar3.f67013x8633264d = i17;
        }
        ql3.b Ai3 = ll3.o2.Ai();
        long j18 = aVar.f381740f;
        Ai3.getClass();
        android.content.ContentValues contentValues3 = new android.content.ContentValues();
        contentValues3.put("songWifiFileLength", java.lang.Long.valueOf(j18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s songWifiFileLength=%d", java.lang.Integer.valueOf(Ai3.f446114e.p("Music", contentValues3, "musicId=?", new java.lang.String[]{a17})), a17, java.lang.Long.valueOf(j18));
        ql3.a aVar4 = (ql3.a) ((lt0.f) Ai3.f446113d).get(a17);
        if (aVar4 != null) {
            aVar4.f67007xf0f83c51 = j18;
        }
        ql3.b Ai4 = ll3.o2.Ai();
        long j19 = aVar.f381735a;
        Ai4.getClass();
        android.content.ContentValues contentValues4 = new android.content.ContentValues();
        contentValues4.put("downloadedLength", java.lang.Long.valueOf(j19));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s downloadedLength=%d", java.lang.Integer.valueOf(Ai4.f446114e.p("Music", contentValues4, "musicId=?", new java.lang.String[]{a17})), a17, java.lang.Long.valueOf(j19));
        ql3.a aVar5 = (ql3.a) ((lt0.f) Ai4.f446113d).get(a17);
        if (aVar5 != null) {
            aVar5.f66976xa62c5592 = j19;
        }
        ql3.b Ai5 = ll3.o2.Ai();
        int i18 = aVar.f381737c;
        Ai5.getClass();
        android.content.ContentValues contentValues5 = new android.content.ContentValues();
        contentValues5.put("endFlag", java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s endFlag=%d", java.lang.Integer.valueOf(Ai5.f446114e.p("Music", contentValues5, "musicId=?", new java.lang.String[]{a17})), a17, java.lang.Integer.valueOf(i18));
        ql3.a aVar6 = (ql3.a) ((lt0.f) Ai5.f446113d).get(a17);
        if (aVar6 != null) {
            aVar6.f66977x14bfc4a2 = i18;
        }
        ql3.b Ai6 = ll3.o2.Ai();
        long j27 = aVar.f381736b;
        Ai6.getClass();
        android.content.ContentValues contentValues6 = new android.content.ContentValues();
        contentValues6.put("songFileLength", java.lang.Long.valueOf(j27));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s songFileLength=%d", java.lang.Integer.valueOf(Ai6.f446114e.p("Music", contentValues6, "musicId=?", new java.lang.String[]{a17})), a17, java.lang.Long.valueOf(j27));
        ql3.a aVar7 = (ql3.a) ((lt0.f) Ai6.f446113d).get(a17);
        if (aVar7 != null) {
            aVar7.f66994x9d34c45c = j27;
        }
    }

    public static void f(java.lang.String str, java.lang.String str2) {
        if (!d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            return;
        }
        ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc.o.a(str);
        ql3.b Ai = ll3.o2.Ai();
        Ai.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("mimetype", str2);
        Ai.f446114e.p("Music", contentValues, "musicId=?", new java.lang.String[]{a17});
        ql3.a aVar = (ql3.a) ((lt0.f) Ai.f446113d).get(a17);
        if (aVar != null) {
            aVar.f66982xcad78313 = str2;
        }
    }

    public static void g(java.lang.String str, byte[] bArr) {
        if (!d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
        } else {
            ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc.n.k(str, bArr);
        }
    }
}
