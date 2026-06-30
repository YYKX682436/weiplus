package a50;

/* loaded from: classes11.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f83027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83028e;

    public j(a50.a0 a0Var, int i17) {
        this.f83027d = a0Var;
        this.f83028e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c cVar = this.f83027d.f82984a;
        if (cVar != null) {
            cVar.B(this.f83028e);
        }
    }
}
