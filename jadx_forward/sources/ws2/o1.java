package ws2;

/* loaded from: classes3.dex */
public final class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 f530647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f530648e;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 c14931xe48fc583, long j17) {
        this.f530647d = c14931xe48fc583;
        this.f530648e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 c14931xe48fc583 = this.f530647d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c14931xe48fc583.f206415h.mo7946xf939df19();
        ws2.j jVar = mo7946xf939df19 instanceof ws2.j ? (ws2.j) mo7946xf939df19 : null;
        if (jVar != null) {
            java.util.ArrayList arrayList = jVar.f530589d;
            int i17 = -1;
            long j17 = this.f530648e;
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                int i18 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((km2.m) it.next()).f390662d.f150070e == j17) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
            }
            java.util.ArrayList arrayList2 = jVar.f530589d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "delete deletePos:" + i17 + "(liveId:" + j17 + "),size:" + (arrayList2 != null ? arrayList2.size() : 0) + '!');
            mm2.c1 c1Var = (mm2.c1) ws2.k1.f530599r.a().e(mm2.c1.class);
            if (c1Var != null) {
                c1Var.O1 = false;
            }
            c14931xe48fc583.f206411d.finish();
        }
    }
}
