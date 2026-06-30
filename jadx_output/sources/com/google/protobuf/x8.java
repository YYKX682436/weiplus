package com.google.protobuf;

/* loaded from: classes16.dex */
public final class x8 implements com.google.protobuf.q9 {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f45685r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public static final sun.misc.Unsafe f45686s = com.google.protobuf.ib.p();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f45687a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f45688b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45689c;

    /* renamed from: d, reason: collision with root package name */
    public final int f45690d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.protobuf.o8 f45691e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f45692f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f45693g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f45694h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f45695i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f45696j;

    /* renamed from: k, reason: collision with root package name */
    public final int f45697k;

    /* renamed from: l, reason: collision with root package name */
    public final int f45698l;

    /* renamed from: m, reason: collision with root package name */
    public final com.google.protobuf.a9 f45699m;

    /* renamed from: n, reason: collision with root package name */
    public final com.google.protobuf.k7 f45700n;

    /* renamed from: o, reason: collision with root package name */
    public final com.google.protobuf.qa f45701o;

    /* renamed from: p, reason: collision with root package name */
    public final com.google.protobuf.u4 f45702p;

    /* renamed from: q, reason: collision with root package name */
    public final com.google.protobuf.f8 f45703q;

    public x8(int[] iArr, java.lang.Object[] objArr, int i17, int i18, com.google.protobuf.o8 o8Var, boolean z17, boolean z18, int[] iArr2, int i19, int i27, com.google.protobuf.a9 a9Var, com.google.protobuf.k7 k7Var, com.google.protobuf.qa qaVar, com.google.protobuf.u4 u4Var, com.google.protobuf.f8 f8Var) {
        this.f45687a = iArr;
        this.f45688b = objArr;
        this.f45689c = i17;
        this.f45690d = i18;
        this.f45693g = o8Var instanceof com.google.protobuf.n5;
        this.f45694h = z17;
        this.f45692f = u4Var != null && u4Var.e(o8Var);
        this.f45695i = z18;
        this.f45696j = iArr2;
        this.f45697k = i19;
        this.f45698l = i27;
        this.f45699m = a9Var;
        this.f45700n = k7Var;
        this.f45701o = qaVar;
        this.f45702p = u4Var;
        this.f45691e = o8Var;
        this.f45703q = f8Var;
    }

    public static int A(java.lang.Object obj, long j17) {
        return ((java.lang.Integer) com.google.protobuf.ib.o(obj, j17)).intValue();
    }

    public static long B(java.lang.Object obj, long j17) {
        return ((java.lang.Long) com.google.protobuf.ib.o(obj, j17)).longValue();
    }

