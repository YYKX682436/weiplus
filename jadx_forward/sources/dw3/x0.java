package dw3;

/* loaded from: classes10.dex */
public abstract class x0 {
    public static final void a(android.graphics.Rect rect, r45.vl5 proto) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        proto.f469883d.clear();
        proto.f469883d.add(java.lang.Integer.valueOf(rect.left));
        proto.f469883d.add(java.lang.Integer.valueOf(rect.top));
        proto.f469883d.add(java.lang.Integer.valueOf(rect.right));
        proto.f469883d.add(java.lang.Integer.valueOf(rect.bottom));
    }

    public static final int b(int i17) {
        return i17 % 2 != 0 ? i17 - 1 : i17;
    }
}
