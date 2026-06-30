package k16;

/* loaded from: classes16.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f384994a;

    public k(i16.v1 typeTable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        java.util.List list = typeTable.f369320f;
        int i17 = 0;
        if ((typeTable.f369319e & 1) == 1) {
            int i18 = typeTable.f369321g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getTypeList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (java.lang.Object obj : list) {
                int i19 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                i16.l1 l1Var = (i16.l1) obj;
                if (i17 >= i18) {
                    l1Var.getClass();
                    i16.k1 m17 = i16.l1.m(l1Var);
                    m17.f369096g |= 2;
                    m17.f369098i = true;
                    l1Var = m17.d();
                    if (!l1Var.mo134563xf582434a()) {
                        throw new p16.x0(l1Var);
                    }
                }
                arrayList.add(l1Var);
                i17 = i19;
            }
            list = arrayList;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "run(...)");
        this.f384994a = list;
    }

    public final i16.l1 a(int i17) {
        return (i16.l1) this.f384994a.get(i17);
    }
}
