package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.k0.class)
/* loaded from: classes9.dex */
public class g9 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.k0 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f280617e;

    /* renamed from: m, reason: collision with root package name */
    public int f280622m;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f280624o;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f280618f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f280619g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f280620h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f280621i = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public boolean f280623n = false;

    public g9() {
        new java.util.HashMap();
        this.f280624o = new java.util.HashSet();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        java.util.Map map;
        if (s0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "onChattingExitAnimEnd");
            this.f280113d.f542250l.m78680x8f8ecf18(4);
            this.f280113d.f542250l.m78680x8f8ecf18(5);
            int mo8143x7444f759 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class))).mo8143x7444f759();
            for (int i17 = mo8143x7444f759 - this.f280622m; i17 < mo8143x7444f759; i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class))).mo75871xfb80e389(i17);
                if (mo75871xfb80e389 != null && (map = this.f280618f) != null) {
                    if (((java.util.HashMap) map).containsKey(java.lang.Long.valueOf(mo75871xfb80e389.m124847x74d37ac6()))) {
                        t0(1, mo75871xfb80e389);
                    }
                }
            }
            java.util.Map map2 = this.f280618f;
            if (map2 != null) {
                ((java.util.HashMap) map2).clear();
            }
            java.util.Map map3 = this.f280620h;
            if (map3 != null) {
                ((java.util.HashMap) map3).clear();
            }
            java.util.Map map4 = this.f280621i;
            if (map4 != null) {
                ((java.util.HashMap) map4).clear();
            }
            java.util.Set set = this.f280624o;
            if (set != null) {
                ((java.util.HashSet) set).clear();
            }
            java.util.Map map5 = this.f280619g;
            if (map5 != null) {
                ((java.util.HashMap) map5).clear();
            }
            if (this.f280623n || r0()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "check record");
            st0.e v17 = c01.d9.b().v();
            if (v17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingServiceNotifyComponent", "get message notify storage return null");
            } else {
                ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f9(this, v17));
            }
            this.f280623n = true;
        }
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        if (r0() && i17 == 100 && intent != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "receive data from subscribe msg");
            com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3 = (com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3) intent.getParcelableExtra("key_biz_data");
            if (c11162xe78737a3 != null) {
                o31.m.f424214a.b(this.f280617e, c11162xe78737a3, new com.p314xaae8f345.mm.ui.zh(this.f280113d.g(), this.f280617e));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        this.f280617e = this.f280113d.f542250l.m78394x7e63ed49("key_notify_message_real_username");
        if (r0() || s0()) {
            this.f280622m = 0;
        }
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        if (s0()) {
            this.f280622m = java.lang.Math.max(this.f280622m, i19 - i17);
        }
    }

    public final boolean m0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2) {
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        long m124847x74d37ac62 = f9Var2.m124847x74d37ac6();
        java.lang.String j17 = f9Var.j();
        java.lang.String j18 = f9Var2.j();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j18)) {
            tt0.c a17 = tt0.c.a(j17);
            tt0.c a18 = tt0.c.a(j18);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f503328j) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18.f503328j) || !a17.f503328j.equals(a18.f503328j)) {
                return false;
            }
            java.lang.String str = a17.f503320b;
            if (str == null) {
                str = "";
            }
            if (str.equals(a18.f503320b)) {
                return (m124847x74d37ac62 > m124847x74d37ac6 ? 1 : (m124847x74d37ac62 == m124847x74d37ac6 ? 0 : -1)) > 0;
            }
            return false;
        }
        return false;
    }

    public long n0(long j17) {
        java.lang.Long l17;
        if (!s0()) {
            return -1L;
        }
        java.lang.Long l18 = (java.lang.Long) ((java.util.HashMap) this.f280618f).get(java.lang.Long.valueOf(j17));
        if (l18 == null || (l17 = (java.lang.Long) ((java.util.HashMap) this.f280619g).get(l18)) == null || l17.longValue() != j17) {
            return -1L;
        }
        return l18.longValue();
    }

    public java.util.List o0(long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!s0()) {
            return arrayList;
        }
        java.util.Set set = null;
        if (s0()) {
            long n07 = n0(j17);
            if (n07 > 0) {
                set = p0(n07);
            }
        }
        if (set == null) {
            return arrayList;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) ((java.util.HashMap) this.f280621i).get((java.lang.Long) it.next());
            if (f9Var != null) {
                arrayList.add(f9Var);
            }
        }
        return arrayList;
    }

    public java.util.Set p0(long j17) {
        if (!s0()) {
            return null;
        }
        return (java.util.Set) ((java.util.HashMap) this.f280620h).get(java.lang.Long.valueOf(j17));
    }

    public boolean q0(long j17) {
        if (s0()) {
            return ((java.util.HashMap) this.f280621i).get(java.lang.Long.valueOf(j17)) != null;
        }
        return false;
    }

    public boolean r0() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f280113d.x()) || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.S4(this.f280113d.x()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f280617e)) ? false : true;
    }

    public boolean s0() {
        java.lang.String a17 = j62.e.g().a("clicfg_wcpay_message_folder_android", "", false, false);
        if (!((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(a17, 0) == 0) ? false : true)) {
            return false;
        }
        java.lang.String x17 = this.f280113d.x();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17)) {
            return false;
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.S4(x17);
    }

    public void t0(int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (s0()) {
            long n07 = n0(f9Var.m124847x74d37ac6());
            java.util.Map map = this.f280620h;
            int size = ((java.util.HashMap) map).get(java.lang.Long.valueOf(n07)) == null ? 0 : ((java.util.Set) ((java.util.HashMap) map).get(java.lang.Long.valueOf(n07))).size();
            if (n07 < 0) {
                return;
            }
            tt0.c a17 = tt0.c.a(f9Var.j());
            int i18 = a17.f503325g;
            int i19 = i18 != 2 ? i18 != 3 ? 0 : 3 : 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = a17.f503320b;
            objArr[2] = a17.f503322d;
            objArr[3] = java.lang.Integer.valueOf(i19);
            objArr[4] = java.lang.Integer.valueOf(size);
            objArr[5] = java.lang.Integer.valueOf((a17.f503319a != 1 || android.text.TextUtils.isEmpty(a17.f503323e)) ? 1 : 2);
            g0Var.d(22906, objArr);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        if (s0()) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.e9 e9Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.e9(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(e9Var, 128L, false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        if (s0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "onChattingEnterAnimStart");
        }
    }
}
