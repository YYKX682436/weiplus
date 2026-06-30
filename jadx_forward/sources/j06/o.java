package j06;

/* loaded from: classes16.dex */
public final class o extends j06.j0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(java.lang.reflect.Constructor r8) {
        /*
            r7 = this;
            java.lang.String r0 = "constructor"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.Class r3 = r8.getDeclaringClass()
            java.lang.String r0 = "getDeclaringClass(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r0)
            java.lang.Class r0 = r8.getDeclaringClass()
            java.lang.Class r1 = r0.getDeclaringClass()
            if (r1 == 0) goto L24
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L24
            r4 = r1
            goto L26
        L24:
            r0 = 0
            r4 = r0
        L26:
            java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
            java.lang.String r0 = "getGenericParameterTypes(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r0)
            r6 = 0
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j06.o.<init>(java.lang.reflect.Constructor):void");
    }

    @Override // j06.k
    /* renamed from: call */
    public java.lang.Object mo140163x2e7a5e(java.lang.Object[] args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        j06.j.a(this, args);
        return ((java.lang.reflect.Constructor) this.f378596a).newInstance(java.util.Arrays.copyOf(args, args.length));
    }
}
