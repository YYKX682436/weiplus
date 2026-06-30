package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1908xc53e9ae1;

/* renamed from: com.tencent.mm.plugin.music.model.player.WechatMusicLoadLibrary */
/* loaded from: classes12.dex */
public class C16626x55d318f6 implements com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.j {
    private static final java.lang.String TAG = "MicroMsg.Music.WechatMusicLoadLibrary";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.j
    /* renamed from: checkLoaded */
    public boolean mo67213x21901b2d(java.lang.String str) {
        return fp.d0.d(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.j
    /* renamed from: findLibPath */
    public java.lang.String mo67214x3bad2051(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "findLibPath %s", str);
        if (!((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.d.f232189d).contains(str)) {
            return fp.d0.g(str);
        }
        java.util.Set set = fp.d0.f346699a;
        return fp.d0.h(str, fp.b0.f346696a);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.j
    /* renamed from: load */
    public boolean mo67215x32c4e6(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "LoadLibrary lib_name is null");
            return false;
        }
        if (fp.d0.d(str)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "load library %s", str);
        boolean contains = ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.d.f232189d).contains(str);
        java.lang.String h17 = contains ? fp.d0.h(str, fp.b0.f346696a) : fp.d0.g(str);
        if (android.text.TextUtils.isEmpty(h17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "LoadLibrary can't find the lib %s so", str);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "LoadLibrary find and load the lib %s so", h17);
        if (contains) {
            fp.d0.o(str);
        } else {
            fp.d0.n(str);
        }
        return true;
    }
}
