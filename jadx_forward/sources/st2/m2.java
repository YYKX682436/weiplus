package st2;

/* loaded from: classes3.dex */
public final class m2 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f493930a;

    /* renamed from: b, reason: collision with root package name */
    public final zy2.ec f493931b;

    public m2(gk2.e eVar, zy2.ec ecVar) {
        this.f493930a = eVar;
        this.f493931b = ecVar;
    }

    @Override // l81.e1
    public void a() {
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live:");
        gk2.e eVar = this.f493930a;
        sb6.append((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? null : java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)));
        sb6.append(" onAppBrandProcessDied!");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramUICallback", sb6.toString());
        mm2.f6 f6Var = eVar != null ? (mm2.f6) eVar.a(mm2.f6.class) : null;
        if (f6Var == null) {
            return;
        }
        f6Var.B = false;
    }

    @Override // l81.e1
    public void b() {
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live:");
        gk2.e eVar = this.f493930a;
        sb6.append((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? null : java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)));
        sb6.append(" luanchMiniProgram error!");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramUICallback", sb6.toString());
        mm2.f6 f6Var = eVar != null ? (mm2.f6) eVar.a(mm2.f6.class) : null;
        if (f6Var == null) {
            return;
        }
        f6Var.B = false;
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
        r45.br2 e17;
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live:");
        gk2.e eVar = this.f493930a;
        sb6.append((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? null : java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)));
        sb6.append(" onTriggerHalfScreenShare ");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramUICallback", sb6.toString());
        if ((str == null || str.length() == 0) || (e17 = zl2.b0.f555196a.e(str)) == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "getContext(...)");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new st2.l2(e17, null), 3, null);
    }

    @Override // l81.e1
    public void e() {
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live:");
        gk2.e eVar = this.f493930a;
        sb6.append((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? null : java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)));
        sb6.append(" onAppBrandUIEnter!");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramUICallback", sb6.toString());
        mm2.f6 f6Var = eVar != null ? (mm2.f6) eVar.a(mm2.f6.class) : null;
        if (f6Var == null) {
            return;
        }
        f6Var.B = true;
    }

    @Override // l81.e1
    public void f(boolean z17) {
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live:");
        gk2.e eVar = this.f493930a;
        sb6.append((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? null : java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)));
        sb6.append(" onAppBrandUIExit isFinish:");
        sb6.append(z17);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramUICallback", sb6.toString());
        mm2.f6 f6Var = eVar != null ? (mm2.f6) eVar.a(mm2.f6.class) : null;
        if (f6Var != null) {
            f6Var.B = false;
        }
        zy2.ec ecVar = this.f493931b;
        if (ecVar != null) {
            ecVar.a();
        }
    }
}
