package ui1;

/* loaded from: classes7.dex */
public class t {

    /* renamed from: d, reason: collision with root package name */
    public static final ui1.p f509615d = new ui1.p(null);

    /* renamed from: a, reason: collision with root package name */
    public final ui1.r f509616a;

    /* renamed from: b, reason: collision with root package name */
    public final ui1.a0 f509617b;

    /* renamed from: c, reason: collision with root package name */
    public final int f509618c;

    public t(ui1.r rVar, ui1.a0 a0Var) {
        this.f509616a = new ui1.f(this, rVar, a0Var);
        this.f509617b = a0Var;
        this.f509618c = a0Var.f509558a.t3().f156338p.f158814g;
    }

    public static void a(ui1.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0 c0Var, r45.h24 h24Var) {
        ui1.a0 a0Var = tVar.f509617b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = a0Var.f509558a;
        java.lang.String mo48798x74292566 = yVar.mo48798x74292566();
        java.lang.String str = a0Var.f509559b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = yVar.t3();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, appId %s, api %s, checkAuth Response.errcode %d", mo48798x74292566, str, java.lang.Integer.valueOf(h24Var.f457306d.f459024d));
        r45.j14 j14Var = h24Var.f457306d;
        int i17 = j14Var.f459024d;
        ui1.r rVar = tVar.f509616a;
        if (i17 == 0) {
            f509615d.e(mo48798x74292566, str);
            ((ui1.f) rVar).a();
            return;
        }
        if (i17 != -12000) {
            int i18 = j14Var.f459026f;
            if (i18 == 0) {
                rVar.b(j14Var.f459025e);
                return;
            } else {
                ((ui1.f) rVar).c(i18, j14Var.f459025e);
                return;
            }
        }
        r45.jv5 jv5Var = (r45.jv5) h24Var.f457307e.get(0);
        if (jv5Var == null) {
            rVar.b(null);
            return;
        }
        if ((t37 instanceof ze.n) && ((ze.n) t37).Z1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, is headless mode");
            ((ui1.f) rVar).mo32123x3d6f0539();
            return;
        }
        java.lang.String str2 = h24Var.f457312m;
        java.lang.String str3 = h24Var.f457311i;
        java.lang.String str4 = h24Var.f457310h;
        java.lang.String str5 = jv5Var.f459664d;
        boolean b17 = si1.d1.b(str5, t37.E0());
        java.lang.String a17 = si1.d1.a(str5, t37);
        if (!b17 || !android.text.TextUtils.isEmpty(a17)) {
            yVar.m(new ui1.o(tVar, t37, yVar, str5, h24Var, mo48798x74292566, str, c0Var, str2, jv5Var, str4, str3, b17, a17));
        } else {
            rVar.b("fail:require permission desc");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth, user confirm, error = fail:require permission desc");
        }
    }

    public static void b(ui1.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0 c0Var, java.lang.String str, int i17, boolean z17, boolean z18, ui1.s sVar) {
        tVar.getClass();
        r45.e24 e24Var = new r45.e24();
        ui1.a0 a0Var = tVar.f509617b;
        e24Var.f454457d = a0Var.f509558a.mo48798x74292566();
        e24Var.f454458e.add(str);
        e24Var.f454459f = i17;
        e24Var.f454462i = z18;
        java.lang.String mo48798x74292566 = a0Var.f509558a.mo48798x74292566();
        c0Var.e1("/cgi-bin/mmbiz-bin/js-authorize-confirm", mo48798x74292566, e24Var, r45.f24.class).n(new ui1.g(tVar, i17, mo48798x74292566, a0Var.f509559b, str, z17, sVar));
    }

    public static void c(ui1.a0 a0Var, ui1.r rVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a0Var.f509558a.mo48798x74292566()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a0Var.f509559b)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y component = a0Var.f509558a;
        java.util.HashMap hashMap = ui1.e.f509576h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = component.t3();
        ui1.e eVar = null;
        if (t37 != null) {
            java.util.HashMap hashMap2 = ui1.e.f509576h;
            synchronized (hashMap2) {
                ui1.e eVar2 = (ui1.e) hashMap2.get(t37);
                if (eVar2 == null) {
                    eVar2 = new ui1.e(t37, null);
                    hashMap2.put(t37, eVar2);
                }
                eVar = eVar2;
            }
        }
        if (eVar != null) {
            eVar.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("name[");
            sb6.append(a0Var.f509559b);
            sb6.append("], callbackId[");
            sb6.append(a0Var.f509561d);
            sb6.append("], appId[");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = a0Var.f509558a;
            sb6.append(yVar.mo48798x74292566());
            sb6.append("], component[");
            sb6.append(yVar.mo50260x9f1221c2());
            sb6.append(']');
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSApiUserAuthExecutor", "execute " + sb7);
            eVar.a(new ui1.c(a0Var, rVar, sb7));
        }
    }
}
