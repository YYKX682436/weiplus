package id2;

/* loaded from: classes2.dex */
public final class n5 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id2.p5 f372229a;

    public n5(id2.p5 p5Var) {
        this.f372229a = p5Var;
    }

    @Override // in5.p
    public float a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return 0.5f;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSelfLotteryHistoryResultUIC", "onExposeTimeRecorded: size = " + recordsSet.size());
    }

    @Override // in5.p
    public void d(in5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        in5.c cVar = item.f374603a;
        if ((cVar instanceof so2.a3 ? (so2.a3) cVar : null) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
            java.lang.String O6 = id2.p5.O6(this.f372229a);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            a4Var.a(O6, "", b52.b.b(), "lottery_page_list", "");
        }
    }
}
