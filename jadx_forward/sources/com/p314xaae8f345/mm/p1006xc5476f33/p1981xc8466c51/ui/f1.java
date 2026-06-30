package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes9.dex */
public class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 f236920d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace7680) {
        this.f236920d = activityC16969x3ace7680;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordMsgFileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680.H;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace7680 = this.f236920d;
        activityC16969x3ace7680.Y6();
        r45.gp0 gp0Var = activityC16969x3ace7680.f236833v;
        java.lang.String str = activityC16969x3ace7680.f236831t;
        long j17 = activityC16969x3ace7680.f236830s;
        kk.j jVar = bt3.g2.f105811a;
        if (gp0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "try pause download data fail, dataitem is null");
        } else {
            zs3.y D0 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(bt3.g2.y(gp0Var.T, str, j17, true));
            bt3.p1 p1Var = (bt3.p1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).aj();
            p1Var.getClass();
            if (D0 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgCDNService", "cancelJob info null");
            } else {
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(D0.f68324xaca5bdda);
                boolean mo9951xb06685ab = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).mo9951xb06685ab(D0, dm.i4.f66867x2a5c95c7);
                p1Var.f105841e.remove(D0);
                p1Var.f105840d.remove(D0.mo179386xb5884f29());
                p1Var.a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgCDNService", "cancelJob result:%s, mediaId:%s", java.lang.Boolean.valueOf(mo9951xb06685ab), D0.f68324xaca5bdda);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
