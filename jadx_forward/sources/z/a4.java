package z;

/* loaded from: classes14.dex */
public final class a4 implements z.v3 {

    /* renamed from: a, reason: collision with root package name */
    public final z.m0 f550113a;

    /* renamed from: b, reason: collision with root package name */
    public z.w f550114b;

    /* renamed from: c, reason: collision with root package name */
    public z.w f550115c;

    /* renamed from: d, reason: collision with root package name */
    public z.w f550116d;

    public a4(z.m0 floatDecaySpec) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(floatDecaySpec, "floatDecaySpec");
        this.f550113a = floatDecaySpec;
    }

    public z.w a(z.w wVar, z.w wVar2) {
        z.w initialValue = wVar;
        z.w initialVelocity = wVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialValue, "initialValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialVelocity, "initialVelocity");
        if (this.f550116d == null) {
            this.f550116d = wVar.c();
        }
        z.w wVar3 = this.f550116d;
        if (wVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("targetVector");
            throw null;
        }
        int b17 = wVar3.b();
        int i17 = 0;
        while (i17 < b17) {
            z.w wVar4 = this.f550116d;
            if (wVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("targetVector");
                throw null;
            }
            float a17 = initialValue.a(i17);
            float a18 = initialVelocity.a(i17);
            double b18 = ((y.y1) this.f550113a).f540017a.b(a18);
            double d17 = y.l1.f539927a;
            wVar4.e(i17, a17 + (((float) (r10.f539915a * r10.f539916b * java.lang.Math.exp((d17 / (d17 - 1.0d)) * b18))) * java.lang.Math.signum(a18)));
            i17++;
            initialValue = wVar;
            initialVelocity = wVar2;
        }
        z.w wVar5 = this.f550116d;
        if (wVar5 != null) {
            return wVar5;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("targetVector");
        throw null;
    }

    public z.w b(long j17, z.w initialValue, z.w initialVelocity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialValue, "initialValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialVelocity, "initialVelocity");
        if (this.f550115c == null) {
            this.f550115c = initialValue.c();
        }
        z.w wVar = this.f550115c;
        if (wVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("velocityVector");
            throw null;
        }
        int b17 = wVar.b();
        for (int i17 = 0; i17 < b17; i17++) {
            z.w wVar2 = this.f550115c;
            if (wVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("velocityVector");
                throw null;
            }
            initialValue.a(i17);
            float a17 = initialVelocity.a(i17);
            y.y1 y1Var = (y.y1) this.f550113a;
            y1Var.getClass();
            long j18 = j17 / 1000000;
            y.j1 a18 = y1Var.f540017a.a(a17);
            long j19 = a18.f539909c;
            wVar2.e(i17, (((y.b.f539842a.a(j19 > 0 ? ((float) j18) / ((float) j19) : 1.0f).f539837b * java.lang.Math.signum(a18.f539907a)) * a18.f539908b) / ((float) j19)) * 1000.0f);
        }
        z.w wVar3 = this.f550115c;
        if (wVar3 != null) {
            return wVar3;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("velocityVector");
        throw null;
    }
}
