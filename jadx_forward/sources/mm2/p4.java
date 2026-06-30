package mm2;

/* loaded from: classes.dex */
public final class p4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f410879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f410880b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410881c;

    public p4(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.Class cls, java.lang.String str) {
        this.f410879a = interfaceC29045xdcb5ca57;
        this.f410880b = cls;
        this.f410881c = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean e17 = xg2.g.e(fVar);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f410879a;
        if (e17) {
            java.util.LinkedList m75941xfb821914 = ((r45.fs1) fVar.f152151d).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getGet_resp_list(...)");
            r45.mn3 mn3Var = (r45.mn3) kz5.n0.Z(m75941xfb821914);
            if (mn3Var != null) {
                java.lang.Class cls = this.f410880b;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = mn3Var.m75934xbce7f2f(2);
                byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
                if (g17 != null) {
                    try {
                        fVar2.mo11468x92b714fd(g17);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("queryLotteryClaimInfo result(");
                sb6.append(cls.getCanonicalName());
                sb6.append(") = ");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar2);
                sb6.append(pm0.b0.b(fVar2));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f410881c, sb6.toString());
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(fVar2));
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            }
        } else {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
        return f0Var2;
    }
}
