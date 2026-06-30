package dr0;

/* loaded from: classes12.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final dr0.y f324109d = new dr0.y();

    public y() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        dr0.u0 reportStage = (dr0.u0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportStage, "$this$reportStage");
        dr0.a3 a17 = dr0.a3.f323936d.a();
        if (!a17.m()) {
            str = "0";
            if (a17.k()) {
                dr0.p1 a18 = dr0.p1.f324022d.a();
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                a18.getClass();
                if (!com.p314xaae8f345.mm.p642xad8b531f.o.f(context)) {
                    str2 = "supported NO: ignoreBattOpt=false";
                } else if (a17.g()) {
                    str2 = "supported YES: hasDebugger";
                } else if (android.os.Build.VERSION.SDK_INT >= 30 && !a17.j()) {
                    str2 = "supported NO: forced splash logo";
                } else if (!a17.l()) {
                    str2 = "supported NO: ban model";
                }
            } else {
                str2 = "supported NO: disabled";
            }
            reportStage.f324091a = kz5.c0.i(str, str2);
            return jz5.f0.f384359a;
        }
        str = "1";
        str2 = "";
        reportStage.f324091a = kz5.c0.i(str, str2);
        return jz5.f0.f384359a;
    }
}
