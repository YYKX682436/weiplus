package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes3.dex */
public class c5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14 f224307d;

    public c5(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14 activityC16146xeed29e14) {
        this.f224307d = activityC16146xeed29e14;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14 activityC16146xeed29e14 = this.f224307d;
        activityC16146xeed29e14.A.f442284d++;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(257L, 1L, 1L, true);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_EXCHANGE_RECORD_SHOW_REDDOT_BOOLEAN, java.lang.Boolean.FALSE);
        activityC16146xeed29e14.f224237u.setVisibility(8);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", activityC16146xeed29e14.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3q));
        intent.putExtra("showShare", false);
        j45.l.j(activityC16146xeed29e14, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
