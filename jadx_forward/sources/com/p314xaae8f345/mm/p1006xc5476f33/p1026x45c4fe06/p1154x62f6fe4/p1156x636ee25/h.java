package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25;

/* loaded from: classes11.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f167294a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f167295b;

    /* renamed from: c, reason: collision with root package name */
    public b21.r f167296c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f167297d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.g f167298e;

    /* renamed from: f, reason: collision with root package name */
    public int f167299f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f167300g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f167301h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f167302i = new java.util.HashMap();

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.e eVar) {
    }

    public void a(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d, java.lang.String str) {
        java.util.HashMap hashMap = this.f167302i;
        if (hashMap.get(str) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMusicPlayerManager", "listeners already add appid: %s", str);
        } else {
            abstractC20980x9b9ad01d.mo48813x58998cd();
            hashMap.put(str, abstractC20980x9b9ad01d);
        }
    }

    public boolean b(java.lang.String str, java.lang.String str2) {
        b21.r b17;
        if (!str2.equalsIgnoreCase(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27)) {
            return str.equalsIgnoreCase(this.f167294a) && (b17 = b21.m.b()) != null && b17.f98879e.equals(this.f167295b);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMusicPlayerManager", "play option appid %s, pre appid %s", str, this.f167294a);
        return true;
    }

    public boolean c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMusicPlayerManager", "appId is empty");
            return false;
        }
        if (!str.equalsIgnoreCase(this.f167294a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMusicPlayerManager", "appId is not equals pre play id");
            return false;
        }
        if (android.text.TextUtils.isEmpty(this.f167295b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMusicPlayerManager", "now app not play music");
            return false;
        }
        if (!((this.f167297d == null || this.f167298e == null) ? false : true)) {
            b21.r b17 = b21.m.b();
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMusicPlayerManager", "wrapper is null");
                return false;
            }
            if (!this.f167295b.equalsIgnoreCase(b17.f98879e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMusicPlayerManager", "musicId is diff");
                return false;
            }
            if (b21.m.c()) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMusicPlayerManager", "MusicHelper.isPlayingMusic FALSE");
            return false;
        }
        java.lang.String str2 = this.f167295b;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.p3) this.f167298e).getClass();
        bw5.lp0 uj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).uj();
        java.lang.String b18 = uj6 != null ? uj6.b() : null;
        if (b18 == null) {
            b18 = "";
        }
        if (!str2.equalsIgnoreCase(b18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMusicPlayerManager", "ting musicId is diff");
            return false;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.p3) this.f167298e).getClass();
        if (((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).nj()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMusicPlayerManager", "tingMusicServices.isPlayingMusic FALSE");
        return false;
    }

    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) this.f167302i.remove(str);
        if (abstractC20980x9b9ad01d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMusicPlayerManager", "listeners already remove appid: %s", str);
        } else {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
    }
}
