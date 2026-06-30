package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.g0.class)
/* loaded from: classes9.dex */
public class n7 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.g0 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f281082e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f281083f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f281084g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f281085h;

    /* renamed from: m, reason: collision with root package name */
    public int f281087m;

    /* renamed from: p, reason: collision with root package name */
    public int f281090p;

    /* renamed from: r, reason: collision with root package name */
    public sb5.x1 f281092r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ig f281093s;

    /* renamed from: t, reason: collision with root package name */
    public sb5.z1 f281094t;

    /* renamed from: v, reason: collision with root package name */
    public db5.d5 f281096v;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f281086i = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f281088n = false;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f281089o = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f281091q = new java.util.HashSet();

    /* renamed from: u, reason: collision with root package name */
    public int f281095u = 0;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.bc f281097w = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o7(this);

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        java.util.Map map;
        ((java.util.HashSet) this.f281091q).clear();
        if (u0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "onChattingExitAnimEnd");
            this.f280113d.f542250l.m78680x8f8ecf18(4);
            this.f280113d.f542250l.m78680x8f8ecf18(5);
            int mo8143x7444f759 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class))).mo8143x7444f759();
            for (int i17 = mo8143x7444f759 - this.f281087m; i17 < mo8143x7444f759; i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class))).mo75871xfb80e389(i17);
                if (mo75871xfb80e389 != null && (map = this.f281083f) != null && map.containsKey(java.lang.Long.valueOf(mo75871xfb80e389.m124847x74d37ac6()))) {
                    v0(1, mo75871xfb80e389);
                }
            }
            java.util.Map map2 = this.f281083f;
            if (map2 != null) {
                map2.clear();
            }
            this.f281083f = null;
            java.util.Map map3 = this.f281084g;
            if (map3 != null) {
                map3.clear();
            }
            this.f281084g = null;
            java.util.List list = this.f281085h;
            if (list != null) {
                list.clear();
            }
            this.f281085h = null;
            synchronized ("MicroMsg.ChattingServiceNotifyComponent") {
                java.util.List list2 = this.f281086i;
                if (list2 != null) {
                    list2.clear();
                }
                this.f281086i = null;
            }
            if (!this.f281088n && !t0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "check record");
                st0.e v17 = c01.d9.b().v();
                if (v17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingServiceNotifyComponent", "get message notify storage return null");
                } else {
                    ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.r7(this, v17));
                }
                this.f281088n = true;
            }
            ((java.util.Vector) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kk.f285883a).clear();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        db5.d5 d5Var = this.f281096v;
        if (d5Var != null) {
            d5Var.dismiss();
        }
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        if (t0() && i17 == 100 && intent != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "receive data from subscribe msg");
            com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3 = (com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3) intent.getParcelableExtra("key_biz_data");
            if (c11162xe78737a3 != null) {
                o31.m.f424214a.b(this.f281082e, c11162xe78737a3, new com.p314xaae8f345.mm.ui.zh(this.f280113d.g(), this.f281082e));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        this.f281082e = this.f280113d.f542250l.m78394x7e63ed49("key_notify_message_real_username");
        this.f281095u = this.f280113d.f542250l.m78386x9c19e6d7("container_enter_scene", 0);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f281090p = (int) (currentTimeMillis / 1000);
        android.os.Bundle m7436x8619eaa0 = this.f280113d.f542250l.m7436x8619eaa0();
        if (m7436x8619eaa0 != null) {
            java.lang.String string = m7436x8619eaa0.getString("service_notify_session_id");
            if (!android.text.TextUtils.isEmpty(string)) {
                te5.v1.f500291b = string;
                if (!t0() || u0()) {
                    this.f281087m = 0;
                }
                return;
            }
        }
        te5.v1.f500291b = gm0.j1.b().j() + '_' + currentTimeMillis;
        if (t0()) {
        }
        this.f281087m = 0;
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        if (u0()) {
            this.f281087m = java.lang.Math.max(this.f281087m, i19 - i17);
        }
    }

    public final boolean m0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2) {
        java.util.List list = this.f281086i;
        if (list == null || list.isEmpty()) {
            return false;
        }
        java.util.List list2 = this.f281086i;
        long m124847x74d37ac6 = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) list2.get(list2.size() - 1)).m124847x74d37ac6();
        long m124847x74d37ac62 = f9Var.m124847x74d37ac6();
        long m124847x74d37ac63 = f9Var2.m124847x74d37ac6();
        java.lang.String j17 = f9Var.j();
        java.lang.String j18 = f9Var2.j();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j18)) {
            return false;
        }
        tt0.c a17 = tt0.c.a(j17);
        tt0.c a18 = tt0.c.a(j18);
        java.lang.String str = a17.f503320b;
        if (str == null) {
            str = "";
        }
        if (!str.equals(a18.f503320b)) {
            return false;
        }
        java.lang.String str2 = a17.f503321c;
        return (str2 != null ? str2 : "").equals(a18.f503321c) && m124847x74d37ac62 >= m124847x74d37ac6 && m124847x74d37ac63 > m124847x74d37ac62;
    }

    public sb5.x1 n0() {
        if (!te5.s1.f500280a.a()) {
            return null;
        }
        if (this.f281092r == null) {
            this.f281092r = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m7();
        }
        return this.f281092r;
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ig o0() {
        if (this.f281093s == null) {
            this.f281093s = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.t7();
        }
        return this.f281093s;
    }

    public long p0(long j17) {
        if (!u0()) {
            return -1L;
        }
        r0();
        java.lang.Long l17 = (java.lang.Long) this.f281083f.get(java.lang.Long.valueOf(j17));
        if (l17 == null) {
            return -1L;
        }
        return l17.longValue();
    }

    public java.util.Set q0(long j17) {
        if (!u0()) {
            return null;
        }
        r0();
        return (java.util.Set) this.f281084g.get(java.lang.Long.valueOf(j17));
    }

    public final void r0() {
        int min;
        if (this.f281083f == null || this.f281084g == null || this.f281085h == null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized ("MicroMsg.ChattingServiceNotifyComponent") {
                if (this.f281083f == null || this.f281084g == null || this.f281085h == null) {
                    this.f281083f = new java.util.HashMap();
                    this.f281084g = new java.util.HashMap();
                    this.f281085h = new java.util.ArrayList();
                    com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(this.f280113d.x());
                    if (p17 != null && p17.d1() > 0 && (min = java.lang.Math.min(p17.d1(), 100)) > 0) {
                        this.f281086i = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().y5(this.f280113d.x(), min);
                    }
                    java.util.List list = this.f281086i;
                    if (list != null && !list.isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "unread msg count: %d", java.lang.Integer.valueOf(this.f281086i.size()));
                        java.util.HashMap hashMap = new java.util.HashMap();
                        long j17 = 0;
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = null;
                        java.util.HashSet hashSet = null;
                        int i17 = 0;
                        boolean z17 = false;
                        while (i17 < java.lang.Math.min(this.f281086i.size(), 200)) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f281086i.get(i17);
                            int i18 = i17 + 1;
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 = i18 < this.f281086i.size() ? (com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f281086i.get(i18) : null;
                            if (f9Var3 != null) {
                                if (m0(f9Var3, f9Var2)) {
                                    if (!z17) {
                                        j17 = f9Var2.m124847x74d37ac6();
                                        hashSet = new java.util.HashSet();
                                        z17 = true;
                                    }
                                    hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(f9Var3.m124847x74d37ac6()));
                                    hashSet.add(java.lang.Long.valueOf(f9Var3.m124847x74d37ac6()));
                                    hashSet.add(java.lang.Long.valueOf(j17));
                                    if (hashSet.size() >= 10) {
                                        this.f281084g.put(java.lang.Long.valueOf(f9Var3.m124847x74d37ac6()), hashSet);
                                        hashSet = null;
                                        i17 = i18;
                                        f9Var = f9Var3;
                                        z17 = false;
                                    } else {
                                        f9Var = f9Var2;
                                    }
                                    if (!this.f281085h.contains(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()))) {
                                        this.f281085h.add(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()));
                                    }
                                    if (!this.f281085h.contains(java.lang.Long.valueOf(f9Var3.m124847x74d37ac6()))) {
                                        this.f281085h.add(java.lang.Long.valueOf(f9Var3.m124847x74d37ac6()));
                                    }
                                } else {
                                    if (hashSet != null) {
                                        this.f281084g.put(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()), hashSet);
                                    }
                                    hashSet = null;
                                    f9Var = f9Var2;
                                    z17 = false;
                                }
                            } else if (f9Var != null) {
                                if (m0(f9Var2, f9Var) && z17) {
                                    hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()));
                                    if (hashSet == null) {
                                        hashSet = new java.util.HashSet();
                                    }
                                    this.f281084g.put(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()), hashSet);
                                    hashSet.add(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()));
                                    hashSet.add(java.lang.Long.valueOf(j17));
                                    if (!this.f281085h.contains(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()))) {
                                        this.f281085h.add(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()));
                                    }
                                }
                                z17 = false;
                            }
                            i17++;
                        }
                        this.f281083f.putAll(hashMap);
                        hashMap.clear();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "initMessageGroupInfo cost: %dms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "end to head msg id size: %d, group by info size: %d, msg in group total size: %d", java.lang.Integer.valueOf(this.f281083f.size()), java.lang.Integer.valueOf(this.f281084g.size()), java.lang.Integer.valueOf(this.f281085h.size()));
                    }
                }
            }
        }
    }

    public boolean s0(long j17) {
        if (!u0()) {
            return false;
        }
        r0();
        return this.f281085h.contains(java.lang.Long.valueOf(j17));
    }

    public boolean t0() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f280113d.x()) || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.j4(this.f280113d.x()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f281082e)) ? false : true;
    }

    public boolean u0() {
        java.lang.String x17 = this.f280113d.x();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17)) {
            return false;
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.j4(x17);
    }

    public void v0(int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (u0()) {
            long p07 = p0(f9Var.m124847x74d37ac6());
            int size = this.f281084g.get(java.lang.Long.valueOf(p07)) == null ? 0 : ((java.util.Set) this.f281084g.get(java.lang.Long.valueOf(p07))).size();
            if (p07 < 0) {
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

    public final void w0(int i17, int i18, int i19, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        if (this.f280113d.f542250l.m78640xe4b7b786(i17) == null) {
            this.f280113d.f542250l.m78623x84f07bce(i17, i18, i19, onMenuItemClickListener);
        } else {
            this.f280113d.f542250l.m78716x5583d1d(i17, i18, i19, onMenuItemClickListener);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        if (u0()) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p7 p7Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p7(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(p7Var, 128L, false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        sb5.z1 z1Var;
        if (u0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "onChattingEnterAnimStart");
            if (te5.s1.f500280a.a()) {
                if (this.f281094t == null) {
                    this.f281094t = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.uk();
                }
                z1Var = this.f281094t;
            } else {
                z1Var = null;
            }
            if (z1Var != null) {
                yb5.d dVar = this.f280113d;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.uk ukVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.uk) z1Var;
                ukVar.f281615a = dVar.f542250l.m78394x7e63ed49("key_notify_message_real_username");
                ukVar.f281616b = dVar.f542250l.m78394x7e63ed49("key_notify_message_title");
            }
            r0();
        }
    }
}
