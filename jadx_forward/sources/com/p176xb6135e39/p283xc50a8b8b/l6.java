package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class l6 extends com.p176xb6135e39.p283xc50a8b8b.c implements java.io.Serializable {

    /* renamed from: alwaysUseFieldBuilders */
    protected static boolean f7872x2df6253a = false;

    /* renamed from: serialVersionUID */
    private static final long f7873x3a3ed56c = 1;

    /* renamed from: unknownFields */
    protected com.p176xb6135e39.p283xc50a8b8b.wa f7874x4f0c37a3;

    public l6() {
        this.f7874x4f0c37a3 = com.p176xb6135e39.p283xc50a8b8b.wa.f127184e;
    }

    /* renamed from: access$1000 */
    public static java.lang.reflect.Method m20738xbf18579f(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException e17) {
            java.lang.String name = cls.getName();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(name.length() + 45 + java.lang.String.valueOf(str).length());
            sb6.append("Generated message class \"");
            sb6.append(name);
            sb6.append("\" missing method \"");
            sb6.append(str);
            sb6.append("\".");
            throw new java.lang.RuntimeException(sb6.toString(), e17);
        }
    }

    /* renamed from: access$1100 */
    public static java.lang.Object m20739xbf185b60(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object[] objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e17);
        } catch (java.lang.reflect.InvocationTargetException e18) {
            java.lang.Throwable cause = e18.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: access$500 */
    public static com.p176xb6135e39.p283xc50a8b8b.m4 m20740xbbd78db5(com.p176xb6135e39.p283xc50a8b8b.n4 n4Var) {
        n4Var.getClass();
        throw new java.lang.IllegalArgumentException("Expected non-lite extension.");
    }

    /* renamed from: canUseUnsafe */
    public static boolean m20742xb6ee741d() {
        return com.p176xb6135e39.p283xc50a8b8b.ib.f126740f && com.p176xb6135e39.p283xc50a8b8b.ib.f126739e;
    }

    /* renamed from: computeStringSize */
    public static int m20743x690e0f49(int i17, java.lang.Object obj) {
        return obj instanceof java.lang.String ? com.p176xb6135e39.p283xc50a8b8b.k0.p(i17) + com.p176xb6135e39.p283xc50a8b8b.k0.o((java.lang.String) obj) : com.p176xb6135e39.p283xc50a8b8b.k0.c(i17, (com.p176xb6135e39.p283xc50a8b8b.y) obj);
    }

    /* renamed from: computeStringSizeNoTag */
    public static int m20744x2973fc50(java.lang.Object obj) {
        return obj instanceof java.lang.String ? com.p176xb6135e39.p283xc50a8b8b.k0.o((java.lang.String) obj) : com.p176xb6135e39.p283xc50a8b8b.k0.d((com.p176xb6135e39.p283xc50a8b8b.y) obj);
    }

    public static void e(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var, java.util.Map map, com.p176xb6135e39.p283xc50a8b8b.t7 t7Var, int i17) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            com.p176xb6135e39.p283xc50a8b8b.q7 mo20596xab31548 = t7Var.mo20596xab31548();
            mo20596xab31548.f126982e = entry.getKey();
            mo20596xab31548.f126984g = true;
            mo20596xab31548.f126983f = entry.getValue();
            mo20596xab31548.f126985h = true;
            k0Var.J(i17, mo20596xab31548.mo20556x59bc66e());
        }
    }

    /* renamed from: emptyBooleanList */
    public static com.p176xb6135e39.p283xc50a8b8b.n6 m20745xbe5dfd59() {
        return com.p176xb6135e39.p283xc50a8b8b.o.f126874g;
    }

    /* renamed from: emptyDoubleList */
    public static com.p176xb6135e39.p283xc50a8b8b.o6 m20746x7a23353c() {
        return com.p176xb6135e39.p283xc50a8b8b.j4.f126765g;
    }

    /* renamed from: emptyFloatList */
    public static com.p176xb6135e39.p283xc50a8b8b.s6 m20747xefeffa4d() {
        return com.p176xb6135e39.p283xc50a8b8b.e5.f126591g;
    }

    /* renamed from: emptyIntList */
    public static com.p176xb6135e39.p283xc50a8b8b.t6 m20748x6eeb1f20() {
        return com.p176xb6135e39.p283xc50a8b8b.m6.f126860g;
    }

    /* renamed from: emptyLongList */
    public static com.p176xb6135e39.p283xc50a8b8b.u6 m20749xd23499a7() {
        return com.p176xb6135e39.p283xc50a8b8b.l7.f126832g;
    }

    /* renamed from: enableAlwaysUseFieldBuildersForTesting */
    public static void m20750x8eb19784() {
        m20771x3332f263(true);
    }

    /* renamed from: mutableCopy */
    public static com.p176xb6135e39.p283xc50a8b8b.t6 m20754x946297bb(com.p176xb6135e39.p283xc50a8b8b.t6 t6Var) {
        int i17 = ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).f126862f;
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    /* renamed from: newBooleanList */
    public static com.p176xb6135e39.p283xc50a8b8b.n6 m20756xb098f726() {
        return new com.p176xb6135e39.p283xc50a8b8b.o();
    }

    /* renamed from: newDoubleList */
    public static com.p176xb6135e39.p283xc50a8b8b.o6 m20757x60eb4dcf() {
        return new com.p176xb6135e39.p283xc50a8b8b.j4();
    }

    /* renamed from: newFloatList */
    public static com.p176xb6135e39.p283xc50a8b8b.s6 m20758x9449035a() {
        return new com.p176xb6135e39.p283xc50a8b8b.e5();
    }

    /* renamed from: newIntList */
    public static com.p176xb6135e39.p283xc50a8b8b.t6 m20759x981d076d() {
        return new com.p176xb6135e39.p283xc50a8b8b.m6();
    }

    /* renamed from: newLongList */
    public static com.p176xb6135e39.p283xc50a8b8b.u6 m20760xcf3fbafa() {
        return new com.p176xb6135e39.p283xc50a8b8b.l7();
    }

    /* renamed from: parseDelimitedWithIOException */
    public static <M extends com.p176xb6135e39.p283xc50a8b8b.k8> M m20761xfaac9fdd(com.p176xb6135e39.p283xc50a8b8b.e9 e9Var, java.io.InputStream inputStream) {
        try {
            return (M) e9Var.mo20632x4a829d50(inputStream);
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            throw e17.j();
        }
    }

    /* renamed from: parseWithIOException */
    public static <M extends com.p176xb6135e39.p283xc50a8b8b.k8> M m20765x10e48a10(com.p176xb6135e39.p283xc50a8b8b.e9 e9Var, java.io.InputStream inputStream) {
        try {
            return (M) e9Var.mo20638x92b714fd(inputStream);
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            throw e17.j();
        }
    }

    /* renamed from: serializeBooleanMapTo */
    public static <V> void m20767x5e6e30af(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var, com.p176xb6135e39.p283xc50a8b8b.d8 d8Var, com.p176xb6135e39.p283xc50a8b8b.t7 t7Var, int i17) {
        java.util.Map e17 = d8Var.e();
        k0Var.getClass();
        e(k0Var, e17, t7Var, i17);
    }

    /* renamed from: serializeIntegerMapTo */
    public static <V> void m20768x6123d959(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var, com.p176xb6135e39.p283xc50a8b8b.d8 d8Var, com.p176xb6135e39.p283xc50a8b8b.t7 t7Var, int i17) {
        java.util.Map e17 = d8Var.e();
        k0Var.getClass();
        e(k0Var, e17, t7Var, i17);
    }

    /* renamed from: serializeLongMapTo */
    public static <V> void m20769x9eb334db(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var, com.p176xb6135e39.p283xc50a8b8b.d8 d8Var, com.p176xb6135e39.p283xc50a8b8b.t7 t7Var, int i17) {
        java.util.Map e17 = d8Var.e();
        k0Var.getClass();
        e(k0Var, e17, t7Var, i17);
    }

    /* renamed from: serializeStringMapTo */
    public static <V> void m20770x91411066(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var, com.p176xb6135e39.p283xc50a8b8b.d8 d8Var, com.p176xb6135e39.p283xc50a8b8b.t7 t7Var, int i17) {
        java.util.Map e17 = d8Var.e();
        k0Var.getClass();
        e(k0Var, e17, t7Var, i17);
    }

    /* renamed from: setAlwaysUseFieldBuildersForTesting */
    public static void m20771x3332f263(boolean z17) {
        f7872x2df6253a = z17;
    }

    /* renamed from: writeString */
    public static void m20772x542d00d0(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var, int i17, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            k0Var.O(i17, (java.lang.String) obj);
        } else {
            k0Var.z(i17, (com.p176xb6135e39.p283xc50a8b8b.y) obj);
        }
    }

    /* renamed from: writeStringNoTag */
    public static void m20773xa761e729(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            k0Var.P((java.lang.String) obj);
        } else {
            k0Var.A((com.p176xb6135e39.p283xc50a8b8b.y) obj);
        }
    }

    public final java.util.Map d(boolean z17) {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.util.List n17 = mo20595xa6ad8e26().f126773a.n();
        int i17 = 0;
        while (i17 < n17.size()) {
            com.p176xb6135e39.p283xc50a8b8b.b4 b4Var = (com.p176xb6135e39.p283xc50a8b8b.b4) n17.get(i17);
            com.p176xb6135e39.p283xc50a8b8b.g4 g4Var = b4Var.f126450p;
            if (g4Var != null) {
                i17 += g4Var.f126665i - 1;
                if (m20779x780c843(g4Var)) {
                    b4Var = m20776xe5a82802(g4Var);
                    if (z17 || b4Var.f126447m.f126392d != com.p176xb6135e39.p283xc50a8b8b.z3.STRING) {
                        treeMap.put(b4Var, mo20728x746c4744(b4Var));
                    } else {
                        treeMap.put(b4Var, m20775x447a8244(b4Var));
                    }
                    i17++;
                } else {
                    i17++;
                }
            } else {
                if (b4Var.d1()) {
                    java.util.List list = (java.util.List) mo20728x746c4744(b4Var);
                    if (!list.isEmpty()) {
                        treeMap.put(b4Var, list);
                    }
                } else {
                    if (!mo20729x6ffae80(b4Var)) {
                    }
                    if (z17) {
                    }
                    treeMap.put(b4Var, mo20728x746c4744(b4Var));
                }
                i17++;
            }
        }
        return treeMap;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getAllFields */
    public java.util.Map<com.p176xb6135e39.p283xc50a8b8b.b4, java.lang.Object> mo20727xcee5d904() {
        return java.util.Collections.unmodifiableMap(d(false));
    }

    /* renamed from: getAllFieldsRaw */
    public java.util.Map<com.p176xb6135e39.p283xc50a8b8b.b4, java.lang.Object> mo20774xeda29884() {
        return java.util.Collections.unmodifiableMap(d(true));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return mo20595xa6ad8e26().f126773a;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getField */
    public java.lang.Object mo20728x746c4744(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        return com.p176xb6135e39.p283xc50a8b8b.j6.b(mo20595xa6ad8e26(), b4Var).m(this);
    }

    /* renamed from: getFieldRaw */
    public java.lang.Object m20775x447a8244(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        return com.p176xb6135e39.p283xc50a8b8b.j6.b(mo20595xa6ad8e26(), b4Var).a(this);
    }

    /* renamed from: getOneofFieldDescriptor */
    public com.p176xb6135e39.p283xc50a8b8b.b4 m20776xe5a82802(com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        com.p176xb6135e39.p283xc50a8b8b.x5 a17 = com.p176xb6135e39.p283xc50a8b8b.j6.a(mo20595xa6ad8e26(), g4Var);
        com.p176xb6135e39.p283xc50a8b8b.b4 b4Var = a17.f127216e;
        if (b4Var != null) {
            if (!mo20729x6ffae80(b4Var)) {
                b4Var = null;
            }
            return b4Var;
        }
        int mo20656x276ffe3f = ((com.p176xb6135e39.p283xc50a8b8b.p6) m20739xbf185b60(a17.f127213b, this, new java.lang.Object[0])).mo20656x276ffe3f();
        if (mo20656x276ffe3f > 0) {
            return a17.f127212a.m(mo20656x276ffe3f);
        }
        return null;
    }

    /* renamed from: getRepeatedField */
    public java.lang.Object mo20777x4f52c9ea(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17) {
        return com.p176xb6135e39.p283xc50a8b8b.j6.b(mo20595xa6ad8e26(), b4Var).o(this, i17);
    }

    /* renamed from: getRepeatedFieldCount */
    public int mo20778x5353945(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        return com.p176xb6135e39.p283xc50a8b8b.j6.b(mo20595xa6ad8e26(), b4Var).b(this);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        java.util.Map<com.p176xb6135e39.p283xc50a8b8b.b4, java.lang.Object> mo20774xeda29884 = mo20774xeda29884();
        boolean z17 = mo20560x84bb647e().r().f126759f;
        int i18 = 0;
        for (java.util.Map.Entry<com.p176xb6135e39.p283xc50a8b8b.b4, java.lang.Object> entry : mo20774xeda29884.entrySet()) {
            com.p176xb6135e39.p283xc50a8b8b.b4 key = entry.getKey();
            java.lang.Object value = entry.getValue();
            i18 += (z17 && key.o() && key.f126447m == com.p176xb6135e39.p283xc50a8b8b.a4.f126388g && !key.d1()) ? (com.p176xb6135e39.p283xc50a8b8b.k0.p(1) * 2) + com.p176xb6135e39.p283xc50a8b8b.k0.q(2, key.f126442e.f127096f) + com.p176xb6135e39.p283xc50a8b8b.k0.n(3, (com.p176xb6135e39.p283xc50a8b8b.k8) value) : com.p176xb6135e39.p283xc50a8b8b.b5.h(key, value);
        }
        com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed = mo20594xc6bf3ed();
        int a17 = i18 + (z17 ? mo20594xc6bf3ed.a() : mo20594xc6bf3ed.mo20593x9d9c349b());
        this.f7867xd4e4d8eb = a17;
        return a17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: hasField */
    public boolean mo20729x6ffae80(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        return com.p176xb6135e39.p283xc50a8b8b.j6.b(mo20595xa6ad8e26(), b4Var).e(this);
    }

    /* renamed from: hasOneof */
    public boolean m20779x780c843(com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        com.p176xb6135e39.p283xc50a8b8b.x5 a17 = com.p176xb6135e39.p283xc50a8b8b.j6.a(mo20595xa6ad8e26(), g4Var);
        com.p176xb6135e39.p283xc50a8b8b.b4 b4Var = a17.f127216e;
        if (b4Var != null) {
            return mo20729x6ffae80(b4Var);
        }
        return ((com.p176xb6135e39.p283xc50a8b8b.p6) m20739xbf185b60(a17.f127213b, this, new java.lang.Object[0])).mo20656x276ffe3f() != 0;
    }

    /* renamed from: internalGetFieldAccessorTable */
    public abstract com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26();

    /* renamed from: internalGetMapField */
    public com.p176xb6135e39.p283xc50a8b8b.d8 mo20780xf53a7b77(int i17) {
        java.lang.String name = getClass().getName();
        throw new java.lang.RuntimeException(name.length() != 0 ? "No map fields found in ".concat(name) : new java.lang.String("No map fields found in "));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public boolean mo20562xf582434a() {
        for (com.p176xb6135e39.p283xc50a8b8b.b4 b4Var : mo20560x84bb647e().n()) {
            if (b4Var.s() && !mo20729x6ffae80(b4Var)) {
                return false;
            }
            if (b4Var.f126447m.f126392d == com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE) {
                if (b4Var.d1()) {
                    java.util.Iterator it = ((java.util.List) mo20728x746c4744(b4Var)).iterator();
                    while (it.hasNext()) {
                        if (!((com.p176xb6135e39.p283xc50a8b8b.k8) it.next()).mo20562xf582434a()) {
                            return false;
                        }
                    }
                } else if (mo20729x6ffae80(b4Var) && !((com.p176xb6135e39.p283xc50a8b8b.k8) mo20728x746c4744(b4Var)).mo20562xf582434a()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: makeExtensionsImmutable */
    public void mo20781x1ff81300() {
    }

    /* renamed from: mergeFromAndMakeImmutableInternal */
    public void m20782x5c09fa9c(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.h9 h9Var = com.p176xb6135e39.p283xc50a8b8b.h9.f126699c;
        h9Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.q9 a17 = h9Var.a(getClass());
        try {
            com.p176xb6135e39.p283xc50a8b8b.e0 e0Var = d0Var.f126527d;
            if (e0Var == null) {
                e0Var = new com.p176xb6135e39.p283xc50a8b8b.e0(d0Var);
            }
            a17.h(this, e0Var, t4Var);
            a17.e(this);
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            e17.f127272d = this;
            throw e17;
        } catch (java.io.IOException e18) {
            com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
            y6Var.f127272d = this;
            throw y6Var;
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20588xab31548(com.p176xb6135e39.p283xc50a8b8b.b bVar) {
        return mo20597xab31548((com.p176xb6135e39.p283xc50a8b8b.r5) new com.p176xb6135e39.p283xc50a8b8b.o5(this, bVar));
    }

    /* renamed from: newBuilderForType */
    public abstract com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var);

    /* renamed from: newInstance */
    public abstract java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var);

    /* renamed from: parseUnknownField */
    public boolean mo20783x10621d23(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.sa saVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, int i17) {
        d0Var.getClass();
        return saVar.e(i17, d0Var);
    }

    /* renamed from: parseUnknownFieldProto3 */
    public boolean mo20784x9e10d64e(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.sa saVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, int i17) {
        return mo20783x10621d23(d0Var, saVar, t4Var, i17);
    }

    /* renamed from: writeReplace */
    public java.lang.Object m20785xe2d929d5() {
        return new com.p176xb6135e39.p283xc50a8b8b.m5(this);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        java.util.Map<com.p176xb6135e39.p283xc50a8b8b.b4, java.lang.Object> mo20774xeda29884 = mo20774xeda29884();
        boolean z17 = mo20560x84bb647e().r().f126759f;
        for (java.util.Map.Entry<com.p176xb6135e39.p283xc50a8b8b.b4, java.lang.Object> entry : mo20774xeda29884.entrySet()) {
            com.p176xb6135e39.p283xc50a8b8b.b4 key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (z17 && key.o() && key.f126447m == com.p176xb6135e39.p283xc50a8b8b.a4.f126388g && !key.d1()) {
                k0Var.M(key.f126442e.f127096f, (com.p176xb6135e39.p283xc50a8b8b.k8) value);
            } else {
                com.p176xb6135e39.p283xc50a8b8b.b5.y(key, value, k0Var);
            }
        }
        com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed = mo20594xc6bf3ed();
        if (z17) {
            mo20594xc6bf3ed.c(k0Var);
        } else {
            mo20594xc6bf3ed.mo20600x5f8be6ba(k0Var);
        }
    }

    /* renamed from: parseDelimitedWithIOException */
    public static <M extends com.p176xb6135e39.p283xc50a8b8b.k8> M m20762xfaac9fdd(com.p176xb6135e39.p283xc50a8b8b.e9 e9Var, java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        try {
            return (M) e9Var.mo20633x4a829d50(inputStream, t4Var);
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            throw e17.j();
        }
    }

    /* renamed from: parseWithIOException */
    public static <M extends com.p176xb6135e39.p283xc50a8b8b.k8> M m20766x10e48a10(com.p176xb6135e39.p283xc50a8b8b.e9 e9Var, java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        try {
            return (M) e9Var.mo20639x92b714fd(inputStream, t4Var);
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            throw e17.j();
        }
    }

    public l6(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        this.f7874x4f0c37a3 = q5Var.mo20594xc6bf3ed();
    }

    /* renamed from: mutableCopy */
    public static com.p176xb6135e39.p283xc50a8b8b.u6 m20755x946297bb(com.p176xb6135e39.p283xc50a8b8b.u6 u6Var) {
        int i17 = ((com.p176xb6135e39.p283xc50a8b8b.l7) u6Var).f126834f;
        return ((com.p176xb6135e39.p283xc50a8b8b.l7) u6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    /* renamed from: parseWithIOException */
    public static <M extends com.p176xb6135e39.p283xc50a8b8b.k8> M m20763x10e48a10(com.p176xb6135e39.p283xc50a8b8b.e9 e9Var, com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        try {
            return (M) e9Var.mo20634x92b714fd(d0Var);
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            throw e17.j();
        }
    }

    /* renamed from: mutableCopy */
    public static com.p176xb6135e39.p283xc50a8b8b.s6 m20753x946297bb(com.p176xb6135e39.p283xc50a8b8b.s6 s6Var) {
        int i17 = ((com.p176xb6135e39.p283xc50a8b8b.e5) s6Var).f126593f;
        return ((com.p176xb6135e39.p283xc50a8b8b.e5) s6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    /* renamed from: parseWithIOException */
    public static <M extends com.p176xb6135e39.p283xc50a8b8b.k8> M m20764x10e48a10(com.p176xb6135e39.p283xc50a8b8b.e9 e9Var, com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        try {
            return (M) e9Var.mo20635x92b714fd(d0Var, t4Var);
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            throw e17.j();
        }
    }

    /* renamed from: mutableCopy */
    public static com.p176xb6135e39.p283xc50a8b8b.o6 m20752x946297bb(com.p176xb6135e39.p283xc50a8b8b.o6 o6Var) {
        int i17 = ((com.p176xb6135e39.p283xc50a8b8b.j4) o6Var).f126767f;
        return ((com.p176xb6135e39.p283xc50a8b8b.j4) o6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    /* renamed from: mutableCopy */
    public static com.p176xb6135e39.p283xc50a8b8b.n6 m20751x946297bb(com.p176xb6135e39.p283xc50a8b8b.n6 n6Var) {
        int i17 = ((com.p176xb6135e39.p283xc50a8b8b.o) n6Var).f126876f;
        return ((com.p176xb6135e39.p283xc50a8b8b.o) n6Var).F(i17 == 0 ? 10 : i17 * 2);
    }
}
