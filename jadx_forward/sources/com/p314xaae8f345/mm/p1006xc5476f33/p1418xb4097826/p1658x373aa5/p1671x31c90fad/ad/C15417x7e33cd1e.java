package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.ad;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/manager/ad/AdStackLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "sx2/a", "sx2/b", "sx2/c", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager */
/* loaded from: classes15.dex */
public final class C15417x7e33cd1e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public final sx2.c f214175d;

    /* renamed from: e, reason: collision with root package name */
    public final int f214176e;

    /* renamed from: f, reason: collision with root package name */
    public int f214177f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f214178g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.u2 f214179h;

    /* renamed from: i, reason: collision with root package name */
    public final sx2.h f214180i;

    /* renamed from: m, reason: collision with root package name */
    public final sx2.i f214181m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f214182n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f214183o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f214184p;

    /* renamed from: q, reason: collision with root package name */
    public sx2.a f214185q;

    /* renamed from: r, reason: collision with root package name */
    public int f214186r;

    /* renamed from: s, reason: collision with root package name */
    public sx2.b f214187s;

    public C15417x7e33cd1e(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        sx2.c cVar = sx2.c.f495058d;
        this.f214175d = cVar;
        this.f214176e = 2;
        this.f214180i = new sx2.f(cVar, 2);
        this.f214181m = new sx2.g(cVar, 2, context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        this.f214182n = true;
        this.f214185q = sx2.a.f495052d;
        this.f214177f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r1 == sx2.a.f495055g) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r6.n() < 0.5d) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r1 == sx2.a.f495056h) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        if (r1 == sx2.a.f495053e) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0041, code lost:
    
        if (r1 == sx2.a.f495054f) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.ad.C15417x7e33cd1e r6, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r7) {
        /*
            int r0 = r6.o()
            sx2.a r1 = r6.f214185q
            sx2.a r2 = sx2.a.f495052d
            r6.f214185q = r2
            sx2.c r2 = r6.f214175d
            int r2 = r2.ordinal()
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 == r3) goto L30
            r4 = 2
            if (r2 == r4) goto L26
            r4 = 3
            if (r2 == r4) goto L1c
            goto L44
        L1c:
            sx2.a r2 = sx2.a.f495056h
            if (r1 != r2) goto L21
            goto L50
        L21:
            sx2.a r2 = sx2.a.f495055g
            if (r1 != r2) goto L44
            goto L52
        L26:
            sx2.a r2 = sx2.a.f495055g
            if (r1 != r2) goto L2b
            goto L50
        L2b:
            sx2.a r2 = sx2.a.f495056h
            if (r1 != r2) goto L44
            goto L52
        L30:
            sx2.a r2 = sx2.a.f495054f
            if (r1 != r2) goto L35
            goto L50
        L35:
            sx2.a r2 = sx2.a.f495053e
            if (r1 != r2) goto L44
            goto L52
        L3a:
            sx2.a r2 = sx2.a.f495053e
            if (r1 != r2) goto L3f
            goto L50
        L3f:
            sx2.a r2 = sx2.a.f495054f
            if (r1 != r2) goto L44
            goto L52
        L44:
            float r1 = r6.n()
            double r1 = (double) r1
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L50
            goto L52
        L50:
            int r0 = r0 + 1
        L52:
            r6.t(r0, r7, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.ad.C15417x7e33cd1e.m(com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager, androidx.recyclerview.widget.RecyclerView):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF180019n() {
        if (m8020x7e414b06() == 0) {
            return false;
        }
        int ordinal = this.f214175d.ordinal();
        return ordinal == 0 || ordinal == 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        if (m8020x7e414b06() == 0) {
            return false;
        }
        int ordinal = this.f214175d.ordinal();
        return ordinal == 2 || ordinal == 3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-2, -2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: isAutoMeasureEnabled */
    public boolean mo7936xd96f765c() {
        return true;
    }

    public final float n() {
        float m8037x755bd410;
        int m8037x755bd4102;
        if (m8037x755bd410() == 0 || m8018x1c4fb41d() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdStackLayoutManager", "getFirstVisibleItemMovePercent: error, width=" + m8037x755bd410() + ", height=" + m8018x1c4fb41d());
            return 0.0f;
        }
        int ordinal = this.f214175d.ordinal();
        if (ordinal == 0) {
            float m8037x755bd4103 = 1 - (((this.f214177f % m8037x755bd410()) * 1.0f) / m8037x755bd410());
            if (m8037x755bd4103 == 1.0f) {
                return 0.0f;
            }
            return m8037x755bd4103;
        }
        if (ordinal == 1) {
            m8037x755bd410 = (this.f214177f % m8037x755bd410()) * 1.0f;
            m8037x755bd4102 = m8037x755bd410();
        } else {
            if (ordinal == 2) {
                float m8018x1c4fb41d = 1 - (((this.f214177f % m8018x1c4fb41d()) * 1.0f) / m8018x1c4fb41d());
                if (m8018x1c4fb41d == 1.0f) {
                    return 0.0f;
                }
                return m8018x1c4fb41d;
            }
            if (ordinal != 3) {
                throw new jz5.j();
            }
            m8037x755bd410 = (this.f214177f % m8018x1c4fb41d()) * 1.0f;
            m8037x755bd4102 = m8018x1c4fb41d();
        }
        return m8037x755bd410 / m8037x755bd4102;
    }

    public final int o() {
        int m8020x7e414b06;
        double ceil;
        double floor;
        if (m8037x755bd410() == 0 || m8018x1c4fb41d() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdStackLayoutManager", "getFirstVisibleItemPosition: error, width=" + m8037x755bd410() + ", height=" + m8018x1c4fb41d());
            return 0;
        }
        int ordinal = this.f214175d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                floor = java.lang.Math.floor((this.f214177f * 1.0d) / m8037x755bd410());
            } else if (ordinal == 2) {
                m8020x7e414b06 = m8020x7e414b06() - 1;
                ceil = java.lang.Math.ceil((this.f214177f * 1.0d) / m8018x1c4fb41d());
            } else {
                if (ordinal != 3) {
                    throw new jz5.j();
                }
                floor = java.lang.Math.floor((this.f214177f * 1.0d) / m8018x1c4fb41d());
            }
            return (int) floor;
        }
        m8020x7e414b06 = m8020x7e414b06() - 1;
        ceil = java.lang.Math.ceil((this.f214177f * 1.0d) / m8037x755bd410());
        return m8020x7e414b06 - ((int) ceil);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onAttachedToWindow */
    public void mo8058xfc50800e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo8058xfc50800e(view);
        sx2.d dVar = new sx2.d(this, view);
        this.f214179h = dVar;
        view.m7968x9a6969cf(dVar);
        sx2.e eVar = new sx2.e(this, view);
        this.f214178g = eVar;
        view.i(eVar);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onDetachedFromWindow */
    public void mo7937x8876e98b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
        super.mo7937x8876e98b(c1163xf1deaba4, z2Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.u2 m7955x6392d05b = c1163xf1deaba4 != null ? c1163xf1deaba4.m7955x6392d05b() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.u2 u2Var = this.f214179h;
        if (u2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("onFlingListener");
            throw null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m7955x6392d05b, u2Var)) {
            c1163xf1deaba4.m7968x9a6969cf(null);
        }
        if (c1163xf1deaba4 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = this.f214178g;
            if (w2Var != null) {
                c1163xf1deaba4.V0(w2Var);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("onScrollListener");
                throw null;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        ((sx2.g) this.f214181m).f495065c = false;
        m8077x28b7b1cd(recycler);
        if (m8020x7e414b06() > 0) {
            this.f214177f = q(this.f214177f);
            r(recycler);
        }
    }

    public final int p(int i17) {
        int m8020x7e414b06;
        int m8037x755bd410;
        int m8037x755bd4102;
        int ordinal = this.f214175d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                m8037x755bd4102 = m8037x755bd410();
            } else if (ordinal == 2) {
                m8020x7e414b06 = (m8020x7e414b06() - 1) - i17;
                m8037x755bd410 = m8018x1c4fb41d();
            } else {
                if (ordinal != 3) {
                    throw new jz5.j();
                }
                m8037x755bd4102 = m8018x1c4fb41d();
            }
            return i17 * m8037x755bd4102;
        }
        m8020x7e414b06 = (m8020x7e414b06() - 1) - i17;
        m8037x755bd410 = m8037x755bd410();
        return m8037x755bd410 * m8020x7e414b06;
    }

    public final int q(int i17) {
        int ordinal = this.f214175d.ordinal();
        return (ordinal == 0 || ordinal == 1) ? java.lang.Math.max(java.lang.Math.min(m8037x755bd410() * (m8020x7e414b06() - 1), i17), 0) : java.lang.Math.max(java.lang.Math.min(m8018x1c4fb41d() * (m8020x7e414b06() - 1), i17), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 r25) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.ad.C15417x7e33cd1e.r(androidx.recyclerview.widget.z2):void");
    }

    public final void s(android.view.View view) {
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/manager/ad/AdStackLayoutManager", "resetViewAnimateProperty", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/manager/ad/AdStackLayoutManager", "resetViewAnimateProperty", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int i18 = this.f214177f + i17;
        int q17 = q(i18);
        this.f214177f = q17;
        int i19 = (q17 - i18) + i17;
        if (i19 == 0) {
            return 0;
        }
        m7996x5201473d(recycler);
        r(recycler);
        return i19;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        if (i17 >= 0 && i17 < m8020x7e414b06()) {
            this.f214177f = p(i17);
            m8087x46ac7299();
            return;
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(i17 + " is out of bound [0.." + m8020x7e414b06() + "-1]");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        int i18 = this.f214177f + i17;
        int q17 = q(i18);
        this.f214177f = q17;
        int i19 = (q17 - i18) + i17;
        if (i19 == 0) {
            return 0;
        }
        m7996x5201473d(recycler);
        r(recycler);
        return i19;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 >= 0 && i17 < m8020x7e414b06()) {
            this.f214183o = true;
            t(i17, recyclerView, true);
            return;
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(i17 + " is out of bound [0.." + m8020x7e414b06() + "-1]");
    }

    public final void t(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, boolean z17) {
        int p17 = p(i17);
        int ordinal = this.f214175d.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (z17) {
                c1163xf1deaba4.mo7976xc291bbd2(p17 - this.f214177f, 0);
                return;
            } else {
                c1163xf1deaba4.scrollBy(p17 - this.f214177f, 0);
                return;
            }
        }
        if (z17) {
            c1163xf1deaba4.mo7976xc291bbd2(0, p17 - this.f214177f);
        } else {
            c1163xf1deaba4.scrollBy(0, p17 - this.f214177f);
        }
    }
}
