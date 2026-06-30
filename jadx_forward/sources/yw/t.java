package yw;

/* loaded from: classes11.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f548000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f548001e;

    public t(yw.y yVar, int i17) {
        this.f548000d = yVar;
        this.f548001e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c cVar = this.f548000d.f548042a;
        if (cVar != null) {
            cVar.j(this.f548001e);
        }
    }
}
