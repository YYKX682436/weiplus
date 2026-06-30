package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class j7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.m7 f145785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f145786e;

    public j7(com.p314xaae8f345.mm.p648x55baa833.ui.m7 m7Var, android.view.View view) {
        this.f145785d = m7Var;
        this.f145786e = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.util.List list = this.f145785d.f145897e;
        android.view.View view = this.f145786e;
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        ((dm.w9) list.get(((java.lang.Integer) tag).intValue())).m125664xbc662333(gm0.j1.u().f354686f, true);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("base_chatroom_invite_manage_delete", view, new java.util.HashMap(), 25772);
    }
}
