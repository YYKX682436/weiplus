package com.google.protobuf;

/* loaded from: classes16.dex */
public final class w4 extends com.google.protobuf.u4 {
    @Override // com.google.protobuf.u4
    public int a(java.util.Map.Entry entry) {
        return ((com.google.protobuf.j5) entry.getKey()).f45236e;
    }

    @Override // com.google.protobuf.u4
    public java.lang.Object b(com.google.protobuf.t4 t4Var, com.google.protobuf.o8 o8Var, int i17) {
        t4Var.getClass();
        return (com.google.protobuf.k5) t4Var.f45545a.get(new com.google.protobuf.s4(o8Var, i17));
    }

    @Override // com.google.protobuf.u4
    public com.google.protobuf.b5 c(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    @Override // com.google.protobuf.u4
    public com.google.protobuf.b5 d(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    @Override // com.google.protobuf.u4
    public boolean e(com.google.protobuf.o8 o8Var) {
        return false;
    }

    @Override // com.google.protobuf.u4
    public void f(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    @Override // com.google.protobuf.u4
    public java.lang.Object g(com.google.protobuf.l9 l9Var, java.lang.Object obj, com.google.protobuf.t4 t4Var, com.google.protobuf.b5 b5Var, java.lang.Object obj2, com.google.protobuf.qa qaVar) {
        java.lang.Object valueOf;
        java.lang.Object j17;
        java.util.ArrayList arrayList;
        com.google.protobuf.k5 k5Var = (com.google.protobuf.k5) obj;
        com.google.protobuf.j5 j5Var = k5Var.f45264c;
        int i17 = j5Var.f45236e;
        boolean z17 = j5Var.f45238g;
        com.google.protobuf.ub ubVar = j5Var.f45237f;
        if (z17 && j5Var.f45239h) {
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
                    java.lang.String valueOf2 = java.lang.String.valueOf(j5Var.f45237f);
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
                    com.google.protobuf.q6 q6Var = j5Var.f45235d;
                    java.lang.Class cls = com.google.protobuf.s9.f45498a;
                    if (q6Var != null) {
                        int size = arrayList.size();
                        int i18 = 0;
                        for (int i19 = 0; i19 < size; i19++) {
                            int intValue = ((java.lang.Integer) arrayList.get(i19)).intValue();
                            if (q6Var.findValueByNumber(intValue) != null) {
                                if (i19 != i18) {
                                    arrayList.set(i18, java.lang.Integer.valueOf(intValue));
                                }
                                i18++;
                            } else {
                                obj2 = com.google.protobuf.s9.A(i17, intValue, obj2, qaVar);
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
            if (ubVar != com.google.protobuf.ub.f45595m) {
                int ordinal = ubVar.ordinal();
                com.google.protobuf.o8 o8Var = k5Var.f45263b;
                switch (ordinal) {
                    case 0:
                        valueOf = java.lang.Double.valueOf(l9Var.readDouble());
                        break;
                    case 1:
                        valueOf = java.lang.Float.valueOf(l9Var.readFloat());
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
                if (j5Var.f45235d.findValueByNumber(F) == null) {
                    return com.google.protobuf.s9.A(i17, F, obj2, qaVar);
                }
                valueOf = java.lang.Integer.valueOf(F);
            }
            if (j5Var.f45238g) {
                b5Var.a(j5Var, valueOf);
            } else {
                int ordinal2 = j5Var.f45237f.ordinal();
                if ((ordinal2 == 9 || ordinal2 == 10) && (j17 = b5Var.j(j5Var)) != null) {
                    valueOf = com.google.protobuf.w6.c(j17, valueOf);
                }
                b5Var.v(j5Var, valueOf);
            }
        }
        return obj2;
    }

    @Override // com.google.protobuf.u4
    public void h(com.google.protobuf.l9 l9Var, java.lang.Object obj, com.google.protobuf.t4 t4Var, com.google.protobuf.b5 b5Var) {
        com.google.protobuf.k5 k5Var = (com.google.protobuf.k5) obj;
        b5Var.v(k5Var.f45264c, l9Var.I(k5Var.f45263b.getClass(), t4Var));
    }

    @Override // com.google.protobuf.u4
    public void i(com.google.protobuf.y yVar, java.lang.Object obj, com.google.protobuf.t4 t4Var, com.google.protobuf.b5 b5Var) {
        byte[] bArr;
        com.google.protobuf.k5 k5Var = (com.google.protobuf.k5) obj;
        com.google.protobuf.o8 buildPartial = k5Var.f45263b.newBuilderForType().buildPartial();
        int size = yVar.size();
        if (size == 0) {
            bArr = com.google.protobuf.w6.f45650c;
        } else {
            byte[] bArr2 = new byte[size];
            yVar.j(bArr2, 0, 0, size);
            bArr = bArr2;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        if (!wrap.hasArray()) {
            throw new java.lang.IllegalArgumentException("Direct buffers not yet supported");
        }
        com.google.protobuf.m mVar = new com.google.protobuf.m(wrap, true);
        com.google.protobuf.h9 h9Var = com.google.protobuf.h9.f45166c;
        h9Var.getClass();
        h9Var.a(buildPartial.getClass()).h(buildPartial, mVar, t4Var);
        b5Var.v(k5Var.f45264c, buildPartial);
        if (mVar.o() != Integer.MAX_VALUE) {
            throw com.google.protobuf.y6.a();
        }
    }

    @Override // com.google.protobuf.u4
    public void j(com.google.protobuf.bc bcVar, java.util.Map.Entry entry) {
        com.google.protobuf.j5 j5Var = (com.google.protobuf.j5) entry.getKey();
        boolean z17 = j5Var.f45238g;
        com.google.protobuf.ub ubVar = j5Var.f45237f;
        int i17 = j5Var.f45236e;
        if (z17) {
            int ordinal = ubVar.ordinal();
            boolean z18 = j5Var.f45239h;
            switch (ordinal) {
                case 0:
                    com.google.protobuf.s9.D(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 1:
                    com.google.protobuf.s9.H(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 2:
                    com.google.protobuf.s9.K(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 3:
                    com.google.protobuf.s9.S(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 4:
                    com.google.protobuf.s9.J(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 5:
                    com.google.protobuf.s9.G(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 6:
                    com.google.protobuf.s9.F(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 7:
                    com.google.protobuf.s9.B(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 8:
                    com.google.protobuf.s9.Q(i17, (java.util.List) entry.getValue(), bcVar);
                    return;
                case 9:
                    java.util.List list = (java.util.List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    com.google.protobuf.s9.I(i17, (java.util.List) entry.getValue(), bcVar, com.google.protobuf.h9.f45166c.a(list.get(0).getClass()));
                    return;
                case 10:
                    java.util.List list2 = (java.util.List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    com.google.protobuf.s9.L(i17, (java.util.List) entry.getValue(), bcVar, com.google.protobuf.h9.f45166c.a(list2.get(0).getClass()));
                    return;
                case 11:
                    com.google.protobuf.s9.C(i17, (java.util.List) entry.getValue(), bcVar);
                    return;
                case 12:
                    com.google.protobuf.s9.R(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 13:
                    com.google.protobuf.s9.J(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 14:
                    com.google.protobuf.s9.M(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 15:
                    com.google.protobuf.s9.N(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 16:
                    com.google.protobuf.s9.O(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                case 17:
                    com.google.protobuf.s9.P(i17, (java.util.List) entry.getValue(), bcVar, z18);
                    return;
                default:
                    return;
            }
        }
        switch (ubVar.ordinal()) {
            case 0:
                ((com.google.protobuf.l0) bcVar).c(i17, ((java.lang.Double) entry.getValue()).doubleValue());
                return;
            case 1:
                ((com.google.protobuf.l0) bcVar).g(i17, ((java.lang.Float) entry.getValue()).floatValue());
                return;
            case 2:
                ((com.google.protobuf.l0) bcVar).j(i17, ((java.lang.Long) entry.getValue()).longValue());
                return;
            case 3:
                ((com.google.protobuf.l0) bcVar).s(i17, ((java.lang.Long) entry.getValue()).longValue());
                return;
            case 4:
                ((com.google.protobuf.l0) bcVar).i(i17, ((java.lang.Integer) entry.getValue()).intValue());
                return;
            case 5:
                ((com.google.protobuf.l0) bcVar).f(i17, ((java.lang.Long) entry.getValue()).longValue());
                return;
            case 6:
                ((com.google.protobuf.l0) bcVar).e(i17, ((java.lang.Integer) entry.getValue()).intValue());
                return;
            case 7:
                ((com.google.protobuf.l0) bcVar).a(i17, ((java.lang.Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                ((com.google.protobuf.l0) bcVar).f45273a.O(i17, (java.lang.String) entry.getValue());
                return;
            case 9:
                ((com.google.protobuf.l0) bcVar).h(i17, entry.getValue(), com.google.protobuf.h9.f45166c.a(entry.getValue().getClass()));
                return;
            case 10:
                ((com.google.protobuf.l0) bcVar).k(i17, entry.getValue(), com.google.protobuf.h9.f45166c.a(entry.getValue().getClass()));
                return;
            case 11:
                ((com.google.protobuf.l0) bcVar).b(i17, (com.google.protobuf.y) entry.getValue());
                return;
            case 12:
                ((com.google.protobuf.l0) bcVar).r(i17, ((java.lang.Integer) entry.getValue()).intValue());
                return;
            case 13:
                ((com.google.protobuf.l0) bcVar).i(i17, ((java.lang.Integer) entry.getValue()).intValue());
                return;
            case 14:
                ((com.google.protobuf.l0) bcVar).m(i17, ((java.lang.Integer) entry.getValue()).intValue());
                return;
            case 15:
                ((com.google.protobuf.l0) bcVar).n(i17, ((java.lang.Long) entry.getValue()).longValue());
                return;
            case 16:
                ((com.google.protobuf.l0) bcVar).o(i17, ((java.lang.Integer) entry.getValue()).intValue());
                return;
            case 17:
                ((com.google.protobuf.l0) bcVar).p(i17, ((java.lang.Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
