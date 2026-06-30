package z;

/* loaded from: classes13.dex */
public final class z3 implements z.r3 {

    /* renamed from: a, reason: collision with root package name */
    public final z.y f550418a;

    /* renamed from: b, reason: collision with root package name */
    public z.w f550419b;

    /* renamed from: c, reason: collision with root package name */
    public z.w f550420c;

    /* renamed from: d, reason: collision with root package name */
    public z.w f550421d;

    public z3(z.y anims) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anims, "anims");
        this.f550418a = anims;
    }

    @Override // z.r3
    public boolean a() {
        return false;
    }

    @Override // z.r3
    public z.w b(z.w initialValue, z.w targetValue, z.w initialVelocity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialValue, "initialValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetValue, "targetValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialVelocity, "initialVelocity");
        if (this.f550421d == null) {
            this.f550421d = initialVelocity.c();
        }
        z.w wVar = this.f550421d;
        if (wVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("endVelocityVector");
            throw null;
        }
        int b17 = wVar.b();
        for (int i17 = 0; i17 < b17; i17++) {
            z.w wVar2 = this.f550421d;
            if (wVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("endVelocityVector");
                throw null;
            }
            wVar2.e(i17, this.f550418a.get(i17).d(initialValue.a(i17), targetValue.a(i17), initialVelocity.a(i17)));
        }
        z.w wVar3 = this.f550421d;
        if (wVar3 != null) {
            return wVar3;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("endVelocityVector");
        throw null;
    }

    @Override // z.r3
    public z.w c(long j17, z.w initialValue, z.w targetValue, z.w initialVelocity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialValue, "initialValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetValue, "targetValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialVelocity, "initialVelocity");
        if (this.f550419b == null) {
            this.f550419b = initialValue.c();
        }
        z.w wVar = this.f550419b;
        if (wVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("valueVector");
            throw null;
        }
        int b17 = wVar.b();
        for (int i17 = 0; i17 < b17; i17++) {
            z.w wVar2 = this.f550419b;
            if (wVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("valueVector");
                throw null;
            }
            wVar2.e(i17, this.f550418a.get(i17).e(j17, initialValue.a(i17), targetValue.a(i17), initialVelocity.a(i17)));
        }
        z.w wVar3 = this.f550419b;
        if (wVar3 != null) {
            return wVar3;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("valueVector");
        throw null;
    }

    @Override // z.r3
    public long d(z.w initialValue, z.w targetValue, z.w initialVelocity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialValue, "initialValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetValue, "targetValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialVelocity, "initialVelocity");
        java.util.Iterator it = e06.p.m(0, initialValue.b()).iterator();
        long j17 = 0;
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            j17 = java.lang.Math.max(j17, this.f550418a.get(b17).c(initialValue.a(b17), targetValue.a(b17), initialVelocity.a(b17)));
        }
        return j17;
    }

    @Override // z.r3
    public z.w f(long j17, z.w initialValue, z.w targetValue, z.w initialVelocity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialValue, "initialValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetValue, "targetValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialVelocity, "initialVelocity");
        if (this.f550420c == null) {
            this.f550420c = initialVelocity.c();
        }
        z.w wVar = this.f550420c;
        if (wVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("velocityVector");
            throw null;
        }
        int b17 = wVar.b();
        for (int i17 = 0; i17 < b17; i17++) {
            z.w wVar2 = this.f550420c;
            if (wVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("velocityVector");
                throw null;
            }
            wVar2.e(i17, this.f550418a.get(i17).b(j17, initialValue.a(i17), targetValue.a(i17), initialVelocity.a(i17)));
        }
        z.w wVar3 = this.f550420c;
        if (wVar3 != null) {
            return wVar3;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("velocityVector");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z3(z.l0 anim) {
        this(new z.y3(anim));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
    }
}
