package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class g2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 f225944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f225945b;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 activityC16262x8382bfc0, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f225944a = activityC16262x8382bfc0;
        this.f225945b = h0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c
    public void a() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c
    public void b(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 activityC16262x8382bfc0 = this.f225944a;
        int i17 = (int) f17;
        int i18 = ((int) activityC16262x8382bfc0.f225891i) - i17;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        activityC16262x8382bfc0.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        activityC16262x8382bfc0.R6((android.view.View) this.f225945b.f391656d, i18 == displayMetrics.heightPixels);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 c16191xaf149588 = activityC16262x8382bfc0.f225894o.f224949m;
        if (c16191xaf149588 != null) {
            double d17 = activityC16262x8382bfc0.f225891i;
            int i19 = ((int) d17) - i17;
            int i27 = (int) d17;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("KEY_ACTION", 15);
            bundle.putInt("KEY_CUR_HEIGHT", i19);
            bundle.putInt("BASE_HEIGHT", i27);
            c16191xaf149588.f224952e.send(0, bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a type) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 activityC16262x8382bfc0 = this.f225944a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 c16237x250976b0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) activityC16262x8382bfc0.findViewById(com.p314xaae8f345.mm.R.id.gd9);
        if (c16237x250976b0 == null) {
            kd.c.e(activityC16262x8382bfc0.f225886d, "onAnimationEnd: contentView is null, skip animation end callback", new java.lang.Object[0]);
            return;
        }
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 c16191xaf149588 = activityC16262x8382bfc0.f225894o.f224949m;
            if (c16191xaf149588 != null) {
                c16191xaf149588.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m.CLOSE_END);
            }
            activityC16262x8382bfc0.f225890h = true;
            activityC16262x8382bfc0.finish();
        } else if (ordinal == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 c16191xaf1495882 = activityC16262x8382bfc0.f225894o.f224949m;
            if (c16191xaf1495882 != null) {
                c16191xaf1495882.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m.FULL_SCREEN_END);
            }
            activityC16262x8382bfc0.R6(c16237x250976b0, true);
        } else if (ordinal == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 c16191xaf1495883 = activityC16262x8382bfc0.f225894o.f224949m;
            if (c16191xaf1495883 != null) {
                c16191xaf1495883.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m.OPEN_END);
            }
        } else if (ordinal == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 c16191xaf1495884 = activityC16262x8382bfc0.f225894o.f224949m;
            if (c16191xaf1495884 != null) {
                c16191xaf1495884.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m.RESUME_HALF_SCREEN_END);
            }
            activityC16262x8382bfc0.P6(false);
        }
        int ordinal2 = type.ordinal();
        if (ordinal2 == 0) {
            str = "onHide";
        } else if (ordinal2 == 1) {
            str = "onFullScreen";
        } else if (ordinal2 == 2) {
            str = "onShow";
        } else {
            if (ordinal2 != 3) {
                throw new jz5.j();
            }
            str = "onResume";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", str);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(activityC16262x8382bfc0.f225888f.f127596p, 0L, "app.halfScreen.animationEnd", jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a type) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 activityC16262x8382bfc0 = this.f225944a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 c16237x250976b0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) activityC16262x8382bfc0.findViewById(com.p314xaae8f345.mm.R.id.gd9);
        if (c16237x250976b0 == null) {
            kd.c.e(activityC16262x8382bfc0.f225886d, "onAnimationStart: contentView is null, skip animation start callback", new java.lang.Object[0]);
            return;
        }
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 c16191xaf149588 = activityC16262x8382bfc0.f225894o.f224949m;
            if (c16191xaf149588 != null) {
                c16191xaf149588.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m.CLOSE_START);
            }
        } else if (ordinal == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 c16191xaf1495882 = activityC16262x8382bfc0.f225894o.f224949m;
            if (c16191xaf1495882 != null) {
                c16191xaf1495882.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m.FULL_SCREEN_START);
            }
            activityC16262x8382bfc0.P6(true);
        } else if (ordinal == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 c16191xaf1495883 = activityC16262x8382bfc0.f225894o.f224949m;
            if (c16191xaf1495883 != null) {
                c16191xaf1495883.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m.OPEN_START);
            }
        } else if (ordinal == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 c16191xaf1495884 = activityC16262x8382bfc0.f225894o.f224949m;
            if (c16191xaf1495884 != null) {
                c16191xaf1495884.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m.RESUME_HALF_SCREEN_START);
            }
            activityC16262x8382bfc0.R6(c16237x250976b0, false);
        }
        int ordinal2 = type.ordinal();
        if (ordinal2 == 0) {
            str = "onHide";
        } else if (ordinal2 == 1) {
            str = "onFullScreen";
        } else if (ordinal2 == 2) {
            str = "onShow";
        } else {
            if (ordinal2 != 3) {
                throw new jz5.j();
            }
            str = "onResume";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", str);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).Uj(activityC16262x8382bfc0.f225888f.f127596p, 0L, "app.halfScreen.animationStart", jSONObject);
        if (type == com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a.f225911d) {
            android.view.View findViewById = activityC16262x8382bfc0.findViewById(com.p314xaae8f345.mm.R.id.f567091i41);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            android.view.ViewPropertyAnimator animate = ((android.widget.FrameLayout) findViewById).animate();
            if (animate != null) {
                animate.setDuration(300L);
                animate.setInterpolator(new android.view.animation.DecelerateInterpolator());
                animate.alpha(0.0f);
                animate.start();
            }
        }
    }
}
