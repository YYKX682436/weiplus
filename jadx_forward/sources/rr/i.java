package rr;

/* loaded from: classes9.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr.n f480662d;

    public i(rr.n nVar) {
        this.f480662d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rr.n nVar = this.f480662d;
        android.app.Activity activity = nVar.f480668a;
        int i17 = al5.u4.f87591t;
        al5.t4 t4Var = new al5.t4(activity);
        t4Var.f87575e = nVar.f480668a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572651c03);
        t4Var.f(true);
        nVar.f480673f = t4Var.g();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        nVar.f480672e = android.os.SystemClock.elapsedRealtime();
    }
}
