package yw;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f547882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f547883e;

    public i(yw.y yVar, int i17) {
        this.f547882d = yVar;
        this.f547883e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c cVar = this.f547882d.f548042a;
        if (cVar != null) {
            cVar.D(this.f547883e);
        }
    }
}
