package a50;

/* loaded from: classes11.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f83075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83076e;

    public v(a50.a0 a0Var, int i17) {
        this.f83075d = a0Var;
        this.f83076e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c cVar = this.f83075d.f82984a;
        if (cVar != null) {
            cVar.j(this.f83076e);
        }
    }
}
