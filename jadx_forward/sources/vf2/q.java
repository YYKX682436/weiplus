package vf2;

/* loaded from: classes3.dex */
public final class q extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public r45.n73 f517887m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public static final void Z6(vf2.q qVar) {
        r45.z53 z53Var;
        java.lang.String m75945x2fec8307;
        r45.z53 z53Var2;
        java.lang.String m75945x2fec83072;
        r45.z53 z53Var3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#launchGameLayout click. game:");
        r45.xq1 xq1Var = ((mm2.c1) qVar.m56788xbba4bfc0(mm2.c1.class)).C2;
        java.lang.String str = null;
        sb6.append(xq1Var != null ? xq1Var.m75945x2fec8307(6) : null);
        sb6.append(", gameUserInfo:");
        r45.n73 n73Var = qVar.f517887m;
        sb6.append(n73Var != null ? pm0.b0.g(n73Var) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorScreenCastLivingStatusController", sb6.toString());
        r45.xq1 xq1Var2 = ((mm2.c1) qVar.m56788xbba4bfc0(mm2.c1.class)).C2;
        if (xq1Var2 != null) {
            java.lang.String m75945x2fec83073 = xq1Var2.m75945x2fec8307(6);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            android.content.Intent launchIntentForPackage = qVar.O6().getPackageManager().getLaunchIntentForPackage(m75945x2fec83073);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(268435456);
            }
            r45.n73 n73Var2 = qVar.f517887m;
            if (n73Var2 != null && (z53Var3 = (r45.z53) n73Var2.m75936x14adae67(1)) != null) {
                str = z53Var3.m75945x2fec8307(21);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorScreenCastLivingStatusController", "[launchInternal] launchParams = " + str);
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699 c11272xd6622699 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699();
            c11272xd6622699.f33061xb2206a6f = str;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(c11272xd6622699);
            c11286x34a5504.f33127xc9f07109 = com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a;
            c11286x34a5504.f33125x9b39409a = str;
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            android.content.Context O6 = qVar.O6();
            r45.n73 n73Var3 = qVar.f517887m;
            java.lang.String str2 = (n73Var3 == null || (z53Var2 = (r45.z53) n73Var3.m75936x14adae67(1)) == null || (m75945x2fec83072 = z53Var2.m75945x2fec8307(4)) == null) ? "" : m75945x2fec83072;
            r45.n73 n73Var4 = qVar.f517887m;
            java.lang.String str3 = (n73Var4 == null || (z53Var = (r45.z53) n73Var4.m75936x14adae67(1)) == null || (m75945x2fec8307 = z53Var.m75945x2fec8307(0)) == null) ? "" : m75945x2fec8307;
            android.os.Bundle bundle = new android.os.Bundle();
            ((kt.c) i0Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.w(O6, str2, c11286x34a5504, str3, "", 2, null, bundle);
        }
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).Gj(5);
    }

    public static final java.lang.Object a7(vf2.q qVar, r45.n73 n73Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean z17;
        qVar.getClass();
        r45.z53 z53Var = (r45.z53) n73Var.m75936x14adae67(1);
        boolean z18 = false;
        if (z53Var == null) {
            z17 = true;
        } else {
            java.lang.String m75945x2fec8307 = z53Var.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            java.lang.String m75945x2fec83072 = z53Var.m75945x2fec8307(4);
            java.lang.String str = m75945x2fec83072 != null ? m75945x2fec83072 : "";
            boolean z19 = (str.length() > 0) && !com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a.b(qVar.O6(), str);
            if (z19) {
                db5.e1.A(qVar.O6(), qVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f3_, m75945x2fec8307), "", qVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), qVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new vf2.a(qVar, z53Var), vf2.b.f517858d);
                ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).Gj(8);
            }
            z17 = !z19;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorScreenCastLivingStatusController", "#startScreenCastPreview installCheck failed");
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorScreenCastLivingStatusController", "#startScreenCastPreview installCheck success");
        in0.q qVar2 = in0.q.f374302b2;
        if (!(qVar2 != null)) {
            return f0Var;
        }
        if (qVar2 == null) {
            in0.q.f374302b2 = new in0.q(rn0.a.f479142a.a());
        }
        in0.q qVar3 = in0.q.f374302b2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar3);
        r45.z53 z53Var2 = (r45.z53) n73Var.m75936x14adae67(1);
        if (z53Var2 != null && z53Var2.m75939xb282bd08(18) == 1) {
            z18 = true;
        }
        java.lang.Object E0 = qVar3.E0(!z18, qVar.N6(), interfaceC29045xdcb5ca57);
        return E0 == pz5.a.f440719d ? E0 : f0Var;
    }

    public final android.view.ViewGroup b7() {
        return (android.view.ViewGroup) T6(com.p314xaae8f345.mm.R.id.rn9, com.p314xaae8f345.mm.R.id.rn8);
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c7() {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        android.view.ViewGroup b76 = b7();
        if (b76 == null || (c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) b76.findViewById(com.p314xaae8f345.mm.R.id.roh)) == null) {
            return null;
        }
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.M1));
        return c22789xd23e9a9b;
    }

    public final android.view.View d7() {
        android.view.ViewGroup b76 = b7();
        if (b76 != null) {
            return b76.findViewById(com.p314xaae8f345.mm.R.id.rel);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new vf2.c(this, h0Var, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new vf2.e(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        android.view.ViewGroup b76 = b7();
        if (b76 != null) {
            b76.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c76 = c7();
        if (c76 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new vf2.f(c76, null), 3, null);
        }
        android.view.ViewGroup b77 = b7();
        android.view.View findViewById = b77 != null ? b77.findViewById(com.p314xaae8f345.mm.R.id.reg) : null;
        if (findViewById != null) {
            findViewById.setOnClickListener(new vf2.m(this));
        }
        android.view.View d76 = d7();
        if (d76 != null) {
            d76.setOnClickListener(new vf2.o(this));
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c76 = c7();
        if (c76 != null) {
            c76.n();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c77 = c7();
        if (c77 != null) {
            c77.h();
        }
    }
}
