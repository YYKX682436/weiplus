package hy4;

/* loaded from: classes7.dex */
public final class j0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hy4.k0 f367652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f367653b;

    public j0(hy4.k0 k0Var, yz5.a aVar) {
        this.f367652a = k0Var;
        this.f367653b = aVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        this.f367652a.d();
        hy4.k0 k0Var = this.f367652a;
        hy4.i0 i0Var = new hy4.i0(k0Var, (java.lang.String) obj, this.f367653b);
        k0Var.f367676y = i0Var;
        android.os.Looper.myQueue().addIdleHandler(i0Var);
    }
}
