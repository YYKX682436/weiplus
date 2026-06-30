package cl4;

/* loaded from: classes11.dex */
public final class b implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.a5 f42937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42939c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f42940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42941e;

    public b(com.tencent.mm.pluginsdk.model.app.a5 a5Var, int i17, int i18, bw5.lp0 lp0Var, java.lang.String str) {
        this.f42937a = a5Var;
        this.f42938b = i17;
        this.f42939c = i18;
        this.f42940d = lp0Var;
        this.f42941e = str;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public final void a(boolean z17, boolean z18) {
        com.tencent.mm.pluginsdk.model.app.a5 a5Var = this.f42937a;
        if (a5Var != null) {
            a5Var.a(z17, z18);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (z17) {
            jSONObject.put("leave_click_option", 2);
        } else if (z18) {
            jSONObject.put("leave_click_option", 1);
        }
        int ordinal = com.tencent.pigeon.ting.Open3rdAppFromSource.PLAYER.ordinal();
        int i17 = this.f42938b;
        if (i17 == ordinal) {
            jSONObject.put("leave_click_from", 1);
        } else if (i17 == com.tencent.pigeon.ting.Open3rdAppFromSource.MENU.ordinal()) {
            jSONObject.put("leave_click_from", 2);
        }
        int i18 = this.f42939c;
        jSONObject.put("from_scene", i18);
        java.lang.String str = this.f42941e;
        cl4.a aVar = new cl4.a(jSONObject, str);
        jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
        if (Zi != null) {
            ((jm4.k4) Zi).d(bw5.yq0.TingReportAction_ClickTo3rdAppJumpWindowLeaveTytToOtherApp, bw5.ar0.TingScene_Player, this.f42940d, null, aVar);
        }
        if (z18) {
            return;
        }
        cl4.f.f42947a.c(str, this.f42940d, i18);
    }
}
