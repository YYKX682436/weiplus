package j06;

/* loaded from: classes16.dex */
public final class c implements j06.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f378577a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f378578b;

    /* renamed from: c, reason: collision with root package name */
    public final j06.a f378579c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f378580d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f378581e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f378582f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f378583g;

    public c(java.lang.Class jClass, java.util.List parameterNames, j06.a callMode, j06.b origin, java.util.List methods) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jClass, "jClass");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameterNames, "parameterNames");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callMode, "callMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origin, "origin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(methods, "methods");
        this.f378577a = jClass;
        this.f378578b = parameterNames;
        this.f378579c = callMode;
        this.f378580d = methods;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(methods, 10));
        java.util.Iterator it = methods.iterator();
        while (it.hasNext()) {
            arrayList.add(((java.lang.reflect.Method) it.next()).getGenericReturnType());
        }
        this.f378581e = arrayList;
        java.util.List list = this.f378580d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            java.lang.Class<?> returnType = ((java.lang.reflect.Method) it6.next()).getReturnType();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(returnType);
            java.util.List list2 = u06.i.f505038a;
            java.lang.Class<?> cls = (java.lang.Class) u06.i.f505040c.get(returnType);
            if (cls != null) {
                returnType = cls;
            }
            arrayList2.add(returnType);
        }
        this.f378582f = arrayList2;
        java.util.List list3 = this.f378580d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list3, 10));
        java.util.Iterator it7 = list3.iterator();
        while (it7.hasNext()) {
            arrayList3.add(((java.lang.reflect.Method) it7.next()).getDefaultValue());
        }
        this.f378583g = arrayList3;
        if (this.f378579c == j06.a.f378570e && origin == j06.b.f378573d) {
            java.util.List list4 = this.f378578b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list4, "<this>");
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list4, 10));
            java.util.Iterator it8 = list4.iterator();
            boolean z17 = false;
            while (true) {
                boolean z18 = true;
                if (!it8.hasNext()) {
                    break;
                }
                java.lang.Object next = it8.next();
                if (!z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next, "value")) {
                    z17 = true;
                    z18 = false;
                }
                if (z18) {
                    arrayList4.add(next);
                }
            }
            if (!arrayList4.isEmpty()) {
                throw new java.lang.UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    @Override // j06.k
    public java.util.List a() {
        return this.f378581e;
    }

    @Override // j06.k
    public /* bridge */ /* synthetic */ java.lang.reflect.Member b() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        if (r9.isInstance(r6) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x012c A[LOOP:0: B:2:0x0012->B:10:0x012c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0085 A[SYNTHETIC] */
    @Override // j06.k
    /* renamed from: call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo140163x2e7a5e(java.lang.Object[] r15) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j06.c.mo140163x2e7a5e(java.lang.Object[]):java.lang.Object");
    }

    @Override // j06.k
    /* renamed from: getReturnType */
    public java.lang.reflect.Type mo140167x3df4e080() {
        return this.f378577a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ c(java.lang.Class r7, java.util.List r8, j06.a r9, j06.b r10, java.util.List r11, int r12, p3321xbce91901.jvm.p3324x21ffc6bd.i r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L2a
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = kz5.d0.q(r8, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r8.iterator()
        L13:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L2a
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Method r13 = r7.getDeclaredMethod(r13, r0)
            r11.add(r13)
            goto L13
        L2a:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j06.c.<init>(java.lang.Class, java.util.List, j06.a, j06.b, java.util.List, int, kotlin.jvm.internal.i):void");
    }
}
