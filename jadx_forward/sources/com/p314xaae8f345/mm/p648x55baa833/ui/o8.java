package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class o8 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.C10353x726ccc8 f145943a;

    public o8(com.p314xaae8f345.mm.p648x55baa833.ui.C10353x726ccc8 c10353x726ccc8) {
        this.f145943a = c10353x726ccc8;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (u46.l.c(str, "view_clk")) {
            hashMap.put("exit_group_or_del_contact_with_clear_history_or_not", java.lang.Integer.valueOf(this.f145943a.W ? 2 : 1));
        }
        return hashMap;
    }
}
