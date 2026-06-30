package l01;

/* loaded from: classes7.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f396325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l01.c0 f396326e;

    public x(l01.c0 c0Var, android.graphics.Bitmap bitmap) {
        this.f396326e = c0Var;
        this.f396325d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f396326e.g(this.f396325d);
    }
}
