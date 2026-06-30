package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes3.dex */
public class p8 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.C10354x65bd049d f145960a;

    public p8(com.p314xaae8f345.mm.p648x55baa833.ui.C10354x65bd049d c10354x65bd049d) {
        this.f145960a = c10354x65bd049d;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (u46.l.c(str, "view_clk")) {
            hashMap.put("exit_group_or_del_contact_with_clear_history_or_not", java.lang.Integer.valueOf(this.f145960a.L ? 2 : 1));
        }
        return hashMap;
    }
}
