package wc5;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.q f526071d;

    public c(wc5.q qVar) {
        this.f526071d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc5.q qVar = this.f526071d;
        qVar.f526163o = null;
        if (qVar.f526155d.isFinishing() || qVar.f526155d.isDestroyed()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryInitialLoadUIC", "show loading toast after 300ms");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = qVar.f526155d;
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC0065xcd7aa112);
        e4Var.f293309c = activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq);
        e4Var.f293313g = 2;
        e4Var.f293311e = true;
        e4Var.f293314h = new wc5.b(qVar);
        qVar.f526162n = e4Var.c();
    }
}
