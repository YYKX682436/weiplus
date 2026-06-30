package com.google.protobuf;

/* loaded from: classes16.dex */
public final class v4 extends com.google.protobuf.u4 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f45610a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f45611b = 0;

    static {
        f45610a = com.google.protobuf.ib.q(com.google.protobuf.u5.class.getDeclaredField("d"));
    }

    @Override // com.google.protobuf.u4
    public int a(java.util.Map.Entry entry) {
        return ((com.google.protobuf.b4) entry.getKey()).f44909e.f45563f;
    }

    @Override // com.google.protobuf.u4
    public java.lang.Object b(com.google.protobuf.t4 t4Var, com.google.protobuf.o8 o8Var, int i17) {
        com.google.protobuf.q4 q4Var = (com.google.protobuf.q4) t4Var;
        com.google.protobuf.r3 descriptorForType = ((com.google.protobuf.k8) o8Var).getDescriptorForType();
        q4Var.getClass();
        android.support.v4.media.f.a(q4Var.f45447d.get(new com.google.protobuf.o4(descriptorForType, i17)));
        return null;
    }

    @Override // com.google.protobuf.u4
    public com.google.protobuf.b5 c(java.lang.Object obj) {
        return (com.google.protobuf.b5) com.google.protobuf.ib.o(obj, f45610a);
    }

    @Override // com.google.protobuf.u4
    public com.google.protobuf.b5 d(java.lang.Object obj) {
        com.google.protobuf.b5 c17 = c(obj);
        if (!c17.f44922b) {
            return c17;
        }
        com.google.protobuf.b5 clone = c17.clone();
        com.google.protobuf.ib.w(obj, f45610a, clone);
        return clone;
    }

    @Override // com.google.protobuf.u4
    public boolean e(com.google.protobuf.o8 o8Var) {
        return o8Var instanceof com.google.protobuf.u5;
    }

    @Override // com.google.protobuf.u4
    public void f(java.lang.Object obj) {
        c(obj).s();
    }

    @Override // com.google.protobuf.u4
    public java.lang.Object g(com.google.protobuf.l9 l9Var, java.lang.Object obj, com.google.protobuf.t4 t4Var, com.google.protobuf.b5 b5Var, java.lang.Object obj2, com.google.protobuf.qa qaVar) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    @Override // com.google.protobuf.u4
    public void h(com.google.protobuf.l9 l9Var, java.lang.Object obj, com.google.protobuf.t4 t4Var, com.google.protobuf.b5 b5Var) {
        android.support.v4.media.f.a(obj);
        com.google.protobuf.t4 t4Var2 = com.google.protobuf.t4.f45543b;
        throw null;
    }

    @Override // com.google.protobuf.u4
    public void i(com.google.protobuf.y yVar, java.lang.Object obj, com.google.protobuf.t4 t4Var, com.google.protobuf.b5 b5Var) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    @Override // com.google.protobuf.u4
    public void j(com.google.protobuf.bc bcVar, java.util.Map.Entry entry) {
        com.google.protobuf.b4 b4Var = (com.google.protobuf.b4) entry.getKey();
        boolean d17 = b4Var.d1();
        com.google.protobuf.u1 u1Var = b4Var.f44909e;
        if (!d17) {
            switch (b4Var.P().ordinal()) {
                case 0:
                    ((com.google.protobuf.l0) bcVar).c(u1Var.f45563f, ((java.lang.Double) entry.getValue()).doubleValue());
                    return;
                case 1:
                    ((com.google.protobuf.l0) bcVar).g(u1Var.f45563f, ((java.lang.Float) entry.getValue()).floatValue());
                    return;
                case 2:
                    ((com.google.protobuf.l0) bcVar).j(u1Var.f45563f, ((java.lang.Long) entry.getValue()).longValue());
                    return;
                case 3:
                    ((com.google.protobuf.l0) bcVar).s(u1Var.f45563f, ((java.lang.Long) entry.getValue()).longValue());
                    return;
                case 4:
                    ((com.google.protobuf.l0) bcVar).i(u1Var.f45563f, ((java.lang.Integer) entry.getValue()).intValue());
                    return;
                case 5:
                    ((com.google.protobuf.l0) bcVar).f(u1Var.f45563f, ((java.lang.Long) entry.getValue()).longValue());
                    return;
                case 6:
                    ((com.google.protobuf.l0) bcVar).e(u1Var.f45563f, ((java.lang.Integer) entry.getValue()).intValue());
                    return;
                case 7:
                    ((com.google.protobuf.l0) bcVar).a(u1Var.f45563f, ((java.lang.Boolean) entry.getValue()).booleanValue());
                    return;
                case 8:
                    ((com.google.protobuf.l0) bcVar).f45273a.O(u1Var.f45563f, (java.lang.String) entry.getValue());
                    return;
                case 9:
                    int i17 = u1Var.f45563f;
                    java.lang.Object value = entry.getValue();
                    com.google.protobuf.l0 l0Var = (com.google.protobuf.l0) bcVar;
                    l0Var.getClass();
                    com.google.protobuf.k0 k0Var = l0Var.f45273a;
                    k0Var.Q(i17, 3);
                    ((com.google.protobuf.o8) value).writeTo(k0Var);
                    k0Var.Q(i17, 4);
                    return;
                case 10:
                    ((com.google.protobuf.l0) bcVar).f45273a.J(u1Var.f45563f, (com.google.protobuf.o8) entry.getValue());
                    return;
                case 11:
                    ((com.google.protobuf.l0) bcVar).b(u1Var.f45563f, (com.google.protobuf.y) entry.getValue());
                    return;
                case 12:
                    ((com.google.protobuf.l0) bcVar).r(u1Var.f45563f, ((java.lang.Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    ((com.google.protobuf.l0) bcVar).i(u1Var.f45563f, ((com.google.protobuf.y3) entry.getValue()).f45727e.f45220f);
                    return;
                case 14:
                    ((com.google.protobuf.l0) bcVar).m(u1Var.f45563f, ((java.lang.Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    ((com.google.protobuf.l0) bcVar).n(u1Var.f45563f, ((java.lang.Long) entry.getValue()).longValue());
                    return;
                case 16:
                    ((com.google.protobuf.l0) bcVar).o(u1Var.f45563f, ((java.lang.Integer) entry.getValue()).intValue());
                    return;
                case 17:
                    ((com.google.protobuf.l0) bcVar).p(u1Var.f45563f, ((java.lang.Long) entry.getValue()).longValue());
                    return;
                default:
                    return;
            }
        }
        int i18 = 0;
        switch (b4Var.P().ordinal()) {
            case 0:
                com.google.protobuf.s9.D(u1Var.f45563f, (java.util.List) entry.getValue(), bcVar, b4Var.C1());
                return;
            case 1:
                com.google.protobuf.s9.H(u1Var.f45563f, (java.util.List) entry.getValue(), bcVar, b4Var.C1());
                return;
            case 2:
                com.google.protobuf.s9.K(u1Var.f45563f, (java.util.List) entry.getValue(), bcVar, b4Var.C1());
                return;
            case 3:
                com.google.protobuf.s9.S(u1Var.f45563f, (java.util.List) entry.getValue(), bcVar, b4Var.C1());
                return;
            case 4:
                com.google.protobuf.s9.J(u1Var.f45563f, (java.util.List) entry.getValue(), bcVar, b4Var.C1());
                return;
            case 5:
                com.google.protobuf.s9.G(u1Var.f45563f, (java.util.List) entry.getValue(), bcVar, b4Var.C1());
                return;
            case 6:
                com.google.protobuf.s9.F(u1Var.f45563f, (java.util.List) entry.getValue(), bcVar, b4Var.C1());
                return;
            case 7:
                com.google.protobuf.s9.B(u1Var.f45563f, (java.util.List) entry.getValue(), bcVar, b4Var.C1());
                return;
            case 8:
                com.google.protobuf.s9.Q(u1Var.f45563f, (java.util.List) entry.getValue(), bcVar);
                return;
            case 9:
                int i19 = u1Var.f45563f;
                java.util.List list = (java.util.List) entry.getValue();
                java.lang.Class cls = com.google.protobuf.s9.f45498a;
                if (list == null || list.isEmpty()) {
                    return;
                }
                com.google.protobuf.l0 l0Var2 = (com.google.protobuf.l0) bcVar;
                l0Var2.getClass();
                while (i18 < list.size()) {
                    com.google.protobuf.o8 o8Var = (com.google.protobuf.o8) list.get(i18);
                    com.google.protobuf.k0 k0Var2 = l0Var2.f45273a;
                    k0Var2.Q(i19, 3);
                    o8Var.writeTo(k0Var2);
                    k0Var2.Q(i19, 4);
                    i18++;
                }
                return;
            case 10:
                int i27 = u1Var.f45563f;
                java.util.List list2 = (java.util.List) entry.getValue();
                java.lang.Class cls2 = com.google.protobuf.s9.f45498a;
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                com.google.protobuf.l0 l0Var3 = (com.google.protobuf.l0) bcVar;
                l0Var3.getClass();
                while (i18 < list2.size()) {
                    l0Var3.f45273a.J(i27, (com.google.protobuf.o8) list2.get(i18));
                    i18++;
                }
                return;
            case 11:
                com.google.protobuf.s9.C(u1Var.f45563f, (java.util.List) entry.getValue(), bcVar);
                return;
            case 12:
                com.google.protobuf.s9.R(u1Var.f45563f, (java.util.List) entry.getValue(), bcVar, b4Var.C1());
                return;
            case 13:
                java.util.List list3 = (java.util.List) entry.getValue();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Integer.valueOf(((com.google.protobuf.y3) it.next()).f45727e.f45220f));
                }
                com.google.protobuf.s9.J(u1Var.f45563f, arrayList, bcVar, b4Var.C1());
                return;
            case 14:
                com.google.protobuf.s9.M(u1Var.f45563f, (java.util.List) entry.getValue(), bcVar, b4Var.C1());
                return;
            case 15:
                com.google.protobuf.s9.N(u1Var.f45563f, (java.util.List) entry.getValue(), bcVar, b4Var.C1());
                return;
            case 16:
                com.google.protobuf.s9.O(u1Var.f45563f, (java.util.List) entry.getValue(), bcVar, b4Var.C1());
                return;
            case 17:
                com.google.protobuf.s9.P(u1Var.f45563f, (java.util.List) entry.getValue(), bcVar, b4Var.C1());
                return;
            default:
                return;
        }
    }
}
