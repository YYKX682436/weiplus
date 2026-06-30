package bg;

/* loaded from: classes7.dex */
public class q0 implements tf.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f101361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg.f f101362b;

    public q0(bg.f fVar, java.lang.Runnable runnable) {
        this.f101362b = fVar;
        this.f101361a = runnable;
    }

    @Override // tf.m
    public void a(android.graphics.Bitmap bitmap) {
        this.f101362b.X1 = bitmap;
        this.f101361a.run();
    }
}
