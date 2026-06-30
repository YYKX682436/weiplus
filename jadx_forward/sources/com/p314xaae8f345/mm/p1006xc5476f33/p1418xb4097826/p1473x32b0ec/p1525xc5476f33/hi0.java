package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class hi0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ji0 f194347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f194348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.z63 f194349c;

    public hi0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ji0 ji0Var, boolean z17, r45.z63 z63Var) {
        this.f194347a = ji0Var;
        this.f194348b = z17;
        this.f194349c = z63Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList<r45.z63> m75941xfb821914;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ji0 ji0Var = this.f194347a;
        ji0Var.u1();
        int i17 = fVar.f152148a;
        java.lang.String str = ji0Var.f194640p;
        r45.z63 z63Var = this.f194349c;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.a73 a73Var = ji0Var.f194646v;
            boolean z17 = this.f194348b;
            if (a73Var != null && (m75941xfb821914 = a73Var.m75941xfb821914(0)) != null) {
                for (r45.z63 z63Var2 : m75941xfb821914) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z63Var2.m75945x2fec8307(0), z63Var.m75945x2fec8307(0))) {
                        z63Var2.set(2, java.lang.Integer.valueOf(z17 ? 1 : 0));
                        java.lang.String TAG = str + "_set";
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TAG, "TAG");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "GameRankSwitch appid:" + z63Var2.m75945x2fec8307(0) + ", name:" + z63Var2.m75945x2fec8307(1) + ", enable:" + z63Var2.m75939xb282bd08(2));
                        g92.b bVar = g92.b.f351302e;
                        m92.f fVar2 = new m92.f();
                        r45.ob4 e17 = fVar2.e();
                        r45.a73 a73Var2 = new r45.a73();
                        r45.a73 a73Var3 = ji0Var.f194646v;
                        a73Var2.mo11468x92b714fd(a73Var3 != null ? a73Var3.mo14344x5f01b1f6() : null);
                        e17.set(11, a73Var2);
                        bVar.S1(fVar2, m92.j.f406533r);
                    }
                }
            }
            if (z17) {
                android.view.ViewGroup viewGroup = ji0Var.f446856d;
                db5.t7.h(viewGroup.getContext(), viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ehs));
            }
            dk2.xf W0 = ji0Var.W0();
            if (W0 != null) {
                ((dk2.r4) W0).q(null);
            }
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            java.lang.String m75945x2fec8307 = z63Var.m75945x2fec8307(0);
            ml2.r0.Rj(r0Var, 5, m75945x2fec8307 == null ? "" : m75945x2fec8307, 0, 4, null);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveModBasicInfo failed, reset ");
            java.lang.String m75945x2fec83072 = z63Var.m75945x2fec8307(0);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            sb6.append(m75945x2fec83072);
            sb6.append(", ");
            sb6.append(z63Var.m75939xb282bd08(2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            ml2.r0 r0Var2 = (ml2.r0) i95.n0.c(ml2.r0.class);
            java.lang.String m75945x2fec83073 = z63Var.m75945x2fec8307(0);
            r0Var2.Qj(6, m75945x2fec83073 != null ? m75945x2fec83073 : "", fVar.f152149b);
        }
        return jz5.f0.f384359a;
    }
}
