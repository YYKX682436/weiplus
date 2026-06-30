package e1;

/* loaded from: classes14.dex */
public abstract class y0 extends e1.r {

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Shader f327856b;

    /* renamed from: c, reason: collision with root package name */
    public long f327857c;

    public y0() {
        super(null);
        int i17 = d1.k.f307176d;
        this.f327857c = d1.k.f307175c;
    }

    @Override // e1.r
    public final void a(long j17, e1.n0 p17, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p");
        android.graphics.Shader shader = this.f327856b;
        if (shader == null || !d1.k.a(this.f327857c, j17)) {
            shader = b(j17);
            this.f327856b = shader;
            this.f327857c = j17;
        }
        e1.g gVar = (e1.g) p17;
        android.graphics.Paint paint = gVar.f327787a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "<this>");
        long b17 = e1.a0.b(paint.getColor());
        long j18 = e1.y.f327844b;
        if (!e1.y.c(b17, j18)) {
            gVar.e(j18);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f327789c, shader)) {
            gVar.h(shader);
        }
        android.graphics.Paint paint2 = gVar.f327787a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint2, "<this>");
        if (((float) paint2.getAlpha()) / 255.0f == f17) {
            return;
        }
        gVar.c(f17);
    }

    public abstract android.graphics.Shader b(long j17);
}
