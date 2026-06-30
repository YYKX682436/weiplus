package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class l5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.x5 f145834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f145835e;

    public l5(com.p314xaae8f345.mm.p648x55baa833.ui.x5 x5Var, android.view.View view) {
        this.f145834d = x5Var;
        this.f145835e = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMMMenuItemSelected : id=");
        sb6.append(menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null);
        sb6.append(", index=");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "onMMMenuItemSelected : delete");
        java.util.List list = this.f145834d.f146181e;
        java.lang.Object tag = this.f145835e.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        ((dm.w9) list.get(((java.lang.Integer) tag).intValue())).m125664xbc662333(gm0.j1.u().f354686f, true);
    }
}
