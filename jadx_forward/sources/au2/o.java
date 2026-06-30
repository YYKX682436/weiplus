package au2;

/* loaded from: classes5.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au2.q f95612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f95613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f95614f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(au2.q qVar, android.app.Activity activity, boolean z17) {
        super(0);
        this.f95612d = qVar;
        this.f95613e = activity;
        this.f95614f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var;
        android.view.View decorView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) this.f95613e;
        au2.q qVar = this.f95612d;
        qVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "checkCanShowHalfScreen, activity: " + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(abstractActivityC15087xee12defa.getClass()).d());
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        boolean booleanValue = ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209507ug).mo141623x754a37bb()).r()).booleanValue();
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209525vg).mo141623x754a37bb()).r()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "force show shortcuts drawer!");
            qVar.Di(abstractActivityC15087xee12defa, booleanValue);
        } else if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209471sg).mo141623x754a37bb()).r()).booleanValue()) {
            boolean z17 = false;
            if (abstractActivityC15087xee12defa.getIntent().getBooleanExtra("key_enter_from_desktop_shortcuts", false)) {
                abstractActivityC15087xee12defa.getIntent().putExtra("key_enter_from_desktop_shortcuts", false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "enter from shortcut, return!");
            } else if (qVar.f95621f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "screen turn off when process enter background last time!");
                qVar.f95621f = false;
            } else {
                android.view.Window window = abstractActivityC15087xee12defa.getWindow();
                android.view.View rootView = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootView();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14988xa0c9eb18 c14988xa0c9eb18 = rootView != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14988xa0c9eb18) rootView.findViewById(com.p314xaae8f345.mm.R.id.tbf) : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14988xa0c9eb18 c14988xa0c9eb182 = c14988xa0c9eb18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14988xa0c9eb18 ? c14988xa0c9eb18 : null;
                if (!(c14988xa0c9eb182 != null && c14988xa0c9eb182.q())) {
                    java.lang.ref.WeakReference weakReference = qVar.f95619d;
                    if (!((weakReference == null || (j0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) weakReference.get()) == null || !j0Var.isShowing()) ? false : true)) {
                        if (this.f95614f) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "shortcut is exist!");
                        } else {
                            long intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209489tg).mo141623x754a37bb()).r()).intValue();
                            long millis = java.util.concurrent.TimeUnit.DAYS.toMillis(intValue);
                            i95.m c18 = i95.n0.c(cq.k.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ((cq.k) c18).f302759g.f323817a;
                            long currentTimeMillis = (booleanValue ? java.lang.System.currentTimeMillis() : c01.id.c()) - (o4Var != null ? o4Var.p("kFinderLastAddShortcutsShowTimeKey") : 0L);
                            if (currentTimeMillis < millis) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "dayLimits = " + intValue + ", last show date is " + java.util.concurrent.TimeUnit.MILLISECONDS.toDays(currentTimeMillis) + " days ago!");
                            } else {
                                z17 = true;
                            }
                            if (z17) {
                                qVar.Di(abstractActivityC15087xee12defa, booleanValue);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "checkCanShowHalfScreen, showHalfScreen!");
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "did not reach time limit, return!");
                            }
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "drawer or dialog is showing!");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "didn't hit high activity exp!");
        }
        return jz5.f0.f384359a;
    }
}
