package ft4;

/* loaded from: classes14.dex */
public final class b0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f f348117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f) {
        super(false);
        this.f348117d = activityC19138xce65e38f;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", "click fix header date");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f = this.f348117d;
        ft4.u uVar = activityC19138xce65e38f.D;
        if (uVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f.U6(activityC19138xce65e38f, uVar.f348233d);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
            throw null;
        }
    }
}
