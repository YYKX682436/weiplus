package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class f3 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.tencent.mm.feature.performance.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
        cr0.o4 o4Var = com.tencent.mm.feature.performance.w1.f67753g;
        if (o4Var == null) {
            throw new java.lang.IllegalStateException("ShellPowerProfiler has not been started!");
        }
        o4Var.a();
        cr0.o4 o4Var2 = com.tencent.mm.feature.performance.w1.f67753g;
        gi.w0 w0Var = o4Var2.f221703c;
        kotlin.jvm.internal.o.d(w0Var);
        qh.b bVar = w0Var.f395330l;
        kotlin.jvm.internal.o.d(bVar);
        gi.w0 w0Var2 = o4Var2.f221703c;
        kotlin.jvm.internal.o.d(w0Var2);
        rh.o2 t17 = w0Var2.t(uh.g.class);
        if (t17 != null) {
            cr0.m4 m4Var = cr0.m4.f221688a;
            cr0.n4 n4Var = new cr0.n4(bVar);
            uh.g gVar = (uh.g) t17.f395486c;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("estimatePower ");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            gi.w0 w0Var3 = o4Var2.f221703c;
            kotlin.jvm.internal.o.d(w0Var3);
            java.lang.String str = w0Var3.f395337s;
            kotlin.jvm.internal.o.f(str, "getScope(...)");
            java.util.Locale US = java.util.Locale.US;
            kotlin.jvm.internal.o.f(US, "US");
            sb7.append(r26.i0.l(str, US));
            sb7.append('-');
            gi.w0 w0Var4 = o4Var2.f221703c;
            kotlin.jvm.internal.o.d(w0Var4);
            java.lang.String z17 = w0Var4.z();
            kotlin.jvm.internal.o.f(z17, "getModuleName(...)");
            sb7.append(r26.i0.l(z17, US));
            sb6.append(sb7.toString());
            sb6.append(": ");
            sb6.append((java.lang.String) m4Var.apply(""));
            sb6.append("cpuPowerAvg=");
            java.lang.Object apply = n4Var.apply(gVar.f427683g.f395552a);
            kotlin.jvm.internal.o.f(apply, "apply(...)");
            sb6.append(((java.lang.Number) apply).doubleValue());
            sb6.append((java.lang.String) m4Var.apply(","));
            sb6.append("wakelocksPowerAvg=");
            java.lang.Object apply2 = n4Var.apply(gVar.f427685h.f395552a);
            kotlin.jvm.internal.o.f(apply2, "apply(...)");
            sb6.append(((java.lang.Number) apply2).doubleValue());
            sb6.append((java.lang.String) m4Var.apply(","));
            sb6.append("mobilePowerAvg=");
            java.lang.Object apply3 = n4Var.apply(gVar.f427687i.f395552a);
            kotlin.jvm.internal.o.f(apply3, "apply(...)");
            sb6.append(((java.lang.Number) apply3).doubleValue());
            sb6.append((java.lang.String) m4Var.apply(","));
            sb6.append("wifiPowerAvg=");
            java.lang.Object apply4 = n4Var.apply(gVar.f427689j.f395552a);
            kotlin.jvm.internal.o.f(apply4, "apply(...)");
            sb6.append(((java.lang.Number) apply4).doubleValue());
            sb6.append((java.lang.String) m4Var.apply(","));
            sb6.append("blueToothPowerAvg=");
            java.lang.Object apply5 = n4Var.apply(gVar.f427691k.f395552a);
            kotlin.jvm.internal.o.f(apply5, "apply(...)");
            sb6.append(((java.lang.Number) apply5).doubleValue());
            sb6.append((java.lang.String) m4Var.apply(","));
            sb6.append("gpsPowerAvg=");
            java.lang.Object apply6 = n4Var.apply(gVar.f427693l.f395552a);
            kotlin.jvm.internal.o.f(apply6, "apply(...)");
            sb6.append(((java.lang.Number) apply6).doubleValue());
            sb6.append((java.lang.String) m4Var.apply(","));
            sb6.append("sensorsPowerAvg=");
            java.lang.Object apply7 = n4Var.apply(gVar.f427695m.f395552a);
            kotlin.jvm.internal.o.f(apply7, "apply(...)");
            sb6.append(((java.lang.Number) apply7).doubleValue());
            sb6.append((java.lang.String) m4Var.apply(","));
            sb6.append("cameraPowerAvg=");
            java.lang.Object apply8 = n4Var.apply(gVar.f427697n.f395552a);
            kotlin.jvm.internal.o.f(apply8, "apply(...)");
            sb6.append(((java.lang.Number) apply8).doubleValue());
            sb6.append((java.lang.String) m4Var.apply(","));
            sb6.append("flashLightPowerAvg=");
            java.lang.Object apply9 = n4Var.apply(gVar.f427699o.f395552a);
            kotlin.jvm.internal.o.f(apply9, "apply(...)");
            sb6.append(((java.lang.Number) apply9).doubleValue());
            sb6.append((java.lang.String) m4Var.apply(","));
            sb6.append("audioPowerAvg=");
            java.lang.Object apply10 = n4Var.apply(gVar.f427701p.f395552a);
            kotlin.jvm.internal.o.f(apply10, "apply(...)");
            sb6.append(((java.lang.Number) apply10).doubleValue());
            sb6.append((java.lang.String) m4Var.apply(","));
            sb6.append("videoPowerAvg=");
            java.lang.Object apply11 = n4Var.apply(gVar.f427703q.f395552a);
            kotlin.jvm.internal.o.f(apply11, "apply(...)");
            sb6.append(((java.lang.Number) apply11).doubleValue());
            sb6.append((java.lang.String) m4Var.apply(","));
            sb6.append("screenPowerAvg=");
            java.lang.Object apply12 = n4Var.apply(gVar.f427705r.f395552a);
            kotlin.jvm.internal.o.f(apply12, "apply(...)");
            sb6.append(((java.lang.Number) apply12).doubleValue());
            sb6.append((java.lang.String) m4Var.apply(","));
            sb6.append("systemServicePowerAvg=");
            java.lang.Object apply13 = n4Var.apply(gVar.f427707s.f395552a);
            kotlin.jvm.internal.o.f(apply13, "apply(...)");
            sb6.append(((java.lang.Number) apply13).doubleValue());
            sb6.append((java.lang.String) m4Var.apply(","));
            sb6.append("idlePowerAvg=");
            java.lang.Object apply14 = n4Var.apply(gVar.f427709t.f395552a);
            kotlin.jvm.internal.o.f(apply14, "apply(...)");
            sb6.append(((java.lang.Number) apply14).doubleValue());
            sb6.append((java.lang.String) m4Var.apply(","));
            sb6.append("totalPowerAvg=");
            java.lang.Object apply15 = n4Var.apply(java.lang.Double.valueOf(gVar.d()));
            kotlin.jvm.internal.o.f(apply15, "apply(...)");
            sb6.append(((java.lang.Number) apply15).doubleValue());
            sb6.append((java.lang.String) m4Var.apply(","));
            sb6.append("capacity=");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            sb6.append(wh.m.f(context));
            sb6.append("");
            com.tencent.mars.xlog.Log.i("ShellPowerProfiler", sb6.toString());
        }
    }
}
