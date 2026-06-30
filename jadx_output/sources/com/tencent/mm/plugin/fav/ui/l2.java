package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class l2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.p2 f101237d;

    public l2(com.tencent.mm.plugin.fav.ui.p2 p2Var) {
        this.f101237d = p2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.p2 p2Var = this.f101237d;
        androidx.appcompat.app.AppCompatActivity context = p2Var.f101332a.getContext();
        com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI = p2Var.f101332a;
        com.tencent.mm.plugin.fav.ui.ec.g(context, 4105, favFilterUI.f100335o, favFilterUI.C);
        p2Var.f101332a.Z6(3, 0, false);
    }
}
