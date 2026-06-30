package df2;

/* loaded from: classes3.dex */
public final class mi implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.wi f312314a;

    public mi(df2.wi wiVar) {
        this.f312314a = wiVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.n73 c76;
        r45.z53 z53Var;
        java.lang.String m75945x2fec8307;
        java.lang.String str;
        yg2.c m57685x35ecf0b4;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        df2.wi wiVar = this.f312314a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 b76 = wiVar.b7();
        if (b76 != null && (m57685x35ecf0b4 = b76.m57685x35ecf0b4()) != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(m57685x35ecf0b4, null);
        }
        boolean z17 = true;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            wiVar.f313224n = ((r45.f01) fVar.f152151d).m75933x41a8a7f2(4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wiVar.f313223m, "not_pass_openid_to_game:" + ((r45.f01) fVar.f152151d).m75933x41a8a7f2(4));
            java.lang.String str2 = "";
            if (wiVar.d7().f410930t != 1) {
                r45.f01 f01Var = (r45.f01) fVar.f152151d;
                if (!(f01Var != null && f01Var.m75939xb282bd08(2) == 1)) {
                    r45.f01 f01Var2 = (r45.f01) fVar.f152151d;
                    if (f01Var2 == null || (str = f01Var2.m75945x2fec8307(1)) == null) {
                        str = "";
                    }
                    pm0.v.K(null, new df2.li(wiVar, str));
                    km2.g gVar = km2.g.f390633a;
                    c76 = wiVar.c7();
                    if (c76 != null && (z53Var = (r45.z53) c76.m75936x14adae67(1)) != null && (m75945x2fec8307 = z53Var.m75945x2fec8307(0)) != null) {
                        str2 = m75945x2fec8307;
                    }
                    gVar.a(str2);
                }
            }
            java.lang.String string = wiVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4t);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            wiVar.h7(true, com.p314xaae8f345.mm.R.C30867xcad56011.l4u, string);
            km2.g gVar2 = km2.g.f390633a;
            c76 = wiVar.c7();
            if (c76 != null) {
                str2 = m75945x2fec8307;
            }
            gVar2.a(str2);
        } else {
            int i17 = fVar.f152149b;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
            r45.f01 f01Var3 = (r45.f01) resp;
            if (i17 == -200196) {
                r45.m01 m01Var = (r45.m01) f01Var3.m75936x14adae67(3);
                if (m01Var != null) {
                    wiVar.f7(m01Var);
                }
            } else if (i17 == -200093) {
                java.lang.String string2 = wiVar.g7() ? wiVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4w, wiVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4y)) : wiVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4w, wiVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4v));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
                wiVar.h7(false, com.p314xaae8f345.mm.R.C30867xcad56011.gcu, string2);
            } else if (i17 != -200057) {
                z17 = false;
            } else {
                db5.e1.A(wiVar.O6(), wiVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4s), "", wiVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), "", df2.pi.f312602d, df2.qi.f312697d);
            }
            if (!z17) {
                db5.t7.m123882x26a183b(wiVar.O6(), com.p314xaae8f345.mm.R.C30867xcad56011.dgq, 0).show();
            }
            android.content.Context O6 = wiVar.O6();
            pf5.z zVar = pf5.z.f435481a;
            if (!(O6 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) O6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8.class)).a7();
        }
        return jz5.f0.f384359a;
    }
}
