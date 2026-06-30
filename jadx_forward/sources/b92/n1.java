package b92;

/* loaded from: classes10.dex */
public final class n1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.v1 f100024d;

    public n1(b92.v1 v1Var) {
        this.f100024d = v1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.what != 999) {
            return true;
        }
        java.lang.Object obj = it.obj;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        b92.v1 v1Var = this.f100024d;
        v1Var.getClass();
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85283g1).mo141623x754a37bb()).r()).intValue() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "startAllLiveDNSParse: switch is off, source=".concat(str));
        } else {
            v1Var.f100056e = android.os.SystemClock.elapsedRealtime();
            pm0.v.O("FinderLiveDNSParseService", new b92.u1(str, v1Var));
        }
        v1Var.Zi("handlerLoop");
        return true;
    }
}
