package com.google.protobuf;

/* loaded from: classes16.dex */
public final class b5 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.protobuf.b5 f44920d;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.protobuf.ba f44921a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f44922b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f44923c;

    static {
        int i17 = com.google.protobuf.ba.f44929m;
        com.google.protobuf.b5 b5Var = new com.google.protobuf.b5(new com.google.protobuf.u9(0));
        b5Var.s();
        f44920d = b5Var;
    }

    public b5() {
        int i17 = com.google.protobuf.ba.f44929m;
        this.f44921a = new com.google.protobuf.u9(16);
    }

    public static com.google.protobuf.ba c(com.google.protobuf.ba baVar, boolean z17) {
        int i17 = com.google.protobuf.ba.f44929m;
        com.google.protobuf.u9 u9Var = new com.google.protobuf.u9(16);
        for (int i18 = 0; i18 < baVar.d(); i18++) {
            d(u9Var, baVar.c(i18), z17);
        }
        java.util.Iterator it = baVar.e().iterator();
        while (it.hasNext()) {
            d(u9Var, (java.util.Map.Entry) it.next(), z17);
        }
        return u9Var;
    }

    public static void d(java.util.Map map, java.util.Map.Entry entry, boolean z17) {
        com.google.protobuf.a5 a5Var = (com.google.protobuf.a5) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof com.google.protobuf.d7) {
            map.put(a5Var, ((com.google.protobuf.d7) value).a());
        } else if (z17 && (value instanceof java.util.List)) {
            map.put(a5Var, new java.util.ArrayList((java.util.List) value));
        } else {
            map.put(a5Var, value);
        }
    }

    public static java.lang.Object e(java.lang.Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int f(com.google.protobuf.ub ubVar, int i17, java.lang.Object obj) {
        int p17 = com.google.protobuf.k0.p(i17);
        if (ubVar == com.google.protobuf.ub.f45592g) {
            p17 *= 2;
        }
        return p17 + g(ubVar, obj);
    }

    public static int g(com.google.protobuf.ub ubVar, java.lang.Object obj) {
        switch (ubVar.ordinal()) {
            case 0:
                ((java.lang.Double) obj).doubleValue();
                java.util.logging.Logger logger = com.google.protobuf.k0.f45246b;
                return 8;
            case 1:
                ((java.lang.Float) obj).floatValue();
                java.util.logging.Logger logger2 = com.google.protobuf.k0.f45246b;
                return 4;
            case 2:
                return com.google.protobuf.k0.t(((java.lang.Long) obj).longValue());
            case 3:
                return com.google.protobuf.k0.t(((java.lang.Long) obj).longValue());
            case 4:
                return com.google.protobuf.k0.l(((java.lang.Integer) obj).intValue());
            case 5:
                ((java.lang.Long) obj).longValue();
                java.util.logging.Logger logger3 = com.google.protobuf.k0.f45246b;
                return 8;
            case 6:
                ((java.lang.Integer) obj).intValue();
                java.util.logging.Logger logger4 = com.google.protobuf.k0.f45246b;
                return 4;
            case 7:
                ((java.lang.Boolean) obj).booleanValue();
                java.util.logging.Logger logger5 = com.google.protobuf.k0.f45246b;
                return 1;
            case 8:
                return obj instanceof com.google.protobuf.y ? com.google.protobuf.k0.d((com.google.protobuf.y) obj) : com.google.protobuf.k0.o((java.lang.String) obj);
            case 9:
                java.util.logging.Logger logger6 = com.google.protobuf.k0.f45246b;
                return ((com.google.protobuf.o8) obj).getSerializedSize();
            case 10:
                java.util.logging.Logger logger7 = com.google.protobuf.k0.f45246b;
                int serializedSize = ((com.google.protobuf.o8) obj).getSerializedSize();
                return com.google.protobuf.k0.r(serializedSize) + serializedSize;
            case 11:
                if (obj instanceof com.google.protobuf.y) {
                    return com.google.protobuf.k0.d((com.google.protobuf.y) obj);
                }
                java.util.logging.Logger logger8 = com.google.protobuf.k0.f45246b;
                int length = ((byte[]) obj).length;
                return com.google.protobuf.k0.r(length) + length;
            case 12:
                return com.google.protobuf.k0.r(((java.lang.Integer) obj).intValue());
            case 13:
                return obj instanceof com.google.protobuf.p6 ? com.google.protobuf.k0.l(((com.google.protobuf.p6) obj).getNumber()) : com.google.protobuf.k0.l(((java.lang.Integer) obj).intValue());
            case 14:
                ((java.lang.Integer) obj).intValue();
                java.util.logging.Logger logger9 = com.google.protobuf.k0.f45246b;
                return 4;
            case 15:
                ((java.lang.Long) obj).longValue();
                java.util.logging.Logger logger10 = com.google.protobuf.k0.f45246b;
                return 8;
            case 16:
                int intValue = ((java.lang.Integer) obj).intValue();
                return com.google.protobuf.k0.r((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((java.lang.Long) obj).longValue();
                return com.google.protobuf.k0.t((longValue >> 63) ^ (longValue << 1));
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int h(com.google.protobuf.a5 a5Var, java.lang.Object obj) {
        com.google.protobuf.ub P = a5Var.P();
        int number = a5Var.getNumber();
        if (!a5Var.d1()) {
            return f(P, number, obj);
        }
        int i17 = 0;
        if (a5Var.C1()) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                i17 += g(P, it.next());
            }
            return com.google.protobuf.k0.p(number) + i17 + com.google.protobuf.k0.r(i17);
        }
        java.util.Iterator it6 = ((java.util.List) obj).iterator();
        while (it6.hasNext()) {
            i17 += f(P, number, it6.next());
        }
        return i17;
    }

    public static boolean p(java.util.Map.Entry entry) {
        com.google.protobuf.a5 a5Var = (com.google.protobuf.a5) entry.getKey();
        if (a5Var.u0() == com.google.protobuf.vb.MESSAGE) {
            if (a5Var.d1()) {
                java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((com.google.protobuf.o8) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                java.lang.Object value = entry.getValue();
                if (!(value instanceof com.google.protobuf.o8)) {
                    if (value instanceof com.google.protobuf.d7) {
                        return true;
                    }
                    throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((com.google.protobuf.o8) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean q(com.google.protobuf.ub ubVar, java.lang.Object obj) {
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        obj.getClass();
        switch (ubVar.f45597d) {
            case INT:
                return obj instanceof java.lang.Integer;
            case LONG:
                return obj instanceof java.lang.Long;
            case FLOAT:
                return obj instanceof java.lang.Float;
            case DOUBLE:
                return obj instanceof java.lang.Double;
            case BOOLEAN:
                return obj instanceof java.lang.Boolean;
            case STRING:
                return obj instanceof java.lang.String;
            case BYTE_STRING:
                return (obj instanceof com.google.protobuf.y) || (obj instanceof byte[]);
            case ENUM:
                return (obj instanceof java.lang.Integer) || (obj instanceof com.google.protobuf.p6);
            case MESSAGE:
                return (obj instanceof com.google.protobuf.o8) || (obj instanceof com.google.protobuf.d7);
            default:
                return false;
        }
    }

    public static void w(com.google.protobuf.k0 k0Var, com.google.protobuf.ub ubVar, int i17, java.lang.Object obj) {
        if (ubVar != com.google.protobuf.ub.f45592g) {
            k0Var.Q(i17, ubVar.f45598e);
            x(k0Var, ubVar, obj);
        } else {
            k0Var.Q(i17, 3);
            ((com.google.protobuf.o8) obj).writeTo(k0Var);
            k0Var.Q(i17, 4);
        }
    }

    public static void x(com.google.protobuf.k0 k0Var, com.google.protobuf.ub ubVar, java.lang.Object obj) {
        switch (ubVar.ordinal()) {
            case 0:
                double doubleValue = ((java.lang.Double) obj).doubleValue();
                k0Var.getClass();
                k0Var.F(java.lang.Double.doubleToRawLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((java.lang.Float) obj).floatValue();
                k0Var.getClass();
                k0Var.D(java.lang.Float.floatToRawIntBits(floatValue));
                return;
            case 2:
                k0Var.U(((java.lang.Long) obj).longValue());
                return;
            case 3:
                k0Var.U(((java.lang.Long) obj).longValue());
                return;
            case 4:
                k0Var.I(((java.lang.Integer) obj).intValue());
                return;
            case 5:
                k0Var.F(((java.lang.Long) obj).longValue());
                return;
            case 6:
                k0Var.D(((java.lang.Integer) obj).intValue());
                return;
            case 7:
                k0Var.w(((java.lang.Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof com.google.protobuf.y) {
                    k0Var.A((com.google.protobuf.y) obj);
                    return;
                } else {
                    k0Var.P((java.lang.String) obj);
                    return;
                }
            case 9:
                k0Var.getClass();
                ((com.google.protobuf.o8) obj).writeTo(k0Var);
                return;
            case 10:
                k0Var.L((com.google.protobuf.o8) obj);
                return;
            case 11:
                if (obj instanceof com.google.protobuf.y) {
                    k0Var.A((com.google.protobuf.y) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                k0Var.getClass();
                k0Var.y(bArr, 0, bArr.length);
                return;
            case 12:
                k0Var.S(((java.lang.Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof com.google.protobuf.p6) {
                    k0Var.I(((com.google.protobuf.p6) obj).getNumber());
                    return;
                } else {
                    k0Var.I(((java.lang.Integer) obj).intValue());
                    return;
                }
            case 14:
                k0Var.D(((java.lang.Integer) obj).intValue());
                return;
            case 15:
                k0Var.F(((java.lang.Long) obj).longValue());
                return;
            case 16:
                int intValue = ((java.lang.Integer) obj).intValue();
                k0Var.S((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((java.lang.Long) obj).longValue();
                k0Var.U((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public static void y(com.google.protobuf.a5 a5Var, java.lang.Object obj, com.google.protobuf.k0 k0Var) {
        com.google.protobuf.ub P = a5Var.P();
        int number = a5Var.getNumber();
        if (!a5Var.d1()) {
            if (obj instanceof com.google.protobuf.d7) {
                w(k0Var, P, number, ((com.google.protobuf.d7) obj).a());
                return;
            } else {
                w(k0Var, P, number, obj);
                return;
            }
        }
        java.util.List list = (java.util.List) obj;
        if (!a5Var.C1()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                w(k0Var, P, number, it.next());
            }
            return;
        }
        k0Var.Q(number, 2);
        java.util.Iterator it6 = list.iterator();
        int i17 = 0;
        while (it6.hasNext()) {
            i17 += g(P, it6.next());
        }
        k0Var.S(i17);
        java.util.Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            x(k0Var, P, it7.next());
        }
    }

    public void a(com.google.protobuf.a5 a5Var, java.lang.Object obj) {
        java.util.List list;
        if (!a5Var.d1()) {
            throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        if (!q(a5Var.P(), obj)) {
            throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        java.lang.Object j17 = j(a5Var);
        if (j17 == null) {
            list = new java.util.ArrayList();
            this.f44921a.h(a5Var, list);
        } else {
            list = (java.util.List) j17;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.b5 clone() {
        com.google.protobuf.ba baVar;
        com.google.protobuf.b5 b5Var = new com.google.protobuf.b5();
        int i17 = 0;
        while (true) {
            baVar = this.f44921a;
            if (i17 >= baVar.d()) {
                break;
            }
            java.util.Map.Entry c17 = baVar.c(i17);
            b5Var.v((com.google.protobuf.a5) c17.getKey(), c17.getValue());
            i17++;
        }
        for (java.util.Map.Entry entry : baVar.e()) {
            b5Var.v((com.google.protobuf.a5) entry.getKey(), entry.getValue());
        }
        b5Var.f44923c = this.f44923c;
        return b5Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.protobuf.b5) {
            return this.f44921a.equals(((com.google.protobuf.b5) obj).f44921a);
        }
        return false;
    }

    public int hashCode() {
        return this.f44921a.hashCode();
    }

    public java.util.Map i() {
        boolean z17 = this.f44923c;
        com.google.protobuf.ba baVar = this.f44921a;
        if (!z17) {
            return baVar.f44933g ? baVar : java.util.Collections.unmodifiableMap(baVar);
        }
        com.google.protobuf.ba c17 = c(baVar, false);
        if (baVar.f44933g) {
            c17.g();
        }
        return c17;
    }

    public java.lang.Object j(com.google.protobuf.a5 a5Var) {
        java.lang.Object obj = this.f44921a.get(a5Var);
        return obj instanceof com.google.protobuf.d7 ? ((com.google.protobuf.d7) obj).a() : obj;
    }

    public int k() {
        com.google.protobuf.ba baVar;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            baVar = this.f44921a;
            if (i17 >= baVar.d()) {
                break;
            }
            i18 += l(baVar.c(i17));
            i17++;
        }
        java.util.Iterator it = baVar.e().iterator();
        while (it.hasNext()) {
            i18 += l((java.util.Map.Entry) it.next());
        }
        return i18;
    }

    public final int l(java.util.Map.Entry entry) {
        com.google.protobuf.a5 a5Var = (com.google.protobuf.a5) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (a5Var.u0() != com.google.protobuf.vb.MESSAGE || a5Var.d1() || a5Var.C1()) {
            return h(a5Var, value);
        }
        return (com.google.protobuf.k0.p(1) * 2) + com.google.protobuf.k0.q(2, ((com.google.protobuf.a5) entry.getKey()).getNumber()) + com.google.protobuf.k0.n(3, (com.google.protobuf.o8) value);
    }

    public int m() {
        com.google.protobuf.ba baVar;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            baVar = this.f44921a;
            if (i17 >= baVar.d()) {
                break;
            }
            java.util.Map.Entry c17 = baVar.c(i17);
            i18 += h((com.google.protobuf.a5) c17.getKey(), c17.getValue());
            i17++;
        }
        for (java.util.Map.Entry entry : baVar.e()) {
            i18 += h((com.google.protobuf.a5) entry.getKey(), entry.getValue());
        }
        return i18;
    }

    public boolean n(com.google.protobuf.a5 a5Var) {
        if (a5Var.d1()) {
            throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f44921a.get(a5Var) != null;
    }

    public boolean o() {
        int i17 = 0;
        while (true) {
            com.google.protobuf.ba baVar = this.f44921a;
            if (i17 >= baVar.d()) {
                java.util.Iterator it = baVar.e().iterator();
                while (it.hasNext()) {
                    if (!p((java.util.Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!p(baVar.c(i17))) {
                return false;
            }
            i17++;
        }
    }

    public java.util.Iterator r() {
        boolean z17 = this.f44923c;
        com.google.protobuf.ba baVar = this.f44921a;
        return z17 ? new com.google.protobuf.c7(baVar.entrySet().iterator()) : baVar.entrySet().iterator();
    }

    public void s() {
        if (this.f44922b) {
            return;
        }
        this.f44921a.g();
        this.f44922b = true;
    }

    public void t(com.google.protobuf.b5 b5Var) {
        com.google.protobuf.ba baVar;
        int i17 = 0;
        while (true) {
            int d17 = b5Var.f44921a.d();
            baVar = b5Var.f44921a;
            if (i17 >= d17) {
                break;
            }
            u(baVar.c(i17));
            i17++;
        }
        java.util.Iterator it = baVar.e().iterator();
        while (it.hasNext()) {
            u((java.util.Map.Entry) it.next());
        }
    }

    public final void u(java.util.Map.Entry entry) {
        com.google.protobuf.a5 a5Var = (com.google.protobuf.a5) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof com.google.protobuf.d7) {
            value = ((com.google.protobuf.d7) value).a();
        }
        boolean d17 = a5Var.d1();
        com.google.protobuf.ba baVar = this.f44921a;
        if (d17) {
            java.lang.Object j17 = j(a5Var);
            if (j17 == null) {
                j17 = new java.util.ArrayList();
            }
            java.util.Iterator it = ((java.util.List) value).iterator();
            while (it.hasNext()) {
                ((java.util.List) j17).add(e(it.next()));
            }
            baVar.h(a5Var, j17);
            return;
        }
        if (a5Var.u0() != com.google.protobuf.vb.MESSAGE) {
            baVar.h(a5Var, e(value));
            return;
        }
        java.lang.Object j18 = j(a5Var);
        if (j18 == null) {
            baVar.h(a5Var, e(value));
        } else {
            baVar.h(a5Var, a5Var.q(((com.google.protobuf.o8) j18).toBuilder(), (com.google.protobuf.o8) value).build());
        }
    }

    public void v(com.google.protobuf.a5 a5Var, java.lang.Object obj) {
        if (a5Var.d1()) {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!q(a5Var.P(), it.next())) {
                    throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
            obj = arrayList;
        } else if (!q(a5Var.P(), obj)) {
            throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f44921a.h(a5Var, obj);
    }

    public final void z(java.util.Map.Entry entry, com.google.protobuf.k0 k0Var) {
        com.google.protobuf.a5 a5Var = (com.google.protobuf.a5) entry.getKey();
        if (a5Var.u0() != com.google.protobuf.vb.MESSAGE || a5Var.d1() || a5Var.C1()) {
            y(a5Var, entry.getValue(), k0Var);
            return;
        }
        java.lang.Object value = entry.getValue();
        if (value instanceof com.google.protobuf.d7) {
            value = ((com.google.protobuf.d7) value).a();
        }
        k0Var.M(((com.google.protobuf.a5) entry.getKey()).getNumber(), (com.google.protobuf.o8) value);
    }

    public b5(com.google.protobuf.ba baVar) {
        this.f44921a = baVar;
        s();
    }
}
