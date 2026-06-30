package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class w4 extends com.p176xb6135e39.p283xc50a8b8b.u4 {
    @Override // com.p176xb6135e39.p283xc50a8b8b.u4
    public int a(java.util.Map.Entry entry) {
        return ((com.p176xb6135e39.p283xc50a8b8b.j5) entry.getKey()).f126769e;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.u4
    public java.lang.Object b(com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, com.p176xb6135e39.p283xc50a8b8b.o8 o8Var, int i17) {
        t4Var.getClass();
        return (com.p176xb6135e39.p283xc50a8b8b.k5) t4Var.f127078a.get(new com.p176xb6135e39.p283xc50a8b8b.s4(o8Var, i17));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.u4
    public com.p176xb6135e39.p283xc50a8b8b.b5 c(java.lang.Object obj) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        throw null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.u4
    public com.p176xb6135e39.p283xc50a8b8b.b5 d(java.lang.Object obj) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        throw null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.u4
    public boolean e(com.p176xb6135e39.p283xc50a8b8b.o8 o8Var) {
        return false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.u4
    public void f(java.lang.Object obj) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        throw null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.u4
    public java.lang.Object g(com.p176xb6135e39.p283xc50a8b8b.l9 l9Var, java.lang.Object obj, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, com.p176xb6135e39.p283xc50a8b8b.b5 b5Var, java.lang.Object obj2, com.p176xb6135e39.p283xc50a8b8b.qa qaVar) {
        java.lang.Object valueOf;
        java.lang.Object j17;
        java.util.ArrayList arrayList;
        com.p176xb6135e39.p283xc50a8b8b.k5 k5Var = (com.p176xb6135e39.p283xc50a8b8b.k5) obj;
        com.p176xb6135e39.p283xc50a8b8b.j5 j5Var = k5Var.f126797c;
        int i17 = j5Var.f126769e;
        boolean z17 = j5Var.f126771g;
        com.p176xb6135e39.p283xc50a8b8b.ub ubVar = j5Var.f126770f;
        if (z17 && j5Var.f126772h) {
            switch (ubVar.ordinal()) {
                case 0:
                    arrayList = new java.util.ArrayList();
                    l9Var.t(arrayList);
                    break;
                case 1:
                    arrayList = new java.util.ArrayList();
                    l9Var.q(arrayList);
                    break;
                case 2:
                    arrayList = new java.util.ArrayList();
                    l9Var.B(arrayList);
                    break;
                case 3:
                    arrayList = new java.util.ArrayList();
                    l9Var.A(arrayList);
                    break;
                case 4:
                    arrayList = new java.util.ArrayList();
                    l9Var.m(arrayList);
                    break;
                case 5:
                    arrayList = new java.util.ArrayList();
                    l9Var.G(arrayList);
                    break;
                case 6:
                    arrayList = new java.util.ArrayList();
                    l9Var.n(arrayList);
                    break;
                case 7:
                    arrayList = new java.util.ArrayList();
                    l9Var.f(arrayList);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    java.lang.String valueOf2 = java.lang.String.valueOf(j5Var.f126770f);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf2.length() + 23);
                    sb6.append("Type cannot be packed: ");
                    sb6.append(valueOf2);
                    throw new java.lang.IllegalStateException(sb6.toString());
                case 12:
                    arrayList = new java.util.ArrayList();
                    l9Var.H(arrayList);
                    break;
                case 13:
                    arrayList = new java.util.ArrayList();
                    l9Var.C(arrayList);
                    com.p176xb6135e39.p283xc50a8b8b.q6 q6Var = j5Var.f126768d;
                    java.lang.Class cls = com.p176xb6135e39.p283xc50a8b8b.s9.f127031a;
                    if (q6Var != null) {
                        int size = arrayList.size();
                        int i18 = 0;
                        for (int i19 = 0; i19 < size; i19++) {
                            int intValue = ((java.lang.Integer) arrayList.get(i19)).intValue();
                            if (q6Var.mo20884xd369f9d8(intValue) != null) {
                                if (i19 != i18) {
                                    arrayList.set(i18, java.lang.Integer.valueOf(intValue));
                                }
                                i18++;
                            } else {
                                obj2 = com.p176xb6135e39.p283xc50a8b8b.s9.A(i17, intValue, obj2, qaVar);
                            }
                        }
                        if (i18 != size) {
                            arrayList.subList(i18, size).clear();
                            break;
                        }
                    }
                    break;
                case 14:
                    arrayList = new java.util.ArrayList();
                    l9Var.w(arrayList);
                    break;
                case 15:
                    arrayList = new java.util.ArrayList();
                    l9Var.l(arrayList);
                    break;
                case 16:
                    arrayList = new java.util.ArrayList();
                    l9Var.i(arrayList);
                    break;
                case 17:
                    arrayList = new java.util.ArrayList();
                    l9Var.a(arrayList);
                    break;
            }
            b5Var.v(j5Var, arrayList);
        } else {
            if (ubVar != com.p176xb6135e39.p283xc50a8b8b.ub.f127128m) {
                int ordinal = ubVar.ordinal();
                com.p176xb6135e39.p283xc50a8b8b.o8 o8Var = k5Var.f126796b;
                switch (ordinal) {
                    case 0:
                        valueOf = java.lang.Double.valueOf(l9Var.mo20626xc851b907());
                        break;
                    case 1:
                        valueOf = java.lang.Float.valueOf(l9Var.mo20627xbc3e6666());
                        break;
                    case 2:
                        valueOf = java.lang.Long.valueOf(l9Var.u());
                        break;
                    case 3:
                        valueOf = java.lang.Long.valueOf(l9Var.j());
                        break;
                    case 4:
                        valueOf = java.lang.Integer.valueOf(l9Var.F());
                        break;
                    case 5:
                        valueOf = java.lang.Long.valueOf(l9Var.v());
                        break;
                    case 6:
                        valueOf = java.lang.Integer.valueOf(l9Var.J());
                        break;
                    case 7:
                        valueOf = java.lang.Boolean.valueOf(l9Var.y());
                        break;
                    case 8:
                        valueOf = l9Var.L();
                        break;
                    case 9:
                        valueOf = l9Var.D(o8Var.getClass(), t4Var);
                        break;
                    case 10:
                        valueOf = l9Var.I(o8Var.getClass(), t4Var);
                        break;
                    case 11:
                        valueOf = l9Var.h();
                        break;
                    case 12:
                        valueOf = java.lang.Integer.valueOf(l9Var.c());
                        break;
                    case 13:
                        throw new java.lang.IllegalStateException("Shouldn't reach here.");
                    case 14:
                        valueOf = java.lang.Integer.valueOf(l9Var.N());
                        break;
                    case 15:
                        valueOf = java.lang.Long.valueOf(l9Var.b());
                        break;
                    case 16:
                        valueOf = java.lang.Integer.valueOf(l9Var.e());
                        break;
                    case 17:
                        valueOf = java.lang.Long.valueOf(l9Var.K());
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            } else {
                int F = l9Var.F();
                if (j5Var.f126768d.mo20884xd369f9d8(F) == null) {
                    return com.p176xb6135e39.p283xc50a8b8b.s9.A(i17, F, obj2, qaVar);
                }
                valueOf = java.lang.Integer.valueOf(F);
            }
            if (j5Var.f126771g) {
                b5Var.a(j5Var, valueOf);
            } else {
                int ordinal2 = j5Var.f126770f.ordinal();
                if ((ordinal2 == 9 || ordinal2 == 10) && (j17 = b5Var.j(j5Var)) != null) {
                    valueOf = com.p176xb6135e39.p283xc50a8b8b.w6.c(j17, valueOf);
                }
                b5Var.v(j5Var, valueOf);
            }
        }
        return obj2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.u4
    public void h(com.p176xb6135e39.p283xc50a8b8b.l9 l9Var, java.lang.Object obj, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, com.p176xb6135e39.p283xc50a8b8b.b5 b5Var) {
        com.p176xb6135e39.p283xc50a8b8b.k5 k5Var = (com.p176xb6135e39.p283xc50a8b8b.k5) obj;
        b5Var.v(k5Var.f126797c, l9Var.I(k5Var.f126796b.getClass(), t4Var));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.u4
    public void i(com.p176xb6135e39.p283xc50a8b8b.y yVar, java.lang.Object obj, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, com.p176xb6135e39.p283xc50a8b8b.b5 b5Var) {
        byte[] bArr;
        com.p176xb6135e39.p283xc50a8b8b.k5 k5Var = (com.p176xb6135e39.p283xc50a8b8b.k5) obj;
        com.p176xb6135e39.p283xc50a8b8b.o8 mo20557x85702333 = k5Var.f126796b.mo20596xab31548().mo20557x85702333();
        int mo20907x35e001 = yVar.mo20907x35e001();
        if (mo20907x35e001 == 0) {
            bArr = com.p176xb6135e39.p283xc50a8b8b.w6.f127183c;
        } else {
            byte[] bArr2 = new byte[mo20907x35e001];
            yVar.j(bArr2, 0, 0, mo20907x35e001);
            bArr = bArr2;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        if (!wrap.hasArray()) {
            throw new java.lang.IllegalArgumentException("Direct buffers not yet supported");
        }
        com.p176xb6135e39.p283xc50a8b8b.m mVar = new com.p176xb6135e39.p283xc50a8b8b.m(wrap, true);
        com.p176xb6135e39.p283xc50a8b8b.h9 h9Var = com.p176xb6135e39.p283xc50a8b8b.h9.f126699c;
        h9Var.getClass();
        h9Var.a(mo20557x85702333.getClass()).h(mo20557x85702333, mVar, t4Var);
        b5Var.v(k5Var.f126797c, mo20557x85702333);
        if (mVar.o() != Integer.MAX_VALUE) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.a();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.u4
    public void j(com.p176xb6135e39.p283xc50a8b8b.bc bcVar, java.util.Map.Entry entry) {
        com.p176xb6135e39.p283xc50a8b8b.j5 j5Var = (com.p176xb6135e39.p283xc50a8b8b.j5) entry.getKey();
        boolean z17 = j5Var.f126771g;
        com.p176xb6135e39.p283xc50a8b8b.ub ubVar = j5Var.f126770f;
        int i17 = j5Var.f126769e;
        if (z17) {
            int ordinal = ubVar.ordinal();
            boolean z18 = j5Var.f126772h;
            switch (ordinal) {
                case 0:
                    com.p176xb6135e39.p283xc50a8b8b.s9.D(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 1:
                    com.p176xb6135e39.p283xc50a8b8b.s9.H(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 2:
                    com.p176xb6135e39.p283xc50a8b8b.s9.K(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 3:
                    com.p176xb6135e39.p283xc50a8b8b.s9.S(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 4:
                    com.p176xb6135e39.p283xc50a8b8b.s9.J(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 5:
                    com.p176xb6135e39.p283xc50a8b8b.s9.G(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 6:
                    com.p176xb6135e39.p283xc50a8b8b.s9.F(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 7:
                    com.p176xb6135e39.p283xc50a8b8b.s9.B(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 8:
                    com.p176xb6135e39.p283xc50a8b8b.s9.Q(i17, (java.util.List) entry.getValue(), bcVar);
                    return;
                case 9:
                    java.util.List list = (java.util.List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    com.p176xb6135e39.p283xc50a8b8b.s9.I(i17, (java.util.List) entry.getValue(), bcVar, com.p176xb6135e39.p283xc50a8b8b.h9.f126699c.a(list.get(0).getClass()));
                    return;
                case 10:
                    java.util.List list2 = (java.util.List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    com.p176xb6135e39.p283xc50a8b8b.s9.L(i17, (java.util.List) entry.getValue(), bcVar, com.p176xb6135e39.p283xc50a8b8b.h9.f126699c.a(list2.get(0).getClass()));
                    return;
                case 11:
                    com.p176xb6135e39.p283xc50a8b8b.s9.C(i17, (java.util.List) entry.getValue(), bcVar);
                    return;
                case 12:
                    com.p176xb6135e39.p283xc50a8b8b.s9.R(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 13:
                    com.p176xb6135e39.p283xc50a8b8b.s9.J(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 14:
                    com.p176xb6135e39.p283xc50a8b8b.s9.M(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 15:
                    com.p176xb6135e39.p283xc50a8b8b.s9.N(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 16:
                    com.p176xb6135e39.p283xc50a8b8b.s9.O(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 17:
                    com.p176xb6135e39.p283xc50a8b8b.s9.P(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                default:
                    return;
            }
        }
        switch (ubVar.ordinal()) {
            case 0:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).c(i17, ((java.lang.Double) entry.getValue()).doubleValue());
                return;
            case 1:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).g(i17, ((java.lang.Float) entry.getValue()).floatValue());
                return;
            case 2:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).j(i17, ((java.lang.Long) entry.getValue()).longValue());
                return;
            case 3:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).s(i17, ((java.lang.Long) entry.getValue()).longValue());
                return;
            case 4:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).i(i17, ((java.lang.Integer) entry.getValue()).intValue());
                return;
            case 5:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).f(i17, ((java.lang.Long) entry.getValue()).longValue());
                return;
            case 6:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).e(i17, ((java.lang.Integer) entry.getValue()).intValue());
                return;
            case 7:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).a(i17, ((java.lang.Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).f126806a.O(i17, (java.lang.String) entry.getValue());
                return;
            case 9:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).h(i17, entry.getValue(), com.p176xb6135e39.p283xc50a8b8b.h9.f126699c.a(entry.getValue().getClass()));
                return;
            case 10:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).k(i17, entry.getValue(), com.p176xb6135e39.p283xc50a8b8b.h9.f126699c.a(entry.getValue().getClass()));
                return;
            case 11:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).b(i17, (com.p176xb6135e39.p283xc50a8b8b.y) entry.getValue());
                return;
            case 12:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).r(i17, ((java.lang.Integer) entry.getValue()).intValue());
                return;
            case 13:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).i(i17, ((java.lang.Integer) entry.getValue()).intValue());
                return;
            case 14:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).m(i17, ((java.lang.Integer) entry.getValue()).intValue());
                return;
            case 15:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).n(i17, ((java.lang.Long) entry.getValue()).longValue());
                return;
            case 16:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).o(i17, ((java.lang.Integer) entry.getValue()).intValue());
                return;
            case 17:
                ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).p(i17, ((java.lang.Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
