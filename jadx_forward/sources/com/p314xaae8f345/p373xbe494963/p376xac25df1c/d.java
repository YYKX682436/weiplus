package com.p314xaae8f345.p373xbe494963.p376xac25df1c;

/* loaded from: classes13.dex */
public final class d extends android.media.AudioManager.AudioRecordingCallback {

    /* renamed from: a, reason: collision with root package name */
    volatile com.tencent.liteav.audio2.d.a f127787a;

    /* loaded from: classes13.dex */
    public interface a {
        /* renamed from: OnRecordingConfigChanged */
        void mo29165xbee0e780(java.util.List<android.media.AudioRecordingConfiguration> list);
    }

    public d() {
        android.media.AudioManager audioManager;
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 24 && (audioManager = (android.media.AudioManager) com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getSystemService("audio")) != null) {
            try {
                audioManager.registerAudioRecordingCallback(this, null);
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("LiteavAudioRecordingCallback", "register audio recording callback", new java.lang.Object[0]);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("LiteavAudioRecordingCallback", "register audio recording callback exception " + th6.getMessage(), new java.lang.Object[0]);
            }
        }
    }

    @Override // android.media.AudioManager.AudioRecordingCallback
    public final void onRecordingConfigChanged(java.util.List<android.media.AudioRecordingConfiguration> list) {
        com.tencent.liteav.audio2.d.a aVar = this.f127787a;
        if (aVar == null) {
            return;
        }
        aVar.mo29165xbee0e780(list);
    }
}
