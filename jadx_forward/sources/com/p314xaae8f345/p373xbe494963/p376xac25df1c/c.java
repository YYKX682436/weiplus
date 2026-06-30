package com.p314xaae8f345.p373xbe494963.p376xac25df1c;

/* loaded from: classes13.dex */
public final class c extends android.media.AudioManager.AudioPlaybackCallback {

    /* renamed from: a, reason: collision with root package name */
    volatile com.tencent.liteav.audio2.c.a f127786a;

    /* loaded from: classes13.dex */
    public interface a {
        void a();
    }

    public c() {
        android.media.AudioManager audioManager;
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 26 && (audioManager = (android.media.AudioManager) com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getSystemService("audio")) != null) {
            try {
                audioManager.registerAudioPlaybackCallback(this, null);
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("LiteavAudioPlaybackCallback", "register audio playback callback", new java.lang.Object[0]);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("LiteavAudioPlaybackCallback", "register audio playback callback exception " + th6.getMessage(), new java.lang.Object[0]);
            }
        }
    }

    @Override // android.media.AudioManager.AudioPlaybackCallback
    public final void onPlaybackConfigChanged(java.util.List<android.media.AudioPlaybackConfiguration> list) {
        com.tencent.liteav.audio2.c.a aVar = this.f127786a;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }
}
