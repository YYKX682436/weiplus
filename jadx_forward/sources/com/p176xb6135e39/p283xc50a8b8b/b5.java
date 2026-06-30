package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class b5 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.b5 f126453d;

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.ba f126454a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f126455b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f126456c;

    static {
        int i17 = com.p176xb6135e39.p283xc50a8b8b.ba.f126462m;
        com.p176xb6135e39.p283xc50a8b8b.b5 b5Var = new com.p176xb6135e39.p283xc50a8b8b.b5(new com.p176xb6135e39.p283xc50a8b8b.u9(0));
        b5Var.s();
        f126453d = b5Var;
    }

    public b5() {
        int i17 = com.p176xb6135e39.p283xc50a8b8b.ba.f126462m;
        this.f126454a = new com.p176xb6135e39.p283xc50a8b8b.u9(16);
    }

    public static com.p176xb6135e39.p283xc50a8b8b.ba c(com.p176xb6135e39.p283xc50a8b8b.ba baVar, boolean z17) {
        int i17 = com.p176xb6135e39.p283xc50a8b8b.ba.f126462m;
        com.p176xb6135e39.p283xc50a8b8b.u9 u9Var = new com.p176xb6135e39.p283xc50a8b8b.u9(16);
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
        com.p176xb6135e39.p283xc50a8b8b.a5 a5Var = (com.p176xb6135e39.p283xc50a8b8b.a5) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof com.p176xb6135e39.p283xc50a8b8b.d7) {
            map.put(a5Var, ((com.p176xb6135e39.p283xc50a8b8b.d7) value).a());
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

    public static int f(com.p176xb6135e39.p283xc50a8b8b.ub ubVar, int i17, java.lang.Object obj) {
        int p17 = com.p176xb6135e39.p283xc50a8b8b.k0.p(i17);
        if (ubVar == com.p176xb6135e39.p283xc50a8b8b.ub.f127125g) {
            p17 *= 2;
        }
        return p17 + g(ubVar, obj);
    }

    public static int g(com.p176xb6135e39.p283xc50a8b8b.ub ubVar, java.lang.Object obj) {
        switch (ubVar.ordinal()) {
            case 0:
                ((java.lang.Double) obj).doubleValue();
                java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
                return 8;
            case 1:
                ((java.lang.Float) obj).floatValue();
                java.util.logging.Logger logger2 = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
                return 4;
            case 2:
                return com.p176xb6135e39.p283xc50a8b8b.k0.t(((java.lang.Long) obj).longValue());
            case 3:
                return com.p176xb6135e39.p283xc50a8b8b.k0.t(((java.lang.Long) obj).longValue());
            case 4:
                return com.p176xb6135e39.p283xc50a8b8b.k0.l(((java.lang.Integer) obj).intValue());
            case 5:
                ((java.lang.Long) obj).longValue();
                java.util.logging.Logger logger3 = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
                return 8;
            case 6:
                ((java.lang.Integer) obj).intValue();
                java.util.logging.Logger logger4 = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
                return 4;
            case 7:
                ((java.lang.Boolean) obj).booleanValue();
                java.util.logging.Logger logger5 = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
                return 1;
            case 8:
                return obj instanceof com.p176xb6135e39.p283xc50a8b8b.y ? com.p176xb6135e39.p283xc50a8b8b.k0.d((com.p176xb6135e39.p283xc50a8b8b.y) obj) : com.p176xb6135e39.p283xc50a8b8b.k0.o((java.lang.String) obj);
            case 9:
                java.util.logging.Logger logger6 = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
                return ((com.p176xb6135e39.p283xc50a8b8b.o8) obj).mo20593x9d9c349b();
            case 10:
                java.util.logging.Logger logger7 = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
                int mo20593x9d9c349b = ((com.p176xb6135e39.p283xc50a8b8b.o8) obj).mo20593x9d9c349b();
                return com.p176xb6135e39.p283xc50a8b8b.k0.r(mo20593x9d9c349b) + mo20593x9d9c349b;
            case 11:
                if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.y) {
                    return com.p176xb6135e39.p283xc50a8b8b.k0.d((com.p176xb6135e39.p283xc50a8b8b.y) obj);
                }
                java.util.logging.Logger logger8 = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
                int length = ((byte[]) obj).length;
                return com.p176xb6135e39.p283xc50a8b8b.k0.r(length) + length;
            case 12:
                return com.p176xb6135e39.p283xc50a8b8b.k0.r(((java.lang.Integer) obj).intValue());
            case 13:
                return obj instanceof com.p176xb6135e39.p283xc50a8b8b.p6 ? com.p176xb6135e39.p283xc50a8b8b.k0.l(((com.p176xb6135e39.p283xc50a8b8b.p6) obj).mo20656x276ffe3f()) : com.p176xb6135e39.p283xc50a8b8b.k0.l(((java.lang.Integer) obj).intValue());
            case 14:
                ((java.lang.Integer) obj).intValue();
                java.util.logging.Logger logger9 = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
                return 4;
            case 15:
                ((java.lang.Long) obj).longValue();
                java.util.logging.Logger logger10 = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
                return 8;
            case 16:
                int intValue = ((java.lang.Integer) obj).intValue();
                return com.p176xb6135e39.p283xc50a8b8b.k0.r((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((java.lang.Long) obj).longValue();
                return com.p176xb6135e39.p283xc50a8b8b.k0.t((longValue >> 63) ^ (longValue << 1));
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int h(com.p176xb6135e39.p283xc50a8b8b.a5 a5Var, java.lang.Object obj) {
        com.p176xb6135e39.p283xc50a8b8b.ub P = a5Var.P();
        int mo20553x276ffe3f = a5Var.mo20553x276ffe3f();
        if (!a5Var.d1()) {
            return f(P, mo20553x276ffe3f, obj);
        }
        int i17 = 0;
        if (a5Var.C1()) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                i17 += g(P, it.next());
            }
            return com.p176xb6135e39.p283xc50a8b8b.k0.p(mo20553x276ffe3f) + i17 + com.p176xb6135e39.p283xc50a8b8b.k0.r(i17);
        }
        java.util.Iterator it6 = ((java.util.List) obj).iterator();
        while (it6.hasNext()) {
            i17 += f(P, mo20553x276ffe3f, it6.next());
        }
        return i17;
    }

    public static boolean p(java.util.Map.Entry entry) {
        com.p176xb6135e39.p283xc50a8b8b.a5 a5Var = (com.p176xb6135e39.p283xc50a8b8b.a5) entry.getKey();
        if (a5Var.u0() == com.p176xb6135e39.p283xc50a8b8b.vb.MESSAGE) {
            if (a5Var.d1()) {
                java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((com.p176xb6135e39.p283xc50a8b8b.o8) it.next()).mo20562xf582434a()) {
                        return false;
                    }
                }
            } else {
                java.lang.Object value = entry.getValue();
                if (!(value instanceof com.p176xb6135e39.p283xc50a8b8b.o8)) {
                    if (value instanceof com.p176xb6135e39.p283xc50a8b8b.d7) {
                        return true;
                    }
                    throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((com.p176xb6135e39.p283xc50a8b8b.o8) value).mo20562xf582434a()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean q(com.p176xb6135e39.p283xc50a8b8b.ub ubVar, java.lang.Object obj) {
        java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
        obj.getClass();
        switch (ubVar.f127130d) {
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
                return (obj instanceof com.p176xb6135e39.p283xc50a8b8b.y) || (obj instanceof byte[]);
            case ENUM:
                return (obj instanceof java.lang.Integer) || (obj instanceof com.p176xb6135e39.p283xc50a8b8b.p6);
            case MESSAGE:
                return (obj instanceof com.p176xb6135e39.p283xc50a8b8b.o8) || (obj instanceof com.p176xb6135e39.p283xc50a8b8b.d7);
            default:
                return false;
        }
    }

    public static void w(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var, com.p176xb6135e39.p283xc50a8b8b.ub ubVar, int i17, java.lang.Object obj) {
        if (ubVar != com.p176xb6135e39.p283xc50a8b8b.ub.f127125g) {
            k0Var.Q(i17, ubVar.f127131e);
            x(k0Var, ubVar, obj);
        } else {
            k0Var.Q(i17, 3);
            ((com.p176xb6135e39.p283xc50a8b8b.o8) obj).mo20600x5f8be6ba(k0Var);
            k0Var.Q(i17, 4);
        }
    }

    public static void x(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var, com.p176xb6135e39.p283xc50a8b8b.ub ubVar, java.lang.Object obj) {
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
                if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.y) {
                    k0Var.A((com.p176xb6135e39.p283xc50a8b8b.y) obj);
                    return;
                } else {
                    k0Var.P((java.lang.String) obj);
                    return;
                }
            case 9:
                k0Var.getClass();
                ((com.p176xb6135e39.p283xc50a8b8b.o8) obj).mo20600x5f8be6ba(k0Var);
                return;
            case 10:
                k0Var.L((com.p176xb6135e39.p283xc50a8b8b.o8) obj);
                return;
            case 11:
                if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.y) {
                    k0Var.A((com.p176xb6135e39.p283xc50a8b8b.y) obj);
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
                if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.p6) {
                    k0Var.I(((com.p176xb6135e39.p283xc50a8b8b.p6) obj).mo20656x276ffe3f());
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

    public static void y(com.p176xb6135e39.p283xc50a8b8b.a5 a5Var, java.lang.Object obj, com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        com.p176xb6135e39.p283xc50a8b8b.ub P = a5Var.P();
        int mo20553x276ffe3f = a5Var.mo20553x276ffe3f();
        if (!a5Var.d1()) {
            if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.d7) {
                w(k0Var, P, mo20553x276ffe3f, ((com.p176xb6135e39.p283xc50a8b8b.d7) obj).a());
                return;
            } else {
                w(k0Var, P, mo20553x276ffe3f, obj);
                return;
            }
        }
        java.util.List list = (java.util.List) obj;
        if (!a5Var.C1()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                w(k0Var, P, mo20553x276ffe3f, it.next());
            }
            return;
        }
        k0Var.Q(mo20553x276ffe3f, 2);
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

    public void a(com.p176xb6135e39.p283xc50a8b8b.a5 a5Var, java.lang.Object obj) {
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
            this.f126454a.h(a5Var, list);
        } else {
            list = (java.util.List) j17;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.b5 m20572x5a5dd5d() {
        com.p176xb6135e39.p283xc50a8b8b.ba baVar;
        com.p176xb6135e39.p283xc50a8b8b.b5 b5Var = new com.p176xb6135e39.p283xc50a8b8b.b5();
        int i17 = 0;
        while (true) {
            baVar = this.f126454a;
            if (i17 >= baVar.d()) {
                break;
            }
            java.util.Map.Entry c17 = baVar.c(i17);
            b5Var.v((com.p176xb6135e39.p283xc50a8b8b.a5) c17.getKey(), c17.getValue());
            i17++;
        }
        for (java.util.Map.Entry entry : baVar.e()) {
            b5Var.v((com.p176xb6135e39.p283xc50a8b8b.a5) entry.getKey(), entry.getValue());
        }
        b5Var.f126456c = this.f126456c;
        return b5Var;
    }

    /* renamed from: equals */
    public boolean m20573xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.b5) {
            return this.f126454a.equals(((com.p176xb6135e39.p283xc50a8b8b.b5) obj).f126454a);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m20574x8cdac1b() {
        return this.f126454a.hashCode();
    }

    public java.util.Map i() {
        boolean z17 = this.f126456c;
        com.p176xb6135e39.p283xc50a8b8b.ba baVar = this.f126454a;
        if (!z17) {
            return baVar.f126466g ? baVar : java.util.Collections.unmodifiableMap(baVar);
        }
        com.p176xb6135e39.p283xc50a8b8b.ba c17 = c(baVar, false);
        if (baVar.f126466g) {
            c17.g();
        }
        return c17;
    }

    public java.lang.Object j(com.p176xb6135e39.p283xc50a8b8b.a5 a5Var) {
        java.lang.Object obj = this.f126454a.get(a5Var);
        return obj instanceof com.p176xb6135e39.p283xc50a8b8b.d7 ? ((com.p176xb6135e39.p283xc50a8b8b.d7) obj).a() : obj;
    }

    public int k() {
        com.p176xb6135e39.p283xc50a8b8b.ba baVar;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            baVar = this.f126454a;
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
        com.p176xb6135e39.p283xc50a8b8b.a5 a5Var = (com.p176xb6135e39.p283xc50a8b8b.a5) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (a5Var.u0() != com.p176xb6135e39.p283xc50a8b8b.vb.MESSAGE || a5Var.d1() || a5Var.C1()) {
            return h(a5Var, value);
        }
        return (com.p176xb6135e39.p283xc50a8b8b.k0.p(1) * 2) + com.p176xb6135e39.p283xc50a8b8b.k0.q(2, ((com.p176xb6135e39.p283xc50a8b8b.a5) entry.getKey()).mo20553x276ffe3f()) + com.p176xb6135e39.p283xc50a8b8b.k0.n(3, (com.p176xb6135e39.p283xc50a8b8b.o8) value);
    }

    public int m() {
        com.p176xb6135e39.p283xc50a8b8b.ba baVar;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            baVar = this.f126454a;
            if (i17 >= baVar.d()) {
                break;
            }
            java.util.Map.Entry c17 = baVar.c(i17);
            i18 += h((com.p176xb6135e39.p283xc50a8b8b.a5) c17.getKey(), c17.getValue());
            i17++;
        }
        for (java.util.Map.Entry entry : baVar.e()) {
            i18 += h((com.p176xb6135e39.p283xc50a8b8b.a5) entry.getKey(), entry.getValue());
        }
        return i18;
    }

    public boolean n(com.p176xb6135e39.p283xc50a8b8b.a5 a5Var) {
        if (a5Var.d1()) {
            throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f126454a.get(a5Var) != null;
    }

    public boolean o() {
        int i17 = 0;
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.ba baVar = this.f126454a;
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
        boolean z17 = this.f126456c;
        com.p176xb6135e39.p283xc50a8b8b.ba baVar = this.f126454a;
        return z17 ? new com.p176xb6135e39.p283xc50a8b8b.c7(baVar.entrySet().iterator()) : baVar.entrySet().iterator();
    }

    public void s() {
        if (this.f126455b) {
            return;
        }
        this.f126454a.g();
        this.f126455b = true;
    }

    public void t(com.p176xb6135e39.p283xc50a8b8b.b5 b5Var) {
        com.p176xb6135e39.p283xc50a8b8b.ba baVar;
        int i17 = 0;
        while (true) {
            int d17 = b5Var.f126454a.d();
            baVar = b5Var.f126454a;
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
        com.p176xb6135e39.p283xc50a8b8b.a5 a5Var = (com.p176xb6135e39.p283xc50a8b8b.a5) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof com.p176xb6135e39.p283xc50a8b8b.d7) {
            value = ((com.p176xb6135e39.p283xc50a8b8b.d7) value).a();
        }
        boolean d17 = a5Var.d1();
        com.p176xb6135e39.p283xc50a8b8b.ba baVar = this.f126454a;
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
        if (a5Var.u0() != com.p176xb6135e39.p283xc50a8b8b.vb.MESSAGE) {
            baVar.h(a5Var, e(value));
            return;
        }
        java.lang.Object j18 = j(a5Var);
        if (j18 == null) {
            baVar.h(a5Var, e(value));
        } else {
            baVar.h(a5Var, a5Var.q(((com.p176xb6135e39.p283xc50a8b8b.o8) j18).mo20599xaaa148a0(), (com.p176xb6135e39.p283xc50a8b8b.o8) value).mo20556x59bc66e());
        }
    }

    public void v(com.p176xb6135e39.p283xc50a8b8b.a5 a5Var, java.lang.Object obj) {
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
        this.f126454a.h(a5Var, obj);
    }

    public final void z(java.util.Map.Entry entry, com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        com.p176xb6135e39.p283xc50a8b8b.a5 a5Var = (com.p176xb6135e39.p283xc50a8b8b.a5) entry.getKey();
        if (a5Var.u0() != com.p176xb6135e39.p283xc50a8b8b.vb.MESSAGE || a5Var.d1() || a5Var.C1()) {
            y(a5Var, entry.getValue(), k0Var);
            return;
        }
        java.lang.Object value = entry.getValue();
        if (value instanceof com.p176xb6135e39.p283xc50a8b8b.d7) {
            value = ((com.p176xb6135e39.p283xc50a8b8b.d7) value).a();
        }
        k0Var.M(((com.p176xb6135e39.p283xc50a8b8b.a5) entry.getKey()).mo20553x276ffe3f(), (com.p176xb6135e39.p283xc50a8b8b.o8) value);
    }

    public b5(com.p176xb6135e39.p283xc50a8b8b.ba baVar) {
        this.f126454a = baVar;
        s();
    }
}
