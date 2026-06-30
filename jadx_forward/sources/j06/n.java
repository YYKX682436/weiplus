package j06;

/* loaded from: classes16.dex */
public final class n extends j06.j0 implements j06.i {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f378602e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(java.lang.reflect.Constructor r8, java.lang.Object r9) {
        /*
            r7 = this;
            java.lang.String r0 = "constructor"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.Class r3 = r8.getDeclaringClass()
            java.lang.String r0 = "getDeclaringClass(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r0)
            r4 = 0
            java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
            java.lang.String r0 = "getGenericParameterTypes(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r0)
            r6 = 0
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f378602e = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j06.n.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
    }

    @Override // j06.k
    /* renamed from: call */
    public java.lang.Object mo140163x2e7a5e(java.lang.Object[] args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        j06.j.a(this, args);
        java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) this.f378596a;
        p3321xbce91901.jvm.p3324x21ffc6bd.l0 l0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.l0(2);
        l0Var.a(this.f378602e);
        l0Var.b(args);
        return constructor.newInstance(l0Var.d(new java.lang.Object[l0Var.c()]));
    }
}
