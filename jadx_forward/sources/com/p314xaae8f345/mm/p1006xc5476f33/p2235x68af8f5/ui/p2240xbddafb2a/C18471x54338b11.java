package com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2240xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/layout/GalleryLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.story.ui.layout.GalleryLayoutManager */
/* loaded from: classes4.dex */
public final class C18471x54338b11 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de {
    public boolean A;

    /* renamed from: v, reason: collision with root package name */
    public int f253408v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f253409w;

    /* renamed from: x, reason: collision with root package name */
    public int f253410x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.p f253411y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.p f253412z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18471x54338b11(android.content.Context context, int i17) {
        super(context, i17, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f253410x = -1;
        this.A = true;
    }

    public final void W(boolean z17) {
        int i17 = 0;
        if (m8008x3d79f549() != 1) {
            if (super.getF180019n()) {
                int m8037x755bd410 = m8037x755bd410() / 2;
                int m8008x3d79f549 = m8008x3d79f549();
                while (i17 < m8008x3d79f549) {
                    android.view.View m8007x6a486239 = m8007x6a486239(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m8007x6a486239);
                    int left = m8007x6a486239.getLeft();
                    android.view.View m8007x6a4862392 = m8007x6a486239(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m8007x6a4862392);
                    if ((left + m8007x6a4862392.getRight()) / 2 == m8037x755bd410) {
                        break;
                    } else {
                        i17++;
                    }
                }
                i17 = -1;
            } else {
                int m8018x1c4fb41d = m8018x1c4fb41d() / 2;
                int m8008x3d79f5492 = m8008x3d79f549();
                while (i17 < m8008x3d79f5492) {
                    android.view.View m8007x6a4862393 = m8007x6a486239(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m8007x6a4862393);
                    int top = m8007x6a4862393.getTop();
                    android.view.View m8007x6a4862394 = m8007x6a486239(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m8007x6a4862394);
                    if ((top + m8007x6a4862394.getBottom()) / 2 == m8018x1c4fb41d) {
                        break;
                    } else {
                        i17++;
                    }
                }
                i17 = -1;
            }
        }
        if (i17 >= 0) {
            android.view.View m8007x6a4862395 = m8007x6a486239(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m8007x6a4862395);
            int m8032xa86cd69f = m8032xa86cd69f(m8007x6a4862395);
            if (m8032xa86cd69f != this.f253410x || z17) {
                this.f253410x = m8032xa86cd69f;
                yz5.p pVar = this.f253411y;
                if (pVar != null) {
                    pVar.mo149xb9724478(java.lang.Integer.valueOf(m8032xa86cd69f), m8007x6a4862395);
                }
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF180019n() {
        return this.A && super.getF180019n();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        return this.A && m8020x7e414b06() > 1 && super.getF204840r();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsAdded */
    public void mo7916x721d405f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.mo7916x721d405f(recyclerView, i17, i18);
        int i19 = this.f253410x;
        if (i19 < i17 || i19 >= i17 + i18) {
            return;
        }
        this.f253409w = true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsChanged */
    public void mo7917xd0486653(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLayoutManager", "LogStory: onItemsChanged");
        this.f253409w = true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsRemoved */
    public void mo7919xe5511bff(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLayoutManager", "LogStory: onItemsRemoved " + i17 + ", " + i18);
        super.mo7919xe5511bff(recyclerView, i17, i18);
        int i19 = this.f253410x;
        if (i19 < i17 || i19 >= i17 + i18) {
            return;
        }
        this.f253409w = true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsUpdated */
    public void mo8065x9643e45a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLayoutManager", "LogStory: onItemsUpdated " + i17 + ", " + i18);
        super.mo8065x9643e45a(recyclerView, i17, i18);
        int i19 = this.f253410x;
        if (i19 < i17 || i19 >= i17 + i18) {
            return;
        }
        this.f253409w = true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutCompleted */
    public void mo7921x1c165a62(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLayoutManager", "LogStory: onLayoutCompleted");
        super.mo7921x1c165a62(h3Var);
        W(this.f253409w);
        this.f253409w = false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onScrollStateChanged */
    public void mo8069x4d79408f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLayoutManager", "LogStory: onScrollStateChanged " + i17);
        super.mo8069x4d79408f(i17);
        this.f253408v = i17;
        if (i17 == 0) {
            W(false);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int mo2419x96d40915 = super.mo2419x96d40915(i17, recycler, state);
        if ((i17 + 1 <= mo2419x96d40915 && mo2419x96d40915 < 0) && this.f253408v == 1) {
            android.view.View m8007x6a486239 = m8007x6a486239(0);
            android.view.ViewParent parent = m8007x6a486239 != null ? m8007x6a486239.getParent() : null;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = parent instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) parent : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLayoutManager", "horizontal Drag to end, " + i17 + ' ' + mo2419x96d40915 + ", " + c1163xf1deaba4);
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.f1();
            }
        }
        return mo2419x96d40915;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: scrollToPosition ");
        sb6.append(i17);
        sb6.append(' ');
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLayoutManager", sb6.toString());
        super.mo2420xc593c771(i17);
        yz5.p pVar = this.f253412z;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(0.0f));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        int m8012x7f0ab3e8;
        int m8014x2ea13bdf;
        float f17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int mo7922xd8d712a7 = super.mo7922xd8d712a7(i17, recycler, state);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLayoutManager", "LogStory: vertical " + i17 + ' ' + mo7922xd8d712a7);
        if ((i17 + 1 <= mo7922xd8d712a7 && mo7922xd8d712a7 < 0) && this.f253408v == 1) {
            android.view.View m8007x6a486239 = m8007x6a486239(0);
            android.view.ViewParent parent = m8007x6a486239 != null ? m8007x6a486239.getParent() : null;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = parent instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) parent : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLayoutManager", "vertical Drag to end, " + i17 + ' ' + mo7922xd8d712a7 + ", " + c1163xf1deaba4);
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.f1();
            }
        }
        if (m8008x3d79f549() != 0) {
            if (m8008x3d79f549() == 1) {
                android.view.View m8007x6a4862392 = m8007x6a486239(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m8007x6a4862392);
                i18 = m8032xa86cd69f(m8007x6a4862392);
                f17 = 0.0f;
            } else {
                android.view.View m8007x6a4862393 = m8007x6a486239(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m8007x6a4862393);
                int m8032xa86cd69f = m8032xa86cd69f(m8007x6a4862393);
                if (getF204840r()) {
                    m8012x7f0ab3e8 = m8016xfbd72d54(m8007x6a4862393);
                    m8014x2ea13bdf = m8013x8bb7462e(m8007x6a4862393);
                } else {
                    m8012x7f0ab3e8 = m8012x7f0ab3e8(m8007x6a4862393);
                    m8014x2ea13bdf = m8014x2ea13bdf(m8007x6a4862393);
                }
                f17 = (-m8012x7f0ab3e8) / m8014x2ea13bdf;
                i18 = m8032xa86cd69f;
            }
            yz5.p pVar = this.f253412z;
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(f17));
            }
        }
        return mo7922xd8d712a7;
    }
}
