package ke5;

/* loaded from: classes9.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f388650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f388651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 f388652f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f388653g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ke5.s f388654h;

    public r(ke5.s sVar, android.os.Bundle bundle, int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689, java.util.List list) {
        this.f388654h = sVar;
        this.f388650d = bundle;
        this.f388651e = i17;
        this.f388652f = c21897x17252689;
        this.f388653g = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        final ke5.s sVar = this.f388654h;
        sb5.z adapter = (sb5.z) sVar.f388574b.f542241c.a(sb5.z.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 view = this.f388652f;
        int i17 = this.f388651e;
        java.util.List dataList = this.f388653g;
        android.os.Bundle bundle = this.f388650d;
        if (bundle == null || bundle.getInt("SCENE", 0) != 1) {
            if (bundle == null || bundle.getInt("SCENE", 0) != 2) {
                return;
            }
            sVar.g(i17, bundle.getBoolean("IS_IDLE_VISBLE", false), bundle.getInt("SELECTION_TOP_OFFSET", 0), bundle.getBoolean("IS_SMOOTH_SCROLL", false));
            sb5.a0 a0Var = (sb5.a0) sVar.f388574b.f542241c.a(sb5.a0.class);
            int i18 = this.f388651e;
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o4) a0Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
            if (bundle == null) {
                return;
            }
            if ((i18 >= 0 && i18 < dataList.size()) && (f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) dataList.get(i18)) != null && f9Var.m124847x74d37ac6() > 0) {
                android.os.Bundle bundle2 = bundle.getBundle("EXTRA_BUNDLE");
                int i19 = bundle2 != null ? bundle2.getInt("is_from_mediagroup_unread_count", 0) : 0;
                long j17 = bundle.getLong("MSG_ID", -1L);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(f9Var.Q0(), f9Var.m124847x74d37ac6());
                if (k17 == null) {
                    return;
                }
                view.m79872xcc101dd9().m75894x7c4d7ca2(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n4(adapter, j17, i18, i19, k17, view), 300L);
                return;
            }
            return;
        }
        final int mo75761x118cb524 = i17 + view.m79872xcc101dd9().mo75761x118cb524();
        boolean z17 = bundle.getBoolean("IS_HIGHLIGHT_ITEM", false);
        boolean z18 = bundle.getBoolean("IS_ALWAYS_HIGHLIGHT_MODE", false);
        final boolean z19 = bundle.getBoolean("IS_IDLE_VISBLE", false);
        final int i27 = bundle.getInt("SELECTION_TOP_OFFSET", 0);
        final boolean z27 = bundle.getBoolean("IS_SMOOTH_SCROLL", false);
        sVar.f388574b.f542253o = mo75761x118cb524;
        if (dataList.size() > mo75761x118cb524 && mo75761x118cb524 != -1) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) dataList.get(mo75761x118cb524)).I0();
        }
        sVar.g(mo75761x118cb524, z19, i27, z27);
        long j18 = bundle.getLong("MSG_ID", -1L);
        if (!z17 || mo75761x118cb524 < 0) {
            return;
        }
        if (!z18) {
            ke5.s sVar2 = this.f388654h;
            sVar2.f(this.f388652f, mo75761x118cb524, new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(j18, sVar2.f388575c), z19, i27, z27, this.f388650d);
            return;
        }
        final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689 = this.f388652f;
        sVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.AbstractDataPresenter", "highLightItemAlwaysOnMode position: %s", java.lang.Integer.valueOf(mo75761x118cb524));
        try {
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            java.lang.Runnable runnable = sVar.f388580h;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
            }
            java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: ke5.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 v3Var;
                    ke5.a.this.g(mo75761x118cb524, z19, i27, z27);
                    final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x172526892 = c21897x17252689;
                    int i28 = c21897x172526892.A1;
                    if (i28 < 0 || (v3Var = c21897x172526892.T) == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMChattingListView", "[blinkPersistentHighLight] invalid state, index:%s", java.lang.Integer.valueOf(i28));
                    } else if (((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19727x3bcc210a) v3Var).F(i28) == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMChattingListView", "[blinkPersistentHighLight] null == view index:%s", java.lang.Integer.valueOf(c21897x172526892.A1));
                    } else {
                        android.animation.ValueAnimator valueAnimator = c21897x172526892.f284383z1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            c21897x172526892.f284383z1 = null;
                        }
                        c21897x172526892.q();
                        float f17 = com.p314xaae8f345.mm.ui.bk.C() ? 0.08f : 0.1f;
                        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, f17, 0.0f, f17, f17, f17));
                        c21897x172526892.f284383z1 = ofPropertyValuesHolder;
                        ofPropertyValuesHolder.setDuration(1000L);
                        c21897x172526892.f284383z1.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.mm.ui.chatting.view.MMChattingListView$$d
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                                int i29 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689.L1;
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x172526893 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689.this;
                                c21897x172526893.getClass();
                                float floatValue = ((java.lang.Float) valueAnimator2.getAnimatedValue("alpha")).floatValue();
                                c21897x172526893.f284382y1 = floatValue;
                                c21897x172526893.f284380x1.setAlpha((int) (floatValue * 255.0f));
                                c21897x172526893.T.m75895x31e85dfb();
                            }
                        });
                        c21897x172526892.f284383z1.start();
                    }
                    c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_POSITION_AT_CHATRECORD_FIRST_IN_BOOLEAN, java.lang.Boolean.FALSE);
                }
            };
            sVar.f388580h = runnable2;
            handler.postDelayed(runnable2, 300L);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingLoader.AbstractDataPresenter", "highLightItemAlwaysOnMode exception: %s", e17.getMessage());
        }
    }
}
