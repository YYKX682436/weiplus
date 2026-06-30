package s50;

/* loaded from: classes12.dex */
public final class g1 implements k23.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f484587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f484588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f484589c;

    public g1(s50.l1 l1Var, java.lang.ref.WeakReference weakReference, k23.v0 v0Var) {
        this.f484587a = l1Var;
        this.f484588b = weakReference;
        this.f484589c = v0Var;
    }

    @Override // k23.v2
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "FloatingVoiceInput onStartPress");
    }

    @Override // k23.v2
    public void b(java.lang.String result, java.lang.String voiceID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceID, "voiceID");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "FloatingVoiceInput onResult: ".concat(result));
        s50.l1.wi(this.f484587a, this.f484588b, result, false, voiceID);
        k23.v0 v0Var = this.f484589c;
        v0Var.w(8, "", result);
        v0Var.w(9, "", result);
    }

    @Override // k23.v2
    /* renamed from: onCancel */
    public void mo63604x3d6f0539() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "FloatingVoiceInput onCancel");
        this.f484587a.Vi(this.f484588b);
    }
}
