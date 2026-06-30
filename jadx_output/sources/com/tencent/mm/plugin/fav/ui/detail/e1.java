package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class e1 implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI f100712d;

    public e1(com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI favoriteSightDetailUI) {
        this.f100712d = favoriteSightDetailUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        this.f100712d.f100639p.b(0.0d);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteSightDetailUI", "VideoPlay: on play video error what %d extra %d.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI favoriteSightDetailUI = this.f100712d;
        if (i17 == -1) {
            favoriteSightDetailUI.f100639p.stop();
            if (com.tencent.mm.vfs.w6.j(o72.x1.x(favoriteSightDetailUI.f100642s))) {
                favoriteSightDetailUI.a7();
                return;
            } else {
                if (com.tencent.mm.vfs.w6.j(o72.x1.X(favoriteSightDetailUI.f100642s))) {
                    favoriteSightDetailUI.f100640q.setVisibility(0);
                    return;
                }
                return;
            }
        }
        if (favoriteSightDetailUI.f100646w) {
            onCompletion();
            return;
        }
        favoriteSightDetailUI.f100639p.stop();
        if (favoriteSightDetailUI.f100645v) {
            return;
        }
        favoriteSightDetailUI.f100645v = true;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.detail.d1(this));
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteSightDetailUI", " onPrepared");
        com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI favoriteSightDetailUI = this.f100712d;
        favoriteSightDetailUI.f100639p.setLoop(true);
        favoriteSightDetailUI.f100646w = favoriteSightDetailUI.f100639p.start();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.detail.c1(this));
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
