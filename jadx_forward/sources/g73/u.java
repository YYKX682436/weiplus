package g73;

/* loaded from: classes15.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final g73.u f350866d = new g73.u();

    public u() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOffService", "do all list");
        if (!g73.o0.wi(g73.o0.f350844d)) {
            java.util.Collection values = g73.o0.f350847g.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : values) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260 = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) obj;
                g73.o0 o0Var = g73.o0.f350844d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC16085x8c838260);
                if (g73.o0.Ai(o0Var, abstractC16085x8c838260)) {
                    arrayList.add(obj);
                }
            }
            java.util.List F0 = kz5.n0.F0(arrayList, new g73.t());
            g73.m2 m2Var = g73.o0.f350853p;
            m2Var.getClass();
            m2Var.c();
            m2Var.f350835s = F0;
            m2Var.a();
        } else if (g73.o0.f350851n) {
            java.util.Collection values2 = g73.o0.f350847g.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
            java.util.List F02 = kz5.n0.F0(values2, new g73.r());
            g73.m2 m2Var2 = g73.o0.f350853p;
            m2Var2.getClass();
            m2Var2.c();
            m2Var2.f350835s = F02;
            m2Var2.a();
        } else {
            java.util.Collection values3 = g73.o0.f350847g.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values3, "<get-values>(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : values3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c8382602 = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) obj2;
                boolean z17 = true;
                if (abstractC16085x8c8382602.getHandOffType() != 2 && (!g73.o0.f350852o || abstractC16085x8c8382602.mo65028xe67d4b7a() != 1)) {
                    z17 = false;
                }
                if (z17) {
                    arrayList2.add(obj2);
                }
            }
            java.util.List F03 = kz5.n0.F0(arrayList2, new g73.s());
            g73.o0.f350844d.getClass();
            g73.m2 m2Var3 = g73.o0.f350853p;
            m2Var3.getClass();
            m2Var3.c();
            m2Var3.f350835s = F03;
            m2Var3.a();
        }
        return jz5.f0.f384359a;
    }
}
