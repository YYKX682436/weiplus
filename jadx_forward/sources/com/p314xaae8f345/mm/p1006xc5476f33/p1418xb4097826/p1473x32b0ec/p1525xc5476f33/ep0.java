package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public interface ep0 {
    private default boolean E(android.content.Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    cm2.t A();

    void B(android.os.Bundle bundle, java.lang.Object obj, long j17);

    default void R(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l plugin, yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85399r7).mo141623x754a37bb()).r()).intValue() == 1) {
            if (!q0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("IFinderLivePromoteItem", "runDelShopBubbleAnimateV2 when shopping not visible");
                callback.mo152xb9724478();
                return;
            }
            android.view.View mo56902xfb86a31b = mo56902xfb86a31b();
            if (mo56902xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.f566349fm5) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("IFinderLivePromoteItem", "try del anim when bubble not attached");
                return;
            }
            android.graphics.Rect p17 = p(mo56902xfb86a31b);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(plugin, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wo0(this, mo56902xfb86a31b, p17, callback, null), 2, null);
            return;
        }
        android.view.View view = mo56902xfb86a31b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int[] t17 = pm0.v.t(view);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (zl2.r4.f555483a.w1()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var = k0Var != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4.class) : null;
            if (c4Var != null) {
                int[] t18 = pm0.v.t(c4Var.f193638y.f538199o);
                android.content.Context context = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                if (E(context)) {
                    rect.left = (int) ((t18[0] - ((measuredWidth * 0.8f) / 2)) - t17[0]);
                } else {
                    int i17 = t18[0];
                    int i18 = measuredWidth / 2;
                    int i19 = i17 - i18;
                    rect.left = i19;
                    if (i17 >= i18) {
                        rect.left = i19 + ((int) ((measuredWidth * 0.2f) / 2));
                    }
                }
                rect.bottom = -((int) (measuredHeight * 0.6f));
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = dk2.ef.f314913e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = k0Var2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) k0Var2.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class) : null;
            if (ag0Var != null) {
                int[] H1 = ag0Var.H1();
                android.content.Context context2 = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                if (E(context2)) {
                    rect.left = (int) ((H1[0] - ((measuredWidth * 0.8f) / 2)) - t17[0]);
                } else {
                    int i27 = H1[0];
                    int i28 = measuredWidth / 2;
                    int i29 = i27 - i28;
                    rect.left = i29;
                    if (i27 >= i28) {
                        rect.left = i29 + ((int) ((measuredWidth * 0.2f) / 2));
                    }
                }
                rect.bottom = -((int) (measuredHeight * 0.6f));
            }
        }
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.2f, 1.0f).setDuration(300L);
        duration.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uo0(view, rect));
        duration.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vo0(callback));
        duration.start();
    }

    void U();

    int e0();

    void f0(java.lang.Object obj);

    /* renamed from: getView */
    android.view.View mo56902xfb86a31b();

    void l(java.lang.Object obj);

    void l0();

    /* renamed from: onPause */
    default void mo56918xb01dfb57() {
    }

    /* renamed from: onResume */
    default void mo56919x57429eec() {
    }

    default android.graphics.Rect p(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int measuredHeight = view.getMeasuredHeight();
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.hal);
        if (findViewById == null) {
            return new android.graphics.Rect(0, 0, 0, 0);
        }
        int measuredWidth = findViewById.getMeasuredWidth();
        findViewById.getMeasuredHeight();
        int[] t17 = pm0.v.t(view);
        int[] t18 = pm0.v.t(findViewById);
        float dimension = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (zl2.r4.f555483a.w1()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var = k0Var != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4.class) : null;
            if (c4Var != null) {
                xt2.d dVar = c4Var.f193638y;
                int[] t19 = pm0.v.t(dVar.c());
                int[] t27 = pm0.v.t(dVar.f538199o);
                int measuredWidth2 = dVar.f538199o.getMeasuredWidth();
                rect.left = (t27[0] - t17[0]) + ((int) ((measuredWidth2 / 2) - (((t18[0] - r18) + (measuredWidth / 2)) * 0.3f)));
                int i17 = t19[1] - t17[1];
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                rect.top = (int) ((i17 - ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r8.bottomMargin : 0)) - dimension);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("IFinderLivePromoteItem", "get source rect, entrance loc = " + kz5.z.c0(t27, null, null, null, 0, null, null, 63, null) + " view loc = " + kz5.z.c0(t17, null, null, null, 0, null, null, 63, null) + ", viewHeight = " + measuredHeight + ", top = " + rect.top);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = dk2.ef.f314913e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = k0Var2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) k0Var2.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class) : null;
            if (ag0Var != null) {
                int[] t28 = pm0.v.t(ag0Var.f193416y.c());
                int[] H1 = ag0Var.H1();
                int measuredWidth3 = ag0Var.f193416y.h().getMeasuredWidth();
                rect.left = (H1[0] - t17[0]) + ((int) ((measuredWidth3 / 2) - (((t18[0] - r18) + (measuredWidth / 2)) * 0.3f)));
                int i18 = t28[1] - t17[1];
                android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                rect.top = (int) ((i18 - ((layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null) != null ? r8.bottomMargin : 0)) - dimension);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("IFinderLivePromoteItem", "get source rect, entrance loc = " + kz5.z.c0(H1, null, null, null, 0, null, null, 63, null) + " view loc = " + kz5.z.c0(t17, null, null, null, 0, null, null, 63, null) + ", viewHeight = " + measuredHeight + ", imgWidth = " + measuredWidth + ", top = " + rect.top);
            }
        }
        return rect;
    }

    int p0();

    default boolean q0() {
        if (zl2.r4.f555483a.w1()) {
            dk2.ef efVar = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var = k0Var != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4.class) : null;
            if (c4Var != null && c4Var.f193638y.mo175918xf94337e8()) {
                return true;
            }
        } else {
            dk2.ef efVar2 = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = dk2.ef.f314913e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = k0Var2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) k0Var2.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class) : null;
            if (ag0Var != null && ag0Var.f193416y.mo175918xf94337e8()) {
                return true;
            }
        }
        return false;
    }

    default void r0(android.os.Bundle bundle, long j17) {
    }

    default void t() {
    }
}
