package z;

/* loaded from: classes14.dex */
public final class c0 implements z.l {

    /* renamed from: a, reason: collision with root package name */
    public final z.v3 f550139a;

    /* renamed from: b, reason: collision with root package name */
    public final z.w2 f550140b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f550141c;

    /* renamed from: d, reason: collision with root package name */
    public final z.w f550142d;

    /* renamed from: e, reason: collision with root package name */
    public final z.w f550143e;

    /* renamed from: f, reason: collision with root package name */
    public final z.w f550144f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f550145g;

    /* renamed from: h, reason: collision with root package name */
    public final long f550146h;

    public c0(z.d0 animationSpec, z.w2 typeConverter, java.lang.Object obj, z.w initialVelocityVector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationSpec, "animationSpec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeConverter, "typeConverter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialVelocityVector, "initialVelocityVector");
        z.a4 a4Var = new z.a4(((z.e0) animationSpec).f550174a);
        this.f550139a = a4Var;
        this.f550140b = typeConverter;
        this.f550141c = obj;
        z.x2 x2Var = (z.x2) typeConverter;
        z.w wVar = (z.w) x2Var.f550406a.mo146xb9724478(obj);
        this.f550142d = wVar;
        this.f550143e = z.x.a(initialVelocityVector);
        this.f550145g = x2Var.f550407b.mo146xb9724478(a4Var.a(wVar, initialVelocityVector));
        if (a4Var.f550115c == null) {
            a4Var.f550115c = wVar.c();
        }
        z.w wVar2 = a4Var.f550115c;
        if (wVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("velocityVector");
            throw null;
        }
        int b17 = wVar2.b();
        long j17 = 0;
        for (int i17 = 0; i17 < b17; i17++) {
            wVar.a(i17);
            j17 = java.lang.Math.max(j17, ((long) (java.lang.Math.exp(((y.y1) a4Var.f550113a).f540017a.b(initialVelocityVector.a(i17)) / (y.l1.f539927a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f550146h = j17;
        z.w a17 = z.x.a(((z.a4) this.f550139a).b(j17, this.f550142d, initialVelocityVector));
        this.f550144f = a17;
        int b18 = a17.b();
        for (int i18 = 0; i18 < b18; i18++) {
            z.w wVar3 = this.f550144f;
            float a18 = wVar3.a(i18);
            this.f550139a.getClass();
            this.f550139a.getClass();
            wVar3.e(i18, e06.p.e(a18, -0.0f, 0.0f));
        }
    }

    @Override // z.l
    public boolean a() {
        return false;
    }

    @Override // z.l
    public boolean b(long j17) {
        return z.k.a(this, j17);
    }

    @Override // z.l
    public long c() {
        return this.f550146h;
    }

    @Override // z.l
    public z.w2 d() {
        return this.f550140b;
    }

    @Override // z.l
    public java.lang.Object e(long j17) {
        if (z.k.a(this, j17)) {
            return this.f550145g;
        }
        yz5.l lVar = ((z.x2) this.f550140b).f550407b;
        z.a4 a4Var = (z.a4) this.f550139a;
        a4Var.getClass();
        z.w initialValue = this.f550142d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialValue, "initialValue");
        z.w initialVelocity = this.f550143e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialVelocity, "initialVelocity");
        if (a4Var.f550114b == null) {
            a4Var.f550114b = initialValue.c();
        }
        z.w wVar = a4Var.f550114b;
        java.lang.String str = "valueVector";
        if (wVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("valueVector");
            throw null;
        }
        int b17 = wVar.b();
        int i17 = 0;
        while (i17 < b17) {
            z.w wVar2 = a4Var.f550114b;
            if (wVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                throw null;
            }
            float a17 = initialValue.a(i17);
            float a18 = initialVelocity.a(i17);
            y.y1 y1Var = (y.y1) a4Var.f550113a;
            y1Var.getClass();
            long j18 = j17 / 1000000;
            y.j1 a19 = y1Var.f540017a.a(a18);
            java.lang.String str2 = str;
            long j19 = a19.f539909c;
            wVar2.e(i17, a17 + (a19.f539908b * java.lang.Math.signum(a19.f539907a) * y.b.f539842a.a(j19 > 0 ? ((float) j18) / ((float) j19) : 1.0f).f539836a));
            i17++;
            str = str2;
        }
        java.lang.String str3 = str;
        z.w wVar3 = a4Var.f550114b;
        if (wVar3 != null) {
            return lVar.mo146xb9724478(wVar3);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str3);
        throw null;
    }

    @Override // z.l
    public java.lang.Object f() {
        return this.f550145g;
    }

    @Override // z.l
    public z.w g(long j17) {
        if (z.k.a(this, j17)) {
            return this.f550144f;
        }
        return ((z.a4) this.f550139a).b(j17, this.f550142d, this.f550143e);
    }
}
