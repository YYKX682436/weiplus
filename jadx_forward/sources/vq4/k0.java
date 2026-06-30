package vq4;

/* loaded from: classes14.dex */
public final class k0 implements android.speech.tts.TextToSpeech.OnInitListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vq4.m0 f520859c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f520861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f520862f;

    public k0(java.lang.String str, java.lang.String str2, vq4.m0 m0Var, java.lang.String str3, boolean z17, boolean z18) {
        this.f520857a = str;
        this.f520858b = str2;
        this.f520859c = m0Var;
        this.f520860d = str3;
        this.f520861e = z17;
        this.f520862f = z18;
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIP.VoIPAudioManager", "init tts engine success and ready to play");
        nq4.e.f420541a.d(this.f520857a, this.f520858b, new vq4.j0(this.f520859c, this.f520860d, this.f520861e, this.f520862f));
    }
}
