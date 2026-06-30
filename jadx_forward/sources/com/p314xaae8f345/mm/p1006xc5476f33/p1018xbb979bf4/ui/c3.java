package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes12.dex */
public class c3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a f156062d;

    public c3(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a) {
        this.f156062d = activityC11497x3bc191a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a = this.f156062d;
        java.lang.String string = activityC11497x3bc191a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571469fz, activityC11497x3bc191a.f156031q.m143587x9616526c());
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a2 = this.f156062d;
        db5.e1.K(activityC11497x3bc191a, true, string, "", activityC11497x3bc191a2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571470g0), activityC11497x3bc191a2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.b3(this), null);
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
