package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes14.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static android.speech.tts.TextToSpeech f291814a;

    /* renamed from: b, reason: collision with root package name */
    public static android.media.AudioManager f291815b;

    public static synchronized void a() {
        synchronized (com.p314xaae8f345.mm.ui.p2740x696c9db.b1.class) {
            android.speech.tts.TextToSpeech textToSpeech = f291814a;
            if (textToSpeech != null) {
                textToSpeech.setOnUtteranceProgressListener(null);
                f291814a.stop();
                f291814a.shutdown();
                f291814a = null;
            }
            android.media.AudioManager audioManager = f291815b;
            if (audioManager != null) {
                audioManager.setSpeakerphoneOn(true);
                f291815b.setMode(0);
            }
        }
    }
}
