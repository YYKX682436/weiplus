package gx2;

/* loaded from: classes2.dex */
public final class d implements gx2.b {
    @Override // gx2.b
    public android.graphics.Rect G6(gx2.q drawer) {
        android.view.View a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawer, "drawer");
        android.graphics.Rect rect = new android.graphics.Rect();
        hx2.i m132458x8dffbaba = drawer.m132458x8dffbaba();
        if (m132458x8dffbaba != null && (a17 = m132458x8dffbaba.a()) != null) {
            a17.getGlobalVisibleRect(rect);
        }
        return rect;
    }
}
