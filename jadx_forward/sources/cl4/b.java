package cl4;

/* loaded from: classes11.dex */
public final class b implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 f124470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f124471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f124472c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f124473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124474e;

    public b(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var, int i17, int i18, bw5.lp0 lp0Var, java.lang.String str) {
        this.f124470a = a5Var;
        this.f124471b = i17;
        this.f124472c = i18;
        this.f124473d = lp0Var;
        this.f124474e = str;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5
    public final void a(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var = this.f124470a;
        if (a5Var != null) {
            a5Var.a(z17, z18);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (z17) {
            jSONObject.put("leave_click_option", 2);
        } else if (z18) {
            jSONObject.put("leave_click_option", 1);
        }
        int ordinal = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24966xe2a7622b.f44747x8cd18ee1.ordinal();
        int i17 = this.f124471b;
        if (i17 == ordinal) {
            jSONObject.put("leave_click_from", 1);
        } else if (i17 == com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24966xe2a7622b.f44746x240d5f.ordinal()) {
            jSONObject.put("leave_click_from", 2);
        }
        int i18 = this.f124472c;
        jSONObject.put("from_scene", i18);
        java.lang.String str = this.f124474e;
        cl4.a aVar = new cl4.a(jSONObject, str);
        jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
        if (Zi != null) {
            ((jm4.k4) Zi).d(bw5.yq0.TingReportAction_ClickTo3rdAppJumpWindowLeaveTytToOtherApp, bw5.ar0.TingScene_Player, this.f124473d, null, aVar);
        }
        if (z18) {
            return;
        }
        cl4.f.f124480a.c(str, this.f124473d, i18);
    }
}
