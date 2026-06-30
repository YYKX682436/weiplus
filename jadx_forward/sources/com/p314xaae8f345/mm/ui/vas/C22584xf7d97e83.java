package com.p314xaae8f345.mm.ui.vas;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/tencent/mm/ui/vas/VASCommonFragment;", "Lcom/tencent/mm/ui/vas/fragment/VASBaseFragment;", "Lal5/g3;", "Llk5/b;", "Lna5/b;", "Ltk5/a;", "<init>", "()V", "lk5/a0", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.vas.VASCommonFragment */
/* loaded from: classes14.dex */
public class C22584xf7d97e83 extends com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69 implements al5.g3, lk5.b, na5.b, tk5.a {
    public static final lk5.a0 Q = new lk5.a0(null);
    public boolean F;
    public tk5.c G;
    public final java.util.ArrayList H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.ga f292652J;
    public final jz5.g K;
    public boolean L;
    public android.widget.FrameLayout M;
    public android.widget.FrameLayout N;
    public xk5.b P;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 f292654p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 f292655q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f292656r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f292657s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f292658t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f292659u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f292660v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f292661w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab f292662x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewGroup f292663y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f292664z;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f292653o = "MicroMsg.VAS.VASCommonFragment@" + m7479x8cdac1b();
    public android.content.Intent A = new android.content.Intent();
    public sk5.j B = sk5.f.f490544c;
    public sk5.j C = sk5.e.f490543c;
    public sk5.j D = sk5.d.f490542c;
    public sk5.j E = sk5.g.f490545c;

    public C22584xf7d97e83() {
        jz5.h.b(lk5.f0.f400564d);
        this.H = new java.util.ArrayList();
        this.f292652J = new lk5.g0(this);
        this.K = jz5.h.b(new lk5.b0(this));
    }

