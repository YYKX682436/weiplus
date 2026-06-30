package nq4;

/* loaded from: classes14.dex */
public final class d extends android.speech.tts.UtteranceProgressListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nq4.a f420540b;

    public d(java.lang.String str, nq4.a aVar) {
        this.f420539a = str;
        this.f420540b = aVar;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onDone(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCallingTTSUtil", "start tts player");
        nq4.e eVar = nq4.e.f420541a;
        yx3.e0 e0Var = new yx3.e0();
        nq4.e.f420546f = e0Var;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        nq4.a aVar = this.f420540b;
        java.lang.String str2 = this.f420539a;
        e0Var.a(context, str2, 0, new nq4.c(aVar, str2));
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onError(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCallingTTSUtil", "UtteranceProgressListener: onError");
        nq4.f fVar = nq4.f.f420547a;
        nq4.f.f420552f = false;
        nq4.a aVar = this.f420540b;
        if (aVar != null) {
            aVar.mo143892xc3989e01();
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onStart(java.lang.String str) {
    }
}
