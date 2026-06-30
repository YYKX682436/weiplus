package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f64237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.k f64238e;

    public j(com.tencent.mm.chatroom.ui.k kVar, java.util.List list) {
        this.f64238e = kVar;
        this.f64237d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.k kVar = this.f64238e;
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = kVar.f64262d;
        int i17 = chatroomInfoUI.C;
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI2 = kVar.f64262d;
        if (i17 <= 1) {
            ((com.tencent.mm.ui.base.preference.h0) chatroomInfoUI.f63693h).m("del_selector_btn", true);
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = chatroomInfoUI2.f63701s;
            contactListExpandPreference.T(true);
            contactListExpandPreference.V(false);
            contactListExpandPreference.Y(false);
        } else {
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference2 = chatroomInfoUI.f63701s;
            contactListExpandPreference2.T(true);
            contactListExpandPreference2.V(chatroomInfoUI2.p7());
            contactListExpandPreference2.Y(false);
        }
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference3 = chatroomInfoUI2.f63701s;
        java.lang.String str = chatroomInfoUI2.A;
        boolean z17 = chatroomInfoUI2.f63696n;
        r35.e2 e2Var = new r35.e2() { // from class: com.tencent.mm.chatroom.ui.j$$a
            @Override // r35.e2
            public final void a() {
                final com.tencent.mm.chatroom.ui.j jVar = com.tencent.mm.chatroom.ui.j.this;
                jVar.getClass();
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.chatroom.ui.j$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.chatroom.ui.j jVar2 = com.tencent.mm.chatroom.ui.j.this;
                        jVar2.getClass();
                        r35.v1.L = r35.v1.K;
                        com.tencent.mm.chatroom.ui.k kVar2 = jVar2.f64238e;
                        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI3 = kVar2.f64262d;
                        boolean z18 = com.tencent.mm.chatroom.ui.ChatroomInfoUI.Y;
                        chatroomInfoUI3.y7();
                        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI4 = kVar2.f64262d;
                        chatroomInfoUI4.t7();
                        chatroomInfoUI4.l7();
                    }
                });
            }
        };
        lz.f fVar = contactListExpandPreference3.M;
        if (fVar != null) {
            r35.u1 u1Var = (r35.u1) fVar;
            u1Var.f369278j = str;
            java.util.List list = this.f64237d;
            if (list == null) {
                list = new java.util.ArrayList(0);
            }
            r35.v1 v1Var = u1Var.f369274f;
            v1Var.f369307z = true;
            v1Var.f369290f = list;
            v1Var.F = z17;
            v1Var.f369289e = e2Var;
            u1Var.a(str);
        }
        chatroomInfoUI2.f63701s.W(true);
        chatroomInfoUI2.getListView().postOnAnimation(new java.lang.Runnable() { // from class: com.tencent.mm.chatroom.ui.j$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.chatroom.ui.k kVar2 = com.tencent.mm.chatroom.ui.j.this.f64238e;
                kVar2.f64262d.getListView().smoothScrollToPositionFromTop(((com.tencent.mm.ui.base.preference.h0) kVar2.f64262d.f63693h).o("roominfo_contact_anchor"), 0, 0);
            }
        });
    }
}
