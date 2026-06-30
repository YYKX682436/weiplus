package bg;

/* loaded from: classes7.dex */
public class q0 implements tf.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f19828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg.f f19829b;

    public q0(bg.f fVar, java.lang.Runnable runnable) {
        this.f19829b = fVar;
        this.f19828a = runnable;
    }

    @Override // tf.m
    public void a(android.graphics.Bitmap bitmap) {
        this.f19829b.X1 = bitmap;
        this.f19828a.run();
    }
}
