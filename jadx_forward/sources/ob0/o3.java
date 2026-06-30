package ob0;

/* loaded from: classes3.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f425466a = jz5.h.b(ob0.n3.f425460d);

    public final synchronized boolean a(ob0.o3 result) {
        java.util.List b17;
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        b17 = b();
        java.util.List b18 = result.b();
        arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : b18) {
            if (!b().contains((jz5.o) obj)) {
                arrayList.add(obj);
            }
        }
        return b17.addAll(arrayList);
    }

    public final java.util.List b() {
        return (java.util.List) ((jz5.n) this.f425466a).mo141623x754a37bb();
    }
}
