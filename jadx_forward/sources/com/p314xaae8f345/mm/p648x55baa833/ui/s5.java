package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class s5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.x5 f146034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f146035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 f146036f;

    public s5(com.p314xaae8f345.mm.p648x55baa833.ui.x5 x5Var, android.view.View view, com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 activityC10349x67700120) {
        this.f146034d = x5Var;
        this.f146035e = view;
        this.f146036f = activityC10349x67700120;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMMMenuItemSelected : id=");
        sb6.append(menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null);
        sb6.append(", index=");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", sb6.toString());
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        android.view.View view = this.f146035e;
        com.p314xaae8f345.mm.p648x55baa833.ui.x5 x5Var = this.f146034d;
        if (valueOf == null || valueOf.intValue() != 0) {
            if (valueOf != null && valueOf.intValue() == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "onMMMenuItemSelected : delete");
                java.util.List list = x5Var.f146181e;
                java.lang.Object tag = view.getTag();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
                ((dm.w9) list.get(((java.lang.Integer) tag).intValue())).m125664xbc662333(gm0.j1.u().f354686f, true);
                return;
            }
            return;
        }
        in.b bVar = new in.b();
        java.util.List list2 = x5Var.f146181e;
        java.lang.Object tag2 = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type kotlin.Int");
        bVar.mo11468x92b714fd(((dm.w9) list2.get(((java.lang.Integer) tag2).intValue())).f69026x225a93cf);
        java.util.List list3 = x5Var.f146181e;
        java.lang.Object tag3 = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag3, "null cannot be cast to non-null type kotlin.Int");
        java.lang.String str = ((dm.w9) list3.get(((java.lang.Integer) tag3).intValue())).f69025x3b2058a3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "onMMMenuItemSelected : revoke");
        android.content.Context context = x5Var.f146185i;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, false, null);
        com.p314xaae8f345.mm.p648x55baa833.ui.x5 x5Var2 = this.f146034d;
        v65.i.b(x5Var2.f146182f, null, new com.p314xaae8f345.mm.p648x55baa833.ui.r5(str, bVar, Q, x5Var2, this.f146036f, null), 1, null);
    }
}
