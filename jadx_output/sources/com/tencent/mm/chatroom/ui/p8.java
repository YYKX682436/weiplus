package com.tencent.mm.chatroom.ui;

/* loaded from: classes3.dex */
public class p8 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomClearHistoryPreference f64427a;

    public p8(com.tencent.mm.chatroom.ui.RoomClearHistoryPreference roomClearHistoryPreference) {
        this.f64427a = roomClearHistoryPreference;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (u46.l.c(str, "view_clk")) {
            hashMap.put("exit_group_or_del_contact_with_clear_history_or_not", java.lang.Integer.valueOf(this.f64427a.L ? 2 : 1));
        }
        return hashMap;
    }
}
