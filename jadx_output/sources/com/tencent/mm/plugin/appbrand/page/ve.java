package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public abstract class ve {
    public static final void a(android.view.View view) {
        me.imid.swipebacklayout.lib.SwipeBackLayout swipeBackLayout = view instanceof me.imid.swipebacklayout.lib.SwipeBackLayout ? (me.imid.swipebacklayout.lib.SwipeBackLayout) view : null;
        if (swipeBackLayout != null) {
            float f17 = swipeBackLayout.getResources().getDisplayMetrics().density;
            swipeBackLayout.setMinVelocity(100 * f17);
            swipeBackLayout.setMaxVelocity(300 * f17);
            swipeBackLayout.setEdgeTrackingEnabled(1);
            swipeBackLayout.setEdgeSize((int) ((20 * f17) + 0.5f));
            swipeBackLayout.setEdgeTrackingEnabled(1);
            swipeBackLayout.setScrimColor(0);
        }
    }
}
