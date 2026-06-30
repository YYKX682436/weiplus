package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class o implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64399a;

    public o(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64399a = chatroomInfoUI;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("exit_group_or_del_contact_with_clear_history_or_not", java.lang.Integer.valueOf(this.f64399a.f63692g ? 1 : 2));
        return hashMap;
    }
}
