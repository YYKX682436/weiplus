package qx4;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx4.d0 f448944e;

    public i(java.lang.String str, qx4.d0 d0Var) {
        this.f448943d = str;
        this.f448944e = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qx4.d0.h(this.f448943d, this.f448944e);
    }
}
