package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class y8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f64686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.z8 f64687e;

    public y8(com.tencent.mm.chatroom.ui.z8 z8Var, android.app.ProgressDialog progressDialog) {
        this.f64687e = z8Var;
        this.f64686d = progressDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.app.ProgressDialog progressDialog = this.f64686d;
        progressDialog.show();
        com.tencent.mm.chatroom.ui.RoomInfoDetailUI roomInfoDetailUI = this.f64687e.f64722a;
        roomInfoDetailUI.f63853q = false;
        com.tencent.mm.chatroom.ui.RoomInfoDetailUI.V6(roomInfoDetailUI, progressDialog);
    }
}