    public final boolean A0() {
        return !this.A.getBooleanExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39698x83153425, false) && this.f292655q == null;
    }

    public void B0() {
        android.widget.FrameLayout frameLayout = this.f292657s;
        com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.C22588x8ca9b236 c22588x8ca9b236 = frameLayout instanceof com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.C22588x8ca9b236 ? (com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.C22588x8ca9b236) frameLayout : null;
        if (c22588x8ca9b236 != null) {
            java.lang.Object tag = c22588x8ca9b236.getTag(com.p314xaae8f345.mm.R.id.s__);
            android.view.View view = tag instanceof android.view.View ? (android.view.View) tag : null;
            if (view != null) {
                c22588x8ca9b236.removeView(view);
            }
        }
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            this.P = xk5.c.b(abstractActivityC22579xbed01a37.getWindow(), false);
            getF292665d();
            java.util.Objects.toString(this.P);
        }
    }

    public void C0() {
        android.widget.FrameLayout frameLayout = this.N;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i65.a.h(mo7430x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
        }
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        p012xc85e97e9.p016x746ad0e3.app.b m81192x74c95406 = abstractActivityC22579xbed01a37 != null ? abstractActivityC22579xbed01a37.m81192x74c95406() : null;
        lk5.e eVar = m81192x74c95406 instanceof lk5.e ? (lk5.e) m81192x74c95406 : null;
        android.view.ViewGroup viewGroup = eVar != null ? eVar.f400561b : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(0);
    }

    @Override // tk5.a
    public void G() {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.finish();
        }
    }

    @Override // tk5.a
    public void M(tk5.c router) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(router, "router");
        this.G = router;
    }

    @Override // al5.g3
    public void R(int i17, int i18, int i19, int i27, float f17) {
        android.view.View view;
        if (f17 <= 0.0f) {
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f292655q;
            view = c22584xf7d97e83 != null ? c22584xf7d97e83.f292656r : null;
            if (view == null) {
                return;
            }
            view.setTranslationX(0.0f);
            return;
        }
        float f18 = this.I * (1.0f - f17);
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e832 = this.f292655q;
        view = c22584xf7d97e832 != null ? c22584xf7d97e832.f292656r : null;
        if (view == null) {
            return;
        }
        view.setTranslationX(f18);
    }

    @Override // tk5.a
    public boolean Z() {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            return abstractActivityC22579xbed01a37.mo55426xe0085496();
        }
        return false;
    }

    @Override // al5.g3
    public boolean a(android.view.MotionEvent motionEvent) {
        getF292665d();
        android.view.MotionEvent.actionToString(motionEvent != null ? motionEvent.getAction() : -1);
        return false;
    }

    @Override // al5.g3
    public int b(boolean z17) {
        getF292665d();
        return 1;
    }

    @Override // al5.g3
    public boolean d(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // al5.g3
    public boolean d0() {
        return false;
    }

    @Override // al5.g3
    public int e() {
        return 0;
    }

    @Override // al5.g3
    /* renamed from: enableSwipeBack */
    public boolean mo2163xd71108fe() {
        return false;
    }

    @Override // tk5.a
    public void g0() {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.onBackPressed();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69
    /* renamed from: getLayoutId */
    public int mo81244x2ee31f5b() {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        int m81187xd134cf0f = abstractActivityC22579xbed01a37 != null ? abstractActivityC22579xbed01a37.m81187xd134cf0f() : -1;
        if (m81187xd134cf0f != 0) {
            return m81187xd134cf0f;
        }
        com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c9 = this.f292668g;
        return abstractC22275x3ce1d8c9 != null ? abstractC22275x3ce1d8c9.mo569x2ee31f5b() : -1;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return ((pk5.e) ((jz5.n) this.K).mo141623x754a37bb()).f438083f;
    }

    @Override // tk5.a
    public boolean i() {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            return abstractActivityC22579xbed01a37.mo45060x28c9d73();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69
    public p012xc85e97e9.p093xedfae76a.c1 j0(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractActivityC22579xbed01a37);
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(abstractActivityC22579xbed01a37).a(modelClass);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return a17;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69
    /* renamed from: l0, reason: from getter */
    public java.lang.String getF292665d() {
        return this.f292653o;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69
    public java.util.Set m0() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69
    public void n0(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.n0(set);
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.mo43518x5e67c7ca(set);
        }
    }

    public final android.view.View o0() {
        android.view.View m7474xfb86a31b = m7474xfb86a31b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m7474xfb86a31b);
        return m7474xfb86a31b;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityResult */
    public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo7496x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.m81173xe165ca49(i17, i18, intent);
        }
        getF292665d();
        java.util.Objects.toString(intent);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public void mo7497x3b13c504(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        getF292665d();
        activity.toString();
        super.mo7497x3b13c504(activity);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        uk5.f fVar = com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.f39357x18545862;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        fVar.d(abstractActivityC22579xbed01a37 != null ? abstractActivityC22579xbed01a37.getIntent() : null);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        this.f292657s = mo7430x19263085 != null ? (android.widget.FrameLayout) mo7430x19263085.findViewById(com.p314xaae8f345.mm.R.id.hys) : null;
        super.mo7398x3e5a77bb(bundle);
        getF292665d();
        com.p314xaae8f345.mm.ui.ga gaVar = this.f292652J;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a372 = this.f292654p;
        gaVar.e0(abstractActivityC22579xbed01a372, abstractActivityC22579xbed01a372);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateAnimation */
    public android.view.animation.Animation mo7500x963e4609(int i17, boolean z17, int i18) {
        if (((i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f559452f7 || i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f559453f8) || i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f559454f9) || i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f_) {
            return null;
        }
        return super.mo7500x963e4609(i17, z17, i18);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateAnimator */
    public android.animation.Animator mo7501x36651bc2(int i17, boolean z17, int i18) {
        android.animation.Animator a17;
        android.animation.Animator a18;
        android.animation.Animator animator;
        android.view.WindowManager windowManager;
        android.view.Display defaultDisplay;
        if (!(((i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f559452f7 || i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f559453f8) || i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f559454f9) || i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f_)) {
            return super.mo7501x36651bc2(i17, z17, i18);
        }
        java.lang.Object parent = o0().getParent();
        android.animation.Animator animator2 = null;
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            java.lang.Object parent2 = o0().getParent();
            android.view.View view2 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
            if (view2 != null) {
                int measuredHeight = view2.getMeasuredHeight();
                if (i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f559452f7) {
                    getF292665d();
                    java.util.Objects.toString(this.B);
                    com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
                    if (abstractActivityC22579xbed01a37 != null) {
                        abstractActivityC22579xbed01a37.m81181xfc2e2b91();
                    }
                    sk5.k kVar = new sk5.k();
                    t0();
                    a18 = this.B.a(o0(), measuredWidth, measuredHeight, kVar);
                    if (a18 != null) {
                        if (lk5.m0.f400584c) {
                            lk5.m0.f400584c = false;
                            a18.setDuration(0L);
                        }
                        animator2 = a18;
                    }
                    animator = animator2;
                } else {
                    sk5.k kVar2 = sk5.k.f490550a;
                    if (i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f559453f8) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF292665d(), "createAnimForFragment() vas_anim_exit_holder exitAnim:" + this.C);
                        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a372 = this.f292654p;
                        if (abstractActivityC22579xbed01a372 != null) {
                            abstractActivityC22579xbed01a372.m81181xfc2e2b91();
                        }
                        sk5.j jVar = this.C;
                        android.view.View o07 = o0();
                        jz5.g gVar = sk5.j.f490548b;
                        a17 = jVar.a(o07, measuredWidth, measuredHeight, kVar2);
                        if (a17 != null) {
                            if (lk5.m0.f400585d) {
                                lk5.m0.f400585d = false;
                                a17.setDuration(0L);
                            }
                            animator = a17;
                        }
                        animator = animator2;
                    } else {
                        if (i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f559454f9) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF292665d(), "createAnimForFragment() vas_anim_pop_enter_holder popEnterAnim:" + this.D + " isPopEnterNoAnim:" + lk5.m0.f400582a);
                            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a373 = this.f292654p;
                            if (abstractActivityC22579xbed01a373 != null) {
                                abstractActivityC22579xbed01a373.m81181xfc2e2b91();
                            }
                            sk5.k kVar3 = new sk5.k();
                            t0();
                            a18 = this.D.a(o0(), measuredWidth, measuredHeight, kVar3);
                            if (a18 != null) {
                                if (lk5.m0.f400582a) {
                                    lk5.m0.f400582a = false;
                                    a18.setDuration(0L);
                                }
                                animator2 = a18;
                            }
                        } else if (i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f_) {
                            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a374 = this.f292654p;
                            if (abstractActivityC22579xbed01a374 != null) {
                                abstractActivityC22579xbed01a374.m81181xfc2e2b91();
                            }
                            getF292665d();
                            java.util.Objects.toString(this.E);
                            sk5.j jVar2 = this.E;
                            android.view.View o08 = o0();
                            jz5.g gVar2 = sk5.j.f490548b;
                            a17 = jVar2.a(o08, measuredWidth, measuredHeight, kVar2);
                            if (a17 != null) {
                                if (lk5.m0.f400583b) {
                                    lk5.m0.f400583b = false;
                                    a17.setDuration(0L);
                                }
                                animator = a17;
                            }
                        }
                        animator = animator2;
                    }
                }
                if (animator instanceof android.animation.ValueAnimator) {
                    android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) animator;
                    long duration = valueAnimator.getDuration();
                    p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
                    float refreshRate = (mo7430x19263085 == null || (windowManager = mo7430x19263085.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? 0.0f : defaultDisplay.getRefreshRate();
                    int i19 = (duration <= 0 || refreshRate <= 0.0f) ? 0 : (int) (refreshRate * (((float) duration) / 1000.0f));
                    p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                    if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                        valueAnimator.addUpdateListener(new lk5.k0(f0Var));
                    }
                    valueAnimator.addListener(new lk5.l0(i18, this, i19, f0Var, duration, animator));
                }
                animator2 = animator;
            }
        }
        pk5.e eVar = (pk5.e) ((jz5.n) this.K).mo141623x754a37bb();
        eVar.getClass();
        if (i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f559452f7) {
            if (animator2 != null) {
                animator2.addListener(new pk5.c(eVar));
            }
        } else if (i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f559454f9 && animator2 != null) {
            animator2.addListener(new pk5.d(eVar));
        }
        getF292665d();
        java.util.Objects.toString(animator2);
        if (i18 == com.p314xaae8f345.mm.R.C30854x2dc211.f559452f7 && animator2 != null) {
            animator2.addListener(new lk5.h0());
        }
        return animator2;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateOptionsMenu */
    public void mo7502xa71d2e62(android.view.Menu menu, android.view.MenuInflater inflater) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.onCreateOptionsMenu(menu);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF292665d(), "onCreateView:" + m7448x5db1b11());
        m7568x9c2f1725(true);
        android.view.View w17 = this.f292652J.w();
        this.f292656r = w17;
        if (w17 != null) {
            java.util.HashSet hashSet = this.f292667f;
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).m80384x6ca18d29(w17);
            }
            if (!this.f292664z) {
                this.f292670i = w17;
                java.util.Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it6.next()).mo2277xb2f1ab1a(bundle);
                }
                this.f292664z = true;
            }
        }
        android.view.View view = this.f292656r;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        boolean z17 = abstractActivityC22579xbed01a37 != null && abstractActivityC22579xbed01a37.getF147381t();
        boolean A0 = A0();
        boolean z18 = z17 && !A0;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab2 = this.f292662x;
        if (c22649x858f5ab2 != null) {
            this.f292656r = c22649x858f5ab2;
            view = c22649x858f5ab2;
        } else if (z18) {
            android.view.View view2 = this.f292670i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
            android.view.ViewParent parent = view2.getParent();
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 != null) {
                android.view.View inflate = android.view.LayoutInflater.from(mo7430x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxh, viewGroup2, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.SwipeBackLayout");
                viewGroup2.removeView(view2);
                viewGroup2.addView(this.f292662x);
                c22649x858f5ab = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab) inflate;
            } else {
                android.view.View inflate2 = android.view.LayoutInflater.from(mo7430x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxh, (android.view.ViewGroup) null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate2, "null cannot be cast to non-null type com.tencent.mm.ui.widget.SwipeBackLayout");
                c22649x858f5ab = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab) inflate2;
            }
            c22649x858f5ab.addView(view2);
            c22649x858f5ab.m81446x590ab8fc(view2);
            if (c22649x858f5ab.getChildCount() > 0) {
                android.view.View childAt = c22649x858f5ab.getChildAt(0);
                c22649x858f5ab.removeView(childAt);
                vj5.h hVar = new vj5.h(c22649x858f5ab.getContext());
                hVar.addView(childAt, new android.widget.FrameLayout.LayoutParams(-1, -1));
                c22649x858f5ab.addView(hVar);
                c22649x858f5ab.m81446x590ab8fc(hVar);
                this.f292663y = hVar;
            }
            c22649x858f5ab.d(true);
            c22649x858f5ab.m81445xc09d199f(false);
            c22649x858f5ab.m81457xeb590ed6(new lk5.e0(this));
            c22649x858f5ab.m81456x372c76d3(this);
            this.f292662x = c22649x858f5ab;
            getF292665d();
            this.f292656r = c22649x858f5ab;
            view = c22649x858f5ab;
        }
        if (z17) {
            s0(true);
        }
        java.lang.String f292665d = getF292665d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreateView isNeedInitSwipeBack:");
        sb6.append(z18);
        sb6.append(" isSupportNavigationSwipeBack:");
        sb6.append(z17);
        sb6.append(" isUseActivitySwipeBack:");
        sb6.append(A0);
        sb6.append(" lastSwipeBackLayout:");
        sb6.append(c22649x858f5ab2 != null);
        sb6.append(" returnView:");
        sb6.append(view);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f292665d, sb6.toString());
        return view;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        getF292665d();
        super.mo7504xac79a11b();
        if (this.F) {
            return;
        }
        mo81225x9c5afff7();
        mo81226x15bd8ba9();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        getF292665d();
        super.mo7399xa6664a60();
    }

    @Override // na5.b
    /* renamed from: onPageEnterAnimBegin */
    public void mo81220x1a7a6dce() {
        if (this.A.getBooleanExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39704x5734e7fe, false)) {
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
            com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8 activityC22590xcda336c8 = mo7430x19263085 instanceof com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8 ? (com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8) mo7430x19263085 : null;
            if (activityC22590xcda336c8 != null) {
                activityC22590xcda336c8.Y6();
            }
        }
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.mo81220x1a7a6dce();
        }
    }

    @Override // na5.b
    /* renamed from: onPageEnterAnimEnd */
    public void mo68958x17bc8340() {
        if (this.A.getBooleanExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39704x5734e7fe, false)) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b.l0();
        }
        getF292665d();
        x0("onPageEnterAnimEnd");
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.mo68958x17bc8340();
        }
    }

    @Override // na5.b
    /* renamed from: onPageExitAnimBegin */
    public void mo81221xf4beab2c() {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.mo81221xf4beab2c();
        }
    }

    @Override // na5.b
    /* renamed from: onPageExitAnimEnd */
    public void mo81222x460c801e() {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.mo81222x460c801e();
        }
    }

    @Override // na5.b
    /* renamed from: onPagePopEnterAnimBegin */
    public void mo81223x6668b263() {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.mo81223x6668b263();
        }
    }

    @Override // na5.b
    /* renamed from: onPagePopEnterAnimEnd */
    public void mo81224x3e2ce915() {
        android.view.Window window;
        android.view.Window window2;
        android.view.Window window3;
        getF292665d();
        x0("onPagePopEnterAnimEnd");
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.mo81224x3e2ce915();
        }
        xk5.b bVar = this.P;
        if (bVar != null) {
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a372 = this.f292654p;
            xk5.b bVar2 = null;
            xk5.b b17 = (abstractActivityC22579xbed01a372 == null || (window3 = abstractActivityC22579xbed01a372.getWindow()) == null) ? null : xk5.c.b(window3, false);
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a373 = this.f292654p;
            if (abstractActivityC22579xbed01a373 != null && (window2 = abstractActivityC22579xbed01a373.getWindow()) != null) {
                xk5.c.a(window2, bVar);
            }
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a374 = this.f292654p;
            if (abstractActivityC22579xbed01a374 != null && (window = abstractActivityC22579xbed01a374.getWindow()) != null) {
                bVar2 = xk5.c.b(window, false);
            }
            getF292665d();
            java.util.Objects.toString(b17);
            java.util.Objects.toString(bVar2);
        }
    }

    @Override // na5.b
    /* renamed from: onPagePopExitAnimBegin */
    public void mo81225x9c5afff7() {
        if (this.A.getBooleanExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39704x5734e7fe, false)) {
            getF292665d();
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
            if (mo7430x19263085 instanceof com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8) {
                ((com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8) mo7430x19263085).X6();
            }
        }
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.mo81225x9c5afff7();
        }
    }

    @Override // na5.b
    /* renamed from: onPagePopExitAnimEnd */
    public void mo81226x15bd8ba9() {
        if (this.A.getBooleanExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39704x5734e7fe, false)) {
            getF292665d();
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
            if (abstractActivityC22579xbed01a37 != null) {
                abstractActivityC22579xbed01a37.finish();
            }
        }
        this.F = true;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a372 = this.f292654p;
        if (abstractActivityC22579xbed01a372 != null) {
            abstractActivityC22579xbed01a372.mo81226x15bd8ba9();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        getF292665d();
        super.mo7512xb01dfb57();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPrepareOptionsMenu */
    public void mo7514x99b541d5(android.view.Menu menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.onPrepareOptionsMenu(menu);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onRequestPermissionsResult */
    public void mo7516x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.mo7516x953457f1(i17, permissions, grantResults);
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.onRequestPermissionsResult(i17, permissions, grantResults);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        android.view.View view;
        super.mo7517x57429eec();
        getF292665d();
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f292655q;
        android.view.ViewParent viewParent = null;
        java.util.Objects.toString(c22584xf7d97e83 != null ? c22584xf7d97e83.f292656r : null);
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e832 = this.f292655q;
        if (c22584xf7d97e832 != null && (view = c22584xf7d97e832.f292656r) != null) {
            viewParent = view.getParent();
        }
        java.util.Objects.toString(viewParent);
        android.widget.FrameLayout frameLayout = this.f292657s;
        if (frameLayout != null) {
            frameLayout.getChildCount();
        }
        android.view.View view2 = this.f292656r;
        if (view2 != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.s(view2, 1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onSaveInstanceState */
    public void mo7404xa71a2260(android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
        super.mo7404xa71a2260(outState);
        getF292665d();
        outState.toString();
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        outState.putInt("KEY_ACTIONBAR_COLOR", abstractActivityC22579xbed01a37 != null ? abstractActivityC22579xbed01a37.mo78508x85b50c3c() : 0);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        getF292665d();
        view.toString();
        java.util.Objects.toString(bundle);
        this.f292658t = view.findViewById(com.p314xaae8f345.mm.R.id.hvf);
        this.f292659u = view.findViewById(com.p314xaae8f345.mm.R.id.f563971el);
        this.f292660v = view.findViewById(com.p314xaae8f345.mm.R.id.owf);
        this.f292661w = view.findViewById(com.p314xaae8f345.mm.R.id.f569067ow4);
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            mo273xed6858b4().a(abstractActivityC22579xbed01a37);
        }
        w0(bundle);
    }

    public final void q0(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.ArrayList arrayList = this.H;
        if (arrayList.contains(callback)) {
            return;
        }
        arrayList.add(callback);
    }

    public final void r0(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = mo7430x19263085 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) mo7430x19263085 : null;
        if (activityC21401x6ce6f73f == null || (m78735x28280f95 = activityC21401x6ce6f73f.m78735x28280f95()) == null) {
            return;
        }
        m78735x28280f95.m81450x8e764904(z17);
    }

    public final void s0(boolean z17) {
        if (A0()) {
            r0(z17);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab = this.f292662x;
            if (c22649x858f5ab != null) {
                c22649x858f5ab.m81450x8e764904(false);
                return;
            }
            return;
        }
        r0(false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab2 = this.f292662x;
        if (c22649x858f5ab2 != null) {
            c22649x858f5ab2.m81450x8e764904(z17);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: setArguments */
    public void mo7562xe26dab14(android.os.Bundle bundle) {
        super.mo7562xe26dab14(bundle);
        android.content.Intent intent = new android.content.Intent();
        this.A = intent;
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        intent.putExtras(bundle);
    }

    @Override // tk5.a
    /* renamed from: t, reason: from getter */
    public tk5.c getF290357e() {
        return this.G;
    }

    public final sk5.c t0() {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        com.p314xaae8f345.mm.ui.vas.ActivityC22582xf7828f42 activityC22582xf7828f42 = mo7430x19263085 instanceof com.p314xaae8f345.mm.ui.vas.ActivityC22582xf7828f42 ? (com.p314xaae8f345.mm.ui.vas.ActivityC22582xf7828f42) mo7430x19263085 : null;
        if (activityC22582xf7828f42 != null) {
            return (sk5.c) ((jz5.n) activityC22582xf7828f42.f292651g).mo141623x754a37bb();
        }
        return null;
    }

    @Override // tk5.a
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 u() {
        return this;
    }

    public java.lang.Class u0() {
        return com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83.class;
    }

    public final void w0(android.os.Bundle bundle) {
        android.view.ViewGroup.LayoutParams layoutParams;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        boolean z17 = mo7430x19263085 instanceof com.p314xaae8f345.mm.ui.vas.ActivityC22582xf7828f42;
        if (!z17) {
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f292654p;
            if (!((abstractActivityC22579xbed01a37 == null || abstractActivityC22579xbed01a37.m81188x60276c93()) ? false : true)) {
                return;
            }
        }
        if (z17) {
            ((com.p314xaae8f345.mm.ui.vas.ActivityC22582xf7828f42) mo7430x19263085).W6();
        }
        android.view.ViewGroup viewGroup = this.f292663y;
        if (viewGroup != null && (viewGroup instanceof vj5.h)) {
            ((vj5.h) viewGroup).s(true);
        }
        if (this.L) {
            android.view.View view = this.f292660v;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/vas/VASCommonFragment", "handleActionBarAndStatusBar", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/vas/VASCommonFragment", "handleActionBarAndStatusBar", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            int a17 = fp.j0.a(mo7438x76847179(), -1);
            android.view.View view2 = this.f292660v;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/vas/VASCommonFragment", "handleActionBarAndStatusBar", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/vas/VASCommonFragment", "handleActionBarAndStatusBar", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.f292660v;
            if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                layoutParams.height = a17;
                android.view.View view4 = this.f292660v;
                if (view4 != null) {
                    view4.setLayoutParams(layoutParams);
                }
            }
            sk5.c t07 = t0();
            if (t07 != null) {
                com.p314xaae8f345.mm.ui.vas.ActivityC22582xf7828f42 activityC22582xf7828f42 = ((lk5.v) t07).f400598a;
                android.view.ViewGroup.LayoutParams layoutParams2 = activityC22582xf7828f42.V6().getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = a17;
                    activityC22582xf7828f42.V6().setLayoutParams(marginLayoutParams);
                }
            }
        }
        y0();
        if (bundle == null) {
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a372 = this.f292654p;
            if (abstractActivityC22579xbed01a372 != null) {
                abstractActivityC22579xbed01a372.mo64405x4dab7448(abstractActivityC22579xbed01a372.mo78508x85b50c3c());
                return;
            }
            return;
        }
        if (bundle.containsKey("KEY_ACTIONBAR_COLOR")) {
            int i17 = bundle.getInt("KEY_ACTIONBAR_COLOR");
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a373 = this.f292654p;
            if (abstractActivityC22579xbed01a373 == null) {
                return;
            }
            abstractActivityC22579xbed01a373.mo64405x4dab7448(i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if ((r6 != null && r6.m81216xbe3b0bc()) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0(java.lang.String r6) {
        /*
            r5 = this;
            android.widget.FrameLayout r6 = r5.f292657s
            r0 = 0
            r1 = 2131324142(0x7f096cee, float:1.8266983E38)
            if (r6 == 0) goto Lb
            r6.setTag(r1, r0)
        Lb:
            com.tencent.mm.ui.vas.VASActivity r6 = r5.f292654p
            r2 = 1
            r3 = 0
            if (r6 == 0) goto L19
            boolean r6 = r6.getF147381t()
            if (r6 != r2) goto L19
            r6 = r2
            goto L1a
        L19:
            r6 = r3
        L1a:
            if (r6 == 0) goto L2c
            com.tencent.mm.ui.vas.VASActivity r6 = r5.f292654p
            if (r6 == 0) goto L28
            boolean r6 = r6.m81216xbe3b0bc()
            if (r6 != r2) goto L28
            r6 = r2
            goto L29
        L28:
            r6 = r3
        L29:
            if (r6 == 0) goto L2c
            goto L2d
        L2c:
            r2 = r3
        L2d:
            r5.getF292665d()
            com.tencent.mm.ui.vas.VASCommonFragment r6 = r5.f292655q
            if (r2 != 0) goto L35
            goto L73
        L35:
            if (r6 == 0) goto L39
            android.view.View r0 = r6.f292656r
        L39:
            android.widget.FrameLayout r6 = r5.f292657s
            if (r0 == 0) goto L73
            if (r6 == 0) goto L73
            android.view.ViewParent r2 = r0.getParent()
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r6)
            if (r4 == 0) goto L53
            r6.getChildCount()
            java.util.Objects.toString(r2)
            r0.toString()
            goto L61
        L53:
            if (r2 != 0) goto L61
            r6.addView(r0, r3)
            r6.setTag(r1, r0)
            r6.getChildCount()
            r0.toString()
        L61:
            java.util.WeakHashMap r6 = n3.l1.f415895a
            r6 = 4
            n3.u0.s(r0, r6)
            float r6 = r0.getTranslationX()
            r5.I = r6
            r5.getF292665d()
            r0.hashCode()
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83.x0(java.lang.String):void");
    }

    public void y0() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.Window window;
        android.view.View decorView;
        if (com.p314xaae8f345.mm.ui.b4.c(mo7438x76847179())) {
            getF292665d();
            android.view.View view = this.f292661w;
            if (view != null) {
                com.p314xaae8f345.mm.ui.a4.f278650a.m(view, new lk5.d0(this), this);
                return;
            }
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        boolean z17 = (((mo7430x19263085 == null || (window = mo7430x19263085.getWindow()) == null || (decorView = window.getDecorView()) == null) ? 0 : decorView.getSystemUiVisibility()) & 2) == 0;
        getF292665d();
        if (z17) {
            android.view.View view2 = this.f292661w;
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/vas/VASCommonFragment", "handleNavigationBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/vas/VASCommonFragment", "handleNavigationBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f292661w;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/vas/VASCommonFragment", "handleNavigationBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/vas/VASCommonFragment", "handleNavigationBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view4 = this.f292661w;
        if (view4 == null || (layoutParams = view4.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = com.p314xaae8f345.mm.ui.bl.c(mo7438x76847179());
        android.view.View view5 = this.f292661w;
        if (view5 == null) {
            return;
        }
        view5.setLayoutParams(layoutParams);
    }

    public final boolean z0() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        if (!A0()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab = this.f292662x;
            return c22649x858f5ab != null && c22649x858f5ab.f292963h;
        }
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = mo7430x19263085 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) mo7430x19263085 : null;
        return (activityC21401x6ce6f73f == null || (m78735x28280f95 = activityC21401x6ce6f73f.m78735x28280f95()) == null || !m78735x28280f95.f292963h) ? false : true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public void mo7397x3b13c504(android.content.Context context) {
        p012xc85e97e9.p087x9da2e250.app.v0 m81204xa54b4856;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        getF292665d();
        context.toString();
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        if (m7436x8619eaa0 != null) {
            java.io.Serializable serializable = m7436x8619eaa0.getSerializable(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39697xfa441f0a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(serializable, "null cannot be cast to non-null type java.lang.Class<com.tencent.mm.ui.vas.VASActivity>");
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) ((java.lang.Class) serializable).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            this.f292654p = abstractActivityC22579xbed01a37;
            if (abstractActivityC22579xbed01a37 != null && (m81204xa54b4856 = abstractActivityC22579xbed01a37.m81204xa54b4856()) != null) {
                java.lang.reflect.Field declaredField = p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.class.getDeclaredField("mHost");
                declaredField.setAccessible(true);
                declaredField.set(m7437x54c0aef7(), m81204xa54b4856);
            }
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a372 = this.f292654p;
            if (abstractActivityC22579xbed01a372 != null) {
                abstractActivityC22579xbed01a372.m81237xc295423e(m7437x54c0aef7());
            }
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a373 = this.f292654p;
            if (abstractActivityC22579xbed01a373 != null) {
                abstractActivityC22579xbed01a373.m81240x63d83916(m7454x171a637d());
            }
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a374 = this.f292654p;
            if (abstractActivityC22579xbed01a374 != null) {
                abstractActivityC22579xbed01a374.m81238x8757258d(this);
            }
            if (mo7430x19263085 != null) {
                com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a375 = this.f292654p;
                if (abstractActivityC22579xbed01a375 != null) {
                    abstractActivityC22579xbed01a375.m81236x8700364c(mo7430x19263085);
                }
                com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a376 = this.f292654p;
                if (abstractActivityC22579xbed01a376 != null) {
                    abstractActivityC22579xbed01a376.m81232xe215ffb(mo7430x19263085);
                }
                try {
                    java.lang.reflect.Field declaredField2 = android.app.Activity.class.getDeclaredField("mApplication");
                    declaredField2.setAccessible(true);
                    declaredField2.set(this.f292654p, mo7430x19263085.getApplication());
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(getF292665d(), th6, "onAttach application err", new java.lang.Object[0]);
                }
                try {
                    java.lang.reflect.Field declaredField3 = android.app.Activity.class.getDeclaredField("mMainThread");
                    declaredField3.setAccessible(true);
                    declaredField3.set(this.f292654p, declaredField3.get(mo7430x19263085));
                    java.lang.reflect.Field declaredField4 = android.app.Activity.class.getDeclaredField("mInstrumentation");
                    declaredField4.setAccessible(true);
                    declaredField4.set(this.f292654p, declaredField4.get(mo7430x19263085));
                    java.lang.reflect.Field declaredField5 = android.app.Activity.class.getDeclaredField("mComponent");
                    declaredField5.setAccessible(true);
                    android.content.Intent intent = this.A;
                    declaredField5.set(this.f292654p, intent != null ? intent.getComponent() : null);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(getF292665d(), th7, "bindRealActivityData err", new java.lang.Object[0]);
                }
            }
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a377 = this.f292654p;
            if (abstractActivityC22579xbed01a377 != null) {
                abstractActivityC22579xbed01a377.m81218x4861446e();
            }
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a378 = this.f292654p;
            if (abstractActivityC22579xbed01a378 != null) {
                abstractActivityC22579xbed01a378.m81208xbfb7b9b4();
            }
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a379 = this.f292654p;
            if (abstractActivityC22579xbed01a379 != null) {
                abstractActivityC22579xbed01a379.m78503xa10faa4c(true);
            }
        }
        super.mo7397x3b13c504(context);
        java.util.Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((yz5.l) it.next()).mo146xb9724478(this.f292654p);
        }
    }
}
