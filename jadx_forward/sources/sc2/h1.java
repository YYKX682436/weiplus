package sc2;

/* loaded from: classes2.dex */
public final class h1 extends ad2.h {
    public p3325xe03a0797.p3326xc267989b.r2 B;
    public boolean D;
    public boolean E;
    public boolean F;
    public android.view.ViewGroup G;
    public android.view.ViewGroup H;
    public android.widget.FrameLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.ViewGroup f487457J;
    public android.widget.TextView K;
    public android.widget.TextView L;
    public android.widget.TextView M;
    public android.widget.ImageView N;
    public android.widget.TextView P;
    public android.widget.TextView Q;
    public android.view.View R;
    public android.view.View S;
    public android.view.View T;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5 U;
    public android.view.View V;
    public android.view.View W;
    public android.view.View X;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f Y;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 Z;

    /* renamed from: l1, reason: collision with root package name */
    public fc2.d f487458l1;

    /* renamed from: p1, reason: collision with root package name */
    public fc2.d f487460p1;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f487462x;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f487463x0;

    /* renamed from: x1, reason: collision with root package name */
    public long f487464x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.animation.AnimatorSet f487466y0;

    /* renamed from: y1, reason: collision with root package name */
    public long f487467y1;

    /* renamed from: z1, reason: collision with root package name */
    public long f487469z1;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f487461w = "Finder.CrossPlatformCardJumperObserver";

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f487465y = jz5.h.b(sc2.h0.f487456d);

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f487468z = jz5.h.b(sc2.g0.f487431d);
    public final jz5.g A = jz5.h.b(sc2.a1.f487275d);
    public long C = 3000;

    /* renamed from: p0, reason: collision with root package name */
    public final java.util.HashMap f487459p0 = new java.util.HashMap();
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g3 A1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g3.f206578e;

    public static final void G(sc2.h1 h1Var) {
        android.view.View view = h1Var.S;
        android.view.View view2 = h1Var.T;
        if (view == null || view2 == null) {
            return;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr);
        view2.getLocationInWindow(iArr2);
        boolean z17 = false;
        int width = (iArr[0] - iArr2[0]) - (view2.getWidth() / 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 s2Var = h1Var.Z;
        if (s2Var != null && s2Var.isShowing()) {
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 s2Var2 = h1Var.Z;
            if (s2Var2 != null) {
                s2Var2.f214542q = width;
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 s2Var3 = h1Var.Z;
        if (s2Var3 != null) {
            s2Var3.f214542q = width;
            android.view.View findViewById = s2Var3.getContentView().findViewById(com.p314xaae8f345.mm.R.id.a4x);
            android.view.View findViewById2 = s2Var3.getContentView().findViewById(com.p314xaae8f345.mm.R.id.a4q);
            int measuredWidth = (view2.getMeasuredWidth() - findViewById.getMeasuredWidth()) / 2;
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.rightMargin = measuredWidth - width;
            } else {
                marginLayoutParams2 = null;
            }
            findViewById.setLayoutParams(marginLayoutParams2);
            if (findViewById2 != null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams3 != null) {
                    marginLayoutParams3.rightMargin = measuredWidth - width;
                    marginLayoutParams = marginLayoutParams3;
                }
                findViewById2.setLayoutParams(marginLayoutParams);
            }
            findViewById.requestLayout();
            if (findViewById2 != null) {
                findViewById2.requestLayout();
            }
        }
    }

    public static final java.util.Map H(sc2.h1 h1Var, in5.s0 s0Var) {
        java.lang.String str;
        r45.vt0 vt0Var;
        java.lang.String m75945x2fec8307;
        r45.vt0 vt0Var2;
        h1Var.getClass();
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        r45.wt0 wt0Var = (r45.wt0) ((xc2.k0) pf5.u.f435469a.e(zy2.b6.class).a(xc2.k0.class)).Z6(h1Var.f84678f).mo3195x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = h1Var.Y;
        zy2.g5 videoView = c15196x85976f5f != null ? c15196x85976f5f.getVideoView() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(h1Var.f84678f));
        lVarArr[1] = new jz5.l("session_buffer", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(h1Var.f84678f, h1Var.f84679g, V6 != null ? V6.m75939xb282bd08(5) : 0));
        java.lang.String str2 = "";
        if (wt0Var == null || (vt0Var2 = (r45.vt0) wt0Var.m75936x14adae67(0)) == null || (str = vt0Var2.m75945x2fec8307(2)) == null) {
            str = "";
        }
        lVarArr[2] = new jz5.l("report_extra_data", str);
        lVarArr[3] = new jz5.l("videodurations", java.lang.Integer.valueOf(c15188xd8bd4bd != null ? c15188xd8bd4bd.mo56694x36bbd779() : 0));
        lVarArr[4] = new jz5.l("ad_play_time", java.lang.Long.valueOf(h1Var.f487469z1));
        lVarArr[5] = new jz5.l("ad_show_playtime", java.lang.Long.valueOf(c15188xd8bd4bd != null ? c15188xd8bd4bd.mo56685x3d7f3f1d() : 0L));
        if (wt0Var != null && (vt0Var = (r45.vt0) wt0Var.m75936x14adae67(0)) != null && (m75945x2fec8307 = vt0Var.m75945x2fec8307(7)) != null) {
            str2 = m75945x2fec8307;
        }
        lVarArr[6] = new jz5.l("ad_pos_id", str2);
        lVarArr[7] = new jz5.l("video_total_time", java.lang.Long.valueOf(h1Var.f487467y1));
        return kz5.c1.k(lVarArr);
    }

