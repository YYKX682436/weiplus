package mi1;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f408235a;

    /* renamed from: b, reason: collision with root package name */
    public mi1.h f408236b;

    /* renamed from: c, reason: collision with root package name */
    public mi1.i f408237c;

    /* renamed from: d, reason: collision with root package name */
    public mi1.h0 f408238d;

    /* renamed from: e, reason: collision with root package name */
    public final mi1.m0 f408239e;

    /* renamed from: f, reason: collision with root package name */
    public final mi1.q1 f408240f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f408241g;

    /* renamed from: h, reason: collision with root package name */
    public int f408242h;

    /* renamed from: i, reason: collision with root package name */
    public mi1.u0 f408243i;

    /* renamed from: j, reason: collision with root package name */
    public mi1.f f408244j;

    /* renamed from: k, reason: collision with root package name */
    public final mi1.m f408245k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f408246l;

    /* renamed from: m, reason: collision with root package name */
    public al1.a0 f408247m;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f408235a = runtime;
        mi1.m0 m0Var = new mi1.m0();
        this.f408239e = m0Var;
        mi1.q1 q1Var = new mi1.q1(runtime);
        this.f408240f = q1Var;
        m0Var.a((mi1.x2) ((jz5.n) q1Var.f408197e).mo141623x754a37bb());
        m0Var.a(new mi1.b3(runtime));
        this.f408241g = jz5.h.a(jz5.i.f384363e, new mi1.p(this));
        this.f408245k = new mi1.m(this);
    }

    public final android.view.View a(int i17) {
        return c().findViewById(i17);
    }

    public final mi1.f b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 a17;
        u81.h hVar;
        mi1.h0 h0Var = this.f408238d;
        if (h0Var == null) {
            mi1.f fVar = this.f408244j;
            if (fVar != null) {
                return fVar;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blinkHelperExport");
            throw null;
        }
        mi1.f fVar2 = this.f408244j;
        if (fVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blinkHelperExport");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c8 c8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c8) h0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = c8Var.f158571b;
        wa1.a aVar = wa1.b.f525633a;
        if (!aVar.b(o6Var) || (a17 = aVar.a(c8Var.f158571b)) == null) {
            return fVar2;
        }
        mi1.b0 b0Var = c8Var.f158570a;
        if (b0Var == null || b0Var.f408049e != a17.f156354z.b()) {
            mi1.b0 b0Var2 = c8Var.f158570a;
            if (b0Var2 != null && (hVar = b0Var2.f408048d.N) != null) {
                hVar.c(b0Var2.f408050f);
            }
            c8Var.f158570a = new mi1.b0(c8Var.f158571b, a17.f156354z.b());
        }
        return c8Var.f158570a;
    }

    public final mi1.h c() {
        mi1.h hVar = this.f408236b;
        if (hVar != null) {
            return hVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("capsuleBarContainerLayout");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12762x8fe39d2d d() {
        mi1.i iVar = this.f408237c;
        if (iVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("capsuleBarView");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12762x8fe39d2d m147349x6d6c1ef1 = iVar.m147349x6d6c1ef1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m147349x6d6c1ef1, "getOptionBtn(...)");
        return m147349x6d6c1ef1;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32 e() {
        if (this.f408247m == null) {
            this.f408247m = new mi1.q(this);
            mi1.i iVar = this.f408237c;
            if (iVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("capsuleBarView");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32 m147350x764ff7e2 = iVar.m147350x764ff7e2();
            al1.a0 a0Var = this.f408247m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a0Var);
            m147350x764ff7e2.m53346x3ccd291b(a0Var);
        }
        mi1.i iVar2 = this.f408237c;
        if (iVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("capsuleBarView");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32 m147350x764ff7e22 = iVar2.m147350x764ff7e2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m147350x764ff7e22, "getTranslateLayout(...)");
        return m147350x764ff7e22;
    }

    public final void g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 page, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f408246l;
        mi1.m mVar = this.f408245k;
        if (v5Var != null) {
            mVar.getClass();
            mi1.l lVar = (mi1.l) mVar.f408149a.get(v5Var.hashCode(), null);
            if (lVar != null) {
                lVar.r();
            }
        }
        this.f408246l = page;
        mVar.getClass();
        android.util.SparseArray sparseArray = mVar.f408149a;
        mi1.l lVar2 = (mi1.l) sparseArray.get(page.hashCode(), null);
        if (lVar2 == null) {
            lVar2 = new mi1.l(mVar.f408150b, page);
            sparseArray.put(page.hashCode(), lVar2);
        }
        lVar2.f408141h = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var2 = lVar2.f408137d;
        xi1.m C1 = v5Var2.C1();
        if (C1 != null && C1.c()) {
            lVar2.o();
        } else {
            lVar2.p();
        }
        xi1.m C12 = v5Var2.C1();
        if (C12 != null) {
            C12.d(lVar2);
        }
        mi1.i iVar = lVar2.f408142i.f408237c;
        if (iVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("capsuleBarView");
            throw null;
        }
        iVar.addOnLayoutChangeListener(lVar2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12501xc5d62fec m2209x716f693c = v5Var2.r1().m2209x716f693c();
        android.view.ViewParent parent = m2209x716f693c != null ? m2209x716f693c.getParent() : null;
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            view.addOnLayoutChangeListener(lVar2);
        }
        v5Var2.r1().addOnLayoutChangeListener(lVar2);
        lVar2.d(lVar2.f408139f);
        lVar2.e(((mi1.l2) ((jz5.n) lVar2.f408140g).mo141623x754a37bb()).f408147d);
        lVar2.k(lVar2.f408138e);
        lVar2.q();
    }

    public final void h(int i17) {
        android.view.View view;
        int childCount = c().getChildCount();
        int i18 = 0;
        while (true) {
            if (i18 >= childCount) {
                view = null;
                break;
            }
            view = c().getChildAt(i18);
            if (view.getId() == i17) {
                break;
            } else {
                i18++;
            }
        }
        c().removeView(view);
    }

    public final void i(android.content.Context newBase) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newBase, "newBase");
        mi1.h c17 = c();
        if (c17.getContext() instanceof android.content.MutableContextWrapper) {
            if (c17.f408096w > 0) {
                c17.m172250xf161ffec(!(newBase instanceof android.app.Activity));
            } else {
                c17.m172250xf161ffec(false);
            }
            ((android.content.MutableContextWrapper) c17.getContext()).setBaseContext(newBase);
        }
    }

    public final void j() {
        if (this.f408236b != null) {
            c().setVisibility(this.f408242h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandCapsuleBarManager", "restoreCapsuleBarVisibility, savedCapsuleBarContainerLayoutVisibility=" + this.f408242h);
        }
    }

    public final void k() {
        if (this.f408236b != null) {
            this.f408242h = c().getVisibility();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandCapsuleBarManager", "saveCapsuleBarVisibility, savedCapsuleBarContainerLayoutVisibility=" + this.f408242h);
        }
    }

    public final void l() {
        mi1.i iVar = this.f408237c;
        if (iVar != null) {
            if (iVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("capsuleBarView");
                throw null;
            }
            iVar.f408114u = false;
            int i17 = iVar.f408105i;
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = iVar.f408108o;
            if (i17 == -1) {
                c1073x7e08a787.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562320cl);
            } else {
                c1073x7e08a787.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562321cm);
            }
        }
    }

    public final void m() {
        mi1.i iVar = this.f408237c;
        if (iVar != null) {
            if (iVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("capsuleBarView");
                throw null;
            }
            iVar.f408114u = true;
            int i17 = iVar.f408105i;
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = iVar.f408108o;
            if (i17 == -1) {
                c1073x7e08a787.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562306yk);
            } else {
                c1073x7e08a787.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aen);
            }
        }
    }
}
