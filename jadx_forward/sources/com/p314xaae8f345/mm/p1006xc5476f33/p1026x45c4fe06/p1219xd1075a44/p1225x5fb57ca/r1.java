package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public enum r1 {
    ;


    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f173174d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f173175e;

    /* renamed from: f, reason: collision with root package name */
    public static final x.b f173176f;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
        hashSet.add("emoji");
        hashSet.add("number");
        hashSet.add("digit");
        hashSet.add("idcard");
        hashSet.add("CommercialScanCodePayment");
        hashSet.add("safe-password");
        hashSet.add("encrypt-text");
        hashSet.add("encrypt-number");
        hashSet.add("encrypt-digit");
        hashSet.add("encrypt-idcard");
        hashSet.add("encrypt-bankcard");
        f173175e = java.util.Collections.unmodifiableSet(hashSet);
        java.util.HashMap hashMap = new java.util.HashMap(3);
        hashMap.put("digit", 2);
        hashMap.put("encrypt-digit", 2);
        hashMap.put("number", 0);
        hashMap.put("encrypt-number", 0);
        hashMap.put("idcard", 1);
        hashMap.put("encrypt-idcard", 1);
        hashMap.put("encrypt-bankcard", 0);
        f173174d = java.util.Collections.unmodifiableMap(hashMap);
        f173176f = new x.b();
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17) {
        java.util.Set<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4> d17;
        if (v5Var != null && (d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m.f173073a.d(v5Var)) != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4 p4Var : d17) {
                if (p4Var != null) {
                    if (p4Var.h() != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4) p4Var.h())).m53464xb251d24f() == i17) {
                        return p4Var;
                    }
                }
            }
        }
        return null;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4 t4Var;
        if (v5Var == null || (t4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4) f173176f.m174751x4aabfc28(v5Var, null)) == null) {
            return null;
        }
        return a(v5Var, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) t4Var).m53464xb251d24f());
    }

    public static boolean d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.Integer num) {
        if (num == null) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4 t4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4) f173176f.m174751x4aabfc28(v5Var, null);
                if (t4Var == null) {
                    return false;
                }
                num = java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) t4Var).m53464xb251d24f());
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandInputService", th6, "[NOT CRASH]", new java.lang.Object[0]);
                return false;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4 a17 = a(v5Var, num.intValue());
        if (a17 != null) {
            return a17.mo53484x3f895349();
        }
        return false;
    }

    public static boolean e(java.lang.String str) {
        return "encrypt-digit".equalsIgnoreCase(str) || "encrypt-number".equalsIgnoreCase(str) || "encrypt-idcard".equalsIgnoreCase(str) || "encrypt-bankcard".equalsIgnoreCase(str);
    }

    public static boolean f(java.lang.String str) {
        return ("digit".equalsIgnoreCase(str) || "number".equalsIgnoreCase(str) || "idcard".equalsIgnoreCase(str)) || e(str);
    }

    public static boolean g(java.lang.String str) {
        return "CommercialScanCodePayment".equalsIgnoreCase(str);
    }

    public static void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4 t4Var) {
        if (v5Var == null || t4Var == null) {
            return;
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            ik1.h0.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q1(v5Var, t4Var));
            return;
        }
        x.b bVar = f173176f;
        if (bVar.m174751x4aabfc28(v5Var, null) == t4Var) {
            bVar.m174754xc84af884(v5Var);
        }
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1 m53519xdce0328(java.lang.String str) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(java.lang.Enum.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.class, str));
        return null;
    }
}
