package k13;

/* loaded from: classes10.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f384725d;

    public a1(k13.l1 l1Var) {
        this.f384725d = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i95.m c17 = i95.n0.c(h13.l0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (h13.l0.Ui((h13.l0) c17, null, 1, null)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ForceNotify.MsgWindow", "PlaySound.playRoot");
        k13.l1 l1Var = this.f384725d;
        l1Var.f384780y = com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.d(l1Var.b(), com.p314xaae8f345.mm.R.C30867xcad56011.f573684ff0, com.p314xaae8f345.mm.sdk.p2603x2137b148.u5.NOTSET, 2, true, null);
    }
}
