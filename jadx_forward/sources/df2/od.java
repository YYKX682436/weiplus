package df2;

/* loaded from: classes3.dex */
public final class od extends if2.b {

    /* renamed from: w, reason: collision with root package name */
    public static final df2.dd f312485w = new df2.dd(null);

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312486m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx f312487n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14408x406bfa38 f312488o;

    /* renamed from: p, reason: collision with root package name */
    public r45.ug1 f312489p;

    /* renamed from: q, reason: collision with root package name */
    public r45.d62 f312490q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f312491r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f312492s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f312493t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f312494u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f312495v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312486m = "LiveAnchorTaskBannerController";
        this.f312492s = jz5.h.b(new df2.ed(this));
        this.f312493t = jz5.h.b(df2.cd.f311411d);
        this.f312494u = "wxaliteb97bae038c43fd5cb3f1259a0690f499";
        this.f312495v = "pages/home";
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14408x406bfa38 Z6(df2.od odVar) {
        if (odVar.f312488o == null) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(odVar.O6()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dt8, (android.view.ViewGroup) null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14408x406bfa38 c14408x406bfa38 = inflate instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14408x406bfa38 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14408x406bfa38) inflate : null;
            odVar.f312488o = c14408x406bfa38;
            if (c14408x406bfa38 != null) {
                c14408x406bfa38.setOnClickListener(new df2.fd(odVar));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14408x406bfa38 c14408x406bfa382 = odVar.f312488o;
            if (c14408x406bfa382 != null) {
                c14408x406bfa382.m57941x9904e870(new df2.gd(odVar));
            }
        }
        return odVar.f312488o;
    }

    public static final java.lang.String a7(df2.od odVar, r45.ug1 ug1Var) {
        if (odVar.b7(ug1Var)) {
            java.lang.String m75945x2fec8307 = ug1Var != null ? ug1Var.m75945x2fec8307(1) : null;
            if (m75945x2fec8307 != null) {
                return m75945x2fec8307;
            }
        }
        return "";
    }

    public static void d7(df2.od odVar, r45.f62 f62Var, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        jz5.f0 f0Var = null;
        if ((i17 & 1) != 0) {
            f62Var = null;
        }
        java.lang.String str = odVar.f312486m;
        if (f62Var != null && (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) f62Var.m75936x14adae67(17)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[openRewardLiteApp] info = " + pm0.b0.g(c19786x6a1e2862));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context O6 = odVar.O6();
            xc2.y2 y2Var = xc2.y2.f534876a;
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            p0Var.f534785n = 0;
            xc2.y2.i(y2Var, O6, p0Var, 0, null, 8, null);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[openRewardLiteApp] open default}");
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            android.content.Context O62 = odVar.O6();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", odVar.f312494u);
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, odVar.f312495v);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).kk(O62, bundle, true, false, new df2.id(odVar));
        }
    }

    public final boolean b7(r45.ug1 ug1Var) {
        if (ug1Var != null && ug1Var.m75933x41a8a7f2(0)) {
            java.lang.String m75945x2fec8307 = ug1Var.m75945x2fec8307(1);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c7(r45.d62 targetType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetType, "targetType");
        return this.f312490q == targetType;
    }

    public final void e7(r45.n72 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        r45.ug1 ug1Var = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).W5;
        if (ug1Var == null) {
            ug1Var = this.f312489p;
        }
        if (b7(ug1Var)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new df2.jd(this, action, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        super.mo8997x8001c97e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14408x406bfa38 c14408x406bfa38;
        java.util.LinkedList m75941xfb821914;
        super.mo14867x5aa1c816(r71Var);
        java.lang.Object obj = null;
        if (r71Var != null && (m75941xfb821914 = r71Var.m75941xfb821914(14)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((r45.ch1) next).m75939xb282bd08(1) == 20120) {
                    obj = next;
                    break;
                }
            }
            obj = (r45.ch1) obj;
        }
        if (obj == null || (c14408x406bfa38 = this.f312488o) == null) {
            return;
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xw(true, c14408x406bfa38));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        dk2.tb tbVar = dk2.ef.f314925k;
        tbVar.f(39);
        tbVar.e(39, new r45.ob2(), new df2.nd(this, r45.pb2.class), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        this.f312487n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx(O6(), getStore());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44) ((jz5.n) this.f312492s).mo141623x754a37bb();
        if (c14227x4262fb44 != null) {
            c14227x4262fb44.f193193d = true;
            c14227x4262fb44.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout, new df2.hd(this));
        }
        if (((mm2.c1) getStore().getLiveRoomData().a(mm2.c1.class)).a8()) {
            dk2.tb tbVar = dk2.ef.f314925k;
            tbVar.f(39);
            tbVar.e(39, new r45.ob2(), new df2.nd(this, r45.pb2.class), false);
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        dk2.ef.f314925k.f(39);
        this.f312488o = null;
        this.f312490q = null;
        this.f312491r = null;
        this.f312487n = null;
    }
}
