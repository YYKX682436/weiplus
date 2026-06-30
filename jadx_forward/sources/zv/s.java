package zv;

/* loaded from: classes11.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f557633d;

    public s(java.lang.String str) {
        this.f557633d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.v b17;
        if (zv.e0.f557471b) {
            zv.e0.f557471b = false;
            zv.e0.f557472c = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceFlutterInstantsHelper", "killFlutterInstants from = " + this.f557633d);
            zv.e2 e2Var = (zv.e2) ((bw.k) i95.n0.c(bw.k.class));
            p3325xe03a0797.p3326xc267989b.l.d(e2Var.f557480e, null, null, new zv.p1(e2Var, null), 3, null);
            if (!zv.q.f557612a.g() || (b17 = yw.a3.f547799a.b()) == null) {
                return;
            }
            b17.u(false, zv.r.f557627a);
        }
    }
}
