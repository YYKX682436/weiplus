package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class l5 implements com.tencent.mm.plugin.finder.extension.reddot.ua, com.tencent.mm.plugin.finder.extension.reddot.wa {
    public static final com.tencent.mm.plugin.finder.extension.reddot.g4 H;
    public static final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public static final java.util.Map f105648J;
    public static final jz5.g K;
    public static final java.util.Set L;
    public float A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f105649a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.t5 f105650b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f105651c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f105652d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f105653e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f105654f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f105655g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f105656h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f105657i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.HashMap f105658j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.j4 f105659k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f105660l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f105661m;

    /* renamed from: n, reason: collision with root package name */
    public r45.at2 f105662n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f105663o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f105664p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f105665q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f105666r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f105667s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f105668t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f105669u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f105670v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.l6 f105671w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f105672x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f105673y;

    /* renamed from: z, reason: collision with root package name */
    public java.util.List f105674z;

    static {
        com.tencent.mm.plugin.finder.extension.reddot.g4 g4Var = new com.tencent.mm.plugin.finder.extension.reddot.g4(null);
        H = g4Var;
        I = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.e4.f105493d);
        f105648J = kz5.c1.k(new jz5.l("FinderEntrance", new jz5.l("FinderEntrance", 1)), new jz5.l("FinderLiveEntrance", new jz5.l("FinderLiveEntrance", 2)), new jz5.l("Listen.Entrance_10", new jz5.l("Listen.Entrance", 10)), new jz5.l("Listen.Entrance_14", new jz5.l("Listen.Entrance", 14)), new jz5.l("NewLife.Entrance_4", new jz5.l("NewLife.Entrance", 4)), new jz5.l("NewLife.Entrance_6", new jz5.l("NewLife.Entrance", 6)), new jz5.l("NewLife.Entrance_8", new jz5.l("NewLife.Entrance", 8)), new jz5.l("Search.Entrance", new jz5.l("Search.Entrance", 9)), new jz5.l("Game.Entrance", new jz5.l("Game.Entrance", 13)));
        jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.f4.f105506d);
        K = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.d4.f105456d);
        java.util.Set keySet = g4Var.d().keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        L = keySet;
    }

    public l5(zy2.fa redDotManager, com.tencent.mm.plugin.finder.extension.reddot.t5 storage) {
        boolean z17;
        boolean z18;
        kotlin.jvm.internal.o.g(redDotManager, "redDotManager");
        kotlin.jvm.internal.o.g(storage, "storage");
        this.f105649a = redDotManager;
        this.f105650b = storage;
        boolean z19 = false;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        this.f105651c = z18;
        this.f105652d = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.x4.f105989d);
        this.f105653e = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.l4.f105647d);
        this.f105654f = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.y4.f106032d);
        this.f105661m = com.tencent.mm.plugin.finder.storage.aj0.f126440a.K() ? ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "红点nm频控后台下发配置在进入发现页前更新", e42.c0.clicfg_finder_reddot_freq_ctrl_conf_update_when_enter_find, java.lang.Boolean.valueOf(kb2.b.f306225a.a()), false, com.tencent.mm.plugin.finder.storage.ng0.f127253d, 8, null)).booleanValue() : ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.f126453g0).getValue()).r()).booleanValue();
        this.f105663o = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.u4(this));
        this.f105664p = w() >= 0;
        if (w() == 1 && com.tencent.mm.plugin.finder.extension.reddot.qa.d(v(), 0, null, 3, null).size() > 0) {
            z19 = true;
        }
        this.f105665q = z19;
        this.f105666r = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.p4(this));
        this.f105667s = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.t4(this));
        this.f105668t = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.o4(this));
        this.f105669u = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.d5(this));
        this.f105670v = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.k5.f105627d);
        this.f105672x = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.w4.f105961d);
        this.B = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.k4(this));
        this.C = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.s4.f105843d);
        this.D = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.c5.f105441d);
        this.E = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.g5.f105537d);
        this.F = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.h5.f105551d);
        this.G = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.i5.f105593d);
    }

    public static java.util.HashMap f(com.tencent.mm.plugin.finder.extension.reddot.l5 l5Var, java.lang.StringBuilder sb6, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        java.util.ArrayList arrayList;
        int i18;
        boolean z19;
        java.util.HashMap hashMap;
        java.util.ArrayList arrayList2;
        boolean z27 = (i17 & 2) != 0 ? true : z17;
        int i19 = 0;
        boolean z28 = (i17 & 4) != 0 ? false : z18;
        l5Var.getClass();
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) ((ey2.r1) pf5.u.f353936a.e(c61.l7.class).a(ey2.r1.class)).f257491f).getValue()).booleanValue();
        com.tencent.mm.plugin.finder.extension.reddot.g4 g4Var = H;
        zy2.fa faVar = l5Var.f105649a;
        if (booleanValue) {
            java.util.HashMap M = zy2.la.M(faVar, g92.b.f269769e.T0(), null, 2, null);
            if (M != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(M.size());
                hashMap = null;
                for (java.util.Map.Entry entry : M.entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) entry.getValue();
                    java.lang.String c17 = g4Var.c(str, jbVar);
                    if (hashMap == null) {
                        hashMap = new java.util.HashMap();
                    }
                    java.lang.Integer k17 = l5Var.k(c17);
                    int intValue = k17 != null ? k17.intValue() : 0;
                    r45.oc4 oc4Var = (r45.oc4) l5Var.y().get(c17);
                    arrayList3.add((com.tencent.mm.plugin.finder.extension.reddot.i4) hashMap.put(str, new com.tencent.mm.plugin.finder.extension.reddot.i4(jbVar, c17, intValue, oc4Var != null && oc4Var.getBoolean(0))));
                }
            } else {
                hashMap = null;
            }
            if (sb6 == null) {
                return hashMap;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("collectFromManager:");
            if (hashMap != null) {
                arrayList2 = new java.util.ArrayList(hashMap.size());
                for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
                    arrayList2.add(((com.tencent.mm.plugin.finder.extension.reddot.i4) entry2.getValue()).f105588b + ",exposeCnt=" + ((com.tencent.mm.plugin.finder.extension.reddot.i4) entry2.getValue()).f105589c + ",time=" + ((com.tencent.mm.plugin.finder.extension.reddot.i4) entry2.getValue()).f105587a.field_time);
                }
            } else {
                arrayList2 = null;
            }
            sb7.append(arrayList2);
            sb7.append('\t');
            sb6.append(sb7.toString());
            return hashMap;
        }
        java.util.HashMap hashMap2 = null;
        for (java.lang.String str2 : g4Var.e()) {
            com.tencent.mm.plugin.finder.extension.reddot.jb i27 = faVar.i(str2, g92.b.f269769e.T0(), z27, z28);
            if (i27 != null) {
                if (hashMap2 == null) {
                    hashMap2 = new java.util.HashMap();
                }
                java.lang.String c18 = g4Var.c(str2, i27);
                java.lang.Integer k18 = l5Var.k(c18);
                int intValue2 = k18 != null ? k18.intValue() : i19;
                r45.oc4 oc4Var2 = (r45.oc4) l5Var.y().get(c18);
                if (oc4Var2 != null) {
                    boolean z29 = oc4Var2.getBoolean(i19);
                    z19 = true;
                    if (z29) {
                        i18 = intValue2;
                    }
                }
                i18 = intValue2;
                z19 = false;
            }
            i19 = 0;
        }
        if (sb6 != null) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("collectExistRedDot:");
            if (hashMap2 != null) {
                arrayList = new java.util.ArrayList(hashMap2.size());
                for (java.util.Map.Entry entry3 : hashMap2.entrySet()) {
                    arrayList.add(((com.tencent.mm.plugin.finder.extension.reddot.i4) entry3.getValue()).f105588b + ",exposeCnt=" + ((com.tencent.mm.plugin.finder.extension.reddot.i4) entry3.getValue()).f105589c + ",time=" + ((com.tencent.mm.plugin.finder.extension.reddot.i4) entry3.getValue()).f105587a.field_time);
                }
            } else {
                arrayList = null;
            }
            sb8.append(arrayList);
            sb8.append('\t');
            sb6.append(sb8.toString());
        }
        return hashMap2;
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.z5 A() {
        return (com.tencent.mm.plugin.finder.extension.reddot.z5) ((jz5.n) this.f105669u).getValue();
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.u6 B() {
        return (com.tencent.mm.plugin.finder.extension.reddot.u6) ((jz5.n) this.f105670v).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean C(java.lang.String r13, com.tencent.mm.plugin.finder.extension.reddot.jb r14) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.l5.C(java.lang.String, com.tencent.mm.plugin.finder.extension.reddot.jb):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0279, code lost:
    
        if (r2 == null) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(int r18, java.lang.String r19, java.lang.String r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.l5.D(int, java.lang.String, java.lang.String, int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f6, code lost:
    
        if (r5.getBoolean(1) == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean E(java.lang.String r20, java.lang.String r21, com.tencent.mm.plugin.finder.extension.reddot.jb r22, java.util.HashMap r23) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.l5.E(java.lang.String, java.lang.String, com.tencent.mm.plugin.finder.extension.reddot.jb, java.util.HashMap):boolean");
    }

    public final int F(java.util.List list) {
        int i17;
        if (h()) {
            java.util.ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i17 = -1;
                    break;
                }
                if (((com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) listIterator.previous()).getValue()).f105591e == com.tencent.mm.plugin.finder.extension.reddot.u5.f105893n) {
                    i17 = listIterator.nextIndex();
                    break;
                }
            }
            if (i17 >= 0) {
                return i17;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void G(com.tencent.mm.ui.base.preference.r screen, com.tencent.mm.ui.base.preference.Preference pref, com.tencent.mm.ui.base.preference.n0 source) {
        int i17;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(screen, "screen");
        kotlin.jvm.internal.o.g(pref, "pref");
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", "onPreferenceTreeClick source:" + source);
        if (source == com.tencent.mm.ui.base.preference.n0.OnClick) {
            com.tencent.mm.plugin.finder.extension.reddot.o5 q17 = q();
            java.lang.String str = pref.f197780q;
            kotlin.jvm.internal.o.f(str, "getKey(...)");
            q17.getClass();
            com.tencent.mm.plugin.finder.extension.reddot.m5 m5Var = q17.f105745g;
            if (m5Var != null) {
                ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) q17.f105747i).getValue()).removeCallbacks(m5Var);
            }
            q17.f105745g = null;
            java.lang.String str2 = (java.lang.String) com.tencent.mm.plugin.finder.extension.reddot.s5.f105844o.get(str);
            boolean z17 = str2 == null || str2.length() == 0;
            java.lang.String str3 = "";
            java.lang.String str4 = q17.f105742d;
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click ");
                sb6.append(str);
                sb6.append(",but isn't care redDot path,watchTask:");
                com.tencent.mm.plugin.finder.extension.reddot.m5 m5Var2 = q17.f105745g;
                sb6.append(m5Var2 != null ? m5Var2.f105706e : null);
                sb6.append(',');
                com.tencent.mars.xlog.Log.i(str4, sb6.toString());
                q17.f105744f = "";
                q17.f105746h = null;
            } else {
                q17.f105744f = str2;
                com.tencent.mm.plugin.finder.extension.reddot.jb L0 = q17.f105739a.L0(str2);
                q17.f105746h = L0;
                if (L0 == null) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("click ");
                    sb7.append(str);
                    sb7.append(",but entry hasn't a redDot,watchTask:");
                    com.tencent.mm.plugin.finder.extension.reddot.m5 m5Var3 = q17.f105745g;
                    sb7.append(m5Var3 != null ? m5Var3.f105706e : null);
                    sb7.append('!');
                    com.tencent.mars.xlog.Log.i(str4, sb7.toString());
                    q17.f105744f = "";
                } else {
                    r45.f03 I0 = L0.I0(q17.f105744f);
                    if (I0 != null && I0.f373899s == 1) {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("click ");
                        sb8.append(str);
                        sb8.append(",but ");
                        sb8.append(q17.f105744f);
                        sb8.append("'s redDot ignore freq limit,watchTask:");
                        com.tencent.mm.plugin.finder.extension.reddot.m5 m5Var4 = q17.f105745g;
                        sb8.append(m5Var4 != null ? m5Var4.f105706e : null);
                        sb8.append('!');
                        com.tencent.mars.xlog.Log.i(str4, sb8.toString());
                        q17.f105744f = "";
                    } else {
                        q17.f105743e = str;
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("click ");
                        sb9.append(str);
                        sb9.append(",keyPath=");
                        sb9.append(q17.f105744f);
                        sb9.append(',');
                        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = q17.f105746h;
                        sb9.append(hc2.u0.e(jbVar != null ? jbVar.field_ctrInfo : null));
                        sb9.append("; watchTask:");
                        com.tencent.mm.plugin.finder.extension.reddot.m5 m5Var5 = q17.f105745g;
                        sb9.append(m5Var5 != null ? m5Var5.f105706e : null);
                        com.tencent.mars.xlog.Log.i(str4, sb9.toString());
                    }
                }
            }
            com.tencent.mm.plugin.finder.extension.reddot.o5 q18 = q();
            q18.getClass();
            java.lang.String redDotDicPath = H.c(q18.f105744f, q18.f105746h);
            com.tencent.mm.plugin.finder.extension.reddot.z5 A = A();
            java.lang.String str5 = pref.f197780q;
            kotlin.jvm.internal.o.f(str5, "getKey(...)");
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = q().f105746h;
            java.lang.String str6 = jbVar2 != null ? jbVar2.field_tips_uuid : null;
            java.util.List g17 = t().g();
            java.util.List e17 = t().e();
            com.tencent.mm.plugin.finder.extension.reddot.pb pbVar = (com.tencent.mm.plugin.finder.extension.reddot.pb) x().get(redDotDicPath);
            com.tencent.mm.plugin.finder.extension.reddot.pb u07 = pbVar != null ? pbVar.u0() : null;
            A.getClass();
            kotlin.jvm.internal.o.g(redDotDicPath, "redDotDicPath");
            if (str5.length() > 0) {
                A.f106057k = false;
                A.f106058l = null;
                A.f106050d = str5;
                A.f106051e = redDotDicPath;
                A.f106052f = android.os.SystemClock.elapsedRealtime();
                boolean b17 = kotlin.jvm.internal.o.b(str5, "album_dyna_photo_ui_title");
                java.lang.String str7 = A.f106048b;
                if (b17) {
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder("sns click ");
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    java.lang.String u17 = c17.u(68377, "");
                    sb10.append("snsSyncObjUser=" + u17 + ' ');
                    if (!(u17 == null || u17.length() == 0)) {
                        str3 = c17.u(68418, "");
                        sb10.append("snsId=" + str3 + '!');
                    }
                    com.tencent.mars.xlog.Log.i(str7, sb10.toString());
                    str6 = str3;
                }
                A.f106054h = str6;
                A.f106055i = g17;
                A.f106056j = e17;
                java.lang.Long valueOf = java.lang.Long.valueOf(A.f106066t);
                if (!(valueOf.longValue() > 0)) {
                    valueOf = null;
                }
                A.f106059m = valueOf != null ? valueOf.longValue() : c01.id.e();
                A.f106063q = u07;
                if (kotlin.jvm.internal.o.b(A.f106050d, "find_friends_by_ting") || kotlin.jvm.internal.o.b(A.f106050d, "find_friends_by_ting_play_state")) {
                    ef0.k2 k2Var = (ef0.k2) ((qk.n8) i95.n0.c(qk.n8.class));
                    k2Var.getClass();
                    gm4.a aVar = gm4.a.f273557a;
                    com.tencent.mm.sdk.platformtools.o4 o4Var = gm4.a.f273558b;
                    i17 = o4Var != null ? o4Var.f("ting_listen_main_page_init_tab_type") : false ? aVar.a("ting_listen_main_page_init_tab_type", false) : ((java.lang.Number) ((jz5.n) k2Var.f252254f).getValue()).intValue();
                } else {
                    i17 = A.f106049c;
                }
                A.f106065s = i17;
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder("onClick key=");
                sb11.append(str5);
                sb11.append(",clickTingSelectTab=");
                sb11.append(A.f106065s);
                sb11.append(",redDotDicPath=");
                sb11.append(redDotDicPath);
                sb11.append(",uuid=");
                sb11.append(A.f106054h);
                sb11.append(",exposeList=");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(g17, 10));
                java.util.Iterator it = ((java.util.ArrayList) g17).iterator();
                while (it.hasNext()) {
                    arrayList2.add(((r45.rc4) it.next()).getString(2));
                }
                sb11.append(arrayList2);
                sb11.append(",sns=");
                if (e17 != null) {
                    arrayList = new java.util.ArrayList(kz5.d0.q(e17, 10));
                    java.util.Iterator it6 = e17.iterator();
                    while (it6.hasNext()) {
                        arrayList.add(((r45.rc4) it6.next()).getString(2));
                    }
                } else {
                    arrayList = null;
                }
                sb11.append(arrayList);
                sb11.append(",nmInfo=");
                sb11.append(u07);
                com.tencent.mars.xlog.Log.i(str7, sb11.toString());
            }
        }
    }

    public void H(java.lang.String source, java.lang.String path, com.tencent.mm.plugin.finder.extension.reddot.jb localFinderRedDotCtrInfo, java.util.List allRedDotList, java.util.List sortWinList) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(localFinderRedDotCtrInfo, "localFinderRedDotCtrInfo");
        kotlin.jvm.internal.o.g(allRedDotList, "allRedDotList");
        kotlin.jvm.internal.o.g(sortWinList, "sortWinList");
        java.util.concurrent.ConcurrentHashMap y17 = y();
        if (y17.isEmpty()) {
            y17 = new java.util.concurrent.ConcurrentHashMap();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRedDotAbandon but penalizedMap is empty ");
            Q(sb6, y17);
            com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", sb6.toString());
        }
        com.tencent.mm.plugin.finder.extension.reddot.z5 A = A();
        java.lang.String abandonRedDotPath = H.c(path, localFinderRedDotCtrInfo);
        java.util.List e17 = t().e();
        A.getClass();
        kotlin.jvm.internal.o.g(abandonRedDotPath, "abandonRedDotPath");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        long j17 = A.h() ? A.f106059m : A.f106066t;
        long e18 = c01.id.e();
        java.lang.String g17 = A.g(sb7, false, e17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = y17;
        org.json.JSONObject f17 = A.f(sb7, false, "FinderEntrance", 1, com.tencent.mm.plugin.finder.extension.reddot.z5.l(allRedDotList, "FinderEntrance"), concurrentHashMap);
        A.a(f17, "FinderEntrance", abandonRedDotPath, sortWinList);
        org.json.JSONObject f18 = A.f(sb7, false, "Listen.Entrance_14", 14, com.tencent.mm.plugin.finder.extension.reddot.z5.l(allRedDotList, "Listen.Entrance_14"), concurrentHashMap);
        A.a(f18, "Listen.Entrance_14", abandonRedDotPath, sortWinList);
        org.json.JSONObject f19 = A.f(sb7, false, "Listen.Entrance_10", 10, com.tencent.mm.plugin.finder.extension.reddot.z5.l(allRedDotList, "Listen.Entrance_10"), concurrentHashMap);
        A.a(f19, "Listen.Entrance_10", abandonRedDotPath, sortWinList);
        org.json.JSONObject f27 = A.f(sb7, false, "FinderLiveEntrance", 2, com.tencent.mm.plugin.finder.extension.reddot.z5.l(allRedDotList, "FinderLiveEntrance"), concurrentHashMap);
        A.a(f27, "FinderLiveEntrance", abandonRedDotPath, sortWinList);
        org.json.JSONObject f28 = A.f(sb7, false, "NewLife.Entrance_6", 6, com.tencent.mm.plugin.finder.extension.reddot.z5.l(allRedDotList, "NewLife.Entrance_6"), concurrentHashMap);
        A.a(f28, "NewLife.Entrance_6", abandonRedDotPath, sortWinList);
        org.json.JSONObject f29 = A.f(sb7, false, "NewLife.Entrance_8", 8, com.tencent.mm.plugin.finder.extension.reddot.z5.l(allRedDotList, "NewLife.Entrance_8"), concurrentHashMap);
        A.a(f29, "NewLife.Entrance_8", abandonRedDotPath, sortWinList);
        org.json.JSONObject f37 = A.f(sb7, false, "Search.Entrance", 9, com.tencent.mm.plugin.finder.extension.reddot.z5.l(allRedDotList, "Search.Entrance"), concurrentHashMap);
        A.a(f37, "Search.Entrance", abandonRedDotPath, sortWinList);
        org.json.JSONObject f38 = A.f(sb7, false, "Game.Entrance", 13, com.tencent.mm.plugin.finder.extension.reddot.z5.l(allRedDotList, "Game.Entrance"), concurrentHashMap);
        A.a(f38, "Game.Entrance", abandonRedDotPath, sortWinList);
        com.tencent.mm.plugin.finder.extension.reddot.z5.m(A, j17, e18, g17, f17, f18, f19, f27, f28, f29, "", f37, "", "", f38, "", A.d(((com.tencent.mm.plugin.finder.extension.reddot.l5) A.f106047a).v()), 0, 0L, 3L, 196608, null);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(source);
        sb8.append(" onRedDotAbandon abandonRedDotPath=");
        sb8.append(abandonRedDotPath);
        sb8.append(",prioritySortList=");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(sortWinList, 10));
        java.util.Iterator it = sortWinList.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
        }
        sb8.append(arrayList);
        sb8.append(" enterTime=");
        sb8.append(j17);
        sb8.append(",exitTime=");
        sb8.append(e18);
        sb8.append(',');
        sb8.append((java.lang.Object) sb7);
        com.tencent.mars.xlog.Log.i(A.f106048b, sb8.toString());
    }

    public void I(r45.rc4 exposeInfo) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.extension.reddot.l6 l6Var;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        jz5.f0 f0Var;
        java.lang.Object obj2;
        jz5.f0 f0Var2;
        kotlin.jvm.internal.o.g(exposeInfo, "exposeInfo");
        kc2.g1 b17 = ((com.tencent.mm.plugin.finder.extension.reddot.x2) this.f105649a).b1();
        if (b17 != null) {
            java.util.Iterator it = ((java.util.LinkedList) ((jz5.n) b17.f306394r).getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (kotlin.jvm.internal.o.b(((kc2.c0) ((zy2.v7) obj2)).f306335e, exposeInfo.getString(0))) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            zy2.v7 v7Var = (zy2.v7) obj2;
            if (v7Var != null) {
                r45.vs2 vs2Var = (r45.vs2) exposeInfo.getCustom(3);
                kc2.c0 c0Var = (kc2.c0) v7Var;
                if (vs2Var != null) {
                    if (((java.lang.Boolean) ((jz5.n) c0Var.f306337g).getValue()).booleanValue()) {
                        com.tencent.mars.xlog.Log.i(c0Var.m(), "onRedDotExpose " + vs2Var.f388503x);
                    }
                    c0Var.f306332b.post(new kc2.a0(c0Var, vs2Var));
                }
                f0Var2 = jz5.f0.f302826a;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("FinderKaraInfoManager", "onRedDotExpose " + exposeInfo.getString(0) + " find businessManager is null");
            }
        }
        if (this.f105665q) {
            com.tencent.mm.plugin.finder.extension.reddot.u6 B = B();
            int integer = exposeInfo.getInteger(1);
            r45.vs2 vs2Var2 = (r45.vs2) exposeInfo.getCustom(3);
            if (vs2Var2 == null || (str = vs2Var2.f388503x) == null) {
                str = "";
            }
            B.getClass();
            if (B.f105908m) {
                B.a(str, integer);
                java.util.List f17 = B.f();
                kotlin.jvm.internal.o.f(f17, "<get-historyRecords>(...)");
                synchronized (f17) {
                    java.util.Iterator it6 = f17.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj = it6.next();
                            if (((r45.sw3) obj).getInteger(0) == integer) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                }
                r45.sw3 sw3Var = (r45.sw3) obj;
                if (sw3Var != null) {
                    int e17 = c01.id.e();
                    if (!B.j(B.f105903h * 1000, e17 * 1000)) {
                        B.k(sw3Var);
                    }
                    java.util.LinkedList list = sw3Var.getList(1);
                    kotlin.jvm.internal.o.f(list, "getRecord_items(...)");
                    r45.tw3 tw3Var = (r45.tw3) kz5.n0.Z(list);
                    if (tw3Var != null) {
                        tw3Var.set(1, java.lang.Integer.valueOf(tw3Var.getInteger(1) + 1));
                    }
                    com.tencent.mm.plugin.finder.extension.reddot.x6.f105995a.c(sw3Var, e17);
                    B.l("expose", e17, integer, sw3Var);
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e("FinderRedDotFreqCtrlXStrategy", "[expose] but businessType=" + integer + " record is null!");
                }
            }
            com.tencent.mm.plugin.finder.extension.reddot.l6 l6Var2 = this.f105671w;
            if (l6Var2 != null) {
                java.util.List<java.util.Map.Entry> g17 = g("onRedDotExposureCall");
                if (g17 != null) {
                    arrayList = new java.util.ArrayList(kz5.d0.q(g17, 10));
                    for (java.util.Map.Entry entry : g17) {
                        arrayList.add(new jz5.l(entry.getKey(), ((com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue()).f105587a.field_tips_uuid));
                    }
                } else {
                    arrayList = null;
                }
                l6Var2.f105685k = arrayList;
            }
            com.tencent.mm.plugin.finder.extension.reddot.l6 l6Var3 = this.f105671w;
            java.util.List list2 = l6Var3 != null ? l6Var3.f105685k : null;
            if ((!(list2 == null || list2.isEmpty()) || B().f105908m) && (l6Var = this.f105671w) != null) {
                l6Var.g(this, v(), x(), y(), o(), (r21 & 32) != 0 ? null : null, (r21 & 64) != 0 ? null : null, (r21 & 128) != 0 ? null : null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J(com.tencent.mm.autogen.events.RedDotExposureEventEvent r20) {
        /*
            Method dump skipped, instructions count: 2202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.l5.J(com.tencent.mm.autogen.events.RedDotExposureEventEvent):void");
    }

    public void K(boolean z17, com.tencent.mm.plugin.finder.extension.reddot.e3 e3Var) {
        if (this.f105664p) {
            com.tencent.mm.plugin.finder.extension.reddot.z5 A = A();
            if (kotlin.jvm.internal.o.b(A.f106050d, "find_friends_by_look") && z17) {
                A.f106064r = e3Var;
                com.tencent.mars.xlog.Log.i(A.f106048b, "top story visible, haveClickTab=" + A.h() + ",clickEntryKey=" + A.f106050d + ",clickTopStorySelectTab=" + A.f106064r + ",clickStartTimeMs=" + A.f106052f + ",clickHide=" + A.f106057k + ",clickLastEnterFindTime=" + A.f106059m + ",clickBackgroundTimeList=" + A.c() + ";enterFindTime=" + A.f106066t + ",exitFindTime=" + A.f106067u + '!');
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x003d, code lost:
    
        if (r6.moveToFirst() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x003f, code lost:
    
        r10 = new com.tencent.mm.plugin.finder.extension.reddot.pb();
        r10.convertFrom(r6);
        r11 = r10.field_freqControlId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0049, code lost:
    
        if (r11 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x004f, code lost:
    
        if (r11.length() != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0052, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0055, code lost:
    
        if (r11 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0057, code lost:
    
        com.tencent.mars.xlog.Log.e("Finder.RedDotFreqCtrlInfoStorage", "delete[" + r5.delete(r10.systemRowid) + "] table=FinderRedDotFreqControl field_freqControlId=" + r10.field_freqControlId + " path=" + r10.field_dicPath);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0097, code lost:
    
        if (r6.moveToNext() != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0090, code lost:
    
        r15.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0054, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0099, code lost:
    
        vz5.b.a(r6, null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.l5.L(java.lang.String):void");
    }

    public final void M(r45.vb4 vb4Var) {
        if (vb4Var != null) {
            vb4Var.set(0, 0);
            vb4Var.set(1, 0);
            vb4Var.getList(2).clear();
        }
    }

    public final java.util.Set N(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList) {
        r45.tt2 tt2Var = new r45.tt2();
        java.util.LinkedList list = tt2Var.getList(0);
        r45.ut2 ut2Var = new r45.ut2();
        ut2Var.set(0, str2);
        ut2Var.set(1, 0);
        list.add(ut2Var);
        return this.f105649a.P(str, tt2Var, linkedList);
    }

    public final java.util.List O(int i17, java.util.HashMap hashMap, java.lang.String str, boolean z17) {
        java.util.Set entrySet;
        jz5.l lVar;
        jz5.l lVar2;
        int size;
        kotlin.jvm.internal.f0 f0Var;
        java.util.LinkedList linkedList;
        boolean z18 = this.f105651c;
        oc2.a1 a1Var = z18 ? new oc2.a1(str) : null;
        if (hashMap == null || (entrySet = hashMap.entrySet()) == null) {
            return null;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : entrySet) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (((com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue()).f105587a.Y0((java.lang.String) entry.getKey())) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.extension.reddot.i4 i4Var = (com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) it.next()).getValue();
            com.tencent.mm.plugin.finder.extension.reddot.u5 u5Var = com.tencent.mm.plugin.finder.extension.reddot.u5.f105888f;
            i4Var.getClass();
            i4Var.f105591e = u5Var;
        }
        int size2 = i17 - arrayList.size();
        if (z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sRedDotSort maxCnt=");
            sb6.append(i17);
            sb6.append(" remainCnt=");
            sb6.append(size2);
            sb6.append(", sRedDotMatched=");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) it6.next()).getValue()).a());
            }
            sb6.append(arrayList3);
            sb6.append(";sRedDotOthers=");
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                arrayList4.add(((com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) it7.next()).getValue()).a());
            }
            sb6.append(arrayList4);
            com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", sb6.toString());
        }
        if (size2 >= 0) {
            lVar = new jz5.l(arrayList, arrayList2);
        } else {
            java.util.List F0 = kz5.n0.F0(arrayList, new com.tencent.mm.plugin.finder.extension.reddot.e5((yz5.l) ((jz5.n) this.D).getValue()));
            if (z18) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("sRedDotSort sRedDotTimeSort=");
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(F0, 10));
                java.util.Iterator it8 = F0.iterator();
                while (it8.hasNext()) {
                    arrayList5.add(((com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) it8.next()).getValue()).a());
                }
                sb7.append(arrayList5);
                com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", sb7.toString());
            }
            lVar = new jz5.l(F0, arrayList2);
        }
        java.util.List list = (java.util.List) lVar.f302833d;
        java.util.List list2 = (java.util.List) lVar.f302834e;
        linkedList2.addAll(list);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = list2;
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        int size3 = i17 - list.size();
        f0Var2.f310116d = size3;
        if (size3 <= 0 || ((java.util.List) h0Var.f310123d).isEmpty()) {
            linkedList2.addAll((java.util.Collection) h0Var.f310123d);
            return linkedList2;
        }
        java.util.List list3 = (java.util.List) h0Var.f310123d;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list3) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
            if (((com.tencent.mm.plugin.finder.extension.reddot.i4) entry2.getValue()).f105587a.a1((java.lang.String) entry2.getKey())) {
                arrayList6.add(obj2);
            } else {
                arrayList7.add(obj2);
            }
        }
        if (!arrayList6.isEmpty()) {
            java.util.Iterator it9 = arrayList6.iterator();
            while (it9.hasNext()) {
                com.tencent.mm.plugin.finder.extension.reddot.i4 i4Var2 = (com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) it9.next()).getValue();
                com.tencent.mm.plugin.finder.extension.reddot.u5 u5Var2 = com.tencent.mm.plugin.finder.extension.reddot.u5.f105891i;
                i4Var2.getClass();
                i4Var2.f105591e = u5Var2;
            }
            r45.sl0 sl0Var = (r45.sl0) v().getCustom(5);
            java.util.LinkedList list4 = sl0Var != null ? sl0Var.getList(2) : null;
            if (!(list4 == null || list4.isEmpty())) {
                java.util.List F02 = kz5.n0.F0(arrayList6, new com.tencent.mm.plugin.finder.extension.reddot.q4(list4));
                if (z18) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("before exemptSort entryList=");
                    java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(list3, 10));
                    java.util.Iterator it10 = list3.iterator();
                    while (it10.hasNext()) {
                        arrayList8.add(((com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) it10.next()).getValue()).a());
                    }
                    sb8.append(arrayList8);
                    com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", sb8.toString());
                }
                lVar2 = new jz5.l(F02, arrayList7);
                if (z18) {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("after exemptSort sortExemptMatched size=");
                    sb9.append(F02.size());
                    sb9.append(",detail=");
                    java.util.ArrayList arrayList9 = new java.util.ArrayList(kz5.d0.q(F02, 10));
                    java.util.Iterator it11 = F02.iterator();
                    while (it11.hasNext()) {
                        arrayList9.add(((com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) it11.next()).getValue()).a());
                    }
                    sb9.append(arrayList9);
                    sb9.append(" others=");
                    java.util.ArrayList arrayList10 = new java.util.ArrayList(kz5.d0.q(arrayList7, 10));
                    java.util.Iterator it12 = arrayList7.iterator();
                    while (it12.hasNext()) {
                        arrayList10.add(((com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) it12.next()).getValue()).a());
                    }
                    sb9.append(arrayList10);
                    com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", sb9.toString());
                }
                java.util.List list5 = (java.util.List) lVar2.f302833d;
                java.util.List list6 = (java.util.List) lVar2.f302834e;
                linkedList2.addAll(list5);
                h0Var.f310123d = list6;
                size = f0Var2.f310116d - list5.size();
                f0Var2.f310116d = size;
                if (size > 0 || ((java.util.List) h0Var.f310123d).isEmpty()) {
                    linkedList2.addAll((java.util.Collection) h0Var.f310123d);
                    return linkedList2;
                }
                if (!h()) {
                    jz5.l R = R((java.util.List) h0Var.f310123d, f0Var2.f310116d);
                    java.util.List list7 = (java.util.List) R.f302833d;
                    java.util.List list8 = (java.util.List) R.f302834e;
                    linkedList2.addAll(list7);
                    h0Var.f310123d = list8;
                    int size4 = f0Var2.f310116d - list7.size();
                    f0Var2.f310116d = size4;
                    if (size4 <= 0 || ((java.util.List) h0Var.f310123d).isEmpty()) {
                        linkedList2.addAll((java.util.Collection) h0Var.f310123d);
                        return linkedList2;
                    }
                    linkedList2.addAll(l((java.util.List) h0Var.f310123d));
                    return linkedList2;
                }
                if (a1Var != null) {
                    a1Var.c();
                }
                kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
                kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
                g0Var.f310121d = android.os.SystemClock.elapsedRealtime();
                kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
                kc2.g1 b17 = ((com.tencent.mm.plugin.finder.extension.reddot.x2) this.f105649a).b1();
                if (b17 != null) {
                    com.tencent.mm.feature.api.discover.DiscoveryReddotFeatures h17 = b17.h();
                    if (a1Var != null) {
                        oc2.a1.d(a1Var, "features", false, 2, null);
                    }
                    ys.f fVar = (ys.f) ((jz5.n) this.f105672x).getValue();
                    linkedList = linkedList2;
                    f0Var = f0Var2;
                    com.tencent.mm.plugin.finder.extension.reddot.f5 f5Var = new com.tencent.mm.plugin.finder.extension.reddot.f5(g0Var2, a1Var, h0Var, str, this, f0Var2, z17, linkedList2, c0Var, g0Var);
                    il0.h hVar = (il0.h) fVar;
                    synchronized (hVar) {
                        hVar.Bi(str, h17, f5Var);
                    }
                } else {
                    f0Var = f0Var2;
                    linkedList = linkedList2;
                }
                if (c0Var.f310112d) {
                    return linkedList;
                }
                kotlin.jvm.internal.f0 f0Var3 = f0Var;
                jz5.l R2 = R((java.util.List) h0Var.f310123d, f0Var3.f310116d);
                java.util.List list9 = (java.util.List) R2.f302833d;
                java.util.List list10 = (java.util.List) R2.f302834e;
                java.util.LinkedList linkedList3 = linkedList;
                linkedList3.addAll(list9);
                h0Var.f310123d = list10;
                int size5 = f0Var3.f310116d - list9.size();
                f0Var3.f310116d = size5;
                if (size5 <= 0 || ((java.util.List) h0Var.f310123d).isEmpty()) {
                    linkedList3.addAll((java.util.Collection) h0Var.f310123d);
                    return linkedList3;
                }
                linkedList3.addAll(l((java.util.List) h0Var.f310123d));
                return linkedList3;
            }
        }
        lVar2 = new jz5.l(arrayList6, arrayList7);
        java.util.List list52 = (java.util.List) lVar2.f302833d;
        java.util.List list62 = (java.util.List) lVar2.f302834e;
        linkedList2.addAll(list52);
        h0Var.f310123d = list62;
        size = f0Var2.f310116d - list52.size();
        f0Var2.f310116d = size;
        if (size > 0) {
        }
        linkedList2.addAll((java.util.Collection) h0Var.f310123d);
        return linkedList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x044f, code lost:
    
        if (r2 == null) goto L211;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0353  */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38, types: [r45.at2, com.tencent.mm.protobuf.e] */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40, types: [com.tencent.mm.protobuf.e] */
    /* JADX WARN: Type inference failed for: r10v47, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v54, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v70 */
    /* JADX WARN: Type inference failed for: r10v71 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P(r45.at2 r57) {
        /*
            Method dump skipped, instructions count: 2084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.l5.P(r45.at2):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x015c, code lost:
    
        if ((r3 != null ? r3.getInteger(1) : 0) < r12) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(java.lang.StringBuilder r19, java.util.concurrent.ConcurrentHashMap r20) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.l5.Q(java.lang.StringBuilder, java.util.concurrent.ConcurrentHashMap):void");
    }

    public final jz5.l R(java.util.List list, int i17) {
        java.util.List e17 = B().e();
        if (!(!e17.isEmpty())) {
            return new jz5.l(kz5.p0.f313996d, list);
        }
        java.util.LinkedList<java.util.Map.Entry> linkedList = new java.util.LinkedList();
        java.util.Iterator it = e17.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) obj).getValue()).f105587a.field_businessType == intValue) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            linkedList.addAll(arrayList);
            if (linkedList.size() >= i17 || arrayList2.isEmpty()) {
                list = arrayList2;
                break;
            }
            list = arrayList2;
        }
        for (java.util.Map.Entry entry : linkedList) {
            r45.en enVar = B().f105907l;
            java.util.LinkedList list2 = enVar != null ? enVar.getList(0) : null;
            com.tencent.mm.plugin.finder.extension.reddot.u5 u5Var = (list2 == null || list2.isEmpty()) ^ true ? com.tencent.mm.plugin.finder.extension.reddot.u5.f105892m : com.tencent.mm.plugin.finder.extension.reddot.u5.f105889g;
            com.tencent.mm.plugin.finder.extension.reddot.i4 i4Var = (com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue();
            i4Var.getClass();
            i4Var.f105591e = u5Var;
            if (u5Var == com.tencent.mm.plugin.finder.extension.reddot.u5.f105889g) {
                java.lang.Float f17 = (java.lang.Float) B().g().get(((com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue()).f105587a.field_businessType);
                if ((f17 != null ? f17.floatValue() : 0.0f) > 0.0f) {
                    com.tencent.mm.plugin.finder.extension.reddot.i4 i4Var2 = (com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue();
                    com.tencent.mm.plugin.finder.extension.reddot.x5 x5Var = com.tencent.mm.plugin.finder.extension.reddot.x5.f105991f;
                    i4Var2.getClass();
                    i4Var2.f105592f = x5Var;
                } else {
                    com.tencent.mm.plugin.finder.extension.reddot.i4 i4Var3 = (com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue();
                    com.tencent.mm.plugin.finder.extension.reddot.x5 x5Var2 = com.tencent.mm.plugin.finder.extension.reddot.x5.f105992g;
                    i4Var3.getClass();
                    i4Var3.f105592f = x5Var2;
                }
            }
        }
        if (this.f105651c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("xStrategySort maxCnt=");
            sb6.append(i17);
            sb6.append(",businessTypePriorityList=");
            sb6.append(e17);
            sb6.append("; xStrategySortResult=");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) it6.next()).getValue()).a());
            }
            sb6.append(arrayList3);
            sb6.append(";xStrategyRemains=");
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                arrayList4.add(((com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) it7.next()).getValue()).a());
            }
            sb6.append(arrayList4);
            com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", sb6.toString());
        }
        return new jz5.l(linkedList, list);
    }

    public final void a(r45.vb4 vb4Var, int i17, boolean z17, r45.at2 freqConfig, int i18) {
        kotlin.jvm.internal.o.g(freqConfig, "freqConfig");
        if (z17) {
            if (vb4Var != null) {
                vb4Var.set(0, java.lang.Integer.valueOf(vb4Var.getInteger(0) + 1));
                r45.f90 a17 = com.tencent.mm.plugin.finder.extension.reddot.qa.a(freqConfig, i17, vb4Var.getInteger(0));
                vb4Var.set(3, java.lang.Integer.valueOf((a17 != null ? a17.getInteger(0) : 0) - vb4Var.getInteger(0)));
                vb4Var.set(1, java.lang.Integer.valueOf(vb4Var.getInteger(1) + 1));
                vb4Var.getList(2).add(java.lang.Long.valueOf(c01.id.c()));
                return;
            }
            return;
        }
        if (vb4Var != null) {
            vb4Var.set(0, java.lang.Integer.valueOf(vb4Var.getInteger(0) + 1));
            r45.f90 a18 = com.tencent.mm.plugin.finder.extension.reddot.qa.a(freqConfig, i17, i18);
            vb4Var.set(3, java.lang.Integer.valueOf((a18 != null ? a18.getInteger(1) : 0) - vb4Var.getInteger(0)));
            vb4Var.set(1, java.lang.Integer.valueOf(vb4Var.getInteger(1) + 1));
            vb4Var.getList(2).add(java.lang.Long.valueOf(c01.id.c()));
        }
    }

    public final void b(java.lang.String str, com.tencent.mm.plugin.finder.extension.reddot.v5 v5Var) {
        java.util.HashMap hashMap = this.f105658j;
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        this.f105658j = hashMap;
    }

    public final void c(java.lang.String str, java.util.Map map) {
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            r45.oc4 oc4Var = (r45.oc4) ((java.util.Map.Entry) it.next()).getValue();
            if (oc4Var.getBoolean(0)) {
                java.lang.String string = oc4Var.getString(5);
                if (string == null) {
                    string = "";
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(oc4Var);
                N(str, string, linkedList);
            }
        }
    }

    public void d() {
        if (!this.f105651c || this.f105665q) {
            return;
        }
        if (w() < 1) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = "没有命中频控实验";
            e4Var.c();
            return;
        }
        if (com.tencent.mm.plugin.finder.extension.reddot.qa.d(v(), 0, null, 3, null).size() <= 0) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var2.f211776c = "后台没有下发频控配置";
            e4Var2.c();
        }
    }

    public final void e() {
        pm0.v.O("Finder.RedDotFreqControlHandler", new com.tencent.mm.plugin.finder.extension.reddot.m4(this));
        x().clear();
        o().clear();
        y().clear();
        com.tencent.mm.plugin.finder.extension.reddot.s5 t17 = t();
        java.lang.ref.WeakReference weakReference = t17.f105855k;
        pm0.v.X(new com.tencent.mm.plugin.finder.extension.reddot.r5(weakReference != null ? (com.tencent.mm.ui.base.preference.h0) weakReference.get() : null, t17));
        t().d();
        com.tencent.mm.plugin.finder.extension.reddot.o5 q17 = q();
        q17.f105743e = "";
        q17.f105744f = "";
        q17.f105746h = null;
        com.tencent.mm.plugin.finder.extension.reddot.m5 m5Var = q17.f105745g;
        if (m5Var != null) {
            ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) q17.f105747i).getValue()).removeCallbacks(m5Var);
        }
        q17.f105745g = null;
    }

    public final java.util.List g(java.lang.String str) {
        int i17 = 2;
        if (v().getInteger(2) <= 0) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str + " dropOverXLimitRedDot ");
        jz5.l n17 = n(sb6, false);
        if (n17 == null) {
            sb6.append(" after filter drop red dot list is empty!");
            com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", sb6.toString());
            return null;
        }
        java.lang.Object obj = n17.f302833d;
        java.util.List list = (java.util.List) obj;
        java.util.List<java.util.Map.Entry> list2 = (java.util.List) n17.f302834e;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(list);
        linkedList.addAll(list2);
        for (java.util.Map.Entry entry : list2) {
            int R0 = ((com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue()).f105587a.R0((java.lang.String) entry.getKey());
            java.lang.String str2 = (java.lang.String) entry.getKey();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            r45.oc4 oc4Var = new r45.oc4();
            oc4Var.set(5, (java.lang.String) entry.getKey());
            oc4Var.set(6, java.lang.Integer.valueOf(R0));
            oc4Var.set(3, java.lang.Boolean.TRUE);
            oc4Var.set(4, java.lang.Boolean.valueOf(L.contains(entry.getKey())));
            com.tencent.mm.plugin.finder.extension.reddot.d3[] d3VarArr = com.tencent.mm.plugin.finder.extension.reddot.d3.f105455d;
            oc4Var.set(12, java.lang.Integer.valueOf(i17));
            oc4Var.set(8, java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue()).f105589c));
            linkedList2.add(oc4Var);
            java.util.Set N = N("dropOverXLimitRedDot", str2, linkedList2);
            sb6.append("drop " + ((java.lang.String) entry.getKey()) + ' ' + ((com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue()).f105587a.field_tips_uuid + "(businessType=" + ((com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue()).f105587a.field_businessType + " - " + R0 + ") revokeSet=" + N + ";\t");
            if (N.contains(entry.getKey())) {
                H(str, (java.lang.String) entry.getKey(), ((com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue()).f105587a, linkedList, list);
                com.tencent.mm.plugin.finder.extension.reddot.l6 l6Var = this.f105671w;
                if (l6Var != null) {
                    java.lang.String field_tips_uuid = ((com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue()).f105587a.field_tips_uuid;
                    kotlin.jvm.internal.o.f(field_tips_uuid, "field_tips_uuid");
                    java.util.List<java.util.Map.Entry> winList = (java.util.List) obj;
                    kotlin.jvm.internal.o.g(winList, "winList");
                    com.tencent.mm.sdk.platformtools.c0 c17 = l6Var.c();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(winList, 10));
                    for (java.util.Map.Entry entry2 : winList) {
                        arrayList.add(new jz5.l(((com.tencent.mm.plugin.finder.extension.reddot.i4) entry2.getValue()).f105588b, ((com.tencent.mm.plugin.finder.extension.reddot.i4) entry2.getValue()).f105591e));
                    }
                    c17.d(field_tips_uuid, arrayList);
                }
            }
            i17 = 2;
        }
        com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", sb6.toString());
        return list2;
    }

    public boolean h() {
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
        if (!((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "发现页红点频控使用AI预测", e42.c0.clicfg_finder_reddot_freq_ctrl_use_mode_predict, java.lang.Boolean.FALSE, false, com.tencent.mm.plugin.finder.storage.ug0.f128138d, 8, null)).booleanValue()) {
            return false;
        }
        ((il0.h) ((ys.f) ((jz5.n) this.f105672x).getValue())).getClass();
        il0.e eVar = il0.e.f292009f;
        synchronized (eVar) {
            z17 = eVar.f292013d;
        }
        if (!z17) {
            return false;
        }
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_REDDOT_KARA_START_TIME_INT_SYNC, 0);
        if (r17 > 0) {
            int e17 = c01.id.e() - r17;
            int y17 = aj0Var.y();
            boolean z19 = this.f105651c;
            z18 = !z19 ? y17 <= 0 || e17 < ((java.lang.Number) ((jz5.n) this.E).getValue()).intValue() * y17 : e17 < ((java.lang.Number) ((jz5.n) this.F).getValue()).intValue();
            if (z19) {
                com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", "karaInfoReady timePass=" + e17 + "(startTime=" + r17 + "),threshold=" + y17 + ",karaThreshold=" + (y17 * ((java.lang.Number) ((jz5.n) this.E).getValue()).intValue()) + ",timeTenMinSec=" + ((java.lang.Number) ((jz5.n) this.F).getValue()).intValue());
            }
        } else {
            z18 = false;
        }
        return z18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:272:0x0772, code lost:
    
        if ((r7 != null ? r7.getInteger(r12) : r12) >= r8) goto L328;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0787 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x06e4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.LinkedList, com.tencent.mm.plugin.finder.extension.reddot.jb, com.tencent.mm.plugin.finder.extension.reddot.m5] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(com.tencent.mm.plugin.finder.extension.reddot.b3 r35, com.tencent.mm.ui.base.preference.h0 r36) {
        /*
            Method dump skipped, instructions count: 2135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.l5.i(com.tencent.mm.plugin.finder.extension.reddot.b3, com.tencent.mm.ui.base.preference.h0):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0cd2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0c28 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v108, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v90, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(com.tencent.mm.plugin.finder.extension.reddot.b3 r39) {
        /*
            Method dump skipped, instructions count: 3744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.l5.j(com.tencent.mm.plugin.finder.extension.reddot.b3):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.getBoolean(0) == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Integer k(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "dicPath"
            kotlin.jvm.internal.o.g(r5, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r4.y()
            java.lang.Object r0 = r0.get(r5)
            r45.oc4 r0 = (r45.oc4) r0
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r2 = r0.getBoolean(r1)
            r3 = 1
            if (r2 != r3) goto L1a
            goto L1b
        L1a:
            r3 = r1
        L1b:
            if (r3 == 0) goto L28
            r5 = 8
            int r5 = r0.getInteger(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L42
        L28:
            java.util.concurrent.ConcurrentHashMap r0 = r4.x()
            java.lang.Object r5 = r0.get(r5)
            com.tencent.mm.plugin.finder.extension.reddot.pb r5 = (com.tencent.mm.plugin.finder.extension.reddot.pb) r5
            if (r5 == 0) goto L41
            r45.vb4 r5 = r5.field_exposeCnt
            if (r5 == 0) goto L41
            int r5 = r5.getInteger(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L42
        L41:
            r5 = 0
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.l5.k(java.lang.String):java.lang.Integer");
    }

    public final java.util.List l(java.util.List list) {
        com.tencent.mm.plugin.finder.extension.reddot.i4 i4Var;
        int size = list.size();
        boolean z17 = this.f105651c;
        if (size <= 1) {
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exposeCntSort size ");
                sb6.append(list.size());
                sb6.append(" result=");
                java.util.Map.Entry entry = (java.util.Map.Entry) kz5.n0.Z(list);
                sb6.append((entry == null || (i4Var = (com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue()) == null) ? null : i4Var.a());
                com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", sb6.toString());
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.finder.extension.reddot.i4 i4Var2 = (com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) it.next()).getValue();
                com.tencent.mm.plugin.finder.extension.reddot.u5 u5Var = com.tencent.mm.plugin.finder.extension.reddot.u5.f105890h;
                i4Var2.getClass();
                i4Var2.f105591e = u5Var;
            }
            return list;
        }
        java.util.List F0 = kz5.n0.F0(list, mz5.a.a((yz5.l) ((jz5.n) this.C).getValue(), (yz5.l) ((jz5.n) this.D).getValue()));
        java.util.Iterator it6 = F0.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.finder.extension.reddot.i4 i4Var3 = (com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) it6.next()).getValue();
            com.tencent.mm.plugin.finder.extension.reddot.u5 u5Var2 = com.tencent.mm.plugin.finder.extension.reddot.u5.f105890h;
            i4Var3.getClass();
            i4Var3.f105591e = u5Var2;
        }
        if (z17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("exposeCntSort result=");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(F0, 10));
            java.util.Iterator it7 = F0.iterator();
            while (it7.hasNext()) {
                arrayList.add(((com.tencent.mm.plugin.finder.extension.reddot.i4) ((java.util.Map.Entry) it7.next()).getValue()).a());
            }
            sb7.append(arrayList);
            com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", sb7.toString());
        }
        return F0;
    }

    public boolean m() {
        return this.f105665q && ((java.lang.Boolean) ((jz5.n) this.f105666r).getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b6 A[LOOP:2: B:51:0x01b0->B:53:0x01b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jz5.l n(java.lang.StringBuilder r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.l5.n(java.lang.StringBuilder, boolean):jz5.l");
    }

    public final java.util.concurrent.ConcurrentHashMap o() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f105653e).getValue();
    }

    public final java.lang.String p() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("businessTypePenalizedMap=");
        java.util.concurrent.ConcurrentHashMap o17 = o();
        java.util.ArrayList arrayList = new java.util.ArrayList(o17.size());
        for (java.util.Map.Entry entry : o17.entrySet()) {
            arrayList.add(((java.lang.String) entry.getKey()) + ':' + entry.getValue());
        }
        sb6.append(arrayList);
        return sb6.toString();
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.o5 q() {
        return (com.tencent.mm.plugin.finder.extension.reddot.o5) ((jz5.n) this.f105668t).getValue();
    }

    public java.lang.String r(java.util.Map descMap) {
        java.util.ArrayList arrayList;
        r45.sw3 sw3Var;
        int i17;
        int i18;
        int i19;
        java.lang.Object obj;
        java.util.LinkedList<r45.tw3> list;
        java.util.LinkedList list2;
        java.lang.Object obj2;
        java.util.LinkedList list3;
        java.util.LinkedList list4;
        kotlin.jvm.internal.o.g(descMap, "descMap");
        if (!this.f105651c) {
            return "";
        }
        com.tencent.mm.plugin.finder.extension.reddot.u6 B = B();
        r45.at2 freqConfig = v();
        B.getClass();
        kotlin.jvm.internal.o.g(freqConfig, "freqConfig");
        r45.en enVar = B.f105907l;
        int i27 = 0;
        java.util.LinkedList list5 = enVar != null ? enVar.getList(0) : null;
        boolean z17 = list5 == null || list5.isEmpty();
        java.lang.Iterable iterable = kz5.p0.f313996d;
        if (!z17) {
            r45.en enVar2 = B.f105907l;
            java.util.LinkedList list6 = enVar2 != null ? enVar2.getList(0) : null;
            if (list6 != null) {
                iterable = list6;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("强制x策略:");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(iterable, 10));
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add((java.lang.String) descMap.get((java.lang.Integer) it.next()));
            }
            sb6.append(arrayList2);
            sb6.append('\n');
            return sb6.toString();
        }
        if (!B.f105908m) {
            return "下发策略不可用\n";
        }
        r45.ng7 ng7Var = B.f105906k;
        if (ng7Var != null && (list4 = ng7Var.getList(1)) != null) {
            iterable = new java.util.LinkedList(list4);
        }
        java.util.List F0 = kz5.n0.F0(iterable, new com.tencent.mm.plugin.finder.extension.reddot.p6(B));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("大盘顺序:");
        r45.ng7 ng7Var2 = B.f105906k;
        if (ng7Var2 == null || (list3 = ng7Var2.getList(1)) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(kz5.d0.q(list3, 10));
            java.util.Iterator it6 = list3.iterator();
            while (it6.hasNext()) {
                arrayList.add((java.lang.String) descMap.get((java.lang.Integer) it6.next()));
            }
        }
        sb7.append(arrayList);
        sb7.append("\npctr重排:");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(F0, 10));
        java.util.Iterator it7 = F0.iterator();
        while (it7.hasNext()) {
            arrayList3.add((java.lang.String) descMap.get((java.lang.Integer) it7.next()));
        }
        sb7.append(arrayList3);
        sb7.append("\npctr:\n");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(sb7.toString());
        android.util.SparseArray g17 = B.g();
        int size = g17.size();
        int i28 = 0;
        while (i28 < size) {
            int keyAt = g17.keyAt(i28);
            float floatValue = ((java.lang.Number) g17.valueAt(i28)).floatValue();
            jz5.l lVar = (jz5.l) ((android.util.SparseArray) ((jz5.n) B.f105902g).getValue()).get(keyAt);
            boolean z18 = com.tencent.mm.plugin.finder.extension.reddot.qa.f105791a;
            r45.ng7 ng7Var3 = (r45.ng7) freqConfig.getCustom(3);
            if (ng7Var3 == null || (list2 = ng7Var3.getList(2)) == null) {
                sw3Var = null;
            } else {
                java.util.Iterator it8 = list2.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it8.next();
                    if ((((r45.sw3) obj2).getInteger(i27) == keyAt ? 1 : i27) != 0) {
                        break;
                    }
                }
                sw3Var = (r45.sw3) obj2;
            }
            if (sw3Var == null || (list = sw3Var.getList(1)) == null) {
                i17 = 0;
                i18 = 0;
            } else {
                i17 = i27;
                i18 = i17;
                for (r45.tw3 tw3Var : list) {
                    i17 += tw3Var.getInteger(1);
                    i18 += tw3Var.getInteger(2);
                }
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append((java.lang.String) descMap.get(java.lang.Integer.valueOf(keyAt)));
            sb9.append(':');
            sb9.append(floatValue);
            sb9.append('(');
            sb9.append(((java.lang.Number) lVar.f302834e).intValue());
            sb9.append('/');
            sb9.append(((java.lang.Number) lVar.f302833d).intValue());
            sb9.append(");后台下发：");
            if (valueOf.intValue() > 0) {
                obj = java.lang.Float.valueOf(valueOf2.intValue() / valueOf.floatValue());
                i19 = 0;
            } else {
                i19 = 0;
                obj = 0;
            }
            sb9.append(obj);
            sb9.append('(');
            sb9.append(valueOf2.intValue());
            sb9.append('/');
            sb9.append(valueOf.intValue());
            sb9.append(")\n");
            sb8.append(sb9.toString());
            i28++;
            i27 = i19;
        }
        java.lang.String sb10 = sb8.toString();
        kotlin.jvm.internal.o.f(sb10, "toString(...)");
        return sb10;
    }

    public java.lang.String s(java.util.Map descMap) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(descMap, "descMap");
        if (!this.f105651c) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("是否采集AI特征:");
        com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
        sb6.append(aj0Var.A() ? "是\n" : "否\n");
        sb6.append("是否上报AI特征:");
        sb6.append(aj0Var.x() ? "是" : "否");
        sb6.append(";上报概率1/" + aj0Var.z() + '\n');
        sb6.append("是否启动AI预测:");
        sb6.append(h() ? "是\n" : "否\n");
        if (this.f105673y != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("AI最优组合");
            java.util.List list = this.f105673y;
            java.util.ArrayList arrayList2 = null;
            if (list != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    int intValue = ((java.lang.Number) it.next()).intValue();
                    kc2.g.f306363e.getClass();
                    arrayList.add((java.lang.String) ((java.util.Map) ((jz5.n) kc2.g.f306364f).getValue()).get(java.lang.Integer.valueOf(intValue)));
                }
            } else {
                arrayList = null;
            }
            sb7.append(arrayList);
            sb7.append("，分数:");
            sb7.append(this.A);
            sb7.append("(红点:");
            java.util.List list2 = this.f105674z;
            if (list2 != null) {
                arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                java.util.Iterator it6 = list2.iterator();
                while (it6.hasNext()) {
                    arrayList2.add((java.lang.String) descMap.get((java.lang.String) it6.next()));
                }
            }
            sb7.append(arrayList2);
            sb7.append(")\n");
            sb6.append(sb7.toString());
        } else if (this.f105674z != null) {
            sb6.append("没有合适的预测结果\n");
        } else {
            sb6.append("未运行AI预测\n");
        }
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        return sb8;
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.s5 t() {
        return (com.tencent.mm.plugin.finder.extension.reddot.s5) ((jz5.n) this.f105667s).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r45.bt2 u(int r21) {
        /*
            Method dump skipped, instructions count: 2166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.l5.u(int):r45.bt2");
    }

    public final r45.at2 v() {
        return (r45.at2) this.f105663o.getValue();
    }

    public final int w() {
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        e42.c0 c0Var = e42.c0.clicfg_finder_reddot_freq_n_m_limit;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return ((h62.d) e0Var).Ni(c0Var, -1);
    }

    public final java.util.concurrent.ConcurrentHashMap x() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f105652d).getValue();
    }

    public final java.util.concurrent.ConcurrentHashMap y() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f105654f).getValue();
    }

    public int z() {
        r45.ng7 ng7Var = (r45.ng7) v().getCustom(3);
        int integer = ng7Var != null ? ng7Var.getInteger(3) : 0;
        com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", "getRedDotHistoryRecordUpdateTime " + integer);
        return integer;
    }
}
