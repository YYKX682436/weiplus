package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI.AnonymousClass3 f64122d;

    public e0(com.tencent.mm.chatroom.ui.ChatroomInfoUI.AnonymousClass3 anonymousClass3) {
        this.f64122d = anonymousClass3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.ChatroomInfoUI.AnonymousClass3 anonymousClass3 = this.f64122d;
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = com.tencent.mm.chatroom.ui.ChatroomInfoUI.this;
        chatroomInfoUI.f63691f = true;
        chatroomInfoUI.m7();
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI2 = com.tencent.mm.chatroom.ui.ChatroomInfoUI.this;
        if (chatroomInfoUI2.f63701s != null) {
            chatroomInfoUI2.f63693h = chatroomInfoUI2.getPreferenceScreen();
            com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI3 = com.tencent.mm.chatroom.ui.ChatroomInfoUI.this;
            ((com.tencent.mm.ui.base.preference.h0) chatroomInfoUI3.f63693h).v(chatroomInfoUI3.f63701s);
            lz.f fVar = com.tencent.mm.chatroom.ui.ChatroomInfoUI.this.f63701s.M;
            if (fVar != null) {
                ((r35.u1) fVar).f369279k = true;
                java.util.Iterator it = ((r35.u1) fVar).f369272d.values().iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.ui.base.preference.h0) com.tencent.mm.chatroom.ui.ChatroomInfoUI.this.f63693h).v((com.tencent.mm.ui.base.preference.Preference) it.next());
                }
            }
        }
    }
}
