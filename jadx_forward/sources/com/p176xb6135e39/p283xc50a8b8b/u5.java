package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class u5 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.b5 f127111d;

    public u5() {
        this.f127111d = new com.p176xb6135e39.p283xc50a8b8b.b5();
    }

    private void j(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        if (b4Var.f126448n != mo20560x84bb647e()) {
            throw new java.lang.IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    public boolean f() {
        return this.f127111d.o();
    }

    public int g() {
        return this.f127111d.m();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getAllFields */
    public java.util.Map mo20727xcee5d904() {
        java.util.Map d17;
        d17 = d(false);
        d17.putAll(h());
        return java.util.Collections.unmodifiableMap(d17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: getAllFieldsRaw */
    public java.util.Map mo20774xeda29884() {
        java.util.Map d17;
        d17 = d(false);
        d17.putAll(h());
        return java.util.Collections.unmodifiableMap(d17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getField */
    public java.lang.Object mo20728x746c4744(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        if (!b4Var.o()) {
            return super.mo20728x746c4744(b4Var);
        }
        j(b4Var);
        java.lang.Object j17 = this.f127111d.j(b4Var);
        return j17 == null ? b4Var.d1() ? java.util.Collections.emptyList() : b4Var.f126447m.f126392d == com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE ? com.p176xb6135e39.p283xc50a8b8b.l4.d(b4Var.n()) : b4Var.l() : j17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: getRepeatedField */
    public java.lang.Object mo20777x4f52c9ea(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17) {
        if (!b4Var.o()) {
            return super.mo20777x4f52c9ea(b4Var, i17);
        }
        j(b4Var);
        com.p176xb6135e39.p283xc50a8b8b.b5 b5Var = this.f127111d;
        b5Var.getClass();
        if (!b4Var.d1()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object j17 = b5Var.j(b4Var);
        if (j17 != null) {
            return ((java.util.List) j17).get(i17);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: getRepeatedFieldCount */
    public int mo20778x5353945(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        if (!b4Var.o()) {
            return super.mo20778x5353945(b4Var);
        }
        j(b4Var);
        com.p176xb6135e39.p283xc50a8b8b.b5 b5Var = this.f127111d;
        b5Var.getClass();
        if (!b4Var.d1()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object j17 = b5Var.j(b4Var);
        if (j17 == null) {
            return 0;
        }
        return ((java.util.List) j17).size();
    }

    public java.util.Map h() {
        return this.f127111d.i();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: hasField */
    public boolean mo20729x6ffae80(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        if (!b4Var.o()) {
            return super.mo20729x6ffae80(b4Var);
        }
        j(b4Var);
        return this.f127111d.n(b4Var);
    }

    public com.p176xb6135e39.p283xc50a8b8b.t5 i() {
        return new com.p176xb6135e39.p283xc50a8b8b.t5(this, false, null);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: makeExtensionsImmutable */
    public void mo20781x1ff81300() {
        this.f127111d.s();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: parseUnknownField */
    public boolean mo20783x10621d23(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.sa saVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, int i17) {
        d0Var.getClass();
        return com.p176xb6135e39.p283xc50a8b8b.w8.c(d0Var, saVar, t4Var, mo20560x84bb647e(), new com.p176xb6135e39.p283xc50a8b8b.t8(this.f127111d), i17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: parseUnknownFieldProto3 */
    public boolean mo20784x9e10d64e(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.sa saVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, int i17) {
        return mo20783x10621d23(d0Var, saVar, t4Var, i17);
    }

    public u5(com.p176xb6135e39.p283xc50a8b8b.s5 s5Var) {
        super(s5Var);
        com.p176xb6135e39.p283xc50a8b8b.b5 b5Var;
        com.p176xb6135e39.p283xc50a8b8b.z4 z4Var = s5Var.f127027d;
        if (z4Var == null) {
            b5Var = com.p176xb6135e39.p283xc50a8b8b.b5.f126453d;
        } else if (z4Var.f127320a.isEmpty()) {
            b5Var = com.p176xb6135e39.p283xc50a8b8b.b5.f126453d;
        } else {
            z4Var.f127322c = false;
            com.p176xb6135e39.p283xc50a8b8b.ba baVar = z4Var.f127320a;
            if (z4Var.f127323d) {
                baVar = com.p176xb6135e39.p283xc50a8b8b.b5.c(baVar, false);
                com.p176xb6135e39.p283xc50a8b8b.z4.g(baVar);
            }
            com.p176xb6135e39.p283xc50a8b8b.b5 b5Var2 = new com.p176xb6135e39.p283xc50a8b8b.b5(baVar);
            b5Var2.f126456c = z4Var.f127321b;
            b5Var = b5Var2;
        }
        this.f127111d = b5Var;
    }
}
