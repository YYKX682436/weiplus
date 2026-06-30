package a50;

/* loaded from: classes9.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f83061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d1 f83063f;

    public r(a50.a0 a0Var, int i17, com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d1 d1Var) {
        this.f83061d = a0Var;
        this.f83062e = i17;
        this.f83063f = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c cVar = this.f83061d.f82984a;
        if (cVar != null) {
            cVar.G1(this.f83062e, this.f83063f);
        }
    }
}
