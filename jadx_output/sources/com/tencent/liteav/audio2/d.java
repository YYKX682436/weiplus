package com.tencent.liteav.audio2;

/* loaded from: classes13.dex */
public final class d extends android.media.AudioManager.AudioRecordingCallback {

    /* renamed from: a, reason: collision with root package name */
    volatile com.tencent.liteav.audio2.d.a f46254a;

    /* loaded from: classes13.dex */
    public interface a {
        void OnRecordingConfigChanged(java.util.List<android.media.AudioRecordingConfiguration> list);
    }

    public d() {
        android.media.AudioManager audioManager;
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 24 && (audioManager = (android.media.AudioManager) com.tencent.liteav.base.ContextUtils.getApplicationContext().getSystemService("audio")) != null) {
            try {
                audioManager.registerAudioRecordingCallback(this, null);
                com.tencent.liteav.base.Log.i("LiteavAudioRecordingCallback", "register audio recording callback", new java.lang.Object[0]);
            } catch (java.lang.Throwable th6) {
                com.tencent.liteav.base.Log.e("LiteavAudioRecordingCallback", "register audio recording callback exception " + th6.getMessage(), new java.lang.Object[0]);
            }
        }
    }

    @Override // android.media.AudioManager.AudioRecordingCallback
    public final void onRecordingConfigChanged(java.util.List<android.media.AudioRecordingConfiguration> list) {
        com.tencent.liteav.audio2.d.a aVar = this.f46254a;
        if (aVar == null) {
            return;
        }
        aVar.OnRecordingConfigChanged(list);
    }
}
