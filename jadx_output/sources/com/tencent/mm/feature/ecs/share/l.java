package com.tencent.mm.feature.ecs.share;

/* loaded from: classes.dex */
public final class l implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f65989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.share.a f65990e;

    public l(java.lang.Object obj, com.tencent.mm.feature.ecs.share.a aVar) {
        this.f65989d = obj;
        this.f65990e = aVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Bj("ecs_share_dialog", "page_exit", kz5.b1.e(new jz5.l("source_report_data", this.f65989d)), 12, false);
        }
        t00.e1 e1Var = (t00.e1) this.f65990e;
        e1Var.getClass();
        f10.b[] bVarArr = f10.b.f258544d;
        e1Var.a(1001, null);
        c00.n3 n3Var = e1Var.f414277b;
        if (n3Var != null) {
            n3Var.onCancel();
        }
    }
}
