package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class b0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 f198449a;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 a1Var) {
        this.f198449a = a1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.z53 z53Var;
        java.lang.String m75945x2fec8307;
        java.lang.String str;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 a1Var = this.f198449a;
        android.app.Activity context = a1Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean z17 = true;
        p3325xe03a0797.p3326xc267989b.z0.e(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u.class)).P6().m57685x35ecf0b4(), null, 1, null);
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            a1Var.A = ((r45.f01) fVar.f152151d).m75933x41a8a7f2(4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f198404d, "not_pass_openid_to_game:" + ((r45.f01) fVar.f152151d).m75933x41a8a7f2(4));
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = a1Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            java.lang.String str2 = "";
            if (a1Var.f198418u != 1) {
                r45.f01 f01Var = (r45.f01) fVar.f152151d;
                if (!(f01Var != null && f01Var.m75939xb282bd08(2) == 1)) {
                    r45.f01 f01Var2 = (r45.f01) fVar.f152151d;
                    if (f01Var2 == null || (str = f01Var2.m75945x2fec8307(1)) == null) {
                        str = "";
                    }
                    pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a0(a1Var, str));
                    km2.g gVar = km2.g.f390633a;
                    z53Var = a1Var.f198420w;
                    if (z53Var != null && (m75945x2fec8307 = z53Var.m75945x2fec8307(0)) != null) {
                        str2 = m75945x2fec8307;
                    }
                    gVar.a(str2);
                }
            }
            java.lang.String string = a1Var.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4t);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            a1Var.X6(true, com.p314xaae8f345.mm.R.C30867xcad56011.l4u, string);
            km2.g gVar2 = km2.g.f390633a;
            z53Var = a1Var.f198420w;
            if (z53Var != null) {
                str2 = m75945x2fec8307;
            }
            gVar2.a(str2);
        } else {
            a1Var.U6().setEnabled(true);
            int i17 = fVar.f152149b;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
            r45.f01 f01Var3 = (r45.f01) resp;
            if (i17 == -200196) {
                r45.m01 m01Var = (r45.m01) f01Var3.m75936x14adae67(3);
                if (m01Var != null) {
                    a1Var.V6(m01Var);
                }
            } else if (i17 == -200093) {
                java.lang.String string2 = a1Var.W6() ? a1Var.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4w, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.l4y)) : a1Var.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4w, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.l4v));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
                a1Var.X6(false, com.p314xaae8f345.mm.R.C30867xcad56011.gcu, string2);
            } else if (i17 != -200057) {
                z17 = false;
            } else {
                db5.e1.A(a1Var.m80379x76847179(), a1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4s), "", a1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), "", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e0.f198586d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.f0.f198618d);
            }
            if (!z17) {
                db5.t7.m123882x26a183b(a1Var.m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.dgq, 0).show();
            }
        }
        return jz5.f0.f384359a;
    }
}
