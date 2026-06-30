package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes3.dex */
public class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15610xa65f7d9f f219675d;

    public p3(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15610xa65f7d9f activityC15610xa65f7d9f) {
        this.f219675d = activityC15610xa65f7d9f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15610xa65f7d9f.f219532v;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15610xa65f7d9f activityC15610xa65f7d9f = this.f219675d;
        activityC15610xa65f7d9f.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSServiceNotifyUI", "onSearchDateDetail");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("detail_username", "gh_3dfda90e39d6");
        j45.l.u(activityC15610xa65f7d9f, "com.tencent.mm.chatroom.ui.SelectDateUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27229, 1, 3, "", 0, 0, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
