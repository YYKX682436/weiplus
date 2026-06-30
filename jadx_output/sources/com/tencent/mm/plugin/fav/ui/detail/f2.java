package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class f2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI f100720d;

    public f2(com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI favoriteVideoPlayUI) {
        this.f100720d = favoriteVideoPlayUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI favoriteVideoPlayUI = this.f100720d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            java.lang.String str = favoriteVideoPlayUI.f100658f;
            favoriteVideoPlayUI.getClass();
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Bi(favoriteVideoPlayUI.getContext(), str, new com.tencent.mm.plugin.fav.ui.detail.h2(favoriteVideoPlayUI, str, favoriteVideoPlayUI));
            return;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        jd5.c cVar = new jd5.c();
        java.lang.String str2 = favoriteVideoPlayUI.f100657e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        cVar.o(str2);
        java.lang.String str3 = favoriteVideoPlayUI.f100658f;
        cVar.r(str3 != null ? str3 : "");
        cVar.q(favoriteVideoPlayUI.f100659g);
        n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
        androidx.appcompat.app.AppCompatActivity context = favoriteVideoPlayUI.getContext();
        n13.r a17 = n13.r.a(1);
        a17.f334120d.f334139a = 6;
        ((dk5.b0) b0Var).Bi(context, cVar, a17);
        if (favoriteVideoPlayUI.f100673x == 0) {
            o72.v2.d(favoriteVideoPlayUI.getIntent().getLongExtra("key_detail_info_id", 0L), 1, 0);
        }
    }
}
