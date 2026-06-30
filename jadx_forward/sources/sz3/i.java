package sz3;

/* loaded from: classes15.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.m f495559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xz3.l f495560e;

    public i(sz3.m mVar, xz3.l lVar) {
        this.f495559d = mVar;
        this.f495560e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.m mVar = this.f495559d;
        java.util.ArrayList arrayList = mVar.f495602e;
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(arrayList).remove(this.f495560e);
        sz3.m.l(mVar);
    }
}
