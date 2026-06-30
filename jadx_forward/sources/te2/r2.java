package te2;

/* loaded from: classes14.dex */
public final class r2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x91.h f499902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.a3 f499903e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(x91.h hVar, te2.a3 a3Var) {
        super(0);
        this.f499902d = hVar;
        this.f499903e = a3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        te2.a3 a3Var;
        int i17;
        te2.b2 b2Var;
        gk2.e eVar;
        java.util.ArrayList arrayList;
        gk2.e eVar2;
        java.util.ArrayList arrayList2;
        x91.c cVar;
        x91.h hVar = this.f499902d;
        if (hVar != null && hVar.f534180a != null && (i17 = (a3Var = this.f499903e).f499407y) != a3Var.f499397o) {
            if (i17 != a3Var.f499396n) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f409258g, this.f499903e.a());
            }
            te2.b2 b2Var2 = this.f499903e.f499392g;
            java.lang.Object obj = null;
            if (b2Var2 != null && (eVar2 = ((te2.l2) b2Var2).f499724d) != null && (arrayList2 = ((je2.i) eVar2.a(je2.i.class)).f380769g) != null) {
                x91.h hVar2 = this.f499902d;
                synchronized (arrayList2) {
                    java.util.Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        x91.h hVar3 = ((te2.p2) next).f499832a;
                        java.lang.String str = (hVar3 == null || (cVar = hVar3.f534180a) == null) ? null : cVar.f534174i;
                        x91.c cVar2 = hVar2.f534180a;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, cVar2 != null ? cVar2.f534174i : null)) {
                            obj = next;
                            break;
                        }
                    }
                }
                obj = (te2.p2) obj;
            }
            te2.a3 a3Var2 = this.f499903e;
            a3Var2.g(a3Var2.f499396n);
            if (obj == null && (b2Var = this.f499903e.f499392g) != null && (eVar = ((te2.l2) b2Var).f499724d) != null && (arrayList = ((je2.i) eVar.a(je2.i.class)).f380769g) != null) {
                x91.h hVar4 = this.f499902d;
                te2.a3 a3Var3 = this.f499903e;
                arrayList.add(new te2.p2(hVar4));
                if (arrayList.size() > 0) {
                    a3Var3.f499406x.m8149x8b456734(arrayList.size() - 1);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
