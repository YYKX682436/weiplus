package hw2;

/* loaded from: classes10.dex */
public final class e0 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f367058d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f367059e;

    public e0(ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f367058d = new java.util.ArrayList();
        this.f367059e = new java.util.ArrayList();
    }

    public final void a() {
        java.util.ArrayList arrayList = this.f367058d;
        if (!arrayList.isEmpty()) {
            java.lang.String str = (java.lang.String) kz5.n0.i0(arrayList);
            arrayList.remove(arrayList.size() - 1);
            dw3.c0.f325715a.j(str);
        }
        java.util.ArrayList arrayList2 = this.f367059e;
        if (!arrayList2.isEmpty()) {
            arrayList2.remove(arrayList2.size() - 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderSubVideoFilePlugin", "current file list size:" + arrayList.size());
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderSubVideoFilePlugin", "release");
        ((ku5.t0) ku5.t0.f394148d).g(new hw2.d0(this));
    }
}
