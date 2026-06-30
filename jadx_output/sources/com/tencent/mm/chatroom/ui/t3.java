package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class t3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f64522d;

    public t3(com.tencent.mm.chatroom.ui.GroupToolsManagereUI groupToolsManagereUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f64522d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.modelbase.m1 m1Var = this.f64522d;
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "dialog onCancel scene:%s", java.lang.Integer.valueOf(m1Var.getType()));
        gm0.j1.d().d(m1Var);
    }
}
