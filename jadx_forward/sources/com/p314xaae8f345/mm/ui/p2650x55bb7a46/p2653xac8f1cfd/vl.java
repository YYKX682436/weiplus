package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes14.dex */
public final class vl implements android.speech.tts.TextToSpeech.OnInitListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm f281668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f281669b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f281670c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f281671d;

    public vl(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm fmVar, yb5.d dVar, long j17, java.util.ArrayList arrayList) {
        this.f281668a = fmVar;
        this.f281669b = dVar;
        this.f281670c = j17;
        this.f281671d = arrayList;
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i17) {
        android.speech.tts.TextToSpeech textToSpeech;
        if (i17 != 0 || (textToSpeech = com.p314xaae8f345.mm.ui.p2740x696c9db.b1.f291814a) == null) {
            return;
        }
        textToSpeech.setOnUtteranceProgressListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ul(this.f281668a, this.f281669b, this.f281670c, this.f281671d));
    }
}
