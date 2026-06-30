package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class o4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.s4 f101316d;

    public o4(com.tencent.mm.plugin.fav.ui.s4 s4Var) {
        this.f101316d = s4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.s4 s4Var = this.f101316d;
        androidx.appcompat.app.AppCompatActivity context = s4Var.f101434a.getContext();
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = s4Var.f101434a;
        com.tencent.mm.plugin.fav.ui.ec.g(context, 4105, favSearchUI.f100400n, favSearchUI.K);
    }
}
