package dj2;

/* loaded from: classes3.dex */
public final class k implements hn5.a {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f314438a = jz5.h.b(dj2.j.f314437d);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f314439b = new java.util.LinkedList();

    public static void b(dj2.k kVar, java.util.LinkedList linkedList, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560608pe);
        }
        kVar.a(linkedList, i17);
    }

    public final void a(java.util.LinkedList points, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(points, "points");
        ((android.graphics.Paint) ((jz5.n) this.f314438a).mo141623x754a37bb()).setColor(i17);
        java.util.LinkedList linkedList = this.f314439b;
        linkedList.clear();
        linkedList.addAll(points);
    }
}
