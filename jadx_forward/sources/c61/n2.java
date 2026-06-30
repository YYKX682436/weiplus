package c61;

/* loaded from: classes2.dex */
public final class n2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final c61.n2 f120713d = new c61.n2();

    public n2() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.p51 resp = (r45.p51) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
        java.util.LinkedList<r45.le0> m75941xfb821914 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getDiagnosis_items(...)");
        for (r45.le0 le0Var : m75941xfb821914) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveNoticeCache", "text: " + le0Var.m75945x2fec8307(1) + ", objectId: " + le0Var.m75942xfb822ef2(0) + ", textIndex: " + le0Var.m75939xb282bd08(2));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189467e.put(java.lang.Long.valueOf(le0Var.m75942xfb822ef2(0)), le0Var);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
            am.ia iaVar = c5445x963cab3.f135785g;
            iaVar.f88452b = 32;
            iaVar.f88451a = le0Var.m75942xfb822ef2(0);
            c5445x963cab3.e();
        }
        return jz5.f0.f384359a;
    }
}
