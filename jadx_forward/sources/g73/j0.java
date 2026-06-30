package g73;

/* loaded from: classes15.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f350812d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(java.util.List list) {
        super(0);
        this.f350812d = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOffService", "restore from multiTaskInfoList");
        g73.o0.f350847g.clear();
        g73.o0.f350848h.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f350812d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 a17 = h73.a.f361017a.a((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) it.next());
            if (a17 != null) {
                arrayList.add(a17);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260 = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) it6.next();
            arrayList2.add(new jz5.l(abstractC16085x8c838260.getKey(), abstractC16085x8c838260));
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = g73.o0.f350847g;
        kz5.c1.r(arrayList2, concurrentHashMap);
        try {
            g73.m2 m2Var = g73.o0.f350853p;
            java.util.Collection values = concurrentHashMap.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            m2Var.e(values);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HandOffService", e17, "restoreFromMultiTaskInfoList fail, exp:%s", e17);
        }
        return jz5.f0.f384359a;
    }
}
