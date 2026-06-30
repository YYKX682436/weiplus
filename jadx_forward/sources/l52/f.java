package l52;

/* loaded from: classes15.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public final int f398115b;

    /* renamed from: c, reason: collision with root package name */
    public final int f398116c;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f398118e;

    /* renamed from: g, reason: collision with root package name */
    public r45.va6 f398120g;

    /* renamed from: k, reason: collision with root package name */
    public l52.m f398124k;

    /* renamed from: l, reason: collision with root package name */
    public l52.l f398125l;

    /* renamed from: m, reason: collision with root package name */
    public final m52.a f398126m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f398127n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f398128o;

    /* renamed from: p, reason: collision with root package name */
    public int f398129p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f398130q;

    /* renamed from: a, reason: collision with root package name */
    public int f398114a = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f398117d = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f398119f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public long f398121h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Set f398122i = new java.util.HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f398123j = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: r, reason: collision with root package name */
    public boolean f398131r = false;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f398132s = "";

    /* renamed from: t, reason: collision with root package name */
    public boolean f398133t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f398134u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f398135v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f398136w = false;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.ref.WeakReference f398137x = null;

    /* renamed from: y, reason: collision with root package name */
    public int f398138y = -1;

    /* renamed from: z, reason: collision with root package name */
    public int f398139z = 0;
    public int A = 0;
    public java.lang.ref.WeakReference B = null;
    public boolean C = true;
    public int D = -1;
    public long E = 0;
    public long F = -1;
    public java.lang.String G = "";
    public int H = -1;
    public int I = -1;

    /* renamed from: J, reason: collision with root package name */
    public int f398113J = 0;
    public int K = 0;
    public android.view.WindowManager L = null;

    public f(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f398130q = "";
        this.f398126m = i17 == 0 ? new m52.b() : null;
        this.f398115b = android.view.ViewConfiguration.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getScaledTouchSlop();
        this.f398118e = new java.util.concurrent.ConcurrentHashMap();
        this.f398116c = i17;
        this.f398127n = str;
        this.f398128o = str2;
        this.f398129p = -1;
        this.f398130q = str3;
    }

    public static void f(l52.f fVar) {
        l52.g gVar;
        r45.va6 va6Var;
        if (fVar.f398120g == null) {
            return;
        }
        java.util.Map map = fVar.f398118e;
        boolean z17 = map != null && ((java.util.concurrent.ConcurrentHashMap) map).isEmpty();
        fVar.e();
        if (z17) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            fVar.j();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FeedMonitor", "getSnsFeedParams: cost=%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) fVar.f398118e;
        if (!concurrentHashMap.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FeedMonitor", "_moveMonitoringFeed2ReadyReport");
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                if (entry != null && (gVar = (l52.g) entry.getValue()) != null && (va6Var = fVar.f398120g) != null) {
                    va6Var.f469580h.add(gVar.f398140a);
                }
            }
            concurrentHashMap.clear();
        }
        r45.va6 va6Var2 = fVar.f398120g;
        fVar.f398120g = null;
        ((ku5.t0) ku5.t0.f394148d).h(new l52.c(fVar, va6Var2), "_reportTimeline");
    }

    public final void a(android.view.ViewGroup viewGroup, int i17, int i18) {
        if (this.f398124k == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        l52.m mVar = this.f398124k;
        if (mVar.f398169c <= 0) {
            mVar.f398169c = currentTimeMillis;
        }
        if ((this.E <= ((long) (this.K / 2))) || this.f398114a == 0) {
            b(viewGroup, i17, i18, currentTimeMillis);
            return;
        }
        if (this.f398116c == 0 && this.f398129p != -1) {
            b(viewGroup, i17, i18, currentTimeMillis);
            return;
        }
        long j17 = mVar.f398167a;
        if (j17 > 0) {
            r45.va6 va6Var = this.f398120g;
            if (va6Var != null) {
                va6Var.f469578f += currentTimeMillis - j17;
            }
            mVar.f398167a = 0L;
            g(viewGroup, i17, i18, currentTimeMillis, false);
        }
        l52.m mVar2 = this.f398124k;
        if (mVar2.f398168b <= 0) {
            mVar2.f398168b = currentTimeMillis;
        }
    }

    public final void b(android.view.ViewGroup viewGroup, int i17, int i18, long j17) {
        l52.m mVar = this.f398124k;
        if (mVar.f398167a <= 0) {
            mVar.f398167a = j17;
            l52.l lVar = this.f398125l;
            if (lVar != null) {
                lVar.f398166a = j17;
                if (this.f398116c != 0 || this.f398135v || !this.f398136w) {
                    g(viewGroup, i17, i18, j17, true);
                }
            }
        } else {
            g(viewGroup, i17, i18, j17, true);
        }
        l52.m mVar2 = this.f398124k;
        long j18 = mVar2.f398168b;
        if (j18 > 0) {
            r45.va6 va6Var = this.f398120g;
            if (va6Var != null) {
                va6Var.f469579g += j17 - j18;
            }
            mVar2.f398168b = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nm5.b c(android.view.View r18, int r19) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l52.f.c(android.view.View, int):nm5.b");
    }

    public final void d(android.view.ViewGroup viewGroup, int i17, int i18) {
        android.view.View view;
        java.lang.String a17;
        r45.p86 p86Var;
        boolean z17 = true;
        if (this.f398114a == 0) {
            this.E = 0L;
        } else {
            if (viewGroup instanceof android.widget.AbsListView) {
                view = viewGroup.getChildAt(i18 - 1);
                if (view == null) {
                    view = viewGroup.getChildAt(((android.widget.AbsListView) viewGroup).getLastVisiblePosition());
                }
            } else if (viewGroup instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) viewGroup).getLayoutManager();
                if (c1162x665295de != null) {
                    android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(c1162x665295de.y());
                    if (mo7935xa188593e == null) {
                        view = viewGroup.getChildAt(c1162x665295de.y());
                        if (view == null) {
                            view = viewGroup.getChildAt(i18 - 1);
                        }
                    } else {
                        view = mo7935xa188593e;
                    }
                } else {
                    view = viewGroup.getChildAt(i18 - 1);
                }
            } else {
                view = null;
            }
            if (view != null) {
                if (this.C) {
                    a17 = (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) this.f398123j).get(java.lang.Integer.valueOf(view.hashCode()));
                    if (a17 == null && (p86Var = i(view).f398140a) != null) {
                        a17 = p86Var.f464371d;
                    }
                } else {
                    a17 = ((m52.b) this.f398126m).a(view, i18 - 1);
                }
                if (a17 != null) {
                    if (a17.equals(this.G)) {
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        int i19 = iArr[1];
                        int abs = java.lang.Math.abs(i19 - this.D);
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        long j17 = currentTimeMillis - this.F;
                        if (j17 <= 0 || abs <= this.f398115b) {
                            z17 = false;
                        } else {
                            this.E = (abs * 1000) / j17;
                            this.D = i19;
                            this.F = currentTimeMillis;
                        }
                    } else {
                        int[] iArr2 = new int[2];
                        view.getLocationOnScreen(iArr2);
                        this.D = iArr2[1];
                        this.F = java.lang.System.currentTimeMillis();
                        this.G = a17;
                    }
                }
            }
        }
        if (z17) {
            a(viewGroup, i17, i18);
        }
    }

    public final void e() {
        android.view.ViewGroup viewGroup;
        if (this.f398124k == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        l52.m mVar = this.f398124k;
        long j17 = mVar.f398167a;
        if (j17 > 0) {
            r45.va6 va6Var = this.f398120g;
            if (va6Var != null) {
                va6Var.f469578f += currentTimeMillis - j17;
            }
            mVar.f398167a = 0L;
            java.lang.ref.WeakReference weakReference = this.f398137x;
            if (weakReference != null && (viewGroup = (android.view.ViewGroup) weakReference.get()) != null) {
                g(viewGroup, this.f398138y, this.f398139z, currentTimeMillis, false);
            }
        }
        long j18 = this.f398124k.f398168b;
        if (j18 > 0) {
            r45.va6 va6Var2 = this.f398120g;
            if (va6Var2 != null) {
                va6Var2.f469579g += currentTimeMillis - j18;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.FeedMonitor", "_stopComputeTimelineSliceTime mSnsTimeline is NULL 2");
            }
            this.f398124k.f398168b = 0L;
        }
        l52.m mVar2 = this.f398124k;
        long j19 = mVar2.f398169c;
        if (j19 > 0) {
            r45.va6 va6Var3 = this.f398120g;
            if (va6Var3 != null && this.f398116c != 0) {
                va6Var3.f469577e += currentTimeMillis - j19;
            }
            mVar2.f398169c = 0L;
        }
    }

    public final void g(android.view.ViewGroup viewGroup, int i17, int i18, long j17, boolean z17) {
        l52.l lVar;
        nm5.b h17;
        long j18;
        boolean z18;
        java.lang.String str;
        l52.g gVar;
        nm5.b c17;
        if (viewGroup == null || (lVar = this.f398125l) == null) {
            return;
        }
        this.f398134u = false;
        long j19 = lVar.f398166a;
        if (j19 > 0) {
            long j27 = j17 - j19;
            if (j27 <= 0) {
                if (!this.f398133t && !this.f398135v) {
                    return;
                }
                this.f398133t = false;
                this.f398135v = false;
            }
            if (this.f398116c != 0) {
                h17 = h(viewGroup, i17, i18, false);
            } else if (this.C) {
                h17 = h(viewGroup, i17, i18, true);
            } else {
                java.util.HashMap hashMap = new java.util.HashMap();
                int i19 = 0;
                for (int i27 = i18 - 1; i27 >= 0; i27--) {
                    android.view.View childAt = viewGroup.getChildAt(i27);
                    if (childAt != null && (c17 = c(childAt, i27)) != null) {
                        boolean booleanValue = ((java.lang.Boolean) c17.a(1)).booleanValue();
                        hashMap.put((l52.g) c17.a(0), java.lang.Boolean.valueOf(booleanValue));
                        if (booleanValue) {
                            i19++;
                        }
                    }
                }
                h17 = nm5.j.c(hashMap, java.lang.Integer.valueOf(i19));
            }
            java.util.Map map = (java.util.Map) h17.a(0);
            int intValue = ((java.lang.Integer) h17.a(1)).intValue();
            if (intValue <= 0) {
                return;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f398119f;
            concurrentHashMap.clear();
            double d17 = j27;
            double d18 = d17 / intValue;
            java.util.HashSet hashSet = new java.util.HashSet(map.size());
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                l52.g gVar2 = (l52.g) entry.getKey();
                java.lang.Boolean bool = (java.lang.Boolean) entry.getValue();
                r45.p86 p86Var = gVar2.f398140a;
                java.util.Iterator it6 = it;
                int i28 = p86Var.f464376i + p86Var.f464377m + ((int) (((p86Var.f464374g - p86Var.f464375h) - r12) * 0.4f));
                int i29 = p86Var.f464372e;
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(i29 < i28 && p86Var.f464373f + i29 > i28);
                r45.p86 p86Var2 = gVar2.f398140a;
                if (p86Var2 == null || (str = p86Var2.f464371d) == null) {
                    j18 = j27;
                    z18 = true;
                } else {
                    boolean booleanValue2 = bool.booleanValue();
                    java.util.Map map2 = this.f398118e;
                    if (booleanValue2) {
                        concurrentHashMap.put(str, java.lang.Boolean.valueOf(gVar2.f398140a.f464390z));
                        hashSet.add(str);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) map2;
                        if (concurrentHashMap2.containsKey(str)) {
                            l52.g gVar3 = (l52.g) concurrentHashMap2.get(str);
                            if (gVar3 != null) {
                                r45.p86 p86Var3 = gVar3.f398140a;
                                j18 = j27;
                                p86Var3.f464385u += d18;
                                p86Var3.f464386v += d17;
                                r45.p86 p86Var4 = gVar2.f398140a;
                                p86Var3.f464372e = p86Var4.f464372e;
                                p86Var3.f464373f = p86Var4.f464373f;
                                p86Var3.f464378n = p86Var4.f464378n;
                                p86Var3.f464379o = p86Var4.f464379o;
                                p86Var3.f464374g = p86Var4.f464374g;
                                p86Var3.f464375h = p86Var4.f464375h;
                                concurrentHashMap2.put(str, gVar3);
                                r45.p86 p86Var5 = gVar3.f398140a;
                                r45.p86 p86Var6 = gVar2.f398140a;
                                p86Var5.f464388x = p86Var6.f464388x;
                                p86Var5.f464387w = p86Var6.f464387w;
                                p86Var5.f464389y = p86Var6.f464389y;
                                p86Var5.A = p86Var6.A;
                                p86Var5.f464390z = p86Var6.f464390z;
                                if (!((java.util.HashSet) this.f398122i).contains(str)) {
                                    z18 = true;
                                    gVar3.f398140a.H++;
                                }
                                z18 = true;
                            }
                        } else {
                            j18 = j27;
                            z18 = true;
                            r45.p86 p86Var7 = gVar2.f398140a;
                            p86Var7.f464385u = d18;
                            p86Var7.f464386v = d17;
                            concurrentHashMap2.put(str, gVar2);
                        }
                        if (valueOf.booleanValue() && (gVar = (l52.g) ((java.util.concurrent.ConcurrentHashMap) map2).get(str)) != null) {
                            gVar.f398140a.f464384t += j18;
                        }
                    }
                    j18 = j27;
                    z18 = true;
                    if (valueOf.booleanValue()) {
                        gVar.f398140a.f464384t += j18;
                    }
                }
                it = it6;
                j27 = j18;
            }
            this.f398122i = hashSet;
            if (z17) {
                this.f398125l.f398166a = j17;
            } else {
                this.f398125l.f398166a = 0L;
            }
        }
    }

    public final nm5.b h(android.view.ViewGroup viewGroup, int i17, int i18, boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de;
        int i19;
        android.view.View view;
        nm5.b c17;
        java.lang.String str;
        java.util.HashMap hashMap = new java.util.HashMap();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = viewGroup instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) viewGroup : null;
        int i27 = 0;
        boolean z18 = false;
        for (int i28 = i18 - 1; i28 >= 0; i28--) {
            if (c1163xf1deaba4 == null) {
                view = viewGroup.getChildAt(i28);
                i19 = i28;
            } else {
                java.lang.ref.WeakReference weakReference = this.B;
                if (weakReference == null || (c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) weakReference.get()) == null) {
                    c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) viewGroup).getLayoutManager();
                    if (c1162x665295de == null) {
                        z18 = true;
                    } else {
                        this.B = new java.lang.ref.WeakReference(c1162x665295de);
                    }
                }
                int i29 = i17 + i28;
                android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(i29);
                if (mo7935xa188593e == null && (mo7935xa188593e = viewGroup.getChildAt(i28)) == null) {
                    mo7935xa188593e = viewGroup.getChildAt(i29);
                }
                i19 = i29;
                view = mo7935xa188593e;
                z18 = true;
            }
            if (view != null) {
                if (z17) {
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
                    l52.g i37 = i(view);
                    if (!valueOf.booleanValue()) {
                        int height = view.getHeight();
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        int min = java.lang.Math.min(iArr[1], (int) view.getY());
                        r45.p86 p86Var = i37.f398140a;
                        p86Var.f464372e = min;
                        p86Var.f464373f = height;
                    } else if (i37.f398140a != null) {
                        int[] iArr2 = new int[2];
                        view.getLocationOnScreen(iArr2);
                        i37.f398140a.f464372e = iArr2[1];
                    }
                    r45.p86 p86Var2 = i37.f398140a;
                    if (p86Var2 != null && (str = p86Var2.f464371d) != null && !str.isEmpty()) {
                        ((java.util.concurrent.ConcurrentHashMap) this.f398123j).put(java.lang.Integer.valueOf(view.hashCode()), i37.f398140a.f464371d);
                    }
                    c17 = nm5.j.c(i37, java.lang.Boolean.valueOf(i37.a(this.f398116c)));
                } else {
                    c17 = c(view, i19);
                }
                if (c17 != null) {
                    boolean booleanValue = ((java.lang.Boolean) c17.a(1)).booleanValue();
                    hashMap.put((l52.g) c17.a(0), java.lang.Boolean.valueOf(booleanValue));
                    if (booleanValue) {
                        i27++;
                    }
                }
            }
        }
        return nm5.j.c(hashMap, java.lang.Integer.valueOf(i27));
    }

    public final l52.g i(android.view.View view) {
        l52.g gVar = new l52.g();
        gVar.f398140a = new r45.p86();
        if (view == null) {
            return gVar;
        }
        java.util.Map bj6 = ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).bj(view);
        try {
            if (bj6 instanceof java.util.Map) {
                java.lang.String str = (java.lang.String) bj6.get("sns_feed_id");
                if (android.text.TextUtils.isEmpty(str)) {
                    return gVar;
                }
                r45.p86 p86Var = gVar.f398140a;
                p86Var.f464371d = str;
                p86Var.f464389y = bj6.containsKey("sns_feed_username") ? (java.lang.String) bj6.get("sns_feed_username") : "";
                gVar.f398149j = bj6.containsKey("sns_feed_share_name") ? (java.lang.String) bj6.get("sns_feed_share_name") : "";
                gVar.f398140a.A = bj6.containsKey("sns_nick_name") ? (java.lang.String) bj6.get("sns_nick_name") : "";
                gVar.f398140a.f464390z = (bj6.containsKey("sns_feed_is_ad") ? ((java.lang.Integer) bj6.get("sns_feed_is_ad")).intValue() : 0) == 1;
                gVar.f398140a.f464375h = bj6.containsKey("sns_feed_virtual_key_height") ? ((java.lang.Integer) bj6.get("sns_feed_virtual_key_height")).intValue() : 0;
                gVar.f398140a.f464376i = bj6.containsKey("sns_feed_status_bar_height") ? ((java.lang.Integer) bj6.get("sns_feed_status_bar_height")).intValue() : this.I;
                gVar.f398140a.f464377m = bj6.containsKey("sns_feed_action_bar_height") ? ((java.lang.Integer) bj6.get("sns_feed_action_bar_height")).intValue() : this.H;
                gVar.f398141b = bj6.containsKey("sns_feed_position") ? ((java.lang.Integer) bj6.get("sns_feed_position")).intValue() : 0;
                gVar.f398140a.f464388x = bj6.containsKey("sns_feed_like_count") ? ((java.lang.Integer) bj6.get("sns_feed_like_count")).intValue() : 0;
                gVar.f398140a.f464387w = bj6.containsKey("sns_feed_comment_count") ? ((java.lang.Integer) bj6.get("sns_feed_comment_count")).intValue() : 0;
                gVar.f398140a.f464374g = bj6.containsKey("sns_feed_screen_height") ? ((java.lang.Integer) bj6.get("sns_feed_screen_height")).intValue() : this.K;
                gVar.f398140a.f464373f = java.lang.Math.max(view.getMeasuredHeight(), view.getHeight());
                r45.p86 p86Var2 = gVar.f398140a;
                p86Var2.f464378n = this.f398114a;
                p86Var2.f464379o = this.A;
                p86Var2.B = gVar.f398141b + 1;
                p86Var2.C = bj6.containsKey("sns_feed_type") ? ((java.lang.Integer) bj6.get("sns_feed_type")).intValue() : 0;
                gVar.f398140a.D = bj6.containsKey("sns_is_live") ? ((java.lang.Integer) bj6.get("sns_is_live")).intValue() : 0;
                gVar.f398140a.f464370J = bj6.containsKey("sns_is_ws") ? ((java.lang.Integer) bj6.get("sns_is_ws")).intValue() : 0;
                gVar.f398140a.K = bj6.containsKey("sns_is_ws_block") ? ((java.lang.Integer) bj6.get("sns_is_ws_block")).intValue() : 0;
                gVar.f398140a.L = ((java.lang.Integer) bj6.get("sns_feed_tail_type")).intValue();
                gVar.f398140a.M = bj6.containsKey("sns_emo_cmt_cnt") ? ((java.lang.Integer) bj6.get("sns_emo_cmt_cnt")).intValue() : 0;
                gVar.f398140a.N = bj6.containsKey("sns_img_cmt_cnt") ? ((java.lang.Integer) bj6.get("sns_img_cmt_cnt")).intValue() : 0;
                gVar.f398140a.P = bj6.containsKey("sns_yb_retouch") ? (java.lang.String) bj6.get("sns_yb_retouch") : "";
            }
            return gVar;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.FeedMonitor", "new snsUI get amoeba sdk  params err");
            return gVar;
        }
    }

    public final void j() {
        if (this.f398116c != 0 || this.f398120g == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5622x867dc45d c5622x867dc45d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5622x867dc45d();
        java.util.Map map = this.f398118e;
        if (map != null) {
            boolean z17 = this.f398117d;
            am.rg rgVar = c5622x867dc45d.f135949g;
            rgVar.f89343a = z17;
            rgVar.f89345c = this.f398130q;
            rgVar.f89346d = new java.util.LinkedList(((java.util.concurrent.ConcurrentHashMap) map).keySet());
            rgVar.f89344b = this.f398120g.f469576d;
        }
        c5622x867dc45d.e();
    }

    public final void k(android.app.Activity activity) {
        android.view.Display defaultDisplay;
        try {
            if (this.L == null) {
                this.L = (android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window");
            }
            defaultDisplay = this.L.getDefaultDisplay();
        } catch (java.lang.Exception unused) {
            if (activity == null) {
                return;
            } else {
                defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            }
        }
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getSize(point);
        android.graphics.Point point2 = new android.graphics.Point();
        defaultDisplay.getRealSize(point2);
        this.f398113J = point.y;
        this.K = point2.y;
    }

    public final void l(android.app.Activity activity) {
        if (this.I <= 0 && activity != null) {
            android.content.res.Resources resources = activity.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f));
            this.I = dimensionPixelSize;
            if (dimensionPixelSize <= 0) {
                this.I = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561927wp);
            }
        }
    }

    public final void m(java.lang.String str, java.lang.String str2) {
        r45.va6 va6Var = new r45.va6();
        this.f398120g = va6Var;
        va6Var.f469577e = 0L;
        va6Var.f469582m = this.f398127n;
        va6Var.f469583n = this.f398128o;
        if (str == null) {
            str = "";
        }
        va6Var.f469576d = str;
        va6Var.f469581i = str2;
        p52.h.f433560l = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FeedMonitor", "initTimelineParams: %s, %s", str, str2);
        r45.va6 va6Var2 = this.f398120g;
        va6Var2.f469578f = 0L;
        va6Var2.f469579g = 0L;
        ((java.util.concurrent.ConcurrentHashMap) this.f398118e).clear();
        this.f398124k = new l52.m();
        this.f398125l = new l52.l();
        if (this.f398116c == 0) {
            java.lang.String str3 = this.f398130q;
            if ("com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3".equals(str3) || "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI".equals(str3)) {
                this.f398117d = true;
                this.f398120g.f469586q = e62.q.a().f331343h;
                this.f398120g.f469576d = "1230_" + java.lang.System.currentTimeMillis();
            } else {
                this.f398120g.f469576d = e62.q.a().f331343h;
                if ("com.tencent.mm.plugin.sns.ui.SnsTimeLineUI".equals(str3)) {
                    this.C = false;
                }
                this.f398120g.f469588s = this.f398132s;
                this.f398132s = "";
            }
            java.lang.String str4 = this.f398120g.f469576d;
            java.lang.String str5 = str4 != null ? str4 : "";
            if (str5.isEmpty()) {
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6095x9d8f63cc c6095x9d8f63cc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6095x9d8f63cc();
            am.vw vwVar = c6095x9d8f63cc.f136372g;
            vwVar.f89758b = str5;
            vwVar.f89757a = str3;
            c6095x9d8f63cc.e();
        }
    }

    public void n(int i17, android.app.Activity activity) {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        if (i17 != 0) {
            if (i17 == 1) {
                int a17 = g52.a.a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FeedMonitor", "stopMonitor, activityMethod: %s", java.lang.Integer.valueOf(a17));
                if (a17 == 0) {
                    e();
                    return;
                }
                if (a17 == 1) {
                    q();
                    return;
                } else {
                    if (a17 != 8) {
                        return;
                    }
                    e();
                    this.f398121h = java.lang.System.currentTimeMillis();
                    return;
                }
            }
            if (i17 == 2) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new l52.e(this));
                return;
            }
            if (i17 == 3) {
                q();
                return;
            }
            if (i17 != 4) {
                if (i17 != 5) {
                    return;
                }
                this.f398134u = false;
                q();
                return;
            }
            this.f398114a = 0;
            l(activity);
            k(activity);
            m(v52.c.g().d(), w52.j.b());
            this.f398133t = true;
            this.f398134u = true;
            java.lang.ref.WeakReference weakReference = this.f398137x;
            if (weakReference == null || (viewGroup3 = (android.view.ViewGroup) weakReference.get()) == null) {
                return;
            }
            d(viewGroup3, java.lang.Math.max(this.f398138y, 0), java.lang.Math.max(this.f398139z, 1));
            return;
        }
        this.f398114a = 0;
        l(activity);
        k(activity);
        int a18 = g52.a.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FeedMonitor", "startMonitor activityMethod: %d", java.lang.Integer.valueOf(a18));
        if (a18 == 0) {
            m(v52.c.g().d(), w52.j.b());
            this.f398133t = true;
            this.f398131r = true;
            return;
        }
        if (a18 == 1) {
            this.f398133t = true;
            if (!this.f398131r) {
                this.f398131r = true;
                m(v52.c.g().d(), w52.j.b());
            }
            java.lang.ref.WeakReference weakReference2 = this.f398137x;
            if (weakReference2 == null || (viewGroup = (android.view.ViewGroup) weakReference2.get()) == null) {
                return;
            }
            d(viewGroup, this.f398138y, this.f398139z);
            return;
        }
        if (a18 != 7) {
            return;
        }
        if (java.lang.System.currentTimeMillis() - this.f398121h > 30000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FeedMonitor", "_handleActivityMethod.BACK_2_FRONT: New Session");
            this.f398135v = true;
            java.lang.String d17 = v52.c.g().d();
            java.lang.String b17 = w52.j.b();
            j();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new l52.b(this, this.f398131r, d17, b17));
            return;
        }
        this.f398133t = true;
        java.lang.ref.WeakReference weakReference3 = this.f398137x;
        if (weakReference3 == null || (viewGroup2 = (android.view.ViewGroup) weakReference3.get()) == null) {
            return;
        }
        d(viewGroup2, this.f398138y, this.f398139z);
    }

    public void o(android.app.Activity activity, android.view.ViewGroup viewGroup, int i17, int i18, int i19) {
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264;
        if (viewGroup instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) {
            this.f398126m.getClass();
        }
        java.lang.ref.WeakReference weakReference = this.f398137x;
        if (weakReference == null || weakReference.get() == null) {
            this.f398137x = new java.lang.ref.WeakReference(viewGroup);
        }
        this.f398138y = i17;
        this.f398139z = i18;
        int i27 = this.f398114a;
        if (i27 == 1) {
            try {
                if (java.lang.Math.abs(i19) > this.f398115b) {
                    if (i19 > 0) {
                        this.A = -1;
                    } else if (i19 < 0) {
                        this.A = 1;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FeedMonitor", e17, "scrollingState, crash: %s", e17.getMessage());
            }
        } else if (i27 == 0 && this.H <= 0 && activity != null) {
            try {
                if ((activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) && (mo2533x106ab264 = ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).mo2533x106ab264()) != null) {
                    this.H = mo2533x106ab264.j().getHeight();
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FeedMonitor", e18, "initBarHeight", new java.lang.Object[0]);
            }
        }
        d(viewGroup, i17, i18);
        this.f398136w = true;
    }

    public void p(android.view.ViewGroup viewGroup, int i17) {
        this.f398114a = i17;
        java.lang.ref.WeakReference weakReference = this.f398137x;
        if (weakReference == null || weakReference.get() == null) {
            this.f398137x = new java.lang.ref.WeakReference(viewGroup);
        }
        if (viewGroup instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) {
            this.f398126m.getClass();
        }
        if (i17 == 0) {
            this.A = 0;
        }
        if (this.f398116c == 0 && i17 != 2) {
            this.f398129p = -1;
        }
        if (this.f398134u) {
            this.f398134u = false;
            g(viewGroup, java.lang.Math.max(this.f398138y, 0), java.lang.Math.max(this.f398139z, 1), java.lang.System.currentTimeMillis(), true);
        }
    }

    public final void q() {
        java.util.Map map = this.f398118e;
        if (map != null && !((java.util.concurrent.ConcurrentHashMap) map).isEmpty()) {
            j();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new l52.a(this));
    }
}
