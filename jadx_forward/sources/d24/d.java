package d24;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f307442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17511xb64fae01 f307443e;

    public d(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17511xb64fae01 c17511xb64fae01) {
        this.f307442d = s0Var;
        this.f307443e = c17511xb64fae01;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingAdditionHeaderSearch$onBindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Map k17 = kz5.c1.k(new jz5.l("setting_sessionid", u24.n.b()), new jz5.l("ui_version", 2), new jz5.l("view_id", "setting_search_bar"));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.lang.Integer REPORT_RULE = b24.a.f98927a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(REPORT_RULE, "REPORT_RULE");
        ((cy1.a) rVar).Ej("view_clk", k17, REPORT_RULE.intValue());
        j45.l.j(this.f307442d.f374654e, "setting", ".ui.setting_new.SearchSettingsUI", new android.content.Intent().putExtra("setting_page_time", java.lang.String.valueOf(c01.id.c())).putExtra("setting_from_source", this.f307443e.m158354x19263085().getIntent().getIntExtra("setting_from_source", 2)), null);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingAdditionHeaderSearch$onBindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
