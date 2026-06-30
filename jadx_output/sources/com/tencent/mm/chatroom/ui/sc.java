package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class sc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.uc f64514d;

    public sc(com.tencent.mm.chatroom.ui.uc ucVar) {
        this.f64514d = ucVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.chatroom.ui.uc ucVar = this.f64514d;
        com.tencent.mm.chatroom.ui.SelectDelRoomManagerUI selectDelRoomManagerUI = ucVar.f64583d;
        int i18 = com.tencent.mm.chatroom.ui.SelectDelRoomManagerUI.f63968x;
        selectDelRoomManagerUI.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(selectDelRoomManagerUI.f63981q);
        intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
        com.tencent.mm.chatroom.ui.SelectDelRoomManagerUI selectDelRoomManagerUI2 = ucVar.f64583d;
        selectDelRoomManagerUI2.setResult(-1, intent);
        selectDelRoomManagerUI2.finish();
    }
}
