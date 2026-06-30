package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class v implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.w f64586a;

    public v(com.tencent.mm.chatroom.ui.w wVar) {
        this.f64586a = wVar;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("exit_group_or_del_contact_with_clear_history_or_not", java.lang.Integer.valueOf(this.f64586a.f64611a.f63692g ? 1 : 2));
        return hashMap;
    }
}
