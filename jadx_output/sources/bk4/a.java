package bk4;

/* loaded from: classes3.dex */
public final class a implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f21402d;

    public a(com.tencent.mm.modelbase.m1 m1Var) {
        this.f21402d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.HistoryItemLoader", "cancel loadHistoryFeed");
        gm0.j1.d().d(this.f21402d);
    }
}
