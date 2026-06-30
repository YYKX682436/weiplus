package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes8.dex */
public class v1 implements rh4.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.w1 f254269a;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.w1 w1Var) {
        this.f254269a = w1Var;
    }

    @Override // rh4.j0
    public boolean a(float f17, float f18) {
        rh4.m mVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.w1 w1Var = this.f254269a;
        rh4.o oVar = w1Var.f254276e.f254065l2;
        if (oVar != null) {
            return oVar.q(f17, f18);
        }
        if (!o() || (mVar = w1Var.f254276e.f254066m2) == null) {
            return false;
        }
        return mVar.q(f17, f18);
    }

    @Override // rh4.j0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = this.f254269a.f254276e.f254056c2;
        if (o2Var == null) {
            return;
        }
        o2Var.k(c11714x918fd2e4, i17, i18, true);
    }

    @Override // rh4.j0
    public void c(cl1.n0 n0Var, boolean z17) {
    }

    @Override // rh4.j0
    public void d(int i17, cl1.n0 n0Var) {
        this.f254269a.f254276e.D(true, n0Var, i17, true, 1);
    }

    @Override // rh4.j0
    public void e(int i17, cl1.n0 newItem) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "notifyMyWeAppChanged %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.w1 w1Var = this.f254269a;
        int indexOf = w1Var.f254276e.f254058e2.indexOf(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = w1Var.f254276e;
        if (indexOf != -1) {
            rh4.o oVar = c18557xc00aa3f3.f254065l2;
            if (oVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newItem, "newItem");
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 m162446x4905e9fa = oVar.m162446x4905e9fa();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m162446x4905e9fa, "null cannot be cast to non-null type com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionMyWeAppRecyclerView");
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18565x166dd6f4 c18565x166dd6f4 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18565x166dd6f4) m162446x4905e9fa;
                int size = c18565x166dd6f4.m71639xe6796cde().size();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopSectionWeAppRecyclerView", "notifyItemInserted showlist filled %s", rh4.n0.k(c18565x166dd6f4.m71643x67a476b1()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopSectionWeAppRecyclerView", "notifyItemInserted %d %d %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(size), newItem.f124421a.f157898h, rh4.n0.k(c18565x166dd6f4.m71639xe6796cde()));
                int i18 = 0;
                while (true) {
                    if (i18 >= c18565x166dd6f4.m71643x67a476b1().size()) {
                        i18 = -1;
                        break;
                    } else if (newItem.a(c18565x166dd6f4.m71643x67a476b1().get(i18))) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i18 != -1) {
                    c18565x166dd6f4.m71643x67a476b1().remove(i18);
                    c18565x166dd6f4.m71639xe6796cde().remove(i18);
                    c18565x166dd6f4.m71639xe6796cde().add(newItem);
                    int size2 = c18565x166dd6f4.m71643x67a476b1().size();
                    c18565x166dd6f4.m71643x67a476b1().add(c18565x166dd6f4.m71639xe6796cde().get(size2));
                    c18565x166dd6f4.f254245g2.m8155x27702c4(i18);
                    c18565x166dd6f4.f254245g2.m8149x8b456734(size2);
                } else {
                    int size3 = c18565x166dd6f4.m71643x67a476b1().size();
                    if (size3 < 8) {
                        c18565x166dd6f4.m71643x67a476b1().add(size3, newItem);
                        c18565x166dd6f4.f254245g2.m8149x8b456734(size3);
                    }
                    int i19 = 0;
                    while (true) {
                        if (i19 >= c18565x166dd6f4.m71639xe6796cde().size()) {
                            break;
                        }
                        if (newItem.a(c18565x166dd6f4.m71639xe6796cde().get(i19))) {
                            c18565x166dd6f4.m71639xe6796cde().remove(i19);
                            break;
                        }
                        i19++;
                    }
                    c18565x166dd6f4.m71639xe6796cde().add(newItem);
                    if (c18565x166dd6f4.m71643x67a476b1().size() > 8) {
                        c18565x166dd6f4.m71643x67a476b1().remove(8);
                        c18565x166dd6f4.f254245g2.m8155x27702c4(7);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopSectionWeAppRecyclerView", "notifyItemInserted showlist filled %s", rh4.n0.k(c18565x166dd6f4.m71643x67a476b1()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopSectionWeAppRecyclerView", "notifyItemInserted filled %s", rh4.n0.k(c18565x166dd6f4.m71639xe6796cde()));
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = c18565x166dd6f4.f254245g2;
                int mo1894x7e414b06 = f2Var.mo1894x7e414b06();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                f2Var.m8152xc67946d3(0, mo1894x7e414b06, bool);
                oVar.n();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18565x166dd6f4) oVar.m162446x4905e9fa()).m71639xe6796cde().size() > 8) {
                    lh4.b m145775x71965dbb = oVar.m145775x71965dbb();
                    java.util.List<cl1.n0> m71639xe6796cde = ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18565x166dd6f4) oVar.m162446x4905e9fa()).m71639xe6796cde();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m71639xe6796cde, "getDataList(...)");
                    java.lang.String str = ((cl1.n0) kz5.n0.i0(m71639xe6796cde)).f124421a.f157895e;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) m145775x71965dbb).f254056c2;
                    if (o2Var != null) {
                        o2Var.f254207t.d(2, 11, null, 1, str, "", i17, o2Var.f254199l, "", -1);
                    }
                }
                if (!c18557xc00aa3f3.m71609x4905e9fa().E0()) {
                    c18557xc00aa3f3.f254069p2.m8148xed6e4d18(indexOf, bool);
                }
            }
        } else if (!c18557xc00aa3f3.m71609x4905e9fa().E0()) {
            if (c18557xc00aa3f3.f254056c2.f254195h.isEmpty()) {
                c18557xc00aa3f3.f254056c2.f254195h.add(newItem);
            }
            c18557xc00aa3f3.w1();
            if (!o()) {
                c18557xc00aa3f3.f254069p2.m8149x8b456734(c18557xc00aa3f3.f254058e2.indexOf(2));
            }
        }
        w1Var.f254276e.D(true, newItem, i17, true, 1);
    }

    @Override // rh4.j0
    public void f(cl1.n0 n0Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.w1 w1Var = this.f254269a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = w1Var.f254276e.f254056c2;
        o2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "removeCommonUsedAppData pos:%d", java.lang.Integer.valueOf(i17));
        if (o2Var.f254193f == null) {
            ((et.e) ((ft.u3) i95.n0.c(ft.u3.class))).getClass();
            o2Var.f254193f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.v.f173600a.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.a6 a6Var = o2Var.f254193f;
        if (a6Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.m) a6Var).x0(((cl1.n0) o2Var.f254196i.get(i17)).f124421a.f157894d, ((cl1.n0) o2Var.f254196i.get(i17)).f124421a.f157896f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = w1Var.f254276e;
        c18557xc00aa3f3.f254069p2.m8148xed6e4d18(c18557xc00aa3f3.f254058e2.indexOf(7), java.lang.Boolean.TRUE);
        c18557xc00aa3f3.u1(n0Var, i17);
    }

    @Override // rh4.j0
    public void g() {
        s(1);
    }

    @Override // rh4.j0
    public void h(cl1.n0 n0Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.w1 w1Var = this.f254269a;
        w1Var.f254276e.f254056c2.e(i17, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = w1Var.f254276e;
        c18557xc00aa3f3.f254069p2.m8148xed6e4d18(c18557xc00aa3f3.f254058e2.indexOf(2), java.lang.Boolean.TRUE);
        w1Var.f254276e.u1(n0Var, i17);
    }

    @Override // rh4.j0
    public void i() {
        this.f254269a.f254276e.n1();
    }

    @Override // rh4.j0
    public void j(float f17) {
    }

    @Override // rh4.j0
    public int k() {
        return this.f254269a.f254276e.f254056c2.f254195h.size();
    }

    @Override // rh4.j0
    public void l(cl1.n0 n0Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.w1 w1Var = this.f254269a;
        w1Var.f254276e.f254056c2.e(i17, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = w1Var.f254276e;
        c18557xc00aa3f3.f254069p2.m8148xed6e4d18(c18557xc00aa3f3.f254058e2.indexOf(1), java.lang.Boolean.TRUE);
        w1Var.f254276e.u1(n0Var, i17);
    }

    @Override // rh4.j0
    public boolean m() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.w1 w1Var = this.f254269a;
        long j17 = currentTimeMillis - w1Var.f254276e.f254056c2.f254197j;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.c0) ((ft.j) i95.n0.c(ft.j.class))).getClass();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158002c;
        if (i17 == -1) {
            r45.a60 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.b();
            i17 = b17 != null ? b17.f451293h : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158002c = i17;
        }
        long j18 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = w1Var.f254276e;
        boolean z17 = c18557xc00aa3f3.H2;
        c18557xc00aa3f3.H2 = false;
        if (!z17 || j17 > j18) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "should not Response Click");
        return false;
    }

    @Override // rh4.j0
    public android.view.View n() {
        boolean o17 = o();
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.w1 w1Var = this.f254269a;
        return o17 ? w1Var.f254276e.f254066m2 : w1Var.f254276e.f254065l2;
    }

    @Override // rh4.j0
    public boolean o() {
        return this.f254269a.f254276e.f254056c2.f254196i.size() > 0 && !lh4.n.f400252e.a(1);
    }

    @Override // rh4.j0
    public void p(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.View view, cl1.n0 n0Var, int i17) {
        if (n0Var == null) {
            return;
        }
        this.f254269a.f254276e.G(k3Var.m8183xf806b362(), n0Var, false);
    }

    @Override // rh4.j0
    public void q(boolean z17) {
        rh4.m mVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.w1 w1Var = this.f254269a;
        rh4.o oVar = w1Var.f254276e.f254065l2;
        if (oVar != null) {
            oVar.p(z17);
        }
        if (!o() || (mVar = w1Var.f254276e.f254066m2) == null) {
            return;
        }
        mVar.p(z17);
    }

    @Override // rh4.j0
    public void r(int i17) {
        s(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(int r18) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.v1.s(int):void");
    }
}
