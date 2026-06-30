package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class l6 extends com.google.protobuf.c implements java.io.Serializable {
    protected static boolean alwaysUseFieldBuilders = false;
    private static final long serialVersionUID = 1;
    protected com.google.protobuf.wa unknownFields;

    public l6() {
        this.unknownFields = com.google.protobuf.wa.f45651e;
    }

    public static java.lang.reflect.Method access$1000(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr) {
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

    public static java.lang.Object access$1100(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object[] objArr) {
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

    public static com.google.protobuf.m4 access$500(com.google.protobuf.n4 n4Var) {
        n4Var.getClass();
        throw new java.lang.IllegalArgumentException("Expected non-lite extension.");
    }

    public static boolean canUseUnsafe() {
        return com.google.protobuf.ib.f45207f && com.google.protobuf.ib.f45206e;
    }

    public static int computeStringSize(int i17, java.lang.Object obj) {
        return obj instanceof java.lang.String ? com.google.protobuf.k0.p(i17) + com.google.protobuf.k0.o((java.lang.String) obj) : com.google.protobuf.k0.c(i17, (com.google.protobuf.y) obj);
    }

    public static int computeStringSizeNoTag(java.lang.Object obj) {
        return obj instanceof java.lang.String ? com.google.protobuf.k0.o((java.lang.String) obj) : com.google.protobuf.k0.d((com.google.protobuf.y) obj);
    }

    public static void e(com.google.protobuf.k0 k0Var, java.util.Map map, com.google.protobuf.t7 t7Var, int i17) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            com.google.protobuf.q7 newBuilderForType = t7Var.newBuilderForType();
            newBuilderForType.f45449e = entry.getKey();
            newBuilderForType.f45451g = true;
            newBuilderForType.f45450f = entry.getValue();
            newBuilderForType.f45452h = true;
            k0Var.J(i17, newBuilderForType.build());
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

    public static void enableAlwaysUseFieldBuildersForTesting() {
        setAlwaysUseFieldBuildersForTesting(true);
    }

    public static com.google.protobuf.t6 mutableCopy(com.google.protobuf.t6 t6Var) {
        int i17 = ((com.google.protobuf.m6) t6Var).f45329f;
        return ((com.google.protobuf.m6) t6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    public static com.google.protobuf.n6 newBooleanList() {
        return new com.google.protobuf.o();
    }

    public static com.google.protobuf.o6 newDoubleList() {
        return new com.google.protobuf.j4();
    }

    public static com.google.protobuf.s6 newFloatList() {
        return new com.google.protobuf.e5();
    }

    public static com.google.protobuf.t6 newIntList() {
        return new com.google.protobuf.m6();
    }

    public static com.google.protobuf.u6 newLongList() {
        return new com.google.protobuf.l7();
    }

    public static <M extends com.google.protobuf.k8> M parseDelimitedWithIOException(com.google.protobuf.e9 e9Var, java.io.InputStream inputStream) {
        try {
            return (M) e9Var.parseDelimitedFrom(inputStream);
        } catch (com.google.protobuf.y6 e17) {
            throw e17.j();
        }
    }

    public static <M extends com.google.protobuf.k8> M parseWithIOException(com.google.protobuf.e9 e9Var, java.io.InputStream inputStream) {
        try {
            return (M) e9Var.parseFrom(inputStream);
        } catch (com.google.protobuf.y6 e17) {
            throw e17.j();
        }
    }

    public static <V> void serializeBooleanMapTo(com.google.protobuf.k0 k0Var, com.google.protobuf.d8 d8Var, com.google.protobuf.t7 t7Var, int i17) {
        java.util.Map e17 = d8Var.e();
        k0Var.getClass();
        e(k0Var, e17, t7Var, i17);
    }

    public static <V> void serializeIntegerMapTo(com.google.protobuf.k0 k0Var, com.google.protobuf.d8 d8Var, com.google.protobuf.t7 t7Var, int i17) {
        java.util.Map e17 = d8Var.e();
        k0Var.getClass();
        e(k0Var, e17, t7Var, i17);
    }

    public static <V> void serializeLongMapTo(com.google.protobuf.k0 k0Var, com.google.protobuf.d8 d8Var, com.google.protobuf.t7 t7Var, int i17) {
        java.util.Map e17 = d8Var.e();
        k0Var.getClass();
        e(k0Var, e17, t7Var, i17);
    }

    public static <V> void serializeStringMapTo(com.google.protobuf.k0 k0Var, com.google.protobuf.d8 d8Var, com.google.protobuf.t7 t7Var, int i17) {
        java.util.Map e17 = d8Var.e();
        k0Var.getClass();
        e(k0Var, e17, t7Var, i17);
    }

    public static void setAlwaysUseFieldBuildersForTesting(boolean z17) {
        alwaysUseFieldBuilders = z17;
    }

    public static void writeString(com.google.protobuf.k0 k0Var, int i17, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            k0Var.O(i17, (java.lang.String) obj);
        } else {
            k0Var.z(i17, (com.google.protobuf.y) obj);
        }
    }

    public static void writeStringNoTag(com.google.protobuf.k0 k0Var, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            k0Var.P((java.lang.String) obj);
        } else {
            k0Var.A((com.google.protobuf.y) obj);
        }
    }

    public final java.util.Map d(boolean z17) {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.util.List n17 = internalGetFieldAccessorTable().f45240a.n();
        int i17 = 0;
        while (i17 < n17.size()) {
            com.google.protobuf.b4 b4Var = (com.google.protobuf.b4) n17.get(i17);
            com.google.protobuf.g4 g4Var = b4Var.f44917p;
            if (g4Var != null) {
                i17 += g4Var.f45132i - 1;
                if (hasOneof(g4Var)) {
                    b4Var = getOneofFieldDescriptor(g4Var);
                    if (z17 || b4Var.f44914m.f44859d != com.google.protobuf.z3.STRING) {
                        treeMap.put(b4Var, getField(b4Var));
                    } else {
                        treeMap.put(b4Var, getFieldRaw(b4Var));
                    }
                    i17++;
                } else {
                    i17++;
                }
            } else {
                if (b4Var.d1()) {
                    java.util.List list = (java.util.List) getField(b4Var);
                    if (!list.isEmpty()) {
                        treeMap.put(b4Var, list);
                    }
                } else {
                    if (!hasField(b4Var)) {
                    }
                    if (z17) {
                    }
                    treeMap.put(b4Var, getField(b4Var));
                }
                i17++;
            }
        }
        return treeMap;
    }

    @Override // com.google.protobuf.r8
    public java.util.Map<com.google.protobuf.b4, java.lang.Object> getAllFields() {
        return java.util.Collections.unmodifiableMap(d(false));
    }

    public java.util.Map<com.google.protobuf.b4, java.lang.Object> getAllFieldsRaw() {
        return java.util.Collections.unmodifiableMap(d(true));
    }

    @Override // com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return internalGetFieldAccessorTable().f45240a;
    }

    @Override // com.google.protobuf.r8
    public java.lang.Object getField(com.google.protobuf.b4 b4Var) {
        return com.google.protobuf.j6.b(internalGetFieldAccessorTable(), b4Var).m(this);
    }

    public java.lang.Object getFieldRaw(com.google.protobuf.b4 b4Var) {
        return com.google.protobuf.j6.b(internalGetFieldAccessorTable(), b4Var).a(this);
    }

    public com.google.protobuf.b4 getOneofFieldDescriptor(com.google.protobuf.g4 g4Var) {
        com.google.protobuf.x5 a17 = com.google.protobuf.j6.a(internalGetFieldAccessorTable(), g4Var);
        com.google.protobuf.b4 b4Var = a17.f45683e;
        if (b4Var != null) {
            if (!hasField(b4Var)) {
                b4Var = null;
            }
            return b4Var;
        }
        int number = ((com.google.protobuf.p6) access$1100(a17.f45680b, this, new java.lang.Object[0])).getNumber();
        if (number > 0) {
            return a17.f45679a.m(number);
        }
        return null;
    }

    public java.lang.Object getRepeatedField(com.google.protobuf.b4 b4Var, int i17) {
        return com.google.protobuf.j6.b(internalGetFieldAccessorTable(), b4Var).o(this, i17);
    }

    public int getRepeatedFieldCount(com.google.protobuf.b4 b4Var) {
        return com.google.protobuf.j6.b(internalGetFieldAccessorTable(), b4Var).b(this);
    }

    @Override // com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        java.util.Map<com.google.protobuf.b4, java.lang.Object> allFieldsRaw = getAllFieldsRaw();
        boolean z17 = getDescriptorForType().r().f45226f;
        int i18 = 0;
        for (java.util.Map.Entry<com.google.protobuf.b4, java.lang.Object> entry : allFieldsRaw.entrySet()) {
            com.google.protobuf.b4 key = entry.getKey();
            java.lang.Object value = entry.getValue();
            i18 += (z17 && key.o() && key.f44914m == com.google.protobuf.a4.f44855g && !key.d1()) ? (com.google.protobuf.k0.p(1) * 2) + com.google.protobuf.k0.q(2, key.f44909e.f45563f) + com.google.protobuf.k0.n(3, (com.google.protobuf.k8) value) : com.google.protobuf.b5.h(key, value);
        }
        com.google.protobuf.wa unknownFields = getUnknownFields();
        int a17 = i18 + (z17 ? unknownFields.a() : unknownFields.getSerializedSize());
        this.memoizedSize = a17;
        return a17;
    }

    @Override // com.google.protobuf.r8
    public boolean hasField(com.google.protobuf.b4 b4Var) {
        return com.google.protobuf.j6.b(internalGetFieldAccessorTable(), b4Var).e(this);
    }

    public boolean hasOneof(com.google.protobuf.g4 g4Var) {
        com.google.protobuf.x5 a17 = com.google.protobuf.j6.a(internalGetFieldAccessorTable(), g4Var);
        com.google.protobuf.b4 b4Var = a17.f45683e;
        if (b4Var != null) {
            return hasField(b4Var);
        }
        return ((com.google.protobuf.p6) access$1100(a17.f45680b, this, new java.lang.Object[0])).getNumber() != 0;
    }

    public abstract com.google.protobuf.j6 internalGetFieldAccessorTable();

    public com.google.protobuf.d8 internalGetMapField(int i17) {
        java.lang.String name = getClass().getName();
        throw new java.lang.RuntimeException(name.length() != 0 ? "No map fields found in ".concat(name) : new java.lang.String("No map fields found in "));
    }

    @Override // com.google.protobuf.p8
    public boolean isInitialized() {
        for (com.google.protobuf.b4 b4Var : getDescriptorForType().n()) {
            if (b4Var.s() && !hasField(b4Var)) {
                return false;
            }
            if (b4Var.f44914m.f44859d == com.google.protobuf.z3.MESSAGE) {
                if (b4Var.d1()) {
                    java.util.Iterator it = ((java.util.List) getField(b4Var)).iterator();
                    while (it.hasNext()) {
                        if (!((com.google.protobuf.k8) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(b4Var) && !((com.google.protobuf.k8) getField(b4Var)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void makeExtensionsImmutable() {
    }

    public void mergeFromAndMakeImmutableInternal(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.h9 h9Var = com.google.protobuf.h9.f45166c;
        h9Var.getClass();
        com.google.protobuf.q9 a17 = h9Var.a(getClass());
        try {
            com.google.protobuf.e0 e0Var = d0Var.f44994d;
            if (e0Var == null) {
                e0Var = new com.google.protobuf.e0(d0Var);
            }
            a17.h(this, e0Var, t4Var);
            a17.e(this);
        } catch (com.google.protobuf.y6 e17) {
            e17.f45739d = this;
            throw e17;
        } catch (java.io.IOException e18) {
            com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
            y6Var.f45739d = this;
            throw y6Var;
        }
    }

    @Override // com.google.protobuf.c
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.b bVar) {
        return newBuilderForType((com.google.protobuf.r5) new com.google.protobuf.o5(this, bVar));
    }

    public abstract com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var);

    public abstract java.lang.Object newInstance(com.google.protobuf.k6 k6Var);

    public boolean parseUnknownField(com.google.protobuf.d0 d0Var, com.google.protobuf.sa saVar, com.google.protobuf.t4 t4Var, int i17) {
        d0Var.getClass();
        return saVar.e(i17, d0Var);
    }

    public boolean parseUnknownFieldProto3(com.google.protobuf.d0 d0Var, com.google.protobuf.sa saVar, com.google.protobuf.t4 t4Var, int i17) {
        return parseUnknownField(d0Var, saVar, t4Var, i17);
    }

    public java.lang.Object writeReplace() {
        return new com.google.protobuf.m5(this);
    }

    @Override // com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        java.util.Map<com.google.protobuf.b4, java.lang.Object> allFieldsRaw = getAllFieldsRaw();
        boolean z17 = getDescriptorForType().r().f45226f;
        for (java.util.Map.Entry<com.google.protobuf.b4, java.lang.Object> entry : allFieldsRaw.entrySet()) {
            com.google.protobuf.b4 key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (z17 && key.o() && key.f44914m == com.google.protobuf.a4.f44855g && !key.d1()) {
                k0Var.M(key.f44909e.f45563f, (com.google.protobuf.k8) value);
            } else {
                com.google.protobuf.b5.y(key, value, k0Var);
            }
        }
        com.google.protobuf.wa unknownFields = getUnknownFields();
        if (z17) {
            unknownFields.c(k0Var);
        } else {
            unknownFields.writeTo(k0Var);
        }
    }

    public static <M extends com.google.protobuf.k8> M parseDelimitedWithIOException(com.google.protobuf.e9 e9Var, java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        try {
            return (M) e9Var.parseDelimitedFrom(inputStream, t4Var);
        } catch (com.google.protobuf.y6 e17) {
            throw e17.j();
        }
    }

    public static <M extends com.google.protobuf.k8> M parseWithIOException(com.google.protobuf.e9 e9Var, java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        try {
            return (M) e9Var.parseFrom(inputStream, t4Var);
        } catch (com.google.protobuf.y6 e17) {
            throw e17.j();
        }
    }

    public l6(com.google.protobuf.q5 q5Var) {
        this.unknownFields = q5Var.getUnknownFields();
    }

    public static com.google.protobuf.u6 mutableCopy(com.google.protobuf.u6 u6Var) {
        int i17 = ((com.google.protobuf.l7) u6Var).f45301f;
        return ((com.google.protobuf.l7) u6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    public static <M extends com.google.protobuf.k8> M parseWithIOException(com.google.protobuf.e9 e9Var, com.google.protobuf.d0 d0Var) {
        try {
            return (M) e9Var.parseFrom(d0Var);
        } catch (com.google.protobuf.y6 e17) {
            throw e17.j();
        }
    }

    public static com.google.protobuf.s6 mutableCopy(com.google.protobuf.s6 s6Var) {
        int i17 = ((com.google.protobuf.e5) s6Var).f45060f;
        return ((com.google.protobuf.e5) s6Var).F(i17 == 0 ? 10 : i17 * 2);
    }

    public static <M extends com.google.protobuf.k8> M parseWithIOException(com.google.protobuf.e9 e9Var, com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        try {
            return (M) e9Var.parseFrom(d0Var, t4Var);
        } catch (com.google.protobuf.y6 e17) {
            throw e17.j();
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
}
