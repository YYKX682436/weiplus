package o25;

/* loaded from: classes5.dex */
public abstract class n1 {
    public static int a(android.content.Context context) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        int complexToDimensionPixelSize = context.getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559595m, typedValue, true) ? android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()) : 0;
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return complexToDimensionPixelSize <= 0 ? displayMetrics.widthPixels > displayMetrics.heightPixels ? context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561155ax) : context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay) : complexToDimensionPixelSize;
    }

    public static void b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, android.view.View view, int i17) {
        if (activityC0065xcd7aa112 == null || activityC0065xcd7aa112.getWindow() == null || activityC0065xcd7aa112.getWindow().getDecorView() == null) {
            return;
        }
        activityC0065xcd7aa112.getWindow().getDecorView().post(new o25.m1(activityC0065xcd7aa112, i17, view));
    }

    public static void c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        abstractActivityC21394xb3d2c0cf.getWindow().getDecorView().post(new o25.k1(new java.lang.ref.WeakReference(abstractActivityC21394xb3d2c0cf)));
    }

    public static void d(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, android.view.View view) {
        if (activityC21401x6ce6f73f == null || activityC21401x6ce6f73f.getWindow() == null || activityC21401x6ce6f73f.getWindow().getDecorView() == null) {
            return;
        }
        activityC21401x6ce6f73f.getWindow().getDecorView().post(new o25.l1(activityC21401x6ce6f73f, view));
    }

    public static void e(android.app.Activity activity) {
        try {
            if (activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).mo2550x7c2abd06(109);
            } else {
                activity.requestWindowFeature(9);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FullScreenHelper", e17, null, new java.lang.Object[0]);
        }
    }

    public static void f(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        try {
            abstractActivityC21394xb3d2c0cf.mo2550x7c2abd06(109);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FullScreenHelper", e17, null, new java.lang.Object[0]);
        }
    }
}
