package c26;

/* loaded from: classes16.dex */
public final class a extends a26.a {

    /* renamed from: q, reason: collision with root package name */
    public static final c26.a f119614q = new c26.a();

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
            p16.u r0 = j16.c.f378732a
            r2 = r0
            java.lang.String r3 = "packageFqName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r3)
            p16.u r0 = j16.c.f378734c
            r3 = r0
            java.lang.String r4 = "constructorAnnotation"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r4)
            p16.u r0 = j16.c.f378733b
            r4 = r0
            java.lang.String r5 = "classAnnotation"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r5)
            p16.u r0 = j16.c.f378735d
            r5 = r0
            java.lang.String r6 = "functionAnnotation"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r6)
            r6 = 0
            p16.u r0 = j16.c.f378736e
            r7 = r0
            java.lang.String r8 = "propertyAnnotation"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r8)
            p16.u r0 = j16.c.f378737f
            r8 = r0
            java.lang.String r9 = "propertyGetterAnnotation"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r9)
            p16.u r0 = j16.c.f378738g
            r9 = r0
            java.lang.String r10 = "propertySetterAnnotation"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r10)
            r10 = 0
            r11 = 0
            r12 = 0
            p16.u r0 = j16.c.f378740i
            r13 = r0
            java.lang.String r14 = "enumEntryAnnotation"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r14)
            p16.u r0 = j16.c.f378739h
            r14 = r0
            java.lang.String r15 = "compileTimeValue"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r15)
            p16.u r0 = j16.c.f378741j
            r15 = r0
            java.lang.String r6 = "parameterAnnotation"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r6)
            p16.u r0 = j16.c.f378742k
            r16 = r0
            java.lang.String r6 = "typeAnnotation"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r6)
            p16.u r0 = j16.c.f378743l
            r17 = r0
            java.lang.String r6 = "typeParameterAnnotation"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r6)
            r0 = r18
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c26.a.<init>():void");
    }

    public final java.lang.String a(n16.c fqName) {
        java.lang.String h17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String b17 = fqName.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "asString(...)");
        sb6.append(r26.i0.u(b17, '.', '/', false, 4, null));
        sb6.append('/');
        if (fqName.d()) {
            h17 = "default-package";
        } else {
            h17 = fqName.f().h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "asString(...)");
        }
        sb6.append(h17.concat(".kotlin_builtins"));
        return sb6.toString();
    }
}
