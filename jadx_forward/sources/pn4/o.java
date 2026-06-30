package pn4;

/* loaded from: classes5.dex */
public final class o implements y21.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f438689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f438690b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f438691c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn4.n f438692d;

    public o(java.lang.CharSequence charSequence, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, long j17, pn4.n nVar) {
        this.f438689a = charSequence;
        this.f438690b = f0Var;
        this.f438691c = j17;
        this.f438692d = nVar;
    }

    @Override // y21.a
    public void a() {
    }

    @Override // y21.a
    /* renamed from: onComplete */
    public void mo79464x815f5438() {
    }

    @Override // y21.a
    /* renamed from: onProgress */
    public void mo79465x696ee52c(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechHelper", "onProgress " + f17);
        int ceil = (int) java.lang.Math.ceil((this.f438689a != null ? r0.length() : 0) * f17);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f438690b;
        if (ceil != f0Var.f391649d) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(ceil);
            long j17 = this.f438691c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechHelper", "notify speechIndex:%s, msgId:%s", valueOf, java.lang.Long.valueOf(j17));
            pn4.n nVar = this.f438692d;
            if (nVar != null) {
                nVar.a(ceil, java.lang.Long.valueOf(j17));
            }
            f0Var.f391649d = ceil;
        }
    }
}
