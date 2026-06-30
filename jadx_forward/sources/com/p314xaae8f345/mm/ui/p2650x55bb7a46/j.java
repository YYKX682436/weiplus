package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes12.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 f283395d;

    public j(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d6) {
        this.f283395d = activityC21601xaeea84d6;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d6 = this.f283395d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppAttachNewDownloadUI", "summerapp roundProgressBar downloadAppAttachScene[%s]", activityC21601xaeea84d6.f279645q);
        bt3.l0 l0Var = activityC21601xaeea84d6.f279645q;
        if (l0Var != null) {
            l0Var.M(activityC21601xaeea84d6);
            gm0.j1.d().d(activityC21601xaeea84d6.f279645q);
            activityC21601xaeea84d6.f279645q = null;
            activityC21601xaeea84d6.y7(15, -1);
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d c76 = activityC21601xaeea84d6.c7();
            if (c76 != null) {
                long j17 = c76.f68112x10a0fed7;
                if (j17 != 199) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppAttachNewDownloadUI", "summerapp roundProgressBar onClick but scene is null and set status[%d] paused", java.lang.Long.valueOf(j17));
                    c76.f68112x10a0fed7 = 102L;
                    c76.f68103x4a777c2 = c01.id.e();
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(c76, new java.lang.String[0]);
                    activityC21601xaeea84d6.y7(15, -1);
                }
            }
            d35.h.f307877a.a(activityC21601xaeea84d6.f279650v);
        }
        activityC21601xaeea84d6.E7(false);
        com.p314xaae8f345.mm.ui.p2731xc84c5534.b.f291152a.c(activityC21601xaeea84d6.f279650v, null, null, 2, false, false);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
