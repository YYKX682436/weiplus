package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e f155524d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e abstractActivityC11397xe10f852e) {
        this.f155524d = abstractActivityC11397xe10f852e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e abstractActivityC11397xe10f852e = this.f155524d;
        sb6.append(abstractActivityC11397xe10f852e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8k));
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e.e7(abstractActivityC11397xe10f852e, sb6.toString());
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
