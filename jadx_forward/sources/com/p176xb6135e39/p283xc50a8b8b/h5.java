package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class h5 extends com.p176xb6135e39.p283xc50a8b8b.e {

    /* renamed from: defaultInstance */
    private final com.p176xb6135e39.p283xc50a8b8b.n5 f7869x982efdf6;

    /* renamed from: instance */
    protected com.p176xb6135e39.p283xc50a8b8b.n5 f7870x21169495;

    /* renamed from: isBuilt */
    protected boolean f7871x7a847374 = false;

    public h5(com.p176xb6135e39.p283xc50a8b8b.n5 n5Var) {
        this.f7869x982efdf6 = n5Var;
        this.f7870x21169495 = (com.p176xb6135e39.p283xc50a8b8b.n5) n5Var.m20834x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5.NEW_MUTABLE_INSTANCE);
    }

    /* renamed from: copyOnWrite */
    public final void m20700x8b68b80b() {
        if (this.f7871x7a847374) {
            m20701x57fba7e8();
            this.f7871x7a847374 = false;
        }
    }

    /* renamed from: copyOnWriteInternal */
    public void m20701x57fba7e8() {
        com.p176xb6135e39.p283xc50a8b8b.n5 n5Var = (com.p176xb6135e39.p283xc50a8b8b.n5) this.f7870x21169495.m20834x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5.NEW_MUTABLE_INSTANCE);
        com.p176xb6135e39.p283xc50a8b8b.n5 n5Var2 = this.f7870x21169495;
        com.p176xb6135e39.p283xc50a8b8b.h9 h9Var = com.p176xb6135e39.p283xc50a8b8b.h9.f126699c;
        h9Var.getClass();
        h9Var.a(n5Var.getClass()).a(n5Var, n5Var2);
        this.f7870x21169495 = n5Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        return com.p176xb6135e39.p283xc50a8b8b.n5.m20805xf582434a(this.f7870x21169495, false);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public final com.p176xb6135e39.p283xc50a8b8b.n5 mo20556x59bc66e() {
        com.p176xb6135e39.p283xc50a8b8b.n5 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.e.m20623xb3590f03(mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: buildPartial */
    public com.p176xb6135e39.p283xc50a8b8b.n5 mo20557x85702333() {
        if (this.f7871x7a847374) {
            return this.f7870x21169495;
        }
        this.f7870x21169495.m20840xeb4bff34();
        this.f7871x7a847374 = true;
        return this.f7870x21169495;
    }

    /* renamed from: clear, reason: merged with bridge method [inline-methods] */
    public final com.p176xb6135e39.p283xc50a8b8b.h5 m20695x5a5b64d() {
        this.f7870x21169495 = (com.p176xb6135e39.p283xc50a8b8b.n5) this.f7870x21169495.m20834x12f0b200(com.p176xb6135e39.p283xc50a8b8b.l5.NEW_MUTABLE_INSTANCE);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.n5 mo20559x786693c3() {
        return this.f7869x982efdf6;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e
    /* renamed from: internalMergeFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.h5 mo20521xacfdf1c5(com.p176xb6135e39.p283xc50a8b8b.n5 n5Var) {
        return m20703x60f45402(n5Var);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.h5 m20699x5a5dd5d() {
        com.p176xb6135e39.p283xc50a8b8b.h5 mo20596xab31548 = mo20559x786693c3().mo20596xab31548();
        mo20596xab31548.m20703x60f45402(mo20557x85702333());
        return mo20596xab31548;
    }

    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.h5 m20703x60f45402(com.p176xb6135e39.p283xc50a8b8b.n5 n5Var) {
        m20700x8b68b80b();
        com.p176xb6135e39.p283xc50a8b8b.n5 n5Var2 = this.f7870x21169495;
        com.p176xb6135e39.p283xc50a8b8b.h9 h9Var = com.p176xb6135e39.p283xc50a8b8b.h9.f126699c;
        h9Var.getClass();
        h9Var.a(n5Var2.getClass()).a(n5Var2, n5Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.h5 m20705x60f45402(byte[] bArr, int i17, int i18, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        m20700x8b68b80b();
        try {
            com.p176xb6135e39.p283xc50a8b8b.h9 h9Var = com.p176xb6135e39.p283xc50a8b8b.h9.f126699c;
            com.p176xb6135e39.p283xc50a8b8b.n5 n5Var = this.f7870x21169495;
            h9Var.getClass();
            h9Var.a(n5Var.getClass()).d(this.f7870x21169495, bArr, i17, i17 + i18, new com.p176xb6135e39.p283xc50a8b8b.j(t4Var));
            return this;
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            throw e17;
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e18);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.h5 m20704x60f45402(byte[] bArr, int i17, int i18) {
        return m20546x60f45402(bArr, i17, i18, com.p176xb6135e39.p283xc50a8b8b.t4.a());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.h5 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        m20700x8b68b80b();
        try {
            com.p176xb6135e39.p283xc50a8b8b.h9 h9Var = com.p176xb6135e39.p283xc50a8b8b.h9.f126699c;
            com.p176xb6135e39.p283xc50a8b8b.n5 n5Var = this.f7870x21169495;
            h9Var.getClass();
            com.p176xb6135e39.p283xc50a8b8b.q9 a17 = h9Var.a(n5Var.getClass());
            com.p176xb6135e39.p283xc50a8b8b.n5 n5Var2 = this.f7870x21169495;
            com.p176xb6135e39.p283xc50a8b8b.e0 e0Var = d0Var.f126527d;
            if (e0Var == null) {
                e0Var = new com.p176xb6135e39.p283xc50a8b8b.e0(d0Var);
            }
            a17.h(n5Var2, e0Var, t4Var);
            return this;
        } catch (java.lang.RuntimeException e17) {
            if (e17.getCause() instanceof java.io.IOException) {
                throw ((java.io.IOException) e17.getCause());
            }
            throw e17;
        }
    }
}
