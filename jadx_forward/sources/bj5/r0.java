package bj5;

/* loaded from: classes.dex */
public final class r0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f102753d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f102754e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f102755f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f102756g;

    /* renamed from: h, reason: collision with root package name */
    public int f102757h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f102758i;

    /* renamed from: m, reason: collision with root package name */
    public int f102759m;

    /* renamed from: n, reason: collision with root package name */
    public int f102760n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f102761o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        jz5.h.b(new bj5.q0(this));
        this.f102753d = jz5.h.b(new bj5.p0(this));
        this.f102754e = jz5.h.b(new bj5.n0(this));
        this.f102755f = jz5.h.b(new bj5.o0(this));
        this.f102756g = jz5.h.b(new bj5.m0(this));
        this.f102761o = new java.util.ArrayList();
    }

    public static final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6762x6c7edd31 T6(bj5.r0 r0Var, int i17, int i18, int i19) {
        int intValue = ((java.lang.Number) ((jz5.n) r0Var.f102755f).mo141623x754a37bb()).intValue();
        java.lang.String str = (java.lang.String) ((jz5.n) r0Var.f102753d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "<get-sessionId>(...)");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6762x6c7edd31 c6762x6c7edd31 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6762x6c7edd31();
        c6762x6c7edd31.f140888e = 1;
        c6762x6c7edd31.f140889f = i17;
        c6762x6c7edd31.f140890g = intValue;
        c6762x6c7edd31.f140891h = c6762x6c7edd31.b("friend_selector_page_sessionid", str, true);
        c6762x6c7edd31.f140893j = i18;
        c6762x6c7edd31.f140894k = i19;
        return c6762x6c7edd31;
    }

    public static final void U6(bj5.r0 r0Var, int i17, int i18) {
        b93.q qVar = b93.q.f100138a;
        int intValue = ((java.lang.Number) ((jz5.n) r0Var.f102754e).mo141623x754a37bb()).intValue();
        int intValue2 = ((java.lang.Number) ((jz5.n) r0Var.f102755f).mo141623x754a37bb()).intValue();
        java.lang.String str = (java.lang.String) ((jz5.n) r0Var.f102753d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "<get-sessionId>(...)");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("bottom_panel_omit_cnt", r0Var.f102759m);
        jSONObject.put("if_extend_panel", r0Var.f102758i ? 1 : 0);
        jSONObject.put("half_panel_omit_cnt", r0Var.f102760n);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        int i19 = r0Var.f102757h;
        jz5.g gVar = r0Var.f102756g;
        qVar.a(i17, 1, intValue, intValue2, str, jSONObject2, i19, 0, ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), i18 + ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
        java.util.ArrayList arrayList = r0Var.f102761o;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6762x6c7edd31) it.next()).f140887d = i17;
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6762x6c7edd31 c6762x6c7edd31 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6762x6c7edd31) it6.next();
            c6762x6c7edd31.k();
            java.lang.String n17 = c6762x6c7edd31.n();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactReporter", "report%s %s", 29308, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo64405x4dab7448(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
        }
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new bj5.l0(this));
        }
    }
}
