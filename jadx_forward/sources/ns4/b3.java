package ns4;

/* loaded from: classes4.dex */
public final class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b f420973d;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b) {
        this.f420973d = activityC19068x49d5e62b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        android.view.ViewGroup.LayoutParams layoutParams;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b.f260717w;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b = this.f420973d;
        activityC19068x49d5e62b.getClass();
        int i19 = com.p314xaae8f345.mm.ui.bk.h(activityC19068x49d5e62b).y;
        java.lang.Object systemService = activityC19068x49d5e62b.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getSize(point);
        android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(activityC19068x49d5e62b);
        java.lang.Math.max(point.y, point.x);
        int max = java.lang.Math.max(h17.y, h17.x);
        android.graphics.Rect rect = new android.graphics.Rect();
        activityC19068x49d5e62b.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int max2 = (max - java.lang.Math.max(rect.bottom - rect.top, rect.right - rect.left)) - com.p314xaae8f345.mm.ui.bk.p(activityC19068x49d5e62b);
        if (max2 > 0) {
            i19 -= com.p314xaae8f345.mm.ui.bk.j(activityC19068x49d5e62b);
        }
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = activityC19068x49d5e62b.mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            i17 = mo2533x106ab264.l();
            if (i17 <= 0) {
                i17 = activityC19068x49d5e62b.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
            }
        } else {
            i17 = 0;
        }
        int p17 = ((i19 - i17) - com.p314xaae8f345.mm.ui.bk.p(activityC19068x49d5e62b)) - activityC19068x49d5e62b.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561208cc);
        int b17 = i65.a.b(activityC19068x49d5e62b, 520);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinRechargeView", "updateMainContentView, [contentViewHeight] " + p17 + ", [maxSpaceSize] " + b17 + ", [bottomHeight] " + max2);
        if (p17 > b17) {
            p17 = b17;
        }
        android.view.View findViewById = activityC19068x49d5e62b.findViewById(com.p314xaae8f345.mm.R.id.f569251pk0);
        if (findViewById == null || (layoutParams = findViewById.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = p17;
        findViewById.setLayoutParams(layoutParams);
    }
}
