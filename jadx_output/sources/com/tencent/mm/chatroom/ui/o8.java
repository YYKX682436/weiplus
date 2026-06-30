package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class o8 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomButtonPreference f64410a;

    public o8(com.tencent.mm.chatroom.ui.RoomButtonPreference roomButtonPreference) {
        this.f64410a = roomButtonPreference;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (u46.l.c(str, "view_clk")) {
            hashMap.put("exit_group_or_del_contact_with_clear_history_or_not", java.lang.Integer.valueOf(this.f64410a.W ? 2 : 1));
        }
        return hashMap;
    }
}
