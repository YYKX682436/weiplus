package a50;

/* loaded from: classes11.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1506d;

    public l0(java.lang.String str) {
        this.f1506d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.finder_box.c0 a17;
        if (a50.v0.f1545b) {
            a50.v0.f1545b = false;
            a50.v0.f1546c = true;
            com.tencent.mars.xlog.Log.i("Finder.BoxBizFlutterInstantsHelper", "killFlutterInstants from = " + this.f1506d);
            y40.i0 i0Var = (y40.i0) z40.e.get();
            kotlinx.coroutines.l.d(i0Var.f459296e, null, null, new y40.j(i0Var, null), 3, null);
            if (!yw.h1.f466332a.n() || (a17 = a50.e1.f1471a.a()) == null) {
                return;
            }
            a17.C(false, a50.k0.f1501a);
        }
    }
}
