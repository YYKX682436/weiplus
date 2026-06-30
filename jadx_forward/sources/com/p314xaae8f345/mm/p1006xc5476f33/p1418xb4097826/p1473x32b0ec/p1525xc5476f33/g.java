package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public abstract class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f194145p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f194146q;

    /* renamed from: r, reason: collision with root package name */
    public int f194147r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nc f194148s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f194149t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f194150u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.view.ViewGroup vg6, qo0.c liveStatus) {
        super(vg6, liveStatus, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vg6, "vg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveStatus, "liveStatus");
        this.f194145p = kz5.c1.i(new jz5.l(16, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79903xc853ce0e)), new jz5.l(10, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79176x608e1841)), new jz5.l(12, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79858xd45c1c24)), new jz5.l(11, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79749x69d051ec)), new jz5.l(6, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79892x630439a8)), new jz5.l(2, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80154x99185005)), new jz5.l(7, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79550x381078bd)), new jz5.l(3, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79785xfa6becc6)), new jz5.l(5, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79303x9c11008)), new jz5.l(4, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79176x608e1841)), new jz5.l(1, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79933xc8545cb0)), new jz5.l(8, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79782x4631e22a)));
        this.f194146q = kz5.c1.i(new jz5.l(16, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79903xc853ce0e)), new jz5.l(10, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79176x608e1841)), new jz5.l(12, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79858xd45c1c24)), new jz5.l(11, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79749x69d051ec)), new jz5.l(17, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79948x34afe7d4)), new jz5.l(6, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79892x630439a8)), new jz5.l(2, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80154x99185005)), new jz5.l(15, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79175x4357406f)), new jz5.l(20, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79902x4225bfc7)), new jz5.l(14, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79655x5636c5e6)));
        int parseColor = android.graphics.Color.parseColor("#66404040");
        this.f194147r = parseColor;
        this.f194148s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nc(parseColor);
        this.f194149t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b(this));
        this.f194150u = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f(this));
    }

    public final void A1(r45.vm1 data, java.lang.Object file, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(file, "file");
        if (data.m75939xb282bd08(1) == 1) {
            java.lang.String m154733x346425 = file instanceof org.p3363xbe4143f1.C29690xfae77312 ? ((org.p3363xbe4143f1.C29690xfae77312) file).m154733x346425() : file instanceof com.p314xaae8f345.mm.rfx.C20942x379cf5ee ? ((com.p314xaae8f345.mm.rfx.C20942x379cf5ee) file).m77406x346425() : "";
            xt2.m t17 = t1(data.m75939xb282bd08(0));
            if (t17 != null) {
                java.lang.String m75945x2fec8307 = data.m75945x2fec8307(2);
                t17.f538411g = m154733x346425;
                t17.f538412h = m75945x2fec8307;
            }
            if (z17) {
                ((mm2.c1) P0(mm2.c1.class)).f410359j4.put(java.lang.Integer.valueOf(data.m75939xb282bd08(0)), new jz5.l(data, file));
            }
        }
    }

    public final java.lang.String B1(java.lang.String rgba) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rgba, "rgba");
        char charAt = rgba.charAt(0);
        java.lang.String substring = rgba.substring(1, 3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        java.lang.String substring2 = rgba.substring(3, 5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        java.lang.String substring3 = rgba.substring(5, 7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
        java.lang.String substring4 = rgba.substring(7, 9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring4, "substring(...)");
        return charAt + substring4 + substring + substring2 + substring3;
    }

    public final xt2.m t1(int i17) {
        java.lang.Object obj = u1().get(java.lang.Integer.valueOf(i17));
        if (obj instanceof xt2.m) {
            return (xt2.m) obj;
        }
        return null;
    }

    public final java.util.HashMap u1() {
        return (java.util.HashMap) ((jz5.n) this.f194149t).mo141623x754a37bb();
    }

    public abstract java.util.HashMap v1();

    public final java.lang.String w1(int i17) {
        java.lang.Object obj = u1().get(java.lang.Integer.valueOf(i17));
        xt2.m mVar = obj instanceof xt2.m ? (xt2.m) obj : null;
        if (mVar == null || mVar.m().getVisibility() != 0) {
            return null;
        }
        return mVar.f538412h;
    }

    public final boolean x1() {
        if (((mm2.c1) P0(mm2.c1.class)).R7()) {
            return this.f446856d.getContext().getResources().getConfiguration().orientation == 1;
        }
        return false;
    }

    public final boolean y1() {
        xh2.c cVar = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.mo3195x754a37bb();
        if (cVar != null) {
            return (this.f446856d.getContext().getResources().getConfiguration().orientation == 1) && cVar.f536064a.size() > 1 && cVar.f536065b.height() < ((java.lang.Number) ((jz5.n) this.f194150u).mo141623x754a37bb()).intValue();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        java.util.Collection<xt2.m6> values = u1().values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (xt2.m6 m6Var : values) {
            xt2.m mVar = m6Var instanceof xt2.m ? (xt2.m) m6Var : null;
            if (mVar != null) {
                mVar.q();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z1(int i17) {
        java.lang.String str;
        int color;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jc jcVar;
        xt2.m6 m6Var = (xt2.m6) u1().get(java.lang.Integer.valueOf(i17));
        if (m6Var == 0) {
            return;
        }
        android.view.View view = m6Var instanceof android.view.View ? (android.view.View) m6Var : null;
        if (view == null && (view = m6Var.f()) == null) {
            view = m6Var.j();
        }
        android.view.View view2 = view;
        android.view.View f17 = m6Var.f();
        if (view2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ic icVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ic(0.0f, 0.0f, 0.0f, 0L, 15, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hc hcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hc(0, 0, 3, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nc ncVar = this.f194148s;
            ncVar.getClass();
            try {
                int i18 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveButtonEnhanceInteractionAnimator", "Starting enhance interaction animation for buttonType: " + i17, null);
                android.view.ViewParent parent = view2.getParent();
                while (parent instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                    parent = viewGroup.getParent();
                }
                android.graphics.drawable.Drawable background = f17 != null ? f17.getBackground() : null;
                color = background instanceof android.graphics.drawable.ColorDrawable ? ((android.graphics.drawable.ColorDrawable) background).getColor() : ncVar.f195141a;
                jcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jc(view2.getScaleX(), view2.getScaleY(), background, color);
                str = "FinderLiveButtonEnhanceInteractionAnimator";
            } catch (java.lang.Exception e17) {
                e = e17;
                str = "FinderLiveButtonEnhanceInteractionAnimator";
            }
            try {
                android.animation.AnimatorSet c17 = ncVar.c(view2, f17, jcVar, icVar, hcVar);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                ncVar.d(f17, color);
                c17.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lc(ncVar, view2, f17, jcVar, i17, dVar, eVar));
                c17.start();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Animation started successfully for buttonType: " + i17, null);
            } catch (java.lang.Exception e18) {
                e = e18;
                int i19 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "Error starting enhance interaction animation: " + e.getMessage(), e);
                eVar.mo152xb9724478();
            }
        }
    }
}
