package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class g5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f64176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f64177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.x5 f64178c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f64179d;

    public g5(com.tencent.mm.ui.widget.dialog.u3 u3Var, android.view.View view, com.tencent.mm.chatroom.ui.x5 x5Var, int i17) {
        this.f64176a = u3Var;
        this.f64177b = view;
        this.f64178c = x5Var;
        this.f64179d = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f64176a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        tm.a b17 = tm.a.b(fVar.f70617c);
        android.view.View view = this.f64177b;
        if (b17 != null) {
            b17.c(view.getContext(), null, null);
        } else if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.chatroom.ui.x5 x5Var = this.f64178c;
            java.util.List list = x5Var.f64648e;
            int i17 = this.f64179d;
            ((dm.w9) list.get(i17)).field_state = 1;
            ((dm.w9) x5Var.f64648e.get(i17)).updateToDB(gm0.j1.u().f273153f, true);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 23L, 1L, true);
        } else {
            db5.e1.s(view.getContext(), view.getContext().getString(com.tencent.mm.R.string.f489795bw), view.getContext().getString(com.tencent.mm.R.string.f490573yv));
        }
        return jz5.f0.f302826a;
    }
}
