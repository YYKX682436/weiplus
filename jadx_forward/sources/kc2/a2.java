package kc2;

/* loaded from: classes12.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f387847a;

    /* renamed from: b, reason: collision with root package name */
    public final kc2.x1 f387848b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f387849c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f387850d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f387851e;

    /* renamed from: f, reason: collision with root package name */
    public final int f387852f;

    /* renamed from: g, reason: collision with root package name */
    public int f387853g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f387854h;

    /* renamed from: i, reason: collision with root package name */
    public final long f387855i;

    public a2(java.util.List timeList, kc2.x1 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeList, "timeList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f387847a = timeList;
        this.f387848b = action;
        this.f387849c = "FinderKaraInfoManager.WCDBTimeList";
        this.f387850d = jz5.h.b(kc2.y1.f388077d);
        this.f387851e = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0 aj0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a;
        this.f387852f = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "发现页红点AI模型时间序列特征更新时间精度（秒）", e42.c0.clicfg_finder_reddot_freq_ctrl_mode_timelist_accuracy, 3, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.sg0.f209082d, 8, null)).intValue();
        this.f387855i = 604800L;
    }

    public static void a(kc2.a2 a2Var, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            z17 = true;
        }
        a2Var.f();
        a2Var.f387847a.add(java.lang.Integer.valueOf(i17));
        if (c(a2Var, a2Var.f387847a, 0, false, 6, null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a2Var.f387849c, "add time=" + i17 + " and remove outOfDateItem!");
        }
        if (z17) {
            c66.q qVar = c66.q.f121026a;
            int i19 = a2Var.f387848b.f388072d;
            if (i19 > 0) {
                try {
                    com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae c26924x4cd4bae = (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) c66.q.f121037l).mo141623x754a37bb();
                    ni0.l lVar = new ni0.l();
                    lVar.f418778b = i19;
                    lVar.f418779c = i17;
                    c26924x4cd4bae.m107150x251da358(lVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.WCFinderWCDB", "addTimeItem actionType=" + i19 + " time=" + i17 + " success");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.WCFinderWCDB", "addTimeItem actionType=" + i19 + " time=" + i17 + " fail, " + e17.getMessage());
                }
            }
        }
        a2Var.f387854h = a2Var.b(c01.id.e());
    }

    public static boolean c(kc2.a2 a2Var, java.util.List list, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = c01.id.e();
        }
        int i19 = i17;
        if ((i18 & 4) != 0) {
            z17 = true;
        }
        boolean z18 = z17;
        a2Var.getClass();
        jz5.g gVar = kc2.m.f387987a;
        kc2.i iVar = (kc2.i) kz5.n0.k0((java.util.List) ((jz5.n) kc2.m.f387987a).mo141623x754a37bb());
        return pm0.v.I(list, new kc2.z1(i19, iVar != null ? iVar.f387947d : a2Var.f387855i, z18, a2Var));
    }

    public final java.util.List b(int i17) {
        java.util.List list;
        long j17;
        int i18;
        f();
        jz5.g gVar = kc2.m.f387987a;
        java.util.List<kc2.i> list2 = (java.util.List) ((jz5.n) kc2.m.f387987a).mo141623x754a37bb();
        int size = list2.size();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i19 = 0; i19 < size; i19++) {
            linkedList.add(0);
        }
        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        java.lang.StringBuilder sb6 = ((java.lang.Boolean) ((jz5.n) this.f387850d).mo141623x754a37bb()).booleanValue() ? new java.lang.StringBuilder("TimeListCountAll curTime=" + i17 + ',') : null;
        java.util.List list3 = this.f387847a;
        synchronized (list3) {
            try {
                int size2 = this.f387847a.size() - 1;
                if (size2 >= 0) {
                    int i27 = 0;
                    while (true) {
                        int i28 = size2 - 1;
                        int intValue = ((java.lang.Number) this.f387847a.get(size2)).intValue();
                        int i29 = i27;
                        while (true) {
                            if (i27 >= size) {
                                j17 = elapsedRealtimeNanos;
                                list = list3;
                                break;
                            }
                            list = list3;
                            try {
                                j17 = elapsedRealtimeNanos;
                                if (i17 - intValue <= ((kc2.i) list2.get(i27)).f387947d) {
                                    linkedList.set(i29, java.lang.Integer.valueOf(this.f387847a.size() - size2));
                                    break;
                                }
                                i29++;
                                i27++;
                                list3 = list;
                                elapsedRealtimeNanos = j17;
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                throw th;
                            }
                        }
                        if (i29 < size && i28 >= 0) {
                            size2 = i28;
                            i27 = i29;
                            list3 = list;
                            elapsedRealtimeNanos = j17;
                        }
                    }
                } else {
                    j17 = elapsedRealtimeNanos;
                    list = list3;
                }
                for (int i37 = 0; i37 < size; i37++) {
                    java.lang.Integer num = (java.lang.Integer) linkedList.get(i37);
                    if (num != null && num.intValue() == 0) {
                        java.lang.Integer num2 = (java.lang.Integer) kz5.n0.a0(linkedList, i37 - 1);
                        linkedList.set(i37, java.lang.Integer.valueOf(num2 != null ? num2.intValue() : 0));
                    }
                }
                if (sb6 != null) {
                    sb6.append("fastCntCost=" + (android.os.SystemClock.elapsedRealtimeNanos() - j17) + ",result=" + linkedList + '\n');
                }
                if (((java.lang.Boolean) ((jz5.n) this.f387850d).mo141623x754a37bb()).booleanValue()) {
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    long elapsedRealtimeNanos2 = android.os.SystemClock.elapsedRealtimeNanos();
                    for (kc2.i iVar : list2) {
                        synchronized (this.f387847a) {
                            java.util.List list4 = this.f387847a;
                            if ((list4 instanceof java.util.Collection) && list4.isEmpty()) {
                                i18 = 0;
                            } else {
                                java.util.Iterator it = list4.iterator();
                                i18 = 0;
                                while (it.hasNext()) {
                                    if ((((long) (i17 - ((java.lang.Number) it.next()).intValue())) <= iVar.f387947d) && (i18 = i18 + 1) < 0) {
                                        kz5.c0.o();
                                        throw null;
                                    }
                                }
                            }
                        }
                        linkedList2.add(java.lang.Integer.valueOf(i18));
                    }
                    boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(linkedList, linkedList2);
                    if (sb6 != null) {
                        sb6.append("normalCntCost=" + (android.os.SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos2) + ",result=" + linkedList2);
                    }
                    if (!b17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f387849c, "TimeListCountAll action" + this.f387848b + "_countAllErr");
                        pm0.z.b(xy2.b.f539688b, "action" + this.f387848b + "_countAllErr", false, null, null, false, false, null, 124, null);
                    }
                }
                if (sb6 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f387849c, sb6.toString());
                }
                this.f387853g = i17;
                return linkedList;
            } catch (java.lang.Throwable th7) {
                th = th7;
                list = list3;
            }
        }
    }

    public final java.lang.String d() {
        int e17 = c01.id.e();
        int i17 = this.f387853g;
        if (i17 <= 0 || e17 - i17 >= this.f387852f || this.f387854h == null) {
            this.f387854h = b(e17);
        }
        return kc2.l1.f(this.f387854h, (char) 0, 1, null);
    }

    public final java.util.List e(com.p314xaae8f345.mm.p689xc5a27af6.api.p690x104877e9.C10456x4ff7dd25 features) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(features, "features");
        int e17 = c01.id.e();
        int i17 = this.f387853g;
        if (i17 <= 0 || e17 - i17 >= this.f387852f || this.f387854h == null) {
            this.f387854h = b(e17);
        }
        java.util.List list = this.f387854h;
        if (list == null || list.isEmpty()) {
            return this.f387854h;
        }
        java.util.List list2 = this.f387854h;
        if (list2 != null) {
            kc2.t.f388022a.a(features, this.f387848b, list2);
        }
        return this.f387854h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        if (this.f387851e.compareAndSet(false, true)) {
            c66.q qVar = c66.q.f121026a;
            kc2.x1 x1Var = this.f387848b;
            int i17 = x1Var.f388072d;
            kz5.p0 p0Var = kz5.p0.f395529d;
            if (i17 > 0) {
                try {
                    java.util.Collection m107095xde3eb429 = ((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) c66.q.f121037l).mo141623x754a37bb()).m107095xde3eb429(ni0.f.f418754d.eq(i17), ni0.f.f418755e.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107095xde3eb429, "getAllObjects(...)");
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107095xde3eb429, 10));
                    java.util.Iterator it = m107095xde3eb429.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.Integer.valueOf(((ni0.l) it.next()).f418779c));
                    }
                    p0Var = arrayList;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.WCFinderWCDB", "getTimeList actionType=" + i17 + " fail, " + e17.getMessage());
                }
            }
            java.util.List V0 = kz5.n0.V0(p0Var);
            java.lang.String str = x1Var + " getTimeList " + V0 + ",countAccuracy=" + this.f387852f;
            java.lang.String str2 = this.f387849c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
            if (c(this, V0, 0, false, 6, null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "init and remove outOfDateItem!");
            }
            java.util.List list = this.f387847a;
            list.clear();
            list.addAll(V0);
        }
    }
}
