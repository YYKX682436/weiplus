package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class a extends com.p176xb6135e39.p283xc50a8b8b.e implements com.p176xb6135e39.p283xc50a8b8b.j8 {
    /* renamed from: newUninitializedMessageException */
    public static com.p176xb6135e39.p283xc50a8b8b.pa m20517xb3590f03(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p176xb6135e39.p283xc50a8b8b.w8.b(k8Var, "", arrayList);
        return new com.p176xb6135e39.p283xc50a8b8b.pa(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dispose */
    public void mo20518x63a5261f() {
        throw new java.lang.IllegalStateException("Should be overridden by subclasses.");
    }

    /* renamed from: findInitializationErrors */
    public java.util.List<java.lang.String> m20519xb010ef84() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p176xb6135e39.p283xc50a8b8b.w8.b(this, "", arrayList);
        return arrayList;
    }

    /* renamed from: getInitializationErrorString */
    public java.lang.String m20520x23ada0c3() {
        return com.p176xb6135e39.p283xc50a8b8b.w8.a(m20519xb010ef84());
    }

    /* renamed from: markClean */
    public void mo20522xc674f77c() {
        throw new java.lang.IllegalStateException("Should be overridden by subclasses.");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e
    /* renamed from: mergeDelimitedFrom */
    public boolean mo20523x92b73eb(java.io.InputStream inputStream) {
        return super.mo20523x92b73eb(inputStream);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20537x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return mo20526x60f45402(d0Var, (com.p176xb6135e39.p283xc50a8b8b.t4) com.p176xb6135e39.p283xc50a8b8b.q4.f126979e);
    }

    /* renamed from: mergeUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20547xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed = mo20594xc6bf3ed();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        b17.f(mo20594xc6bf3ed);
        b17.f(waVar);
        mo20564x9f425a61(b17.mo20556x59bc66e());
        return this;
    }

    /* renamed from: toString */
    public java.lang.String m20548x9616526c() {
        java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.ia.f126734a;
        com.p176xb6135e39.p283xc50a8b8b.ga gaVar = com.p176xb6135e39.p283xc50a8b8b.ga.f126676b;
        gaVar.getClass();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gaVar.a(this, new com.p176xb6135e39.p283xc50a8b8b.ha(sb6, false, null));
            return sb6.toString();
        } catch (java.io.IOException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p176xb6135e39.p283xc50a8b8b.e
    /* renamed from: internalMergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20521xacfdf1c5(com.p176xb6135e39.p283xc50a8b8b.f fVar) {
        return mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) fVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e
    /* renamed from: mergeDelimitedFrom */
    public boolean mo20524x92b73eb(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return super.mo20524x92b73eb(inputStream, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.a m20545x60f45402(byte[] bArr, int i17, int i18) {
        try {
            com.p176xb6135e39.p283xc50a8b8b.d0 i19 = com.p176xb6135e39.p283xc50a8b8b.d0.i(bArr, i17, i18, false);
            mo20537x60f45402(i19);
            i19.a(0);
            return this;
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            throw e17;
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException(a("byte array"), e18);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.a m20546x60f45402(byte[] bArr, int i17, int i18, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        try {
            com.p176xb6135e39.p283xc50a8b8b.d0 i19 = com.p176xb6135e39.p283xc50a8b8b.d0.i(bArr, i17, i18, false);
            mo20526x60f45402(i19, t4Var);
            i19.a(0);
            return this;
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            throw e17;
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException(a("byte array"), e18);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        return m20528x60f45402(k8Var, (java.util.Map<com.p176xb6135e39.p283xc50a8b8b.b4, java.lang.Object>) k8Var.mo20727xcee5d904());
    }

    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a m20528x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var, java.util.Map<com.p176xb6135e39.p283xc50a8b8b.b4, java.lang.Object> map) {
        if (k8Var.mo20560x84bb647e() == mo20560x84bb647e()) {
            for (java.util.Map.Entry<com.p176xb6135e39.p283xc50a8b8b.b4, java.lang.Object> entry : map.entrySet()) {
                com.p176xb6135e39.p283xc50a8b8b.b4 key = entry.getKey();
                if (key.d1()) {
                    java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        mo20555x8e2f927f(key, it.next());
                    }
                } else if (key.f126447m.f126392d == com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE) {
                    com.p176xb6135e39.p283xc50a8b8b.k8 k8Var2 = (com.p176xb6135e39.p283xc50a8b8b.k8) mo20728x746c4744(key);
                    if (k8Var2 == k8Var2.mo20559x786693c3()) {
                        mo20563x52fa61b8(key, entry.getValue());
                    } else {
                        mo20563x52fa61b8(key, k8Var2.mo20596xab31548().mo20527x60f45402(k8Var2).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) entry.getValue()).mo20556x59bc66e());
                    }
                } else {
                    mo20563x52fa61b8(key, entry.getValue());
                }
            }
            mo20547xba8a5e4b(k8Var.mo20594xc6bf3ed());
            return this;
        }
        throw new java.lang.IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        int F;
        d0Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed = mo20594xc6bf3ed();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        b17.f(mo20594xc6bf3ed);
        do {
            F = d0Var.F();
            if (F == 0) {
                break;
            }
        } while (com.p176xb6135e39.p283xc50a8b8b.w8.c(d0Var, b17, t4Var, mo20560x84bb647e(), new com.p176xb6135e39.p283xc50a8b8b.s8(this), F));
        mo20564x9f425a61(b17.mo20556x59bc66e());
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20529x60f45402(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (com.p176xb6135e39.p283xc50a8b8b.a) super.mo20529x60f45402(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20538x60f45402(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (com.p176xb6135e39.p283xc50a8b8b.a) super.mo20538x60f45402(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20541x60f45402(byte[] bArr) {
        return (com.p176xb6135e39.p283xc50a8b8b.a) super.mo20541x60f45402(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20544x60f45402(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (com.p176xb6135e39.p283xc50a8b8b.a) super.mo20544x60f45402(bArr, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20539x60f45402(java.io.InputStream inputStream) {
        return (com.p176xb6135e39.p283xc50a8b8b.a) super.mo20539x60f45402(inputStream);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20540x60f45402(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (com.p176xb6135e39.p283xc50a8b8b.a) super.mo20540x60f45402(inputStream, t4Var);
    }
}
