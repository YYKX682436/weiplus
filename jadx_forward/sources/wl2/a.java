package wl2;

/* loaded from: classes10.dex */
public final class a extends wl2.d {
    @Override // wl2.d
    public java.lang.String c() {
        return "InnerVersion_Karaoke";
    }

    @Override // wl2.d
    public int d() {
        return 5;
    }

    @Override // wl2.d
    public java.lang.String e() {
        return "LiveKaraokeSdk";
    }

    @Override // wl2.d
    public java.lang.String g() {
        return "KaraokeKTVSoLoader";
    }

    @Override // wl2.d
    public boolean i(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x res) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
        java.lang.String f17 = f(res.c() + "/lib_ktv_so", "live_karaoke", "liblive_karaoke.so");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isUnZipFileExit karaokePath: ");
        sb6.append(f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f528585a, sb6.toString());
        return h(f17);
    }

    @Override // wl2.d
    public wl2.b l(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x res) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
        jz5.l k17 = k(f(res.c() + "/lib_ktv_so", "live_karaoke", "liblive_karaoke.so"));
        java.lang.Object obj = k17.f384366d;
        if (((java.lang.Boolean) obj).booleanValue()) {
            dn0.b.f323359b = true;
            str = "";
        } else {
            str = "KaraokeSoLoadFail_" + ((java.lang.String) k17.f384367e);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f528585a, "loadSoResource loadKaraokeRes: " + k17);
        return new wl2.b(((java.lang.Boolean) obj).booleanValue(), str);
    }
}
