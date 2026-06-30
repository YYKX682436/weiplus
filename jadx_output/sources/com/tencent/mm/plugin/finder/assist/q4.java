package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class q4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f102481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f102482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(az2.f fVar, com.tencent.mm.ui.MMActivity mMActivity) {
        super(1);
        this.f102481d = fVar;
        this.f102482e = mMActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.d61 d61Var;
        r45.ie ieVar;
        r45.du5 du5Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f102481d.b();
        java.lang.String str = (fVar == null || (d61Var = (r45.d61) fVar.f70618d) == null || (ieVar = (r45.ie) d61Var.getCustom(0)) == null || (du5Var = ieVar.f376960e) == null) ? null : du5Var.f372756d;
        boolean z17 = str == null || str.length() == 0;
        com.tencent.mm.ui.MMActivity mMActivity = this.f102482e;
        if (z17) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(mMActivity);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.d(com.tencent.mm.R.string.p3f);
            e4Var.c();
        } else {
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(mMActivity);
            e4Var2.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var2.f211776c = str;
            e4Var2.c();
        }
        return jz5.f0.f302826a;
    }
}
