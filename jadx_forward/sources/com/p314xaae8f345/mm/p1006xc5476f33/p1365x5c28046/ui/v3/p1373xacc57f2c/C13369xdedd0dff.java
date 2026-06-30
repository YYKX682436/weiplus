package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Landroidx/recyclerview/widget/f3;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerLayoutManager */
/* loaded from: classes15.dex */
public final class C13369xdedd0dff extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager implements p012xc85e97e9.p103xe821e364.p104xd1075a44.f3 {

    /* renamed from: e, reason: collision with root package name */
    public int f180013e;

    /* renamed from: h, reason: collision with root package name */
    public int f180016h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f180017i;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f180012d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(this);

    /* renamed from: f, reason: collision with root package name */
    public int f180014f = 2000;

    /* renamed from: g, reason: collision with root package name */
    public boolean f180015g = true;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f180018m = "MicroMsg.EmojiStoreV3BannerLayoutManager";

    /* renamed from: n, reason: collision with root package name */
    public boolean f180019n = true;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f3
    public android.graphics.PointF a(int i17) {
        return null;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally, reason: from getter */
    public boolean getF180019n() {
        return this.f180019n;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-1, -2);
    }

    public final int m() {
        int m8008x3d79f549 = m8008x3d79f549();
        for (int i17 = 0; i17 < m8008x3d79f549; i17++) {
            android.view.View m8007x6a486239 = m8007x6a486239(i17);
            if (m8007x6a486239 != null && m8012x7f0ab3e8(m8007x6a486239) >= 0 && m8015x62a22a5b(m8007x6a486239) <= this.f180012d.l()) {
                return m8032xa86cd69f(m8007x6a486239);
            }
        }
        return -1;
    }

