package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class o4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f64404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI f64405e;

    public o4(com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI managerRoomByWeworkUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f64405e = managerRoomByWeworkUI;
        this.f64404d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.modelbase.m1 m1Var = this.f64404d;
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ManagerRoomByWeworkUI", "dialog onCancel scene is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ManagerRoomByWeworkUI", "dialog onCancel scene:%s", java.lang.Integer.valueOf(m1Var.getType()));
        gm0.j1.d().d(m1Var);
        if (m1Var instanceof kn.r) {
            this.f64405e.finish();
        }
    }
}
