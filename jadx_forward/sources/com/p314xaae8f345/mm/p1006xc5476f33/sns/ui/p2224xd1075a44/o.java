package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public final class o implements db5.x4 {

    /* renamed from: a, reason: collision with root package name */
    public final db5.y4 f252768a;

    /* renamed from: b, reason: collision with root package name */
    public int f252769b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f252770c;

    public o(db5.y4 provider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        this.f252768a = provider;
        this.f252769b = 800;
    }

    @Override // db5.x4
    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(if1.o.f69932x24728b, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(if1.o.f69932x24728b, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        return true;
    }

    @Override // db5.x4
    public void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
    }

    @Override // db5.x4
    public boolean d(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(if1.q.f69936x24728b, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        if (!z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(if1.q.f69936x24728b, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
            return false;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(if1.q.f69936x24728b, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
            return true;
        }
        db5.y4 y4Var = this.f252768a;
        int c17 = ((db5.b5) y4Var).c();
        int i17 = this.f252769b;
        if (c17 < (-i17) / 2) {
            db5.y4.a(y4Var, (-i17) - ((db5.b5) y4Var).c(), 0, 2, null);
            yz5.l lVar = this.f252770c;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        } else {
            db5.y4.a(y4Var, -((db5.b5) y4Var).c(), 0, 2, null);
            yz5.l lVar2 = this.f252770c;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(if1.q.f69936x24728b, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        return true;
    }

    @Override // db5.x4
    public boolean e(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFling", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        db5.y4 y4Var = this.f252768a;
        ((db5.b5) y4Var).f309827a.f279033g.fling(0, ((db5.b5) y4Var).c(), 0, -((int) f17), 0, 0, -this.f252769b, 0);
        int finalY = ((db5.b5) y4Var).f309827a.f279033g.getFinalY();
        int i17 = this.f252769b;
        if (finalY < (-i17) / 2) {
            db5.y4.a(y4Var, (-i17) - ((db5.b5) y4Var).c(), 0, 2, null);
            yz5.l lVar = this.f252770c;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        } else {
            db5.y4.a(y4Var, -((db5.b5) y4Var).c(), 0, 2, null);
            yz5.l lVar2 = this.f252770c;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFling", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        return true;
    }

    @Override // db5.x4
    public boolean f(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScroll", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        int i17 = (int) (f17 / 2);
        db5.b5 b5Var = (db5.b5) this.f252768a;
        int c17 = b5Var.c() + i17;
        b5Var.c();
        if (c17 <= 0 && c17 >= (-this.f252769b)) {
            b5Var.d(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
            return true;
        }
        if (b5Var.c() >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
            return false;
        }
        int i18 = -this.f252769b;
        if (c17 < i18) {
            b5Var.f309827a.scrollTo(0, i18);
        } else {
            b5Var.d(java.lang.Math.min(i17, -b5Var.c()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        return true;
    }
}
