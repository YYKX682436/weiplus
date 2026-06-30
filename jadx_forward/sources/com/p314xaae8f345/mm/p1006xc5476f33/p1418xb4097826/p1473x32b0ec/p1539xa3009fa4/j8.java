package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class j8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l8 f198701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f198702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h8 f198703c;

    public j8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l8 l8Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h8 h8Var) {
        this.f198701a = l8Var;
        this.f198702b = z17;
        this.f198703c = h8Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList<r45.z63> m75941xfb821914;
        java.util.LinkedList<r45.z63> m75941xfb8219142;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l8 l8Var = this.f198701a;
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.i8(l8Var));
        int i17 = fVar.f152148a;
        boolean z17 = this.f198702b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h8 h8Var = this.f198703c;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.a73 a73Var = l8Var.f198757f;
            if (a73Var != null && (m75941xfb821914 = a73Var.m75941xfb821914(0)) != null) {
                for (r45.z63 z63Var : m75941xfb821914) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z63Var.m75945x2fec8307(0), h8Var.f198665d.m75945x2fec8307(0))) {
                        z63Var.set(2, java.lang.Integer.valueOf(h8Var.f198665d.m75939xb282bd08(2)));
                        r45.a73 a73Var2 = l8Var.f198757f;
                        if (a73Var2 != null && (m75941xfb8219142 = a73Var2.m75941xfb821914(0)) != null) {
                            for (r45.z63 z63Var2 : m75941xfb8219142) {
                                if (z63Var2 != null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SimpleUIComponent_set", "GameRankSwitch appid:" + z63Var2.m75945x2fec8307(0) + ", name:" + z63Var2.m75945x2fec8307(1) + ", enable:" + z63Var2.m75939xb282bd08(2));
                                }
                            }
                        }
                        g92.b bVar = g92.b.f351302e;
                        m92.f fVar2 = new m92.f();
                        r45.ob4 e17 = fVar2.e();
                        r45.a73 a73Var3 = new r45.a73();
                        r45.a73 a73Var4 = l8Var.f198757f;
                        a73Var3.mo11468x92b714fd(a73Var4 != null ? a73Var4.mo14344x5f01b1f6() : null);
                        e17.set(11, a73Var3);
                        bVar.S1(fVar2, m92.j.f406533r);
                    }
                }
            }
            if (l8Var.f198761m) {
                if (z17) {
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ml2.r0 r0Var = (ml2.r0) c17;
                    java.lang.String m75945x2fec8307 = h8Var.f198665d.m75945x2fec8307(0);
                    ml2.r0.Rj(r0Var, 5, m75945x2fec8307 == null ? "" : m75945x2fec8307, 0, 4, null);
                } else {
                    i95.m c18 = i95.n0.c(ml2.r0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    ml2.r0 r0Var2 = (ml2.r0) c18;
                    java.lang.String m75945x2fec83072 = h8Var.f198665d.m75945x2fec8307(0);
                    ml2.r0.Rj(r0Var2, 7, m75945x2fec83072 == null ? "" : m75945x2fec83072, 0, 4, null);
                }
            }
        } else {
            h8Var.f198665d.set(2, java.lang.Integer.valueOf(!z17 ? 1 : 0));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveModBasicInfo failed, reset ");
            r45.z63 z63Var3 = h8Var.f198665d;
            java.lang.String m75945x2fec83073 = z63Var3.m75945x2fec8307(0);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            sb6.append(m75945x2fec83073);
            sb6.append(", ");
            sb6.append(z63Var3.m75939xb282bd08(2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, sb6.toString());
            if (l8Var.f198761m && z17) {
                ml2.r0 r0Var3 = (ml2.r0) i95.n0.c(ml2.r0.class);
                java.lang.String m75945x2fec83074 = z63Var3.m75945x2fec8307(0);
                r0Var3.Qj(6, m75945x2fec83074 != null ? m75945x2fec83074 : "", fVar.f152149b);
            }
        }
        return jz5.f0.f384359a;
    }
}
