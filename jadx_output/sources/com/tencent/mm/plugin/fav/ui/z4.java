package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class z4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.a5 f101647d;

    public z4(com.tencent.mm.plugin.fav.ui.a5 a5Var) {
        this.f101647d = a5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.a5 a5Var = this.f101647d;
        androidx.appcompat.app.AppCompatActivity context = a5Var.f100458g.getContext();
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = a5Var.f100458g;
        com.tencent.mm.plugin.fav.ui.ec.g(context, 4106, favSearchUI.f100400n, favSearchUI.K);
        a5Var.f100458g.b7(3, a5Var.f100455d);
    }
}
