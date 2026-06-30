package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class s9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI f64512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI) {
        super(0);
        this.f64512d = roomStillNotifyMessageManagerUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.preference.r preferenceScreen = this.f64512d.getPreferenceScreen();
        com.tencent.mm.ui.base.preference.Preference h17 = preferenceScreen != null ? ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("still_notify_message_follow_member") : null;
        if (h17 instanceof com.tencent.mm.chatroom.ui.preference.StillNotifyMessageManagerFollowMemberPreference) {
            return (com.tencent.mm.chatroom.ui.preference.StillNotifyMessageManagerFollowMemberPreference) h17;
        }
        return null;
    }
}