    public static java.lang.reflect.Field L(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            java.lang.String name = cls.getName();
            java.lang.String arrays = java.util.Arrays.toString(declaredFields);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 40 + name.length() + java.lang.String.valueOf(arrays).length());
            sb6.append("Field ");
            sb6.append(str);
            sb6.append(" for ");
            sb6.append(name);
            sb6.append(" not found. Known fields are ");
            sb6.append(arrays);
            throw new java.lang.RuntimeException(sb6.toString());
        }
    }

    public static com.google.protobuf.xa o(java.lang.Object obj) {
        com.google.protobuf.n5 n5Var = (com.google.protobuf.n5) obj;
        com.google.protobuf.xa xaVar = n5Var.unknownFields;
        if (xaVar != com.google.protobuf.xa.f45706f) {
            return xaVar;
        }
        com.google.protobuf.xa xaVar2 = new com.google.protobuf.xa();
        n5Var.unknownFields = xaVar2;
        return xaVar2;
    }

    public static java.util.List t(java.lang.Object obj, long j17) {
        return (java.util.List) com.google.protobuf.ib.o(obj, j17);
    }

    public static com.google.protobuf.x8 x(java.lang.Class cls, com.google.protobuf.l8 l8Var, com.google.protobuf.a9 a9Var, com.google.protobuf.k7 k7Var, com.google.protobuf.qa qaVar, com.google.protobuf.u4 u4Var, com.google.protobuf.f8 f8Var) {
        if (l8Var instanceof com.google.protobuf.k9) {
            return y((com.google.protobuf.k9) l8Var, a9Var, k7Var, qaVar, u4Var, f8Var);
        }
        com.google.protobuf.ca caVar = (com.google.protobuf.ca) l8Var;
        caVar.getClass();
        caVar.getClass();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.protobuf.x8 y(com.google.protobuf.k9 r33, com.google.protobuf.a9 r34, com.google.protobuf.k7 r35, com.google.protobuf.qa r36, com.google.protobuf.u4 r37, com.google.protobuf.f8 r38) {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.x8.y(com.google.protobuf.k9, com.google.protobuf.a9, com.google.protobuf.k7, com.google.protobuf.qa, com.google.protobuf.u4, com.google.protobuf.f8):com.google.protobuf.x8");
    }

    public static long z(int i17) {
        return i17 & 1048575;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    public final int C(java.lang.Object obj, byte[] bArr, int i17, int i18, int i19, long j17, com.google.protobuf.j jVar) {
        int i27;
        java.lang.Object m17 = m(i19);
        sun.misc.Unsafe unsafe = f45686s;
        java.lang.Object object = unsafe.getObject(obj, j17);
        com.google.protobuf.f8 f8Var = this.f45703q;
        if (f8Var.h(object)) {
            java.lang.Object f17 = f8Var.f(m17);
            f8Var.a(f17, object);
            unsafe.putObject(obj, j17, f17);
            object = f17;
        }
        com.google.protobuf.u7 b17 = f8Var.b(m17);
        java.util.Map e17 = f8Var.e(object);
        int l17 = com.google.protobuf.k.l(bArr, i17, jVar);
        int i28 = jVar.f45211a;
        if (i28 < 0 || i28 > i18 - l17) {
            throw com.google.protobuf.y6.i();
        }
        int i29 = l17 + i28;
        java.lang.Object obj2 = b17.f45580b;
        java.lang.Object obj3 = b17.f45582d;
        java.lang.Object obj4 = obj2;
        java.lang.Object obj5 = obj3;
        while (l17 < i29) {
            int i37 = l17 + 1;
            byte b18 = bArr[l17];
            if (b18 < 0) {
                i27 = com.google.protobuf.k.k(b18, bArr, i37, jVar);
                b18 = jVar.f45211a;
            } else {
                i27 = i37;
            }
            int i38 = b18 >>> 3;
            int i39 = b18 & 7;
            if (i38 != 1) {
                if (i38 == 2) {
                    com.google.protobuf.ub ubVar = b17.f45581c;
                    if (i39 == ubVar.f45598e) {
                        l17 = j(bArr, i27, i18, ubVar, obj3.getClass(), jVar);
                        obj5 = jVar.f45213c;
                    }
                }
                l17 = com.google.protobuf.k.o(b18, bArr, i27, i18, jVar);
            } else {
                com.google.protobuf.ub ubVar2 = b17.f45579a;
                if (i39 == ubVar2.f45598e) {
                    l17 = j(bArr, i27, i18, ubVar2, null, jVar);
                    obj5 = obj5;
                    obj4 = jVar.f45213c;
                } else {
                    l17 = com.google.protobuf.k.o(b18, bArr, i27, i18, jVar);
                }
            }
        }
        if (l17 != i29) {
            throw com.google.protobuf.y6.g();
        }
        e17.put(obj4, obj5);
        return i29;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    public final int D(java.lang.Object obj, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, long j17, int i38, com.google.protobuf.j jVar) {
        long j18 = this.f45687a[i38 + 2] & 1048575;
        sun.misc.Unsafe unsafe = f45686s;
        switch (i37) {
            case 51:
                if (i28 == 1) {
                    unsafe.putObject(obj, j17, java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(com.google.protobuf.k.c(bArr, i17))));
                    int i39 = i17 + 8;
                    unsafe.putInt(obj, j18, i27);
                    return i39;
                }
                return i17;
            case 52:
                if (i28 == 5) {
                    unsafe.putObject(obj, j17, java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(com.google.protobuf.k.b(bArr, i17))));
                    int i47 = i17 + 4;
                    unsafe.putInt(obj, j18, i27);
                    return i47;
                }
                return i17;
            case 53:
            case 54:
                if (i28 == 0) {
                    int n17 = com.google.protobuf.k.n(bArr, i17, jVar);
                    unsafe.putObject(obj, j17, java.lang.Long.valueOf(jVar.f45212b));
                    unsafe.putInt(obj, j18, i27);
                    return n17;
                }
                return i17;
            case 55:
            case 62:
                if (i28 == 0) {
                    int l17 = com.google.protobuf.k.l(bArr, i17, jVar);
                    unsafe.putObject(obj, j17, java.lang.Integer.valueOf(jVar.f45211a));
                    unsafe.putInt(obj, j18, i27);
                    return l17;
                }
                return i17;
            case 56:
            case 65:
                if (i28 == 1) {
                    unsafe.putObject(obj, j17, java.lang.Long.valueOf(com.google.protobuf.k.c(bArr, i17)));
                    int i48 = i17 + 8;
                    unsafe.putInt(obj, j18, i27);
                    return i48;
                }
                return i17;
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
            case 64:
                if (i28 == 5) {
                    unsafe.putObject(obj, j17, java.lang.Integer.valueOf(com.google.protobuf.k.b(bArr, i17)));
                    int i49 = i17 + 4;
                    unsafe.putInt(obj, j18, i27);
                    return i49;
                }
                return i17;
            case 58:
                if (i28 == 0) {
                    int n18 = com.google.protobuf.k.n(bArr, i17, jVar);
                    unsafe.putObject(obj, j17, java.lang.Boolean.valueOf(jVar.f45212b != 0));
                    unsafe.putInt(obj, j18, i27);
                    return n18;
                }
                return i17;
            case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                if (i28 == 2) {
                    int l18 = com.google.protobuf.k.l(bArr, i17, jVar);
                    int i57 = jVar.f45211a;
                    if (i57 == 0) {
                        unsafe.putObject(obj, j17, "");
                    } else {
                        if ((i29 & com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
                            if (!(com.google.protobuf.ob.f45371a.e(0, bArr, l18, l18 + i57) == 0)) {
                                throw com.google.protobuf.y6.c();
                            }
                        }
                        unsafe.putObject(obj, j17, new java.lang.String(bArr, l18, i57, com.google.protobuf.w6.f45648a));
                        l18 += i57;
                    }
                    unsafe.putInt(obj, j18, i27);
                    return l18;
                }
                return i17;
            case 60:
                if (i28 == 2) {
                    int e17 = com.google.protobuf.k.e(n(i38), bArr, i17, i18, jVar);
                    java.lang.Object object = unsafe.getInt(obj, j18) == i27 ? unsafe.getObject(obj, j17) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j17, jVar.f45213c);
                    } else {
                        unsafe.putObject(obj, j17, com.google.protobuf.w6.c(object, jVar.f45213c));
                    }
                    unsafe.putInt(obj, j18, i27);
                    return e17;
                }
                return i17;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                if (i28 == 2) {
                    int a17 = com.google.protobuf.k.a(bArr, i17, jVar);
                    unsafe.putObject(obj, j17, jVar.f45213c);
                    unsafe.putInt(obj, j18, i27);
                    return a17;
                }
                return i17;
            case 63:
                if (i28 == 0) {
                    int l19 = com.google.protobuf.k.l(bArr, i17, jVar);
                    int i58 = jVar.f45211a;
                    com.google.protobuf.r6 l27 = l(i38);
                    if (l27 == null || l27.isInRange(i58)) {
                        unsafe.putObject(obj, j17, java.lang.Integer.valueOf(i58));
                        unsafe.putInt(obj, j18, i27);
                    } else {
                        o(obj).d(i19, java.lang.Long.valueOf(i58));
                    }
                    return l19;
                }
                return i17;
            case 66:
                if (i28 == 0) {
                    int l28 = com.google.protobuf.k.l(bArr, i17, jVar);
                    unsafe.putObject(obj, j17, java.lang.Integer.valueOf(com.google.protobuf.d0.b(jVar.f45211a)));
                    unsafe.putInt(obj, j18, i27);
                    return l28;
                }
                return i17;
            case 67:
                if (i28 == 0) {
                    int n19 = com.google.protobuf.k.n(bArr, i17, jVar);
                    unsafe.putObject(obj, j17, java.lang.Long.valueOf(com.google.protobuf.d0.c(jVar.f45212b)));
                    unsafe.putInt(obj, j18, i27);
                    return n19;
                }
                return i17;
            case 68:
                if (i28 == 3) {
                    int d17 = com.google.protobuf.k.d(n(i38), bArr, i17, i18, (i19 & (-8)) | 4, jVar);
                    java.lang.Object object2 = unsafe.getInt(obj, j18) == i27 ? unsafe.getObject(obj, j17) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j17, jVar.f45213c);
                    } else {
                        unsafe.putObject(obj, j17, com.google.protobuf.w6.c(object2, jVar.f45213c));
                    }
                    unsafe.putInt(obj, j18, i27);
                    return d17;
                }
                return i17;
            default:
                return i17;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x03af, code lost:
    
        if (r0 != r12) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03b3, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0404, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r1 = r35;
        r11 = r36;
        r3 = r17;
        r2 = r20;
        r5 = r21;
        r6 = r23;
        r4 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03e3, code lost:
    
        if (r0 != r15) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0402, code lost:
    
        if (r0 != r15) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x04a0, code lost:
    
        if (r5 == 1048575) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x04a2, code lost:
    
        r2 = r5;
        r5 = r31;
        r28.putInt(r5, r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x04ad, code lost:
    
        r2 = r8.f45697k;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x04b1, code lost:
    
        r6 = r8.f45698l;
        r7 = r8.f45701o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x04b5, code lost:
    
        if (r2 >= r6) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x04b7, code lost:
    
        r3 = (com.google.protobuf.xa) r8.k(r5, r8.f45696j[r2], r3, r7);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x04c4, code lost:
    
        if (r3 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x04c6, code lost:
    
        r7.c(r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x04c9, code lost:
    
        if (r1 != 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x04cd, code lost:
    
        if (r0 != r34) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x04d4, code lost:
    
        throw com.google.protobuf.y6.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x04db, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04d7, code lost:
    
        if (r0 > r34) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x04d9, code lost:
    
        if (r4 != r1) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x04e0, code lost:
    
        throw com.google.protobuf.y6.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x04ab, code lost:
    
        r5 = r31;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x00a6. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int E(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.protobuf.j r36) {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.x8.E(java.lang.Object, byte[], int, int, int, com.google.protobuf.j):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0279, code lost:
    
        if (r0 != r32) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x027d, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d4, code lost:
    
        r5 = r17;
        r2 = r18;
        r6 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02b3, code lost:
    
        if (r0 != r15) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02d2, code lost:
    
        if (r0 != r15) goto L122;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x00a3. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int F(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.protobuf.j r34) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.x8.F(java.lang.Object, byte[], int, int, com.google.protobuf.j):int");
    }

    public final int G(java.lang.Object obj, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, long j17, int i37, long j18, com.google.protobuf.j jVar) {
        int m17;
        int i38 = i17;
        sun.misc.Unsafe unsafe = f45686s;
        com.google.protobuf.v6 v6Var = (com.google.protobuf.v6) unsafe.getObject(obj, j18);
        if (!((com.google.protobuf.h) v6Var).f45145d) {
            int size = v6Var.size();
            v6Var = v6Var.F(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j18, v6Var);
        }
        switch (i37) {
            case 18:
            case 35:
                if (i28 == 2) {
                    com.google.protobuf.j4 j4Var = (com.google.protobuf.j4) v6Var;
                    int l17 = com.google.protobuf.k.l(bArr, i38, jVar);
                    int i39 = jVar.f45211a + l17;
                    while (l17 < i39) {
                        j4Var.e(java.lang.Double.longBitsToDouble(com.google.protobuf.k.c(bArr, l17)));
                        l17 += 8;
                    }
                    if (l17 == i39) {
                        return l17;
                    }
                    throw com.google.protobuf.y6.i();
                }
                if (i28 == 1) {
                    com.google.protobuf.j4 j4Var2 = (com.google.protobuf.j4) v6Var;
                    j4Var2.e(java.lang.Double.longBitsToDouble(com.google.protobuf.k.c(bArr, i17)));
                    while (true) {
                        int i47 = i38 + 8;
                        if (i47 >= i18) {
                            return i47;
                        }
                        i38 = com.google.protobuf.k.l(bArr, i47, jVar);
                        if (i19 != jVar.f45211a) {
                            return i47;
                        }
                        j4Var2.e(java.lang.Double.longBitsToDouble(com.google.protobuf.k.c(bArr, i38)));
                    }
                }
                break;
            case 19:
            case 36:
                if (i28 == 2) {
                    com.google.protobuf.e5 e5Var = (com.google.protobuf.e5) v6Var;
                    int l18 = com.google.protobuf.k.l(bArr, i38, jVar);
                    int i48 = jVar.f45211a + l18;
                    while (l18 < i48) {
                        e5Var.e(java.lang.Float.intBitsToFloat(com.google.protobuf.k.b(bArr, l18)));
                        l18 += 4;
                    }
                    if (l18 == i48) {
                        return l18;
                    }
                    throw com.google.protobuf.y6.i();
                }
                if (i28 == 5) {
                    com.google.protobuf.e5 e5Var2 = (com.google.protobuf.e5) v6Var;
                    e5Var2.e(java.lang.Float.intBitsToFloat(com.google.protobuf.k.b(bArr, i17)));
                    while (true) {
                        int i49 = i38 + 4;
                        if (i49 >= i18) {
                            return i49;
                        }
                        i38 = com.google.protobuf.k.l(bArr, i49, jVar);
                        if (i19 != jVar.f45211a) {
                            return i49;
                        }
                        e5Var2.e(java.lang.Float.intBitsToFloat(com.google.protobuf.k.b(bArr, i38)));
                    }
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i28 == 2) {
                    com.google.protobuf.l7 l7Var = (com.google.protobuf.l7) v6Var;
                    int l19 = com.google.protobuf.k.l(bArr, i38, jVar);
                    int i57 = jVar.f45211a + l19;
                    while (l19 < i57) {
                        l19 = com.google.protobuf.k.n(bArr, l19, jVar);
                        l7Var.e(jVar.f45212b);
                    }
                    if (l19 == i57) {
                        return l19;
                    }
                    throw com.google.protobuf.y6.i();
                }
                if (i28 == 0) {
                    com.google.protobuf.l7 l7Var2 = (com.google.protobuf.l7) v6Var;
                    int n17 = com.google.protobuf.k.n(bArr, i38, jVar);
                    l7Var2.e(jVar.f45212b);
                    while (n17 < i18) {
                        int l27 = com.google.protobuf.k.l(bArr, n17, jVar);
                        if (i19 != jVar.f45211a) {
                            return n17;
                        }
                        n17 = com.google.protobuf.k.n(bArr, l27, jVar);
                        l7Var2.e(jVar.f45212b);
                    }
                    return n17;
                }
                break;
            case 22:
            case 29:
            case 39:
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                if (i28 == 2) {
                    return com.google.protobuf.k.g(bArr, i38, v6Var, jVar);
                }
                if (i28 == 0) {
                    return com.google.protobuf.k.m(i19, bArr, i17, i18, v6Var, jVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i28 == 2) {
                    com.google.protobuf.l7 l7Var3 = (com.google.protobuf.l7) v6Var;
                    int l28 = com.google.protobuf.k.l(bArr, i38, jVar);
                    int i58 = jVar.f45211a + l28;
                    while (l28 < i58) {
                        l7Var3.e(com.google.protobuf.k.c(bArr, l28));
                        l28 += 8;
                    }
                    if (l28 == i58) {
                        return l28;
                    }
                    throw com.google.protobuf.y6.i();
                }
                if (i28 == 1) {
                    com.google.protobuf.l7 l7Var4 = (com.google.protobuf.l7) v6Var;
                    l7Var4.e(com.google.protobuf.k.c(bArr, i17));
                    while (true) {
                        int i59 = i38 + 8;
                        if (i59 >= i18) {
                            return i59;
                        }
                        i38 = com.google.protobuf.k.l(bArr, i59, jVar);
                        if (i19 != jVar.f45211a) {
                            return i59;
                        }
                        l7Var4.e(com.google.protobuf.k.c(bArr, i38));
                    }
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i28 == 2) {
                    com.google.protobuf.m6 m6Var = (com.google.protobuf.m6) v6Var;
                    int l29 = com.google.protobuf.k.l(bArr, i38, jVar);
                    int i66 = jVar.f45211a + l29;
                    while (l29 < i66) {
                        m6Var.e(com.google.protobuf.k.b(bArr, l29));
                        l29 += 4;
                    }
                    if (l29 == i66) {
                        return l29;
                    }
                    throw com.google.protobuf.y6.i();
                }
                if (i28 == 5) {
                    com.google.protobuf.m6 m6Var2 = (com.google.protobuf.m6) v6Var;
                    m6Var2.e(com.google.protobuf.k.b(bArr, i17));
                    while (true) {
                        int i67 = i38 + 4;
                        if (i67 >= i18) {
                            return i67;
                        }
                        i38 = com.google.protobuf.k.l(bArr, i67, jVar);
                        if (i19 != jVar.f45211a) {
                            return i67;
                        }
                        m6Var2.e(com.google.protobuf.k.b(bArr, i38));
                    }
                }
                break;
            case 25:
            case 42:
                if (i28 == 2) {
                    com.google.protobuf.o oVar = (com.google.protobuf.o) v6Var;
                    int l37 = com.google.protobuf.k.l(bArr, i38, jVar);
                    int i68 = jVar.f45211a + l37;
                    while (l37 < i68) {
                        l37 = com.google.protobuf.k.n(bArr, l37, jVar);
                        oVar.e(jVar.f45212b != 0);
                    }
                    if (l37 == i68) {
                        return l37;
                    }
                    throw com.google.protobuf.y6.i();
                }
                if (i28 == 0) {
                    com.google.protobuf.o oVar2 = (com.google.protobuf.o) v6Var;
                    int n18 = com.google.protobuf.k.n(bArr, i38, jVar);
                    oVar2.e(jVar.f45212b != 0);
                    while (n18 < i18) {
                        int l38 = com.google.protobuf.k.l(bArr, n18, jVar);
                        if (i19 != jVar.f45211a) {
                            return n18;
                        }
                        n18 = com.google.protobuf.k.n(bArr, l38, jVar);
                        oVar2.e(jVar.f45212b != 0);
                    }
                    return n18;
                }
                break;
            case 26:
                if (i28 == 2) {
                    if ((j17 & 536870912) == 0) {
                        int l39 = com.google.protobuf.k.l(bArr, i38, jVar);
                        int i69 = jVar.f45211a;
                        if (i69 < 0) {
                            throw com.google.protobuf.y6.f();
                        }
                        if (i69 == 0) {
                            v6Var.add("");
                        } else {
                            v6Var.add(new java.lang.String(bArr, l39, i69, com.google.protobuf.w6.f45648a));
                            l39 += i69;
                        }
                        while (l39 < i18) {
                            int l47 = com.google.protobuf.k.l(bArr, l39, jVar);
                            if (i19 != jVar.f45211a) {
                                return l39;
                            }
                            l39 = com.google.protobuf.k.l(bArr, l47, jVar);
                            int i76 = jVar.f45211a;
                            if (i76 < 0) {
                                throw com.google.protobuf.y6.f();
                            }
                            if (i76 == 0) {
                                v6Var.add("");
                            } else {
                                v6Var.add(new java.lang.String(bArr, l39, i76, com.google.protobuf.w6.f45648a));
                                l39 += i76;
                            }
                        }
                        return l39;
                    }
                    int l48 = com.google.protobuf.k.l(bArr, i38, jVar);
                    int i77 = jVar.f45211a;
                    if (i77 < 0) {
                        throw com.google.protobuf.y6.f();
                    }
                    if (i77 == 0) {
                        v6Var.add("");
                    } else {
                        int i78 = l48 + i77;
                        if (!(com.google.protobuf.ob.f45371a.e(0, bArr, l48, i78) == 0)) {
                            throw com.google.protobuf.y6.c();
                        }
                        v6Var.add(new java.lang.String(bArr, l48, i77, com.google.protobuf.w6.f45648a));
                        l48 = i78;
                    }
                    while (l48 < i18) {
                        int l49 = com.google.protobuf.k.l(bArr, l48, jVar);
                        if (i19 != jVar.f45211a) {
                            return l48;
                        }
                        l48 = com.google.protobuf.k.l(bArr, l49, jVar);
                        int i79 = jVar.f45211a;
                        if (i79 < 0) {
                            throw com.google.protobuf.y6.f();
                        }
                        if (i79 == 0) {
                            v6Var.add("");
                        } else {
                            int i86 = l48 + i79;
                            if (!(com.google.protobuf.ob.f45371a.e(0, bArr, l48, i86) == 0)) {
                                throw com.google.protobuf.y6.c();
                            }
                            v6Var.add(new java.lang.String(bArr, l48, i79, com.google.protobuf.w6.f45648a));
                            l48 = i86;
                        }
                    }
                    return l48;
                }
                break;
            case 27:
                if (i28 == 2) {
                    return com.google.protobuf.k.f(n(i29), i19, bArr, i17, i18, v6Var, jVar);
                }
                break;
            case 28:
                if (i28 == 2) {
                    int l57 = com.google.protobuf.k.l(bArr, i38, jVar);
                    int i87 = jVar.f45211a;
                    if (i87 < 0) {
                        throw com.google.protobuf.y6.f();
                    }
                    if (i87 > bArr.length - l57) {
                        throw com.google.protobuf.y6.i();
                    }
                    if (i87 == 0) {
                        v6Var.add(com.google.protobuf.y.f45712e);
                    } else {
                        v6Var.add(com.google.protobuf.y.g(bArr, l57, i87));
                        l57 += i87;
                    }
                    while (l57 < i18) {
                        int l58 = com.google.protobuf.k.l(bArr, l57, jVar);
                        if (i19 != jVar.f45211a) {
                            return l57;
                        }
                        l57 = com.google.protobuf.k.l(bArr, l58, jVar);
                        int i88 = jVar.f45211a;
                        if (i88 < 0) {
                            throw com.google.protobuf.y6.f();
                        }
                        if (i88 > bArr.length - l57) {
                            throw com.google.protobuf.y6.i();
                        }
                        if (i88 == 0) {
                            v6Var.add(com.google.protobuf.y.f45712e);
                        } else {
                            v6Var.add(com.google.protobuf.y.g(bArr, l57, i88));
                            l57 += i88;
                        }
                    }
                    return l57;
                }
                break;
            case 30:
            case 44:
                if (i28 == 2) {
                    m17 = com.google.protobuf.k.g(bArr, i38, v6Var, jVar);
                } else if (i28 == 0) {
                    m17 = com.google.protobuf.k.m(i19, bArr, i17, i18, v6Var, jVar);
                }
                com.google.protobuf.n5 n5Var = (com.google.protobuf.n5) obj;
                com.google.protobuf.xa xaVar = n5Var.unknownFields;
                if (xaVar == com.google.protobuf.xa.f45706f) {
                    xaVar = null;
                }
                com.google.protobuf.xa xaVar2 = (com.google.protobuf.xa) com.google.protobuf.s9.w(i27, v6Var, l(i29), xaVar, this.f45701o);
                if (xaVar2 != null) {
                    n5Var.unknownFields = xaVar2;
                }
                return m17;
            case 33:
            case 47:
                if (i28 == 2) {
                    com.google.protobuf.m6 m6Var3 = (com.google.protobuf.m6) v6Var;
                    int l59 = com.google.protobuf.k.l(bArr, i38, jVar);
                    int i89 = jVar.f45211a + l59;
                    while (l59 < i89) {
                        l59 = com.google.protobuf.k.l(bArr, l59, jVar);
                        m6Var3.e(com.google.protobuf.d0.b(jVar.f45211a));
                    }
                    if (l59 == i89) {
                        return l59;
                    }
                    throw com.google.protobuf.y6.i();
                }
                if (i28 == 0) {
                    com.google.protobuf.m6 m6Var4 = (com.google.protobuf.m6) v6Var;
                    int l66 = com.google.protobuf.k.l(bArr, i38, jVar);
                    m6Var4.e(com.google.protobuf.d0.b(jVar.f45211a));
                    while (l66 < i18) {
                        int l67 = com.google.protobuf.k.l(bArr, l66, jVar);
                        if (i19 != jVar.f45211a) {
                            return l66;
                        }
                        l66 = com.google.protobuf.k.l(bArr, l67, jVar);
                        m6Var4.e(com.google.protobuf.d0.b(jVar.f45211a));
                    }
                    return l66;
                }
                break;
            case 34:
            case 48:
                if (i28 == 2) {
                    com.google.protobuf.l7 l7Var5 = (com.google.protobuf.l7) v6Var;
                    int l68 = com.google.protobuf.k.l(bArr, i38, jVar);
                    int i96 = jVar.f45211a + l68;
                    while (l68 < i96) {
                        l68 = com.google.protobuf.k.n(bArr, l68, jVar);
                        l7Var5.e(com.google.protobuf.d0.c(jVar.f45212b));
                    }
                    if (l68 == i96) {
                        return l68;
                    }
                    throw com.google.protobuf.y6.i();
                }
                if (i28 == 0) {
                    com.google.protobuf.l7 l7Var6 = (com.google.protobuf.l7) v6Var;
                    int n19 = com.google.protobuf.k.n(bArr, i38, jVar);
                    l7Var6.e(com.google.protobuf.d0.c(jVar.f45212b));
                    while (n19 < i18) {
                        int l69 = com.google.protobuf.k.l(bArr, n19, jVar);
                        if (i19 != jVar.f45211a) {
                            return n19;
                        }
                        n19 = com.google.protobuf.k.n(bArr, l69, jVar);
                        l7Var6.e(com.google.protobuf.d0.c(jVar.f45212b));
                    }
                    return n19;
                }
                break;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                if (i28 == 3) {
                    com.google.protobuf.q9 n27 = n(i29);
                    int i97 = (i19 & (-8)) | 4;
                    i38 = com.google.protobuf.k.d(n27, bArr, i17, i18, i97, jVar);
                    v6Var.add(jVar.f45213c);
                    while (i38 < i18) {
                        int l76 = com.google.protobuf.k.l(bArr, i38, jVar);
                        if (i19 != jVar.f45211a) {
                            break;
                        } else {
                            i38 = com.google.protobuf.k.d(n27, bArr, l76, i18, i97, jVar);
                            v6Var.add(jVar.f45213c);
                        }
                    }
                    break;
                }
                break;
        }
        return i38;
    }

    public final void H(java.lang.Object obj, long j17, com.google.protobuf.l9 l9Var, com.google.protobuf.q9 q9Var, com.google.protobuf.t4 t4Var) {
        l9Var.x(this.f45700n.c(obj, j17), q9Var, t4Var);
    }

    public final void I(java.lang.Object obj, int i17, com.google.protobuf.l9 l9Var, com.google.protobuf.q9 q9Var, com.google.protobuf.t4 t4Var) {
        l9Var.z(this.f45700n.c(obj, i17 & 1048575), q9Var, t4Var);
    }

    public final void J(java.lang.Object obj, int i17, com.google.protobuf.l9 l9Var) {
        if ((536870912 & i17) != 0) {
            com.google.protobuf.ib.w(obj, i17 & 1048575, l9Var.O());
        } else if (this.f45693g) {
            com.google.protobuf.ib.w(obj, i17 & 1048575, l9Var.L());
        } else {
            com.google.protobuf.ib.w(obj, i17 & 1048575, l9Var.h());
        }
    }

    public final void K(java.lang.Object obj, int i17, com.google.protobuf.l9 l9Var) {
        boolean z17 = (536870912 & i17) != 0;
        com.google.protobuf.k7 k7Var = this.f45700n;
        if (z17) {
            l9Var.E(k7Var.c(obj, i17 & 1048575));
        } else {
            l9Var.p(k7Var.c(obj, i17 & 1048575));
        }
    }

    public final void M(java.lang.Object obj, int i17) {
        int i18 = this.f45687a[i17 + 2];
        long j17 = 1048575 & i18;
        if (j17 == 1048575) {
            return;
        }
        com.google.protobuf.ib.u(obj, j17, (1 << (i18 >>> 20)) | com.google.protobuf.ib.m(obj, j17));
    }

    public final void N(java.lang.Object obj, int i17, int i18) {
        com.google.protobuf.ib.u(obj, this.f45687a[i18 + 2] & 1048575, i17);
    }

    public final int O(int i17, int i18) {
        int[] iArr = this.f45687a;
        int length = (iArr.length / 3) - 1;
        while (i18 <= length) {
            int i19 = (length + i18) >>> 1;
            int i27 = i19 * 3;
            int i28 = iArr[i27];
            if (i17 == i28) {
                return i27;
            }
            if (i17 < i28) {
                length = i19 - 1;
            } else {
                i18 = i19 + 1;
            }
        }
        return -1;
    }

    public final int P(int i17) {
        return this.f45687a[i17 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:230:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(java.lang.Object r21, com.google.protobuf.bc r22) {
        /*
            Method dump skipped, instructions count: 1534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.x8.Q(java.lang.Object, com.google.protobuf.bc):void");
    }

    public final void R(com.google.protobuf.bc bcVar, int i17, java.lang.Object obj, int i18) {
        if (obj != null) {
            java.lang.Object m17 = m(i18);
            com.google.protobuf.f8 f8Var = this.f45703q;
            com.google.protobuf.u7 b17 = f8Var.b(m17);
            java.util.Map g17 = f8Var.g(obj);
            com.google.protobuf.k0 k0Var = ((com.google.protobuf.l0) bcVar).f45273a;
            k0Var.getClass();
            for (java.util.Map.Entry entry : g17.entrySet()) {
                k0Var.Q(i17, 2);
                k0Var.S(com.google.protobuf.v7.a(b17, entry.getKey(), entry.getValue()));
                com.google.protobuf.v7.d(k0Var, b17, entry.getKey(), entry.getValue());
            }
        }
    }

    public final void S(int i17, java.lang.Object obj, com.google.protobuf.bc bcVar) {
        if (obj instanceof java.lang.String) {
            ((com.google.protobuf.l0) bcVar).f45273a.O(i17, (java.lang.String) obj);
        } else {
            ((com.google.protobuf.l0) bcVar).b(i17, (com.google.protobuf.y) obj);
        }
    }

    @Override // com.google.protobuf.q9
    public void a(java.lang.Object obj, java.lang.Object obj2) {
        obj2.getClass();
        int i17 = 0;
        while (true) {
            int[] iArr = this.f45687a;
            if (i17 >= iArr.length) {
                com.google.protobuf.s9.y(this.f45701o, obj, obj2);
                if (this.f45692f) {
                    com.google.protobuf.u4 u4Var = this.f45702p;
                    com.google.protobuf.b5 c17 = u4Var.c(obj2);
                    if (c17.f44921a.isEmpty()) {
                        return;
                    }
                    u4Var.d(obj).t(c17);
                    return;
                }
                return;
            }
            int P = P(i17);
            long j17 = 1048575 & P;
            int i18 = iArr[i17];
            switch ((P & 267386880) >>> 20) {
                case 0:
                    if (!r(obj2, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.f45205d.o(obj, j17, com.google.protobuf.ib.k(obj2, j17));
                        M(obj, i17);
                        break;
                    }
                case 1:
                    if (!r(obj2, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.f45205d.p(obj, j17, com.google.protobuf.ib.l(obj2, j17));
                        M(obj, i17);
                        break;
                    }
                case 2:
                    if (!r(obj2, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.v(obj, j17, com.google.protobuf.ib.n(obj2, j17));
                        M(obj, i17);
                        break;
                    }
                case 3:
                    if (!r(obj2, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.v(obj, j17, com.google.protobuf.ib.n(obj2, j17));
                        M(obj, i17);
                        break;
                    }
                case 4:
                    if (!r(obj2, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.u(obj, j17, com.google.protobuf.ib.m(obj2, j17));
                        M(obj, i17);
                        break;
                    }
                case 5:
                    if (!r(obj2, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.v(obj, j17, com.google.protobuf.ib.n(obj2, j17));
                        M(obj, i17);
                        break;
                    }
                case 6:
                    if (!r(obj2, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.u(obj, j17, com.google.protobuf.ib.m(obj2, j17));
                        M(obj, i17);
                        break;
                    }
                case 7:
                    if (!r(obj2, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.f45205d.m(obj, j17, com.google.protobuf.ib.f(obj2, j17));
                        M(obj, i17);
                        break;
                    }
                case 8:
                    if (!r(obj2, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.w(obj, j17, com.google.protobuf.ib.o(obj2, j17));
                        M(obj, i17);
                        break;
                    }
                case 9:
                    v(obj, obj2, i17);
                    break;
                case 10:
                    if (!r(obj2, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.w(obj, j17, com.google.protobuf.ib.o(obj2, j17));
                        M(obj, i17);
                        break;
                    }
                case 11:
                    if (!r(obj2, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.u(obj, j17, com.google.protobuf.ib.m(obj2, j17));
                        M(obj, i17);
                        break;
                    }
                case 12:
                    if (!r(obj2, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.u(obj, j17, com.google.protobuf.ib.m(obj2, j17));
                        M(obj, i17);
                        break;
                    }
                case 13:
                    if (!r(obj2, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.u(obj, j17, com.google.protobuf.ib.m(obj2, j17));
                        M(obj, i17);
                        break;
                    }
                case 14:
                    if (!r(obj2, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.v(obj, j17, com.google.protobuf.ib.n(obj2, j17));
                        M(obj, i17);
                        break;
                    }
                case 15:
                    if (!r(obj2, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.u(obj, j17, com.google.protobuf.ib.m(obj2, j17));
                        M(obj, i17);
                        break;
                    }
                case 16:
                    if (!r(obj2, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.v(obj, j17, com.google.protobuf.ib.n(obj2, j17));
                        M(obj, i17);
                        break;
                    }
                case 17:
                    v(obj, obj2, i17);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                    this.f45700n.b(obj, obj2, j17);
                    break;
                case 50:
                    java.lang.Class cls = com.google.protobuf.s9.f45498a;
                    com.google.protobuf.ib.w(obj, j17, this.f45703q.a(com.google.protobuf.ib.o(obj, j17), com.google.protobuf.ib.o(obj2, j17)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
                case 58:
                case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                    if (!s(obj2, i18, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.w(obj, j17, com.google.protobuf.ib.o(obj2, j17));
                        N(obj, i18, i17);
                        break;
                    }
                case 60:
                    w(obj, obj2, i17);
                    break;
                case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!s(obj2, i18, i17)) {
                        break;
                    } else {
                        com.google.protobuf.ib.w(obj, j17, com.google.protobuf.ib.o(obj2, j17));
                        N(obj, i18, i17);
                        break;
                    }
                case 68:
                    w(obj, obj2, i17);
                    break;
            }
            i17 += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05da  */
    @Override // com.google.protobuf.q9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.Object r18, com.google.protobuf.bc r19) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.x8.b(java.lang.Object, com.google.protobuf.bc):void");
    }

    @Override // com.google.protobuf.q9
    public final boolean c(java.lang.Object obj) {
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            boolean z17 = true;
            if (i18 >= this.f45697k) {
                return !this.f45692f || this.f45702p.c(obj).o();
            }
            int i27 = this.f45696j[i18];
            int[] iArr = this.f45687a;
            int i28 = iArr[i27];
            int P = P(i27);
            int i29 = iArr[i27 + 2];
            int i37 = i29 & 1048575;
            int i38 = 1 << (i29 >>> 20);
            if (i37 != i17) {
                if (i37 != 1048575) {
                    i19 = f45686s.getInt(obj, i37);
                }
                i17 = i37;
            }
            if ((268435456 & P) != 0) {
                if (!(i17 == 1048575 ? r(obj, i27) : (i19 & i38) != 0)) {
                    return false;
                }
            }
            int i39 = (267386880 & P) >>> 20;
            if (i39 == 9 || i39 == 17) {
                if (i17 == 1048575) {
                    z17 = r(obj, i27);
                } else if ((i38 & i19) == 0) {
                    z17 = false;
                }
                if (z17 && !n(i27).c(com.google.protobuf.ib.o(obj, P & 1048575))) {
                    return false;
                }
            } else {
                if (i39 != 27) {
                    if (i39 == 60 || i39 == 68) {
                        if (s(obj, i28, i27) && !n(i27).c(com.google.protobuf.ib.o(obj, P & 1048575))) {
                            return false;
                        }
                    } else if (i39 != 49) {
                        if (i39 != 50) {
                            continue;
                        } else {
                            java.lang.Object o17 = com.google.protobuf.ib.o(obj, P & 1048575);
                            com.google.protobuf.f8 f8Var = this.f45703q;
                            java.util.Map g17 = f8Var.g(o17);
                            if (!g17.isEmpty() && f8Var.b(m(i27)).f45581c.f45597d == com.google.protobuf.vb.MESSAGE) {
                                java.util.Iterator it = g17.values().iterator();
                                com.google.protobuf.q9 q9Var = null;
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    java.lang.Object next = it.next();
                                    if (q9Var == null) {
                                        q9Var = com.google.protobuf.h9.f45166c.a(next.getClass());
                                    }
                                    if (!q9Var.c(next)) {
                                        z17 = false;
                                        break;
                                    }
                                }
                            }
                            if (!z17) {
                                return false;
                            }
                        }
                    }
                }
                java.util.List list = (java.util.List) com.google.protobuf.ib.o(obj, P & 1048575);
                if (!list.isEmpty()) {
                    com.google.protobuf.q9 n17 = n(i27);
                    int i47 = 0;
                    while (true) {
                        if (i47 >= list.size()) {
                            break;
                        }
                        if (!n17.c(list.get(i47))) {
                            z17 = false;
                            break;
                        }
                        i47++;
                    }
                }
                if (!z17) {
                    return false;
                }
            }
            i18++;
        }
    }

    @Override // com.google.protobuf.q9
    public void d(java.lang.Object obj, byte[] bArr, int i17, int i18, com.google.protobuf.j jVar) {
        if (this.f45694h) {
            F(obj, bArr, i17, i18, jVar);
        } else {
            E(obj, bArr, i17, i18, 0, jVar);
        }
    }

    @Override // com.google.protobuf.q9
    public void e(java.lang.Object obj) {
        int[] iArr;
        int i17;
        int i18 = this.f45697k;
        while (true) {
            iArr = this.f45696j;
            i17 = this.f45698l;
            if (i18 >= i17) {
                break;
            }
            long P = P(iArr[i18]) & 1048575;
            java.lang.Object o17 = com.google.protobuf.ib.o(obj, P);
            if (o17 != null) {
                com.google.protobuf.ib.w(obj, P, this.f45703q.c(o17));
            }
            i18++;
        }
        int length = iArr.length;
        while (i17 < length) {
            this.f45700n.a(obj, iArr[i17]);
            i17++;
        }
        ((com.google.protobuf.ya) this.f45701o).getClass();
        ((com.google.protobuf.n5) obj).unknownFields.f45711e = false;
        if (this.f45692f) {
            this.f45702p.f(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (com.google.protobuf.s9.z(com.google.protobuf.ib.o(r11, r7), com.google.protobuf.ib.o(r12, r7)) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (com.google.protobuf.s9.z(com.google.protobuf.ib.o(r11, r7), com.google.protobuf.ib.o(r12, r7)) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (com.google.protobuf.ib.n(r11, r7) == com.google.protobuf.ib.n(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (com.google.protobuf.ib.m(r11, r7) == com.google.protobuf.ib.m(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
    
        if (com.google.protobuf.ib.n(r11, r7) == com.google.protobuf.ib.n(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
    
        if (com.google.protobuf.ib.m(r11, r7) == com.google.protobuf.ib.m(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
    
        if (com.google.protobuf.ib.m(r11, r7) == com.google.protobuf.ib.m(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
    
        if (com.google.protobuf.ib.m(r11, r7) == com.google.protobuf.ib.m(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f5, code lost:
    
        if (com.google.protobuf.s9.z(com.google.protobuf.ib.o(r11, r7), com.google.protobuf.ib.o(r12, r7)) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:
    
        if (com.google.protobuf.s9.z(com.google.protobuf.ib.o(r11, r7), com.google.protobuf.ib.o(r12, r7)) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0121, code lost:
    
        if (com.google.protobuf.s9.z(com.google.protobuf.ib.o(r11, r7), com.google.protobuf.ib.o(r12, r7)) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0133, code lost:
    
        if (com.google.protobuf.ib.f(r11, r7) == com.google.protobuf.ib.f(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        if (com.google.protobuf.ib.m(r11, r7) == com.google.protobuf.ib.m(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:
    
        if (com.google.protobuf.ib.n(r11, r7) == com.google.protobuf.ib.n(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016b, code lost:
    
        if (com.google.protobuf.ib.m(r11, r7) == com.google.protobuf.ib.m(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017e, code lost:
    
        if (com.google.protobuf.ib.n(r11, r7) == com.google.protobuf.ib.n(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0191, code lost:
    
        if (com.google.protobuf.ib.n(r11, r7) == com.google.protobuf.ib.n(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01aa, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.protobuf.ib.l(r11, r7)) == java.lang.Float.floatToIntBits(com.google.protobuf.ib.l(r12, r7))) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c5, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.protobuf.ib.k(r11, r7)) == java.lang.Double.doubleToLongBits(com.google.protobuf.ib.k(r12, r7))) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc A[LOOP:0: B:2:0x0005->B:89:0x01cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cb A[SYNTHETIC] */
    @Override // com.google.protobuf.q9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.x8.equals(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.protobuf.q9
    public int f(java.lang.Object obj) {
        return this.f45694h ? q(obj) : p(obj);
    }

    @Override // com.google.protobuf.q9
    public java.lang.Object g() {
        return this.f45699m.a(this.f45691e);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x00bc. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0688 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x069e A[LOOP:1: B:28:0x069c->B:29:0x069e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0660 A[Catch: all -> 0x0690, TryCatch #0 {all -> 0x0690, blocks: (B:74:0x0645, B:87:0x065b, B:89:0x0660, B:91:0x0667, B:93:0x066f), top: B:73:0x0645 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0675 A[SYNTHETIC] */
    @Override // com.google.protobuf.q9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(java.lang.Object r23, com.google.protobuf.l9 r24, com.google.protobuf.t4 r25) {
        /*
            Method dump skipped, instructions count: 1852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.x8.h(java.lang.Object, com.google.protobuf.l9, com.google.protobuf.t4):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0017. Please report as an issue. */
    @Override // com.google.protobuf.q9
    public int hashCode(java.lang.Object obj) {
        int i17;
        int b17;
        int[] iArr = this.f45687a;
        int length = iArr.length;
        int i18 = 0;
        for (int i19 = 0; i19 < length; i19 += 3) {
            int P = P(i19);
            int i27 = iArr[i19];
            long j17 = 1048575 & P;
            switch ((P & 267386880) >>> 20) {
                case 0:
                    i17 = i18 * 53;
                    b17 = com.google.protobuf.w6.b(java.lang.Double.doubleToLongBits(com.google.protobuf.ib.k(obj, j17)));
                    i18 = i17 + b17;
                    break;
                case 1:
                    i17 = i18 * 53;
                    b17 = java.lang.Float.floatToIntBits(com.google.protobuf.ib.l(obj, j17));
                    i18 = i17 + b17;
                    break;
                case 2:
                    i17 = i18 * 53;
                    b17 = com.google.protobuf.w6.b(com.google.protobuf.ib.n(obj, j17));
                    i18 = i17 + b17;
                    break;
                case 3:
                    i17 = i18 * 53;
                    b17 = com.google.protobuf.w6.b(com.google.protobuf.ib.n(obj, j17));
                    i18 = i17 + b17;
                    break;
                case 4:
                    i17 = i18 * 53;
                    b17 = com.google.protobuf.ib.m(obj, j17);
                    i18 = i17 + b17;
                    break;
                case 5:
                    i17 = i18 * 53;
                    b17 = com.google.protobuf.w6.b(com.google.protobuf.ib.n(obj, j17));
                    i18 = i17 + b17;
                    break;
                case 6:
                    i17 = i18 * 53;
                    b17 = com.google.protobuf.ib.m(obj, j17);
                    i18 = i17 + b17;
                    break;
                case 7:
                    i17 = i18 * 53;
                    b17 = com.google.protobuf.w6.a(com.google.protobuf.ib.f(obj, j17));
                    i18 = i17 + b17;
                    break;
                case 8:
                    i17 = i18 * 53;
                    b17 = ((java.lang.String) com.google.protobuf.ib.o(obj, j17)).hashCode();
                    i18 = i17 + b17;
                    break;
                case 9:
                    java.lang.Object o17 = com.google.protobuf.ib.o(obj, j17);
                    if (o17 != null) {
                        b17 = o17.hashCode();
                        i17 = i18 * 53;
                        i18 = i17 + b17;
                        break;
                    }
                    b17 = 37;
                    i17 = i18 * 53;
                    i18 = i17 + b17;
                case 10:
                    i17 = i18 * 53;
                    b17 = com.google.protobuf.ib.o(obj, j17).hashCode();
                    i18 = i17 + b17;
                    break;
                case 11:
                    i17 = i18 * 53;
                    b17 = com.google.protobuf.ib.m(obj, j17);
                    i18 = i17 + b17;
                    break;
                case 12:
                    i17 = i18 * 53;
                    b17 = com.google.protobuf.ib.m(obj, j17);
                    i18 = i17 + b17;
                    break;
                case 13:
                    i17 = i18 * 53;
                    b17 = com.google.protobuf.ib.m(obj, j17);
                    i18 = i17 + b17;
                    break;
                case 14:
                    i17 = i18 * 53;
                    b17 = com.google.protobuf.w6.b(com.google.protobuf.ib.n(obj, j17));
                    i18 = i17 + b17;
                    break;
                case 15:
                    i17 = i18 * 53;
                    b17 = com.google.protobuf.ib.m(obj, j17);
                    i18 = i17 + b17;
                    break;
                case 16:
                    i17 = i18 * 53;
                    b17 = com.google.protobuf.w6.b(com.google.protobuf.ib.n(obj, j17));
                    i18 = i17 + b17;
                    break;
                case 17:
                    java.lang.Object o18 = com.google.protobuf.ib.o(obj, j17);
                    if (o18 != null) {
                        b17 = o18.hashCode();
                        i17 = i18 * 53;
                        i18 = i17 + b17;
                        break;
                    }
                    b17 = 37;
                    i17 = i18 * 53;
                    i18 = i17 + b17;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                    i17 = i18 * 53;
                    b17 = com.google.protobuf.ib.o(obj, j17).hashCode();
                    i18 = i17 + b17;
                    break;
                case 50:
                    i17 = i18 * 53;
                    b17 = com.google.protobuf.ib.o(obj, j17).hashCode();
                    i18 = i17 + b17;
                    break;
                case 51:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = com.google.protobuf.w6.b(java.lang.Double.doubleToLongBits(((java.lang.Double) com.google.protobuf.ib.o(obj, j17)).doubleValue()));
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = java.lang.Float.floatToIntBits(((java.lang.Float) com.google.protobuf.ib.o(obj, j17)).floatValue());
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = com.google.protobuf.w6.b(B(obj, j17));
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = com.google.protobuf.w6.b(B(obj, j17));
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = A(obj, j17);
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = com.google.protobuf.w6.b(B(obj, j17));
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = A(obj, j17);
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = com.google.protobuf.w6.a(((java.lang.Boolean) com.google.protobuf.ib.o(obj, j17)).booleanValue());
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = ((java.lang.String) com.google.protobuf.ib.o(obj, j17)).hashCode();
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = com.google.protobuf.ib.o(obj, j17).hashCode();
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = com.google.protobuf.ib.o(obj, j17).hashCode();
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = A(obj, j17);
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = A(obj, j17);
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = A(obj, j17);
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = com.google.protobuf.w6.b(B(obj, j17));
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = A(obj, j17);
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = com.google.protobuf.w6.b(B(obj, j17));
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(obj, i27, i19)) {
                        i17 = i18 * 53;
                        b17 = com.google.protobuf.ib.o(obj, j17).hashCode();
                        i18 = i17 + b17;
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((com.google.protobuf.ya) this.f45701o).getClass();
        int hashCode = (i18 * 53) + ((com.google.protobuf.n5) obj).unknownFields.hashCode();
        return this.f45692f ? (hashCode * 53) + this.f45702p.c(obj).hashCode() : hashCode;
    }

    public final boolean i(java.lang.Object obj, java.lang.Object obj2, int i17) {
        return r(obj, i17) == r(obj2, i17);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public final int j(byte[] bArr, int i17, int i18, com.google.protobuf.ub ubVar, java.lang.Class cls, com.google.protobuf.j jVar) {
        switch (ubVar.ordinal()) {
            case 0:
                jVar.f45213c = java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(com.google.protobuf.k.c(bArr, i17)));
                return i17 + 8;
            case 1:
                jVar.f45213c = java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(com.google.protobuf.k.b(bArr, i17)));
                return i17 + 4;
            case 2:
            case 3:
                int n17 = com.google.protobuf.k.n(bArr, i17, jVar);
                jVar.f45213c = java.lang.Long.valueOf(jVar.f45212b);
                return n17;
            case 4:
            case 12:
            case 13:
                int l17 = com.google.protobuf.k.l(bArr, i17, jVar);
                jVar.f45213c = java.lang.Integer.valueOf(jVar.f45211a);
                return l17;
            case 5:
            case 15:
                jVar.f45213c = java.lang.Long.valueOf(com.google.protobuf.k.c(bArr, i17));
                return i17 + 8;
            case 6:
            case 14:
                jVar.f45213c = java.lang.Integer.valueOf(com.google.protobuf.k.b(bArr, i17));
                return i17 + 4;
            case 7:
                int n18 = com.google.protobuf.k.n(bArr, i17, jVar);
                jVar.f45213c = java.lang.Boolean.valueOf(jVar.f45212b != 0);
                return n18;
            case 8:
                return com.google.protobuf.k.i(bArr, i17, jVar);
            case 9:
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
            case 10:
                return com.google.protobuf.k.e(com.google.protobuf.h9.f45166c.a(cls), bArr, i17, i18, jVar);
            case 11:
                return com.google.protobuf.k.a(bArr, i17, jVar);
            case 16:
                int l18 = com.google.protobuf.k.l(bArr, i17, jVar);
                jVar.f45213c = java.lang.Integer.valueOf(com.google.protobuf.d0.b(jVar.f45211a));
                return l18;
            case 17:
                int n19 = com.google.protobuf.k.n(bArr, i17, jVar);
                jVar.f45213c = java.lang.Long.valueOf(com.google.protobuf.d0.c(jVar.f45212b));
                return n19;
        }
    }

    public final java.lang.Object k(java.lang.Object obj, int i17, java.lang.Object obj2, com.google.protobuf.qa qaVar) {
        com.google.protobuf.r6 l17;
        int i18 = this.f45687a[i17];
        java.lang.Object o17 = com.google.protobuf.ib.o(obj, P(i17) & 1048575);
        if (o17 == null || (l17 = l(i17)) == null) {
            return obj2;
        }
        com.google.protobuf.f8 f8Var = this.f45703q;
        java.util.Map e17 = f8Var.e(o17);
        com.google.protobuf.u7 b17 = f8Var.b(m(i17));
        java.util.Iterator it = e17.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!l17.isInRange(((java.lang.Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    ((com.google.protobuf.ya) qaVar).getClass();
                    obj2 = new com.google.protobuf.xa();
                }
                int a17 = com.google.protobuf.v7.a(b17, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[a17];
                java.util.logging.Logger logger = com.google.protobuf.k0.f45246b;
                com.google.protobuf.h0 h0Var = new com.google.protobuf.h0(bArr, 0, a17);
                try {
                    com.google.protobuf.v7.d(h0Var, b17, entry.getKey(), entry.getValue());
                    if (h0Var.v() != 0) {
                        throw new java.lang.IllegalStateException("Did not write as much data as expected.");
                    }
                    com.google.protobuf.w wVar = new com.google.protobuf.w(bArr);
                    ((com.google.protobuf.ya) qaVar).getClass();
                    ((com.google.protobuf.xa) obj2).d((i18 << 3) | 2, wVar);
                    it.remove();
                } catch (java.io.IOException e18) {
                    throw new java.lang.RuntimeException(e18);
                }
            }
        }
        return obj2;
    }

    public final com.google.protobuf.r6 l(int i17) {
        return (com.google.protobuf.r6) this.f45688b[((i17 / 3) * 2) + 1];
    }

    public final java.lang.Object m(int i17) {
        return this.f45688b[(i17 / 3) * 2];
    }

    public final com.google.protobuf.q9 n(int i17) {
        int i18 = (i17 / 3) * 2;
        java.lang.Object[] objArr = this.f45688b;
        com.google.protobuf.q9 q9Var = (com.google.protobuf.q9) objArr[i18];
        if (q9Var != null) {
            return q9Var;
        }
        com.google.protobuf.q9 a17 = com.google.protobuf.h9.f45166c.a((java.lang.Class) objArr[i18 + 1]);
        objArr[i18] = a17;
        return a17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0056. Please report as an issue. */
    public final int p(java.lang.Object obj) {
        int i17;
        int i18;
        int e17;
        int b17;
        int p17;
        int o17;
        int p18;
        int p19;
        int p27;
        int t17;
        int p28;
        int r17;
        int i19;
        int i27 = 1048575;
        int i28 = 1048575;
        int i29 = 0;
        int i37 = 0;
        int i38 = 0;
        while (true) {
            int[] iArr = this.f45687a;
            if (i29 >= iArr.length) {
                ((com.google.protobuf.ya) this.f45701o).getClass();
                int a17 = i37 + ((com.google.protobuf.n5) obj).unknownFields.a();
                return this.f45692f ? a17 + this.f45702p.c(obj).m() : a17;
            }
            int P = P(i29);
            int i39 = iArr[i29];
            int i47 = (267386880 & P) >>> 20;
            boolean z17 = this.f45695i;
            sun.misc.Unsafe unsafe = f45686s;
            if (i47 <= 17) {
                i17 = iArr[i29 + 2];
                int i48 = i17 & i27;
                i18 = 1 << (i17 >>> 20);
                if (i48 != i28) {
                    i38 = unsafe.getInt(obj, i48);
                    i28 = i48;
                }
            } else {
                i17 = (!z17 || i47 < com.google.protobuf.d5.f45011f.f45016d || i47 > com.google.protobuf.d5.f45012g.f45016d) ? 0 : iArr[i29 + 2] & i27;
                i18 = 0;
            }
            long j17 = P & i27;
            switch (i47) {
                case 0:
                    if ((i38 & i18) != 0) {
                        e17 = com.google.protobuf.k0.e(i39, 0.0d);
                        i37 += e17;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i38 & i18) != 0) {
                        e17 = com.google.protobuf.k0.i(i39, 0.0f);
                        i37 += e17;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i38 & i18) != 0) {
                        e17 = com.google.protobuf.k0.m(i39, unsafe.getLong(obj, j17));
                        i37 += e17;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i38 & i18) != 0) {
                        e17 = com.google.protobuf.k0.s(i39, unsafe.getLong(obj, j17));
                        i37 += e17;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i38 & i18) != 0) {
                        e17 = com.google.protobuf.k0.k(i39, unsafe.getInt(obj, j17));
                        i37 += e17;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i38 & i18) != 0) {
                        e17 = com.google.protobuf.k0.h(i39, 0L);
                        i37 += e17;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i38 & i18) != 0) {
                        e17 = com.google.protobuf.k0.g(i39, 0);
                        i37 += e17;
                        break;
                    }
                    break;
                case 7:
                    if ((i38 & i18) != 0) {
                        b17 = com.google.protobuf.k0.b(i39, true);
                        i37 += b17;
                    }
                    break;
                case 8:
                    if ((i38 & i18) != 0) {
                        java.lang.Object object = unsafe.getObject(obj, j17);
                        if (object instanceof com.google.protobuf.y) {
                            b17 = com.google.protobuf.k0.c(i39, (com.google.protobuf.y) object);
                            i37 += b17;
                        } else {
                            p17 = com.google.protobuf.k0.p(i39);
                            o17 = com.google.protobuf.k0.o((java.lang.String) object);
                            b17 = o17 + p17;
                            i37 += b17;
                        }
                    }
                    break;
                case 9:
                    if ((i38 & i18) != 0) {
                        b17 = com.google.protobuf.s9.l(i39, unsafe.getObject(obj, j17), n(i29));
                        i37 += b17;
                    }
                    break;
                case 10:
                    if ((i38 & i18) != 0) {
                        b17 = com.google.protobuf.k0.c(i39, (com.google.protobuf.y) unsafe.getObject(obj, j17));
                        i37 += b17;
                    }
                    break;
                case 11:
                    if ((i38 & i18) != 0) {
                        b17 = com.google.protobuf.k0.q(i39, unsafe.getInt(obj, j17));
                        i37 += b17;
                    }
                    break;
                case 12:
                    if ((i38 & i18) != 0) {
                        b17 = com.google.protobuf.k0.f(i39, unsafe.getInt(obj, j17));
                        i37 += b17;
                    }
                    break;
                case 13:
                    if ((i38 & i18) != 0) {
                        p18 = com.google.protobuf.k0.p(i39);
                        b17 = p18 + 4;
                        i37 += b17;
                    }
                    break;
                case 14:
                    if ((i38 & i18) != 0) {
                        p19 = com.google.protobuf.k0.p(i39);
                        b17 = p19 + 8;
                        i37 += b17;
                    }
                    break;
                case 15:
                    if ((i38 & i18) != 0) {
                        int i49 = unsafe.getInt(obj, j17);
                        p17 = com.google.protobuf.k0.p(i39);
                        o17 = com.google.protobuf.k0.r((i49 >> 31) ^ (i49 << 1));
                        b17 = o17 + p17;
                        i37 += b17;
                    }
                    break;
                case 16:
                    if ((i38 & i18) != 0) {
                        long j18 = unsafe.getLong(obj, j17);
                        p27 = com.google.protobuf.k0.p(i39);
                        t17 = com.google.protobuf.k0.t((j18 >> 63) ^ (j18 << 1));
                        b17 = t17 + p27;
                        i37 += b17;
                    }
                    break;
                case 17:
                    if ((i38 & i18) != 0) {
                        b17 = com.google.protobuf.k0.j(i39, (com.google.protobuf.o8) unsafe.getObject(obj, j17), n(i29));
                        i37 += b17;
                    }
                    break;
                case 18:
                    b17 = com.google.protobuf.s9.f(i39, (java.util.List) unsafe.getObject(obj, j17), false);
                    i37 += b17;
                    break;
                case 19:
                    e17 = com.google.protobuf.s9.d(i39, (java.util.List) unsafe.getObject(obj, j17), false);
                    i37 += e17;
                    break;
                case 20:
                    e17 = com.google.protobuf.s9.j(i39, (java.util.List) unsafe.getObject(obj, j17), false);
                    i37 += e17;
                    break;
                case 21:
                    e17 = com.google.protobuf.s9.u(i39, (java.util.List) unsafe.getObject(obj, j17), false);
                    i37 += e17;
                    break;
                case 22:
                    e17 = com.google.protobuf.s9.h(i39, (java.util.List) unsafe.getObject(obj, j17), false);
                    i37 += e17;
                    break;
                case 23:
                    e17 = com.google.protobuf.s9.f(i39, (java.util.List) unsafe.getObject(obj, j17), false);
                    i37 += e17;
                    break;
                case 24:
                    e17 = com.google.protobuf.s9.d(i39, (java.util.List) unsafe.getObject(obj, j17), false);
                    i37 += e17;
                    break;
                case 25:
                    java.util.List list = (java.util.List) unsafe.getObject(obj, j17);
                    java.lang.Class cls = com.google.protobuf.s9.f45498a;
                    int size = list.size();
                    e17 = size == 0 ? 0 : size * com.google.protobuf.k0.b(i39, true);
                    i37 += e17;
                    break;
                case 26:
                    b17 = com.google.protobuf.s9.r(i39, (java.util.List) unsafe.getObject(obj, j17));
                    i37 += b17;
                    break;
                case 27:
                    b17 = com.google.protobuf.s9.m(i39, (java.util.List) unsafe.getObject(obj, j17), n(i29));
                    i37 += b17;
                    break;
                case 28:
                    b17 = com.google.protobuf.s9.a(i39, (java.util.List) unsafe.getObject(obj, j17));
                    i37 += b17;
                    break;
                case 29:
                    b17 = com.google.protobuf.s9.s(i39, (java.util.List) unsafe.getObject(obj, j17), false);
                    i37 += b17;
                    break;
                case 30:
                    e17 = com.google.protobuf.s9.b(i39, (java.util.List) unsafe.getObject(obj, j17), false);
                    i37 += e17;
                    break;
                case 31:
                    e17 = com.google.protobuf.s9.d(i39, (java.util.List) unsafe.getObject(obj, j17), false);
                    i37 += e17;
                    break;
                case 32:
                    e17 = com.google.protobuf.s9.f(i39, (java.util.List) unsafe.getObject(obj, j17), false);
                    i37 += e17;
                    break;
                case 33:
                    e17 = com.google.protobuf.s9.n(i39, (java.util.List) unsafe.getObject(obj, j17), false);
                    i37 += e17;
                    break;
                case 34:
                    e17 = com.google.protobuf.s9.p(i39, (java.util.List) unsafe.getObject(obj, j17), false);
                    i37 += e17;
                    break;
                case 35:
                    o17 = com.google.protobuf.s9.g((java.util.List) unsafe.getObject(obj, j17));
                    if (o17 > 0) {
                        if (z17) {
                            unsafe.putInt(obj, i17, o17);
                        }
                        p28 = com.google.protobuf.k0.p(i39);
                        r17 = com.google.protobuf.k0.r(o17);
                        p17 = p28 + r17;
                        b17 = o17 + p17;
                        i37 += b17;
                    }
                    break;
                case 36:
                    o17 = com.google.protobuf.s9.e((java.util.List) unsafe.getObject(obj, j17));
                    if (o17 > 0) {
                        if (z17) {
                            unsafe.putInt(obj, i17, o17);
                        }
                        p28 = com.google.protobuf.k0.p(i39);
                        r17 = com.google.protobuf.k0.r(o17);
                        p17 = p28 + r17;
                        b17 = o17 + p17;
                        i37 += b17;
                    }
                    break;
                case 37:
                    o17 = com.google.protobuf.s9.k((java.util.List) unsafe.getObject(obj, j17));
                    if (o17 > 0) {
                        if (z17) {
                            unsafe.putInt(obj, i17, o17);
                        }
                        p28 = com.google.protobuf.k0.p(i39);
                        r17 = com.google.protobuf.k0.r(o17);
                        p17 = p28 + r17;
                        b17 = o17 + p17;
                        i37 += b17;
                    }
                    break;
                case 38:
                    o17 = com.google.protobuf.s9.v((java.util.List) unsafe.getObject(obj, j17));
                    if (o17 > 0) {
                        if (z17) {
                            unsafe.putInt(obj, i17, o17);
                        }
                        p28 = com.google.protobuf.k0.p(i39);
                        r17 = com.google.protobuf.k0.r(o17);
                        p17 = p28 + r17;
                        b17 = o17 + p17;
                        i37 += b17;
                    }
                    break;
                case 39:
                    o17 = com.google.protobuf.s9.i((java.util.List) unsafe.getObject(obj, j17));
                    if (o17 > 0) {
                        if (z17) {
                            unsafe.putInt(obj, i17, o17);
                        }
                        p28 = com.google.protobuf.k0.p(i39);
                        r17 = com.google.protobuf.k0.r(o17);
                        p17 = p28 + r17;
                        b17 = o17 + p17;
                        i37 += b17;
                    }
                    break;
                case 40:
                    o17 = com.google.protobuf.s9.g((java.util.List) unsafe.getObject(obj, j17));
                    if (o17 > 0) {
                        if (z17) {
                            unsafe.putInt(obj, i17, o17);
                        }
                        p28 = com.google.protobuf.k0.p(i39);
                        r17 = com.google.protobuf.k0.r(o17);
                        p17 = p28 + r17;
                        b17 = o17 + p17;
                        i37 += b17;
                    }
                    break;
                case 41:
                    o17 = com.google.protobuf.s9.e((java.util.List) unsafe.getObject(obj, j17));
                    if (o17 > 0) {
                        if (z17) {
                            unsafe.putInt(obj, i17, o17);
                        }
                        p28 = com.google.protobuf.k0.p(i39);
                        r17 = com.google.protobuf.k0.r(o17);
                        p17 = p28 + r17;
                        b17 = o17 + p17;
                        i37 += b17;
                    }
                    break;
                case 42:
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj, j17);
                    java.lang.Class cls2 = com.google.protobuf.s9.f45498a;
                    o17 = list2.size();
                    if (o17 > 0) {
                        if (z17) {
                            unsafe.putInt(obj, i17, o17);
                        }
                        p28 = com.google.protobuf.k0.p(i39);
                        r17 = com.google.protobuf.k0.r(o17);
                        p17 = p28 + r17;
                        b17 = o17 + p17;
                        i37 += b17;
                    }
                    break;
                case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                    o17 = com.google.protobuf.s9.t((java.util.List) unsafe.getObject(obj, j17));
                    if (o17 > 0) {
                        if (z17) {
                            unsafe.putInt(obj, i17, o17);
                        }
                        p28 = com.google.protobuf.k0.p(i39);
                        r17 = com.google.protobuf.k0.r(o17);
                        p17 = p28 + r17;
                        b17 = o17 + p17;
                        i37 += b17;
                    }
                    break;
                case 44:
                    o17 = com.google.protobuf.s9.c((java.util.List) unsafe.getObject(obj, j17));
                    if (o17 > 0) {
                        if (z17) {
                            unsafe.putInt(obj, i17, o17);
                        }
                        p28 = com.google.protobuf.k0.p(i39);
                        r17 = com.google.protobuf.k0.r(o17);
                        p17 = p28 + r17;
                        b17 = o17 + p17;
                        i37 += b17;
                    }
                    break;
                case 45:
                    o17 = com.google.protobuf.s9.e((java.util.List) unsafe.getObject(obj, j17));
                    if (o17 > 0) {
                        if (z17) {
                            unsafe.putInt(obj, i17, o17);
                        }
                        p28 = com.google.protobuf.k0.p(i39);
                        r17 = com.google.protobuf.k0.r(o17);
                        p17 = p28 + r17;
                        b17 = o17 + p17;
                        i37 += b17;
                    }
                    break;
                case 46:
                    o17 = com.google.protobuf.s9.g((java.util.List) unsafe.getObject(obj, j17));
                    if (o17 > 0) {
                        if (z17) {
                            unsafe.putInt(obj, i17, o17);
                        }
                        p28 = com.google.protobuf.k0.p(i39);
                        r17 = com.google.protobuf.k0.r(o17);
                        p17 = p28 + r17;
                        b17 = o17 + p17;
                        i37 += b17;
                    }
                    break;
                case 47:
                    o17 = com.google.protobuf.s9.o((java.util.List) unsafe.getObject(obj, j17));
                    if (o17 > 0) {
                        if (z17) {
                            unsafe.putInt(obj, i17, o17);
                        }
                        p28 = com.google.protobuf.k0.p(i39);
                        r17 = com.google.protobuf.k0.r(o17);
                        p17 = p28 + r17;
                        b17 = o17 + p17;
                        i37 += b17;
                    }
                    break;
                case 48:
                    o17 = com.google.protobuf.s9.q((java.util.List) unsafe.getObject(obj, j17));
                    if (o17 > 0) {
                        if (z17) {
                            unsafe.putInt(obj, i17, o17);
                        }
                        p28 = com.google.protobuf.k0.p(i39);
                        r17 = com.google.protobuf.k0.r(o17);
                        p17 = p28 + r17;
                        b17 = o17 + p17;
                        i37 += b17;
                    }
                    break;
                case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj, j17);
                    com.google.protobuf.q9 n17 = n(i29);
                    java.lang.Class cls3 = com.google.protobuf.s9.f45498a;
                    int size2 = list3.size();
                    if (size2 == 0) {
                        i19 = 0;
                    } else {
                        i19 = 0;
                        for (int i57 = 0; i57 < size2; i57++) {
                            i19 += com.google.protobuf.k0.j(i39, (com.google.protobuf.o8) list3.get(i57), n17);
                        }
                    }
                    b17 = i19;
                    i37 += b17;
                    break;
                case 50:
                    b17 = this.f45703q.d(i39, unsafe.getObject(obj, j17), m(i29));
                    i37 += b17;
                    break;
                case 51:
                    if (s(obj, i39, i29)) {
                        b17 = com.google.protobuf.k0.e(i39, 0.0d);
                        i37 += b17;
                    }
                    break;
                case 52:
                    if (s(obj, i39, i29)) {
                        b17 = com.google.protobuf.k0.i(i39, 0.0f);
                        i37 += b17;
                    }
                    break;
                case 53:
                    if (s(obj, i39, i29)) {
                        b17 = com.google.protobuf.k0.m(i39, B(obj, j17));
                        i37 += b17;
                    }
                    break;
                case 54:
                    if (s(obj, i39, i29)) {
                        b17 = com.google.protobuf.k0.s(i39, B(obj, j17));
                        i37 += b17;
                    }
                    break;
                case 55:
                    if (s(obj, i39, i29)) {
                        b17 = com.google.protobuf.k0.k(i39, A(obj, j17));
                        i37 += b17;
                    }
                    break;
                case 56:
                    if (s(obj, i39, i29)) {
                        b17 = com.google.protobuf.k0.h(i39, 0L);
                        i37 += b17;
                    }
                    break;
                case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
                    if (s(obj, i39, i29)) {
                        b17 = com.google.protobuf.k0.g(i39, 0);
                        i37 += b17;
                    }
                    break;
                case 58:
                    if (s(obj, i39, i29)) {
                        b17 = com.google.protobuf.k0.b(i39, true);
                        i37 += b17;
                    }
                    break;
                case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                    if (s(obj, i39, i29)) {
                        java.lang.Object object2 = unsafe.getObject(obj, j17);
                        if (object2 instanceof com.google.protobuf.y) {
                            b17 = com.google.protobuf.k0.c(i39, (com.google.protobuf.y) object2);
                            i37 += b17;
                        } else {
                            p17 = com.google.protobuf.k0.p(i39);
                            o17 = com.google.protobuf.k0.o((java.lang.String) object2);
                            b17 = o17 + p17;
                            i37 += b17;
                        }
                    }
                    break;
                case 60:
                    if (s(obj, i39, i29)) {
                        b17 = com.google.protobuf.s9.l(i39, unsafe.getObject(obj, j17), n(i29));
                        i37 += b17;
                    }
                    break;
                case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                    if (s(obj, i39, i29)) {
                        b17 = com.google.protobuf.k0.c(i39, (com.google.protobuf.y) unsafe.getObject(obj, j17));
                        i37 += b17;
                    }
                    break;
                case 62:
                    if (s(obj, i39, i29)) {
                        b17 = com.google.protobuf.k0.q(i39, A(obj, j17));
                        i37 += b17;
                    }
                    break;
                case 63:
                    if (s(obj, i39, i29)) {
                        b17 = com.google.protobuf.k0.f(i39, A(obj, j17));
                        i37 += b17;
                    }
                    break;
                case 64:
                    if (s(obj, i39, i29)) {
                        p18 = com.google.protobuf.k0.p(i39);
                        b17 = p18 + 4;
                        i37 += b17;
                    }
                    break;
                case 65:
                    if (s(obj, i39, i29)) {
                        p19 = com.google.protobuf.k0.p(i39);
                        b17 = p19 + 8;
                        i37 += b17;
                    }
                    break;
                case 66:
                    if (s(obj, i39, i29)) {
                        int A = A(obj, j17);
                        p17 = com.google.protobuf.k0.p(i39);
                        o17 = com.google.protobuf.k0.r((A >> 31) ^ (A << 1));
                        b17 = o17 + p17;
                        i37 += b17;
                    }
                    break;
                case 67:
                    if (s(obj, i39, i29)) {
                        long B = B(obj, j17);
                        p27 = com.google.protobuf.k0.p(i39);
                        t17 = com.google.protobuf.k0.t((B >> 63) ^ (B << 1));
                        b17 = t17 + p27;
                        i37 += b17;
                    }
                    break;
                case 68:
                    if (s(obj, i39, i29)) {
                        b17 = com.google.protobuf.k0.j(i39, (com.google.protobuf.o8) unsafe.getObject(obj, j17), n(i29));
                        i37 += b17;
                    }
                    break;
            }
            i29 += 3;
            i27 = 1048575;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0038. Please report as an issue. */
    public final int q(java.lang.Object obj) {
        int e17;
        int p17;
        int o17;
        int p18;
        int p19;
        int p27;
        int t17;
        int p28;
        int r17;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[] iArr = this.f45687a;
            if (i17 >= iArr.length) {
                ((com.google.protobuf.ya) this.f45701o).getClass();
                return i18 + ((com.google.protobuf.n5) obj).unknownFields.a();
            }
            int P = P(i17);
            int i19 = (267386880 & P) >>> 20;
            int i27 = iArr[i17];
            long j17 = P & 1048575;
            int i28 = (i19 < com.google.protobuf.d5.f45011f.f45016d || i19 > com.google.protobuf.d5.f45012g.f45016d) ? 0 : iArr[i17 + 2] & 1048575;
            boolean z17 = this.f45695i;
            sun.misc.Unsafe unsafe = f45686s;
            switch (i19) {
                case 0:
                    if (r(obj, i17)) {
                        e17 = com.google.protobuf.k0.e(i27, 0.0d);
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (r(obj, i17)) {
                        e17 = com.google.protobuf.k0.i(i27, 0.0f);
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (r(obj, i17)) {
                        e17 = com.google.protobuf.k0.m(i27, com.google.protobuf.ib.n(obj, j17));
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (r(obj, i17)) {
                        e17 = com.google.protobuf.k0.s(i27, com.google.protobuf.ib.n(obj, j17));
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (r(obj, i17)) {
                        e17 = com.google.protobuf.k0.k(i27, com.google.protobuf.ib.m(obj, j17));
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (r(obj, i17)) {
                        e17 = com.google.protobuf.k0.h(i27, 0L);
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (r(obj, i17)) {
                        e17 = com.google.protobuf.k0.g(i27, 0);
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (r(obj, i17)) {
                        e17 = com.google.protobuf.k0.b(i27, true);
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!r(obj, i17)) {
                        break;
                    } else {
                        java.lang.Object o18 = com.google.protobuf.ib.o(obj, j17);
                        if (o18 instanceof com.google.protobuf.y) {
                            e17 = com.google.protobuf.k0.c(i27, (com.google.protobuf.y) o18);
                            i18 += e17;
                            break;
                        } else {
                            p17 = com.google.protobuf.k0.p(i27);
                            o17 = com.google.protobuf.k0.o((java.lang.String) o18);
                            e17 = o17 + p17;
                            i18 += e17;
                        }
                    }
                case 9:
                    if (r(obj, i17)) {
                        e17 = com.google.protobuf.s9.l(i27, com.google.protobuf.ib.o(obj, j17), n(i17));
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (r(obj, i17)) {
                        e17 = com.google.protobuf.k0.c(i27, (com.google.protobuf.y) com.google.protobuf.ib.o(obj, j17));
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (r(obj, i17)) {
                        e17 = com.google.protobuf.k0.q(i27, com.google.protobuf.ib.m(obj, j17));
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (r(obj, i17)) {
                        e17 = com.google.protobuf.k0.f(i27, com.google.protobuf.ib.m(obj, j17));
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (r(obj, i17)) {
                        p18 = com.google.protobuf.k0.p(i27);
                        e17 = p18 + 4;
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (r(obj, i17)) {
                        p19 = com.google.protobuf.k0.p(i27);
                        e17 = p19 + 8;
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (r(obj, i17)) {
                        int m17 = com.google.protobuf.ib.m(obj, j17);
                        p17 = com.google.protobuf.k0.p(i27);
                        o17 = com.google.protobuf.k0.r((m17 >> 31) ^ (m17 << 1));
                        e17 = o17 + p17;
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (r(obj, i17)) {
                        long n17 = com.google.protobuf.ib.n(obj, j17);
                        p27 = com.google.protobuf.k0.p(i27);
                        t17 = com.google.protobuf.k0.t((n17 >> 63) ^ (n17 << 1));
                        e17 = p27 + t17;
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (r(obj, i17)) {
                        e17 = com.google.protobuf.k0.j(i27, (com.google.protobuf.o8) com.google.protobuf.ib.o(obj, j17), n(i17));
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    e17 = com.google.protobuf.s9.f(i27, t(obj, j17), false);
                    i18 += e17;
                    break;
                case 19:
                    e17 = com.google.protobuf.s9.d(i27, t(obj, j17), false);
                    i18 += e17;
                    break;
                case 20:
                    e17 = com.google.protobuf.s9.j(i27, t(obj, j17), false);
                    i18 += e17;
                    break;
                case 21:
                    e17 = com.google.protobuf.s9.u(i27, t(obj, j17), false);
                    i18 += e17;
                    break;
                case 22:
                    e17 = com.google.protobuf.s9.h(i27, t(obj, j17), false);
                    i18 += e17;
                    break;
                case 23:
                    e17 = com.google.protobuf.s9.f(i27, t(obj, j17), false);
                    i18 += e17;
                    break;
                case 24:
                    e17 = com.google.protobuf.s9.d(i27, t(obj, j17), false);
                    i18 += e17;
                    break;
                case 25:
                    java.util.List t18 = t(obj, j17);
                    java.lang.Class cls = com.google.protobuf.s9.f45498a;
                    int size = t18.size();
                    if (size != 0) {
                        e17 = size * com.google.protobuf.k0.b(i27, true);
                        i18 += e17;
                        break;
                    }
                    e17 = 0;
                    i18 += e17;
                case 26:
                    e17 = com.google.protobuf.s9.r(i27, t(obj, j17));
                    i18 += e17;
                    break;
                case 27:
                    e17 = com.google.protobuf.s9.m(i27, t(obj, j17), n(i17));
                    i18 += e17;
                    break;
                case 28:
                    e17 = com.google.protobuf.s9.a(i27, t(obj, j17));
                    i18 += e17;
                    break;
                case 29:
                    e17 = com.google.protobuf.s9.s(i27, t(obj, j17), false);
                    i18 += e17;
                    break;
                case 30:
                    e17 = com.google.protobuf.s9.b(i27, t(obj, j17), false);
                    i18 += e17;
                    break;
                case 31:
                    e17 = com.google.protobuf.s9.d(i27, t(obj, j17), false);
                    i18 += e17;
                    break;
                case 32:
                    e17 = com.google.protobuf.s9.f(i27, t(obj, j17), false);
                    i18 += e17;
                    break;
                case 33:
                    e17 = com.google.protobuf.s9.n(i27, t(obj, j17), false);
                    i18 += e17;
                    break;
                case 34:
                    e17 = com.google.protobuf.s9.p(i27, t(obj, j17), false);
                    i18 += e17;
                    break;
                case 35:
                    t17 = com.google.protobuf.s9.g((java.util.List) unsafe.getObject(obj, j17));
                    if (t17 <= 0) {
                        break;
                    } else {
                        if (z17) {
                            unsafe.putInt(obj, i28, t17);
                        }
                        p28 = com.google.protobuf.k0.p(i27);
                        r17 = com.google.protobuf.k0.r(t17);
                        p27 = p28 + r17;
                        e17 = p27 + t17;
                        i18 += e17;
                        break;
                    }
                case 36:
                    t17 = com.google.protobuf.s9.e((java.util.List) unsafe.getObject(obj, j17));
                    if (t17 <= 0) {
                        break;
                    } else {
                        if (z17) {
                            unsafe.putInt(obj, i28, t17);
                        }
                        p28 = com.google.protobuf.k0.p(i27);
                        r17 = com.google.protobuf.k0.r(t17);
                        p27 = p28 + r17;
                        e17 = p27 + t17;
                        i18 += e17;
                        break;
                    }
                case 37:
                    t17 = com.google.protobuf.s9.k((java.util.List) unsafe.getObject(obj, j17));
                    if (t17 <= 0) {
                        break;
                    } else {
                        if (z17) {
                            unsafe.putInt(obj, i28, t17);
                        }
                        p28 = com.google.protobuf.k0.p(i27);
                        r17 = com.google.protobuf.k0.r(t17);
                        p27 = p28 + r17;
                        e17 = p27 + t17;
                        i18 += e17;
                        break;
                    }
                case 38:
                    t17 = com.google.protobuf.s9.v((java.util.List) unsafe.getObject(obj, j17));
                    if (t17 <= 0) {
                        break;
                    } else {
                        if (z17) {
                            unsafe.putInt(obj, i28, t17);
                        }
                        p28 = com.google.protobuf.k0.p(i27);
                        r17 = com.google.protobuf.k0.r(t17);
                        p27 = p28 + r17;
                        e17 = p27 + t17;
                        i18 += e17;
                        break;
                    }
                case 39:
                    t17 = com.google.protobuf.s9.i((java.util.List) unsafe.getObject(obj, j17));
                    if (t17 <= 0) {
                        break;
                    } else {
                        if (z17) {
                            unsafe.putInt(obj, i28, t17);
                        }
                        p28 = com.google.protobuf.k0.p(i27);
                        r17 = com.google.protobuf.k0.r(t17);
                        p27 = p28 + r17;
                        e17 = p27 + t17;
                        i18 += e17;
                        break;
                    }
                case 40:
                    t17 = com.google.protobuf.s9.g((java.util.List) unsafe.getObject(obj, j17));
                    if (t17 <= 0) {
                        break;
                    } else {
                        if (z17) {
                            unsafe.putInt(obj, i28, t17);
                        }
                        p28 = com.google.protobuf.k0.p(i27);
                        r17 = com.google.protobuf.k0.r(t17);
                        p27 = p28 + r17;
                        e17 = p27 + t17;
                        i18 += e17;
                        break;
                    }
                case 41:
                    t17 = com.google.protobuf.s9.e((java.util.List) unsafe.getObject(obj, j17));
                    if (t17 <= 0) {
                        break;
                    } else {
                        if (z17) {
                            unsafe.putInt(obj, i28, t17);
                        }
                        p28 = com.google.protobuf.k0.p(i27);
                        r17 = com.google.protobuf.k0.r(t17);
                        p27 = p28 + r17;
                        e17 = p27 + t17;
                        i18 += e17;
                        break;
                    }
                case 42:
                    java.util.List list = (java.util.List) unsafe.getObject(obj, j17);
                    java.lang.Class cls2 = com.google.protobuf.s9.f45498a;
                    t17 = list.size();
                    if (t17 <= 0) {
                        break;
                    } else {
                        if (z17) {
                            unsafe.putInt(obj, i28, t17);
                        }
                        p28 = com.google.protobuf.k0.p(i27);
                        r17 = com.google.protobuf.k0.r(t17);
                        p27 = p28 + r17;
                        e17 = p27 + t17;
                        i18 += e17;
                        break;
                    }
                case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                    t17 = com.google.protobuf.s9.t((java.util.List) unsafe.getObject(obj, j17));
                    if (t17 <= 0) {
                        break;
                    } else {
                        if (z17) {
                            unsafe.putInt(obj, i28, t17);
                        }
                        p28 = com.google.protobuf.k0.p(i27);
                        r17 = com.google.protobuf.k0.r(t17);
                        p27 = p28 + r17;
                        e17 = p27 + t17;
                        i18 += e17;
                        break;
                    }
                case 44:
                    t17 = com.google.protobuf.s9.c((java.util.List) unsafe.getObject(obj, j17));
                    if (t17 <= 0) {
                        break;
                    } else {
                        if (z17) {
                            unsafe.putInt(obj, i28, t17);
                        }
                        p28 = com.google.protobuf.k0.p(i27);
                        r17 = com.google.protobuf.k0.r(t17);
                        p27 = p28 + r17;
                        e17 = p27 + t17;
                        i18 += e17;
                        break;
                    }
                case 45:
                    t17 = com.google.protobuf.s9.e((java.util.List) unsafe.getObject(obj, j17));
                    if (t17 <= 0) {
                        break;
                    } else {
                        if (z17) {
                            unsafe.putInt(obj, i28, t17);
                        }
                        p28 = com.google.protobuf.k0.p(i27);
                        r17 = com.google.protobuf.k0.r(t17);
                        p27 = p28 + r17;
                        e17 = p27 + t17;
                        i18 += e17;
                        break;
                    }
                case 46:
                    t17 = com.google.protobuf.s9.g((java.util.List) unsafe.getObject(obj, j17));
                    if (t17 <= 0) {
                        break;
                    } else {
                        if (z17) {
                            unsafe.putInt(obj, i28, t17);
                        }
                        p28 = com.google.protobuf.k0.p(i27);
                        r17 = com.google.protobuf.k0.r(t17);
                        p27 = p28 + r17;
                        e17 = p27 + t17;
                        i18 += e17;
                        break;
                    }
                case 47:
                    t17 = com.google.protobuf.s9.o((java.util.List) unsafe.getObject(obj, j17));
                    if (t17 <= 0) {
                        break;
                    } else {
                        if (z17) {
                            unsafe.putInt(obj, i28, t17);
                        }
                        p28 = com.google.protobuf.k0.p(i27);
                        r17 = com.google.protobuf.k0.r(t17);
                        p27 = p28 + r17;
                        e17 = p27 + t17;
                        i18 += e17;
                        break;
                    }
                case 48:
                    t17 = com.google.protobuf.s9.q((java.util.List) unsafe.getObject(obj, j17));
                    if (t17 <= 0) {
                        break;
                    } else {
                        if (z17) {
                            unsafe.putInt(obj, i28, t17);
                        }
                        p28 = com.google.protobuf.k0.p(i27);
                        r17 = com.google.protobuf.k0.r(t17);
                        p27 = p28 + r17;
                        e17 = p27 + t17;
                        i18 += e17;
                        break;
                    }
                case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                    java.util.List t19 = t(obj, j17);
                    com.google.protobuf.q9 n18 = n(i17);
                    java.lang.Class cls3 = com.google.protobuf.s9.f45498a;
                    int size2 = t19.size();
                    if (size2 != 0) {
                        int i29 = 0;
                        for (int i37 = 0; i37 < size2; i37++) {
                            i29 += com.google.protobuf.k0.j(i27, (com.google.protobuf.o8) t19.get(i37), n18);
                        }
                        e17 = i29;
                        i18 += e17;
                        break;
                    }
                    e17 = 0;
                    i18 += e17;
                case 50:
                    e17 = this.f45703q.d(i27, com.google.protobuf.ib.o(obj, j17), m(i17));
                    i18 += e17;
                    break;
                case 51:
                    if (s(obj, i27, i17)) {
                        e17 = com.google.protobuf.k0.e(i27, 0.0d);
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(obj, i27, i17)) {
                        e17 = com.google.protobuf.k0.i(i27, 0.0f);
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(obj, i27, i17)) {
                        e17 = com.google.protobuf.k0.m(i27, B(obj, j17));
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(obj, i27, i17)) {
                        e17 = com.google.protobuf.k0.s(i27, B(obj, j17));
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(obj, i27, i17)) {
                        e17 = com.google.protobuf.k0.k(i27, A(obj, j17));
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(obj, i27, i17)) {
                        e17 = com.google.protobuf.k0.h(i27, 0L);
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
                    if (s(obj, i27, i17)) {
                        e17 = com.google.protobuf.k0.g(i27, 0);
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(obj, i27, i17)) {
                        e17 = com.google.protobuf.k0.b(i27, true);
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                    if (!s(obj, i27, i17)) {
                        break;
                    } else {
                        java.lang.Object o19 = com.google.protobuf.ib.o(obj, j17);
                        if (o19 instanceof com.google.protobuf.y) {
                            e17 = com.google.protobuf.k0.c(i27, (com.google.protobuf.y) o19);
                            i18 += e17;
                            break;
                        } else {
                            p17 = com.google.protobuf.k0.p(i27);
                            o17 = com.google.protobuf.k0.o((java.lang.String) o19);
                            e17 = o17 + p17;
                            i18 += e17;
                        }
                    }
                case 60:
                    if (s(obj, i27, i17)) {
                        e17 = com.google.protobuf.s9.l(i27, com.google.protobuf.ib.o(obj, j17), n(i17));
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                    if (s(obj, i27, i17)) {
                        e17 = com.google.protobuf.k0.c(i27, (com.google.protobuf.y) com.google.protobuf.ib.o(obj, j17));
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(obj, i27, i17)) {
                        e17 = com.google.protobuf.k0.q(i27, A(obj, j17));
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(obj, i27, i17)) {
                        e17 = com.google.protobuf.k0.f(i27, A(obj, j17));
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(obj, i27, i17)) {
                        p18 = com.google.protobuf.k0.p(i27);
                        e17 = p18 + 4;
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(obj, i27, i17)) {
                        p19 = com.google.protobuf.k0.p(i27);
                        e17 = p19 + 8;
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(obj, i27, i17)) {
                        int A = A(obj, j17);
                        p17 = com.google.protobuf.k0.p(i27);
                        o17 = com.google.protobuf.k0.r((A >> 31) ^ (A << 1));
                        e17 = o17 + p17;
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(obj, i27, i17)) {
                        long B = B(obj, j17);
                        p27 = com.google.protobuf.k0.p(i27);
                        t17 = com.google.protobuf.k0.t((B >> 63) ^ (B << 1));
                        e17 = p27 + t17;
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(obj, i27, i17)) {
                        e17 = com.google.protobuf.k0.j(i27, (com.google.protobuf.o8) com.google.protobuf.ib.o(obj, j17), n(i17));
                        i18 += e17;
                        break;
                    } else {
                        break;
                    }
            }
            i17 += 3;
        }
    }

    public final boolean r(java.lang.Object obj, int i17) {
        boolean equals;
        int i18 = this.f45687a[i17 + 2];
        long j17 = i18 & 1048575;
        if (j17 != 1048575) {
            return (com.google.protobuf.ib.m(obj, j17) & (1 << (i18 >>> 20))) != 0;
        }
        int P = P(i17);
        long j18 = P & 1048575;
        switch ((P & 267386880) >>> 20) {
            case 0:
                return com.google.protobuf.ib.k(obj, j18) != 0.0d;
            case 1:
                return com.google.protobuf.ib.l(obj, j18) != 0.0f;
            case 2:
                return com.google.protobuf.ib.n(obj, j18) != 0;
            case 3:
                return com.google.protobuf.ib.n(obj, j18) != 0;
            case 4:
                return com.google.protobuf.ib.m(obj, j18) != 0;
            case 5:
                return com.google.protobuf.ib.n(obj, j18) != 0;
            case 6:
                return com.google.protobuf.ib.m(obj, j18) != 0;
            case 7:
                return com.google.protobuf.ib.f(obj, j18);
            case 8:
                java.lang.Object o17 = com.google.protobuf.ib.o(obj, j18);
                if (o17 instanceof java.lang.String) {
                    equals = ((java.lang.String) o17).isEmpty();
                    break;
                } else {
                    if (!(o17 instanceof com.google.protobuf.y)) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    equals = com.google.protobuf.y.f45712e.equals(o17);
                    break;
                }
            case 9:
                return com.google.protobuf.ib.o(obj, j18) != null;
            case 10:
                equals = com.google.protobuf.y.f45712e.equals(com.google.protobuf.ib.o(obj, j18));
                break;
            case 11:
                return com.google.protobuf.ib.m(obj, j18) != 0;
            case 12:
                return com.google.protobuf.ib.m(obj, j18) != 0;
            case 13:
                return com.google.protobuf.ib.m(obj, j18) != 0;
            case 14:
                return com.google.protobuf.ib.n(obj, j18) != 0;
            case 15:
                return com.google.protobuf.ib.m(obj, j18) != 0;
            case 16:
                return com.google.protobuf.ib.n(obj, j18) != 0;
            case 17:
                return com.google.protobuf.ib.o(obj, j18) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
        return !equals;
    }

    public final boolean s(java.lang.Object obj, int i17, int i18) {
        return com.google.protobuf.ib.m(obj, (long) (this.f45687a[i18 + 2] & 1048575)) == i17;
    }

    public final void u(java.lang.Object obj, int i17, java.lang.Object obj2, com.google.protobuf.t4 t4Var, com.google.protobuf.l9 l9Var) {
        long P = P(i17) & 1048575;
        java.lang.Object o17 = com.google.protobuf.ib.o(obj, P);
        com.google.protobuf.f8 f8Var = this.f45703q;
        if (o17 == null) {
            o17 = f8Var.f(obj2);
            com.google.protobuf.ib.w(obj, P, o17);
        } else if (f8Var.h(o17)) {
            java.lang.Object f17 = f8Var.f(obj2);
            f8Var.a(f17, o17);
            com.google.protobuf.ib.w(obj, P, f17);
            o17 = f17;
        }
        l9Var.g(f8Var.e(o17), f8Var.b(obj2), t4Var);
    }

    public final void v(java.lang.Object obj, java.lang.Object obj2, int i17) {
        long P = P(i17) & 1048575;
        if (r(obj2, i17)) {
            java.lang.Object o17 = com.google.protobuf.ib.o(obj, P);
            java.lang.Object o18 = com.google.protobuf.ib.o(obj2, P);
            if (o17 != null && o18 != null) {
                com.google.protobuf.ib.w(obj, P, com.google.protobuf.w6.c(o17, o18));
                M(obj, i17);
            } else if (o18 != null) {
                com.google.protobuf.ib.w(obj, P, o18);
                M(obj, i17);
            }
        }
    }

    public final void w(java.lang.Object obj, java.lang.Object obj2, int i17) {
        int P = P(i17);
        int i18 = this.f45687a[i17];
        long j17 = P & 1048575;
        if (s(obj2, i18, i17)) {
            java.lang.Object o17 = com.google.protobuf.ib.o(obj, j17);
            java.lang.Object o18 = com.google.protobuf.ib.o(obj2, j17);
            if (o17 != null && o18 != null) {
                com.google.protobuf.ib.w(obj, j17, com.google.protobuf.w6.c(o17, o18));
                N(obj, i18, i17);
            } else if (o18 != null) {
                com.google.protobuf.ib.w(obj, j17, o18);
                N(obj, i18, i17);
            }
        }
    }
}
