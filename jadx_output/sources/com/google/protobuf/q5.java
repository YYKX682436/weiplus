package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class q5 extends com.google.protobuf.a {
    private com.google.protobuf.r5 builderParent;
    private boolean isClean;
    private com.google.protobuf.p5 meAsParent;
    private com.google.protobuf.wa unknownFields = com.google.protobuf.wa.f45651e;

    public q5(com.google.protobuf.r5 r5Var) {
        this.builderParent = r5Var;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.q5 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        com.google.protobuf.j6.b(internalGetFieldAccessorTable(), b4Var).d(this, obj);
        return this;
    }

    public final java.util.Map b() {
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
                    treeMap.put(b4Var, getField(b4Var));
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
                    treeMap.put(b4Var, getField(b4Var));
                }
                i17++;
            }
        }
        return treeMap;
    }

    public com.google.protobuf.q5 clear() {
        this.unknownFields = com.google.protobuf.wa.f45651e;
        onChanged();
        return this;
    }

    public com.google.protobuf.q5 clearField(com.google.protobuf.b4 b4Var) {
        com.google.protobuf.j6.b(internalGetFieldAccessorTable(), b4Var).k(this);
        return this;
    }

    public com.google.protobuf.q5 clearOneof(com.google.protobuf.g4 g4Var) {
        com.google.protobuf.l6.access$1100(com.google.protobuf.j6.a(internalGetFieldAccessorTable(), g4Var).f45682d, this, new java.lang.Object[0]);
        return this;
    }

    public com.google.protobuf.q5 clone() {
        com.google.protobuf.q5 q5Var = (com.google.protobuf.q5) getDefaultInstanceForType().newBuilderForType();
        q5Var.mergeFrom(buildPartial());
        return q5Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.a
    public void dispose() {
        this.builderParent = null;
    }

    @Override // com.google.protobuf.r8
    public java.util.Map<com.google.protobuf.b4, java.lang.Object> getAllFields() {
        return java.util.Collections.unmodifiableMap(b());
    }

    @Override // com.google.protobuf.r8
    public java.lang.Object getField(com.google.protobuf.b4 b4Var) {
        java.lang.Object n17 = com.google.protobuf.j6.b(internalGetFieldAccessorTable(), b4Var).n(this);
        return b4Var.d1() ? java.util.Collections.unmodifiableList((java.util.List) n17) : n17;
    }

    public com.google.protobuf.j8 getFieldBuilder(com.google.protobuf.b4 b4Var) {
        return com.google.protobuf.j6.b(internalGetFieldAccessorTable(), b4Var).l(this);
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
        int number = ((com.google.protobuf.p6) com.google.protobuf.l6.access$1100(a17.f45681c, this, new java.lang.Object[0])).getNumber();
        if (number > 0) {
            return a17.f45679a.m(number);
        }
        return null;
    }

    public com.google.protobuf.r5 getParentForChildren() {
        if (this.meAsParent == null) {
            this.meAsParent = new com.google.protobuf.p5(this, null);
        }
        return this.meAsParent;
    }

    public java.lang.Object getRepeatedField(com.google.protobuf.b4 b4Var, int i17) {
        return com.google.protobuf.j6.b(internalGetFieldAccessorTable(), b4Var).g(this, i17);
    }

    public com.google.protobuf.j8 getRepeatedFieldBuilder(com.google.protobuf.b4 b4Var, int i17) {
        return com.google.protobuf.j6.b(internalGetFieldAccessorTable(), b4Var).i(this, i17);
    }

    public int getRepeatedFieldCount(com.google.protobuf.b4 b4Var) {
        return com.google.protobuf.j6.b(internalGetFieldAccessorTable(), b4Var).j(this);
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.r8
    public boolean hasField(com.google.protobuf.b4 b4Var) {
        return com.google.protobuf.j6.b(internalGetFieldAccessorTable(), b4Var).h(this);
    }

    public boolean hasOneof(com.google.protobuf.g4 g4Var) {
        com.google.protobuf.x5 a17 = com.google.protobuf.j6.a(internalGetFieldAccessorTable(), g4Var);
        com.google.protobuf.b4 b4Var = a17.f45683e;
        if (b4Var != null) {
            return hasField(b4Var);
        }
        return ((com.google.protobuf.p6) com.google.protobuf.l6.access$1100(a17.f45681c, this, new java.lang.Object[0])).getNumber() != 0;
    }

    public abstract com.google.protobuf.j6 internalGetFieldAccessorTable();

    public com.google.protobuf.d8 internalGetMapField(int i17) {
        java.lang.String name = getClass().getName();
        throw new java.lang.RuntimeException(name.length() != 0 ? "No map fields found in ".concat(name) : new java.lang.String("No map fields found in "));
    }

    public com.google.protobuf.d8 internalGetMutableMapField(int i17) {
        java.lang.String name = getClass().getName();
        throw new java.lang.RuntimeException(name.length() != 0 ? "No map fields found in ".concat(name) : new java.lang.String("No map fields found in "));
    }

    public boolean isClean() {
        return this.isClean;
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

    @Override // com.google.protobuf.a
    public void markClean() {
        this.isClean = true;
    }

    @Override // com.google.protobuf.a
    public com.google.protobuf.q5 mergeUnknownFields(com.google.protobuf.wa waVar) {
        com.google.protobuf.wa waVar2 = this.unknownFields;
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        b17.f(waVar2);
        b17.f(waVar);
        return setUnknownFields(b17.build());
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 newBuilderForField(com.google.protobuf.b4 b4Var) {
        return com.google.protobuf.j6.b(internalGetFieldAccessorTable(), b4Var).newBuilder();
    }

    public void onBuilt() {
        if (this.builderParent != null) {
            markClean();
        }
    }

    public final void onChanged() {
        com.google.protobuf.r5 r5Var;
        if (!this.isClean || (r5Var = this.builderParent) == null) {
            return;
        }
        r5Var.a();
        this.isClean = false;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.q5 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        com.google.protobuf.j6.b(internalGetFieldAccessorTable(), b4Var).c(this, obj);
        return this;
    }

    public com.google.protobuf.q5 setRepeatedField(com.google.protobuf.b4 b4Var, int i17, java.lang.Object obj) {
        com.google.protobuf.j6.b(internalGetFieldAccessorTable(), b4Var).f(this, i17, obj);
        return this;
    }

    public com.google.protobuf.q5 setUnknownFields(com.google.protobuf.wa waVar) {
        this.unknownFields = waVar;
        onChanged();
        return this;
    }

    public com.google.protobuf.q5 setUnknownFieldsProto3(com.google.protobuf.wa waVar) {
        this.unknownFields = waVar;
        onChanged();
        return this;
    }
}
