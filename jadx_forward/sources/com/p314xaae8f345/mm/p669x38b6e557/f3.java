package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class f3 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
        cr0.o4 o4Var = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.w1.f149286g;
        if (o4Var == null) {
            throw new java.lang.IllegalStateException("ShellPowerProfiler has not been started!");
        }
        o4Var.a();
        cr0.o4 o4Var2 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.w1.f149286g;
        gi.w0 w0Var = o4Var2.f303236c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w0Var);
        qh.b bVar = w0Var.f476863l;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
        gi.w0 w0Var2 = o4Var2.f303236c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w0Var2);
        rh.o2 t17 = w0Var2.t(uh.g.class);
        if (t17 != null) {
            cr0.m4 m4Var = cr0.m4.f303221a;
            cr0.n4 n4Var = new cr0.n4(bVar);
            uh.g gVar = (uh.g) t17.f477019c;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("estimatePower ");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            gi.w0 w0Var3 = o4Var2.f303236c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w0Var3);
            java.lang.String str = w0Var3.f476870s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getScope(...)");
            java.util.Locale US = java.util.Locale.US;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(US, "US");
            sb7.append(r26.i0.l(str, US));
            sb7.append('-');
            gi.w0 w0Var4 = o4Var2.f303236c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w0Var4);
            java.lang.String z17 = w0Var4.z();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z17, "getModuleName(...)");
            sb7.append(r26.i0.l(z17, US));
            sb6.append(sb7.toString());
            sb6.append(": ");
            sb6.append((java.lang.String) m4Var.mo1850x58b836e(""));
            sb6.append("cpuPowerAvg=");
            java.lang.Object mo1850x58b836e = n4Var.mo1850x58b836e(gVar.f509216g.f477085a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo1850x58b836e, "apply(...)");
            sb6.append(((java.lang.Number) mo1850x58b836e).doubleValue());
            sb6.append((java.lang.String) m4Var.mo1850x58b836e(","));
            sb6.append("wakelocksPowerAvg=");
            java.lang.Object mo1850x58b836e2 = n4Var.mo1850x58b836e(gVar.f509218h.f477085a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo1850x58b836e2, "apply(...)");
            sb6.append(((java.lang.Number) mo1850x58b836e2).doubleValue());
            sb6.append((java.lang.String) m4Var.mo1850x58b836e(","));
            sb6.append("mobilePowerAvg=");
            java.lang.Object mo1850x58b836e3 = n4Var.mo1850x58b836e(gVar.f509220i.f477085a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo1850x58b836e3, "apply(...)");
            sb6.append(((java.lang.Number) mo1850x58b836e3).doubleValue());
            sb6.append((java.lang.String) m4Var.mo1850x58b836e(","));
            sb6.append("wifiPowerAvg=");
            java.lang.Object mo1850x58b836e4 = n4Var.mo1850x58b836e(gVar.f509222j.f477085a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo1850x58b836e4, "apply(...)");
            sb6.append(((java.lang.Number) mo1850x58b836e4).doubleValue());
            sb6.append((java.lang.String) m4Var.mo1850x58b836e(","));
            sb6.append("blueToothPowerAvg=");
            java.lang.Object mo1850x58b836e5 = n4Var.mo1850x58b836e(gVar.f509224k.f477085a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo1850x58b836e5, "apply(...)");
            sb6.append(((java.lang.Number) mo1850x58b836e5).doubleValue());
            sb6.append((java.lang.String) m4Var.mo1850x58b836e(","));
            sb6.append("gpsPowerAvg=");
            java.lang.Object mo1850x58b836e6 = n4Var.mo1850x58b836e(gVar.f509226l.f477085a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo1850x58b836e6, "apply(...)");
            sb6.append(((java.lang.Number) mo1850x58b836e6).doubleValue());
            sb6.append((java.lang.String) m4Var.mo1850x58b836e(","));
            sb6.append("sensorsPowerAvg=");
            java.lang.Object mo1850x58b836e7 = n4Var.mo1850x58b836e(gVar.f509228m.f477085a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo1850x58b836e7, "apply(...)");
            sb6.append(((java.lang.Number) mo1850x58b836e7).doubleValue());
            sb6.append((java.lang.String) m4Var.mo1850x58b836e(","));
            sb6.append("cameraPowerAvg=");
            java.lang.Object mo1850x58b836e8 = n4Var.mo1850x58b836e(gVar.f509230n.f477085a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo1850x58b836e8, "apply(...)");
            sb6.append(((java.lang.Number) mo1850x58b836e8).doubleValue());
            sb6.append((java.lang.String) m4Var.mo1850x58b836e(","));
            sb6.append("flashLightPowerAvg=");
            java.lang.Object mo1850x58b836e9 = n4Var.mo1850x58b836e(gVar.f509232o.f477085a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo1850x58b836e9, "apply(...)");
            sb6.append(((java.lang.Number) mo1850x58b836e9).doubleValue());
            sb6.append((java.lang.String) m4Var.mo1850x58b836e(","));
            sb6.append("audioPowerAvg=");
            java.lang.Object mo1850x58b836e10 = n4Var.mo1850x58b836e(gVar.f509234p.f477085a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo1850x58b836e10, "apply(...)");
            sb6.append(((java.lang.Number) mo1850x58b836e10).doubleValue());
            sb6.append((java.lang.String) m4Var.mo1850x58b836e(","));
            sb6.append("videoPowerAvg=");
            java.lang.Object mo1850x58b836e11 = n4Var.mo1850x58b836e(gVar.f509236q.f477085a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo1850x58b836e11, "apply(...)");
            sb6.append(((java.lang.Number) mo1850x58b836e11).doubleValue());
            sb6.append((java.lang.String) m4Var.mo1850x58b836e(","));
            sb6.append("screenPowerAvg=");
            java.lang.Object mo1850x58b836e12 = n4Var.mo1850x58b836e(gVar.f509238r.f477085a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo1850x58b836e12, "apply(...)");
            sb6.append(((java.lang.Number) mo1850x58b836e12).doubleValue());
            sb6.append((java.lang.String) m4Var.mo1850x58b836e(","));
            sb6.append("systemServicePowerAvg=");
            java.lang.Object mo1850x58b836e13 = n4Var.mo1850x58b836e(gVar.f509240s.f477085a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo1850x58b836e13, "apply(...)");
            sb6.append(((java.lang.Number) mo1850x58b836e13).doubleValue());
            sb6.append((java.lang.String) m4Var.mo1850x58b836e(","));
            sb6.append("idlePowerAvg=");
            java.lang.Object mo1850x58b836e14 = n4Var.mo1850x58b836e(gVar.f509242t.f477085a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo1850x58b836e14, "apply(...)");
            sb6.append(((java.lang.Number) mo1850x58b836e14).doubleValue());
            sb6.append((java.lang.String) m4Var.mo1850x58b836e(","));
            sb6.append("totalPowerAvg=");
            java.lang.Object mo1850x58b836e15 = n4Var.mo1850x58b836e(java.lang.Double.valueOf(gVar.d()));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo1850x58b836e15, "apply(...)");
            sb6.append(((java.lang.Number) mo1850x58b836e15).doubleValue());
            sb6.append((java.lang.String) m4Var.mo1850x58b836e(","));
            sb6.append("capacity=");
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            sb6.append(wh.m.f(context));
            sb6.append("");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShellPowerProfiler", sb6.toString());
        }
    }
}
