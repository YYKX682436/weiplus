package zl2;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.f f555286a = new zl2.f();

    public static final void a(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3325xe03a0797.p3326xc267989b.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v0 v0Var) {
        if (c0Var.f391645d) {
            return;
        }
        c0Var.f391645d = true;
        ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(v0Var));
    }

    public final java.lang.Object b(android.content.Context context, int i17, java.lang.String str, boolean z17, boolean z18, java.lang.String str2, long j17, java.lang.String str3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        long c17 = c01.id.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        zl2.e eVar = new zl2.e(c0Var, rVar);
        ((sb0.f) ((tb0.i) i95.n0.c(tb0.i.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.R6(context, i17, str, eVar, z17, z18, str2);
        pm0.v.V(3000L, new zl2.c(c0Var, c17, str3, eVar, rVar));
        pm0.v.V(j17, new zl2.d(c0Var, str3, eVar, rVar));
        java.lang.Object j18 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j18;
    }
}
