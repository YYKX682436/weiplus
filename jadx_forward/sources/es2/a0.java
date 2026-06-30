package es2;

/* loaded from: classes2.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f337860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f337861e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.util.LinkedList linkedList, es2.h0 h0Var) {
        super(0);
        this.f337860d = linkedList;
        this.f337861e = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        java.util.LinkedList linkedList = this.f337860d;
        java.util.Iterator it = linkedList.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            cs2.p pVar = (cs2.p) next;
            es2.h0 h0Var = this.f337861e;
            boolean z18 = false;
            boolean z19 = h0Var.e(pVar, null, "mergePendingList") == es2.h.f337898e;
            java.lang.String str = h0Var.f337908h;
            if (z19) {
                java.util.Collection values = h0Var.f337904d.values();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
                java.util.Collection<cs2.p> collection = values;
                if (!collection.isEmpty()) {
                    for (cs2.p pVar2 : collection) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pVar2);
                        if (h0Var.k(pVar, pVar2)) {
                            z17 = false;
                            break;
                        }
                    }
                }
                z17 = true;
                if (z17) {
                    java.util.LinkedList linkedList2 = h0Var.f337905e;
                    if (!(linkedList2 instanceof java.util.Collection) || !linkedList2.isEmpty()) {
                        java.util.Iterator it6 = linkedList2.iterator();
                        while (it6.hasNext()) {
                            if (h0Var.k(pVar, (cs2.p) it6.next())) {
                                break;
                            }
                        }
                    }
                    z18 = true;
                    if (!z18) {
                        it.remove();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "remove from " + pVar + " for noneInWaitingList");
                    }
                } else {
                    it.remove();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "remove from " + pVar + " for noneInLoadingMap");
                }
            } else {
                it.remove();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "remove from " + pVar + " for isAcceptTask");
            }
        }
        kz5.g0.s(linkedList);
        return jz5.f0.f384359a;
    }
}
