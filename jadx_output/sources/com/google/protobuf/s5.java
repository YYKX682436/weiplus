package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class s5 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public com.google.protobuf.z4 f45494d;

    public s5() {
        super(null);
    }

    private void h(com.google.protobuf.b4 b4Var) {
        if (b4Var.f44915n != getDescriptorForType()) {
            throw new java.lang.IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    public com.google.protobuf.s5 c(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        java.util.List list;
        if (!b4Var.o()) {
            addRepeatedField(b4Var, obj);
            return this;
        }
        h(b4Var);
        d();
        com.google.protobuf.z4 z4Var = this.f45494d;
        z4Var.a();
        if (!b4Var.d1()) {
            throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        z4Var.f45790d = z4Var.f45790d || (obj instanceof com.google.protobuf.n8);
        com.google.protobuf.z4.i(b4Var.P(), obj);
        java.lang.Object b17 = z4Var.b(b4Var);
        if (b17 == null) {
            list = new java.util.ArrayList();
            z4Var.f45787a.h(b4Var, list);
        } else {
            list = (java.util.List) b17;
        }
        list.add(obj);
        onChanged();
        return this;
    }

    public final void d() {
        if (this.f45494d == null) {
            com.google.protobuf.b5 b5Var = com.google.protobuf.b5.f44920d;
            this.f45494d = new com.google.protobuf.z4(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e() {
        /*
            r5 = this;
            com.google.protobuf.z4 r0 = r5.f45494d
            r1 = 1
            if (r0 != 0) goto L6
            goto L3e
        L6:
            r2 = 0
            r3 = r2
        L8:
            com.google.protobuf.ba r4 = r0.f45787a
            int r4 = r4.d()
            if (r3 >= r4) goto L21
            com.google.protobuf.ba r4 = r0.f45787a
            java.util.Map$Entry r4 = r4.c(r3)
            boolean r4 = com.google.protobuf.b5.p(r4)
            if (r4 != 0) goto L1e
        L1c:
            r1 = r2
            goto L3e
        L1e:
            int r3 = r3 + 1
            goto L8
        L21:
            com.google.protobuf.ba r0 = r0.f45787a
            java.lang.Iterable r0 = r0.e()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            boolean r3 = com.google.protobuf.b5.p(r3)
            if (r3 != 0) goto L2b
            goto L1c
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s5.e():boolean");
    }

    public final void f(com.google.protobuf.u5 u5Var) {
        com.google.protobuf.ba baVar;
        if (u5Var.f45578d != null) {
            d();
            com.google.protobuf.z4 z4Var = this.f45494d;
            com.google.protobuf.b5 b5Var = u5Var.f45578d;
            z4Var.a();
            int i17 = 0;
            while (true) {
                int d17 = b5Var.f44921a.d();
                baVar = b5Var.f44921a;
                if (i17 >= d17) {
                    break;
                }
                z4Var.e(baVar.c(i17));
                i17++;
            }
            java.util.Iterator it = baVar.e().iterator();
            while (it.hasNext()) {
                z4Var.e((java.util.Map.Entry) it.next());
            }
            onChanged();
        }
    }

    public com.google.protobuf.s5 g(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        if (!b4Var.o()) {
            setField(b4Var, obj);
            return this;
        }
        h(b4Var);
        d();
        this.f45494d.h(b4Var, obj);
        onChanged();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map] */
    @Override // com.google.protobuf.q5, com.google.protobuf.r8
    public java.util.Map getAllFields() {
        java.util.Map b17;
        com.google.protobuf.ba baVar;
        b17 = b();
        com.google.protobuf.z4 z4Var = this.f45494d;
        if (z4Var != null) {
            if (z4Var.f45788b) {
                baVar = com.google.protobuf.b5.c(z4Var.f45787a, false);
                if (z4Var.f45787a.f44933g) {
                    baVar.g();
                } else {
                    com.google.protobuf.z4.g(baVar);
                }
            } else {
                com.google.protobuf.ba baVar2 = z4Var.f45787a;
                boolean z17 = baVar2.f44933g;
                com.google.protobuf.ba baVar3 = baVar2;
                if (!z17) {
                    baVar3 = java.util.Collections.unmodifiableMap(baVar2);
                }
                baVar = baVar3;
            }
            b17.putAll(baVar);
        }
        return java.util.Collections.unmodifiableMap(b17);
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.r8
    public java.lang.Object getField(com.google.protobuf.b4 b4Var) {
        if (!b4Var.o()) {
            return super.getField(b4Var);
        }
        h(b4Var);
        com.google.protobuf.z4 z4Var = this.f45494d;
        java.lang.Object b17 = z4Var == null ? null : z4Var.b(b4Var);
        return b17 == null ? b4Var.f44914m.f44859d == com.google.protobuf.z3.MESSAGE ? com.google.protobuf.l4.d(b4Var.n()) : b4Var.l() : b17;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j8 getFieldBuilder(com.google.protobuf.b4 b4Var) {
        if (!b4Var.o()) {
            return super.getFieldBuilder(b4Var);
        }
        h(b4Var);
        if (b4Var.f44914m.f44859d != com.google.protobuf.z3.MESSAGE) {
            throw new java.lang.UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
        }
        d();
        java.lang.Object c17 = this.f45494d.c(b4Var);
        if (c17 == null) {
            com.google.protobuf.k4 k4Var = new com.google.protobuf.k4(b4Var.n());
            this.f45494d.h(b4Var, k4Var);
            onChanged();
            return k4Var;
        }
        if (c17 instanceof com.google.protobuf.j8) {
            return (com.google.protobuf.j8) c17;
        }
        if (!(c17 instanceof com.google.protobuf.k8)) {
            throw new java.lang.UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        com.google.protobuf.j8 builder = ((com.google.protobuf.k8) c17).toBuilder();
        this.f45494d.h(b4Var, builder);
        onChanged();
        return builder;
    }

    @Override // com.google.protobuf.q5
    public java.lang.Object getRepeatedField(com.google.protobuf.b4 b4Var, int i17) {
        if (!b4Var.o()) {
            return super.getRepeatedField(b4Var, i17);
        }
        h(b4Var);
        com.google.protobuf.z4 z4Var = this.f45494d;
        if (z4Var == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (z4Var.f45790d) {
            z4Var.a();
        }
        java.lang.Object d17 = z4Var.d(b4Var, i17);
        return d17 instanceof com.google.protobuf.n8 ? ((com.google.protobuf.n8) d17).build() : d17;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j8 getRepeatedFieldBuilder(com.google.protobuf.b4 b4Var, int i17) {
        if (!b4Var.o()) {
            return super.getRepeatedFieldBuilder(b4Var, i17);
        }
        h(b4Var);
        d();
        if (b4Var.f44914m.f44859d != com.google.protobuf.z3.MESSAGE) {
            throw new java.lang.UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        java.lang.Object d17 = this.f45494d.d(b4Var, i17);
        if (d17 instanceof com.google.protobuf.j8) {
            return (com.google.protobuf.j8) d17;
        }
        if (!(d17 instanceof com.google.protobuf.k8)) {
            throw new java.lang.UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        com.google.protobuf.j8 builder = ((com.google.protobuf.k8) d17).toBuilder();
        com.google.protobuf.z4 z4Var = this.f45494d;
        z4Var.a();
        if (!b4Var.d1()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        z4Var.f45790d = z4Var.f45790d || (builder instanceof com.google.protobuf.n8);
        java.lang.Object b17 = z4Var.b(b4Var);
        if (b17 == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        com.google.protobuf.z4.i(b4Var.P(), builder);
        ((java.util.List) b17).set(i17, builder);
        onChanged();
        return builder;
    }

    @Override // com.google.protobuf.q5
    public int getRepeatedFieldCount(com.google.protobuf.b4 b4Var) {
        if (!b4Var.o()) {
            return super.getRepeatedFieldCount(b4Var);
        }
        h(b4Var);
        com.google.protobuf.z4 z4Var = this.f45494d;
        if (z4Var == null) {
            return 0;
        }
        z4Var.getClass();
        if (!b4Var.d1()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object b17 = z4Var.b(b4Var);
        if (b17 == null) {
            return 0;
        }
        return ((java.util.List) b17).size();
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.r8
    public boolean hasField(com.google.protobuf.b4 b4Var) {
        if (!b4Var.o()) {
            return super.hasField(b4Var);
        }
        h(b4Var);
        com.google.protobuf.z4 z4Var = this.f45494d;
        if (z4Var == null) {
            return false;
        }
        z4Var.getClass();
        if (b4Var.d1()) {
            throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return z4Var.f45787a.get(b4Var) != null;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public com.google.protobuf.j8 newBuilderForField(com.google.protobuf.b4 b4Var) {
        return b4Var.o() ? new com.google.protobuf.k4(b4Var.n()) : super.newBuilderForField(b4Var);
    }
}
