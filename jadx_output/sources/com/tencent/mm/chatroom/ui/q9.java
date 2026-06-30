package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class q9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI f64459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI) {
        super(0);
        this.f64459d = roomStillNotifyMessageManagerUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f64459d.getPreferenceScreen()).h("still_notify_message_at_me_pref");
        if (h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference) {
            return (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17;
        }
        return null;
    }
}
