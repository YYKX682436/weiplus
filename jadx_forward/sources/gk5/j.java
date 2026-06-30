package gk5;

/* loaded from: classes9.dex */
public final class j extends m50.x {

    /* renamed from: u, reason: collision with root package name */
    public static final gk5.h f354206u = new gk5.h(null);

    /* renamed from: s, reason: collision with root package name */
    public boolean f354207s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.Set f354208t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f354208t = new java.util.LinkedHashSet();
    }

    @Override // m50.x
    public co.a V6() {
        return new fc5.i();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String m126747x696739c;
        l15.c j17 = ((fc5.i) c7()).j();
        return (j17 == null || (m126747x696739c = j17.m126747x696739c()) == null) ? "" : m126747x696739c;
    }

    @Override // m50.x
    public int b7() {
        return 49;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((gk5.m1) pf5.z.f435481a.a(activity).a(gk5.m1.class)).U6(d7(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.d(action.f536274b));
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        gk5.h hVar = f354206u;
        java.lang.String d76 = d7();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f405047f);
        fc5.i iVar = (fc5.i) c7();
        long m75942xfb822ef2 = iVar.m75942xfb822ef2(iVar.f125235d + 0);
        fc5.i iVar2 = (fc5.i) c7();
        hVar.a(toUser, d76, valueOf, m75942xfb822ef2, iVar2.m75945x2fec8307(iVar2.f125235d + 1), null);
        q7(toUser, true);
    }

    @Override // m50.x, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        super.mo450x3e5a77bb(bundle);
        m158354x19263085().mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.ui.transmit.uic.ForwardFinderFeedUIC$onCreate$1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
            /* renamed from: onDestroy */
            public final void m81155xac79a11b() {
                gk5.j jVar = gk5.j.this;
                if (!jVar.f354207s) {
                    java.util.Iterator it = jVar.f354208t.iterator();
                    while (it.hasNext()) {
                        jVar.q7((java.lang.String) it.next(), false);
                    }
                }
                jVar.m158354x19263085().mo273xed6858b4().c(this);
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new gk5.i(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q7(java.lang.String str, boolean z17) {
        java.lang.Object[] objArr;
        this.f354207s = z17;
        ot0.q v17 = ot0.q.v(d7());
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 e76 = e7();
        java.lang.String Q0 = e76 != null ? e76.Q0() : null;
        if (Q0 == null) {
            Q0 = "";
        }
        zy2.i iVar = (zy2.i) v17.y(zy2.i.class);
        if (str != null) {
            if ((str.length() > 0) == true) {
                objArr = true;
                if (objArr == true || iVar == null) {
                }
                boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q0);
                boolean R42 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str);
                r45.fv2 fv2Var = (Q0.length() > 0) != false ? R4 ? r45.fv2.GroupChat : r45.fv2.SingleChat : !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m158354x19263085().getIntent().getStringExtra("KEY_FROM_SOURCE"), "WeApp") ? r45.fv2.WechatFavorite : r45.fv2.Finder;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 e77 = e7();
                java.lang.String str2 = e77 != null ? e77.G : null;
                if (str2 == null) {
                    str2 = "";
                }
                byte[] bytes = str2.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 2);
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[8];
                java.lang.String m75945x2fec8307 = iVar.f558944b.m75945x2fec8307(0);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                lVarArr[0] = new jz5.l("feed_id", m75945x2fec8307);
                java.lang.String m75945x2fec83072 = iVar.f558944b.m75945x2fec8307(1);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                lVarArr[1] = new jz5.l("finder_username", m75945x2fec83072);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 e78 = e7();
                java.lang.String Q02 = e78 != null ? e78.Q0() : null;
                lVarArr[2] = new jz5.l("share_username", Q02 != null ? Q02 : "");
                lVarArr[3] = new jz5.l("receive_usename", str);
                lVarArr[4] = new jz5.l("share_src_scene", java.lang.Integer.valueOf(fv2Var.f456153d));
                lVarArr[5] = new jz5.l("share_dst_scene", java.lang.Integer.valueOf(R42 ? 3 : 2));
                lVarArr[6] = new jz5.l("forward_result", java.lang.Integer.valueOf(z17 ? 1 : 0));
                lVarArr[7] = new jz5.l("msg_source", encodeToString);
                ((cy1.a) rVar).Bj("long_press_forward", "view_clk", kz5.c1.k(lVarArr), 1, false);
                return;
            }
        }
        objArr = false;
        if (objArr == true) {
        }
    }
}
