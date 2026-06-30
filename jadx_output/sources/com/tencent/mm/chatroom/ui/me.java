package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class me implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.TransferRoomOwnerUI f64379e;

    public me(com.tencent.mm.chatroom.ui.TransferRoomOwnerUI transferRoomOwnerUI, java.lang.String str) {
        this.f64379e = transferRoomOwnerUI;
        this.f64378d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.modelbase.m1 c0Var;
        com.tencent.mm.chatroom.ui.TransferRoomOwnerUI transferRoomOwnerUI = this.f64379e;
        boolean q47 = com.tencent.mm.storage.z3.q4(transferRoomOwnerUI.f63979o);
        java.lang.String str = this.f64378d;
        if (q47) {
            ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
            java.lang.String str2 = transferRoomOwnerUI.f63979o;
            ((za0.k) b0Var).getClass();
            c0Var = new l41.g0(str2, str);
        } else {
            c0Var = new kn.c0(transferRoomOwnerUI.f63979o, str);
        }
        gm0.j1.n().f273288b.g(c0Var);
        com.tencent.mm.chatroom.ui.TransferRoomOwnerUI transferRoomOwnerUI2 = this.f64379e;
        transferRoomOwnerUI2.f64006v = db5.e1.Q(transferRoomOwnerUI2, transferRoomOwnerUI2.getString(com.tencent.mm.R.string.f490573yv), transferRoomOwnerUI.getString(com.tencent.mm.R.string.i6r), true, false, null);
    }
}
