package bg;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg.f f19819e;

    public n(bg.f fVar, int i17) {
        this.f19819e = fVar;
        this.f19818d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f19819e;
        java.lang.String A = fVar.A();
        java.lang.String q17 = fVar.q();
        int i17 = this.f19818d;
        com.tencent.mars.xlog.Log.i(A, "*** handler(%s) handleWebViewBackground, type:%d", q17, java.lang.Integer.valueOf(i17));
        fVar.S = true;
        bg.o oVar = new bg.o(fVar, i17);
        com.tencent.mars.xlog.Log.i(fVar.A(), "handleWebViewBackground, abandonFocus");
        fVar.G1.a();
        oVar.run();
    }
}
