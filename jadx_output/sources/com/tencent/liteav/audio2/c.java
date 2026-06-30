package com.tencent.liteav.audio2;

/* loaded from: classes13.dex */
public final class c extends android.media.AudioManager.AudioPlaybackCallback {

    /* renamed from: a, reason: collision with root package name */
    volatile com.tencent.liteav.audio2.c.a f46253a;

    /* loaded from: classes13.dex */
    public interface a {
        void a();
    }

    public c() {
        android.media.AudioManager audioManager;
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 26 && (audioManager = (android.media.AudioManager) com.tencent.liteav.base.ContextUtils.getApplicationContext().getSystemService("audio")) != null) {
            try {
                audioManager.registerAudioPlaybackCallback(this, null);
                com.tencent.liteav.base.Log.i("LiteavAudioPlaybackCallback", "register audio playback callback", new java.lang.Object[0]);
            } catch (java.lang.Throwable th6) {
                com.tencent.liteav.base.Log.e("LiteavAudioPlaybackCallback", "register audio playback callback exception " + th6.getMessage(), new java.lang.Object[0]);
            }
        }
    }

    @Override // android.media.AudioManager.AudioPlaybackCallback
    public final void onPlaybackConfigChanged(java.util.List<android.media.AudioPlaybackConfiguration> list) {
        com.tencent.liteav.audio2.c.a aVar = this.f46253a;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }
}
