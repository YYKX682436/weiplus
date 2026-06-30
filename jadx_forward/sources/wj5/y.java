package wj5;

/* loaded from: classes8.dex */
public final class y extends wj5.c {

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f528381e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d f528382f;

    /* renamed from: g, reason: collision with root package name */
    public final yj5.t f528383g;

    /* renamed from: h, reason: collision with root package name */
    public final db5.i9 f528384h;

    public y(yb5.d mChattingContext, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext, yj5.t processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mChattingContext, "mChattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        this.f528381e = mChattingContext;
        this.f528382f = tipsBarContext;
        this.f528383g = processor;
        this.f528384h = new wj5.x(this);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cxt;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String string;
        java.lang.String str;
        boolean z18;
        xj5.i item = (xj5.i) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21533x4baf88da c21533x4baf88da = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21533x4baf88da) holder.p(com.p314xaae8f345.mm.R.id.nxy);
        yb5.d dVar = this.f528381e;
        c21533x4baf88da.m79292x4001c3c7(dVar);
        c21533x4baf88da.m79295xa0ca35fb(this.f528384h);
        java.lang.String t17 = dVar.t();
        java.util.List list2 = item.f536439u;
        if (list2.contains(t17)) {
            str = dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1n);
            c21533x4baf88da.m79297x43e9f165(0.0f);
            z18 = false;
        } else {
            c21533x4baf88da.m79297x43e9f165(90.0f);
            c21533x4baf88da.c(-1, 0);
            if (list2.size() == 1) {
                android.content.res.Resources s17 = dVar.s();
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str2 = (java.lang.String) list2.get(0);
                ((sg3.a) v0Var).getClass();
                string = s17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1m, c01.a2.e(str2));
            } else {
                string = dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1o, java.lang.Integer.valueOf(list2.size()));
            }
            int color = dVar.s().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c21533x4baf88da.f279229p;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79787x448e46cd);
                c21533x4baf88da.f279229p.m82040x7541828(color);
            }
            str = string;
            z18 = true;
        }
        android.widget.LinearLayout linearLayout = c21533x4baf88da.f279223g;
        if (linearLayout != null) {
            if (linearLayout.getVisibility() == 0 && c21533x4baf88da.f279236w == null) {
                c21533x4baf88da.e(true);
            } else {
                c21533x4baf88da.e(false);
            }
        }
        c21533x4baf88da.d(list2);
        c21533x4baf88da.setVisibility(0);
        c21533x4baf88da.m79294xbf9c2bd8(str);
        com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d dVar2 = this.f528382f;
        if (dVar2.f291458a == com.p314xaae8f345.mm.ui.p2738xb1dfbddb.c.f291455d) {
            c21533x4baf88da.k(0L);
        } else if (z18) {
            c21533x4baf88da.j("fromBanner", list2, 0L);
        } else {
            c21533x4baf88da.k(0L);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m79288x2f8e8070 = c21533x4baf88da.m79288x2f8e8070();
        if (m79288x2f8e8070 != null) {
            m79288x2f8e8070.setVisibility(dVar2.a() ? 8 : 0);
        }
        android.widget.Button m79289xf8156f52 = c21533x4baf88da.m79289xf8156f52();
        if (m79289xf8156f52 != null) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(m79289xf8156f52, "group_msg_set_top_bar_join_btn");
            aVar.ik(m79289xf8156f52, 8, 26356);
        }
        this.f528383g.f544264f = c21533x4baf88da;
    }

    @Override // wj5.c, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    public final void p(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("enter_room_username", str);
        intent.setFlags(268435456);
        j45.l.j(this.f528381e.g(), "talkroom", ".ui.TalkRoomUI", intent, null);
    }

    public final void q(java.lang.String str) {
        yb5.d dVar = this.f528381e;
        if (iq.b.C(dVar.g()) || iq.b.v(dVar.g()) || iq.b.e(dVar.g())) {
            return;
        }
        if (q21.d.a() != null) {
            if (((va3.z0) q21.d.a()).f(dVar.u().d1())) {
                java.util.LinkedList b17 = ((va3.z0) q21.d.a()).b(dVar.u().d1());
                if (b17 != null && b17.contains(dVar.t())) {
                    r("fromBanner");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10997, 13, 0, 0, 0);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be c21532x4955f5be = this.f528383g.f544264f;
                if (c21532x4955f5be == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.TrackRoomComponent", "talkRoomPopupNav = null.");
                    return;
                }
                c21532x4955f5be.m79293xce19f0cf(dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572654c10));
                if (c21532x4955f5be.f279223g.getVisibility() == 0) {
                    c21532x4955f5be.k(300L);
                    return;
                } else {
                    c21532x4955f5be.j("fromBanner", b17, 300L);
                    return;
                }
            }
        }
        r("fromBanner");
    }

    public final void r(java.lang.String str) {
        this.f528383g.m0();
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sm) ((sb5.j2) this.f528381e.f542241c.a(sb5.j2.class))).t0(str);
    }
}
