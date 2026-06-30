package bk4;

/* loaded from: classes3.dex */
public final class a implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f102935d;

    public a(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f102935d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.HistoryItemLoader", "cancel loadHistoryFeed");
        gm0.j1.d().d(this.f102935d);
    }
}
