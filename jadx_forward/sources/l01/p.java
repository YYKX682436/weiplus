package l01;

/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f396317a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f396318b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f396319c = new java.util.HashMap();

    public p(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, l01.c cVar) {
        this.f396317a = n3Var;
    }

    public void a(java.lang.String str, l01.o oVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || oVar == null) {
            return;
        }
        java.util.Map map = this.f396318b;
        java.util.List list = (java.util.List) ((java.util.HashMap) map).get(str);
        if (list == null) {
            list = new java.util.LinkedList();
            ((java.util.HashMap) map).put(str, list);
        }
        list.add(oVar);
    }

    public void b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.util.List list = (java.util.List) ((java.util.HashMap) this.f396318b).remove(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((l01.o) it.next()).b();
        }
        list.clear();
    }

    public void c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.util.List list = (java.util.List) ((java.util.HashMap) this.f396318b).remove(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((l01.o) it.next()).a();
        }
    }

    public boolean d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        return ((java.util.HashMap) this.f396319c).containsKey(str);
    }

    public void e(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        ((java.util.HashMap) this.f396319c).remove(str);
    }
}
