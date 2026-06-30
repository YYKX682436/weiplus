package j8;

/* loaded from: classes15.dex */
public class o implements j8.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f379662a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f379663b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public j8.b f379664c;

    public o(android.content.Context context) {
        this.f379662a = context;
    }

    @Override // j8.a
    public void a(j8.h hVar) {
        this.f379664c.b();
        this.f379664c = null;
        java.util.List list = this.f379663b;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((j8.a) it.next()).a(hVar);
        }
        ((java.util.LinkedList) list).clear();
    }
}
