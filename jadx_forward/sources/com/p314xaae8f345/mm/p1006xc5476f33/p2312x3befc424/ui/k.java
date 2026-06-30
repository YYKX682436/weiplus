package com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui;

/* loaded from: classes.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18769x42826674 f256861d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18769x42826674 activityC18769x42826674) {
        this.f256861d = activityC18769x42826674;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18769x42826674 activityC18769x42826674 = this.f256861d;
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, activityC18769x42826674.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hlr));
        intent.putExtra("rawUrl", activityC18769x42826674.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4f, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.e()));
        intent.putExtra("showShare", false);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent, activityC18769x42826674.mo55332x76847179());
        yj0.a.h(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
