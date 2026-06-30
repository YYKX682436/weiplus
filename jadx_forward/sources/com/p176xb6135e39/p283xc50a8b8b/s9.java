package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class s9 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Class f127031a = com.p176xb6135e39.p283xc50a8b8b.l6.class;

    /* renamed from: b, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.qa f127032b = x(false);

    /* renamed from: c, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.qa f127033c = x(true);

    /* renamed from: d, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.qa f127034d = new com.p176xb6135e39.p283xc50a8b8b.ya();

    public static java.lang.Object A(int i17, int i18, java.lang.Object obj, com.p176xb6135e39.p283xc50a8b8b.qa qaVar) {
        if (obj == null) {
            ((com.p176xb6135e39.p283xc50a8b8b.ya) qaVar).getClass();
            obj = new com.p176xb6135e39.p283xc50a8b8b.xa();
        }
        ((com.p176xb6135e39.p283xc50a8b8b.ya) qaVar).getClass();
        ((com.p176xb6135e39.p283xc50a8b8b.xa) obj).d((i17 << 3) | 0, java.lang.Long.valueOf(i18));
        return obj;
    }

    public static void B(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar, boolean z17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).f126806a;
        int i18 = 0;
        if (!z17) {
            while (i18 < list.size()) {
                k0Var.x(i17, ((java.lang.Boolean) list.get(i18)).booleanValue());
                i18++;
            }
            return;
        }
        k0Var.Q(i17, 2);
        int i19 = 0;
        for (int i27 = 0; i27 < list.size(); i27++) {
            ((java.lang.Boolean) list.get(i27)).booleanValue();
            java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
            i19++;
        }
        k0Var.S(i19);
        while (i18 < list.size()) {
            k0Var.w(((java.lang.Boolean) list.get(i18)).booleanValue() ? (byte) 1 : (byte) 0);
            i18++;
        }
    }

    public static void C(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.l0 l0Var = (com.p176xb6135e39.p283xc50a8b8b.l0) bcVar;
        l0Var.getClass();
        for (int i18 = 0; i18 < list.size(); i18++) {
            l0Var.f126806a.z(i17, (com.p176xb6135e39.p283xc50a8b8b.y) list.get(i18));
        }
    }

    public static void D(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar, boolean z17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).f126806a;
        int i18 = 0;
        if (!z17) {
            while (i18 < list.size()) {
                k0Var.B(i17, ((java.lang.Double) list.get(i18)).doubleValue());
                i18++;
            }
            return;
        }
        k0Var.Q(i17, 2);
        int i19 = 0;
        for (int i27 = 0; i27 < list.size(); i27++) {
            ((java.lang.Double) list.get(i27)).doubleValue();
            java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
            i19 += 8;
        }
        k0Var.S(i19);
        while (i18 < list.size()) {
            k0Var.F(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i18)).doubleValue()));
            i18++;
        }
    }

    public static void E(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar, boolean z17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).f126806a;
        int i18 = 0;
        if (!z17) {
            while (i18 < list.size()) {
                k0Var.H(i17, ((java.lang.Integer) list.get(i18)).intValue());
                i18++;
            }
            return;
        }
        k0Var.Q(i17, 2);
        int i19 = 0;
        for (int i27 = 0; i27 < list.size(); i27++) {
            i19 += com.p176xb6135e39.p283xc50a8b8b.k0.l(((java.lang.Integer) list.get(i27)).intValue());
        }
        k0Var.S(i19);
        while (i18 < list.size()) {
            k0Var.I(((java.lang.Integer) list.get(i18)).intValue());
            i18++;
        }
    }

    public static void F(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar, boolean z17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).f126806a;
        int i18 = 0;
        if (!z17) {
            while (i18 < list.size()) {
                k0Var.C(i17, ((java.lang.Integer) list.get(i18)).intValue());
                i18++;
            }
            return;
        }
        k0Var.Q(i17, 2);
        int i19 = 0;
        for (int i27 = 0; i27 < list.size(); i27++) {
            ((java.lang.Integer) list.get(i27)).intValue();
            java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
            i19 += 4;
        }
        k0Var.S(i19);
        while (i18 < list.size()) {
            k0Var.D(((java.lang.Integer) list.get(i18)).intValue());
            i18++;
        }
    }

    public static void G(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar, boolean z17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).f126806a;
        int i18 = 0;
        if (!z17) {
            while (i18 < list.size()) {
                k0Var.E(i17, ((java.lang.Long) list.get(i18)).longValue());
                i18++;
            }
            return;
        }
        k0Var.Q(i17, 2);
        int i19 = 0;
        for (int i27 = 0; i27 < list.size(); i27++) {
            ((java.lang.Long) list.get(i27)).longValue();
            java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
            i19 += 8;
        }
        k0Var.S(i19);
        while (i18 < list.size()) {
            k0Var.F(((java.lang.Long) list.get(i18)).longValue());
            i18++;
        }
    }

    public static void H(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar, boolean z17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).f126806a;
        int i18 = 0;
        if (!z17) {
            while (i18 < list.size()) {
                k0Var.G(i17, ((java.lang.Float) list.get(i18)).floatValue());
                i18++;
            }
            return;
        }
        k0Var.Q(i17, 2);
        int i19 = 0;
        for (int i27 = 0; i27 < list.size(); i27++) {
            ((java.lang.Float) list.get(i27)).floatValue();
            java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
            i19 += 4;
        }
        k0Var.S(i19);
        while (i18 < list.size()) {
            k0Var.D(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i18)).floatValue()));
            i18++;
        }
    }

    public static void I(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar, com.p176xb6135e39.p283xc50a8b8b.q9 q9Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.l0 l0Var = (com.p176xb6135e39.p283xc50a8b8b.l0) bcVar;
        l0Var.getClass();
        for (int i18 = 0; i18 < list.size(); i18++) {
            l0Var.h(i17, list.get(i18), q9Var);
        }
    }

    public static void J(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar, boolean z17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).f126806a;
        int i18 = 0;
        if (!z17) {
            while (i18 < list.size()) {
                k0Var.H(i17, ((java.lang.Integer) list.get(i18)).intValue());
                i18++;
            }
            return;
        }
        k0Var.Q(i17, 2);
        int i19 = 0;
        for (int i27 = 0; i27 < list.size(); i27++) {
            i19 += com.p176xb6135e39.p283xc50a8b8b.k0.l(((java.lang.Integer) list.get(i27)).intValue());
        }
        k0Var.S(i19);
        while (i18 < list.size()) {
            k0Var.I(((java.lang.Integer) list.get(i18)).intValue());
            i18++;
        }
    }

    public static void K(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar, boolean z17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).f126806a;
        int i18 = 0;
        if (!z17) {
            while (i18 < list.size()) {
                k0Var.T(i17, ((java.lang.Long) list.get(i18)).longValue());
                i18++;
            }
            return;
        }
        k0Var.Q(i17, 2);
        int i19 = 0;
        for (int i27 = 0; i27 < list.size(); i27++) {
            i19 += com.p176xb6135e39.p283xc50a8b8b.k0.t(((java.lang.Long) list.get(i27)).longValue());
        }
        k0Var.S(i19);
        while (i18 < list.size()) {
            k0Var.U(((java.lang.Long) list.get(i18)).longValue());
            i18++;
        }
    }

    public static void L(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar, com.p176xb6135e39.p283xc50a8b8b.q9 q9Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.l0 l0Var = (com.p176xb6135e39.p283xc50a8b8b.l0) bcVar;
        l0Var.getClass();
        for (int i18 = 0; i18 < list.size(); i18++) {
            l0Var.k(i17, list.get(i18), q9Var);
        }
    }

    public static void M(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar, boolean z17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).f126806a;
        int i18 = 0;
        if (!z17) {
            while (i18 < list.size()) {
                k0Var.C(i17, ((java.lang.Integer) list.get(i18)).intValue());
                i18++;
            }
            return;
        }
        k0Var.Q(i17, 2);
        int i19 = 0;
        for (int i27 = 0; i27 < list.size(); i27++) {
            ((java.lang.Integer) list.get(i27)).intValue();
            java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
            i19 += 4;
        }
        k0Var.S(i19);
        while (i18 < list.size()) {
            k0Var.D(((java.lang.Integer) list.get(i18)).intValue());
            i18++;
        }
    }

    public static void N(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar, boolean z17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).f126806a;
        int i18 = 0;
        if (!z17) {
            while (i18 < list.size()) {
                k0Var.E(i17, ((java.lang.Long) list.get(i18)).longValue());
                i18++;
            }
            return;
        }
        k0Var.Q(i17, 2);
        int i19 = 0;
        for (int i27 = 0; i27 < list.size(); i27++) {
            ((java.lang.Long) list.get(i27)).longValue();
            java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
            i19 += 8;
        }
        k0Var.S(i19);
        while (i18 < list.size()) {
            k0Var.F(((java.lang.Long) list.get(i18)).longValue());
            i18++;
        }
    }

    public static void O(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar, boolean z17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).f126806a;
        int i18 = 0;
        if (!z17) {
            while (i18 < list.size()) {
                int intValue = ((java.lang.Integer) list.get(i18)).intValue();
                k0Var.R(i17, (intValue >> 31) ^ (intValue << 1));
                i18++;
            }
            return;
        }
        k0Var.Q(i17, 2);
        int i19 = 0;
        for (int i27 = 0; i27 < list.size(); i27++) {
            int intValue2 = ((java.lang.Integer) list.get(i27)).intValue();
            i19 += com.p176xb6135e39.p283xc50a8b8b.k0.r((intValue2 >> 31) ^ (intValue2 << 1));
        }
        k0Var.S(i19);
        while (i18 < list.size()) {
            int intValue3 = ((java.lang.Integer) list.get(i18)).intValue();
            k0Var.S((intValue3 >> 31) ^ (intValue3 << 1));
            i18++;
        }
    }

    public static void P(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar, boolean z17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).f126806a;
        int i18 = 0;
        if (!z17) {
            while (i18 < list.size()) {
                long longValue = ((java.lang.Long) list.get(i18)).longValue();
                k0Var.T(i17, (longValue >> 63) ^ (longValue << 1));
                i18++;
            }
            return;
        }
        k0Var.Q(i17, 2);
        int i19 = 0;
        for (int i27 = 0; i27 < list.size(); i27++) {
            long longValue2 = ((java.lang.Long) list.get(i27)).longValue();
            i19 += com.p176xb6135e39.p283xc50a8b8b.k0.t((longValue2 >> 63) ^ (longValue2 << 1));
        }
        k0Var.S(i19);
        while (i18 < list.size()) {
            long longValue3 = ((java.lang.Long) list.get(i18)).longValue();
            k0Var.U((longValue3 >> 63) ^ (longValue3 << 1));
            i18++;
        }
    }

    public static void Q(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.l0 l0Var = (com.p176xb6135e39.p283xc50a8b8b.l0) bcVar;
        l0Var.getClass();
        boolean z17 = list instanceof com.p176xb6135e39.p283xc50a8b8b.g7;
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = l0Var.f126806a;
        int i18 = 0;
        if (!z17) {
            while (i18 < list.size()) {
                k0Var.O(i17, (java.lang.String) list.get(i18));
                i18++;
            }
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.g7 g7Var = (com.p176xb6135e39.p283xc50a8b8b.g7) list;
        while (i18 < list.size()) {
            java.lang.Object J2 = g7Var.J(i18);
            if (J2 instanceof java.lang.String) {
                k0Var.O(i17, (java.lang.String) J2);
            } else {
                k0Var.z(i17, (com.p176xb6135e39.p283xc50a8b8b.y) J2);
            }
            i18++;
        }
    }

    public static void R(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar, boolean z17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).f126806a;
        int i18 = 0;
        if (!z17) {
            while (i18 < list.size()) {
                k0Var.R(i17, ((java.lang.Integer) list.get(i18)).intValue());
                i18++;
            }
            return;
        }
        k0Var.Q(i17, 2);
        int i19 = 0;
        for (int i27 = 0; i27 < list.size(); i27++) {
            i19 += com.p176xb6135e39.p283xc50a8b8b.k0.r(((java.lang.Integer) list.get(i27)).intValue());
        }
        k0Var.S(i19);
        while (i18 < list.size()) {
            k0Var.S(((java.lang.Integer) list.get(i18)).intValue());
            i18++;
        }
    }

    public static void S(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.bc bcVar, boolean z17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).f126806a;
        int i18 = 0;
        if (!z17) {
            while (i18 < list.size()) {
                k0Var.T(i17, ((java.lang.Long) list.get(i18)).longValue());
                i18++;
            }
            return;
        }
        k0Var.Q(i17, 2);
        int i19 = 0;
        for (int i27 = 0; i27 < list.size(); i27++) {
            i19 += com.p176xb6135e39.p283xc50a8b8b.k0.t(((java.lang.Long) list.get(i27)).longValue());
        }
        k0Var.S(i19);
        while (i18 < list.size()) {
            k0Var.U(((java.lang.Long) list.get(i18)).longValue());
            i18++;
        }
    }

    public static int a(int i17, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int p17 = size * com.p176xb6135e39.p283xc50a8b8b.k0.p(i17);
        for (int i18 = 0; i18 < list.size(); i18++) {
            p17 += com.p176xb6135e39.p283xc50a8b8b.k0.d((com.p176xb6135e39.p283xc50a8b8b.y) list.get(i18));
        }
        return p17;
    }

    public static int b(int i17, java.util.List list, boolean z17) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c17 = c(list);
        return z17 ? com.p176xb6135e39.p283xc50a8b8b.k0.p(i17) + com.p176xb6135e39.p283xc50a8b8b.k0.r(c17) + c17 : c17 + (size * com.p176xb6135e39.p283xc50a8b8b.k0.p(i17));
    }

    public static int c(java.util.List list) {
        int i17;
        int size = list.size();
        int i18 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.p176xb6135e39.p283xc50a8b8b.m6) {
            com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) list;
            i17 = 0;
            while (i18 < size) {
                i17 += com.p176xb6135e39.p283xc50a8b8b.k0.l(m6Var.h(i18));
                i18++;
            }
        } else {
            i17 = 0;
            while (i18 < size) {
                i17 += com.p176xb6135e39.p283xc50a8b8b.k0.l(((java.lang.Integer) list.get(i18)).intValue());
                i18++;
            }
        }
        return i17;
    }

    public static int d(int i17, java.util.List list, boolean z17) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z17) {
            return size * com.p176xb6135e39.p283xc50a8b8b.k0.g(i17, 0);
        }
        int i18 = size * 4;
        return com.p176xb6135e39.p283xc50a8b8b.k0.p(i17) + com.p176xb6135e39.p283xc50a8b8b.k0.r(i18) + i18;
    }

    public static int e(java.util.List list) {
        return list.size() * 4;
    }

    public static int f(int i17, java.util.List list, boolean z17) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z17) {
            return size * com.p176xb6135e39.p283xc50a8b8b.k0.h(i17, 0L);
        }
        int i18 = size * 8;
        return com.p176xb6135e39.p283xc50a8b8b.k0.p(i17) + com.p176xb6135e39.p283xc50a8b8b.k0.r(i18) + i18;
    }

    public static int g(java.util.List list) {
        return list.size() * 8;
    }

    public static int h(int i17, java.util.List list, boolean z17) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i18 = i(list);
        return z17 ? com.p176xb6135e39.p283xc50a8b8b.k0.p(i17) + com.p176xb6135e39.p283xc50a8b8b.k0.r(i18) + i18 : i18 + (size * com.p176xb6135e39.p283xc50a8b8b.k0.p(i17));
    }

    public static int i(java.util.List list) {
        int i17;
        int size = list.size();
        int i18 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.p176xb6135e39.p283xc50a8b8b.m6) {
            com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) list;
            i17 = 0;
            while (i18 < size) {
                i17 += com.p176xb6135e39.p283xc50a8b8b.k0.l(m6Var.h(i18));
                i18++;
            }
        } else {
            i17 = 0;
            while (i18 < size) {
                i17 += com.p176xb6135e39.p283xc50a8b8b.k0.l(((java.lang.Integer) list.get(i18)).intValue());
                i18++;
            }
        }
        return i17;
    }

    public static int j(int i17, java.util.List list, boolean z17) {
        if (list.size() == 0) {
            return 0;
        }
        int k17 = k(list);
        return z17 ? com.p176xb6135e39.p283xc50a8b8b.k0.p(i17) + com.p176xb6135e39.p283xc50a8b8b.k0.r(k17) + k17 : k17 + (list.size() * com.p176xb6135e39.p283xc50a8b8b.k0.p(i17));
    }

    public static int k(java.util.List list) {
        int i17;
        int size = list.size();
        int i18 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.p176xb6135e39.p283xc50a8b8b.l7) {
            com.p176xb6135e39.p283xc50a8b8b.l7 l7Var = (com.p176xb6135e39.p283xc50a8b8b.l7) list;
            i17 = 0;
            while (i18 < size) {
                l7Var.g(i18);
                i17 += com.p176xb6135e39.p283xc50a8b8b.k0.t(l7Var.f126833e[i18]);
                i18++;
            }
        } else {
            i17 = 0;
            while (i18 < size) {
                i17 += com.p176xb6135e39.p283xc50a8b8b.k0.t(((java.lang.Long) list.get(i18)).longValue());
                i18++;
            }
        }
        return i17;
    }

    public static int l(int i17, java.lang.Object obj, com.p176xb6135e39.p283xc50a8b8b.q9 q9Var) {
        int p17 = com.p176xb6135e39.p283xc50a8b8b.k0.p(i17);
        int m20647x9d9c349b = ((com.p176xb6135e39.p283xc50a8b8b.f) ((com.p176xb6135e39.p283xc50a8b8b.o8) obj)).m20647x9d9c349b(q9Var);
        return p17 + com.p176xb6135e39.p283xc50a8b8b.k0.r(m20647x9d9c349b) + m20647x9d9c349b;
    }

    public static int m(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.q9 q9Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int p17 = com.p176xb6135e39.p283xc50a8b8b.k0.p(i17) * size;
        for (int i18 = 0; i18 < size; i18++) {
            int m20647x9d9c349b = ((com.p176xb6135e39.p283xc50a8b8b.f) ((com.p176xb6135e39.p283xc50a8b8b.o8) list.get(i18))).m20647x9d9c349b(q9Var);
            p17 += com.p176xb6135e39.p283xc50a8b8b.k0.r(m20647x9d9c349b) + m20647x9d9c349b;
        }
        return p17;
    }

    public static int n(int i17, java.util.List list, boolean z17) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int o17 = o(list);
        return z17 ? com.p176xb6135e39.p283xc50a8b8b.k0.p(i17) + com.p176xb6135e39.p283xc50a8b8b.k0.r(o17) + o17 : o17 + (size * com.p176xb6135e39.p283xc50a8b8b.k0.p(i17));
    }

    public static int o(java.util.List list) {
        int i17;
        int size = list.size();
        int i18 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.p176xb6135e39.p283xc50a8b8b.m6) {
            com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) list;
            i17 = 0;
            while (i18 < size) {
                int h17 = m6Var.h(i18);
                i17 += com.p176xb6135e39.p283xc50a8b8b.k0.r((h17 >> 31) ^ (h17 << 1));
                i18++;
            }
        } else {
            i17 = 0;
            while (i18 < size) {
                int intValue = ((java.lang.Integer) list.get(i18)).intValue();
                i17 += com.p176xb6135e39.p283xc50a8b8b.k0.r((intValue >> 31) ^ (intValue << 1));
                i18++;
            }
        }
        return i17;
    }

    public static int p(int i17, java.util.List list, boolean z17) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int q17 = q(list);
        return z17 ? com.p176xb6135e39.p283xc50a8b8b.k0.p(i17) + com.p176xb6135e39.p283xc50a8b8b.k0.r(q17) + q17 : q17 + (size * com.p176xb6135e39.p283xc50a8b8b.k0.p(i17));
    }

    public static int q(java.util.List list) {
        int i17;
        int size = list.size();
        int i18 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.p176xb6135e39.p283xc50a8b8b.l7) {
            com.p176xb6135e39.p283xc50a8b8b.l7 l7Var = (com.p176xb6135e39.p283xc50a8b8b.l7) list;
            i17 = 0;
            while (i18 < size) {
                l7Var.g(i18);
                long j17 = l7Var.f126833e[i18];
                i17 += com.p176xb6135e39.p283xc50a8b8b.k0.t((j17 >> 63) ^ (j17 << 1));
                i18++;
            }
        } else {
            i17 = 0;
            while (i18 < size) {
                long longValue = ((java.lang.Long) list.get(i18)).longValue();
                i17 += com.p176xb6135e39.p283xc50a8b8b.k0.t((longValue >> 63) ^ (longValue << 1));
                i18++;
            }
        }
        return i17;
    }

    public static int r(int i17, java.util.List list) {
        int size = list.size();
        int i18 = 0;
        if (size == 0) {
            return 0;
        }
        int p17 = com.p176xb6135e39.p283xc50a8b8b.k0.p(i17) * size;
        if (list instanceof com.p176xb6135e39.p283xc50a8b8b.g7) {
            com.p176xb6135e39.p283xc50a8b8b.g7 g7Var = (com.p176xb6135e39.p283xc50a8b8b.g7) list;
            while (i18 < size) {
                java.lang.Object J2 = g7Var.J(i18);
                p17 += J2 instanceof com.p176xb6135e39.p283xc50a8b8b.y ? com.p176xb6135e39.p283xc50a8b8b.k0.d((com.p176xb6135e39.p283xc50a8b8b.y) J2) : com.p176xb6135e39.p283xc50a8b8b.k0.o((java.lang.String) J2);
                i18++;
            }
        } else {
            while (i18 < size) {
                java.lang.Object obj = list.get(i18);
                p17 += obj instanceof com.p176xb6135e39.p283xc50a8b8b.y ? com.p176xb6135e39.p283xc50a8b8b.k0.d((com.p176xb6135e39.p283xc50a8b8b.y) obj) : com.p176xb6135e39.p283xc50a8b8b.k0.o((java.lang.String) obj);
                i18++;
            }
        }
        return p17;
    }

    public static int s(int i17, java.util.List list, boolean z17) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t17 = t(list);
        return z17 ? com.p176xb6135e39.p283xc50a8b8b.k0.p(i17) + com.p176xb6135e39.p283xc50a8b8b.k0.r(t17) + t17 : t17 + (size * com.p176xb6135e39.p283xc50a8b8b.k0.p(i17));
    }

    public static int t(java.util.List list) {
        int i17;
        int size = list.size();
        int i18 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.p176xb6135e39.p283xc50a8b8b.m6) {
            com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) list;
            i17 = 0;
            while (i18 < size) {
                i17 += com.p176xb6135e39.p283xc50a8b8b.k0.r(m6Var.h(i18));
                i18++;
            }
        } else {
            i17 = 0;
            while (i18 < size) {
                i17 += com.p176xb6135e39.p283xc50a8b8b.k0.r(((java.lang.Integer) list.get(i18)).intValue());
                i18++;
            }
        }
        return i17;
    }

    public static int u(int i17, java.util.List list, boolean z17) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v17 = v(list);
        return z17 ? com.p176xb6135e39.p283xc50a8b8b.k0.p(i17) + com.p176xb6135e39.p283xc50a8b8b.k0.r(v17) + v17 : v17 + (size * com.p176xb6135e39.p283xc50a8b8b.k0.p(i17));
    }

    public static int v(java.util.List list) {
        int i17;
        int size = list.size();
        int i18 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.p176xb6135e39.p283xc50a8b8b.l7) {
            com.p176xb6135e39.p283xc50a8b8b.l7 l7Var = (com.p176xb6135e39.p283xc50a8b8b.l7) list;
            i17 = 0;
            while (i18 < size) {
                l7Var.g(i18);
                i17 += com.p176xb6135e39.p283xc50a8b8b.k0.t(l7Var.f126833e[i18]);
                i18++;
            }
        } else {
            i17 = 0;
            while (i18 < size) {
                i17 += com.p176xb6135e39.p283xc50a8b8b.k0.t(((java.lang.Long) list.get(i18)).longValue());
                i18++;
            }
        }
        return i17;
    }

    public static java.lang.Object w(int i17, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.r6 r6Var, java.lang.Object obj, com.p176xb6135e39.p283xc50a8b8b.qa qaVar) {
        if (r6Var == null) {
            return obj;
        }
        if (list instanceof java.util.RandomAccess) {
            int size = list.size();
            int i18 = 0;
            for (int i19 = 0; i19 < size; i19++) {
                int intValue = ((java.lang.Integer) list.get(i19)).intValue();
                if (r6Var.mo20891x5045f28e(intValue)) {
                    if (i19 != i18) {
                        list.set(i18, java.lang.Integer.valueOf(intValue));
                    }
                    i18++;
                } else {
                    obj = A(i17, intValue, obj, qaVar);
                }
            }
            if (i18 != size) {
                list.subList(i18, size).clear();
            }
        } else {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((java.lang.Integer) it.next()).intValue();
                if (!r6Var.mo20891x5045f28e(intValue2)) {
                    obj = A(i17, intValue2, obj, qaVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static com.p176xb6135e39.p283xc50a8b8b.qa x(boolean z17) {
        if (com.p176xb6135e39.p283xc50a8b8b.za.class == 0) {
            return null;
        }
        try {
            return (com.p176xb6135e39.p283xc50a8b8b.qa) com.p176xb6135e39.p283xc50a8b8b.za.class.getConstructor(java.lang.Boolean.TYPE).newInstance(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static void y(com.p176xb6135e39.p283xc50a8b8b.qa qaVar, java.lang.Object obj, java.lang.Object obj2) {
        ((com.p176xb6135e39.p283xc50a8b8b.ya) qaVar).getClass();
        com.p176xb6135e39.p283xc50a8b8b.n5 n5Var = (com.p176xb6135e39.p283xc50a8b8b.n5) obj;
        com.p176xb6135e39.p283xc50a8b8b.xa xaVar = n5Var.f7877x4f0c37a3;
        com.p176xb6135e39.p283xc50a8b8b.xa xaVar2 = ((com.p176xb6135e39.p283xc50a8b8b.n5) obj2).f7877x4f0c37a3;
        if (!xaVar2.m20953xb2c87fbf(com.p176xb6135e39.p283xc50a8b8b.xa.f127239f)) {
            xaVar = com.p176xb6135e39.p283xc50a8b8b.xa.c(xaVar, xaVar2);
        }
        n5Var.f7877x4f0c37a3 = xaVar;
    }

    public static boolean z(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
