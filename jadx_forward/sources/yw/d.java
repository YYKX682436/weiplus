package yw;

/* loaded from: classes11.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f547822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f547823e;

    public d(yw.y yVar, int i17) {
        this.f547822d = yVar;
        this.f547823e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c cVar = this.f547822d.f548042a;
        if (cVar != null) {
            cVar.s(this.f547823e);
        }
    }
}
