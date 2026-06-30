package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes3.dex */
public class t7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f273459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u7 f273460e;

    public t7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u7 u7Var, android.view.View view) {
        this.f273460e = u7Var;
        this.f273459d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f273459d;
        int height = (view.getResources().getDisplayMetrics().heightPixels - view.getHeight()) >>> 1;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u7 u7Var = this.f273460e;
        int height2 = (int) ((height / 1.618d) - (u7Var.f273478d.getHeight() >>> 1));
        if (height2 >= 0) {
            if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v7.f273490a < 0) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v7.f273490a = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(view.getContext(), 20.0f);
            }
            if (u7Var.f273478d.getHeight() + height2 + com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v7.f273490a > height) {
                height2 -= ((u7Var.f273478d.getHeight() + height2) + com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v7.f273490a) - height;
            }
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) u7Var.f273478d.getLayoutParams();
            if (height2 <= 0 || height2 == layoutParams.bottomMargin) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoSightHelper", "setting tip marginBottom " + height2);
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, height2);
            u7Var.f273478d.setLayoutParams(layoutParams);
        }
    }
}
