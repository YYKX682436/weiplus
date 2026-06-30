package ft4;

/* loaded from: classes14.dex */
public final class c1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c f348132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c activityC19139x26e1e89c) {
        super(false);
        this.f348132d = activityC19139x26e1e89c;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click last month view:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c activityC19139x26e1e89c = this.f348132d;
        sb6.append(activityC19139x26e1e89c.f261986i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerPersonDetailUI", sb6.toString());
        int i17 = activityC19139x26e1e89c.f261986i;
        activityC19139x26e1e89c.f261983f = (i17 * 100) + 1;
        activityC19139x26e1e89c.f261984g = (i17 * 100) + 31;
        activityC19139x26e1e89c.U6();
    }
}
