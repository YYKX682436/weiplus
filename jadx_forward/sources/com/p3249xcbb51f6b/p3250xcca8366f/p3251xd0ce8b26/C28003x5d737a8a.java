package com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26;

/* renamed from: com.tenpay.android.wechat.TenpayTTSUtil */
/* loaded from: classes14.dex */
public class C28003x5d737a8a {

    /* renamed from: sEnabled */
    private static boolean f62979xad6f4b4e = true;

    /* renamed from: sTts */
    private static android.speech.tts.TextToSpeech f62980x359080;

    /* renamed from: checkInit */
    public static void m121653x17bcfa38(android.content.Context context) {
        if (f62980x359080 == null) {
            f62980x359080 = new android.speech.tts.TextToSpeech(context.getApplicationContext(), null);
        }
    }

    /* renamed from: destroy */
    public static void m121654x5cd39ffa() {
        android.speech.tts.TextToSpeech textToSpeech = f62980x359080;
        if (textToSpeech != null) {
            textToSpeech.stop();
            f62980x359080.shutdown();
            f62980x359080 = null;
        }
    }

    /* renamed from: init */
    public static void m121655x316510(android.content.Context context) {
        if (f62980x359080 == null) {
            f62980x359080 = new android.speech.tts.TextToSpeech(context.getApplicationContext(), null);
        }
    }

    /* renamed from: setEnabled */
    public static void m121656x514e147f(boolean z17) {
        f62979xad6f4b4e = z17;
    }

    /* renamed from: speak */
    public static void m121658x688ffd2(java.lang.String str) {
        if (!f62979xad6f4b4e || f62980x359080 == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        f62980x359080.speak(str, 0, null, "UtteranceId");
    }

    /* renamed from: stop */
    public static void m121659x360802() {
        android.speech.tts.TextToSpeech textToSpeech = f62980x359080;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    /* renamed from: speak */
    public static void m121657x688ffd2(java.lang.CharSequence charSequence) {
        if (!f62979xad6f4b4e || f62980x359080 == null || android.text.TextUtils.isEmpty(charSequence)) {
            return;
        }
        f62980x359080.speak(charSequence.toString(), 1, null);
    }
}
