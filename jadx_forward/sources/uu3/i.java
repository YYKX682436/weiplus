package uu3;

/* loaded from: classes5.dex */
public final class i implements uu3.g {
    @Override // uu3.g
    public android.graphics.Rect a(uu3.u drawer) {
        android.view.View a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawer, "drawer");
        android.graphics.Rect rect = new android.graphics.Rect();
        vu3.c m170543x8dffbaba = drawer.m170543x8dffbaba();
        if (m170543x8dffbaba != null && (a17 = m170543x8dffbaba.a()) != null) {
            a17.getGlobalVisibleRect(rect);
        }
        return rect;
    }
}
