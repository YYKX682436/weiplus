package s14;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.AbstractActivityC17490x3b7be062 f483678d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.AbstractActivityC17490x3b7be062 abstractActivityC17490x3b7be062) {
        this.f483678d = abstractActivityC17490x3b7be062;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI$initTitleView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f483678d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI$initTitleView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
