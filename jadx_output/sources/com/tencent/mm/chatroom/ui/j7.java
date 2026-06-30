package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class j7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.m7 f64252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f64253e;

    public j7(com.tencent.mm.chatroom.ui.m7 m7Var, android.view.View view) {
        this.f64252d = m7Var;
        this.f64253e = view;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.util.List list = this.f64252d.f64364e;
        android.view.View view = this.f64253e;
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        ((dm.w9) list.get(((java.lang.Integer) tag).intValue())).deleteFromDB(gm0.j1.u().f273153f, true);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("base_chatroom_invite_manage_delete", view, new java.util.HashMap(), 25772);
    }
}
