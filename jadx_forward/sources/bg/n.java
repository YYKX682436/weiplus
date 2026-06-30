package bg;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f101351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg.f f101352e;

    public n(bg.f fVar, int i17) {
        this.f101352e = fVar;
        this.f101351d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f101352e;
        java.lang.String A = fVar.A();
        java.lang.String q17 = fVar.q();
        int i17 = this.f101351d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(A, "*** handler(%s) handleWebViewBackground, type:%d", q17, java.lang.Integer.valueOf(i17));
        fVar.S = true;
        bg.o oVar = new bg.o(fVar, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "handleWebViewBackground, abandonFocus");
        fVar.G1.a();
        oVar.run();
    }
}
