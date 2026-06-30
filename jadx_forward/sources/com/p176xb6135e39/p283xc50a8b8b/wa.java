package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class wa implements com.p176xb6135e39.p283xc50a8b8b.o8 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.wa f127184e = new com.p176xb6135e39.p283xc50a8b8b.wa(java.util.Collections.emptyMap(), java.util.Collections.emptyMap());

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f127185d;

    static {
        new com.p176xb6135e39.p283xc50a8b8b.va();
    }

    public wa(java.util.Map map, java.util.Map map2) {
        this.f127185d = map;
    }

    public static com.p176xb6135e39.p283xc50a8b8b.sa b() {
        com.p176xb6135e39.p283xc50a8b8b.sa saVar = new com.p176xb6135e39.p283xc50a8b8b.sa();
        saVar.f127035d = java.util.Collections.emptyMap();
        saVar.f127036e = 0;
        saVar.f127037f = null;
        return saVar;
    }

    public int a() {
        int i17 = 0;
        for (java.util.Map.Entry entry : this.f127185d.entrySet()) {
            com.p176xb6135e39.p283xc50a8b8b.ua uaVar = (com.p176xb6135e39.p283xc50a8b8b.ua) entry.getValue();
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            java.util.Iterator it = uaVar.f127122d.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                i18 += (com.p176xb6135e39.p283xc50a8b8b.k0.p(1) * 2) + com.p176xb6135e39.p283xc50a8b8b.k0.q(2, intValue) + com.p176xb6135e39.p283xc50a8b8b.k0.c(3, (com.p176xb6135e39.p283xc50a8b8b.y) it.next());
            }
            i17 += i18;
        }
        return i17;
    }

    public void c(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        for (java.util.Map.Entry entry : this.f127185d.entrySet()) {
            com.p176xb6135e39.p283xc50a8b8b.ua uaVar = (com.p176xb6135e39.p283xc50a8b8b.ua) entry.getValue();
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            java.util.Iterator it = uaVar.f127122d.iterator();
            while (it.hasNext()) {
                k0Var.N(intValue, (com.p176xb6135e39.p283xc50a8b8b.y) it.next());
            }
        }
    }

    /* renamed from: equals */
    public boolean m20941xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.wa) {
            if (this.f127185d.equals(((com.p176xb6135e39.p283xc50a8b8b.wa) obj).f127185d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f127184e;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = 0;
        for (java.util.Map.Entry entry : this.f127185d.entrySet()) {
            com.p176xb6135e39.p283xc50a8b8b.ua uaVar = (com.p176xb6135e39.p283xc50a8b8b.ua) entry.getValue();
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            java.util.Iterator it = uaVar.f127119a.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                i18 += com.p176xb6135e39.p283xc50a8b8b.k0.s(intValue, ((java.lang.Long) it.next()).longValue());
            }
            java.util.Iterator it6 = uaVar.f127120b.iterator();
            while (it6.hasNext()) {
                i18 += com.p176xb6135e39.p283xc50a8b8b.k0.g(intValue, ((java.lang.Integer) it6.next()).intValue());
            }
            java.util.Iterator it7 = uaVar.f127121c.iterator();
            while (it7.hasNext()) {
                i18 += com.p176xb6135e39.p283xc50a8b8b.k0.h(intValue, ((java.lang.Long) it7.next()).longValue());
            }
            java.util.Iterator it8 = uaVar.f127122d.iterator();
            while (it8.hasNext()) {
                i18 += com.p176xb6135e39.p283xc50a8b8b.k0.c(intValue, (com.p176xb6135e39.p283xc50a8b8b.y) it8.next());
            }
            java.util.Iterator it9 = uaVar.f127123e.iterator();
            while (it9.hasNext()) {
                i18 += (com.p176xb6135e39.p283xc50a8b8b.k0.p(intValue) * 2) + ((com.p176xb6135e39.p283xc50a8b8b.wa) it9.next()).mo20593x9d9c349b();
            }
            i17 += i18;
        }
        return i17;
    }

    /* renamed from: hashCode */
    public int m20942x8cdac1b() {
        return this.f127185d.hashCode();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public boolean mo20562xf582434a() {
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return b();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20599xaaa148a0() {
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = b();
        b17.f(this);
        return b17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: toByteArray */
    public byte[] mo20648x5f01b1f6() {
        try {
            int mo20593x9d9c349b = mo20593x9d9c349b();
            byte[] bArr = new byte[mo20593x9d9c349b];
            java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
            com.p176xb6135e39.p283xc50a8b8b.h0 h0Var = new com.p176xb6135e39.p283xc50a8b8b.h0(bArr, 0, mo20593x9d9c349b);
            mo20600x5f8be6ba(h0Var);
            if (h0Var.v() == 0) {
                return bArr;
            }
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e17);
        }
    }

    /* renamed from: toString */
    public java.lang.String m20943x9616526c() {
        java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.ia.f126734a;
        com.p176xb6135e39.p283xc50a8b8b.ga.f126676b.getClass();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.p176xb6135e39.p283xc50a8b8b.ga.d(this, new com.p176xb6135e39.p283xc50a8b8b.ha(sb6, false, null));
            return sb6.toString();
        } catch (java.io.IOException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        for (java.util.Map.Entry entry : this.f127185d.entrySet()) {
            com.p176xb6135e39.p283xc50a8b8b.ua uaVar = (com.p176xb6135e39.p283xc50a8b8b.ua) entry.getValue();
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            java.util.Iterator it = uaVar.f127119a.iterator();
            while (it.hasNext()) {
                k0Var.T(intValue, ((java.lang.Long) it.next()).longValue());
            }
            java.util.Iterator it6 = uaVar.f127120b.iterator();
            while (it6.hasNext()) {
                k0Var.C(intValue, ((java.lang.Integer) it6.next()).intValue());
            }
            java.util.Iterator it7 = uaVar.f127121c.iterator();
            while (it7.hasNext()) {
                k0Var.E(intValue, ((java.lang.Long) it7.next()).longValue());
            }
            java.util.Iterator it8 = uaVar.f127122d.iterator();
            while (it8.hasNext()) {
                k0Var.z(intValue, (com.p176xb6135e39.p283xc50a8b8b.y) it8.next());
            }
            for (com.p176xb6135e39.p283xc50a8b8b.wa waVar : uaVar.f127123e) {
                k0Var.Q(intValue, 3);
                waVar.mo20600x5f8be6ba(k0Var);
                k0Var.Q(intValue, 4);
            }
        }
    }
}
