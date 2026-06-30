package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class s1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f95372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95373e;

    public s1(java.util.List list, com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI) {
        this.f95372d = list;
        this.f95373e = vipCardListUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        int i17 = 0;
        for (java.lang.Object obj : this.f95372d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.xt xtVar = (r45.xt) obj;
            g4Var.add(0, i17, 1, xtVar.f390384d);
            com.tencent.mars.xlog.Log.i(this.f95373e.f95269i, "Icon menu content, index: " + i17 + ", wording: " + xtVar.f390384d + ", jumpType:" + xtVar.f390385e + ' ');
            i17 = i18;
        }
    }
}
