package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class v3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f110868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f110869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f110870c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.r f110871d;

    public v3(com.tencent.mm.plugin.finder.feed.a7 a7Var, so2.y0 y0Var, boolean z17, fp0.r rVar) {
        this.f110868a = a7Var;
        this.f110869b = y0Var;
        this.f110870c = z17;
        this.f110871d = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.storage.FinderItem h17;
        jz5.l lVar = (jz5.l) obj;
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        java.util.List list = (java.util.List) lVar.f302834e;
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f110868a;
        so2.y0 y0Var = this.f110869b;
        if (intValue == -1) {
            com.tencent.mm.plugin.finder.feed.p2 p2Var = a7Var.f106217p;
            if (p2Var != null) {
                p2Var.a(y0Var.f410703d.t0(), y0Var.f410703d.field_localCommentId, true);
            }
            if (y0Var.f410703d.Y0() == 0 && (h17 = bu2.j.f24534a.h(y0Var.f410703d.field_feedId)) != null) {
                h17.setCommentCount(h17.getCommentCount() - 1);
                if (h17.getCommentCount() < 0) {
                    h17.setCommentCount(0);
                }
                if (y0Var.f410703d.A0() > 0 && y0Var.f410703d.A0() <= h17.getCommentCount()) {
                    h17.setCommentCount(h17.getCommentCount() - y0Var.f410703d.A0());
                }
                hc2.a0.d(h17);
                a7Var.C0();
            }
            db5.t7.makeText(a7Var.f106207d, com.tencent.mm.R.string.f2d, 0).show();
        } else if (intValue == 0) {
            com.tencent.mm.plugin.finder.feed.a7.p(a7Var, list, y0Var, this.f110870c);
            com.tencent.mm.plugin.finder.feed.a7.B(a7Var, list);
        }
        this.f110871d.b(fp0.u.f265290f);
        return jz5.f0.f302826a;
    }
}
