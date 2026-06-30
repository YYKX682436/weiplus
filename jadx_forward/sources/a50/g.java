package a50;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f83017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83018e;

    public g(a50.a0 a0Var, int i17) {
        this.f83017d = a0Var;
        this.f83018e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c cVar = this.f83017d.f82984a;
        if (cVar != null) {
            cVar.l(this.f83018e);
        }
    }
}
