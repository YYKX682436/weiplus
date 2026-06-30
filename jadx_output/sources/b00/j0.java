package b00;

/* loaded from: classes8.dex */
public final class j0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f16694b;

    /* renamed from: a, reason: collision with root package name */
    public static final b00.j0 f16693a = new b00.j0();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f16695c = jz5.h.b(b00.i0.f16688d);

    public final boolean a(r45.vs2 vs2Var, java.lang.String path) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.Object obj = null;
        if (vs2Var != null && (linkedList = vs2Var.f388489g) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b(((r45.f03) next).f373892i, path)) {
                    obj = next;
                    break;
                }
            }
            obj = (r45.f03) obj;
        }
        return obj != null;
    }
}
