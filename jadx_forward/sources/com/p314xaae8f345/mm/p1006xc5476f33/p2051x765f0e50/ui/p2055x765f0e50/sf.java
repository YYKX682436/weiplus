package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public class sf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f243073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.uf f243074e;

    public sf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.uf ufVar, int i17) {
        this.f243074e = ufVar;
        this.f243073d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$AuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.uf ufVar = this.f243074e;
        int i17 = this.f243073d;
        if (ufVar.getItem(i17) != null) {
            k14.w wVar = new k14.w(ufVar.getItem(i17).f464093d, 1);
            android.app.ProgressDialog progressDialog = ufVar.f243144e.f242020g;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            gm0.j1.d().g(wVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17432x38b6fe4 activityC17432x38b6fe4 = ufVar.f243144e;
            activityC17432x38b6fe4.f242020g = db5.e1.Q(activityC17432x38b6fe4, "", activityC17432x38b6fe4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), false, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rf(this, wVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$AuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
