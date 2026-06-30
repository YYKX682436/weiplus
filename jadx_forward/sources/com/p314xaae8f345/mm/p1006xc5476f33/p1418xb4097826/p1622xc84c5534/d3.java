package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d3 f206528a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d3();

    public final void a(android.content.Context context, org.json.JSONObject udfKv, boolean z17, long j17, long j18, r45.qt2 qt2Var, java.lang.String extrainfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(udfKv, "udfKv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extrainfo, "extrainfo");
        if (qt2Var == null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            qt2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6549xf3595d4e c6549xf3595d4e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6549xf3595d4e();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6549xf3595d4e.w(Ri);
        java.lang.String m75945x2fec8307 = qt2Var.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        c6549xf3595d4e.s(m75945x2fec8307);
        java.lang.String m75945x2fec83072 = qt2Var.m75945x2fec8307(2);
        c6549xf3595d4e.p(m75945x2fec83072 != null ? m75945x2fec83072 : "");
        c6549xf3595d4e.v(java.lang.String.valueOf(qt2Var.m75939xb282bd08(7)));
        c6549xf3595d4e.q("59");
        java.lang.String jSONObject = udfKv.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        c6549xf3595d4e.x(r26.i0.t(jSONObject, ",", ";", false));
        c6549xf3595d4e.f138998g = !z17 ? 1 : 0;
        if (j18 != -1) {
            c6549xf3595d4e.r(java.lang.String.valueOf(j18));
        } else {
            c6549xf3595d4e.r(java.lang.String.valueOf(c01.id.c()));
        }
        c6549xf3595d4e.f139004m = j17;
        if (extrainfo.length() > 0) {
            c6549xf3595d4e.f139006o = c6549xf3595d4e.b("extrainfo", extrainfo, true);
        }
        c6549xf3595d4e.k();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6549xf3595d4e);
    }
}
