package com.tencent.mm.plugin.fav.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/fav/ui/FavFinderFilterUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lq40/h;", "<init>", "()V", "ui-fav_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class FavFinderFilterUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements q40.h {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f100347o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.animation.Animation f100348d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.Animation f100349e;

    /* renamed from: f, reason: collision with root package name */
    public q40.g f100350f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f100351g;

    /* renamed from: i, reason: collision with root package name */
    public float f100353i;

    /* renamed from: m, reason: collision with root package name */
    public float f100354m;

    /* renamed from: h, reason: collision with root package name */
    public int f100352h = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f100355n = -1;

    @Override // q40.h
    public boolean M(int i17) {
        W6().O6(2, false);
        if (!(this.f100355n == 1) || V6().f416403d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[onItemClick] position = " + i17 + ", un filter click");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[onItemClick] position = " + i17 + ", filter click");
        o72.r2 P6 = U6().P6(i17);
        if (P6 != null) {
            java.lang.String str = this.f100351g;
            if (str == null) {
                kotlin.jvm.internal.o.o("toUser");
                throw null;
            }
            if (str.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavFinderFilterUI", "[showTransmitDialog] toUser empty, return");
            } else {
                o72.w4 w4Var = (o72.w4) i95.n0.c(o72.w4.class);
                androidx.appcompat.app.AppCompatActivity context = getContext();
                java.lang.String str2 = this.f100351g;
                if (str2 == null) {
                    kotlin.jvm.internal.o.o("toUser");
                    throw null;
                }
                ((x82.l0) w4Var).Ai(context, str2, P6, com.tencent.mm.R.string.f490551ya, true, new com.tencent.mm.plugin.fav.ui.w2(this, P6));
            }
        }
        return true;
    }

    @Override // q40.h
    public void T(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[onItemLongClick] position = " + i17 + ", rawX = " + this.f100353i + ", rawY = " + this.f100354m);
        int[] iArr = {(int) this.f100353i, (int) this.f100354m};
        this.f100352h = i17;
        V6().T6(view, this.f100352h, 0L, iArr);
    }

    public final t82.d U6() {
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(t82.d.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (t82.d) a17;
    }

    public final t82.r V6() {
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(t82.r.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (t82.r) a17;
    }

    public final t82.s W6() {
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(t82.s.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (t82.s) a17;
    }

    @Override // q40.h
    public void a3(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[onItemSelectStateChang] position = " + i17 + ", type = " + i18);
        if (!V6().f416403d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[onItemSelectStateChang] not in more state, maybe finder fragment bug");
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

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavFinderFilterUI", "[dispatchTouchEvent] motion event null");
        } else if (motionEvent.getAction() == 0) {
            this.f100353i = motionEvent.getRawX();
            this.f100354m = motionEvent.getRawY();
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[dispatchTouchEvent] ACTION_DOWN, mRawX = " + this.f100353i + ", mRawY = " + this.f100354m);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488757ab3;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        q40.g gVar = this.f100350f;
        if (gVar != null) {
            ((com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment) gVar).y0(i17, i18, intent);
        } else {
            kotlin.jvm.internal.o.o("mGlobalFavFragment");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!V6().f416403d) {
            finish();
            return;
        }
        q40.g gVar = this.f100350f;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("mGlobalFavFragment");
            throw null;
        }
        ((com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment) gVar).A0();
        V6().P6();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View view;
        super.onCreate(bundle);
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477835ct);
        kotlin.jvm.internal.o.f(loadAnimation, "loadAnimation(...)");
        this.f100348d = loadAnimation;
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477836cu);
        kotlin.jvm.internal.o.f(loadAnimation2, "loadAnimation(...)");
        this.f100349e = loadAnimation2;
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        inflateTransition.excludeTarget(decorView.findViewById(com.tencent.mm.R.id.f482435ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
        this.f100355n = getIntent().getIntExtra("key_enter_fav_search_from", -1);
        this.f100351g = java.lang.String.valueOf(getIntent().getStringExtra("key_to_user"));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FavFinderFilterUI] from = ");
        sb6.append(this.f100355n);
        sb6.append(", toUser = ");
        java.lang.String str = this.f100351g;
        if (str == null) {
            kotlin.jvm.internal.o.o("toUser");
            throw null;
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", sb6.toString());
        ((com.tencent.mm.plugin.finder.service.y2) ((q40.f) i95.n0.c(q40.f.class))).getClass();
        this.f100350f = new com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment("Masonry");
        V6().f416405f = new com.tencent.mm.plugin.fav.ui.t2(this);
        hideTitleView();
        int Q6 = U6().Q6();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[initContentView] data size = " + Q6);
        if (Q6 == 0) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486764me2);
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.gd9);
            if (findViewById.getVisibility() != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.animation.Animation animation = this.f100348d;
                if (animation == null) {
                    kotlin.jvm.internal.o.o("mFadeIn");
                    throw null;
                }
                findViewById.startAnimation(animation);
            }
            if (8 != findViewById2.getVisibility()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.animation.Animation animation2 = this.f100349e;
                if (animation2 != null) {
                    findViewById2.startAnimation(animation2);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("mFadeOut");
                    throw null;
                }
            }
            return;
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f486764me2);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.gd9);
        if (8 != findViewById3.getVisibility()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            view = findViewById4;
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showFinderDataFragment", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showFinderDataFragment", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.animation.Animation animation3 = this.f100349e;
            if (animation3 == null) {
                kotlin.jvm.internal.o.o("mFadeOut");
                throw null;
            }
            findViewById3.startAnimation(animation3);
        } else {
            view = findViewById4;
        }
        if (view.getVisibility() != 0) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showFinderDataFragment", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = view;
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showFinderDataFragment", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.animation.Animation animation4 = this.f100348d;
            if (animation4 == null) {
                kotlin.jvm.internal.o.o("mFadeIn");
                throw null;
            }
            view2.startAnimation(animation4);
        }
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        q40.g gVar = this.f100350f;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("mGlobalFavFragment");
            throw null;
        }
        beginTransaction.k(com.tencent.mm.R.id.gd9, (com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment) gVar, null);
        q40.g gVar2 = this.f100350f;
        if (gVar2 == null) {
            kotlin.jvm.internal.o.o("mGlobalFavFragment");
            throw null;
        }
        ((com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment) gVar2).f129134w = this;
        beginTransaction.d();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        kotlin.jvm.internal.o.g(menu, "menu");
        android.view.MenuItem add = menu.add(0, 10, 0, com.tencent.mm.R.string.jzr);
        add.setIcon(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.actionbar_icon_dark_search, b3.l.getColor(getContext(), com.tencent.mm.R.color.FG_0)));
        add.setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem item) {
        byte[] byteArray;
        kotlin.jvm.internal.o.g(item, "item");
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
                byteArray = fq0Var.toByteArray();
            } catch (java.io.IOException unused) {
            }
        } else {
            byteArray = null;
        }
        intent.putExtra("ReportKey.CommonReportObjKey", byteArray);
        com.tencent.mm.plugin.fav.ui.ec.e(getContext(), false, intent);
        return true;
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(t82.r.class);
        set.add(t82.d.class);
        set.add(t82.s.class);
    }
}
