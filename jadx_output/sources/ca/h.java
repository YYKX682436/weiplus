package ca;

/* loaded from: classes13.dex */
public class h extends android.util.Property {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.Property f39761a = new ca.h("circularRevealScrimColor");

    public h(java.lang.String str) {
        super(java.lang.Integer.class, str);
    }

    @Override // android.util.Property
    public java.lang.Object get(java.lang.Object obj) {
        return java.lang.Integer.valueOf(((ca.j) obj).getCircularRevealScrimColor());
    }

    @Override // android.util.Property
    public void set(java.lang.Object obj, java.lang.Object obj2) {
        ((ca.j) obj).setCircularRevealScrimColor(((java.lang.Integer) obj2).intValue());
    }
}
