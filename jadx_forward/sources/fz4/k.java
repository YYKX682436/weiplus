package fz4;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final fz4.k f348847a = new fz4.k();

    /* renamed from: b, reason: collision with root package name */
    public static android.os.HandlerThread f348848b;

    /* renamed from: c, reason: collision with root package name */
    public static long f348849c;

    public final java.util.List a(android.view.View view, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (view instanceof android.view.SurfaceView) {
            arrayList.add(new fz4.h((android.view.SurfaceView) view, i17, i18));
        } else if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i19 = 0; i19 < childCount; i19++) {
                android.view.View childAt = viewGroup.getChildAt(i19);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
                arrayList.addAll(a(childAt, (int) (viewGroup.getX() + i17), (int) (viewGroup.getY() + i18)));
            }
        }
        return arrayList;
    }
}
