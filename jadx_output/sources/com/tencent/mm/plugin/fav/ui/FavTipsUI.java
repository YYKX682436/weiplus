package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes5.dex */
public class FavTipsUI extends com.tencent.mm.ui.MMBaseActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = getString(com.tencent.mm.R.string.f491202cb5);
        aVar.f211729s = getString(com.tencent.mm.R.string.f491200cb3) + "\n\n" + getString(com.tencent.mm.R.string.f491201cb4);
        aVar.f211732v = of5.b.a(this).getString(com.tencent.mm.R.string.f491199cb2);
        aVar.E = new com.tencent.mm.plugin.fav.ui.x6(this);
        aVar.G = new com.tencent.mm.plugin.fav.ui.y6(this);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
    }
}
