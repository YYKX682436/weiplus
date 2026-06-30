package com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.p1713x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/view/StackLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "l13/b", "l13/c", "plugin-force-notify_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager */
/* loaded from: classes15.dex */
public final class C15566x578e2f9b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public final int f218887d;

    /* renamed from: e, reason: collision with root package name */
    public final int f218888e;

    /* renamed from: f, reason: collision with root package name */
    public final float f218889f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f218890g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f218891h;

    /* renamed from: i, reason: collision with root package name */
    public int f218892i;

    /* renamed from: m, reason: collision with root package name */
    public int f218893m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f218894n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f218895o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f218896p;

    /* renamed from: q, reason: collision with root package name */
    public int f218897q = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public int f218898r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f218899s;

    /* renamed from: t, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.u2 f218900t;

    /* renamed from: u, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f218901u;

    public C15566x578e2f9b(int i17, int i18, float f17, boolean z17, yz5.p pVar) {
        this.f218887d = i17;
        this.f218888e = i18;
        this.f218889f = f17;
        this.f218890g = z17;
        this.f218891h = pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f218899s = arrayList;
        l13.a aVar = new l13.a(i17);
        if (arrayList.contains(aVar)) {
            return;
        }
        arrayList.add(aVar);
    }

    public static final void m(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.p1713x373aa5.C15566x578e2f9b c15566x578e2f9b, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, l13.b bVar) {
        int n17 = c15566x578e2f9b.n();
        l13.b bVar2 = l13.b.f396521f;
        if (bVar == bVar2 ? c15566x578e2f9b.p() >= c15566x578e2f9b.f218889f : bVar == l13.b.f396519d) {
            n17++;
        }
        boolean z17 = bVar != bVar2;
        if (z17) {
            c15566x578e2f9b.f218895o = false;
            c15566x578e2f9b.f218896p = true;
        }
        if (c1163xf1deaba4 != null) {
            c15566x578e2f9b.q(n17, c1163xf1deaba4, true, z17);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        return m8020x7e414b06() != 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-2, -2);
    }

    public final int n() {
        if (m8037x755bd410() == 0 || m8018x1c4fb41d() == 0) {
            return 0;
        }
        return this.f218893m / m8018x1c4fb41d();
    }

    public final void o(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, boolean z17) {
        java.util.List list;
        java.lang.String str;
        int i17;
        int i18;
        if (z2Var == null) {
            return;
        }
        int n17 = n();
        int min = java.lang.Math.min(this.f218887d + n17, m8020x7e414b06() - 1);
        boolean z18 = this.f218893m % m8018x1c4fb41d() == 0;
        if (z17 && z18 && n17 != (i18 = this.f218892i)) {
            yz5.p pVar = this.f218891h;
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(n17));
            }
            this.f218892i = n17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str2 = "getViewForPosition(...)";
        if (n17 <= min) {
            int i19 = n17;
            while (true) {
                android.view.View f17 = z2Var.f(i19);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getViewForPosition(...)");
                arrayList.add(f17);
                if (i19 == min) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        if (n17 <= min) {
            int i27 = min;
            while (true) {
                android.view.View view = (android.view.View) arrayList.get(i27 - n17);
                mo7989xbb8aeee6(view);
                mo8051xe81a0a5e(view, 0, 0);
                if (i27 == n17) {
                    break;
                } else {
                    i27--;
                }
            }
        }
        java.util.List list2 = this.f218899s;
        if (n17 <= min) {
            int i28 = min;
            while (true) {
                int i29 = i28 - n17;
                android.view.View view2 = (android.view.View) arrayList.get(i29);
                android.view.View view3 = i29 <= 0 ? null : (android.view.View) arrayList.get(i29 - 1);
                android.view.View view4 = i29 < kz5.c0.h(arrayList) ? (android.view.View) arrayList.get(i29 + 1) : null;
                if (view2 != null) {
                    int m8037x755bd410 = (m8037x755bd410() - m8014x2ea13bdf(view2)) / 2;
                    int m8018x1c4fb41d = i29 == 0 ? (-this.f218893m) % m8018x1c4fb41d() : (int) (this.f218888e * (i29 - p()));
                    m8049xe4474aed(view2, m8037x755bd410, m8018x1c4fb41d, m8037x755bd410 + m8014x2ea13bdf(view2), m8018x1c4fb41d + m8013x8bb7462e(view2));
                }
                java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
                while (it.hasNext()) {
                    ((l13.c) it.next()).b(view2, i28, n17, p(), view3, view4);
                    arrayList = arrayList;
                    list2 = list2;
                    str2 = str2;
                    min = min;
                }
                int i37 = i28;
                list = list2;
                str = str2;
                java.util.ArrayList arrayList2 = arrayList;
                i17 = min;
                if (i37 == n17) {
                    break;
                }
                i28 = i37 - 1;
                arrayList = arrayList2;
                list2 = list;
                str2 = str;
                min = i17;
            }
        } else {
            list = list2;
            str = "getViewForPosition(...)";
            i17 = min;
        }
        int i38 = n17 - 1;
        if (i38 >= 0) {
            android.view.View f18 = z2Var.f(i38);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f18, str);
            java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
            while (it6.hasNext()) {
                ((l13.c) it6.next()).a(f18);
            }
            m8079xef099f25(f18, z2Var);
        }
        int i39 = i17 + 1;
        if (i39 < m8020x7e414b06()) {
            android.view.View f19 = z2Var.f(i39);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f19, str);
            java.util.Iterator it7 = ((java.util.ArrayList) list).iterator();
            while (it7.hasNext()) {
                ((l13.c) it7.next()).a(f19);
            }
            m8079xef099f25(f19, z2Var);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onAttachedToWindow */
    public void mo8058xfc50800e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        super.mo8058xfc50800e(c1163xf1deaba4);
        l13.d dVar = new l13.d(this, c1163xf1deaba4);
        this.f218900t = dVar;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.m7968x9a6969cf(dVar);
        }
        l13.e eVar = new l13.e(this, c1163xf1deaba4);
        this.f218901u = eVar;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.i(eVar);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onDetachedFromWindow */
    public void mo7937x8876e98b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
        super.mo7937x8876e98b(c1163xf1deaba4, z2Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.u2 m7955x6392d05b = c1163xf1deaba4 != null ? c1163xf1deaba4.m7955x6392d05b() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.u2 u2Var = this.f218900t;
        if (u2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("onFlingListener");
            throw null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m7955x6392d05b, u2Var)) {
            c1163xf1deaba4.m7968x9a6969cf(null);
        }
        if (c1163xf1deaba4 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = this.f218901u;
            if (w2Var != null) {
                c1163xf1deaba4.V0(w2Var);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("onScrollListener");
                throw null;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsAdded */
    public void mo7916x721d405f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MsgWindow", "onItemsAdded positionStart = " + i17 + ", itemCount = " + i18);
        if (i17 > n()) {
            i18 = 0;
        }
        this.f218893m += m8018x1c4fb41d() * i18;
        this.f218892i += i18;
        if (this.f218895o) {
            this.f218897q += i18 * m8018x1c4fb41d();
        }
        this.f218893m = java.lang.Math.max(this.f218893m, 0);
        this.f218892i = java.lang.Math.max(this.f218892i, 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsMoved */
    public void mo7918x72cb9e12(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MsgWindow", "onItemsMoved from = " + i17 + ", to = " + i18 + ", itemCount = " + i19);
        if (i19 != 1) {
            return;
        }
        int n17 = n();
        if (i17 != n17) {
            int i27 = (i18 > n17 ? 0 : 1) - (i17 < n17 ? 1 : 0);
            this.f218893m += m8018x1c4fb41d() * i27;
            this.f218892i += i27;
            if (this.f218895o) {
                this.f218897q += i27 * m8018x1c4fb41d();
            }
        } else {
            this.f218893m = (m8018x1c4fb41d() * i18) + (this.f218893m % m8018x1c4fb41d());
            this.f218892i = i18;
            if (this.f218895o) {
                this.f218897q = i18 * m8018x1c4fb41d();
            }
        }
        this.f218893m = r(this.f218893m);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsRemoved */
    public void mo7919xe5511bff(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MsgWindow", "onItemsRemoved positionStart = " + i17 + ", itemCount = " + i18);
        int max = java.lang.Math.max((java.lang.Math.min((i18 + i17) + (-1), n() + (-1)) - i17) + 1, 0);
        this.f218893m = this.f218893m - (m8018x1c4fb41d() * max);
        this.f218892i = this.f218892i - max;
        if (this.f218895o) {
            this.f218897q -= max * m8018x1c4fb41d();
        }
        this.f218893m = java.lang.Math.max(this.f218893m, 0);
        this.f218892i = java.lang.Math.max(this.f218892i, 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo2418x457c9b08(z2Var, h3Var);
        if (z2Var == null) {
            return;
        }
        m7996x5201473d(z2Var);
        if (m8020x7e414b06() <= 0) {
            return;
        }
        this.f218893m = r(this.f218893m);
        o(z2Var, false);
    }

    public final float p() {
        if (m8037x755bd410() == 0 || m8018x1c4fb41d() == 0) {
            return 0.0f;
        }
        return ((this.f218893m % m8018x1c4fb41d()) * 1.0f) / m8018x1c4fb41d();
    }

    public final void q(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, boolean z17, boolean z18) {
        int m8018x1c4fb41d = i17 * m8018x1c4fb41d();
        int i18 = m8018x1c4fb41d - this.f218893m;
        if (z18 && java.lang.Math.abs(i18) > 0) {
            this.f218898r = m8018x1c4fb41d;
        } else if (z18) {
            this.f218896p = false;
            if (!this.f218895o) {
                this.f218897q = Integer.MAX_VALUE;
            }
        }
        if (z17) {
            c1163xf1deaba4.mo7976xc291bbd2(0, i18);
        } else {
            c1163xf1deaba4.scrollBy(0, i18);
        }
    }

    public final int r(int i17) {
        return java.lang.Math.max(java.lang.Math.min(i17, m8018x1c4fb41d() * (m8020x7e414b06() - 1)), 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        this.f218893m = m8018x1c4fb41d() * i17;
        this.f218892i = i17;
        m8087x46ac7299();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (z2Var == null) {
            return 0;
        }
        int i18 = this.f218893m + i17;
        int i19 = this.f218897q;
        l13.b bVar = i18 > i19 ? l13.b.f396519d : l13.b.f396520e;
        if (this.f218890g && ((this.f218895o || this.f218896p) && i19 != Integer.MAX_VALUE && java.lang.Math.abs(i18 - i19) > m8018x1c4fb41d())) {
            i18 = bVar == l13.b.f396519d ? this.f218897q + m8018x1c4fb41d() : this.f218897q - m8018x1c4fb41d();
        }
        int r17 = r(i18);
        this.f218893m = r17;
        if (this.f218896p && r17 == this.f218898r) {
            this.f218896p = false;
            if (!this.f218895o) {
                this.f218897q = Integer.MAX_VALUE;
            }
        }
        int i27 = (r17 - i18) + i17;
        if (i27 == 0) {
            return 0;
        }
        m7996x5201473d(z2Var);
        o(z2Var, true);
        return i27;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        if (c1163xf1deaba4 != null) {
            q(i17, c1163xf1deaba4, true, false);
        }
    }
}
