package d8;

/* loaded from: classes7.dex */
public class b implements e8.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1591x6c90f41d f308425a;

    public b(com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1591x6c90f41d c1591x6c90f41d, d8.a aVar) {
        this.f308425a = c1591x6c90f41d;
    }

    @Override // e8.d
    public void a(java.lang.String str, e8.c cVar, e8.a aVar) {
        java.util.List list;
        list = this.f308425a.f5268x4b8fee60;
        java.util.Iterator it = new java.util.LinkedList(list).iterator();
        while (it.hasNext()) {
            ((e8.d) it.next()).a(str, cVar, aVar);
        }
    }

    @Override // e8.d
    public void b(java.lang.String str, java.lang.Object obj, e8.e eVar, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab) {
        java.util.List list;
        list = this.f308425a.f5268x4b8fee60;
        java.util.Iterator it = new java.util.LinkedList(list).iterator();
        while (it.hasNext()) {
            ((e8.d) it.next()).b(str, obj, eVar, c1592x888963ab);
        }
    }
}
