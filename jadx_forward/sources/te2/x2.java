package te2;

/* loaded from: classes14.dex */
public final class x2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x91.h f500058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.a3 f500059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(x91.h hVar, te2.a3 a3Var) {
        super(0);
        this.f500058d = hVar;
        this.f500059e = a3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        gk2.e eVar;
        java.util.ArrayList arrayList;
        gk2.e eVar2;
        java.util.ArrayList arrayList2;
        x91.c cVar;
        x91.h hVar = this.f500058d;
        if (hVar != null && hVar.f534180a != null) {
            te2.a3 a3Var = this.f500059e;
            if (a3Var.f499407y != a3Var.f499397o) {
                te2.b2 b2Var = a3Var.f499392g;
                int i18 = 0;
                if (b2Var == null || (eVar2 = ((te2.l2) b2Var).f499724d) == null || (arrayList2 = ((je2.i) eVar2.a(je2.i.class)).f380769g) == null) {
                    i17 = -1;
                } else {
                    x91.h hVar2 = this.f500058d;
                    synchronized (arrayList2) {
                        java.util.Iterator it = arrayList2.iterator();
                        int i19 = 0;
                        i17 = -1;
                        while (it.hasNext()) {
                            java.lang.Object next = it.next();
                            int i27 = i19 + 1;
                            if (i19 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            te2.p2 p2Var = (te2.p2) next;
                            x91.h hVar3 = p2Var.f499832a;
                            java.lang.String str = (hVar3 == null || (cVar = hVar3.f534180a) == null) ? null : cVar.f534174i;
                            x91.c cVar2 = hVar2.f534180a;
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, cVar2 != null ? cVar2.f534174i : null)) {
                                p2Var.f499832a = hVar2;
                                i17 = i19;
                            }
                            i19 = i27;
                        }
                    }
                }
                te2.a3 a3Var2 = this.f500059e;
                a3Var2.g(a3Var2.f499396n);
                if (i17 != -1 && i17 > 0) {
                    te2.b2 b2Var2 = this.f500059e.f499392g;
                    if (b2Var2 != null && (eVar = ((te2.l2) b2Var2).f499724d) != null && (arrayList = ((je2.i) eVar.a(je2.i.class)).f380769g) != null) {
                        i18 = arrayList.size();
                    }
                    if (i17 < i18) {
                        this.f500059e.f499406x.m8147xed6e4d18(i17);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
