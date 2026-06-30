package yw;

/* loaded from: classes11.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f547984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f547985e;

    public s(yw.y yVar, int i17) {
        this.f547984d = yVar;
        this.f547985e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c cVar = this.f547984d.f548042a;
        if (cVar != null) {
            cVar.g(this.f547985e);
        }
    }
}
