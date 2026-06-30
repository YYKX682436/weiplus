package zg5;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static zg5.c f554371a;

    /* renamed from: b, reason: collision with root package name */
    public static zg5.c f554372b;

    public static void a(android.app.Activity activity, android.view.View view) {
        android.view.View decorView = activity.getWindow().getDecorView();
        f554371a = zg5.c.a(activity, null, 1200L, true);
        f554372b = zg5.c.a(activity, null, 1200L, true);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i17 = rect.top;
        int l17 = ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).mo2533x106ab264().l();
        f554371a.setHeight((iArr[1] - i17) - l17);
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        f554372b.setHeight((displayMetrics.heightPixels - iArr[1]) - view.getHeight());
        f554371a.showAtLocation(decorView, 48, 0, i17 + l17);
        f554372b.showAtLocation(decorView, 80, 0, 0);
    }

    public static void b() {
        zg5.c cVar = f554371a;
        if (cVar != null) {
            cVar.setAnimationStyle(-1);
            f554371a.dismiss();
            f554371a = null;
        }
        zg5.c cVar2 = f554372b;
        if (cVar2 != null) {
            cVar2.setAnimationStyle(-1);
            f554372b.dismiss();
            f554372b = null;
        }
    }
}
