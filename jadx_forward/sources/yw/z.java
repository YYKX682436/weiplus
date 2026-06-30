package yw;

/* loaded from: classes11.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.c0 f548049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f548050e;

    public z(yw.c0 c0Var, int i17) {
        this.f548049d = c0Var;
        this.f548050e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e eVar = this.f548049d.f547817a;
        if (eVar != null) {
            eVar.q(this.f548050e);
        }
    }
}
