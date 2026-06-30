package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f64194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.i f64195e;

    public h(com.tencent.mm.chatroom.ui.i iVar, java.util.List list) {
        this.f64195e = iVar;
        this.f64194d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.i iVar = this.f64195e;
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = iVar.f64215d;
        if (chatroomInfoUI.C <= 1) {
            ((com.tencent.mm.ui.base.preference.h0) chatroomInfoUI.f63693h).m("del_selector_btn", true);
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = iVar.f64215d.f63701s;
            contactListExpandPreference.T(true);
            contactListExpandPreference.V(false);
            contactListExpandPreference.Y(false);
        } else {
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference2 = chatroomInfoUI.f63701s;
            contactListExpandPreference2.T(true);
            contactListExpandPreference2.V(iVar.f64215d.p7());
            contactListExpandPreference2.Y(false);
        }
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI2 = iVar.f64215d;
        chatroomInfoUI2.f63701s.O(chatroomInfoUI2.A, this.f64194d, chatroomInfoUI2.f63696n);
        iVar.f64215d.f63701s.W(true);
    }
}
