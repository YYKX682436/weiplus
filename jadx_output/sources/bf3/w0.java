package bf3;

/* loaded from: classes5.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bf3.w0 f19672a = new bf3.w0();

    public final boolean a(bf3.s0 s0Var) {
        java.lang.Boolean bool;
        boolean z17;
        java.lang.String str;
        kotlin.jvm.internal.o.g(s0Var, "switch");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean a17 = z65.c.a();
        java.lang.Boolean bool2 = null;
        boolean z19 = s0Var.f19659a;
        e42.b0 b0Var = s0Var.f19660b;
        if (b0Var != null) {
            bool = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(b0Var, z19 ? 1 : 0) == 1);
        } else {
            bool = null;
        }
        if (a17 && (str = s0Var.f19661c) != null) {
            bool2 = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.o4.M("MagicBrushDebugStorage").getBoolean("MagicBrushTestSwitch_".concat(str), z19));
        }
        if (bool2 != null) {
            bool2.booleanValue();
            z17 = bool2.booleanValue();
        } else if (bool != null) {
            bool.booleanValue();
            z17 = bool.booleanValue();
        } else {
            z17 = z19 ? 1 : 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushInternalSwitchMgr", "hy: try get switch " + s0Var + " result is " + z17 + " using " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + ": abtest " + bool + " local " + bool2 + " hasDebugger " + a17 + " default " + z19);
        return z17;
    }
}
