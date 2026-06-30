package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class k4 extends com.p176xb6135e39.p283xc50a8b8b.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.r3 f126791d;

    /* renamed from: f, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.b4[] f126793f;

    /* renamed from: e, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.b5 f126792e = new com.p176xb6135e39.p283xc50a8b8b.b5();

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.wa f126794g = com.p176xb6135e39.p283xc50a8b8b.wa.f127184e;

    public k4(com.p176xb6135e39.p283xc50a8b8b.r3 r3Var) {
        this.f126791d = r3Var;
        this.f126793f = new com.p176xb6135e39.p283xc50a8b8b.b4[r3Var.f126999d.f()];
        if (r3Var.r().f126762i) {
            for (com.p176xb6135e39.p283xc50a8b8b.b4 b4Var : r3Var.n()) {
                if (b4Var.f126447m.f126392d == com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE) {
                    this.f126792e.v(b4Var, com.p176xb6135e39.p283xc50a8b8b.l4.d(b4Var.n()));
                } else {
                    this.f126792e.v(b4Var, b4Var.l());
                }
            }
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        e(b4Var);
        com.p176xb6135e39.p283xc50a8b8b.b5 b5Var = this.f126792e;
        if (b5Var.f126455b) {
            this.f126792e = b5Var.m20572x5a5dd5d();
        }
        this.f126792e.a(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.l4 mo20556x59bc66e() {
        if (mo20562xf582434a()) {
            return mo20557x85702333();
        }
        com.p176xb6135e39.p283xc50a8b8b.b5 b5Var = this.f126792e;
        com.p176xb6135e39.p283xc50a8b8b.b4[] b4VarArr = this.f126793f;
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) new com.p176xb6135e39.p283xc50a8b8b.l4(this.f126791d, b5Var, (com.p176xb6135e39.p283xc50a8b8b.b4[]) java.util.Arrays.copyOf(b4VarArr, b4VarArr.length), this.f126794g));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.l4 mo20557x85702333() {
        this.f126792e.s();
        com.p176xb6135e39.p283xc50a8b8b.b5 b5Var = this.f126792e;
        com.p176xb6135e39.p283xc50a8b8b.b4[] b4VarArr = this.f126793f;
        return new com.p176xb6135e39.p283xc50a8b8b.l4(this.f126791d, b5Var, (com.p176xb6135e39.p283xc50a8b8b.b4[]) java.util.Arrays.copyOf(b4VarArr, b4VarArr.length), this.f126794g);
    }

    /* renamed from: clone */
    public java.lang.Object m20726x5a5dd5d() {
        com.p176xb6135e39.p283xc50a8b8b.k4 k4Var = new com.p176xb6135e39.p283xc50a8b8b.k4(this.f126791d);
        k4Var.f126792e.t(this.f126792e);
        com.p176xb6135e39.p283xc50a8b8b.wa waVar = this.f126794g;
        com.p176xb6135e39.p283xc50a8b8b.wa waVar2 = k4Var.f126794g;
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        b17.f(waVar2);
        b17.f(waVar);
        k4Var.f126794g = b17.mo20556x59bc66e();
        com.p176xb6135e39.p283xc50a8b8b.b4[] b4VarArr = this.f126793f;
        java.lang.System.arraycopy(b4VarArr, 0, k4Var.f126793f, 0, b4VarArr.length);
        return k4Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.k4 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (!(k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.l4)) {
            return (com.p176xb6135e39.p283xc50a8b8b.k4) super.mo20527x60f45402(k8Var);
        }
        com.p176xb6135e39.p283xc50a8b8b.l4 l4Var = (com.p176xb6135e39.p283xc50a8b8b.l4) k8Var;
        if (l4Var.f126819d != this.f126791d) {
            throw new java.lang.IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
        }
        com.p176xb6135e39.p283xc50a8b8b.b5 b5Var = this.f126792e;
        if (b5Var.f126455b) {
            this.f126792e = b5Var.m20572x5a5dd5d();
        }
        this.f126792e.t(l4Var.f126820e);
        com.p176xb6135e39.p283xc50a8b8b.wa waVar = this.f126794g;
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        b17.f(waVar);
        b17.f(l4Var.f126822g);
        this.f126794g = b17.mo20556x59bc66e();
        int i17 = 0;
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.b4[] b4VarArr = this.f126793f;
            if (i17 >= b4VarArr.length) {
                return this;
            }
            com.p176xb6135e39.p283xc50a8b8b.b4 b4Var = b4VarArr[i17];
            com.p176xb6135e39.p283xc50a8b8b.b4[] b4VarArr2 = l4Var.f126821f;
            if (b4Var == null) {
                b4VarArr[i17] = b4VarArr2[i17];
            } else {
                com.p176xb6135e39.p283xc50a8b8b.b4 b4Var2 = b4VarArr2[i17];
                if (b4Var2 != null && b4Var != b4Var2) {
                    com.p176xb6135e39.p283xc50a8b8b.b5 b5Var2 = this.f126792e;
                    com.p176xb6135e39.p283xc50a8b8b.ba baVar = b5Var2.f126454a;
                    baVar.remove(b4Var);
                    if (baVar.isEmpty()) {
                        b5Var2.f126456c = false;
                    }
                    b4VarArr[i17] = b4VarArr2[i17];
                }
            }
            i17++;
        }
    }

    public final void e(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        if (b4Var.f126448n != this.f126791d) {
            throw new java.lang.IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getAllFields */
    public java.util.Map mo20727xcee5d904() {
        return this.f126792e.i();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return com.p176xb6135e39.p283xc50a8b8b.l4.d(this.f126791d);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return this.f126791d;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getField */
    public java.lang.Object mo20728x746c4744(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        e(b4Var);
        java.lang.Object j17 = this.f126792e.j(b4Var);
        return j17 == null ? b4Var.d1() ? java.util.Collections.emptyList() : b4Var.f126447m.f126392d == com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE ? com.p176xb6135e39.p283xc50a8b8b.l4.d(b4Var.n()) : b4Var.l() : j17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f126794g;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: hasField */
    public boolean mo20729x6ffae80(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        e(b4Var);
        return this.f126792e.n(b4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public boolean mo20562xf582434a() {
        return com.p176xb6135e39.p283xc50a8b8b.l4.e(this.f126791d, this.f126792e);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.a m135798xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        com.p176xb6135e39.p283xc50a8b8b.wa waVar2 = this.f126794g;
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        b17.f(waVar2);
        b17.f(waVar);
        this.f126794g = b17.mo20556x59bc66e();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: newBuilderForField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20722x4ae2dcac(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        e(b4Var);
        if (b4Var.f126447m.f126392d == com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE) {
            return new com.p176xb6135e39.p283xc50a8b8b.k4(b4Var.n());
        }
        throw new java.lang.IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        e(b4Var);
        com.p176xb6135e39.p283xc50a8b8b.b5 b5Var = this.f126792e;
        if (b5Var.f126455b) {
            this.f126792e = b5Var.m20572x5a5dd5d();
        }
        if (b4Var.f126447m == com.p176xb6135e39.p283xc50a8b8b.a4.f126390i) {
            if (b4Var.d1()) {
                for (java.lang.Object obj2 : (java.util.List) obj) {
                    java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
                    obj2.getClass();
                    if (!(obj2 instanceof com.p176xb6135e39.p283xc50a8b8b.y3)) {
                        throw new java.lang.IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
                    }
                }
            } else {
                java.nio.charset.Charset charset2 = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
                obj.getClass();
                if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.y3)) {
                    throw new java.lang.IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
                }
            }
        }
        com.p176xb6135e39.p283xc50a8b8b.g4 g4Var = b4Var.f126450p;
        if (g4Var != null) {
            com.p176xb6135e39.p283xc50a8b8b.b4[] b4VarArr = this.f126793f;
            int i17 = g4Var.f126660d;
            com.p176xb6135e39.p283xc50a8b8b.b4 b4Var2 = b4VarArr[i17];
            if (b4Var2 != null && b4Var2 != b4Var) {
                com.p176xb6135e39.p283xc50a8b8b.b5 b5Var2 = this.f126792e;
                com.p176xb6135e39.p283xc50a8b8b.ba baVar = b5Var2.f126454a;
                baVar.remove(b4Var2);
                if (baVar.isEmpty()) {
                    b5Var2.f126456c = false;
                }
            }
            b4VarArr[i17] = b4Var;
        } else if (b4Var.f126444g.m() == com.p176xb6135e39.p283xc50a8b8b.c4.PROTO3 && !b4Var.d1() && b4Var.f126447m.f126392d != com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE && obj.equals(b4Var.l())) {
            com.p176xb6135e39.p283xc50a8b8b.b5 b5Var3 = this.f126792e;
            com.p176xb6135e39.p283xc50a8b8b.ba baVar2 = b5Var3.f126454a;
            baVar2.remove(b4Var);
            if (baVar2.isEmpty()) {
                b5Var3.f126456c = false;
            }
            return this;
        }
        this.f126792e.v(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        this.f126794g = waVar;
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return com.p176xb6135e39.p283xc50a8b8b.l4.d(this.f126791d);
    }
}
