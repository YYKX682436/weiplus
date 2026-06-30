package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes11.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug3.k f269602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f269603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 f269604f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f269605g;

    public w(ug3.k kVar, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 k0Var, int i17) {
        this.f269602d = kVar;
        this.f269603e = z17;
        this.f269604f = k0Var;
        this.f269605g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f269602d.f474004n);
        sb6.append(", show/hide card, isShow:");
        boolean z17 = this.f269603e;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginDeviceAdapter", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.r rVar = this.f269604f.f269555e;
        if (rVar != null) {
            int i17 = z17 ? -1 : this.f269605g;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19504xce272b91) rVar).T6().mo7946xf939df19();
            com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.m mVar = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.m ? (com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.m) mo7946xf939df19 : null;
            if (mVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginDeviceAdapter", "setSelection:" + i17 + ", oriSelection:" + mVar.f269578e);
                if (mVar.f269578e != i17) {
                    mVar.f269578e = i17;
                    mVar.m8146xced61ae5();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
