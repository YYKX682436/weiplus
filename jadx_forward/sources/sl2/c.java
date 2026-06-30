package sl2;

/* loaded from: classes10.dex */
public final class c extends uh4.c {
    public static final void f(sl2.c cVar, uh4.a aVar, r45.g92 g92Var) {
        java.lang.String m75945x2fec8307;
        cVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAuthorizationFiller", "handleCellClick");
        android.content.Context context = aVar.f509496g.getContext();
        long Z = pm0.v.Z(g92Var.m75945x2fec8307(2));
        long Z2 = pm0.v.Z(g92Var.m75945x2fec8307(0));
        java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(3, 2, 65);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CURRENT_FEED_ID", Z);
        java.lang.String str = p52.h.f433554f;
        if (str == null) {
            str = "";
        }
        intent.putExtra("key_enter_live_param_share_username", str);
        intent.putExtra("key_enter_live_param_from_share_scene", 0);
        intent.putExtra("key_enter_live_param_from_share_scene_new", 1);
        intent.putExtra("key_enter_live_param_visitor_enter_scene", 1);
        intent.putExtra("key_enter_live_param_bind_type", g92Var.m75939xb282bd08(19));
        java.lang.String m75945x2fec83072 = g92Var.m75945x2fec8307(20);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        intent.putExtra("key_enter_live_param_by_biz_username", m75945x2fec83072);
        java.lang.String m75945x2fec83073 = g92Var.m75945x2fec8307(21);
        if (m75945x2fec83073 == null) {
            m75945x2fec83073 = "";
        }
        intent.putExtra("key_enter_live_param_by_biz_nickname", m75945x2fec83073);
        java.lang.String m75945x2fec83074 = g92Var.m75945x2fec8307(45);
        if (m75945x2fec83074 == null) {
            m75945x2fec83074 = "";
        }
        intent.putExtra("key_enter_live_param_by_biz_headurl", m75945x2fec83074);
        java.lang.String m75945x2fec83075 = g92Var.m75945x2fec8307(5);
        if (m75945x2fec83075 == null || m75945x2fec83075.length() == 0) {
            java.lang.String m75945x2fec83076 = g92Var.m75945x2fec8307(11);
            m75945x2fec8307 = !(m75945x2fec83076 == null || m75945x2fec83076.length() == 0) ? g92Var.m75945x2fec8307(11) : "";
        } else {
            m75945x2fec8307 = g92Var.m75945x2fec8307(5);
        }
        intent.putExtra("key_enter_live_cover_url", m75945x2fec8307);
        int i17 = qs5.z.f448011a;
        intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 7);
        java.lang.String m75945x2fec83077 = g92Var.m75945x2fec8307(28);
        if (!(m75945x2fec83077 == null || m75945x2fec83077.length() == 0)) {
            java.lang.String m75945x2fec83078 = g92Var.m75945x2fec8307(31);
            if (!(m75945x2fec83078 == null || m75945x2fec83078.length() == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g92Var.m75945x2fec8307(31), "1")) {
                r45.nn2 nn2Var = new r45.nn2();
                nn2Var.f463058e = g92Var.m75945x2fec8307(28);
                nn2Var.f463057d = g92Var.m75945x2fec8307(27);
                nn2Var.f463060g = g92Var.m75945x2fec8307(30);
                nn2Var.f463059f = g92Var.m75945x2fec8307(29);
                intent.putExtra("KEY_ENTER_LIVE_PARAM_OLYMPIC_FIRE_AUTHOR_INFO", nn2Var.mo14344x5f01b1f6());
            }
        }
        if (((r45.nw1) g92Var.m75936x14adae67(24)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1552L, 93L, 1L);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1552L, 94L, 1L);
        }
        r45.m84 m84Var = new r45.m84();
        m84Var.set(0, java.lang.Long.valueOf(Z));
        m84Var.set(1, java.lang.Long.valueOf(Z2));
        java.lang.String m75945x2fec83079 = g92Var.m75945x2fec8307(12);
        if (m75945x2fec83079 == null) {
            m75945x2fec83079 = "";
        }
        m84Var.set(2, m75945x2fec83079);
        java.lang.String m75945x2fec830710 = g92Var.m75945x2fec8307(1);
        if (m75945x2fec830710 == null) {
            m75945x2fec830710 = "";
        }
        m84Var.set(3, m75945x2fec830710);
        m84Var.set(4, "");
        m84Var.set(5, g92Var.m75945x2fec8307(4));
        m84Var.set(6, (r45.nw1) g92Var.m75936x14adae67(24));
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, Gj);
        wk0Var.set(1, "");
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        ((vd2.f1) e0Var).Ri(context, intent, m84Var, false, wk0Var, null);
    }

    @Override // uh4.c
    public java.lang.String b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.egj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // uh4.c
    public void c(android.content.Context context, uh4.b state, uh4.a aVar) {
        java.lang.String str;
        ot0.q v17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (aVar == null) {
            return;
        }
        rt0.e eVar = (rt0.e) aVar.f509490a.y(rt0.e.class);
        boolean equals = c01.z1.r().equals(aVar.f509495f);
        if (eVar != null) {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(eVar.f480913e, "content", null);
            if (d17 == null || (str = (java.lang.String) d17.get(".content")) == null || (v17 = ot0.q.v(str)) == null) {
                return;
            }
            zy2.c cVar = (zy2.c) v17.y(zy2.c.class);
            r45.g92 g92Var = cVar != null ? cVar.f558892b : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAuthorizationFiller", "onFill, state:" + state + ", isWard:" + equals + ", piece.referMsg:" + eVar.f480913e);
            if (equals) {
                android.content.Context context2 = aVar.f509496g.getContext();
                int ordinal = state.ordinal();
                if (ordinal == 0) {
                    aVar.f509497h.setText(context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7e));
                    h(aVar, g92Var, false);
                    return;
                }
                if (ordinal == 1) {
                    aVar.f509497h.setText(context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f76));
                    h(aVar, g92Var, false);
                    return;
                } else if (ordinal == 2) {
                    aVar.f509497h.setText(context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7a));
                    h(aVar, g92Var, true);
                    return;
                } else {
                    if (ordinal != 3) {
                        return;
                    }
                    aVar.f509497h.setText(context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f79));
                    h(aVar, g92Var, false);
                    return;
                }
            }
            android.content.Context context3 = aVar.f509496g.getContext();
            int ordinal2 = state.ordinal();
            if (ordinal2 == 0) {
                aVar.f509496g.setText(context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egc));
                aVar.f509497h.setText(context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7c));
            } else if (ordinal2 == 1) {
                aVar.f509497h.setText(context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f76));
            } else if (ordinal2 == 2) {
                aVar.f509497h.setText(context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7_));
            } else if (ordinal2 == 3) {
                aVar.f509497h.setText(context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f78));
            }
            if (g92Var != null) {
                n11.a b17 = n11.a.b();
                java.lang.String m75945x2fec8307 = g92Var.m75945x2fec8307(11);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                b17.g(m75945x2fec8307, aVar.f509499j);
                aVar.f509501l.setText(g92Var.m75945x2fec8307(4));
                aVar.f509498i.setOnClickListener(new sl2.a(this, aVar, g92Var));
                aVar.f509500k.setVisibility(8);
            }
        }
    }

    public final void h(uh4.a aVar, r45.g92 g92Var, boolean z17) {
        if (g92Var != null) {
            n11.a b17 = n11.a.b();
            java.lang.String m75945x2fec8307 = g92Var.m75945x2fec8307(11);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            b17.g(m75945x2fec8307, aVar.f509499j);
            aVar.f509501l.setText(g92Var.m75945x2fec8307(4));
            aVar.f509500k.setVisibility(8);
            if (z17) {
                aVar.f509498i.setOnClickListener(new sl2.b(this, aVar, g92Var));
            }
        }
    }
}
