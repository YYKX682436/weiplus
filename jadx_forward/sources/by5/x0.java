package by5;

/* loaded from: classes13.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f118144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ by5.u0 f118145e;

    public x0(by5.u0 u0Var, java.lang.Object[] objArr) {
        this.f118145e = u0Var;
        this.f118144d = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f118145e.i(this.f118144d);
    }
}
