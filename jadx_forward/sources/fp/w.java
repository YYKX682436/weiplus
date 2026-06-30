package fp;

/* loaded from: classes5.dex */
public abstract class w extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d2 {
    public static final void l(android.app.Activity activity) {
        if (activity == null) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.f274051b = (activity.getResources().getDisplayMetrics().heightPixels - fp.a.a(activity)) - rect.top;
    }

    public static final void m(android.content.Context context, int i17) {
        int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.d(context, 0);
        int c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.c(context);
        if (i17 < d17) {
            i17 = d17;
        }
        if (i17 <= c17) {
            c17 = i17;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.k(context, c17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putInt("com.tencent.mm.compatible.util.keybord.height", c17);
    }
}
