package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/fav/ui/FavFinderFilterUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lq40/h;", "<init>", "()V", "ui-fav_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.fav.ui.FavFinderFilterUI */
/* loaded from: classes12.dex */
public final class ActivityC13567x4039ba2d extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements q40.h {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f181880o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.animation.Animation f181881d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.Animation f181882e;

    /* renamed from: f, reason: collision with root package name */
    public q40.g f181883f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f181884g;

    /* renamed from: i, reason: collision with root package name */
    public float f181886i;

    /* renamed from: m, reason: collision with root package name */
    public float f181887m;

    /* renamed from: h, reason: collision with root package name */
    public int f181885h = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f181888n = -1;

    @Override // q40.h
    public boolean M(int i17) {
        W6().O6(2, false);
        if (!(this.f181888n == 1) || V6().f497936d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[onItemClick] position = " + i17 + ", un filter click");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[onItemClick] position = " + i17 + ", filter click");
        o72.r2 P6 = U6().P6(i17);
        if (P6 != null) {
            java.lang.String str = this.f181884g;
            if (str == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("toUser");
                throw null;
            }
            if (str.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavFinderFilterUI", "[showTransmitDialog] toUser empty, return");
            } else {
                o72.w4 w4Var = (o72.w4) i95.n0.c(o72.w4.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                java.lang.String str2 = this.f181884g;
                if (str2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("toUser");
                    throw null;
                }
                ((x82.l0) w4Var).Ai(mo55332x76847179, str2, P6, com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya, true, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w2(this, P6));
            }
        }
        return true;
    }

    @Override // q40.h
    public void T(android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[onItemLongClick] position = " + i17 + ", rawX = " + this.f181886i + ", rawY = " + this.f181887m);
        int[] iArr = {(int) this.f181886i, (int) this.f181887m};
        this.f181885h = i17;
        V6().T6(view, this.f181885h, 0L, iArr);
    }

    public final t82.d U6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(mo55332x76847179).a(t82.d.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (t82.d) a17;
    }

    public final t82.r V6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(mo55332x76847179).a(t82.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (t82.r) a17;
    }

    public final t82.s W6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(mo55332x76847179).a(t82.s.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (t82.s) a17;
    }

    @Override // q40.h
    public void a3(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[onItemSelectStateChang] position = " + i17 + ", type = " + i18);
        if (!V6().f497936d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[onItemSelectStateChang] not in more state, maybe finder fragment bug");
            return;
        }
        if (i18 == 111) {
            U6().T6(i17);
        } else {
            U6().U6(i17);
        }
        if (((java.util.ArrayList) U6().S6()).isEmpty()) {
            V6().O6(false);
        } else {
            V6().O6(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavFinderFilterUI", "[dispatchTouchEvent] motion event null");
        } else if (motionEvent.getAction() == 0) {
            this.f181886i = motionEvent.getRawX();
            this.f181887m = motionEvent.getRawY();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[dispatchTouchEvent] ACTION_DOWN, mRawX = " + this.f181886i + ", mRawY = " + this.f181887m);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570290ab3;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        q40.g gVar = this.f181883f;
        if (gVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00) gVar).y0(i17, i18, intent);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGlobalFavFragment");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (!V6().f497936d) {
            finish();
            return;
        }
        q40.g gVar = this.f181883f;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGlobalFavFragment");
            throw null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00) gVar).A0();
        V6().P6();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View view;
        super.onCreate(bundle);
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559368ct);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadAnimation, "loadAnimation(...)");
        this.f181881d = loadAnimation;
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559369cu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadAnimation2, "loadAnimation(...)");
        this.f181882e = loadAnimation2;
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        inflateTransition.excludeTarget(decorView.findViewById(com.p314xaae8f345.mm.R.id.f563968ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
        this.f181888n = getIntent().getIntExtra("key_enter_fav_search_from", -1);
        this.f181884g = java.lang.String.valueOf(getIntent().getStringExtra("key_to_user"));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FavFinderFilterUI] from = ");
        sb6.append(this.f181888n);
        sb6.append(", toUser = ");
        java.lang.String str = this.f181884g;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("toUser");
            throw null;
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", sb6.toString());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.y2) ((q40.f) i95.n0.c(q40.f.class))).getClass();
        this.f181883f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00("Masonry");
        V6().f497938f = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.t2(this);
        m78531x8f8cf1fb();
        int Q6 = U6().Q6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[initContentView] data size = " + Q6);
        if (Q6 == 0) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f568297me2);
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.gd9);
            if (findViewById.getVisibility() != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.animation.Animation animation = this.f181881d;
                if (animation == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFadeIn");
                    throw null;
                }
                findViewById.startAnimation(animation);
            }
            if (8 != findViewById2.getVisibility()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.animation.Animation animation2 = this.f181882e;
                if (animation2 != null) {
                    findViewById2.startAnimation(animation2);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFadeOut");
                    throw null;
                }
            }
            return;
        }
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f568297me2);
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.gd9);
        if (8 != findViewById3.getVisibility()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            view = findViewById4;
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showFinderDataFragment", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showFinderDataFragment", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.animation.Animation animation3 = this.f181882e;
            if (animation3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFadeOut");
                throw null;
            }
            findViewById3.startAnimation(animation3);
        } else {
            view = findViewById4;
        }
        if (view.getVisibility() != 0) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showFinderDataFragment", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = view;
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showFinderDataFragment", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.animation.Animation animation4 = this.f181881d;
            if (animation4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFadeIn");
                throw null;
            }
            view2.startAnimation(animation4);
        }
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
        q40.g gVar = this.f181883f;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGlobalFavFragment");
            throw null;
        }
        m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.gd9, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00) gVar, null);
        q40.g gVar2 = this.f181883f;
        if (gVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGlobalFavFragment");
            throw null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00) gVar2).f210667w = this;
        m7630xb2c12e75.d();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        android.view.MenuItem add = menu.add(0, 10, 0, com.p314xaae8f345.mm.R.C30867xcad56011.jzr);
        add.setIcon(com.p314xaae8f345.mm.ui.uk.e(mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f78356x618865ad, b3.l.m9702x7444d5ad(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
        add.setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem item) {
        byte[] mo14344x5f01b1f6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (item.getItemId() != 10) {
            return super.onOptionsItemSelected(item);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_fav_search_from", 0);
        intent.putExtra("key_preset_search_type", 20);
        intent.putExtra("key_search_type", 0);
        r45.fq0 fq0Var = (r45.fq0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(this, 17, r45.fq0.class);
        if (fq0Var != null) {
            try {
                mo14344x5f01b1f6 = fq0Var.mo14344x5f01b1f6();
            } catch (java.io.IOException unused) {
            }
        } else {
            mo14344x5f01b1f6 = null;
        }
        intent.putExtra("ReportKey.CommonReportObjKey", mo14344x5f01b1f6);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.e(mo55332x76847179(), false, intent);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(t82.r.class);
        set.add(t82.d.class);
        set.add(t82.s.class);
    }
}
