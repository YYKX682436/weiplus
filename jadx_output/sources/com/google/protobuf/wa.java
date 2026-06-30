package com.google.protobuf;

/* loaded from: classes16.dex */
public final class wa implements com.google.protobuf.o8 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.protobuf.wa f45651e = new com.google.protobuf.wa(java.util.Collections.emptyMap(), java.util.Collections.emptyMap());

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f45652d;

    static {
        new com.google.protobuf.va();
    }

    public wa(java.util.Map map, java.util.Map map2) {
        this.f45652d = map;
    }

    public static com.google.protobuf.sa b() {
        com.google.protobuf.sa saVar = new com.google.protobuf.sa();
        saVar.f45502d = java.util.Collections.emptyMap();
        saVar.f45503e = 0;
        saVar.f45504f = null;
        return saVar;
    }

    public int a() {
        int i17 = 0;
        for (java.util.Map.Entry entry : this.f45652d.entrySet()) {
            com.google.protobuf.ua uaVar = (com.google.protobuf.ua) entry.getValue();
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            java.util.Iterator it = uaVar.f45589d.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                i18 += (com.google.protobuf.k0.p(1) * 2) + com.google.protobuf.k0.q(2, intValue) + com.google.protobuf.k0.c(3, (com.google.protobuf.y) it.next());
            }
            i17 += i18;
        }
        return i17;
    }

    public void c(com.google.protobuf.k0 k0Var) {
        for (java.util.Map.Entry entry : this.f45652d.entrySet()) {
            com.google.protobuf.ua uaVar = (com.google.protobuf.ua) entry.getValue();
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            java.util.Iterator it = uaVar.f45589d.iterator();
            while (it.hasNext()) {
                k0Var.N(intValue, (com.google.protobuf.y) it.next());
            }
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.protobuf.wa) {
            if (this.f45652d.equals(((com.google.protobuf.wa) obj).f45652d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45651e;
    }

    @Override // com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = 0;
        for (java.util.Map.Entry entry : this.f45652d.entrySet()) {
            com.google.protobuf.ua uaVar = (com.google.protobuf.ua) entry.getValue();
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            java.util.Iterator it = uaVar.f45586a.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                i18 += com.google.protobuf.k0.s(intValue, ((java.lang.Long) it.next()).longValue());
            }
            java.util.Iterator it6 = uaVar.f45587b.iterator();
            while (it6.hasNext()) {
                i18 += com.google.protobuf.k0.g(intValue, ((java.lang.Integer) it6.next()).intValue());
            }
            java.util.Iterator it7 = uaVar.f45588c.iterator();
            while (it7.hasNext()) {
                i18 += com.google.protobuf.k0.h(intValue, ((java.lang.Long) it7.next()).longValue());
            }
            java.util.Iterator it8 = uaVar.f45589d.iterator();
            while (it8.hasNext()) {
                i18 += com.google.protobuf.k0.c(intValue, (com.google.protobuf.y) it8.next());
            }
            java.util.Iterator it9 = uaVar.f45590e.iterator();
            while (it9.hasNext()) {
                i18 += (com.google.protobuf.k0.p(intValue) * 2) + ((com.google.protobuf.wa) it9.next()).getSerializedSize();
            }
            i17 += i18;
        }
        return i17;
    }

    public int hashCode() {
        return this.f45652d.hashCode();
    }

    @Override // com.google.protobuf.p8
    public boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return b();
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 toBuilder() {
        com.google.protobuf.sa b17 = b();
        b17.f(this);
        return b17;
    }

    @Override // com.google.protobuf.o8
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            java.util.logging.Logger logger = com.google.protobuf.k0.f45246b;
            com.google.protobuf.h0 h0Var = new com.google.protobuf.h0(bArr, 0, serializedSize);
            writeTo(h0Var);
            if (h0Var.v() == 0) {
                return bArr;
            }
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e17);
        }
    }

    public java.lang.String toString() {
        java.util.logging.Logger logger = com.google.protobuf.ia.f45201a;
        com.google.protobuf.ga.f45143b.getClass();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.google.protobuf.ga.d(this, new com.google.protobuf.ha(sb6, false, null));
            return sb6.toString();
        } catch (java.io.IOException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }

    @Override // com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        for (java.util.Map.Entry entry : this.f45652d.entrySet()) {
            com.google.protobuf.ua uaVar = (com.google.protobuf.ua) entry.getValue();
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            java.util.Iterator it = uaVar.f45586a.iterator();
            while (it.hasNext()) {
                k0Var.T(intValue, ((java.lang.Long) it.next()).longValue());
            }
            java.util.Iterator it6 = uaVar.f45587b.iterator();
            while (it6.hasNext()) {
                k0Var.C(intValue, ((java.lang.Integer) it6.next()).intValue());
            }
            java.util.Iterator it7 = uaVar.f45588c.iterator();
            while (it7.hasNext()) {
                k0Var.E(intValue, ((java.lang.Long) it7.next()).longValue());
            }
            java.util.Iterator it8 = uaVar.f45589d.iterator();
            while (it8.hasNext()) {
                k0Var.z(intValue, (com.google.protobuf.y) it8.next());
            }
            for (com.google.protobuf.wa waVar : uaVar.f45590e) {
                k0Var.Q(intValue, 3);
                waVar.writeTo(k0Var);
                k0Var.Q(intValue, 4);
            }
        }
    }
}
