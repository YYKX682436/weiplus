package x06;

/* loaded from: classes15.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x06.u0 f532857d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(x06.u0 u0Var) {
        super(1);
        this.f532857d = u0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object next;
        n16.c cVar = (n16.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
        java.util.Map values = this.f532857d.f532858b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = values.entrySet().iterator();
        while (true) {
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            n16.c packageName = (n16.c) entry.getKey();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar, packageName)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageName, "packageName");
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.d() ? null : cVar.e(), packageName)) {
                    z17 = false;
                }
            }
            if (z17) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        java.util.Iterator it6 = linkedHashMap.entrySet().iterator();
        if (it6.hasNext()) {
            next = it6.next();
            if (it6.hasNext()) {
                int length = n16.f.a((n16.c) ((java.util.Map.Entry) next).getKey(), cVar).b().length();
                do {
                    java.lang.Object next2 = it6.next();
                    int length2 = n16.f.a((n16.c) ((java.util.Map.Entry) next2).getKey(), cVar).b().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it6.hasNext());
            }
        } else {
            next = null;
        }
        java.util.Map.Entry entry2 = (java.util.Map.Entry) next;
        if (entry2 != null) {
            return entry2.getValue();
        }
        return null;
    }
}
