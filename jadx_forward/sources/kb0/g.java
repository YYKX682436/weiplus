package kb0;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 f387730a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f387731b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f387732c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f387733d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f387734e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f387735f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f387736g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f387737h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f387738i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Set f387739j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f387740k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.ref.WeakReference f387741l;

    public g(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 params, java.util.Map map, java.util.List appList) {
        java.lang.Boolean bool;
        java.lang.Object obj;
        xj.m mVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appList, "appList");
        this.f387730a = params;
        this.f387731b = map;
        this.f387732c = appList;
        this.f387733d = "MicroMsg.OpenWayListReporter";
        this.f387734e = kb0.j.f387742a.b(params);
        int i17 = 2;
        this.f387735f = kz5.n0.t0(kz5.c0.i(2, 3, 4, 5), d() ? kz5.b0.c(6) : kz5.p0.f395529d);
        this.f387736g = jz5.h.b(new kb0.c(this));
        this.f387737h = jz5.h.b(kb0.e.f387728d);
        this.f387738i = new java.util.LinkedHashSet();
        this.f387739j = new java.util.LinkedHashSet();
        this.f387740k = new java.util.HashMap();
        java.util.Iterator it = appList.iterator();
        while (true) {
            bool = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) obj).f272552i) {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) obj;
        if (wVar != null && (mVar = wVar.f272555o) != null) {
            bool = java.lang.Boolean.valueOf(mVar.f536293h);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE)) {
                i17 = 1;
            } else {
                if (bool != null) {
                    throw new jz5.j();
                }
                i17 = 0;
            }
        }
        this.f387734e.put("yuanbao_user_state", java.lang.Integer.valueOf(i17));
    }

    public final jz5.l a(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a aVar) {
        java.lang.Object m143895xf1229813;
        r45.mk5 b17;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.i0 i0Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.i0.f272496a;
            xj.m mVar = wVar.f272555o;
            b17 = i0Var.b(mVar != null ? mVar.f536286a : null);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (b17 == null) {
            return null;
        }
        long c17 = c01.id.c();
        lb0.d dVar = lb0.d.f399202a;
        long f17 = dVar.f();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var = this.f387730a;
        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Long.valueOf(java.lang.Math.max(0L, ((f17 == 0 ? 0L : dVar.e(g2Var.f270848h, aVar) / f17) - ((c17 - b17.f462138d) / 86400000)) - 1)), java.lang.Long.valueOf(java.lang.Math.max(0L, ((f17 == 0 ? 0L : dVar.b(g2Var.f270848h, aVar) / f17) - ((c17 - b17.f462139e) / 86400000)) - 1))));
        if (p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813) != null) {
            m143895xf1229813 = new jz5.l(0L, 0L);
        }
        return (jz5.l) m143895xf1229813;
    }

    public final java.lang.String b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar) {
        xj.m mVar;
        java.lang.String str;
        java.lang.String b17 = wVar.b();
        if (!(!r26.n0.N(b17))) {
            b17 = null;
        }
        return b17 == null ? (!d() || !wVar.f272552i || (mVar = wVar.f272555o) == null || (str = mVar.f536291f) == null) ? "" : str : b17;
    }

    public final java.lang.String c(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a c17;
        jz5.l a17;
        if (!((java.util.ArrayList) this.f387735f).contains(java.lang.Integer.valueOf(wVar.h())) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wVar.b(), "common_local_app")) {
            return null;
        }
        if (!wVar.f272552i || !d() || (c17 = lb0.d.f399202a.c(wVar.f272554n)) == null || (a17 = a(wVar, c17)) == null) {
            return wVar.a() + ':' + g(wVar) + ':' + i17;
        }
        return wVar.a() + ':' + g(wVar) + ':' + i17 + ':' + ((java.lang.Number) a17.f384366d).longValue() + ':' + ((java.lang.Number) a17.f384367e).longValue();
    }

    public final boolean d() {
        return ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Bi(this.f387730a.f270848h);
    }

    public final void e(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar) {
        jz5.l a17;
        if (wVar != null) {
            boolean z17 = wVar.f272552i;
            java.util.HashMap hashMap = this.f387734e;
            if (z17 && !d()) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("yuanbo_ad_component", "view_clk", hashMap, 35480);
                return;
            }
            if (!((java.util.ArrayList) this.f387735f).contains(java.lang.Integer.valueOf(wVar.h()))) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wVar.b(), "common_local_app")) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_sheet_mobile_app_item", "view_clk", hashMap, 35480);
                    return;
                }
                return;
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.putAll(hashMap);
            hashMap2.put("app_name", wVar.a());
            int i17 = (java.lang.Integer) this.f387740k.get(wVar.b());
            if (i17 == null) {
                i17 = -1;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
            hashMap2.put("app_index", i17);
            hashMap2.put("app_type", java.lang.Integer.valueOf(g(wVar)));
            boolean z18 = wVar.f272552i;
            java.lang.String str = this.f387733d;
            if (z18 && d()) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a c17 = lb0.d.f399202a.c(wVar.f272554n);
                jz5.f0 f0Var = null;
                if (c17 != null && (a17 = a(wVar, c17)) != null) {
                    long longValue = ((java.lang.Number) a17.f384366d).longValue();
                    long longValue2 = ((java.lang.Number) a17.f384367e).longValue();
                    hashMap2.put("n_days", java.lang.Long.valueOf(longValue));
                    hashMap2.put("m_days", java.lang.Long.valueOf(longValue2));
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "adBusinessType is null");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "click app: " + hashMap2);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_sheet_other_app_item", "view_clk", hashMap2, 35480);
        }
    }

    public final void f(boolean z17) {
        java.util.HashMap i17 = kz5.c1.i(new jz5.l("has_install_yuanbao", java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) this.f387737h).mo141623x754a37bb()).intValue())), new jz5.l("popup_action_type", java.lang.Integer.valueOf(z17 ? 1 : 0)));
        i17.putAll(this.f387734e);
        java.util.Map map = this.f387731b;
        if (map != null) {
            i17.putAll(map);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("app_jump_yuanbao_popup", "view_clk", i17, 35480);
    }

    public final int g(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar) {
        int h17 = wVar.h();
        int i17 = 2;
        if (h17 == 2) {
            return 1;
        }
        if (h17 != 3) {
            i17 = 4;
            if (h17 == 4) {
                return 3;
            }
            if (h17 == 5) {
                return 1;
            }
            if (h17 != 6) {
                return 0;
            }
        }
        return i17;
    }
}
