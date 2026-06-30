package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1;

/* renamed from: com.tencent.mm.plugin.music.player.base.AudioPlayerUtils$DefaultMusicLoadLibrary */
/* loaded from: classes12.dex */
class C16627x78a2dbe7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.j {

    /* renamed from: soLoaded */
    private final java.util.HashMap<java.lang.String, java.lang.Boolean> f37697x21f4f581;

    private C16627x78a2dbe7() {
        this.f37697x21f4f581 = new java.util.HashMap<>();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.j
    /* renamed from: checkLoaded */
    public boolean mo67213x21901b2d(java.lang.String str) {
        return this.f37697x21f4f581.containsKey(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.j
    /* renamed from: findLibPath */
    public java.lang.String mo67214x3bad2051(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerUtils", "findLibPath %s", str);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerUtils", "LoadLibrary lib_name is null");
            return false;
        }
        if (this.f37697x21f4f581.containsKey(str) && this.f37697x21f4f581.get(str).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerUtils", "LoadLibrary lib_name %s is loaded", str);
            return true;
        }
        if (((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.d.f232189d).contains(str)) {
            fp.d0.o(str);
        } else {
            fp.d0.n(str);
        }
        this.f37697x21f4f581.put(str, java.lang.Boolean.TRUE);
        return true;
    }

    public /* synthetic */ C16627x78a2dbe7(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.a aVar) {
        this();
    }
}
