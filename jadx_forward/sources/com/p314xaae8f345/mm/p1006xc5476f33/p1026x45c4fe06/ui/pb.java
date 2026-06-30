package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public final class pb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12693xccd93dc7 f171457d;

    public pb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12693xccd93dc7 activityC12693xccd93dc7) {
        this.f171457d = activityC12693xccd93dc7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI$initVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12693xccd93dc7 activityC12693xccd93dc7 = this.f171457d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC12693xccd93dc7.f171002d, "hy: request start to appid " + activityC12693xccd93dc7.f171011p);
        pt0.e0 e0Var = pt0.f0.f439742b1;
        java.lang.String str = activityC12693xccd93dc7.f171013r;
        java.lang.Long l17 = activityC12693xccd93dc7.f171012q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(str, l17.longValue());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", 11);
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(n17.I0()));
        bundle.putString("stat_chat_talker_username", activityC12693xccd93dc7.f171013r);
        bundle.putString("stat_send_msg_user", activityC12693xccd93dc7.f171014s);
        java.lang.String str2 = activityC12693xccd93dc7.f171013r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        java.lang.String str3 = activityC12693xccd93dc7.f171014s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        k01.f.i(str2, str3, 1136, null, ot0.q.v(n17.j()), bundle);
        activityC12693xccd93dc7.T6(5);
        activityC12693xccd93dc7.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI$initVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
