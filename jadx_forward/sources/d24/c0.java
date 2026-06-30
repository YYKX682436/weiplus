package d24;

/* loaded from: classes5.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 f307441d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 c17513xe6a0fae1) {
        this.f307441d = c17513xe6a0fae1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingButtonLogoutAccount$initFingerprintEntry$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        v61.d.g("fingerprint_login_logout", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1.y7(this.f307441d, "SettingGroup_Main_AccountInfo_Fingerprint");
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingButtonLogoutAccount$initFingerprintEntry$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
