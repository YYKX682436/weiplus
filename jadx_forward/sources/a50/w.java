package a50;

/* loaded from: classes11.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f83085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83086e;

    public w(a50.a0 a0Var, int i17) {
        this.f83085d = a0Var;
        this.f83086e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c cVar = this.f83085d.f82984a;
        if (cVar != null) {
            cVar.n(this.f83086e);
        }
    }
}
