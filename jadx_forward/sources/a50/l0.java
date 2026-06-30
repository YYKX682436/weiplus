package a50;

/* loaded from: classes11.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83039d;

    public l0(java.lang.String str) {
        this.f83039d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0 a17;
        if (a50.v0.f83078b) {
            a50.v0.f83078b = false;
            a50.v0.f83079c = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxBizFlutterInstantsHelper", "killFlutterInstants from = " + this.f83039d);
            y40.i0 i0Var = (y40.i0) z40.e.get();
            p3325xe03a0797.p3326xc267989b.l.d(i0Var.f540829e, null, null, new y40.j(i0Var, null), 3, null);
            if (!yw.h1.f547865a.n() || (a17 = a50.e1.f83004a.a()) == null) {
                return;
            }
            a17.C(false, a50.k0.f83034a);
        }
    }
}
