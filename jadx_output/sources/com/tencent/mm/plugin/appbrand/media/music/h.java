package com.tencent.mm.plugin.appbrand.media.music;

/* loaded from: classes11.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f85761a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f85762b;

    /* renamed from: c, reason: collision with root package name */
    public b21.r f85763c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f85764d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.media.music.g f85765e;

    /* renamed from: f, reason: collision with root package name */
    public int f85766f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f85767g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f85768h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f85769i = new java.util.HashMap();

    public h(com.tencent.mm.plugin.appbrand.media.music.e eVar) {
    }

    public void a(com.tencent.mm.sdk.event.IListener iListener, java.lang.String str) {
        java.util.HashMap hashMap = this.f85769i;
        if (hashMap.get(str) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMusicPlayerManager", "listeners already add appid: %s", str);
        } else {
            iListener.alive();
            hashMap.put(str, iListener);
        }
    }

    public boolean b(java.lang.String str, java.lang.String str2) {
        b21.r b17;
        if (!str2.equalsIgnoreCase(com.tencent.tav.core.AssetExtension.SCENE_PLAY)) {
            return str.equalsIgnoreCase(this.f85761a) && (b17 = b21.m.b()) != null && b17.f17346e.equals(this.f85762b);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMusicPlayerManager", "play option appid %s, pre appid %s", str, this.f85761a);
        return true;
    }

    public boolean c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMusicPlayerManager", "appId is empty");
            return false;
        }
        if (!str.equalsIgnoreCase(this.f85761a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMusicPlayerManager", "appId is not equals pre play id");
            return false;
        }
        if (android.text.TextUtils.isEmpty(this.f85762b)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMusicPlayerManager", "now app not play music");
            return false;
        }
        if (!((this.f85764d == null || this.f85765e == null) ? false : true)) {
            b21.r b17 = b21.m.b();
            if (b17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMusicPlayerManager", "wrapper is null");
                return false;
            }
            if (!this.f85762b.equalsIgnoreCase(b17.f17346e)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMusicPlayerManager", "musicId is diff");
                return false;
            }
            if (b21.m.c()) {
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMusicPlayerManager", "MusicHelper.isPlayingMusic FALSE");
            return false;
        }
        java.lang.String str2 = this.f85762b;
        ((com.tencent.mm.plugin.appbrand.jsapi.audio.p3) this.f85765e).getClass();
        bw5.lp0 uj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).uj();
        java.lang.String b18 = uj6 != null ? uj6.b() : null;
        if (b18 == null) {
            b18 = "";
        }
        if (!str2.equalsIgnoreCase(b18)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMusicPlayerManager", "ting musicId is diff");
            return false;
        }
        ((com.tencent.mm.plugin.appbrand.jsapi.audio.p3) this.f85765e).getClass();
        if (((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).nj()) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMusicPlayerManager", "tingMusicServices.isPlayingMusic FALSE");
        return false;
    }

    public void d(java.lang.String str) {
        com.tencent.mm.sdk.event.IListener iListener = (com.tencent.mm.sdk.event.IListener) this.f85769i.remove(str);
        if (iListener == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMusicPlayerManager", "listeners already remove appid: %s", str);
        } else {
            iListener.dead();
        }
    }
}
