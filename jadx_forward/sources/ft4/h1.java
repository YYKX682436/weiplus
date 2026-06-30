package ft4;

/* loaded from: classes14.dex */
public final class h1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19140xe76629ab f348154d;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19140xe76629ab activityC19140xe76629ab) {
        this.f348154d = activityC19140xe76629ab;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletLedgerPersonUI", "cancel loading");
        this.f348154d.finish();
    }
}
