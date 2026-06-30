package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class z1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.a2 f101639d;

    public z1(com.tencent.mm.plugin.fav.ui.a2 a2Var) {
        this.f101639d = a2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.a2 a2Var = this.f101639d;
        androidx.appcompat.app.AppCompatActivity context = a2Var.f100452g.getContext();
        com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI = a2Var.f100452g;
        com.tencent.mm.plugin.fav.ui.ec.g(context, 4106, favFilterUI.f100335o, favFilterUI.C);
        a2Var.f100452g.Z6(3, a2Var.f100449d, false);
    }
}
