package sj3;

/* loaded from: classes14.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.d f489970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(sj3.d dVar) {
        super(1);
        this.f489970d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.HashSet hashSet;
        java.lang.String usrName = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usrName, "usrName");
        sj3.d dVar = this.f489970d;
        java.util.Iterator it = dVar.f489993e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            aj3.c cVar = (aj3.c) next;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar != null ? cVar.f86840e : null, usrName)) {
                obj2 = next;
                break;
            }
        }
        aj3.c cVar2 = (aj3.c) obj2;
        if (cVar2 != null && (hashSet = dVar.f489997i) != null) {
            hashSet.add(cVar2.f86836a.f153145d);
        }
        return jz5.f0.f384359a;
    }
}
