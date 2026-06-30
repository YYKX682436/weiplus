package o24;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2076x229fdf4d.C17635x14f80d0b f423989d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2076x229fdf4d.C17635x14f80d0b c17635x14f80d0b) {
        this.f423989d = c17635x14f80d0b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemAvatar$avatarOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f423989d.N7();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemAvatar$avatarOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
