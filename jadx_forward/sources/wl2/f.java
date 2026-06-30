package wl2;

/* loaded from: classes10.dex */
public final class f extends wl2.d {
    @Override // wl2.d
    public java.lang.String c() {
        return "InnerVersion";
    }

    @Override // wl2.d
    public int d() {
        return 3;
    }

    @Override // wl2.d
    public java.lang.String e() {
        return "LiveKtvSdk";
    }

    @Override // wl2.d
    public java.lang.String g() {
        return "TMEKTVSoLoader";
    }

    @Override // wl2.d
    public boolean i(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x res) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
        java.lang.String str = res.c() + "/lib_ktv_so";
        java.lang.String f17 = f(str, "libktv/lib_singscore-release", "libsingscore.so");
        java.lang.String f18 = f(str, "libktv/lib_singreverb-release", "libsingreverb.so");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f528585a, "isUnZipFileExit scorePath: " + f17 + " reverbPath: " + f18);
        return h(f17) && h(f18);
    }

    @Override // wl2.d
    public wl2.b l(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x res) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
        java.lang.String str2 = res.c() + "/lib_ktv_so";
        jz5.l k17 = k(f(str2, "libktv/lib_singscore-release", "libsingscore.so"));
        java.lang.Object obj = k17.f384366d;
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65793x233c02ec.getClass();
            oy5.f.f431627b = true;
            com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65794x141089db = true;
            str = "";
        } else {
            str = "ScoreSoLoadFail_" + ((java.lang.String) k17.f384367e);
        }
        jz5.l k18 = k(f(str2, "libktv/lib_singreverb-release", "libsingreverb.so"));
        java.lang.Object obj2 = k18.f384366d;
        if (((java.lang.Boolean) obj2).booleanValue()) {
            com.tme.p3259xc83515e4.p3261x90efbf1b.C28055x95510192.f65740x233c02ec.getClass();
            com.tme.p3259xc83515e4.p3261x90efbf1b.C28055x95510192.f65741x141089db = true;
            ny5.d.f423012b = true;
        } else {
            if (str.length() > 0) {
                str = str + '\n';
            }
            str = str + "ReverbSoLoadFail" + ((java.lang.String) k18.f384367e);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f528585a, "loadSoResource loadScoreRes: " + k17 + " loadReverbRes: " + k18);
        return new wl2.b(((java.lang.Boolean) obj).booleanValue() && ((java.lang.Boolean) obj2).booleanValue(), str);
    }
}
