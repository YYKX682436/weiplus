package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class l5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.x5 f64301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f64302e;

    public l5(com.tencent.mm.chatroom.ui.x5 x5Var, android.view.View view) {
        this.f64301d = x5Var;
        this.f64302e = view;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMMMenuItemSelected : id=");
        sb6.append(menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null);
        sb6.append(", index=");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", sb6.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "onMMMenuItemSelected : delete");
        java.util.List list = this.f64301d.f64648e;
        java.lang.Object tag = this.f64302e.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        ((dm.w9) list.get(((java.lang.Integer) tag).intValue())).deleteFromDB(gm0.j1.u().f273153f, true);
    }
}
