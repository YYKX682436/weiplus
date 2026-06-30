package ke5;

/* loaded from: classes9.dex */
public class b0 implements he5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ke5.d0 f388594a;

    public b0(ke5.d0 d0Var) {
        this.f388594a = d0Var;
    }

    public int a() {
        ke5.d0 d0Var = this.f388594a;
        yb5.d dVar = d0Var.f388574b;
        if (dVar == null || dVar.f542241c.a(sb5.k0.class) == null) {
            return 0;
        }
        ((sb5.k0) d0Var.f388574b.f542241c.a(sb5.k0.class)).getClass();
        return 50;
    }

    public boolean b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2) {
        yb5.d dVar = this.f388594a.f388574b;
        if (dVar == null || dVar.f542241c.a(sb5.k0.class) == null) {
            return false;
        }
        sb5.k0 k0Var = (sb5.k0) this.f388594a.f388574b.f542241c.a(sb5.k0.class);
        java.lang.String str = this.f388594a.f388575c;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g9 g9Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g9) k0Var;
        g9Var.getClass();
        synchronized ("MicroMsg.ChattingServiceNotifyComponent") {
            if (((java.util.HashSet) g9Var.f280624o).contains(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()))) {
                return false;
            }
            if (((java.util.HashSet) g9Var.f280624o).contains(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()))) {
                return false;
            }
            if (((java.util.HashMap) g9Var.f280621i).get(java.lang.Long.valueOf(f9Var.m124847x74d37ac6())) == null) {
                if (((java.util.HashMap) g9Var.f280621i).get(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6())) == null) {
                    if (!g9Var.m0(f9Var, f9Var2)) {
                        return false;
                    }
                    ((java.util.HashMap) g9Var.f280621i).put(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), f9Var);
                    ((java.util.HashMap) g9Var.f280621i).put(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()), f9Var2);
                    ((java.util.HashMap) g9Var.f280618f).put(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                    ((java.util.HashMap) g9Var.f280619g).put(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()));
                    java.util.HashSet hashSet = new java.util.HashSet();
                    ((java.util.HashMap) g9Var.f280620h).put(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), hashSet);
                    hashSet.add(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()));
                    hashSet.add(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                    return true;
                }
            }
            if (((java.util.HashMap) g9Var.f280621i).get(java.lang.Long.valueOf(f9Var.m124847x74d37ac6())) != null) {
                if (((java.util.HashMap) g9Var.f280621i).get(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6())) == null) {
                    if (!g9Var.m0(f9Var, f9Var2)) {
                        return false;
                    }
                    java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) g9Var.f280618f).get(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                    if (l17.longValue() == 0) {
                        return false;
                    }
                    java.util.Set set = (java.util.Set) ((java.util.HashMap) g9Var.f280620h).get(l17);
                    if (set == null) {
                        return false;
                    }
                    if (set.size() >= 50) {
                        return false;
                    }
                    set.add(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()));
                    ((java.util.HashMap) g9Var.f280618f).put(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()), l17);
                    ((java.util.HashMap) g9Var.f280619g).put(l17, java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()));
                    ((java.util.HashMap) g9Var.f280621i).put(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()), f9Var2);
                    return true;
                }
            }
            return false;
        }
    }
}