    public static final void I(sc2.h1 h1Var, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f3 f3Var) {
        h1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        android.content.Context context = s0Var.f374654e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k3 L = h1Var.L();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.h3 h3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.h3.f206595e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i3 i3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i3.f206606f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o3Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Uk(o3Var, context, L, i3Var, h3Var, f3Var, null, 32, null);
    }

    @Override // ad2.h
    public void C(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487461w, "onViewRecycled, hideCard");
        xc2.p0 p0Var = this.f84680h;
        P(holder, false, true, p0Var != null ? N(p0Var) : null);
        super.C(holder);
    }

    public final void J(in5.s0 s0Var) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.B;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        R(s0Var);
        android.view.ViewGroup viewGroup = this.H;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        fc2.d dVar = this.f487460p1;
        if (dVar != null) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.Object a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
            if (n17 != null) {
                n17.d(dVar);
            }
            this.f487460p1 = null;
        }
    }

    public final void K(android.view.View view, int i17) {
        float f17 = i17 == 0 ? 0.0f : 1.0f;
        float f18 = i17 == 0 ? 1.0f : 0.0f;
        java.util.HashMap hashMap = this.f487459p0;
        android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) hashMap.get(java.lang.Integer.valueOf(view.hashCode()));
        if (valueAnimator == null) {
            valueAnimator = new android.animation.ValueAnimator();
            hashMap.put(java.lang.Integer.valueOf(view.hashCode()), valueAnimator);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487461w, "alphaAnimators size: " + hashMap.size());
        }
        if (view.getVisibility() == i17) {
            return;
        }
        valueAnimator.cancel();
        valueAnimator.removeAllListeners();
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.setFloatValues(f17, f18);
        valueAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimator.setDuration(300L);
        valueAnimator.addUpdateListener(new sc2.t(view));
        valueAnimator.addListener(new sc2.u(view, f18, i17));
        valueAnimator.start();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k3 L() {
        r45.vt0 vt0Var;
        r45.vt0 vt0Var2;
        r45.wt0 wt0Var = (r45.wt0) ((xc2.k0) pf5.u.f435469a.e(zy2.b6.class).a(xc2.k0.class)).Z6(this.f84678f).mo3195x754a37bb();
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k3(this.f84678f, this.f84679g, java.lang.System.currentTimeMillis() - this.f487464x1, 1, this.f487469z1, this.f487467y1, (wt0Var == null || (vt0Var2 = (r45.vt0) wt0Var.m75936x14adae67(0)) == null) ? null : vt0Var2.m75945x2fec8307(2), (wt0Var == null || (vt0Var = (r45.vt0) wt0Var.m75936x14adae67(0)) == null) ? null : vt0Var.m75945x2fec8307(3));
    }

    public final so2.b M(in5.s0 s0Var, long j17) {
        so2.j5 j5Var = (so2.j5) s0Var.f374658i;
        if (!(j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
        if (abstractC14490x69736cb5.getAdCardState() == null) {
            abstractC14490x69736cb5.V0(new so2.b(j17, false, false, null, null, 30, null));
        }
        so2.b adCardState = abstractC14490x69736cb5.getAdCardState();
        boolean z17 = false;
        if (adCardState != null && adCardState.f491795a == j17) {
            z17 = true;
        }
        if (!z17) {
            abstractC14490x69736cb5.V0(new so2.b(j17, false, false, null, null, 30, null));
        }
        return abstractC14490x69736cb5.getAdCardState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final r45.t01 N(xc2.p0 p0Var) {
        r45.wf6 wf6Var;
        r45.wf6 wf6Var2 = this.f84682m;
        if (wf6Var2 == null) {
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = p0Var.f534767a.m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            java.util.Iterator it = m76521x7528c3fb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    wf6Var = 0;
                    break;
                }
                wf6Var = it.next();
                r45.wf6 wf6Var3 = (r45.wf6) wf6Var;
                boolean z17 = true;
                if (wf6Var3.m75939xb282bd08(1) != p0Var.f534789r || wf6Var3.m75939xb282bd08(2) != 28) {
                    z17 = false;
                }
                if (z17) {
                    break;
                }
            }
            wf6Var2 = wf6Var;
        }
        if (wf6Var2 != null) {
            return (r45.t01) wf6Var2.m75936x14adae67(34);
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 O(r45.t01 t01Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m76746xaf65a0fc = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725.m76746xaf65a0fc();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = t01Var.m75934xbce7f2f(10);
        if (m75934xbce7f2f != null) {
            m76746xaf65a0fc.mo11468x92b714fd(m75934xbce7f2f.g());
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m76746xaf65a0fc);
        return m76746xaf65a0fc;
    }

    public final void P(in5.s0 s0Var, boolean z17, boolean z18, r45.t01 t01Var) {
        so2.b M;
        if (t01Var != null) {
            so2.b M2 = M(s0Var, O(t01Var).m76784x5db1b11());
            if (z17 && M2 != null) {
                M2.f491796b = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f487462x;
            if (c15188xd8bd4bd != null) {
                long mo56685x3d7f3f1d = c15188xd8bd4bd.mo56685x3d7f3f1d();
                if (M2 != null) {
                    M2.f491798d = java.lang.Long.valueOf(mo56685x3d7f3f1d);
                }
            }
        }
        fc2.d dVar = this.f487458l1;
        if (dVar != null) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.Object a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
            if (n17 != null) {
                n17.d(dVar);
            }
            this.f487458l1 = null;
        }
        J(s0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = this.f487462x;
        if (c15188xd8bd4bd2 != null) {
            c15188xd8bd4bd2.d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd3 = this.f487462x;
        if (c15188xd8bd4bd3 != null) {
            c15188xd8bd4bd3.b();
        }
        this.f487462x = null;
        android.widget.FrameLayout frameLayout = this.I;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        android.content.Context context2 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((ey2.k1) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(ey2.k1.class)).f338951e.remove(java.lang.Long.valueOf(this.f84678f));
        this.Z = null;
        android.view.ViewGroup viewGroup = this.H;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ym5.a1.f(new sc2.s(this));
        this.E = false;
        this.F = false;
        xc2.p0 p0Var = this.f84680h;
        sc2.q8 q8Var = p0Var != null ? p0Var.f534766J : null;
        if (q8Var != null) {
            q8Var.f487710a = false;
        }
        android.content.Context context3 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.class);
        if (ptVar != null) {
            ptVar.f217158z = false;
        }
        android.app.Activity activity = context3 instanceof android.app.Activity ? (android.app.Activity) context3 : null;
        if (activity != null) {
            activity.setRequestedOrientation(-1);
        }
        if (z18) {
            Q();
            if (t01Var != null && (M = M(s0Var, O(t01Var).m76784x5db1b11())) != null) {
                M.f491797c = true;
            }
            android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.jdk);
            android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.g1y);
            android.view.View p19 = s0Var.p(com.p314xaae8f345.mm.R.id.edq);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 c15175x44dff2e9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9) s0Var.p(com.p314xaae8f345.mm.R.id.f566429qk3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 fullSeekBarLayout = c15175x44dff2e9 != null ? c15175x44dff2e9.getFullSeekBarLayout() : null;
            if (fullSeekBarLayout != null) {
                fullSeekBarLayout.m61290xc6ccf75e(false);
            }
            if (p17 != null) {
                K(p17, 0);
            }
            if (p18 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "showOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "showOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p19 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p19, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "showOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "showOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.Y;
            if (c15196x85976f5f != null) {
                c15196x85976f5f.m61504xc6cbb41a(false);
            }
            java.lang.String str = this.f487461w;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "requestNotPlay set false");
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f2 = this.Y;
                cw2.da videoView = c15196x85976f5f2 != null ? c15196x85976f5f2.getVideoView() : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd4 = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
                if (c15188xd8bd4bd4 != null) {
                    c15188xd8bd4bd4.mo56716x4121a19(true);
                    zy2.g5.u(c15188xd8bd4bd4, null, 1, null);
                }
            }
            android.view.View view = s0Var.f3639x46306858;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971) view : null;
            if (c15379x1d4ea971 != null) {
                c15379x1d4ea971.a(false, str);
            }
            android.view.ViewGroup viewGroup2 = this.G;
            if (viewGroup2 != null) {
                K(viewGroup2, 8);
            }
        }
    }

    public final void Q() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487461w, "hideCardAndToastLayout");
        android.view.ViewGroup viewGroup = this.G;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        android.view.ViewGroup viewGroup2 = this.H;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setVisibility(8);
    }

    public final void R(in5.s0 s0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487461w, "resetShowCardCountdown");
        this.C = 3000L;
        this.D = false;
        this.B = null;
        fc2.d dVar = this.f487460p1;
        if (dVar != null) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.Object a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
            if (n17 != null) {
                n17.d(dVar);
            }
            this.f487460p1 = null;
        }
    }

    public final void S(in5.s0 s0Var, android.view.View view, xc2.p0 p0Var) {
        java.lang.String str = this.f487461w;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showAfterFooterLayoutReady");
        r45.t01 N = N(p0Var);
        if (N == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "showAfterFooterLayoutReady, cardStyle is null");
            return;
        }
        sc2.q8 q8Var = p0Var.f534766J;
        if (q8Var != null) {
            q8Var.f487710a = true;
        }
        pm0.v.X(new sc2.j0(s0Var, this, N));
    }

    @Override // ad2.h, ad2.k
    public void c(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487461w, "no need super.onRealShow,CrossPlatformCardJumper show control by self");
    }

    @Override // ad2.h, ad2.k
    public void d(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487461w, "no need super.onRealHide, CrossPlatformCardJumper show control by self");
        P(holder, false, true, N(infoEx));
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487461w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        return N(infoEx) != null;
    }

    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        char c17;
        int i17;
        int i18;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        this.G = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.t1t);
        this.H = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.tdl);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.p314xaae8f345.mm.R.id.f565527t20);
        if (frameLayout == null) {
            return;
        }
        this.I = frameLayout;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.t1q);
        if (viewGroup == null) {
            return;
        }
        this.f487457J = viewGroup;
        this.K = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.t1u);
        this.L = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.t28);
        this.M = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565528t21);
        this.N = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.t1r);
        this.P = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.t27);
        this.Q = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.t1y);
        this.R = holder.p(com.p314xaae8f345.mm.R.id.f565531t24);
        this.S = holder.p(com.p314xaae8f345.mm.R.id.f565532t25);
        this.T = holder.p(com.p314xaae8f345.mm.R.id.t1x);
        this.U = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5) holder.p(com.p314xaae8f345.mm.R.id.f565530t23);
        this.V = holder.p(com.p314xaae8f345.mm.R.id.t1v);
        this.W = holder.p(com.p314xaae8f345.mm.R.id.t1s);
        this.X = holder.p(com.p314xaae8f345.mm.R.id.t1z);
        this.f487463x0 = holder.p(com.p314xaae8f345.mm.R.id.f565529t22);
        this.Y = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k);
        this.f487464x1 = 0L;
        this.f487467y1 = 0L;
        this.f487469z1 = 0L;
        this.A1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g3.f206578e;
        sc2.q8 q8Var = infoEx.f534766J;
        if (!(q8Var != null && q8Var.f487710a)) {
            Q();
        }
        r45.t01 N = N(infoEx);
        if (N == null) {
            return;
        }
        so2.b M = M(holder, O(N).m76784x5db1b11());
        if (M != null && M.f491796b) {
            return;
        }
        android.view.ViewGroup viewGroup2 = this.f487457J;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
        android.content.Context context = holder.f374654e;
        if (layoutParams != null) {
            layoutParams.width = (int) java.lang.Math.min(((java.lang.Number) ((jz5.n) this.f487465y).mo141623x754a37bb()).intValue() - context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7), context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561245an5));
        }
        android.widget.TextView textView = this.Q;
        if (textView != null) {
            textView.setText(N.m75945x2fec8307(3));
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
            gradientDrawable.setColor(android.graphics.Color.parseColor(N.m75945x2fec8307(4)));
            textView.setBackground(gradientDrawable);
            textView.setTextColor(android.graphics.Color.parseColor(N.m75945x2fec8307(5)));
            textView.setOnClickListener(new sc2.v(holder, infoEx, this));
        }
        android.view.View view2 = this.V;
        if (view2 != null) {
            view2.setOnClickListener(new sc2.w(holder, infoEx, this));
        }
        android.widget.TextView textView2 = this.L;
        if (textView2 != null) {
            textView2.setText(N.m75945x2fec8307(2));
        }
        r45.f1 f1Var = (r45.f1) N.m75936x14adae67(8);
        if (f1Var != null) {
            android.widget.TextView textView3 = this.M;
            if (textView3 != null) {
                textView3.setText(f1Var.m75945x2fec8307(0));
            }
            android.widget.ImageView imageView = this.N;
            if (imageView != null) {
                mn2.g1 g1Var = mn2.g1.f411508a;
                g1Var.a().c(new mn2.n(f1Var.m75945x2fec8307(1), null, 2, null), imageView, g1Var.h(mn2.f1.f411490h));
            }
        }
        r45.wt0 wt0Var = (r45.wt0) ((xc2.k0) pf5.u.f435469a.e(zy2.b6.class).a(xc2.k0.class)).Z6(this.f84678f).mo3195x754a37bb();
        r45.vt0 vt0Var = wt0Var != null ? (r45.vt0) wt0Var.m75936x14adae67(0) : null;
        android.view.View view3 = this.R;
        android.view.View view4 = this.T;
        if (view3 == null || view4 == null) {
            c17 = 2;
            i17 = 8;
            i18 = com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl;
        } else {
            i17 = 8;
            c17 = 2;
            i18 = com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl;
            view3.setOnClickListener(new sc2.z(holder, this, vt0Var, view4, view3, N));
            hc2.v0.e(view3, "ad_feedback_button", 8, 0, false, false, null, new sc2.a0(this, holder), 60, null);
        }
        android.view.View view5 = this.T;
        if (view5 != null) {
            view5.addOnLayoutChangeListener(new sc2.b0(this));
        }
        int dimension = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5 c15179x385a9ce5 = this.U;
        if (c15179x385a9ce5 != null && (view = c15179x385a9ce5.f212103p0) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderHorizontalLongVideoPlayerSeekBar", "hidePoint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/FinderHorizontalLongVideoPlayerSeekBar", "hidePoint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5 c15179x385a9ce52 = this.U;
        if (c15179x385a9ce52 != null) {
            android.view.View view6 = c15179x385a9ce52.f244005e;
            android.view.ViewGroup.LayoutParams layoutParams2 = view6 != null ? view6.getLayoutParams() : null;
            if (layoutParams2 != null) {
                layoutParams2.height = dimension;
            }
            android.view.View view7 = c15179x385a9ce52.f212104x0;
            android.view.ViewGroup.LayoutParams layoutParams3 = view7 != null ? view7.getLayoutParams() : null;
            if (layoutParams3 != null) {
                layoutParams3.height = dimension;
            }
            android.view.View view8 = c15179x385a9ce52.f212105y0;
            android.view.ViewGroup.LayoutParams layoutParams4 = view8 != null ? view8.getLayoutParams() : null;
            if (layoutParams4 != null) {
                layoutParams4.height = dimension;
            }
            android.view.View view9 = c15179x385a9ce52.f212102l1;
            android.view.ViewGroup.LayoutParams layoutParams5 = view9 != null ? view9.getLayoutParams() : null;
            if (layoutParams5 != null) {
                layoutParams5.height = dimension;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5 c15179x385a9ce53 = this.U;
        if (c15179x385a9ce53 != null) {
            android.view.View view10 = c15179x385a9ce53.f212104x0;
            android.view.ViewGroup.LayoutParams layoutParams6 = view10 != null ? view10.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams7 = layoutParams6 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams6 : null;
            if (layoutParams7 != null) {
                layoutParams7.setMargins(0, 0, 0, 0);
            }
            android.view.View view11 = c15179x385a9ce53.f212105y0;
            android.view.ViewGroup.LayoutParams layoutParams8 = view11 != null ? view11.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams9 = layoutParams8 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams8 : null;
            if (layoutParams9 != null) {
                layoutParams9.setMargins(0, 0, 0, 0);
            }
            android.view.View view12 = c15179x385a9ce53.f212102l1;
            android.view.ViewGroup.LayoutParams layoutParams10 = view12 != null ? view12.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams11 = layoutParams10 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams10 : null;
            if (layoutParams11 != null) {
                layoutParams11.setMargins(0, 0, 0, 0);
            }
        }
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(0);
        float dimension2 = context.getResources().getDimension(i18);
        float[] fArr = new float[i17];
        fArr[0] = dimension2;
        fArr[1] = dimension2;
        fArr[c17] = dimension2;
        fArr[3] = dimension2;
        fArr[4] = dimension2;
        fArr[5] = dimension2;
        fArr[6] = dimension2;
        fArr[7] = dimension2;
        gradientDrawable2.setCornerRadii(fArr);
        gradientDrawable2.setColor(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77667x8113c229));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5 c15179x385a9ce54 = this.U;
        android.view.View findViewById = c15179x385a9ce54 != null ? c15179x385a9ce54.findViewById(com.p314xaae8f345.mm.R.id.kxi) : null;
        if (findViewById != null) {
            findViewById.setBackground(gradientDrawable2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5 c15179x385a9ce55 = this.U;
        android.view.View findViewById2 = c15179x385a9ce55 != null ? c15179x385a9ce55.findViewById(com.p314xaae8f345.mm.R.id.kxk) : null;
        if (findViewById2 == null) {
            return;
        }
        findViewById2.setBackground(gradientDrawable2);
    }

    @Override // ad2.h
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
    }

    @Override // ad2.h
    public void v(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.v(holder, jumpView, infoEx);
        r45.t01 N = N(infoEx);
        jz5.f0 f0Var = null;
        if (N == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f487461w, "cardStyle is null, return");
            P(holder, false, true, null);
            return;
        }
        so2.b M = M(holder, O(N).m76784x5db1b11());
        if (M != null && M.f491796b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487461w, "isClosed == true");
            P(holder, false, true, null);
            return;
        }
        if (this.E && (c15188xd8bd4bd = this.f487462x) != null) {
            if (!(c15188xd8bd4bd != null && c15188xd8bd4bd.getCurrentPlayState() == 11)) {
                if (!this.F) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = this.f487462x;
                    if (c15188xd8bd4bd2 != null) {
                        c15188xd8bd4bd2.mo58789x348b34();
                    }
                    android.view.View view = this.f487463x0;
                    if (view != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "onJumpViewFocus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "onJumpViewFocus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487461w, "isCurrentCardShown is true, return");
                return;
            }
        }
        this.E = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487461w, "before showCard");
        if (M != null && M.f491797c) {
            Q();
        }
        android.view.ViewGroup viewGroup = this.f487457J;
        if (viewGroup != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(viewGroup, "cardLayout");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Vj(viewGroup, 160, new sc2.c0(viewGroup, this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.Y;
        cw2.da videoView = c15196x85976f5f != null ? c15196x85976f5f.getVideoView() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd3 = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
        java.lang.Long l17 = M != null ? M.f491798d : null;
        if (l17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487461w, "has shown, lastPlayOffset: " + l17);
            if (c15188xd8bd4bd3 != null) {
                boolean z17 = c15188xd8bd4bd3.f212198r;
                jz5.f0 f0Var2 = jz5.f0.f384359a;
                if (z17) {
                    S(holder, jumpView, infoEx);
                } else {
                    sc2.d0 d0Var = new sc2.d0(holder, this, jumpView, infoEx);
                    this.f487458l1 = d0Var;
                    android.content.Context context = holder.f374654e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    java.lang.Object a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                    fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
                    if (n17 != null) {
                        n17.a(d0Var);
                    }
                }
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                S(holder, jumpView, infoEx);
                return;
            }
            return;
        }
        Q();
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.S5).mo141623x754a37bb()).r()).intValue();
        if (intValue == -1) {
            intValue = N.m75939xb282bd08(14);
        }
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        int intValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.T5).mo141623x754a37bb()).r()).intValue();
        if (intValue2 == -1) {
            intValue2 = (int) (N.m75939xb282bd08(17) / 1000);
        }
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        int intValue3 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.U5).mo141623x754a37bb()).r()).intValue();
        if (intValue3 == -1) {
            intValue3 = N.m75939xb282bd08(16);
        }
        int i17 = intValue3;
        android.content.Context context2 = holder.f374654e;
        android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = activity != null ? (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) activity.findViewById(com.p314xaae8f345.mm.R.id.m6e) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487461w, "add OnPlayInfoUpdateListener");
        android.content.Context context3 = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ey2.k1 k1Var = (ey2.k1) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(ey2.k1.class);
        long j17 = this.f84678f;
        sc2.f0 f0Var3 = new sc2.f0(this, holder, intValue, intValue2, N, i17, c22801x87cbdc00, jumpView, infoEx);
        k1Var.getClass();
        k1Var.f338951e.put(java.lang.Long.valueOf(j17), f0Var3);
    }

    @Override // ad2.h
    public void w(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.w(holder, jumpView, infoEx);
        P(holder, false, false, N(infoEx));
    }
}
