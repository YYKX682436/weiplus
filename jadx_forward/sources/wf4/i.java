package wf4;

/* loaded from: classes12.dex */
public final class i implements z21.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f527226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wf4.q f527227b;

    public i(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, wf4.q qVar) {
        this.f527226a = h0Var;
        this.f527227b = qVar;
    }

    @Override // z21.b
    public void a(java.lang.String[] strArr, java.util.List list) {
        boolean z17 = true;
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                z17 = false;
            }
        }
        if (z17) {
            return;
        }
        java.lang.String d07 = kz5.z.d0(strArr, "", null, null, 0, null, null, 62, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f527226a;
        h0Var.f391656d = d07;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doGetVoiceTransResultByVoiceInputController onRes latestResultText:" + ((java.lang.String) h0Var.f391656d));
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doGetVoiceTransResultByVoiceInputController onRecognizeFinish endFlag:");
        sb6.append(i17);
        sb6.append(", resultText:");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f527226a;
        sb6.append((java.lang.String) h0Var.f391656d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListenerKtHelper", sb6.toString());
        this.f527227b.b((java.lang.String) h0Var.f391656d);
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ExtTranslateVoiceEventListenerKtHelper", "doGetVoiceTransResultByVoiceInputController onError localCode:" + i17 + ", errType:" + i18 + ", errCode:" + i19);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("VoiceInputController error localCode:");
        sb6.append(i17);
        this.f527227b.d(i18, i19, sb6.toString());
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
    }
}
