package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class h5 extends com.google.protobuf.e {
    private final com.google.protobuf.n5 defaultInstance;
    protected com.google.protobuf.n5 instance;
    protected boolean isBuilt = false;

    public h5(com.google.protobuf.n5 n5Var) {
        this.defaultInstance = n5Var;
        this.instance = (com.google.protobuf.n5) n5Var.dynamicMethod(com.google.protobuf.l5.NEW_MUTABLE_INSTANCE);
    }

    public final void copyOnWrite() {
        if (this.isBuilt) {
            copyOnWriteInternal();
            this.isBuilt = false;
        }
    }

    public void copyOnWriteInternal() {
        com.google.protobuf.n5 n5Var = (com.google.protobuf.n5) this.instance.dynamicMethod(com.google.protobuf.l5.NEW_MUTABLE_INSTANCE);
        com.google.protobuf.n5 n5Var2 = this.instance;
        com.google.protobuf.h9 h9Var = com.google.protobuf.h9.f45166c;
        h9Var.getClass();
        h9Var.a(n5Var.getClass()).a(n5Var, n5Var2);
        this.instance = n5Var;
    }

    @Override // com.google.protobuf.p8
    public final boolean isInitialized() {
        return com.google.protobuf.n5.isInitialized(this.instance, false);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public final com.google.protobuf.n5 build() {
        com.google.protobuf.n5 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.e.newUninitializedMessageException(buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.n5 buildPartial() {
        if (this.isBuilt) {
            return this.instance;
        }
        this.instance.makeImmutable();
        this.isBuilt = true;
        return this.instance;
    }

    /* renamed from: clear, reason: merged with bridge method [inline-methods] */
    public final com.google.protobuf.h5 m35clear() {
        this.instance = (com.google.protobuf.n5) this.instance.dynamicMethod(com.google.protobuf.l5.NEW_MUTABLE_INSTANCE);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.n5 getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    @Override // com.google.protobuf.e
    public com.google.protobuf.h5 internalMergeFrom(com.google.protobuf.n5 n5Var) {
        return mergeFrom(n5Var);
    }

    /* renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.google.protobuf.h5 m38clone() {
        com.google.protobuf.h5 newBuilderForType = getDefaultInstanceForType().newBuilderForType();
        newBuilderForType.mergeFrom(buildPartial());
        return newBuilderForType;
    }

    public com.google.protobuf.h5 mergeFrom(com.google.protobuf.n5 n5Var) {
        copyOnWrite();
        com.google.protobuf.n5 n5Var2 = this.instance;
        com.google.protobuf.h9 h9Var = com.google.protobuf.h9.f45166c;
        h9Var.getClass();
        h9Var.a(n5Var2.getClass()).a(n5Var2, n5Var);
        return this;
    }

    @Override // com.google.protobuf.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.h5 m40mergeFrom(byte[] bArr, int i17, int i18, com.google.protobuf.t4 t4Var) {
        copyOnWrite();
        try {
            com.google.protobuf.h9 h9Var = com.google.protobuf.h9.f45166c;
            com.google.protobuf.n5 n5Var = this.instance;
            h9Var.getClass();
            h9Var.a(n5Var.getClass()).d(this.instance, bArr, i17, i17 + i18, new com.google.protobuf.j(t4Var));
            return this;
        } catch (com.google.protobuf.y6 e17) {
            throw e17;
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e18);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw com.google.protobuf.y6.i();
        }
    }

    @Override // com.google.protobuf.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.h5 m39mergeFrom(byte[] bArr, int i17, int i18) {
        return m15mergeFrom(bArr, i17, i18, com.google.protobuf.t4.a());
    }

    @Override // com.google.protobuf.n8
    public com.google.protobuf.h5 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        copyOnWrite();
        try {
            com.google.protobuf.h9 h9Var = com.google.protobuf.h9.f45166c;
            com.google.protobuf.n5 n5Var = this.instance;
            h9Var.getClass();
            com.google.protobuf.q9 a17 = h9Var.a(n5Var.getClass());
            com.google.protobuf.n5 n5Var2 = this.instance;
            com.google.protobuf.e0 e0Var = d0Var.f44994d;
            if (e0Var == null) {
                e0Var = new com.google.protobuf.e0(d0Var);
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
