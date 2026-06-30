package qp1;

/* loaded from: classes14.dex */
public abstract class j {
    public static final void a(int i17, android.view.View view) {
        if (view == null || view.getLayoutParams() == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof android.view.WindowManager.LayoutParams) {
            android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
            layoutParams2.flags = i17 | layoutParams2.flags;
            view.setLayoutParams(layoutParams);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainerViewUtil", "addFloatBallViewLayoutParamsFlag result: %d", java.lang.Integer.valueOf(layoutParams2.flags));
        }
    }

    public static final void b(android.view.WindowManager windowManager, android.view.View view) {
        if (view == null) {
            return;
        }
        if (windowManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallContainerViewUtil", "attachFloatMenuViewToWindow, window manager is null");
            return;
        }
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        if (fp.h.c(26)) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.format = 1;
        layoutParams.packageName = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName();
        layoutParams.flags = 65824;
        layoutParams.gravity = 8388659;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.x = qp1.w.k();
        layoutParams.y = qp1.w.l();
        try {
            windowManager.addView(view, layoutParams);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainerViewUtil", "attachFloatMenuViewToWindow success");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallContainerViewUtil", e17, "attachFloatMenuViewToWindow fail", new java.lang.Object[0]);
        }
    }

    public static final void c(android.view.WindowManager windowManager, android.view.View view, int i17, int i18, java.lang.Integer num, java.lang.Integer num2) {
        if (view == null) {
            return;
        }
        if (windowManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallContainerViewUtil", "attachFloatBallViewToWindow, window manager is null");
            return;
        }
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        if (fp.h.c(26)) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.format = 1;
        layoutParams.packageName = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName();
        layoutParams.flags = android.R.style.DialogWindowTitle.Material;
        layoutParams.gravity = 8388659;
        layoutParams.width = num != null ? num.intValue() : -2;
        layoutParams.height = num2 != null ? num2.intValue() : -2;
        layoutParams.x = i17;
        layoutParams.y = i18;
        try {
            windowManager.addView(view, layoutParams);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainerViewUtil", "attachFloatBallViewToWindow success, view: " + view);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallContainerViewUtil", e17, "attachFloatBallViewToWindow fail, view: " + view, new java.lang.Object[0]);
        }
    }

    public static final void d(int i17, android.view.View view) {
        if (view == null || view.getLayoutParams() == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof android.view.WindowManager.LayoutParams) {
            android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
            layoutParams2.flags = (~i17) & layoutParams2.flags;
            view.setLayoutParams(layoutParams);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainerViewUtil", "removeFloatBallViewLayoutParamsFlag result: %d", java.lang.Integer.valueOf(layoutParams2.flags));
        }
    }
}
