package vy3;

/* loaded from: classes.dex */
public final class n implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vy3.o f523010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f523011e;

    public n(vy3.o oVar, nw4.k kVar) {
        this.f523010d = oVar;
        this.f523011e = kVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSend", "ScanJsApi-Call:send requestCode with MMFragmentActivity: %s, resultCode: %s, data != null: %s", objArr);
        if (i17 == (this.f523010d.hashCode() & 65535) && i18 == -1 && intent != null && intent.getIntExtra("sendResult", -1) == 0) {
            ((ku5.t0) ku5.t0.f394148d).B(new vy3.m(this.f523011e));
        }
    }
}
