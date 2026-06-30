package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes5.dex */
public final class ko implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mo f228650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f228651e;

    public ko(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mo moVar, android.view.View view) {
        this.f228650d = moVar;
        this.f228651e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mo moVar = this.f228650d;
        if (moVar.isShowing()) {
            this.f228651e.getLocationInWindow(moVar.f228741k);
            int[] iArr = moVar.f228741k;
            moVar.f228737g = iArr[0];
            int i17 = iArr[1];
            android.widget.FrameLayout frameLayout = moVar.f228732b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
            moVar.f228738h = (i17 - frameLayout.getMeasuredHeight()) + com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            int i18 = moVar.f228738h - moVar.f228739i;
            if (java.lang.Math.abs(i18) > 100) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(moVar.f228731a, "update location  yDiff:%s", java.lang.Integer.valueOf(i18));
                int i19 = moVar.f228737g;
                moVar.update(i19 >= 100 ? i19 : 0, moVar.f228738h, -1, -1);
            }
            moVar.f228739i = moVar.f228738h;
        }
    }
}
