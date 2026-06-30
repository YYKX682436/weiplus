package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomManagerUI f64519d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI) {
        super(0);
        this.f64519d = chatroomManagerUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.preference.r preferenceScreen = this.f64519d.getPreferenceScreen();
        com.tencent.mm.ui.base.preference.Preference h17 = preferenceScreen != null ? ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("use_wework_manager_room_key") : null;
        if (h17 instanceof com.tencent.mm.plugin.newtips.NewTipPreference) {
            return (com.tencent.mm.plugin.newtips.NewTipPreference) h17;
        }
        return null;
    }
}
