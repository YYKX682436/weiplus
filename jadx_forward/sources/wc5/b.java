package wc5;

/* loaded from: classes10.dex */
public final class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.q f526065d;

    public b(wc5.q qVar) {
        this.f526065d = qVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryInitialLoadUIC", "loading toast cancelled, finish activity");
        wc5.q qVar = this.f526065d;
        qVar.f526162n = null;
        if (qVar.f526155d.isFinishing() || qVar.f526155d.isDestroyed()) {
            return;
        }
        qVar.f526155d.finish();
    }
}
