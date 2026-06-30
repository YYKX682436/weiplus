package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f106695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f106696f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.tencent.mm.plugin.finder.feed.a7 a7Var, boolean z17, so2.y0 y0Var) {
        super(0);
        this.f106694d = a7Var;
        this.f106695e = z17;
        this.f106696f = y0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f106694d;
        android.app.Dialog dialog = a7Var.F1;
        if (dialog != null) {
            dialog.dismiss();
        }
        boolean z17 = this.f106695e;
        so2.y0 y0Var = this.f106696f;
        if (z17) {
            com.tencent.mm.plugin.finder.feed.a7.h(a7Var, y0Var, true);
        }
        a7Var.P(y0Var, false);
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        android.content.Context context = a7Var.f106207d;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.b(com.tencent.mm.R.raw.icons_filled_check_mark);
        e4Var.f211776c = context.getString(com.tencent.mm.R.string.cst);
        e4Var.c();
        if (z17) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[10];
            lVarArr[0] = new jz5.l("comment_id", pm0.v.u(y0Var.getItemId()));
            lVarArr[1] = new jz5.l("feed_id", pm0.v.u(y0Var.f410703d.field_feedId));
            lVarArr[2] = new jz5.l("session_buffer", "");
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context);
            lVarArr[3] = new jz5.l("behaviour_session_id", e17 != null ? e17.f135385q : null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context);
            lVarArr[4] = new jz5.l("finder_context_id", e18 != null ? e18.f135382p : null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(context);
            lVarArr[5] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f135386r : null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(context);
            lVarArr[6] = new jz5.l("extra_info", e27 != null ? e27.X6() : null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny e28 = iyVar.e(context);
            lVarArr[7] = new jz5.l("enter_source_info", e28 != null ? e28.A : null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny e29 = iyVar.e(context);
            lVarArr[8] = new jz5.l("comment_scene", e29 != null ? java.lang.Integer.valueOf(e29.f135380n) : null);
            lVarArr[9] = new jz5.l("comment_username", y0Var.f410703d.Z0());
            ((cy1.a) rVar).Cj("feed_comment_del_click", null, kz5.c1.k(lVarArr), 24617);
        }
        return jz5.f0.f302826a;
    }
}
