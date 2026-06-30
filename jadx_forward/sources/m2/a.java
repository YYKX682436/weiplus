package m2;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final m2.a f404434a = new m2.a();

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.reflect.Method a(java.lang.Class r9, java.lang.String r10, java.lang.Object... r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r2 = r11.length     // Catch: java.lang.ReflectiveOperationException -> L93
            if (r2 != 0) goto L7
            r2 = 1
            goto L11
        L7:
            int r2 = r2 + r1
            double r2 = (double) r2     // Catch: java.lang.ReflectiveOperationException -> L93
            r4 = 4624633867356078080(0x402e000000000000, double:15.0)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)     // Catch: java.lang.ReflectiveOperationException -> L93
            int r2 = (int) r2     // Catch: java.lang.ReflectiveOperationException -> L93
        L11:
            kotlin.jvm.internal.l0 r3 = new kotlin.jvm.internal.l0     // Catch: java.lang.ReflectiveOperationException -> L93
            r4 = 4
            r3.<init>(r4)     // Catch: java.lang.ReflectiveOperationException -> L93
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.ReflectiveOperationException -> L93
            r4.<init>()     // Catch: java.lang.ReflectiveOperationException -> L93
            int r5 = r11.length     // Catch: java.lang.ReflectiveOperationException -> L93
            r6 = r1
        L1e:
            if (r6 >= r5) goto L32
            r7 = r11[r6]     // Catch: java.lang.ReflectiveOperationException -> L93
            if (r7 == 0) goto L29
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.ReflectiveOperationException -> L93
            goto L2a
        L29:
            r7 = r0
        L2a:
            if (r7 == 0) goto L2f
            r4.add(r7)     // Catch: java.lang.ReflectiveOperationException -> L93
        L2f:
            int r6 = r6 + 1
            goto L1e
        L32:
            java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L93
            java.lang.Object[] r11 = r4.toArray(r11)     // Catch: java.lang.ReflectiveOperationException -> L93
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            if (r11 == 0) goto L8d
            r3.b(r11)     // Catch: java.lang.ReflectiveOperationException -> L93
            java.lang.Class<n0.o> r11 = n0.o.class
            r3.a(r11)     // Catch: java.lang.ReflectiveOperationException -> L93
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch: java.lang.ReflectiveOperationException -> L93
            r3.a(r11)     // Catch: java.lang.ReflectiveOperationException -> L93
            e06.k r5 = new e06.k     // Catch: java.lang.ReflectiveOperationException -> L93
            r5.<init>(r1, r2)     // Catch: java.lang.ReflectiveOperationException -> L93
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.ReflectiveOperationException -> L93
            r6 = 10
            int r6 = kz5.d0.q(r5, r6)     // Catch: java.lang.ReflectiveOperationException -> L93
            r2.<init>(r6)     // Catch: java.lang.ReflectiveOperationException -> L93
            kz5.x0 r5 = r5.iterator()     // Catch: java.lang.ReflectiveOperationException -> L93
        L5d:
            r6 = r5
            e06.j r6 = (e06.j) r6     // Catch: java.lang.ReflectiveOperationException -> L93
            boolean r6 = r6.f327747f     // Catch: java.lang.ReflectiveOperationException -> L93
            if (r6 == 0) goto L6b
            r5.b()     // Catch: java.lang.ReflectiveOperationException -> L93
            r2.add(r11)     // Catch: java.lang.ReflectiveOperationException -> L93
            goto L5d
        L6b:
            java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L93
            java.lang.Object[] r11 = r2.toArray(r11)     // Catch: java.lang.ReflectiveOperationException -> L93
            if (r11 == 0) goto L87
            r3.b(r11)     // Catch: java.lang.ReflectiveOperationException -> L93
            int r11 = r3.c()     // Catch: java.lang.ReflectiveOperationException -> L93
            java.lang.Class[] r11 = new java.lang.Class[r11]     // Catch: java.lang.ReflectiveOperationException -> L93
            java.lang.Object[] r11 = r3.d(r11)     // Catch: java.lang.ReflectiveOperationException -> L93
            java.lang.Class[] r11 = (java.lang.Class[]) r11     // Catch: java.lang.ReflectiveOperationException -> L93
            java.lang.reflect.Method r11 = r8.b(r9, r10, r11)     // Catch: java.lang.ReflectiveOperationException -> L93
            goto Lb1
        L87:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch: java.lang.ReflectiveOperationException -> L93
            r11.<init>(r4)     // Catch: java.lang.ReflectiveOperationException -> L93
            throw r11     // Catch: java.lang.ReflectiveOperationException -> L93
        L8d:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch: java.lang.ReflectiveOperationException -> L93
            r11.<init>(r4)     // Catch: java.lang.ReflectiveOperationException -> L93
            throw r11     // Catch: java.lang.ReflectiveOperationException -> L93
        L93:
            java.lang.reflect.Method[] r11 = r9.getDeclaredMethods()     // Catch: java.lang.ReflectiveOperationException -> Lb0
            java.lang.String r2 = "declaredMethods"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r11, r2)     // Catch: java.lang.ReflectiveOperationException -> Lb0
            int r2 = r11.length     // Catch: java.lang.ReflectiveOperationException -> Lb0
        L9d:
            if (r1 >= r2) goto Lb0
            r3 = r11[r1]     // Catch: java.lang.ReflectiveOperationException -> Lb0
            java.lang.String r4 = r3.getName()     // Catch: java.lang.ReflectiveOperationException -> Lb0
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r10)     // Catch: java.lang.ReflectiveOperationException -> Lb0
            if (r4 == 0) goto Lad
            r0 = r3
            goto Lb0
        Lad:
            int r1 = r1 + 1
            goto L9d
        Lb0:
            r11 = r0
        Lb1:
            if (r11 == 0) goto Lb4
            return r11
        Lb4:
            java.lang.NoSuchMethodException r11 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = r9.getName()
            r0.append(r9)
            r9 = 46
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = r0.toString()
            r11.<init>(r9)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.a.a(java.lang.Class, java.lang.String, java.lang.Object[]):java.lang.reflect.Method");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r4 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.reflect.Method b(java.lang.Class r13, java.lang.String r14, java.lang.Class... r15) {
        /*
            r12 = this;
            int r0 = r15.length
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r0)
            java.lang.Class[] r15 = (java.lang.Class[]) r15
            java.lang.reflect.Method[] r13 = r13.getDeclaredMethods()
            java.lang.String r0 = "declaredMethods"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r13, r0)
            int r0 = r13.length
            r1 = 0
            r2 = r1
        L13:
            if (r2 >= r0) goto L7e
            r3 = r13[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r14, r4)
            if (r4 == 0) goto L77
            java.lang.Class[] r4 = r3.getParameterTypes()
            java.lang.String r5 = "it.parameterTypes"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)
            int r5 = r4.length
            int r6 = r15.length
            r7 = 1
            if (r5 != r6) goto L73
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4.length
            r5.<init>(r6)
            int r6 = r4.length
            r8 = r1
            r9 = r8
        L38:
            if (r8 >= r6) goto L4f
            r10 = r4[r8]
            int r11 = r9 + 1
            r9 = r15[r9]
            boolean r9 = r10.isAssignableFrom(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r5.add(r9)
            int r8 = r8 + 1
            r9 = r11
            goto L38
        L4f:
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L56
            goto L6e
        L56:
            java.util.Iterator r4 = r5.iterator()
        L5a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6e
            java.lang.Object r5 = r4.next()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L5a
            r4 = r1
            goto L6f
        L6e:
            r4 = r7
        L6f:
            if (r4 == 0) goto L73
            r4 = r7
            goto L74
        L73:
            r4 = r1
        L74:
            if (r4 == 0) goto L77
            goto L78
        L77:
            r7 = r1
        L78:
            if (r7 == 0) goto L7b
            goto L7f
        L7b:
            int r2 = r2 + 1
            goto L13
        L7e:
            r3 = 0
        L7f:
            if (r3 == 0) goto L82
            return r3
        L82:
            java.lang.NoSuchMethodException r13 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r14)
            java.lang.String r14 = " not found"
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.a.b(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    public final java.lang.Object c(java.lang.reflect.Method method, java.lang.Object obj, n0.o oVar, java.lang.Object... objArr) {
        java.lang.Object obj2;
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(parameterTypes, "parameterTypes");
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i17 = length - 1;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(parameterTypes[length], n0.o.class)) {
                    break;
                }
                if (i17 < 0) {
                    break;
                }
                length = i17;
            }
        }
        length = -1;
        int i18 = length + 1;
        int ceil = (length == 0 ? 1 : (int) java.lang.Math.ceil(((obj != null ? 1 : 0) + length) / 15.0d)) + i18;
        int length2 = method.getParameterTypes().length;
        if (!((length2 != ceil ? (int) java.lang.Math.ceil(((double) length) / 31.0d) : 0) + ceil == length2)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.Object[] objArr2 = new java.lang.Object[length2];
        int i19 = 0;
        while (i19 < length2) {
            if (i19 >= 0 && i19 < length) {
                if (i19 >= 0) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objArr, "<this>");
                    if (i19 <= objArr.length - 1) {
                        obj2 = objArr[i19];
                    }
                }
                java.lang.Class<?> cls = method.getParameterTypes()[i19];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cls, "parameterTypes[idx]");
                java.lang.String name = cls.getName();
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            obj2 = java.lang.Double.valueOf(0.0d);
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            obj2 = 0;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            obj2 = (byte) 0;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            obj2 = '0';
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            obj2 = 0L;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03)) {
                            obj2 = java.lang.Boolean.FALSE;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            obj2 = java.lang.Float.valueOf(0.0f);
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            obj2 = (short) 0;
                            break;
                        }
                        break;
                }
                obj2 = null;
            } else if (i19 == length) {
                obj2 = oVar;
            } else {
                if (i18 <= i19 && i19 < ceil) {
                    obj2 = 0;
                } else {
                    if (!(ceil <= i19 && i19 < length2)) {
                        throw new java.lang.IllegalStateException("Unexpected index".toString());
                    }
                    obj2 = 2097151;
                }
            }
            objArr2[i19] = obj2;
            i19++;
        }
        return method.invoke(obj, java.util.Arrays.copyOf(objArr2, length2));
    }

    public final void d(java.lang.String className, java.lang.String methodName, n0.o composer, java.lang.Object... args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(className, "className");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(methodName, "methodName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composer, "composer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(className);
            java.lang.reflect.Method a17 = a(cls, methodName, java.util.Arrays.copyOf(args, args.length));
            a17.setAccessible(true);
            if (java.lang.reflect.Modifier.isStatic(a17.getModifiers())) {
                c(a17, null, composer, java.util.Arrays.copyOf(args, args.length));
            } else {
                c(a17, cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]), composer, java.util.Arrays.copyOf(args, args.length));
            }
        } catch (java.lang.ReflectiveOperationException e17) {
            throw new java.lang.ClassNotFoundException("Composable Method '" + className + '.' + methodName + "' not found", e17);
        }
    }
}
