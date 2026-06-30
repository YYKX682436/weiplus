package te2;

/* loaded from: classes14.dex */
public final class v2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x91.h f500022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.a3 f500023e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(x91.h hVar, te2.a3 a3Var) {
        super(0);
        this.f500022d = hVar;
        this.f500023e = a3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        gk2.e eVar;
        java.util.ArrayList arrayList;
        gk2.e eVar2;
        java.util.ArrayList arrayList2;
        gk2.e eVar3;
        java.util.ArrayList arrayList3;
        gk2.e eVar4;
        java.util.ArrayList arrayList4;
        x91.c cVar;
        x91.h hVar = this.f500022d;
        if (hVar != null && hVar.f534180a != null) {
            te2.a3 a3Var = this.f500023e;
            if (a3Var.f499407y != a3Var.f499397o) {
                te2.b2 b2Var = a3Var.f499392g;
                boolean z17 = false;
                if (b2Var == null || (eVar4 = ((te2.l2) b2Var).f499724d) == null || (arrayList4 = ((je2.i) eVar4.a(je2.i.class)).f380769g) == null) {
                    i17 = -1;
                } else {
                    x91.h hVar2 = this.f500022d;
                    synchronized (arrayList4) {
                        java.util.Iterator it = arrayList4.iterator();
                        i17 = -1;
                        int i18 = 0;
                        while (it.hasNext()) {
                            java.lang.Object next = it.next();
                            int i19 = i18 + 1;
                            java.lang.String str = null;
                            if (i18 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            te2.p2 p2Var = (te2.p2) next;
                            x91.c cVar2 = hVar2.f534180a;
                            java.lang.String str2 = cVar2 != null ? cVar2.f534174i : null;
                            x91.h hVar3 = p2Var.f499832a;
                            if (hVar3 != null && (cVar = hVar3.f534180a) != null) {
                                str = cVar.f534174i;
                            }
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, str)) {
                                i17 = i18;
                            }
                            i18 = i19;
                        }
                    }
                }
                if (i17 != -1 && i17 > 0) {
                    te2.b2 b2Var2 = this.f500023e.f499392g;
                    if (i17 < ((b2Var2 == null || (eVar3 = ((te2.l2) b2Var2).f499724d) == null || (arrayList3 = ((je2.i) eVar3.a(je2.i.class)).f380769g) == null) ? 0 : arrayList3.size())) {
                        te2.b2 b2Var3 = this.f500023e.f499392g;
                        if (b2Var3 != null && (eVar2 = ((te2.l2) b2Var3).f499724d) != null && (arrayList2 = ((je2.i) eVar2.a(je2.i.class)).f380769g) != null) {
                        }
                        this.f500023e.f499406x.m8155x27702c4(i17);
                    }
                }
                te2.b2 b2Var4 = this.f500023e.f499392g;
                if (b2Var4 != null && (eVar = ((te2.l2) b2Var4).f499724d) != null && (arrayList = ((je2.i) eVar.a(je2.i.class)).f380769g) != null && arrayList.isEmpty()) {
                    z17 = true;
                }
                if (z17) {
                    te2.a3 a3Var2 = this.f500023e;
                    a3Var2.g(a3Var2.f499395m);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
