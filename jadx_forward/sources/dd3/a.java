package dd3;

/* loaded from: classes7.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.gameloading.ui.MagicGameLoadingDemoUI f310499d;

    public a(com.tencent.mm.plugin.magicbrush.gameloading.ui.MagicGameLoadingDemoUI magicGameLoadingDemoUI) {
        this.f310499d = magicGameLoadingDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.magicbrush.gameloading.ui.MagicGameLoadingDemoUI.e;
        com.tencent.mm.plugin.magicbrush.gameloading.ui.MagicGameLoadingDemoUI magicGameLoadingDemoUI = this.f310499d;
        magicGameLoadingDemoUI.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicGameLoadingDemoUI", "releaseDynamicCardEnv");
        android.view.ViewGroup viewGroup = magicGameLoadingDemoUI.d;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ((ne0.n) ((oe0.r) i95.n0.c(oe0.r.class))).Di("MagicGameLoading");
        magicGameLoadingDemoUI.finish();
        return true;
    }
}
