package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class y4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f101618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.a5 f101619e;

    public y4(com.tencent.mm.plugin.fav.ui.a5 a5Var, o72.r2 r2Var) {
        this.f101619e = a5Var;
        this.f101618d = r2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        o72.x1.k(this.f101618d, new com.tencent.mm.plugin.fav.ui.x4(this), 6);
        com.tencent.mm.plugin.fav.ui.a5 a5Var = this.f101619e;
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = a5Var.f100458g;
        int i18 = a5Var.f100455d;
        int i19 = com.tencent.mm.plugin.fav.ui.FavSearchUI.N;
        favSearchUI.b7(6, i18);
    }
}
