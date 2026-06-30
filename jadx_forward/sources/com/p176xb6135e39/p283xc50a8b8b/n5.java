package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class n5 extends com.p176xb6135e39.p283xc50a8b8b.f {

    /* renamed from: defaultInstanceMap */
    private static java.util.Map<java.lang.Object, com.p176xb6135e39.p283xc50a8b8b.n5> f7875xc484e386 = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: unknownFields */
    protected com.p176xb6135e39.p283xc50a8b8b.xa f7877x4f0c37a3 = com.p176xb6135e39.p283xc50a8b8b.xa.f127239f;

    /* renamed from: memoizedSerializedSize */
    protected int f7876xa868c40f = -1;

    /* renamed from: access$000 */
    public static com.p176xb6135e39.p283xc50a8b8b.k5 m20795xbbd77af0(com.p176xb6135e39.p283xc50a8b8b.n4 n4Var) {
        n4Var.getClass();
        return (com.p176xb6135e39.p283xc50a8b8b.k5) n4Var;
    }

    public static com.p176xb6135e39.p283xc50a8b8b.n5 b(com.p176xb6135e39.p283xc50a8b8b.n5 n5Var) {
        if (n5Var == null || n5Var.mo20562xf582434a()) {
            return n5Var;
        }
        com.p176xb6135e39.p283xc50a8b8b.pa mo20589xb3590f03 = n5Var.mo20589xb3590f03();
        mo20589xb3590f03.getClass();
        com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(mo20589xb3590f03.getMessage());
        y6Var.f127272d = n5Var;
        throw y6Var;
    }

    public static com.p176xb6135e39.p283xc50a8b8b.n5 c(com.p176xb6135e39.p283xc50a8b8b.n5 n5Var, java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            com.p176xb6135e39.p283xc50a8b8b.d0 g17 = com.p176xb6135e39.p283xc50a8b8b.d0.g(new com.p176xb6135e39.p283xc50a8b8b.d(inputStream, com.p176xb6135e39.p283xc50a8b8b.d0.y(read, inputStream)));
            com.p176xb6135e39.p283xc50a8b8b.n5 m20828xc7f9c18 = m20828xc7f9c18(n5Var, g17, t4Var);
            try {
                g17.a(0);
                return m20828xc7f9c18;
            } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                e17.f127272d = m20828xc7f9c18;
                throw e17;
            }
        } catch (java.io.IOException e18) {
            throw new com.p176xb6135e39.p283xc50a8b8b.y6(e18.getMessage());
        }
    }

    /* renamed from: emptyBooleanList */
    public static com.p176xb6135e39.p283xc50a8b8b.n6 m20796xbe5dfd59() {
        return com.p176xb6135e39.p283xc50a8b8b.o.f126874g;
    }

    /* renamed from: emptyDoubleList */
    public static com.p176xb6135e39.p283xc50a8b8b.o6 m20797x7a23353c() {
        return com.p176xb6135e39.p283xc50a8b8b.j4.f126765g;
    }

    /* renamed from: emptyFloatList */
    public static com.p176xb6135e39.p283xc50a8b8b.s6 m20798xefeffa4d() {
        return com.p176xb6135e39.p283xc50a8b8b.e5.f126591g;
    }

    /* renamed from: emptyIntList */
    public static com.p176xb6135e39.p283xc50a8b8b.t6 m20799x6eeb1f20() {
        return com.p176xb6135e39.p283xc50a8b8b.m6.f126860g;
    }

    /* renamed from: emptyLongList */
    public static com.p176xb6135e39.p283xc50a8b8b.u6 m20800xd23499a7() {
        return com.p176xb6135e39.p283xc50a8b8b.l7.f126832g;
    }

    /* renamed from: emptyProtobufList */
    public static <E> com.p176xb6135e39.p283xc50a8b8b.v6 m20801x2aef40b6() {
        return com.p176xb6135e39.p283xc50a8b8b.i9.f126731g;
    }

    /* renamed from: getDefaultInstance */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m20802x7c90cfc0(java.lang.Class<T> cls) {
        com.p176xb6135e39.p283xc50a8b8b.n5 n5Var = f7875xc484e386.get(cls);
        if (n5Var == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                n5Var = f7875xc484e386.get(cls);
            } catch (java.lang.ClassNotFoundException e17) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e17);
            }
        }
        if (n5Var == null) {
            n5Var = (T) ((com.p176xb6135e39.p283xc50a8b8b.n5) com.p176xb6135e39.p283xc50a8b8b.ib.a(cls)).mo20559x786693c3();
            if (n5Var == null) {
                throw new java.lang.IllegalStateException();
            }
            f7875xc484e386.put(cls, n5Var);
        }
        return (T) n5Var;
    }

    /* renamed from: getMethodOrDie */
    static java.lang.reflect.Method m20803xa1b2fa06(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: invokeOrDie */
    public static java.lang.Object m20804x38abe605(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
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

    /* renamed from: mutableCopy */
    public static com.p176xb6135e39.p283xc50a8b8b.t6 m20809x946297bb(com.p176xb6135e39.p283xc50a8b8b.t6 t6Var) {
        int i17 = ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).f126862f;
        return ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    /* renamed from: newMessageInfo */
    public static java.lang.Object m20812xe9ec3795(com.p176xb6135e39.p283xc50a8b8b.o8 o8Var, java.lang.String str, java.lang.Object[] objArr) {
        return new com.p176xb6135e39.p283xc50a8b8b.k9(o8Var, str, objArr);
    }

    /* renamed from: newRepeatedGeneratedExtension */
    public static <ContainingType extends com.p176xb6135e39.p283xc50a8b8b.o8, Type> com.p176xb6135e39.p283xc50a8b8b.k5 m20813xba43424a(ContainingType containingtype, com.p176xb6135e39.p283xc50a8b8b.o8 o8Var, com.p176xb6135e39.p283xc50a8b8b.q6 q6Var, int i17, com.p176xb6135e39.p283xc50a8b8b.ub ubVar, boolean z17, java.lang.Class cls) {
        return new com.p176xb6135e39.p283xc50a8b8b.k5(containingtype, java.util.Collections.emptyList(), o8Var, new com.p176xb6135e39.p283xc50a8b8b.j5(q6Var, i17, ubVar, true, z17), cls);
    }

    /* renamed from: newSingularGeneratedExtension */
    public static <ContainingType extends com.p176xb6135e39.p283xc50a8b8b.o8, Type> com.p176xb6135e39.p283xc50a8b8b.k5 m20814x27b2c5a7(ContainingType containingtype, Type type, com.p176xb6135e39.p283xc50a8b8b.o8 o8Var, com.p176xb6135e39.p283xc50a8b8b.q6 q6Var, int i17, com.p176xb6135e39.p283xc50a8b8b.ub ubVar, java.lang.Class cls) {
        return new com.p176xb6135e39.p283xc50a8b8b.k5(containingtype, type, o8Var, new com.p176xb6135e39.p283xc50a8b8b.j5(q6Var, i17, ubVar, false, false), cls);
    }

    /* renamed from: parseDelimitedFrom */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m20815x4a829d50(T t17, java.io.InputStream inputStream) {
        T t18 = (T) c(t17, inputStream, com.p176xb6135e39.p283xc50a8b8b.t4.a());
        b(t18);
        return t18;
    }

    /* renamed from: parseFrom */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m20824x92b714fd(T t17, java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        T t18 = (T) m20818x92b714fd(t17, com.p176xb6135e39.p283xc50a8b8b.d0.h(byteBuffer, false), t4Var);
        b(t18);
        return t18;
    }

    /* renamed from: parsePartialFrom */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m20828xc7f9c18(T t17, com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        T t18 = (T) t17.m20834x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5.NEW_MUTABLE_INSTANCE);
        try {
            com.p176xb6135e39.p283xc50a8b8b.h9 h9Var = com.p176xb6135e39.p283xc50a8b8b.h9.f126699c;
            h9Var.getClass();
            com.p176xb6135e39.p283xc50a8b8b.q9 a17 = h9Var.a(t18.getClass());
            com.p176xb6135e39.p283xc50a8b8b.e0 e0Var = d0Var.f126527d;
            if (e0Var == null) {
                e0Var = new com.p176xb6135e39.p283xc50a8b8b.e0(d0Var);
            }
            a17.h(t18, e0Var, t4Var);
            a17.e(t18);
            return t18;
        } catch (java.io.IOException e17) {
            if (e17.getCause() instanceof com.p176xb6135e39.p283xc50a8b8b.y6) {
                throw ((com.p176xb6135e39.p283xc50a8b8b.y6) e17.getCause());
            }
            com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e17.getMessage());
            y6Var.f127272d = t18;
            throw y6Var;
        } catch (java.lang.RuntimeException e18) {
            if (e18.getCause() instanceof com.p176xb6135e39.p283xc50a8b8b.y6) {
                throw ((com.p176xb6135e39.p283xc50a8b8b.y6) e18.getCause());
            }
            throw e18;
        }
    }

    /* renamed from: registerDefaultInstance */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> void m20830x48240cd3(java.lang.Class<T> cls, T t17) {
        f7875xc484e386.put(cls, t17);
    }

    /* renamed from: buildMessageInfo */
    public java.lang.Object m20831xdf1bae07() {
        return m20834x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5.BUILD_MESSAGE_INFO);
    }

    /* renamed from: createBuilder */
    public final <MessageType extends com.p176xb6135e39.p283xc50a8b8b.n5, BuilderType extends com.p176xb6135e39.p283xc50a8b8b.h5> BuilderType m20832x93ab12ff() {
        return (BuilderType) m20834x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5.NEW_BUILDER);
    }

    /* renamed from: dynamicMethod */
    public java.lang.Object m20835x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5 l5Var, java.lang.Object obj) {
        return mo20836x12f0b200(l5Var, obj, null);
    }

    /* renamed from: dynamicMethod */
    public abstract java.lang.Object mo20836x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5 l5Var, java.lang.Object obj, java.lang.Object obj2);

    /* renamed from: equals */
    public boolean m20837xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.p176xb6135e39.p283xc50a8b8b.h9 h9Var = com.p176xb6135e39.p283xc50a8b8b.h9.f126699c;
        h9Var.getClass();
        return h9Var.a(getClass()).mo20886xb2c87fbf(this, (com.p176xb6135e39.p283xc50a8b8b.n5) obj);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f
    /* renamed from: getMemoizedSerializedSize */
    public int mo20586x12373b05() {
        return this.f7876xa868c40f;
    }

    /* renamed from: getParserForType */
    public final com.p176xb6135e39.p283xc50a8b8b.e9 m20838x7ea0ace() {
        return (com.p176xb6135e39.p283xc50a8b8b.e9) m20834x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5.GET_PARSER);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        if (this.f7876xa868c40f == -1) {
            com.p176xb6135e39.p283xc50a8b8b.h9 h9Var = com.p176xb6135e39.p283xc50a8b8b.h9.f126699c;
            h9Var.getClass();
            this.f7876xa868c40f = h9Var.a(getClass()).f(this);
        }
        return this.f7876xa868c40f;
    }

    /* renamed from: hashCode */
    public int m20839x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        com.p176xb6135e39.p283xc50a8b8b.h9 h9Var = com.p176xb6135e39.p283xc50a8b8b.h9.f126699c;
        h9Var.getClass();
        int mo20887x8cdac1b = h9Var.a(getClass()).mo20887x8cdac1b(this);
        this.f7868x8a222005 = mo20887x8cdac1b;
        return mo20887x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        return m20805xf582434a(this, true);
    }

    /* renamed from: makeImmutable */
    public void m20840xeb4bff34() {
        com.p176xb6135e39.p283xc50a8b8b.h9 h9Var = com.p176xb6135e39.p283xc50a8b8b.h9.f126699c;
        h9Var.getClass();
        h9Var.a(getClass()).e(this);
    }

    /* renamed from: mergeLengthDelimitedField */
    public void m20841x3e31a75f(int i17, com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        if (this.f7877x4f0c37a3 == com.p176xb6135e39.p283xc50a8b8b.xa.f127239f) {
            this.f7877x4f0c37a3 = new com.p176xb6135e39.p283xc50a8b8b.xa();
        }
        com.p176xb6135e39.p283xc50a8b8b.xa xaVar = this.f7877x4f0c37a3;
        if (!xaVar.f127244e) {
            throw new java.lang.UnsupportedOperationException();
        }
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        xaVar.d((i17 << 3) | 2, yVar);
    }

    /* renamed from: mergeUnknownFields */
    public final void m20842xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.xa xaVar) {
        this.f7877x4f0c37a3 = com.p176xb6135e39.p283xc50a8b8b.xa.c(this.f7877x4f0c37a3, xaVar);
    }

    /* renamed from: mergeVarintField */
    public void m20843xcea6171a(int i17, int i18) {
        if (this.f7877x4f0c37a3 == com.p176xb6135e39.p283xc50a8b8b.xa.f127239f) {
            this.f7877x4f0c37a3 = new com.p176xb6135e39.p283xc50a8b8b.xa();
        }
        com.p176xb6135e39.p283xc50a8b8b.xa xaVar = this.f7877x4f0c37a3;
        if (!xaVar.f127244e) {
            throw new java.lang.UnsupportedOperationException();
        }
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        xaVar.d((i17 << 3) | 0, java.lang.Long.valueOf(i18));
    }

    /* renamed from: parseUnknownField */
    public boolean m20844x10621d23(int i17, com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        if ((i17 & 7) == 4) {
            return false;
        }
        if (this.f7877x4f0c37a3 == com.p176xb6135e39.p283xc50a8b8b.xa.f127239f) {
            this.f7877x4f0c37a3 = new com.p176xb6135e39.p283xc50a8b8b.xa();
        }
        return this.f7877x4f0c37a3.b(i17, d0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f
    /* renamed from: setMemoizedSerializedSize */
    public void mo20590x447ad711(int i17) {
        this.f7876xa868c40f = i17;
    }

    /* renamed from: toString */
    public java.lang.String m20845x9616526c() {
        java.lang.String obj = super.toString();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("# ");
        sb6.append(obj);
        com.p176xb6135e39.p283xc50a8b8b.q8.c(this, sb6, 0);
        return sb6.toString();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        com.p176xb6135e39.p283xc50a8b8b.h9 h9Var = com.p176xb6135e39.p283xc50a8b8b.h9.f126699c;
        h9Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.q9 a17 = h9Var.a(getClass());
        com.p176xb6135e39.p283xc50a8b8b.l0 l0Var = k0Var.f126781a;
        if (l0Var == null) {
            l0Var = new com.p176xb6135e39.p283xc50a8b8b.l0(k0Var);
        }
        a17.b(this, l0Var);
    }

    /* renamed from: isInitialized */
    public static final <T extends com.p176xb6135e39.p283xc50a8b8b.n5> boolean m20805xf582434a(T t17, boolean z17) {
        byte byteValue = ((java.lang.Byte) t17.m20834x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        com.p176xb6135e39.p283xc50a8b8b.h9 h9Var = com.p176xb6135e39.p283xc50a8b8b.h9.f126699c;
        h9Var.getClass();
        boolean c17 = h9Var.a(t17.getClass()).c(t17);
        if (z17) {
            t17.m20835x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5.SET_MEMOIZED_IS_INITIALIZED, c17 ? t17 : null);
        }
        return c17;
    }

    /* renamed from: createBuilder */
    public final <MessageType extends com.p176xb6135e39.p283xc50a8b8b.n5, BuilderType extends com.p176xb6135e39.p283xc50a8b8b.h5> BuilderType m20833x93ab12ff(MessageType messagetype) {
        return (BuilderType) m20832x93ab12ff().m20703x60f45402((com.p176xb6135e39.p283xc50a8b8b.n5) messagetype);
    }

    /* renamed from: dynamicMethod */
    public java.lang.Object m20834x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5 l5Var) {
        return mo20836x12f0b200(l5Var, null, null);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public final com.p176xb6135e39.p283xc50a8b8b.n5 mo20559x786693c3() {
        return (com.p176xb6135e39.p283xc50a8b8b.n5) m20834x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5.GET_DEFAULT_INSTANCE);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public final com.p176xb6135e39.p283xc50a8b8b.h5 mo20596xab31548() {
        return (com.p176xb6135e39.p283xc50a8b8b.h5) m20834x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5.NEW_BUILDER);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public final com.p176xb6135e39.p283xc50a8b8b.h5 mo20599xaaa148a0() {
        com.p176xb6135e39.p283xc50a8b8b.h5 h5Var = (com.p176xb6135e39.p283xc50a8b8b.h5) m20834x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5.NEW_BUILDER);
        h5Var.m20703x60f45402(this);
        return h5Var;
    }

    /* renamed from: mutableCopy */
    public static com.p176xb6135e39.p283xc50a8b8b.u6 m20810x946297bb(com.p176xb6135e39.p283xc50a8b8b.u6 u6Var) {
        int i17 = ((com.p176xb6135e39.p283xc50a8b8b.l7) u6Var).f126834f;
        return ((com.p176xb6135e39.p283xc50a8b8b.l7) u6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    /* renamed from: parseDelimitedFrom */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m20816x4a829d50(T t17, java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        T t18 = (T) c(t17, inputStream, t4Var);
        b(t18);
        return t18;
    }

    /* renamed from: parseFrom */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m20823x92b714fd(T t17, java.nio.ByteBuffer byteBuffer) {
        return (T) m20824x92b714fd(t17, byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4.a());
    }

    /* renamed from: parseFrom */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m20819x92b714fd(T t17, com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        T t18 = (T) m20820x92b714fd(t17, yVar, com.p176xb6135e39.p283xc50a8b8b.t4.a());
        b(t18);
        return t18;
    }

    /* renamed from: mutableCopy */
    public static com.p176xb6135e39.p283xc50a8b8b.s6 m20808x946297bb(com.p176xb6135e39.p283xc50a8b8b.s6 s6Var) {
        int i17 = ((com.p176xb6135e39.p283xc50a8b8b.e5) s6Var).f126593f;
        return ((com.p176xb6135e39.p283xc50a8b8b.e5) s6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    /* renamed from: parseFrom */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m20820x92b714fd(T t17, com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.d0 m17 = yVar.m();
        T t18 = (T) m20828xc7f9c18(t17, m17, t4Var);
        try {
            m17.a(0);
            b(t18);
            return t18;
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            e17.f127272d = t18;
            throw e17;
        }
    }

    /* renamed from: mutableCopy */
    public static com.p176xb6135e39.p283xc50a8b8b.o6 m20807x946297bb(com.p176xb6135e39.p283xc50a8b8b.o6 o6Var) {
        int i17 = ((com.p176xb6135e39.p283xc50a8b8b.j4) o6Var).f126767f;
        return ((com.p176xb6135e39.p283xc50a8b8b.j4) o6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    /* renamed from: mutableCopy */
    public static com.p176xb6135e39.p283xc50a8b8b.n6 m20806x946297bb(com.p176xb6135e39.p283xc50a8b8b.n6 n6Var) {
        int i17 = ((com.p176xb6135e39.p283xc50a8b8b.o) n6Var).f126876f;
        return ((com.p176xb6135e39.p283xc50a8b8b.o) n6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    /* renamed from: parseFrom */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m20825x92b714fd(T t17, byte[] bArr) {
        T t18 = (T) m20829xc7f9c18(t17, bArr, 0, bArr.length, com.p176xb6135e39.p283xc50a8b8b.t4.a());
        b(t18);
        return t18;
    }

    /* renamed from: mutableCopy */
    public static <E> com.p176xb6135e39.p283xc50a8b8b.v6 m20811x946297bb(com.p176xb6135e39.p283xc50a8b8b.v6 v6Var) {
        int size = v6Var.size();
        return v6Var.F(size == 0 ? 10 : size * 2);
    }

    /* renamed from: parseFrom */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m20826x92b714fd(T t17, byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        T t18 = (T) m20829xc7f9c18(t17, bArr, 0, bArr.length, t4Var);
        b(t18);
        return t18;
    }

    /* renamed from: parsePartialFrom */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m20829xc7f9c18(T t17, byte[] bArr, int i17, int i18, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        T t18 = (T) t17.m20834x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5.NEW_MUTABLE_INSTANCE);
        try {
            com.p176xb6135e39.p283xc50a8b8b.h9 h9Var = com.p176xb6135e39.p283xc50a8b8b.h9.f126699c;
            h9Var.getClass();
            com.p176xb6135e39.p283xc50a8b8b.q9 a17 = h9Var.a(t18.getClass());
            a17.d(t18, bArr, i17, i17 + i18, new com.p176xb6135e39.p283xc50a8b8b.j(t4Var));
            a17.e(t18);
            if (t18.f7868x8a222005 == 0) {
                return t18;
            }
            throw new java.lang.RuntimeException();
        } catch (java.io.IOException e17) {
            if (e17.getCause() instanceof com.p176xb6135e39.p283xc50a8b8b.y6) {
                throw ((com.p176xb6135e39.p283xc50a8b8b.y6) e17.getCause());
            }
            com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e17.getMessage());
            y6Var.f127272d = t18;
            throw y6Var;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            com.p176xb6135e39.p283xc50a8b8b.y6 i19 = com.p176xb6135e39.p283xc50a8b8b.y6.i();
            i19.f127272d = t18;
            throw i19;
        }
    }

    /* renamed from: parseFrom */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m20821x92b714fd(T t17, java.io.InputStream inputStream) {
        T t18 = (T) m20828xc7f9c18(t17, com.p176xb6135e39.p283xc50a8b8b.d0.g(inputStream), com.p176xb6135e39.p283xc50a8b8b.t4.a());
        b(t18);
        return t18;
    }

    /* renamed from: parseFrom */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m20822x92b714fd(T t17, java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        T t18 = (T) m20828xc7f9c18(t17, com.p176xb6135e39.p283xc50a8b8b.d0.g(inputStream), t4Var);
        b(t18);
        return t18;
    }

    /* renamed from: parseFrom */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m20817x92b714fd(T t17, com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (T) m20818x92b714fd(t17, d0Var, com.p176xb6135e39.p283xc50a8b8b.t4.a());
    }

    /* renamed from: parseFrom */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m20818x92b714fd(T t17, com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        T t18 = (T) m20828xc7f9c18(t17, d0Var, t4Var);
        b(t18);
        return t18;
    }

    /* renamed from: parsePartialFrom */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m20827xc7f9c18(T t17, com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (T) m20828xc7f9c18(t17, d0Var, com.p176xb6135e39.p283xc50a8b8b.t4.a());
    }
}
