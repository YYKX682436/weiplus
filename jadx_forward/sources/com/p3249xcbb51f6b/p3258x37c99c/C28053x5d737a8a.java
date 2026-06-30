package com.p3249xcbb51f6b.p3258x37c99c;

/* renamed from: com.tenpay.wphk.TenpayTTSUtil */
/* loaded from: classes14.dex */
public class C28053x5d737a8a {

    /* renamed from: sEnabled */
    private static boolean f65738xad6f4b4e = true;

    /* renamed from: sTts */
    private static android.speech.tts.TextToSpeech f65739x359080;

    /* renamed from: destroy */
    public static void m122163x5cd39ffa() {
        android.speech.tts.TextToSpeech textToSpeech = f65739x359080;
        if (textToSpeech != null) {
            textToSpeech.stop();
            f65739x359080.shutdown();
            f65739x359080 = null;
        }
    }

    /* renamed from: init */
    public static void m122164x316510(android.content.Context context) {
        if (f65739x359080 == null) {
            f65739x359080 = new android.speech.tts.TextToSpeech(context.getApplicationContext(), null);
        }
    }

    /* renamed from: setEnabled */
    public static void m122165x514e147f(boolean z17) {
        f65738xad6f4b4e = z17;
    }

    /* renamed from: speak */
    public static void m122167x688ffd2(java.lang.String str) {
        if (!f65738xad6f4b4e || f65739x359080 == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        f65739x359080.speak(str, 1, null);
    }

    /* renamed from: stop */
    public static void m122168x360802() {
        android.speech.tts.TextToSpeech textToSpeech = f65739x359080;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    /* renamed from: speak */
    public static void m122166x688ffd2(java.lang.CharSequence charSequence) {
        if (!f65738xad6f4b4e || f65739x359080 == null || android.text.TextUtils.isEmpty(charSequence)) {
            return;
        }
        f65739x359080.speak(charSequence.toString(), 1, null);
    }
}
