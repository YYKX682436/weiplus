package oj;

/* loaded from: classes10.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final oj.j0 f427240a = new oj.j0();

    public final java.lang.String a(android.view.View view, int i17) {
        int i18 = 0;
        if (!(view instanceof android.view.ViewGroup)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            while (i18 < i17) {
                sb6.append("-");
                i18++;
            }
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "StringBuilder().apply(builderAction).toString()");
            return sb7 + view.getVisibility() + ':' + view.getWindowVisibility() + ':' + view + ":[" + view.getX() + ',' + view.getY() + ',' + view.getWidth() + ',' + view.getHeight() + "]:" + view.getContext() + '\n';
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        for (int i19 = 0; i19 < i17; i19++) {
            sb8.append("-");
        }
        sb8.append(viewGroup.getVisibility() + ':' + viewGroup.getWindowVisibility() + ':' + viewGroup + ":[" + viewGroup.getX() + ',' + viewGroup.getY() + ',' + viewGroup.getWidth() + ',' + viewGroup.getHeight() + "]:" + viewGroup.getContext() + '\n');
        while (i18 < childCount) {
            android.view.View child = viewGroup.getChildAt(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(child, "child");
            sb8.append(a(child, i17 + 1));
            i18++;
        }
        java.lang.String sb9 = sb8.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "builder.toString()");
        return sb9;
    }
}
