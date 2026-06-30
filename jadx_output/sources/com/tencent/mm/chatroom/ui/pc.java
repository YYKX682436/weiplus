package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class pc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.rc f64431d;

    public pc(com.tencent.mm.chatroom.ui.rc rcVar) {
        this.f64431d = rcVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.chatroom.ui.rc rcVar = this.f64431d;
        com.tencent.mm.chatroom.ui.SelectDelMemberUI selectDelMemberUI = rcVar.f64486d;
        int i18 = com.tencent.mm.chatroom.ui.SelectDelMemberUI.f63967v;
        selectDelMemberUI.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(selectDelMemberUI.f63981q);
        intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
        com.tencent.mm.chatroom.ui.SelectDelMemberUI selectDelMemberUI2 = rcVar.f64486d;
        selectDelMemberUI2.setResult(-1, intent);
        selectDelMemberUI2.finish();
    }
}
