package yw;

/* loaded from: classes11.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f547809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f547810e;

    public b(yw.y yVar, int i17) {
        this.f547809d = yVar;
        this.f547810e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c cVar = this.f547809d.f548042a;
        if (cVar != null) {
            cVar.u(this.f547810e);
        }
    }
}
