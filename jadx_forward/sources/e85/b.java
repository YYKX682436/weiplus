package e85;

/* loaded from: classes10.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final void a(e85.b bVar) {
        bVar.getClass();
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274720m;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            d85.f0 f0Var = ((e85.c) it.next()).f331837g;
            arrayList.add(f0Var != null ? f0Var.f308709d : null);
        }
        com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274721n.putString("SENSITIVE_BUSINESS_STR", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(kz5.n0.V0(arrayList), ","));
    }

    public final com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66 b() {
        return (com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66) com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274722o.mo141623x754a37bb();
    }

    public final java.lang.String c() {
        d85.f0 f0Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            e85.c cVar = (e85.c) kz5.n0.k0(com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274720m);
            if (cVar == null || (f0Var = cVar.f331837g) == null) {
                return null;
            }
            return f0Var.f308709d;
        }
        java.lang.String string = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274721n.getString("SENSITIVE_BUSINESS_STR", null);
        if (string == null) {
            return null;
        }
        java.util.List O1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(string, ",");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(O1, "stringToList(...)");
        return (java.lang.String) kz5.n0.k0(O1);
    }
}
