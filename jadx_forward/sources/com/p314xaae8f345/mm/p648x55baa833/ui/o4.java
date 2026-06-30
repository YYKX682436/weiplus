package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public class o4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f145937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752 f145938e;

    public o4(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752 activityC10347x6bb1b752, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f145938e = activityC10347x6bb1b752;
        this.f145937d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f145937d;
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManagerRoomByWeworkUI", "dialog onCancel scene is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManagerRoomByWeworkUI", "dialog onCancel scene:%s", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        gm0.j1.d().d(m1Var);
        if (m1Var instanceof kn.r) {
            this.f145938e.finish();
        }
    }
}