    public final int n(android.view.View view) {
        return ((((m8018x1c4fb41d() - m8031xf39fff7a()) - m8026xc96f6de6()) - m8013x8bb7462e(view)) / 2) + m8031xf39fff7a();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        android.view.View m8007x6a486239;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (m8020x7e414b06() == 0 || state.f93598g) {
            m8077x28b7b1cd(recycler);
            return;
        }
        if (this.f180017i) {
            return;
        }
        m7996x5201473d(recycler);
        android.view.View f17 = recycler.f(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getViewForPosition(...)");
        mo8052x6ae7e3a1(f17, 0, 0);
        this.f180013e = m8014x2ea13bdf(f17);
        int m8020x7e414b06 = m8020x7e414b06();
        int i17 = 0;
        for (int i18 = 0; i18 < m8020x7e414b06 && i17 <= this.f180012d.l(); i18++) {
            android.view.View f18 = recycler.f(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f18, "getViewForPosition(...)");
            mo7989xbb8aeee6(f18);
            mo8052x6ae7e3a1(f18, 0, 0);
            int i19 = i17 + this.f180016h;
            m8050xb62e03b2(f18, i19, n(f18), i19 + this.f180013e, n(f18) + m8013x8bb7462e(f18));
            i17 += this.f180013e + this.f180016h;
        }
        if (m8020x7e414b06() >= 3 && this.f180015g && (m8007x6a486239 = m8007x6a486239(m8008x3d79f549() - 2)) != null) {
            android.view.View f19 = recycler.f(m8020x7e414b06() - 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f19, "getViewForPosition(...)");
            m7990xbb8aeee6(f19, 0);
            mo8052x6ae7e3a1(f19, 0, 0);
            int n17 = n(f19);
            int m8012x7f0ab3e8 = m8012x7f0ab3e8(m8007x6a486239);
            int i27 = this.f180013e;
            int i28 = m8012x7f0ab3e8 - i27;
            m8050xb62e03b2(f19, i28 - (i27 + i28), n17, 0, n17 + m8013x8bb7462e(f19));
        }
        this.f180017i = true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int i18;
        int i19 = 0;
        if (z2Var == null) {
            return 0;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f180012d;
        java.lang.String str = this.f180018m;
        if (i17 > 0) {
            if (m8020x7e414b06() > 0) {
                while (true) {
                    android.view.View m8007x6a486239 = m8007x6a486239(m8008x3d79f549() - 1);
                    if (m8007x6a486239 != null) {
                        int m8015x62a22a5b = m8015x62a22a5b(m8007x6a486239);
                        if (m8015x62a22a5b - i17 >= w1Var.l()) {
                            break;
                        }
                        int m8032xa86cd69f = m8032xa86cd69f(m8007x6a486239);
                        if (!this.f180015g && m8032xa86cd69f == m8020x7e414b06() - 1) {
                            break;
                        }
                        android.view.View f17 = z2Var.f(this.f180015g ? (m8032xa86cd69f + 1) % m8020x7e414b06() : m8032xa86cd69f + 1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getViewForPosition(...)");
                        mo7989xbb8aeee6(f17);
                        mo8052x6ae7e3a1(f17, 0, 0);
                        m8050xb62e03b2(f17, m8015x62a22a5b + this.f180016h, n(f17), this.f180016h + m8015x62a22a5b + m8014x2ea13bdf(f17), n(f17) + m8013x8bb7462e(f17));
                        m8014x2ea13bdf(f17);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "scrollToLeft stopped, rightView null");
                        break;
                    }
                }
                android.view.View m8007x6a4862392 = m8007x6a486239(m8008x3d79f549() - 1);
                if (m8007x6a4862392 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "scrollToLeft failed, lastChild null");
                } else {
                    i18 = m8012x7f0ab3e8(m8007x6a4862392);
                    if (m8032xa86cd69f(m8007x6a4862392) != m8020x7e414b06() - 1 || i18 - i17 >= 0) {
                        i18 = i17;
                    }
                    mo8054x8cefd576(-i18);
                    e06.k kVar = new e06.k(0, m8008x3d79f549());
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = kVar.iterator();
                    while (((e06.j) it).hasNext()) {
                        android.view.View m8007x6a4862393 = m8007x6a486239(((kz5.x0) it).b());
                        if (m8007x6a4862393 != null) {
                            arrayList.add(m8007x6a4862393);
                        }
                    }
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        android.view.View view = (android.view.View) it6.next();
                        if (m8015x62a22a5b(view) < 0) {
                            m8079xef099f25(view, z2Var);
                        }
                    }
                }
            }
            i18 = 0;
        } else {
            i18 = i17;
        }
        if (i17 >= 0) {
            return i18;
        }
        if (m8020x7e414b06() <= 0) {
            return 0;
        }
        while (true) {
            android.view.View m8007x6a4862394 = m8007x6a486239(0);
            if (m8007x6a4862394 != null) {
                if (m8012x7f0ab3e8(m8007x6a4862394) + java.lang.Math.abs(i17) <= m8028x805c2682()) {
                    break;
                }
                android.view.View m8007x6a4862395 = m8007x6a486239(0);
                if (m8007x6a4862395 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "addLeftItemView failed, child null, pos:0");
                } else {
                    int m8012x7f0ab3e8 = m8012x7f0ab3e8(m8007x6a4862395);
                    int m8032xa86cd69f2 = m8032xa86cd69f(m8007x6a4862395);
                    boolean z17 = this.f180015g;
                    if (z17 || m8032xa86cd69f2 != 0) {
                        int i27 = m8032xa86cd69f2 - 1;
                        if (z17) {
                            i27 = (i27 + m8020x7e414b06()) % m8020x7e414b06();
                        }
                        android.view.View f18 = z2Var.f(i27);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f18, "getViewForPosition(...)");
                        m7990xbb8aeee6(f18, 0);
                        mo8052x6ae7e3a1(f18, 0, 0);
                        java.lang.Math.abs(i17);
                        m8028x805c2682();
                        m8014x2ea13bdf(f18);
                        m8050xb62e03b2(f18, (m8012x7f0ab3e8 - m8014x2ea13bdf(f18)) - this.f180016h, n(f18), m8012x7f0ab3e8 - this.f180016h, n(f18) + m8013x8bb7462e(f18));
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "scrollToRight stopped, child null, pos:0");
                break;
            }
        }
        android.view.View m8007x6a4862396 = m8007x6a486239(0);
        if (m8007x6a4862396 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "scrollToRight failed, firstChild null");
            return 0;
        }
        int m8015x62a22a5b2 = m8015x62a22a5b(m8007x6a4862396);
        if (m8032xa86cd69f(m8007x6a4862396) == 0 && java.lang.Math.abs(i17) + m8015x62a22a5b2 > w1Var.l()) {
            i17 = -(w1Var.l() - m8015x62a22a5b2);
        }
        mo8054x8cefd576(-i17);
        e06.k kVar2 = new e06.k(0, m8008x3d79f549());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it7 = kVar2.iterator();
        while (((e06.j) it7).hasNext()) {
            android.view.View m8007x6a4862397 = m8007x6a486239(((kz5.x0) it7).b());
            if (m8007x6a4862397 != null) {
                arrayList2.add(m8007x6a4862397);
            }
        }
        java.util.Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            java.lang.Object next = it8.next();
            int i28 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view2 = (android.view.View) next;
            m8012x7f0ab3e8(view2);
            m8015x62a22a5b(view2);
            if (m8012x7f0ab3e8(view2) > w1Var.l()) {
                m8079xef099f25(view2, z2Var);
            }
            i19 = i28;
        }
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        if (m8020x7e414b06() > 0) {
            if (this.f180015g || (i17 >= 0 && i17 <= m8020x7e414b06() - 1)) {
                if (this.f180015g || m8020x7e414b06() > 0) {
                    i17 = ((i17 % m8020x7e414b06()) + m8020x7e414b06()) % m8020x7e414b06();
                }
                if (c1163xf1deaba4 != null) {
                    c1163xf1deaba4.requestFocus();
                }
                int m17 = m();
                int i18 = (m17 == m8020x7e414b06() + (-1) && i17 == 0 && this.f180015g) ? this.f180013e + this.f180016h : (i17 - m17) * (this.f180013e + this.f180016h);
                if (c1163xf1deaba4 != null) {
                    c1163xf1deaba4.b1(i18, 0, null);
                }
                java.util.Objects.toString(h3Var);
            }
        }
    }
}
