package ky;

/* loaded from: classes14.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f394876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f394877e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f394878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f394879g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(float f17, n0.e5 e5Var, int i17, long j17) {
        super(1);
        this.f394876d = f17;
        this.f394877e = e5Var;
        this.f394878f = i17;
        this.f394879g = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g1.i Canvas = (g1.i) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(Canvas, "$this$Canvas");
        float min = java.lang.Math.min(d1.k.d(Canvas.a()), d1.k.b(Canvas.a()));
        float f17 = 2;
        float f18 = (min - this.f394876d) / f17;
        float f19 = min / 2.0f;
        long a17 = d1.f.a(f19, f19);
        float floatValue = ((java.lang.Number) this.f394877e.mo128745x754a37bb()).floatValue();
        long j17 = this.f394879g;
        float f27 = this.f394876d;
        g1.b bVar = (g1.b) Canvas.p();
        long b17 = bVar.b();
        bVar.a().c();
        ((g1.d) bVar.f349037a).c(floatValue, a17);
        int i17 = 0;
        while (true) {
            int i18 = this.f394878f;
            if (i17 >= i18) {
                g1.b bVar2 = bVar;
                bVar2.a().b();
                bVar2.c(b17);
                return jz5.f0.f384359a;
            }
            float f28 = i18;
            float f29 = i17 / f28;
            float f37 = (f29 * 360.0f) - 90.0f;
            float f38 = ((f29 + (1.0f / f28)) * 360.0f) - 90.0f;
            long j18 = b17;
            g1.b bVar3 = bVar;
            float f39 = f27;
            float f47 = f18 * f17;
            g1.h.a(Canvas, e1.y.b(j17, f29, 0.0f, 0.0f, 0.0f, 14, null), f37, f38 - f37, false, d1.f.a(d1.e.c(a17) - f18, d1.e.d(a17) - f18), d1.l.a(f47, f47), 0.0f, new g1.n(f39, 0.0f, (i17 == 0 || i17 == i18 + (-1)) ? 1 : 0, 0, null, 26, null), null, 0, 832, null);
            i17++;
            bVar = bVar3;
            f27 = f39;
            j17 = j17;
            a17 = a17;
            f17 = f17;
            Canvas = Canvas;
            b17 = j18;
        }
    }
}
