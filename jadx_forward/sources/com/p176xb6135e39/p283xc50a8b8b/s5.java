package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class s5 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.z4 f127027d;

    public s5() {
        super(null);
    }

    private void h(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        if (b4Var.f126448n != mo20560x84bb647e()) {
            throw new java.lang.IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    public com.p176xb6135e39.p283xc50a8b8b.s5 c(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        java.util.List list;
        if (!b4Var.o()) {
            mo20555x8e2f927f(b4Var, obj);
            return this;
        }
        h(b4Var);
        d();
        com.p176xb6135e39.p283xc50a8b8b.z4 z4Var = this.f127027d;
        z4Var.a();
        if (!b4Var.d1()) {
            throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        z4Var.f127323d = z4Var.f127323d || (obj instanceof com.p176xb6135e39.p283xc50a8b8b.n8);
        com.p176xb6135e39.p283xc50a8b8b.z4.i(b4Var.P(), obj);
        java.lang.Object b17 = z4Var.b(b4Var);
        if (b17 == null) {
            list = new java.util.ArrayList();
            z4Var.f127320a.h(b4Var, list);
        } else {
            list = (java.util.List) b17;
        }
        list.add(obj);
        m20881x7bb163d5();
        return this;
    }

    public final void d() {
        if (this.f127027d == null) {
            com.p176xb6135e39.p283xc50a8b8b.b5 b5Var = com.p176xb6135e39.p283xc50a8b8b.b5.f126453d;
            this.f127027d = new com.p176xb6135e39.p283xc50a8b8b.z4(null);
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
            com.google.protobuf.z4 r0 = r5.f127027d
            r1 = 1
            if (r0 != 0) goto L6
            goto L3e
        L6:
            r2 = 0
            r3 = r2
        L8:
            com.google.protobuf.ba r4 = r0.f127320a
            int r4 = r4.d()
            if (r3 >= r4) goto L21
            com.google.protobuf.ba r4 = r0.f127320a
            java.util.Map$Entry r4 = r4.c(r3)
            boolean r4 = com.p176xb6135e39.p283xc50a8b8b.b5.p(r4)
            if (r4 != 0) goto L1e
        L1c:
            r1 = r2
            goto L3e
        L1e:
            int r3 = r3 + 1
            goto L8
        L21:
            com.google.protobuf.ba r0 = r0.f127320a
            java.lang.Iterable r0 = r0.e()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            boolean r3 = com.p176xb6135e39.p283xc50a8b8b.b5.p(r3)
            if (r3 != 0) goto L2b
            goto L1c
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.s5.e():boolean");
    }

    public final void f(com.p176xb6135e39.p283xc50a8b8b.u5 u5Var) {
        com.p176xb6135e39.p283xc50a8b8b.ba baVar;
        if (u5Var.f127111d != null) {
            d();
            com.p176xb6135e39.p283xc50a8b8b.z4 z4Var = this.f127027d;
            com.p176xb6135e39.p283xc50a8b8b.b5 b5Var = u5Var.f127111d;
            z4Var.a();
            int i17 = 0;
            while (true) {
                int d17 = b5Var.f126454a.d();
                baVar = b5Var.f126454a;
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
            m20881x7bb163d5();
        }
    }

    public com.p176xb6135e39.p283xc50a8b8b.s5 g(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        if (!b4Var.o()) {
            mo20563x52fa61b8(b4Var, obj);
            return this;
        }
        h(b4Var);
        d();
        this.f127027d.h(b4Var, obj);
        m20881x7bb163d5();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map] */
    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getAllFields */
    public java.util.Map mo20727xcee5d904() {
        java.util.Map b17;
        com.p176xb6135e39.p283xc50a8b8b.ba baVar;
        b17 = b();
        com.p176xb6135e39.p283xc50a8b8b.z4 z4Var = this.f127027d;
        if (z4Var != null) {
            if (z4Var.f127321b) {
                baVar = com.p176xb6135e39.p283xc50a8b8b.b5.c(z4Var.f127320a, false);
                if (z4Var.f127320a.f126466g) {
                    baVar.g();
                } else {
                    com.p176xb6135e39.p283xc50a8b8b.z4.g(baVar);
                }
            } else {
                com.p176xb6135e39.p283xc50a8b8b.ba baVar2 = z4Var.f127320a;
                boolean z17 = baVar2.f126466g;
                com.p176xb6135e39.p283xc50a8b8b.ba baVar3 = baVar2;
                if (!z17) {
                    baVar3 = java.util.Collections.unmodifiableMap(baVar2);
                }
                baVar = baVar3;
            }
            b17.putAll(baVar);
        }
        return java.util.Collections.unmodifiableMap(b17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getField */
    public java.lang.Object mo20728x746c4744(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        if (!b4Var.o()) {
            return super.mo20728x746c4744(b4Var);
        }
        h(b4Var);
        com.p176xb6135e39.p283xc50a8b8b.z4 z4Var = this.f127027d;
        java.lang.Object b17 = z4Var == null ? null : z4Var.b(b4Var);
        return b17 == null ? b4Var.f126447m.f126392d == com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE ? com.p176xb6135e39.p283xc50a8b8b.l4.d(b4Var.n()) : b4Var.l() : b17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: getFieldBuilder */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20870x76524bb7(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        if (!b4Var.o()) {
            return super.mo20870x76524bb7(b4Var);
        }
        h(b4Var);
        if (b4Var.f126447m.f126392d != com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE) {
            throw new java.lang.UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
        }
        d();
        java.lang.Object c17 = this.f127027d.c(b4Var);
        if (c17 == null) {
            com.p176xb6135e39.p283xc50a8b8b.k4 k4Var = new com.p176xb6135e39.p283xc50a8b8b.k4(b4Var.n());
            this.f127027d.h(b4Var, k4Var);
            m20881x7bb163d5();
            return k4Var;
        }
        if (c17 instanceof com.p176xb6135e39.p283xc50a8b8b.j8) {
            return (com.p176xb6135e39.p283xc50a8b8b.j8) c17;
        }
        if (!(c17 instanceof com.p176xb6135e39.p283xc50a8b8b.k8)) {
            throw new java.lang.UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        com.p176xb6135e39.p283xc50a8b8b.j8 mo20599xaaa148a0 = ((com.p176xb6135e39.p283xc50a8b8b.k8) c17).mo20599xaaa148a0();
        this.f127027d.h(b4Var, mo20599xaaa148a0);
        m20881x7bb163d5();
        return mo20599xaaa148a0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: getRepeatedField */
    public java.lang.Object mo20873x4f52c9ea(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17) {
        if (!b4Var.o()) {
            return super.mo20873x4f52c9ea(b4Var, i17);
        }
        h(b4Var);
        com.p176xb6135e39.p283xc50a8b8b.z4 z4Var = this.f127027d;
        if (z4Var == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (z4Var.f127323d) {
            z4Var.a();
        }
        java.lang.Object d17 = z4Var.d(b4Var, i17);
        return d17 instanceof com.p176xb6135e39.p283xc50a8b8b.n8 ? ((com.p176xb6135e39.p283xc50a8b8b.n8) d17).mo20556x59bc66e() : d17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: getRepeatedFieldBuilder */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20874x6178a251(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17) {
        if (!b4Var.o()) {
            return super.mo20874x6178a251(b4Var, i17);
        }
        h(b4Var);
        d();
        if (b4Var.f126447m.f126392d != com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE) {
            throw new java.lang.UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        java.lang.Object d17 = this.f127027d.d(b4Var, i17);
        if (d17 instanceof com.p176xb6135e39.p283xc50a8b8b.j8) {
            return (com.p176xb6135e39.p283xc50a8b8b.j8) d17;
        }
        if (!(d17 instanceof com.p176xb6135e39.p283xc50a8b8b.k8)) {
            throw new java.lang.UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        com.p176xb6135e39.p283xc50a8b8b.j8 mo20599xaaa148a0 = ((com.p176xb6135e39.p283xc50a8b8b.k8) d17).mo20599xaaa148a0();
        com.p176xb6135e39.p283xc50a8b8b.z4 z4Var = this.f127027d;
        z4Var.a();
        if (!b4Var.d1()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        z4Var.f127323d = z4Var.f127323d || (mo20599xaaa148a0 instanceof com.p176xb6135e39.p283xc50a8b8b.n8);
        java.lang.Object b17 = z4Var.b(b4Var);
        if (b17 == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        com.p176xb6135e39.p283xc50a8b8b.z4.i(b4Var.P(), mo20599xaaa148a0);
        ((java.util.List) b17).set(i17, mo20599xaaa148a0);
        m20881x7bb163d5();
        return mo20599xaaa148a0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: getRepeatedFieldCount */
    public int mo20875x5353945(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        if (!b4Var.o()) {
            return super.mo20875x5353945(b4Var);
        }
        h(b4Var);
        com.p176xb6135e39.p283xc50a8b8b.z4 z4Var = this.f127027d;
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

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: hasField */
    public boolean mo20729x6ffae80(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        if (!b4Var.o()) {
            return super.mo20729x6ffae80(b4Var);
        }
        h(b4Var);
        com.p176xb6135e39.p283xc50a8b8b.z4 z4Var = this.f127027d;
        if (z4Var == null) {
            return false;
        }
        z4Var.getClass();
        if (b4Var.d1()) {
            throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return z4Var.f127320a.get(b4Var) != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: newBuilderForField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20722x4ae2dcac(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        return b4Var.o() ? new com.p176xb6135e39.p283xc50a8b8b.k4(b4Var.n()) : super.mo20722x4ae2dcac(b4Var);
    }
}
