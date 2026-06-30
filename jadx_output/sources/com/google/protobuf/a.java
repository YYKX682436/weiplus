package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class a extends com.google.protobuf.e implements com.google.protobuf.j8 {
    public static com.google.protobuf.pa newUninitializedMessageException(com.google.protobuf.k8 k8Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.protobuf.w8.b(k8Var, "", arrayList);
        return new com.google.protobuf.pa(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dispose() {
        throw new java.lang.IllegalStateException("Should be overridden by subclasses.");
    }

    public java.util.List<java.lang.String> findInitializationErrors() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.protobuf.w8.b(this, "", arrayList);
        return arrayList;
    }

    public java.lang.String getInitializationErrorString() {
        return com.google.protobuf.w8.a(findInitializationErrors());
    }

    public void markClean() {
        throw new java.lang.IllegalStateException("Should be overridden by subclasses.");
    }

    @Override // com.google.protobuf.e
    public boolean mergeDelimitedFrom(java.io.InputStream inputStream) {
        return super.mergeDelimitedFrom(inputStream);
    }

    @Override // com.google.protobuf.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.a mo16mergeFrom(com.google.protobuf.d0 d0Var) {
        return mergeFrom(d0Var, (com.google.protobuf.t4) com.google.protobuf.q4.f45446e);
    }

    public com.google.protobuf.a mergeUnknownFields(com.google.protobuf.wa waVar) {
        com.google.protobuf.wa unknownFields = getUnknownFields();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        b17.f(unknownFields);
        b17.f(waVar);
        setUnknownFields(b17.build());
        return this;
    }

    public java.lang.String toString() {
        java.util.logging.Logger logger = com.google.protobuf.ia.f45201a;
        com.google.protobuf.ga gaVar = com.google.protobuf.ga.f45143b;
        gaVar.getClass();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gaVar.a(this, new com.google.protobuf.ha(sb6, false, null));
            return sb6.toString();
        } catch (java.io.IOException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.e
    public com.google.protobuf.a internalMergeFrom(com.google.protobuf.f fVar) {
        return mergeFrom((com.google.protobuf.k8) fVar);
    }

    @Override // com.google.protobuf.e
    public boolean mergeDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return super.mergeDelimitedFrom(inputStream, t4Var);
    }

    @Override // com.google.protobuf.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.google.protobuf.a m14mergeFrom(byte[] bArr, int i17, int i18) {
        try {
            com.google.protobuf.d0 i19 = com.google.protobuf.d0.i(bArr, i17, i18, false);
            mo16mergeFrom(i19);
            i19.a(0);
            return this;
        } catch (com.google.protobuf.y6 e17) {
            throw e17;
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException(a("byte array"), e18);
        }
    }

    @Override // com.google.protobuf.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.google.protobuf.a m15mergeFrom(byte[] bArr, int i17, int i18, com.google.protobuf.t4 t4Var) {
        try {
            com.google.protobuf.d0 i19 = com.google.protobuf.d0.i(bArr, i17, i18, false);
            mergeFrom(i19, t4Var);
            i19.a(0);
            return this;
        } catch (com.google.protobuf.y6 e17) {
            throw e17;
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException(a("byte array"), e18);
        }
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        return mergeFrom(k8Var, (java.util.Map<com.google.protobuf.b4, java.lang.Object>) k8Var.getAllFields());
    }

    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var, java.util.Map<com.google.protobuf.b4, java.lang.Object> map) {
        if (k8Var.getDescriptorForType() == getDescriptorForType()) {
            for (java.util.Map.Entry<com.google.protobuf.b4, java.lang.Object> entry : map.entrySet()) {
                com.google.protobuf.b4 key = entry.getKey();
                if (key.d1()) {
                    java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        addRepeatedField(key, it.next());
                    }
                } else if (key.f44914m.f44859d == com.google.protobuf.z3.MESSAGE) {
                    com.google.protobuf.k8 k8Var2 = (com.google.protobuf.k8) getField(key);
                    if (k8Var2 == k8Var2.getDefaultInstanceForType()) {
                        setField(key, entry.getValue());
                    } else {
                        setField(key, k8Var2.newBuilderForType().mergeFrom(k8Var2).mergeFrom((com.google.protobuf.k8) entry.getValue()).build());
                    }
                } else {
                    setField(key, entry.getValue());
                }
            }
            mergeUnknownFields(k8Var.getUnknownFields());
            return this;
        }
        throw new java.lang.IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
    }

    @Override // com.google.protobuf.n8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        int F;
        d0Var.getClass();
        com.google.protobuf.wa unknownFields = getUnknownFields();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        b17.f(unknownFields);
        do {
            F = d0Var.F();
            if (F == 0) {
                break;
            }
        } while (com.google.protobuf.w8.c(d0Var, b17, t4Var, getDescriptorForType(), new com.google.protobuf.s8(this), F));
        setUnknownFields(b17.build());
        return this;
    }

    @Override // com.google.protobuf.e, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.y yVar) {
        return (com.google.protobuf.a) super.mergeFrom(yVar);
    }

    @Override // com.google.protobuf.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.a mo17mergeFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (com.google.protobuf.a) super.mo17mergeFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.a mo20mergeFrom(byte[] bArr) {
        return (com.google.protobuf.a) super.mo20mergeFrom(bArr);
    }

    @Override // com.google.protobuf.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.a mo21mergeFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (com.google.protobuf.a) super.mo21mergeFrom(bArr, t4Var);
    }

    @Override // com.google.protobuf.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.a mo18mergeFrom(java.io.InputStream inputStream) {
        return (com.google.protobuf.a) super.mo18mergeFrom(inputStream);
    }

    @Override // com.google.protobuf.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.a mo19mergeFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (com.google.protobuf.a) super.mo19mergeFrom(inputStream, t4Var);
    }
}
