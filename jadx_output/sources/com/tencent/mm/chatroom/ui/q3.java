package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class q3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.GroupToolsManagereUI f64439d;

    public q3(com.tencent.mm.chatroom.ui.GroupToolsManagereUI groupToolsManagereUI) {
        this.f64439d = groupToolsManagereUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "back_dialot ok");
        com.tencent.mm.chatroom.ui.GroupToolsManagereUI groupToolsManagereUI = this.f64439d;
        kn.m0.a(groupToolsManagereUI.f63782r, 2, groupToolsManagereUI.f63784t, groupToolsManagereUI.f63780p.f397604t.size());
        groupToolsManagereUI.finish();
    }
}
