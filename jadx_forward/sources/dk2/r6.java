package dk2;

/* loaded from: classes2.dex */
public final class r6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315548e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f315549f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f315550g;

    public r6(int i17, android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.qt2 qt2Var) {
        this.f315547d = i17;
        this.f315548e = context;
        this.f315549f = c19792x256d2725;
        this.f315550g = qt2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).rk() || ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "startPlayLiveOnFeedFlow: isVisitorLiving or isAnchorLiving, next loop");
            dk2.u6.f315707d.c(this.f315547d * 1000, 0L);
            return;
        }
        dk2.u6 u6Var = dk2.u6.f315704a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f315549f;
        r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
        if (m76794xd0557130 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "[reportJoinLiveOnFeedFlow]， liveid = " + m76794xd0557130.m75942xfb822ef2(0));
        u6Var.c(this.f315548e, c19792x256d2725, this.f315550g);
    }
}
