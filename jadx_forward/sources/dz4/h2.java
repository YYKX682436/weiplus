package dz4;

/* loaded from: classes12.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final dz4.h2 f326813a = new dz4.h2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f326814b = kz5.c0.i(new dz4.j2(), new dz4.i2(), new dz4.k2(), new dz4.f2());

    public final dz4.z1 a(dz4.g2 context) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.Iterator it = f326814b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((dz4.d2) obj).c(context)) {
                break;
            }
        }
        dz4.d2 d2Var = (dz4.d2) obj;
        if (d2Var != null) {
            return d2Var;
        }
        throw new java.lang.IllegalArgumentException("No handler found for scene: " + context.f326789c.f326823a);
    }
}
