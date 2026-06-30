package ws2;

/* loaded from: classes3.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 f530676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f530677e;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 c14931xe48fc583, long j17) {
        this.f530676d = c14931xe48fc583;
        this.f530677e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1 c14329x76e637f1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 c14931xe48fc583 = this.f530676d;
        int i17 = c14931xe48fc583.f206418n.f530683b;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c14931xe48fc583.f206415h.mo7946xf939df19();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.replay.FinderLiveReplayAdapter");
        java.util.ArrayList arrayList = ((ws2.j) mo7946xf939df19).f530589d;
        boolean z17 = false;
        int size = arrayList != null ? arrayList.size() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "restart curPos:" + i17 + "(liveId:" + this.f530677e + "),size:" + size + '!');
        if (i17 >= 0 && i17 < size) {
            z17 = true;
        }
        if (!z17 || (c14329x76e637f1 = c14931xe48fc583.f206416i) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1.Y(c14329x76e637f1, false, true, null, 5, null);
    }
}
