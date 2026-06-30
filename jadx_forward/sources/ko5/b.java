package ko5;

/* loaded from: classes14.dex */
public final class b implements android.speech.tts.TextToSpeech.OnInitListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f391628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f391629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f391630c;

    public b(java.lang.String str, java.lang.String str2, yz5.a aVar) {
        this.f391628a = str;
        this.f391629b = str2;
        this.f391630c = aVar;
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPQuickAccept", "init tts engine success and ready to play");
        nq4.e.f420541a.d(this.f391628a, this.f391629b, new ko5.a(this.f391630c));
    }
}
