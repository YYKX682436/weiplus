package com.p3249xcbb51f6b.p3253x3f73626a;

/* renamed from: com.tenpay.miniapp.TenpayTTSUtil */
/* loaded from: classes14.dex */
public class C28011x5d737a8a {

    /* renamed from: sEnabled */
    private static boolean f63040xad6f4b4e = true;

    /* renamed from: sTts */
    private static android.speech.tts.TextToSpeech f63041x359080;

    /* renamed from: destroy */
    public static void m121738x5cd39ffa() {
        android.speech.tts.TextToSpeech textToSpeech = f63041x359080;
        if (textToSpeech != null) {
            textToSpeech.stop();
            f63041x359080.shutdown();
            f63041x359080 = null;
        }
    }

    /* renamed from: init */
    public static void m121739x316510(android.content.Context context) {
        if (f63041x359080 == null) {
            f63041x359080 = new android.speech.tts.TextToSpeech(context.getApplicationContext(), null);
        }
    }

    /* renamed from: setEnabled */
    public static void m121740x514e147f(boolean z17) {
        f63040xad6f4b4e = z17;
    }

    /* renamed from: speak */
    public static void m121742x688ffd2(java.lang.String str) {
        if (!f63040xad6f4b4e || f63041x359080 == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        f63041x359080.speak(str, 1, null);
    }

    /* renamed from: stop */
    public static void m121743x360802() {
        android.speech.tts.TextToSpeech textToSpeech = f63041x359080;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    /* renamed from: speak */
    public static void m121741x688ffd2(java.lang.CharSequence charSequence) {
        if (!f63040xad6f4b4e || f63041x359080 == null || android.text.TextUtils.isEmpty(charSequence)) {
            return;
        }
        f63041x359080.speak(charSequence.toString(), 1, null);
    }
}
