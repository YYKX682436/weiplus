package dq0;

/* loaded from: classes7.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dq0.a0 f323874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f323875e;

    public x(dq0.a0 a0Var, byte[] bArr) {
        this.f323874d = a0Var;
        this.f323875e = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f323874d.n("onRemoveCover", this.f323875e, null);
    }
}
