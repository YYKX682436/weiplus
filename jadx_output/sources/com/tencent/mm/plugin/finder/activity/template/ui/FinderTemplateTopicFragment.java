package com.tencent.mm.plugin.finder.activity.template.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/template/ui/FinderTemplateTopicFragment;", "Lcom/tencent/mm/plugin/finder/activity/fragment/FinderActivityFragment;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderTemplateTopicFragment extends com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment {

    /* renamed from: w, reason: collision with root package name */
    public final r45.r03 f101803w;

    public FinderTemplateTopicFragment(r45.r03 topicInfo) {
        kotlin.jvm.internal.o.g(topicInfo, "topicInfo");
        this.f101803w = topicInfo;
    }

    @Override // com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment, com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, oa2.y.class});
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        r45.rz6 rz6Var;
        super.onCreate(bundle);
        com.tencent.mm.plugin.finder.viewmodel.component.ut utVar = (com.tencent.mm.plugin.finder.viewmodel.component.ut) pf5.z.f353948a.b(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class);
        r45.r03 r03Var = this.f101803w;
        utVar.P6("topicId", pm0.v.u(r03Var.getLong(1)));
        r45.r23 r23Var = (r45.r23) r03Var.getCustom(23);
        java.lang.String str = (r23Var == null || (rz6Var = (r45.rz6) r23Var.getCustom(1)) == null) ? null : rz6Var.f385320d;
        if (str == null) {
            str = "";
        }
        utVar.P6("templateid", str);
        utVar.O6("tab_type", this.f129265p);
        utVar.O6("enter_source", utVar.getActivity().getIntent().getIntExtra("key_entrance_source_type", 0));
    }

    @Override // com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        return 195;
    }

    @Override // com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment
    public com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC y0(androidx.fragment.app.FragmentActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(oa2.b0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC) a17;
    }
}
