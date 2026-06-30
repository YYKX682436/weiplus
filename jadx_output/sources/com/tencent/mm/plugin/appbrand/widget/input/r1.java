package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public enum r1 {
    ;


    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f91641d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f91642e;

    /* renamed from: f, reason: collision with root package name */
    public static final x.b f91643f;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
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
        f91642e = java.util.Collections.unmodifiableSet(hashSet);
        java.util.HashMap hashMap = new java.util.HashMap(3);
        hashMap.put("digit", 2);
        hashMap.put("encrypt-digit", 2);
        hashMap.put("number", 0);
        hashMap.put("encrypt-number", 0);
        hashMap.put("idcard", 1);
        hashMap.put("encrypt-idcard", 1);
        hashMap.put("encrypt-bankcard", 0);
        f91641d = java.util.Collections.unmodifiableMap(hashMap);
        f91643f = new x.b();
    }

    public static com.tencent.mm.plugin.appbrand.widget.input.p4 a(com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        java.util.Set<com.tencent.mm.plugin.appbrand.widget.input.p4> d17;
        if (v5Var != null && (d17 = com.tencent.mm.plugin.appbrand.widget.input.m.f91540a.d(v5Var)) != null) {
            for (com.tencent.mm.plugin.appbrand.widget.input.p4 p4Var : d17) {
                if (p4Var != null) {
                    if (p4Var.h() != null && ((com.tencent.mm.plugin.appbrand.widget.input.e4) ((com.tencent.mm.plugin.appbrand.widget.input.t4) p4Var.h())).getInputId() == i17) {
                        return p4Var;
                    }
                }
            }
        }
        return null;
    }

    public static com.tencent.mm.plugin.appbrand.widget.input.p4 b(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var;
        if (v5Var == null || (t4Var = (com.tencent.mm.plugin.appbrand.widget.input.t4) f91643f.getOrDefault(v5Var, null)) == null) {
            return null;
        }
        return a(v5Var, ((com.tencent.mm.plugin.appbrand.widget.input.e4) t4Var).getInputId());
    }

    public static boolean d(com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.Integer num) {
        if (num == null) {
            try {
                com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var = (com.tencent.mm.plugin.appbrand.widget.input.t4) f91643f.getOrDefault(v5Var, null);
                if (t4Var == null) {
                    return false;
                }
                num = java.lang.Integer.valueOf(((com.tencent.mm.plugin.appbrand.widget.input.e4) t4Var).getInputId());
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandInputService", th6, "[NOT CRASH]", new java.lang.Object[0]);
                return false;
            }
        }
        com.tencent.mm.plugin.appbrand.widget.input.p4 a17 = a(v5Var, num.intValue());
        if (a17 != null) {
            return a17.hideKeyboard();
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

    public static void h(com.tencent.mm.plugin.appbrand.page.v5 v5Var, com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var) {
        if (v5Var == null || t4Var == null) {
            return;
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            ik1.h0.b(new com.tencent.mm.plugin.appbrand.widget.input.q1(v5Var, t4Var));
            return;
        }
        x.b bVar = f91643f;
        if (bVar.getOrDefault(v5Var, null) == t4Var) {
            bVar.remove(v5Var);
        }
    }

    public static com.tencent.mm.plugin.appbrand.widget.input.r1 valueOf(java.lang.String str) {
        android.support.v4.media.f.a(java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.widget.input.r1.class, str));
        return null;
    }
}
