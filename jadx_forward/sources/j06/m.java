package j06;

/* loaded from: classes16.dex */
public final class m extends j06.j0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(java.lang.reflect.Constructor r8) {
        /*
            r7 = this;
            java.lang.String r0 = "constructor"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.Class r3 = r8.getDeclaringClass()
            java.lang.String r0 = "getDeclaringClass(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r0)
            r4 = 0
            java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
            java.lang.String r1 = "getGenericParameterTypes(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            int r1 = r0.length
            r2 = 0
            r5 = 1
            if (r1 > r5) goto L20
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            goto L26
        L20:
            int r1 = r0.length
            int r1 = r1 - r5
            java.lang.Object[] r0 = kz5.v.s(r0, r2, r1)
        L26:
            r5 = r0
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r6 = 0
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j06.m.<init>(java.lang.reflect.Constructor):void");
    }

    @Override // j06.k
    /* renamed from: call */
    public java.lang.Object mo140163x2e7a5e(java.lang.Object[] args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        j06.j.a(this, args);
        java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) this.f378596a;
        p3321xbce91901.jvm.p3324x21ffc6bd.l0 l0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.l0(2);
        l0Var.b(args);
        l0Var.a(null);
        return constructor.newInstance(l0Var.d(new java.lang.Object[l0Var.c()]));
    }
}
