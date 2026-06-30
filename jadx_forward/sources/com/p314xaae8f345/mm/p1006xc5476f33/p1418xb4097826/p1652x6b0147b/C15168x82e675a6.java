package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b;

/* renamed from: com.tencent.mm.plugin.finder.video.FinderAudioVolumeController */
/* loaded from: classes10.dex */
public final class C15168x82e675a6 extends pf5.o0 {

    /* renamed from: x, reason: collision with root package name */
    public static float f212024x;

    /* renamed from: y, reason: collision with root package name */
    public static float f212025y;

    /* renamed from: z, reason: collision with root package name */
    public static float f212026z;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f212027e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.BroadcastReceiver f212028f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.ValueAnimator f212029g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f212030h;

    /* renamed from: i, reason: collision with root package name */
    public float f212031i;

    /* renamed from: m, reason: collision with root package name */
    public float f212032m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f212033n = "";

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15171xdb7d4740 f212034o;

    /* renamed from: p, reason: collision with root package name */
    public float f212035p;

    /* renamed from: q, reason: collision with root package name */
    public float f212036q;

    /* renamed from: r, reason: collision with root package name */
    public float f212037r;

    /* renamed from: s, reason: collision with root package name */
    public float f212038s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f212039t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f212040u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.WindowManager f212041v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f212042w;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.video.FinderAudioVolumeController$volumeKeyEvent$1] */
    public C15168x82e675a6() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f212034o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5549xe5c7d69b>(a0Var) { // from class: com.tencent.mm.plugin.finder.video.FinderAudioVolumeController$volumeKeyEvent$1
            {
                this.f39173x3fe91575 = -635004757;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5549xe5c7d69b c5549xe5c7d69b) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5549xe5c7d69b event = c5549xe5c7d69b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                int i17 = event.f135872g.f89426a;
                return true;
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f212035p = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Xd).mo141623x754a37bb()).r()).floatValue();
        this.f212036q = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Zd).mo141623x754a37bb()).r()).floatValue();
    }

    public static final java.util.Map T6(float f17, float f18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15168x82e675a6 c15168x82e675a6, r45.qt2 qt2Var) {
        cw2.wa f206430p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        jz5.l[] lVarArr = new jz5.l[7];
        int i17 = 0;
        lVarArr[0] = new jz5.l("finder_tab_context_id", qt2Var.m75945x2fec8307(2));
        lVarArr[1] = new jz5.l("finder_context_id", qt2Var.m75945x2fec8307(1));
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)));
        lVarArr[3] = new jz5.l("before_adjust_volume", java.lang.Float.valueOf(f17));
        lVarArr[4] = new jz5.l("after_adjust_volume", java.lang.Float.valueOf(f18));
        android.animation.ValueAnimator valueAnimator = c15168x82e675a6.f212029g;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            i17 = 1;
        }
        lVarArr[5] = new jz5.l("if_volume_regular_increase", java.lang.Integer.valueOf(i17));
        cw2.da S6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0) pf5.u.f435469a.e(zy2.b6.class).c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0.class))).S6(c15168x82e675a6.f212027e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = S6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) S6 : null;
        lVarArr[6] = new jz5.l("feed_id", pm0.v.u((c15188xd8bd4bd == null || (f206430p = c15188xd8bd4bd.getF206430p()) == null || (c14989xf862ae88 = f206430p.f305632f) == null) ? 0L : c14989xf862ae88.m59124x87980ca()));
        return kz5.c1.k(lVarArr);
    }

    public final float N6(float f17, float f18) {
        if (f17 < f18) {
            return 1.0f;
        }
        return (float) java.lang.Math.pow(10.0f, (-((f17 - f18) * 60.0f)) / 20);
    }

    public final boolean O6() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return z65.c.a() && (f212024x > 0.0f || f212025y > 0.0f || f212026z > 0.0f);
    }

    public final boolean P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Wd).mo141623x754a37bb()).r()).intValue() == 1;
    }

    public final boolean Q6() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a() && P6()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209138ae).mo141623x754a37bb()).r()).intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    public final void R6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!P6() || O6() || this.f212030h) {
            return;
        }
        float f17 = this.f212037r;
        if (f17 > 0.0f) {
            float f18 = this.f212035p;
            if (f18 <= 0.0f || f17 <= f18 || this.f212036q <= 0.0f) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Yd).mo141623x754a37bb()).r()).intValue() == 1) {
                float N6 = N6(this.f212037r, this.f212035p);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAudioVolumeController", "onFirstEnterFeedFirstFrame percent:" + this.f212037r + " threshold:" + this.f212035p + " speed:" + this.f212036q + " audioGain:" + N6);
                float f19 = (((float) 1000) * (this.f212037r - this.f212035p)) / this.f212036q;
                if (f19 <= 0.0f) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAudioVolumeController", "animateChangeVolume " + N6 + "  1.0  durationMs:" + f19);
                android.animation.ValueAnimator valueAnimator = this.f212029g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(N6, 1.0f);
                this.f212029g = ofFloat;
                if (ofFloat != null) {
                    ofFloat.setDuration(f19);
                }
                android.animation.ValueAnimator valueAnimator2 = this.f212029g;
                if (valueAnimator2 != null) {
                    valueAnimator2.setInterpolator(new android.view.animation.LinearInterpolator());
                }
                android.animation.ValueAnimator valueAnimator3 = this.f212029g;
                if (valueAnimator3 != null) {
                    valueAnimator3.addUpdateListener(new cw2.r(this, N6, context));
                }
                android.animation.ValueAnimator valueAnimator4 = this.f212029g;
                if (valueAnimator4 != null) {
                    valueAnimator4.addListener(new cw2.p(this));
                }
                android.animation.ValueAnimator valueAnimator5 = this.f212029g;
                if (valueAnimator5 != null) {
                    valueAnimator5.addListener(new cw2.q(this, context));
                }
                android.animation.ValueAnimator valueAnimator6 = this.f212029g;
                if (valueAnimator6 != null) {
                    valueAnimator6.start();
                }
            }
        }
    }

    public final void S6(int i17, float f17, float f18) {
        android.content.Context context = this.f212027e;
        if (context != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            if (i17 == 24) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("turn_up_volume", null, T6(f17, f18, this, V6), 1, true);
            } else {
                if (i17 != 25) {
                    return;
                }
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("turn_down_volume", null, T6(f17, f18, this, V6), 1, true);
            }
        }
    }

    public final float U6(float f17) {
        return new java.math.BigDecimal(f17).setScale(2, java.math.RoundingMode.HALF_UP).floatValue();
    }

    public final void V6(java.lang.String str, float f17) {
        android.widget.TextView textView = this.f212042w;
        if (textView == null) {
            return;
        }
        textView.setText(str + '/' + U6(f17));
    }
}
