package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class x1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f101592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.a2 f101593e;

    public x1(com.tencent.mm.plugin.fav.ui.a2 a2Var, o72.r2 r2Var) {
        this.f101593e = a2Var;
        this.f101592d = r2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        o72.x1.k(this.f101592d, new com.tencent.mm.plugin.fav.ui.w1(this), 5);
        com.tencent.mm.plugin.fav.ui.a2 a2Var = this.f101593e;
        com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI = a2Var.f100452g;
        int i18 = a2Var.f100449d;
        int i19 = com.tencent.mm.plugin.fav.ui.FavFilterUI.F;
        favFilterUI.Z6(6, i18, false);
    }
}
