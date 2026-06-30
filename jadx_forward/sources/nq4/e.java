package nq4;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static android.speech.tts.TextToSpeech f420543c;

    /* renamed from: f, reason: collision with root package name */
    public static yx3.e0 f420546f;

    /* renamed from: a, reason: collision with root package name */
    public static final nq4.e f420541a = new nq4.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f420542b = (lp0.b.X() + "app_ringtone") + '/';

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f420544d = true;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f420545e = new java.util.concurrent.atomic.AtomicBoolean(false);

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCallingTTSUtil", "destory tts player");
        android.speech.tts.TextToSpeech textToSpeech = f420543c;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        yx3.e0 e0Var = f420546f;
        if (e0Var != null) {
            m8.i0 i0Var = e0Var.f549435a;
            if (i0Var != null) {
                i0Var.n();
            }
            m8.i0 i0Var2 = e0Var.f549435a;
            if (i0Var2 != null) {
                i0Var2.mo146927x41012807();
            }
        }
        f420546f = null;
        android.speech.tts.TextToSpeech textToSpeech2 = f420543c;
        if (textToSpeech2 != null) {
            textToSpeech2.shutdown();
        }
        f420543c = null;
    }

    public final java.lang.String b() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    public final void c(android.content.Context ctx, android.speech.tts.TextToSpeech.OnInitListener listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        if (f420543c == null) {
            f420543c = new android.speech.tts.TextToSpeech(ctx.getApplicationContext(), listener);
        } else {
            listener.onInit(0);
        }
    }

    public final void d(java.lang.String id6, java.lang.String str, nq4.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        if (f420543c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPCallingTTSUtil", "TextToSpeech object is null");
        }
        nq4.e eVar = f420541a;
        java.lang.String b17 = eVar.b();
        if (!java.lang.Boolean.valueOf(!(b17 == null || b17.length() == 0) && (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "zh_CN") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "zh_TW") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "zh_HK") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "en"))).booleanValue() || f420543c == null) {
            java.lang.String b18 = b();
            nq4.f fVar = nq4.f.f420547a;
            nq4.f.f420552f = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPCallingTTSUtil", "current language environment not support tts " + b18);
            a();
            if (aVar != null) {
                aVar.mo143892xc3989e01();
                return;
            }
            return;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f420545e;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        boolean z17 = f420544d;
        if (!z17 || f420543c == null || android.text.TextUtils.isEmpty(str)) {
            nq4.f fVar2 = nq4.f.f420547a;
            nq4.f.f420552f = false;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("not allow to play tts cause ");
            sb6.append(z17);
            sb6.append(" && ");
            sb6.append(f420543c);
            sb6.append(" != null && ");
            sb6.append(!android.text.TextUtils.isEmpty(str));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPCallingTTSUtil", sb6.toString());
            a();
            if (aVar != null) {
                aVar.mo143892xc3989e01();
                return;
            }
            return;
        }
        java.lang.String b19 = b();
        if (b19 == null) {
            b19 = "null";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCallingTTSUtil", "Transfer " + str + " to TTS");
        java.lang.String str2 = f420542b + r26.i0.u(id6, '#', (char) 8205, false, 4, null) + '_' + b19 + ".wav";
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCallingTTSUtil", "start tts player");
            yx3.e0 e0Var = new yx3.e0();
            f420546f = e0Var;
            e0Var.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str2, 0, new nq4.b(aVar, str2));
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.e(str2);
        android.speech.tts.TextToSpeech textToSpeech = f420543c;
        if (textToSpeech != null) {
            textToSpeech.setOnUtteranceProgressListener(new nq4.d(str2, aVar));
        }
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        hashMap.put("utteranceId", "utterance");
        android.speech.tts.TextToSpeech textToSpeech2 = f420543c;
        if (textToSpeech2 != null) {
            textToSpeech2.setLanguage(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.s(eVar.b()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCallingTTSUtil", "tts set language: " + textToSpeech2.getLanguage());
            textToSpeech2.synthesizeToFile(str, hashMap, str2);
        }
    }
}
