package bm2;

/* loaded from: classes8.dex */
public final class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.p8 f22207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22208e;

    public o8(bm2.p8 p8Var, int i17) {
        this.f22207d = p8Var;
        this.f22208e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f22207d.f22234g;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(this.f22208e));
        }
    }
}
