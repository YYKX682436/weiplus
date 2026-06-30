package d24;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17510x3aecf297 f307439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f307440e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17510x3aecf297 c17510x3aecf297, in5.s0 s0Var) {
        this.f307439d = c17510x3aecf297;
        this.f307440e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingAdditionBottom$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f307440e.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17510x3aecf297 c17510x3aecf297 = this.f307439d;
        c17510x3aecf297.getClass();
        c17510x3aecf297.y7(context, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_settings_privacy_third_party_list_url, "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=datalist/shared", true));
        c17510x3aecf297.u7(c17510x3aecf297.m158359x1e885992(), "SettingGroup_Main_Bottom_ThirdPartyList");
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingAdditionBottom$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
