package pk2;

/* loaded from: classes3.dex */
public final class o7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.p7 f437601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(pk2.p7 p7Var) {
        super(0);
        this.f437601d = p7Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.res.Resources resources;
        pk2.p7 p7Var = this.f437601d;
        int i17 = p7Var.f437693a.getResources().getDisplayMetrics().heightPixels;
        android.content.Context context = p7Var.f437693a;
        int i18 = context.getResources().getDisplayMetrics().widthPixels;
        int i19 = (int) (i17 * 0.75d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", "=== Context Debug Info ===");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", "context class: ".concat(context.getClass().getName()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", "context packageName: " + context.getPackageName());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("context applicationContext: ");
        android.content.Context applicationContext = context.getApplicationContext();
        android.util.DisplayMetrics displayMetrics = null;
        sb6.append(applicationContext != null ? applicationContext.getClass().getName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isLandscape: ");
        boolean z17 = p7Var.f437694b;
        sb7.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", sb7.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", "screenWidth: " + i18 + ", screenHeight: " + i17);
        android.content.Context applicationContext2 = context.getApplicationContext();
        if (applicationContext2 != null && (resources = applicationContext2.getResources()) != null) {
            displayMetrics = resources.getDisplayMetrics();
        }
        if (displayMetrics != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", "applicationContext width: " + displayMetrics.widthPixels + ", height: " + displayMetrics.heightPixels);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", "applicationContext density: " + displayMetrics.density + ", densityDpi: " + displayMetrics.densityDpi);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderStartLiveMoreActionBottomSheet", "applicationContext displayMetrics is null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", "isLandscape:" + z17 + ", peekHeight:" + i19);
        android.view.View view = p7Var.f437696d;
        if (z17) {
            e3Var.g(view, new android.widget.FrameLayout.LayoutParams(i17, -2));
        } else {
            if (i19 <= 0) {
                i19 = -2;
            }
            e3Var.g(view, new android.widget.FrameLayout.LayoutParams(i18, i19));
            if (i19 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveMoreActionBottomSheet", "setFixedHeight: " + i19);
            }
        }
        e3Var.f213498o = true;
        e3Var.c(true);
        e3Var.a();
        return e3Var;
    }
}
