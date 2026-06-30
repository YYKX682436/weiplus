package c26;

/* loaded from: classes16.dex */
public final class a extends a26.a {

    /* renamed from: q, reason: collision with root package name */
    public static final c26.a f38081q = new c26.a();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a() {
        /*
            r18 = this;
            p16.l r1 = new p16.l
            r1.<init>()
            j16.c.a(r1)
            p16.u r0 = j16.c.f297199a
            r2 = r0
            java.lang.String r3 = "packageFqName"
            kotlin.jvm.internal.o.f(r0, r3)
            p16.u r0 = j16.c.f297201c
            r3 = r0
            java.lang.String r4 = "constructorAnnotation"
            kotlin.jvm.internal.o.f(r0, r4)
            p16.u r0 = j16.c.f297200b
            r4 = r0
            java.lang.String r5 = "classAnnotation"
            kotlin.jvm.internal.o.f(r0, r5)
            p16.u r0 = j16.c.f297202d
            r5 = r0
            java.lang.String r6 = "functionAnnotation"
            kotlin.jvm.internal.o.f(r0, r6)
            r6 = 0
            p16.u r0 = j16.c.f297203e
            r7 = r0
            java.lang.String r8 = "propertyAnnotation"
            kotlin.jvm.internal.o.f(r0, r8)
            p16.u r0 = j16.c.f297204f
            r8 = r0
            java.lang.String r9 = "propertyGetterAnnotation"
            kotlin.jvm.internal.o.f(r0, r9)
            p16.u r0 = j16.c.f297205g
            r9 = r0
            java.lang.String r10 = "propertySetterAnnotation"
            kotlin.jvm.internal.o.f(r0, r10)
            r10 = 0
            r11 = 0
            r12 = 0
            p16.u r0 = j16.c.f297207i
            r13 = r0
            java.lang.String r14 = "enumEntryAnnotation"
            kotlin.jvm.internal.o.f(r0, r14)
            p16.u r0 = j16.c.f297206h
            r14 = r0
            java.lang.String r15 = "compileTimeValue"
            kotlin.jvm.internal.o.f(r0, r15)
            p16.u r0 = j16.c.f297208j
            r15 = r0
            java.lang.String r6 = "parameterAnnotation"
            kotlin.jvm.internal.o.f(r0, r6)
            p16.u r0 = j16.c.f297209k
            r16 = r0
            java.lang.String r6 = "typeAnnotation"
            kotlin.jvm.internal.o.f(r0, r6)
            p16.u r0 = j16.c.f297210l
            r17 = r0
            java.lang.String r6 = "typeParameterAnnotation"
            kotlin.jvm.internal.o.f(r0, r6)
            r0 = r18
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c26.a.<init>():void");
    }

    public final java.lang.String a(n16.c fqName) {
        java.lang.String h17;
        kotlin.jvm.internal.o.g(fqName, "fqName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String b17 = fqName.b();
        kotlin.jvm.internal.o.f(b17, "asString(...)");
        sb6.append(r26.i0.u(b17, '.', '/', false, 4, null));
        sb6.append('/');
        if (fqName.d()) {
            h17 = "default-package";
        } else {
            h17 = fqName.f().h();
            kotlin.jvm.internal.o.f(h17, "asString(...)");
        }
        sb6.append(h17.concat(".kotlin_builtins"));
        return sb6.toString();
    }
}
