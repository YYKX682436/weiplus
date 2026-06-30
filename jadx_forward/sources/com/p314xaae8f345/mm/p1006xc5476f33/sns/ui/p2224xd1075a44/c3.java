package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public final class c3 implements db5.x4 {

    /* renamed from: a, reason: collision with root package name */
    public final db5.y4 f252630a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f252631b;

    /* renamed from: c, reason: collision with root package name */
    public int f252632c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f252633d;

    /* renamed from: e, reason: collision with root package name */
    public int f252634e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.y2 f252635f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f252636g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f252637h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.o f252638i;

    /* renamed from: j, reason: collision with root package name */
    public final db5.z4 f252639j;

    /* renamed from: k, reason: collision with root package name */
    public db5.x4 f252640k;

    public c3(db5.y4 provider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        this.f252630a = provider;
        this.f252631b = "MicroMsg.SnsOpenScroller";
        this.f252632c = 800;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.o(provider);
        this.f252638i = oVar;
        this.f252639j = new db5.z4(provider);
        this.f252640k = oVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b3 b3Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b3(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnOpenChanged", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        oVar.f252770c = b3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnOpenChanged", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
    }

    @Override // db5.x4
    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(if1.o.f69932x24728b, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f252631b, "onTouchStart: " + this.f252633d + ", " + k() + ", " + this.f252637h + ", " + this.f252640k);
        if ((this.f252633d || k()) && ((db5.b5) this.f252630a).f309827a.f279042s) {
            this.f252636g = false;
            this.f252640k = this.f252638i;
        } else {
            this.f252636g = true;
            this.f252640k = this.f252639j;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.y2 y2Var = this.f252635f;
        if (y2Var != null) {
            y2Var.a();
        }
        boolean a17 = this.f252640k.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(if1.o.f69932x24728b, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return a17;
    }

    @Override // db5.x4
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.y2 y2Var = this.f252635f;
        if (y2Var != null) {
            y2Var.e(this.f252636g);
        }
        g(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
    }

    @Override // db5.x4
    public void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.y2 y2Var = this.f252635f;
        if (y2Var != null) {
            y2Var.b(this.f252636g, i17, ((db5.b5) this.f252630a).c());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
    }

    @Override // db5.x4
    public boolean d(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(if1.q.f69936x24728b, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        boolean d17 = this.f252640k.d(z17, z18);
        if (!d17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStateSettle", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            int i17 = this.f252634e;
            boolean z19 = i17 == 1 || i17 == 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStateSettle", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            if (!z19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("close$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                i(true);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("close$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            }
        }
        this.f252637h = false;
        if (d17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkState$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            g(false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkState$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.y2 y2Var = this.f252635f;
        if (y2Var != null) {
            y2Var.d(this.f252636g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(if1.q.f69936x24728b, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return d17;
    }

    @Override // db5.x4
    public boolean e(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFling", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        boolean e17 = this.f252640k.e(f17);
        this.f252637h = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFling", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return e17;
    }

    @Override // db5.x4
    public boolean f(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScroll", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.y2 y2Var = this.f252635f;
        if (y2Var != null) {
            y2Var.b(this.f252636g, (int) f17, ((db5.b5) this.f252630a).c());
        }
        boolean f18 = this.f252640k.f(f17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return f18;
    }

    public final void g(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.y2 y2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f252631b, "checkState: " + z17);
        db5.y4 y4Var = this.f252630a;
        int i17 = (((db5.b5) y4Var).f309827a.f279033g.isFinished() ? ((db5.b5) y4Var).c() : ((db5.b5) y4Var).f309827a.f279033g.getFinalY()) < 0 ? z17 ? 1 : 2 : z17 ? 0 : 3;
        int i18 = this.f252634e;
        if (i18 != i17) {
            if (i17 == 0 && i18 != 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.y2 y2Var2 = this.f252635f;
                if (y2Var2 != null) {
                    y2Var2.c(3, false);
                }
            } else if (i17 == 1 && i18 != 2 && (y2Var = this.f252635f) != null) {
                y2Var.c(2, false);
            }
            this.f252634e = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.y2 y2Var3 = this.f252635f;
            if (y2Var3 != null) {
                y2Var3.c(i17, false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
    }

    public final void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("close", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("close$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        i(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("close$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("close", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
    }

    public final void i(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("close", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        this.f252636g = false;
        db5.y4 y4Var = this.f252630a;
        if (z17) {
            db5.y4.b(y4Var, 0, 0, 2, null);
            g(false);
        } else {
            ((db5.b5) y4Var).f309827a.scrollTo(0, 0);
            g(true);
        }
        this.f252637h = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("close", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
    }

    public final int j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        int i17 = this.f252634e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return i17;
    }

    public final boolean k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        boolean z17 = ((db5.b5) this.f252630a).c() == (-this.f252632c) || this.f252637h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return z17;
    }
}
