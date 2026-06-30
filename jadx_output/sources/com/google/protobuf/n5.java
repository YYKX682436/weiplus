package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class n5 extends com.google.protobuf.f {
    private static java.util.Map<java.lang.Object, com.google.protobuf.n5> defaultInstanceMap = new java.util.concurrent.ConcurrentHashMap();
    protected com.google.protobuf.xa unknownFields = com.google.protobuf.xa.f45706f;
    protected int memoizedSerializedSize = -1;

    public static com.google.protobuf.k5 access$000(com.google.protobuf.n4 n4Var) {
        n4Var.getClass();
        return (com.google.protobuf.k5) n4Var;
    }

    public static com.google.protobuf.n5 b(com.google.protobuf.n5 n5Var) {
        if (n5Var == null || n5Var.isInitialized()) {
            return n5Var;
        }
        com.google.protobuf.pa newUninitializedMessageException = n5Var.newUninitializedMessageException();
        newUninitializedMessageException.getClass();
        com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(newUninitializedMessageException.getMessage());
        y6Var.f45739d = n5Var;
        throw y6Var;
    }

    public static com.google.protobuf.n5 c(com.google.protobuf.n5 n5Var, java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            com.google.protobuf.d0 g17 = com.google.protobuf.d0.g(new com.google.protobuf.d(inputStream, com.google.protobuf.d0.y(read, inputStream)));
            com.google.protobuf.n5 parsePartialFrom = parsePartialFrom(n5Var, g17, t4Var);
            try {
                g17.a(0);
                return parsePartialFrom;
            } catch (com.google.protobuf.y6 e17) {
                e17.f45739d = parsePartialFrom;
                throw e17;
            }
        } catch (java.io.IOException e18) {
            throw new com.google.protobuf.y6(e18.getMessage());
        }
    }

    public static com.google.protobuf.n6 emptyBooleanList() {
        return com.google.protobuf.o.f45341g;
    }

    public static com.google.protobuf.o6 emptyDoubleList() {
        return com.google.protobuf.j4.f45232g;
    }

    public static com.google.protobuf.s6 emptyFloatList() {
        return com.google.protobuf.e5.f45058g;
    }

    public static com.google.protobuf.t6 emptyIntList() {
        return com.google.protobuf.m6.f45327g;
    }

    public static com.google.protobuf.u6 emptyLongList() {
        return com.google.protobuf.l7.f45299g;
    }

    public static <E> com.google.protobuf.v6 emptyProtobufList() {
        return com.google.protobuf.i9.f45198g;
    }

    public static <T extends com.google.protobuf.n5> T getDefaultInstance(java.lang.Class<T> cls) {
        com.google.protobuf.n5 n5Var = defaultInstanceMap.get(cls);
        if (n5Var == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                n5Var = defaultInstanceMap.get(cls);
            } catch (java.lang.ClassNotFoundException e17) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e17);
            }
        }
        if (n5Var == null) {
            n5Var = (T) ((com.google.protobuf.n5) com.google.protobuf.ib.a(cls)).getDefaultInstanceForType();
            if (n5Var == null) {
                throw new java.lang.IllegalStateException();
            }
            defaultInstanceMap.put(cls, n5Var);
        }
        return (T) n5Var;
    }

    static java.lang.reflect.Method getMethodOrDie(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
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
    public static java.lang.Object invokeOrDie(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
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

    public static com.google.protobuf.t6 mutableCopy(com.google.protobuf.t6 t6Var) {
        int i17 = ((com.google.protobuf.m6) t6Var).f45329f;
        return ((com.google.protobuf.m6) t6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    public static java.lang.Object newMessageInfo(com.google.protobuf.o8 o8Var, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.protobuf.k9(o8Var, str, objArr);
    }

    public static <ContainingType extends com.google.protobuf.o8, Type> com.google.protobuf.k5 newRepeatedGeneratedExtension(ContainingType containingtype, com.google.protobuf.o8 o8Var, com.google.protobuf.q6 q6Var, int i17, com.google.protobuf.ub ubVar, boolean z17, java.lang.Class cls) {
        return new com.google.protobuf.k5(containingtype, java.util.Collections.emptyList(), o8Var, new com.google.protobuf.j5(q6Var, i17, ubVar, true, z17), cls);
    }

    public static <ContainingType extends com.google.protobuf.o8, Type> com.google.protobuf.k5 newSingularGeneratedExtension(ContainingType containingtype, Type type, com.google.protobuf.o8 o8Var, com.google.protobuf.q6 q6Var, int i17, com.google.protobuf.ub ubVar, java.lang.Class cls) {
        return new com.google.protobuf.k5(containingtype, type, o8Var, new com.google.protobuf.j5(q6Var, i17, ubVar, false, false), cls);
    }

    public static <T extends com.google.protobuf.n5> T parseDelimitedFrom(T t17, java.io.InputStream inputStream) {
        T t18 = (T) c(t17, inputStream, com.google.protobuf.t4.a());
        b(t18);
        return t18;
    }

    public static <T extends com.google.protobuf.n5> T parseFrom(T t17, java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        T t18 = (T) parseFrom(t17, com.google.protobuf.d0.h(byteBuffer, false), t4Var);
        b(t18);
        return t18;
    }

    public static <T extends com.google.protobuf.n5> T parsePartialFrom(T t17, com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        T t18 = (T) t17.dynamicMethod(com.google.protobuf.l5.NEW_MUTABLE_INSTANCE);
        try {
            com.google.protobuf.h9 h9Var = com.google.protobuf.h9.f45166c;
            h9Var.getClass();
            com.google.protobuf.q9 a17 = h9Var.a(t18.getClass());
            com.google.protobuf.e0 e0Var = d0Var.f44994d;
            if (e0Var == null) {
                e0Var = new com.google.protobuf.e0(d0Var);
            }
            a17.h(t18, e0Var, t4Var);
            a17.e(t18);
            return t18;
        } catch (java.io.IOException e17) {
            if (e17.getCause() instanceof com.google.protobuf.y6) {
                throw ((com.google.protobuf.y6) e17.getCause());
            }
            com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e17.getMessage());
            y6Var.f45739d = t18;
            throw y6Var;
        } catch (java.lang.RuntimeException e18) {
            if (e18.getCause() instanceof com.google.protobuf.y6) {
                throw ((com.google.protobuf.y6) e18.getCause());
            }
            throw e18;
        }
    }

    public static <T extends com.google.protobuf.n5> void registerDefaultInstance(java.lang.Class<T> cls, T t17) {
        defaultInstanceMap.put(cls, t17);
    }

    public java.lang.Object buildMessageInfo() {
        return dynamicMethod(com.google.protobuf.l5.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends com.google.protobuf.n5, BuilderType extends com.google.protobuf.h5> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(com.google.protobuf.l5.NEW_BUILDER);
    }

    public java.lang.Object dynamicMethod(com.google.protobuf.l5 l5Var, java.lang.Object obj) {
        return dynamicMethod(l5Var, obj, null);
    }

    public abstract java.lang.Object dynamicMethod(com.google.protobuf.l5 l5Var, java.lang.Object obj, java.lang.Object obj2);

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.protobuf.h9 h9Var = com.google.protobuf.h9.f45166c;
        h9Var.getClass();
        return h9Var.a(getClass()).equals(this, (com.google.protobuf.n5) obj);
    }

    @Override // com.google.protobuf.f
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final com.google.protobuf.e9 getParserForType() {
        return (com.google.protobuf.e9) dynamicMethod(com.google.protobuf.l5.GET_PARSER);
    }

    @Override // com.google.protobuf.o8
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            com.google.protobuf.h9 h9Var = com.google.protobuf.h9.f45166c;
            h9Var.getClass();
            this.memoizedSerializedSize = h9Var.a(getClass()).f(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        com.google.protobuf.h9 h9Var = com.google.protobuf.h9.f45166c;
        h9Var.getClass();
        int hashCode = h9Var.a(getClass()).hashCode(this);
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.p8
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        com.google.protobuf.h9 h9Var = com.google.protobuf.h9.f45166c;
        h9Var.getClass();
        h9Var.a(getClass()).e(this);
    }

    public void mergeLengthDelimitedField(int i17, com.google.protobuf.y yVar) {
        if (this.unknownFields == com.google.protobuf.xa.f45706f) {
            this.unknownFields = new com.google.protobuf.xa();
        }
        com.google.protobuf.xa xaVar = this.unknownFields;
        if (!xaVar.f45711e) {
            throw new java.lang.UnsupportedOperationException();
        }
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        xaVar.d((i17 << 3) | 2, yVar);
    }

    public final void mergeUnknownFields(com.google.protobuf.xa xaVar) {
        this.unknownFields = com.google.protobuf.xa.c(this.unknownFields, xaVar);
    }

    public void mergeVarintField(int i17, int i18) {
        if (this.unknownFields == com.google.protobuf.xa.f45706f) {
            this.unknownFields = new com.google.protobuf.xa();
        }
        com.google.protobuf.xa xaVar = this.unknownFields;
        if (!xaVar.f45711e) {
            throw new java.lang.UnsupportedOperationException();
        }
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        xaVar.d((i17 << 3) | 0, java.lang.Long.valueOf(i18));
    }

    public boolean parseUnknownField(int i17, com.google.protobuf.d0 d0Var) {
        if ((i17 & 7) == 4) {
            return false;
        }
        if (this.unknownFields == com.google.protobuf.xa.f45706f) {
            this.unknownFields = new com.google.protobuf.xa();
        }
        return this.unknownFields.b(i17, d0Var);
    }

    @Override // com.google.protobuf.f
    public void setMemoizedSerializedSize(int i17) {
        this.memoizedSerializedSize = i17;
    }

    public java.lang.String toString() {
        java.lang.String obj = super.toString();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("# ");
        sb6.append(obj);
        com.google.protobuf.q8.c(this, sb6, 0);
        return sb6.toString();
    }

    @Override // com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.h9 h9Var = com.google.protobuf.h9.f45166c;
        h9Var.getClass();
        com.google.protobuf.q9 a17 = h9Var.a(getClass());
        com.google.protobuf.l0 l0Var = k0Var.f45248a;
        if (l0Var == null) {
            l0Var = new com.google.protobuf.l0(k0Var);
        }
        a17.b(this, l0Var);
    }

    public static final <T extends com.google.protobuf.n5> boolean isInitialized(T t17, boolean z17) {
        byte byteValue = ((java.lang.Byte) t17.dynamicMethod(com.google.protobuf.l5.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        com.google.protobuf.h9 h9Var = com.google.protobuf.h9.f45166c;
        h9Var.getClass();
        boolean c17 = h9Var.a(t17.getClass()).c(t17);
        if (z17) {
            t17.dynamicMethod(com.google.protobuf.l5.SET_MEMOIZED_IS_INITIALIZED, c17 ? t17 : null);
        }
        return c17;
    }

    public final <MessageType extends com.google.protobuf.n5, BuilderType extends com.google.protobuf.h5> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((com.google.protobuf.n5) messagetype);
    }

    public java.lang.Object dynamicMethod(com.google.protobuf.l5 l5Var) {
        return dynamicMethod(l5Var, null, null);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public final com.google.protobuf.n5 getDefaultInstanceForType() {
        return (com.google.protobuf.n5) dynamicMethod(com.google.protobuf.l5.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public final com.google.protobuf.h5 newBuilderForType() {
        return (com.google.protobuf.h5) dynamicMethod(com.google.protobuf.l5.NEW_BUILDER);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public final com.google.protobuf.h5 toBuilder() {
        com.google.protobuf.h5 h5Var = (com.google.protobuf.h5) dynamicMethod(com.google.protobuf.l5.NEW_BUILDER);
        h5Var.mergeFrom(this);
        return h5Var;
    }

    public static com.google.protobuf.u6 mutableCopy(com.google.protobuf.u6 u6Var) {
        int i17 = ((com.google.protobuf.l7) u6Var).f45301f;
        return ((com.google.protobuf.l7) u6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    public static <T extends com.google.protobuf.n5> T parseDelimitedFrom(T t17, java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        T t18 = (T) c(t17, inputStream, t4Var);
        b(t18);
        return t18;
    }

    public static <T extends com.google.protobuf.n5> T parseFrom(T t17, java.nio.ByteBuffer byteBuffer) {
        return (T) parseFrom(t17, byteBuffer, com.google.protobuf.t4.a());
    }

    public static <T extends com.google.protobuf.n5> T parseFrom(T t17, com.google.protobuf.y yVar) {
        T t18 = (T) parseFrom(t17, yVar, com.google.protobuf.t4.a());
        b(t18);
        return t18;
    }

    public static com.google.protobuf.s6 mutableCopy(com.google.protobuf.s6 s6Var) {
        int i17 = ((com.google.protobuf.e5) s6Var).f45060f;
        return ((com.google.protobuf.e5) s6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    public static <T extends com.google.protobuf.n5> T parseFrom(T t17, com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.d0 m17 = yVar.m();
        T t18 = (T) parsePartialFrom(t17, m17, t4Var);
        try {
            m17.a(0);
            b(t18);
            return t18;
        } catch (com.google.protobuf.y6 e17) {
            e17.f45739d = t18;
            throw e17;
        }
    }

    public static com.google.protobuf.o6 mutableCopy(com.google.protobuf.o6 o6Var) {
        int i17 = ((com.google.protobuf.j4) o6Var).f45234f;
        return ((com.google.protobuf.j4) o6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    public static com.google.protobuf.n6 mutableCopy(com.google.protobuf.n6 n6Var) {
        int i17 = ((com.google.protobuf.o) n6Var).f45343f;
        return ((com.google.protobuf.o) n6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    public static <T extends com.google.protobuf.n5> T parseFrom(T t17, byte[] bArr) {
        T t18 = (T) parsePartialFrom(t17, bArr, 0, bArr.length, com.google.protobuf.t4.a());
        b(t18);
        return t18;
    }

    public static <E> com.google.protobuf.v6 mutableCopy(com.google.protobuf.v6 v6Var) {
        int size = v6Var.size();
        return v6Var.F(size == 0 ? 10 : size * 2);
    }

    public static <T extends com.google.protobuf.n5> T parseFrom(T t17, byte[] bArr, com.google.protobuf.t4 t4Var) {
        T t18 = (T) parsePartialFrom(t17, bArr, 0, bArr.length, t4Var);
        b(t18);
        return t18;
    }

    public static <T extends com.google.protobuf.n5> T parsePartialFrom(T t17, byte[] bArr, int i17, int i18, com.google.protobuf.t4 t4Var) {
        T t18 = (T) t17.dynamicMethod(com.google.protobuf.l5.NEW_MUTABLE_INSTANCE);
        try {
            com.google.protobuf.h9 h9Var = com.google.protobuf.h9.f45166c;
            h9Var.getClass();
            com.google.protobuf.q9 a17 = h9Var.a(t18.getClass());
            a17.d(t18, bArr, i17, i17 + i18, new com.google.protobuf.j(t4Var));
            a17.e(t18);
            if (t18.memoizedHashCode == 0) {
                return t18;
            }
            throw new java.lang.RuntimeException();
        } catch (java.io.IOException e17) {
            if (e17.getCause() instanceof com.google.protobuf.y6) {
                throw ((com.google.protobuf.y6) e17.getCause());
            }
            com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e17.getMessage());
            y6Var.f45739d = t18;
            throw y6Var;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            com.google.protobuf.y6 i19 = com.google.protobuf.y6.i();
            i19.f45739d = t18;
            throw i19;
        }
    }

    public static <T extends com.google.protobuf.n5> T parseFrom(T t17, java.io.InputStream inputStream) {
        T t18 = (T) parsePartialFrom(t17, com.google.protobuf.d0.g(inputStream), com.google.protobuf.t4.a());
        b(t18);
        return t18;
    }

    public static <T extends com.google.protobuf.n5> T parseFrom(T t17, java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        T t18 = (T) parsePartialFrom(t17, com.google.protobuf.d0.g(inputStream), t4Var);
        b(t18);
        return t18;
    }

    public static <T extends com.google.protobuf.n5> T parseFrom(T t17, com.google.protobuf.d0 d0Var) {
        return (T) parseFrom(t17, d0Var, com.google.protobuf.t4.a());
    }

    public static <T extends com.google.protobuf.n5> T parseFrom(T t17, com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        T t18 = (T) parsePartialFrom(t17, d0Var, t4Var);
        b(t18);
        return t18;
    }

    public static <T extends com.google.protobuf.n5> T parsePartialFrom(T t17, com.google.protobuf.d0 d0Var) {
        return (T) parsePartialFrom(t17, d0Var, com.google.protobuf.t4.a());
    }
}
