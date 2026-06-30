package b92;

/* loaded from: classes10.dex */
public final class n1 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.v1 f18491d;

    public n1(b92.v1 v1Var) {
        this.f18491d = v1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        if (it.what != 999) {
            return true;
        }
        java.lang.Object obj = it.obj;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        b92.v1 v1Var = this.f18491d;
        v1Var.getClass();
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3750g1).getValue()).r()).intValue() == 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveDNSParseService", "startAllLiveDNSParse: switch is off, source=".concat(str));
        } else {
            v1Var.f18523e = android.os.SystemClock.elapsedRealtime();
            pm0.v.O("FinderLiveDNSParseService", new b92.u1(str, v1Var));
        }
        v1Var.Zi("handlerLoop");
        return true;
    }
}
