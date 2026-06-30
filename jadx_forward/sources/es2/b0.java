package es2;

/* loaded from: classes2.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f337865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f337866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f337867f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f337868g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.util.LinkedList linkedList, es2.h0 h0Var, java.util.LinkedList linkedList2, java.util.LinkedList linkedList3) {
        super(0);
        this.f337865d = linkedList;
        this.f337866e = h0Var;
        this.f337867f = linkedList2;
        this.f337868g = linkedList3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        es2.h0 h0Var;
        boolean z17;
        java.util.LinkedList linkedList = this.f337865d;
        java.util.Iterator it = linkedList.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (true) {
            boolean hasNext = it.hasNext();
            h0Var = this.f337866e;
            if (!hasNext) {
                break;
            }
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            cs2.p pVar = (cs2.p) next;
            if (!(h0Var.e(pVar, null, "mergePreload") == es2.h.f337898e)) {
                it.remove();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h0Var.f337908h, "remove from  preloadList " + pVar);
            }
        }
        kz5.g0.s(linkedList);
        cs2.p pVar2 = (cs2.p) kz5.n0.Z(linkedList);
        java.util.LinkedList linkedList2 = this.f337867f;
        if (pVar2 != null) {
            java.util.Collection values = h0Var.f337904d.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            java.util.Collection collection = values;
            if (!(collection instanceof java.util.Collection) || !collection.isEmpty()) {
                java.util.Iterator it6 = collection.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    cs2.p pVar3 = (cs2.p) it6.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pVar3);
                    if (h0Var.k(pVar2, pVar3)) {
                        z17 = false;
                        break;
                    }
                }
            }
            java.lang.String str = h0Var.f337908h;
            if (z17) {
                java.util.Collection<cs2.p> values2 = h0Var.f337904d.values();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
                for (cs2.p pVar4 : values2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "loadingMap add to removeLoadingList " + pVar4);
                    linkedList2.add(pVar4.f303625i2);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "preloadList remove " + pVar2 + " for loading.");
                linkedList.remove(pVar2);
            }
        }
        java.util.Iterator it7 = linkedList2.iterator();
        while (it7.hasNext()) {
            cs2.p a17 = h0Var.a((java.lang.String) it7.next(), false, "mergePreload");
            if (a17 != null) {
                this.f337868g.addFirst(a17);
            }
        }
        return jz5.f0.f384359a;
    }
}
