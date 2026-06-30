package com.tencent.mm.plugin.appbrand.media.music;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.media.music.d f85757c = new com.tencent.mm.plugin.appbrand.media.music.d();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f85758a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public volatile java.lang.String f85759b = "";

    public static boolean a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$IPCQueryPlaying appBrandMusicClientService$IPCQueryPlaying = new com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$IPCQueryPlaying();
        appBrandMusicClientService$IPCQueryPlaying.f85754f = str;
        if (appBrandMusicClientService$IPCQueryPlaying.s()) {
            return appBrandMusicClientService$IPCQueryPlaying.f85755g;
        }
        return false;
    }

    public void b(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMusicClientService", "notifyAction, currentPlayAppId:%s, action:%d", this.f85759b, java.lang.Integer.valueOf(i17));
        for (java.util.Map.Entry entry : this.f85758a.entrySet()) {
            if (entry != null) {
                java.lang.String str = (java.lang.String) entry.getKey();
                com.tencent.mm.plugin.appbrand.media.music.b bVar = (com.tencent.mm.plugin.appbrand.media.music.b) entry.getValue();
                if (!android.text.TextUtils.isEmpty(this.f85759b) && this.f85759b.equalsIgnoreCase(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMusicClientService", "current play music appId is %s", this.f85759b);
                    if (bVar != null) {
                        if (i17 == 10) {
                            ((u81.c) bVar).f425408a.f425432a.s(u81.u.ON_BACKGROUND_AUDIO_PREEMPTED, null);
                        } else if (i17 == 2) {
                            ((u81.c) bVar).f425408a.f425432a.s(u81.u.ON_BACKGROUND_AUDIO_STOPPED, null);
                        } else if (i17 != 7 && i17 == 1) {
                            ((u81.c) bVar).f425408a.f425432a.s(u81.u.ON_BACKGROUND_AUDIO_RESUMED, null);
                        }
                    }
                }
            }
        }
    }

    public boolean c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.equalsIgnoreCase(this.f85759b)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMusicClientService", "appId is diff, can't stop music");
            return false;
        }
        com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$StopBackgroundMusicTask appBrandMusicClientService$StopBackgroundMusicTask = new com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$StopBackgroundMusicTask();
        appBrandMusicClientService$StopBackgroundMusicTask.f85756f = str;
        appBrandMusicClientService$StopBackgroundMusicTask.d();
        return true;
    }
}
