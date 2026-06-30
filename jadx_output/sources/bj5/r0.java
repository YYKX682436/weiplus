package bj5;

/* loaded from: classes.dex */
public final class r0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f21220d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f21221e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f21222f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f21223g;

    /* renamed from: h, reason: collision with root package name */
    public int f21224h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21225i;

    /* renamed from: m, reason: collision with root package name */
    public int f21226m;

    /* renamed from: n, reason: collision with root package name */
    public int f21227n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f21228o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        jz5.h.b(new bj5.q0(this));
        this.f21220d = jz5.h.b(new bj5.p0(this));
        this.f21221e = jz5.h.b(new bj5.n0(this));
        this.f21222f = jz5.h.b(new bj5.o0(this));
        this.f21223g = jz5.h.b(new bj5.m0(this));
        this.f21228o = new java.util.ArrayList();
    }

    public static final com.tencent.mm.autogen.mmdata.rpt.MultiSelectContactsReportStruct T6(bj5.r0 r0Var, int i17, int i18, int i19) {
        int intValue = ((java.lang.Number) ((jz5.n) r0Var.f21222f).getValue()).intValue();
        java.lang.String str = (java.lang.String) ((jz5.n) r0Var.f21220d).getValue();
        kotlin.jvm.internal.o.f(str, "<get-sessionId>(...)");
        com.tencent.mm.autogen.mmdata.rpt.MultiSelectContactsReportStruct multiSelectContactsReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MultiSelectContactsReportStruct();
        multiSelectContactsReportStruct.f59355e = 1;
        multiSelectContactsReportStruct.f59356f = i17;
        multiSelectContactsReportStruct.f59357g = intValue;
        multiSelectContactsReportStruct.f59358h = multiSelectContactsReportStruct.b("friend_selector_page_sessionid", str, true);
        multiSelectContactsReportStruct.f59360j = i18;
        multiSelectContactsReportStruct.f59361k = i19;
        return multiSelectContactsReportStruct;
    }

    public static final void U6(bj5.r0 r0Var, int i17, int i18) {
        b93.q qVar = b93.q.f18605a;
        int intValue = ((java.lang.Number) ((jz5.n) r0Var.f21221e).getValue()).intValue();
        int intValue2 = ((java.lang.Number) ((jz5.n) r0Var.f21222f).getValue()).intValue();
        java.lang.String str = (java.lang.String) ((jz5.n) r0Var.f21220d).getValue();
        kotlin.jvm.internal.o.f(str, "<get-sessionId>(...)");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("bottom_panel_omit_cnt", r0Var.f21226m);
        jSONObject.put("if_extend_panel", r0Var.f21225i ? 1 : 0);
        jSONObject.put("half_panel_omit_cnt", r0Var.f21227n);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        int i19 = r0Var.f21224h;
        jz5.g gVar = r0Var.f21223g;
        qVar.a(i17, 1, intValue, intValue2, str, jSONObject2, i19, 0, ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), i18 + ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
        java.util.ArrayList arrayList = r0Var.f21228o;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.autogen.mmdata.rpt.MultiSelectContactsReportStruct) it.next()).f59354d = i17;
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.autogen.mmdata.rpt.MultiSelectContactsReportStruct multiSelectContactsReportStruct = (com.tencent.mm.autogen.mmdata.rpt.MultiSelectContactsReportStruct) it6.next();
            multiSelectContactsReportStruct.k();
            java.lang.String n17 = multiSelectContactsReportStruct.n();
            kotlin.jvm.internal.o.f(n17, "toShowString(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactReporter", "report%s %s", 29308, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setActionbarColor(getResources().getColor(com.tencent.mm.R.color.BW_93));
        }
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new bj5.l0(this));
        }
    }
}
