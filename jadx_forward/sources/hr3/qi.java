package hr3;

/* loaded from: classes4.dex */
public class qi implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16873xf6974558 f365463d;

    public qi(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16873xf6974558 activityC16873xf6974558) {
        this.f365463d = activityC16873xf6974558;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/WxaBindBizInfoUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11826x30fe0b2d c11826x30fe0b2d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11826x30fe0b2d) adapterView.getAdapter().getItem(i17);
        if (c11826x30fe0b2d == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/WxaBindBizInfoUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", c11826x30fe0b2d.f158962d);
        intent.putExtra("key_start_biz_profile_from_app_brand_profile", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("force_get_contact", true);
        j45.l.j(this.f365463d, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/WxaBindBizInfoUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
