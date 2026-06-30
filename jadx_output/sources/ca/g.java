package ca;

/* loaded from: classes13.dex */
public class g extends android.util.Property {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.Property f39760a = new ca.g("circularReveal");

    public g(java.lang.String str) {
        super(ca.i.class, str);
    }

    @Override // android.util.Property
    public java.lang.Object get(java.lang.Object obj) {
        return ((ca.j) obj).getRevealInfo();
    }

    @Override // android.util.Property
    public void set(java.lang.Object obj, java.lang.Object obj2) {
        ((ca.j) obj).setRevealInfo((ca.i) obj2);
    }
}
