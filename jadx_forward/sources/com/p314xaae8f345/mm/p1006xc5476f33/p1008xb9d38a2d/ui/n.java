package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e f155583d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e abstractActivityC11397xe10f852e) {
        this.f155583d = abstractActivityC11397xe10f852e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e abstractActivityC11397xe10f852e = this.f155583d;
        j45.l.h(abstractActivityC11397xe10f852e, "login_exdevice", ".ui.LoginAsExDeviceUI");
        abstractActivityC11397xe10f852e.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559343c4, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.J(1570L, 4L);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
