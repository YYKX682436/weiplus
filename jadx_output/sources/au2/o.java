package au2;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au2.q f14079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f14080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f14081f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(au2.q qVar, android.app.Activity activity, boolean z17) {
        super(0);
        this.f14079d = qVar;
        this.f14080e = activity;
        this.f14081f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.j0 j0Var;
        android.view.View decorView;
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = (com.tencent.mm.plugin.finder.ui.MMFinderUI) this.f14080e;
        au2.q qVar = this.f14079d;
        qVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderShortcutsService", "checkCanShowHalfScreen, activity: " + kotlin.jvm.internal.i0.a(mMFinderUI.getClass()).d());
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        boolean booleanValue = ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127974ug).getValue()).r()).booleanValue();
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127992vg).getValue()).r()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("FinderShortcutsService", "force show shortcuts drawer!");
            qVar.Di(mMFinderUI, booleanValue);
        } else if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127938sg).getValue()).r()).booleanValue()) {
            boolean z17 = false;
            if (mMFinderUI.getIntent().getBooleanExtra("key_enter_from_desktop_shortcuts", false)) {
                mMFinderUI.getIntent().putExtra("key_enter_from_desktop_shortcuts", false);
                com.tencent.mars.xlog.Log.i("FinderShortcutsService", "enter from shortcut, return!");
            } else if (qVar.f14088f) {
                com.tencent.mars.xlog.Log.i("FinderShortcutsService", "screen turn off when process enter background last time!");
                qVar.f14088f = false;
            } else {
                android.view.Window window = mMFinderUI.getWindow();
                android.view.View rootView = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootView();
                com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer finderShortcutsDrawer = rootView != null ? (com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer) rootView.findViewById(com.tencent.mm.R.id.tbf) : null;
                com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer finderShortcutsDrawer2 = finderShortcutsDrawer instanceof com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer ? finderShortcutsDrawer : null;
                if (!(finderShortcutsDrawer2 != null && finderShortcutsDrawer2.q())) {
                    java.lang.ref.WeakReference weakReference = qVar.f14086d;
                    if (!((weakReference == null || (j0Var = (com.tencent.mm.ui.widget.dialog.j0) weakReference.get()) == null || !j0Var.isShowing()) ? false : true)) {
                        if (this.f14081f) {
                            com.tencent.mars.xlog.Log.i("FinderShortcutsService", "shortcut is exist!");
                        } else {
                            long intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127956tg).getValue()).r()).intValue();
                            long millis = java.util.concurrent.TimeUnit.DAYS.toMillis(intValue);
                            i95.m c18 = i95.n0.c(cq.k.class);
                            kotlin.jvm.internal.o.f(c18, "getService(...)");
                            com.tencent.mm.sdk.platformtools.o4 o4Var = ((cq.k) c18).f221226g.f242284a;
                            long currentTimeMillis = (booleanValue ? java.lang.System.currentTimeMillis() : c01.id.c()) - (o4Var != null ? o4Var.p("kFinderLastAddShortcutsShowTimeKey") : 0L);
                            if (currentTimeMillis < millis) {
                                com.tencent.mars.xlog.Log.i("FinderShortcutsService", "dayLimits = " + intValue + ", last show date is " + java.util.concurrent.TimeUnit.MILLISECONDS.toDays(currentTimeMillis) + " days ago!");
                            } else {
                                z17 = true;
                            }
                            if (z17) {
                                qVar.Di(mMFinderUI, booleanValue);
                                com.tencent.mars.xlog.Log.i("FinderShortcutsService", "checkCanShowHalfScreen, showHalfScreen!");
                            } else {
                                com.tencent.mars.xlog.Log.i("FinderShortcutsService", "did not reach time limit, return!");
                            }
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("FinderShortcutsService", "drawer or dialog is showing!");
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderShortcutsService", "didn't hit high activity exp!");
        }
        return jz5.f0.f302826a;
    }
}
