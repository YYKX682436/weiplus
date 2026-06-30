package ql3;

/* loaded from: classes11.dex */
public class b extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final kk.j f446113d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f446114e;

    /* renamed from: f, reason: collision with root package name */
    public final kk.j f446115f;

    public b(l75.k0 k0Var) {
        super(k0Var, ql3.a.f446104o2, "Music", null);
        this.f446114e = k0Var;
        this.f446113d = new jt0.j(20);
        this.f446115f = new jt0.j(10);
    }

    public void D0(java.lang.String str, boolean z17) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("isBlock", java.lang.Integer.valueOf(z17 ? 1 : 0));
        this.f446114e.p("Music", contentValues, "musicId=?", new java.lang.String[]{str});
        ql3.a aVar = (ql3.a) ((lt0.f) this.f446113d).get(str);
        if (aVar != null) {
            aVar.f66979xef131f3e = z17 ? 1 : 0;
        }
    }

    public ql3.a J0(b21.r rVar) {
        boolean z17;
        java.lang.String a17 = xl3.c.a(rVar);
        ql3.a y07 = y0(a17);
        if (y07 == null) {
            y07 = new ql3.a();
            z17 = false;
        } else {
            z17 = true;
        }
        y07.f66983xc8c6afdb = a17;
        y07.f66986xd6cee995 = rVar.f98879e;
        y07.f66984xb1df81fa = rVar.f98878d;
        java.lang.String str = rVar.f98891t;
        y07.f66974x28d45f97 = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            y07.f66974x28d45f97 = ll3.j2.d(rVar);
        }
        y07.f66989xae75a955 = rVar.f98883i;
        y07.f66991xbe4efa2f = rVar.f98892u;
        y07.f67008x6e8dd380 = rVar.f98885n;
        y07.f67001x79435ae5 = rVar.f98881g;
        y07.f67002x3ed1b556 = rVar.f98882h;
        y07.f67005xdaf47629 = rVar.f98886o;
        y07.f67006x45670355 = rVar.f98887p;
        y07.f66990x8cd5305b = rVar.f98889r;
        y07.f67000x56a01985 = rVar.f98894w;
        y07.f67003xad9ffe9c = rVar.f98896y;
        y07.f66992xe65a7da = rVar.f98884m;
        if (android.text.TextUtils.isEmpty(y07.f66997xaf16cf45) && !android.text.TextUtils.isEmpty(rVar.f98888q)) {
            y07.f66997xaf16cf45 = rVar.f98888q;
        }
        y07.f67004x4075980c = rVar.f98897z;
        if (android.text.TextUtils.isEmpty(y07.f66995x4a6948ee) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f98895x)) {
            y07.f66995x4a6948ee = rVar.f98895x;
        }
        y07.f67011xa783a79b = java.lang.System.currentTimeMillis();
        if (y07.f66996x10603bf5 == 0) {
            java.lang.String[] strArr = xl3.f.f536652a;
            int e17 = xl3.f.e(rVar.f98885n);
            rVar.f98893v = e17;
            if (e17 <= 0) {
                int e18 = xl3.f.e(rVar.f98887p);
                rVar.f98893v = e18;
                if (e18 <= 0) {
                    rVar.f98893v = xl3.f.e(rVar.f98886o);
                }
            }
            if (xl3.f.b(rVar) != null) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String b17 = xl3.f.b(rVar);
                if (b17 != null) {
                    java.lang.String str2 = new java.lang.String(xl3.f.k(b17));
                    int indexOf = str2.indexOf("{");
                    if (indexOf != -1) {
                        str2 = str2.substring(indexOf);
                    }
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                        rVar.f98893v = jSONObject.optInt("song_ID");
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f98881g)) {
                            rVar.f98881g = jSONObject.optString("song_Name");
                        }
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f98886o)) {
                            rVar.f98886o = jSONObject.optString("song_WapLiveURL");
                        }
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f98885n)) {
                            rVar.f98885n = jSONObject.optString("song_WifiURL");
                        }
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f98883i)) {
                            rVar.f98883i = jSONObject.optString("song_Album");
                        }
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f98882h)) {
                            rVar.f98882h = jSONObject.optString("song_Singer");
                        }
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MusicUrlUtil", e19, "", new java.lang.Object[0]);
                    }
                    if (rVar.f98893v == 0) {
                        rVar.f98893v = xl3.f.e(xl3.f.f536653b);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicUrlUtil", "parseBCDForMusicWrapper %s: expend: %d %d", rVar.f98879e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(rVar.f98893v));
                }
            }
            y07.f66996x10603bf5 = rVar.f98893v;
        }
        if (y07.f66999xfba74ece == null) {
            y07.f66999xfba74ece = xl3.f.g(xl3.f.h(rVar));
        }
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07.f67005xdaf47629) || y07.f67005xdaf47629.equals(y07.f67006x45670355)) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07.f67008x6e8dd380)) {
            y07.f67005xdaf47629 = y07.f67008x6e8dd380;
        }
        if (y07.f66996x10603bf5 == 0 && rVar.f98878d == 4) {
            try {
                y07.f66996x10603bf5 = java.lang.Integer.valueOf(rVar.f98879e).intValue();
            } catch (java.lang.Exception unused) {
            }
        }
        y07.f66978xb0040373 = rVar.B;
        y07.f66980x82dd7fed = rVar.C;
        y07.f67010x1bb3b54a = rVar.D;
        y07.f446105g2 = rVar.E;
        y07.f66988xe2cd983d = rVar.F;
        y07.f66975x11fa7749 = rVar.G;
        y07.f66985x494aca3 = rVar.H;
        y07.f67009x61aadf15 = rVar.I;
        y07.f66987x5cf5c0c0 = rVar.K;
        y07.f446107i2 = rVar.R;
        y07.f446108j2 = rVar.T;
        y07.f446109k2 = rVar.U;
        y07.f446110l2 = rVar.V;
        y07.f446111m2 = rVar.M;
        y07.f446112n2 = rVar.N;
        y07.f66981x4b6e6983 = rVar.P;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicStorage", "update music %s", a17);
            mo9952xce0038c9(y07, new java.lang.String[0]);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicStorage", "insert music %s", a17);
            mo880xb970c2b9(y07);
        }
        ((lt0.f) this.f446113d).put(a17, y07);
        return y07;
    }

    public ql3.a L0(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicStorage", "updateMusicWithColor %s %d %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        ql3.a y07 = y0(str);
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicStorage", "updateMusicWithColor can not find music %s", str);
            return null;
        }
        y07.f66993x12571f84 = i17;
        y07.f66998x375331e = i18;
        mo9952xce0038c9(y07, "songBgColor", "songLyricColor");
        ((lt0.f) this.f446113d).put(str, y07);
        return y07;
    }

    public ql3.a P0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, boolean z18) {
        ql3.a y07 = y0(str);
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicStorage", "updateMusicWithLyricResponse can not find music %s", str);
            return null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            y07.f66992xe65a7da = str2;
        }
        y07.f66995x4a6948ee = str3;
        if (!android.text.TextUtils.isEmpty(str4)) {
            y07.f66997xaf16cf45 = str4;
        }
        mo9952xce0038c9(y07, "songAlbumUrl", "songHAlbumUrl", "songLyric");
        ((lt0.f) this.f446113d).put(str, y07);
        z0(y07, z17, z18);
        return y07;
    }

    public ql3.a y0(java.lang.String str) {
        kk.j jVar = this.f446113d;
        if (((lt0.f) jVar).get(str) != null) {
            return (ql3.a) ((lt0.f) jVar).get(str);
        }
        android.database.Cursor f17 = this.f446114e.f(java.lang.String.format("Select * From Music Where musicId=?", new java.lang.Object[0]), new java.lang.String[]{str}, 2);
        if (f17 == null || !f17.moveToFirst()) {
            if (f17 == null) {
                return null;
            }
            f17.close();
            return null;
        }
        ql3.a aVar = new ql3.a();
        aVar.mo9015xbf5d97fd(f17);
        f17.close();
        ((lt0.f) jVar).put(str, aVar);
        return aVar;
    }

    public final ll3.h1 z0(dm.i8 i8Var, boolean z17, boolean z18) {
        ll3.h1 f17 = ll3.h1.f(i8Var.f66997xaf16cf45, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h4r), i8Var.f67004x4075980c, ll3.j2.h(i8Var), i8Var.f67002x3ed1b556, z17, z18);
        ((lt0.f) this.f446115f).put(i8Var.f66983xc8c6afdb, f17);
        return f17;
    }
}
