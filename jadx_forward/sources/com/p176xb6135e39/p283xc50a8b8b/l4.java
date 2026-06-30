package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class l4 extends com.p176xb6135e39.p283xc50a8b8b.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.r3 f126819d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.b5 f126820e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.b4[] f126821f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.wa f126822g;

    /* renamed from: h, reason: collision with root package name */
    public int f126823h = -1;

    public l4(com.p176xb6135e39.p283xc50a8b8b.r3 r3Var, com.p176xb6135e39.p283xc50a8b8b.b5 b5Var, com.p176xb6135e39.p283xc50a8b8b.b4[] b4VarArr, com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        this.f126819d = r3Var;
        this.f126820e = b5Var;
        this.f126821f = b4VarArr;
        this.f126822g = waVar;
    }

    public static com.p176xb6135e39.p283xc50a8b8b.l4 d(com.p176xb6135e39.p283xc50a8b8b.r3 r3Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.l4(r3Var, com.p176xb6135e39.p283xc50a8b8b.b5.f126453d, new com.p176xb6135e39.p283xc50a8b8b.b4[r3Var.f126999d.f()], com.p176xb6135e39.p283xc50a8b8b.wa.f127184e);
    }

    public static boolean e(com.p176xb6135e39.p283xc50a8b8b.r3 r3Var, com.p176xb6135e39.p283xc50a8b8b.b5 b5Var) {
        for (com.p176xb6135e39.p283xc50a8b8b.b4 b4Var : r3Var.n()) {
            if (b4Var.s() && !b5Var.n(b4Var)) {
                return false;
            }
        }
        return b5Var.o();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getAllFields */
    public java.util.Map mo20727xcee5d904() {
        return this.f126820e.i();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return d(this.f126819d);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return this.f126819d;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getField */
    public java.lang.Object mo20728x746c4744(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        if (b4Var.f126448n != this.f126819d) {
            throw new java.lang.IllegalArgumentException("FieldDescriptor does not match message type.");
        }
        java.lang.Object j17 = this.f126820e.j(b4Var);
        return j17 == null ? b4Var.d1() ? java.util.Collections.emptyList() : b4Var.f126447m.f126392d == com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE ? d(b4Var.n()) : b4Var.l() : j17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int m17;
        int mo20593x9d9c349b;
        int i17 = this.f126823h;
        if (i17 != -1) {
            return i17;
        }
        boolean z17 = this.f126819d.r().f126759f;
        com.p176xb6135e39.p283xc50a8b8b.wa waVar = this.f126822g;
        com.p176xb6135e39.p283xc50a8b8b.b5 b5Var = this.f126820e;
        if (z17) {
            m17 = b5Var.k();
            mo20593x9d9c349b = waVar.a();
        } else {
            m17 = b5Var.m();
            mo20593x9d9c349b = waVar.mo20593x9d9c349b();
        }
        int i18 = m17 + mo20593x9d9c349b;
        this.f126823h = i18;
        return i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f126822g;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: hasField */
    public boolean mo20729x6ffae80(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        if (b4Var.f126448n == this.f126819d) {
            return this.f126820e.n(b4Var);
        }
        throw new java.lang.IllegalArgumentException("FieldDescriptor does not match message type.");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public boolean mo20562xf582434a() {
        return e(this.f126819d, this.f126820e);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return new com.p176xb6135e39.p283xc50a8b8b.k4(this.f126819d);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20599xaaa148a0() {
        return new com.p176xb6135e39.p283xc50a8b8b.k4(this.f126819d).mo20527x60f45402(this);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        com.p176xb6135e39.p283xc50a8b8b.ba baVar;
        com.p176xb6135e39.p283xc50a8b8b.ba baVar2;
        boolean z17 = this.f126819d.r().f126759f;
        com.p176xb6135e39.p283xc50a8b8b.wa waVar = this.f126822g;
        int i17 = 0;
        com.p176xb6135e39.p283xc50a8b8b.b5 b5Var = this.f126820e;
        if (z17) {
            while (true) {
                baVar2 = b5Var.f126454a;
                if (i17 >= baVar2.d()) {
                    break;
                }
                b5Var.z(baVar2.c(i17), k0Var);
                i17++;
            }
            java.util.Iterator it = baVar2.e().iterator();
            while (it.hasNext()) {
                b5Var.z((java.util.Map.Entry) it.next(), k0Var);
            }
            waVar.c(k0Var);
            return;
        }
        while (true) {
            baVar = b5Var.f126454a;
            if (i17 >= baVar.d()) {
                break;
            }
            java.util.Map.Entry c17 = baVar.c(i17);
            com.p176xb6135e39.p283xc50a8b8b.b5.y((com.p176xb6135e39.p283xc50a8b8b.a5) c17.getKey(), c17.getValue(), k0Var);
            i17++;
        }
        for (java.util.Map.Entry entry : baVar.e()) {
            com.p176xb6135e39.p283xc50a8b8b.b5.y((com.p176xb6135e39.p283xc50a8b8b.a5) entry.getKey(), entry.getValue(), k0Var);
        }
        waVar.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return d(this.f126819d);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return new com.p176xb6135e39.p283xc50a8b8b.k4(this.f126819d);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20599xaaa148a0() {
        return new com.p176xb6135e39.p283xc50a8b8b.k4(this.f126819d).mo20527x60f45402(this);
    }
}
