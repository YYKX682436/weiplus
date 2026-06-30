package m50;

/* loaded from: classes.dex */
public abstract class x extends wm3.a {

    /* renamed from: r, reason: collision with root package name */
    public static final m50.a f405044r = new m50.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f405045d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f405046e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f405047f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f405048g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f405049h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f405050i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f405051m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f405052n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f405053o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f405054p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f405055q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f405045d = jz5.h.b(new m50.w(this));
        this.f405046e = new java.util.ArrayList();
        this.f405049h = jz5.h.b(new m50.p(this));
        this.f405050i = jz5.h.b(new m50.b(this));
        this.f405051m = jz5.h.b(new m50.o(this));
        this.f405052n = jz5.h.b(new m50.q(this));
        this.f405053o = jz5.h.b(new m50.d(this));
        this.f405054p = jz5.h.b(new m50.t(this));
        this.f405055q = jz5.h.b(new m50.e(this));
    }

    public static final void T6(m50.x xVar, xi5.e eVar, int i17, yz5.a aVar) {
        xVar.getClass();
        if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20194x7c1a905c()) == 1)) {
            aVar.mo152xb9724478();
            return;
        }
        boolean z17 = eVar.f536274b == 1;
        java.lang.String string = z17 ? xVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n48) : xVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n4j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        java.lang.String string2 = xVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_7, string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        if (z17) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("app_jump_wecom_popup", "view_exp", kz5.c1.m(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.a(xVar.c7(), xVar.g7(), i17), kz5.b1.e(new jz5.l("share_type", 14))), 32337);
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("app_jump_wegov_popup", "view_exp", kz5.c1.m(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.a(xVar.c7(), xVar.g7(), i17), kz5.b1.e(new jz5.l("share_type", 15))), 32337);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(xVar.m158354x19263085());
        u1Var.g(string2);
        u1Var.n(xVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o79));
        u1Var.j(xVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
        u1Var.l(new m50.u(z17, xVar, i17, aVar));
        u1Var.i(new m50.v(z17, xVar, i17));
        u1Var.q(false);
    }

    public boolean U6() {
        return true;
    }

    public abstract co.a V6();

    public java.lang.String W6() {
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X6(java.util.List r26) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m50.x.X6(java.util.List):void");
    }

    public final void Y6(boolean z17, boolean z18, java.lang.String str) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new xi5.b(null, null, null, java.lang.Boolean.valueOf(z17), str, z18, 7, null));
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("SendMsgUsernames", this.f405046e);
        m158354x19263085().setResult(-1, intent);
        m158354x19263085().finish();
    }

    public final ot0.q Z6() {
        return (ot0.q) ((jz5.n) this.f405050i).mo141623x754a37bb();
    }

    public final int a7() {
        return ((java.lang.Number) ((jz5.n) this.f405055q).mo141623x754a37bb()).intValue();
    }

    public int b7() {
        return 0;
    }

    public final co.a c7() {
        return (co.a) ((jz5.n) this.f405051m).mo141623x754a37bb();
    }

    public final java.lang.String d7() {
        return (java.lang.String) ((jz5.n) this.f405049h).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 e7() {
        return (com.p314xaae8f345.mm.p2621x8fb0427b.f9) ((jz5.n) this.f405052n).mo141623x754a37bb();
    }

    public final java.lang.Class f7() {
        ek5.b bVar;
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        co.a model = c7();
        ((dk5.y) a0Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        java.util.Iterator it = ek5.g.f335223a.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = (ek5.b) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(model.getClass(), bVar.h())) {
                break;
            }
        }
        java.lang.Class f17 = bVar != null ? bVar.f() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(f17, "null cannot be cast to non-null type java.lang.Class<out com.tencent.mm.feature.forward.preview.BaseForwardMsgPreviewUIC<MODEL of com.tencent.mm.feature.forward.entry.BaseForwardUIC>>");
        return f17;
    }

    public final int g7() {
        return ((java.lang.Number) ((jz5.n) this.f405054p).mo141623x754a37bb()).intValue();
    }

    public void h7(java.lang.String str) {
        if (str == null || str.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleClawBotForward: clawUserName is null or empty, talker=");
            co.a c76 = c7();
            sb6.append(c76.m75945x2fec8307(c76.f125235d + 1));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseForwardUIC", sb6.toString());
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        X6(arrayList);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleClawBotForward: toUser=");
        sb7.append(str);
        sb7.append(", talker=");
        co.a c77 = c7();
        sb7.append(c77.m75945x2fec8307(c77.f125235d + 1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseForwardUIC", sb7.toString());
    }

    public void i7() {
        xj.m mVar;
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        rd0.k1 k1Var = (rd0.k1) i95.n0.c(rd0.k1.class);
        jt.c0 c0Var = (jt.c0) i95.n0.c(jt.c0.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.fd) k1Var).getClass();
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.k()) {
            arrayList.add(k50.o0.f385776d);
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.j()) {
            arrayList.add(k50.o0.f385777e);
        }
        ((ht.w) c0Var).getClass();
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h4.f270870a.a(context)) {
            arrayList.add(k50.o0.f385778f);
        }
        k50.g0.f385747a.c(arrayList, k50.l0.f385771d);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            linkedHashMap.put((k50.o0) next, java.lang.Integer.valueOf(i18));
            i17 = i18;
        }
        java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(k50.o0.f385776d);
        if (num != null) {
            java.util.Map m17 = kz5.c1.m(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.a(c7(), g7(), a7()), kz5.b1.e(new jz5.l("forward_other_app_index", java.lang.Integer.valueOf(num.intValue()))));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportHelper", "reportForwardOtherWecomBtnExp: " + m17);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_other_wecom_btn", "view_exp", m17, 32337);
        }
        java.lang.Integer num2 = (java.lang.Integer) linkedHashMap.get(k50.o0.f385777e);
        if (num2 != null) {
            java.util.Map m18 = kz5.c1.m(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.a(c7(), g7(), a7()), kz5.b1.e(new jz5.l("forward_other_app_index", java.lang.Integer.valueOf(num2.intValue()))));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportHelper", "reportForwardOtherWeGovBtnExp: " + m18);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_other_wegov_btn", "view_exp", m18, 32337);
        }
        java.lang.Integer num3 = (java.lang.Integer) linkedHashMap.get(k50.o0.f385778f);
        if (num3 != null) {
            int intValue = num3.intValue();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zp zpVar = ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).f444811t;
            if (zpVar != null && !zpVar.f281935c && (mVar = zpVar.f281933a) != null) {
                zpVar.f281935c = true;
                zpVar.f281934b = mVar;
                ((wj.j0) ((xj.i) ((jz5.n) zpVar.f281937e).mo141623x754a37bb())).mj(mVar.f536286a, wj.w0.f528074d, null);
            }
            java.util.Map m19 = kz5.c1.m(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.a(c7(), g7(), a7()), kz5.b1.e(new jz5.l("forward_other_app_index", java.lang.Integer.valueOf(intValue))));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportHelper", "reportForwardOtherYuanBaoBtnExp: " + m19);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_other_yuanbao_btn", "view_exp", m19, 32337);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_to_other_app_page_sheet", "view_exp", com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.a(c7(), g7(), a7()), 32337);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_IS_SUPPORT_FORWARD_TO_CLAWBOT", ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).ij());
        pf5.j0.a(intent, k50.y0.class);
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        cVar.f102455a.f102457a = m80379x76847179();
        cVar.f(false);
        cVar.e(true);
        cVar.a(com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class.getName());
        cVar.b(com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22416x4a36f104.class);
        cVar.i(new m50.i(this));
    }

    public abstract boolean k7(xi5.e eVar);

    public void l7() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseForwardUIC", "handleYuanBaoForward called in non-MM process, abort");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 e76 = e7();
        if (e76 == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f fVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f(0L, 1, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            fVar.b(m80379x76847179(), m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pag), true, 0, new m50.k(c0Var, p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), null, null, new m50.n(this, fVar, c0Var, null), 3, null)));
        } else {
            boolean z17 = g7() == 1;
            co.a c76 = c7();
            ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).fj(m80379x76847179(), kz5.b0.c(e76), ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(c76.m75945x2fec8307(c76.f125235d + 1)), z17, new m50.j(this));
        }
    }

    public boolean m7() {
        return m158359x1e885992().getBooleanExtra("ForwardParams_EnableContentClick", true);
    }

    public void n7() {
    }

    public void o7(java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        j75.f m67437x4bd53102;
        wi5.n0 n0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null && (m67437x4bd53102 = P6.m67437x4bd5310()) != null && (n0Var = (wi5.n0) m67437x4bd53102.mo140437x75286adb()) != null) {
            n0Var.f527857t = c7();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new m50.s(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).cj();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        if (this.f405048g) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finish_by_forward_to_wework", true);
            m158354x19263085().setResult(0, intent);
            m158354x19263085().finish();
        }
    }

    public java.lang.String p7() {
        return null;
    }
}
