package dk3;

/* loaded from: classes8.dex */
public final class c implements ak3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk3.e f315980a;

    public c(dk3.e eVar) {
        this.f315980a = eVar;
    }

    @Override // ak3.a
    public void a(android.view.MotionEvent event) {
        boolean contains;
        android.animation.Animator animator;
        android.widget.ImageView imageView;
        android.animation.Animator animator2;
        android.widget.ImageView imageView2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        dk3.e eVar = this.f315980a;
        if (eVar.f315982a.a()) {
            return;
        }
        eVar.f315995n = event.getX();
        boolean z17 = eVar.f315990i;
        if (eVar.f315991j) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2 c16600x72af54f2 = eVar.f315985d;
            int rawX = (int) event.getRawX();
            int rawY = (int) event.getRawY();
            if (c16600x72af54f2 == null) {
                contains = false;
            } else {
                int[] iArr = new int[2];
                c16600x72af54f2.getLocationOnScreen(iArr);
                int i17 = iArr[0];
                int i18 = iArr[1];
                contains = new android.graphics.Rect(i17, i18, c16600x72af54f2.getWidth() + i17, c16600x72af54f2.getHeight() + i18).contains(rawX, rawY);
            }
            eVar.f315990i = contains;
        } else {
            eVar.f315990i = false;
        }
        boolean z18 = eVar.f315990i;
        if (eVar.f315991j && z18 != z17) {
            if (z18) {
                android.widget.FrameLayout.LayoutParams layoutParams = eVar.f315988g;
                if (layoutParams != null) {
                    layoutParams.bottomMargin = eVar.f315987f;
                }
                if (layoutParams != null) {
                    layoutParams.rightMargin = eVar.f315986e;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2 c16600x72af54f22 = eVar.f315985d;
                if (c16600x72af54f22 != null) {
                    c16600x72af54f22.setLayoutParams(layoutParams);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2 c16600x72af54f23 = eVar.f315985d;
            if (c16600x72af54f23 != null) {
                boolean z19 = eVar.f315990i;
                int i19 = com.p314xaae8f345.mm.R.raw.f79989x906fa3af;
                if (z19) {
                    android.os.Vibrator vibrator = c16600x72af54f23.f231948g;
                    if (vibrator != null) {
                        vibrator.vibrate(10L);
                    }
                    android.widget.ImageView imageView3 = c16600x72af54f23.indicatorImageView;
                    if (imageView3 != null) {
                        android.graphics.drawable.Drawable drawable = c16600x72af54f23.f231952n;
                        if (drawable == null) {
                            android.content.res.Resources resources = c16600x72af54f23.getResources();
                            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai()) {
                                i19 = com.p314xaae8f345.mm.R.raw.f80682x8641f9df;
                            }
                            drawable = m95.a.e(resources, i19, 0.0f);
                        }
                        imageView3.setImageDrawable(drawable);
                    }
                    if (c16600x72af54f23.a() && (imageView2 = c16600x72af54f23.indicatorImageView) != null) {
                        imageView2.setColorFilter(new android.graphics.PorterDuffColorFilter(b3.l.m9702x7444d5ad(c16600x72af54f23.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.adh), android.graphics.PorterDuff.Mode.SRC_IN));
                    }
                    android.animation.Animator animator3 = c16600x72af54f23.f231949h;
                    if ((animator3 != null && animator3.isRunning()) && (animator2 = c16600x72af54f23.f231949h) != null) {
                        animator2.cancel();
                    }
                    android.widget.ImageView imageView4 = c16600x72af54f23.f231945d;
                    if (imageView4 != null) {
                        imageView4.setScaleX(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232023g);
                    }
                    android.widget.ImageView imageView5 = c16600x72af54f23.f231945d;
                    if (imageView5 != null) {
                        imageView5.setScaleY(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232023g);
                    }
                    android.widget.ImageView imageView6 = c16600x72af54f23.indicatorImageView;
                    if (imageView6 != null) {
                        imageView6.setScaleX(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232023g);
                    }
                    android.widget.ImageView imageView7 = c16600x72af54f23.indicatorImageView;
                    if (imageView7 != null) {
                        imageView7.setScaleY(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232023g);
                    }
                } else {
                    android.widget.ImageView imageView8 = c16600x72af54f23.indicatorImageView;
                    if (imageView8 != null) {
                        android.graphics.drawable.Drawable drawable2 = c16600x72af54f23.f231952n;
                        if (drawable2 == null) {
                            android.content.res.Resources resources2 = c16600x72af54f23.getResources();
                            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai()) {
                                i19 = com.p314xaae8f345.mm.R.raw.f80682x8641f9df;
                            }
                            drawable2 = m95.a.e(resources2, i19, 0.0f);
                        }
                        imageView8.setImageDrawable(drawable2);
                    }
                    if (c16600x72af54f23.a() && (imageView = c16600x72af54f23.indicatorImageView) != null) {
                        imageView.setColorFilter(new android.graphics.PorterDuffColorFilter(b3.l.m9702x7444d5ad(c16600x72af54f23.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.adh), android.graphics.PorterDuff.Mode.SRC_IN));
                    }
                    android.animation.Animator animator4 = c16600x72af54f23.f231950i;
                    if ((animator4 != null && animator4.isRunning()) && (animator = c16600x72af54f23.f231950i) != null) {
                        animator.cancel();
                    }
                    android.widget.ImageView imageView9 = c16600x72af54f23.f231945d;
                    if (imageView9 != null) {
                        imageView9.setScaleX(1.0f);
                    }
                    android.widget.ImageView imageView10 = c16600x72af54f23.f231945d;
                    if (imageView10 != null) {
                        imageView10.setScaleY(1.0f);
                    }
                    android.widget.ImageView imageView11 = c16600x72af54f23.indicatorImageView;
                    if (imageView11 != null) {
                        imageView11.setScaleX(1.0f);
                    }
                    android.widget.ImageView imageView12 = c16600x72af54f23.indicatorImageView;
                    if (imageView12 != null) {
                        imageView12.setScaleY(1.0f);
                    }
                }
            }
        }
        eVar.f315994m = event.getRawX();
    }

    @Override // ak3.a
    public void c(int i17, int i18) {
        kk3.g gVar;
        dk3.e eVar = this.f315980a;
        if (eVar.f315982a.a() || i17 != 1 || (gVar = eVar.f315984c) == null) {
            return;
        }
        jk3.v vVar = ((jk3.l) gVar).f381625a;
        ak3.c cVar = vVar.f381644d;
        if (cVar != null) {
            cVar.g();
        }
        ak3.c cVar2 = vVar.f381644d;
        vVar.f381656p = cVar2 != null ? cVar2.mo2158x12501425() : null;
    }

    @Override // ak3.a
    public boolean d(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        return false;
    }

    @Override // ak3.a
    public int e() {
        return 0;
    }

    @Override // ak3.a
    /* renamed from: enableSwipeBack */
    public boolean mo2155xd71108fe() {
        return true;
    }

    @Override // ak3.a
    public void f(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2 c16600x72af54f2;
        dk3.e eVar = this.f315980a;
        if (eVar.f315982a.a() || eVar.f315992k) {
            return;
        }
        if (eVar.f315993l < 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            eVar.f315993l = java.lang.System.currentTimeMillis();
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.System.currentTimeMillis();
        long j17 = eVar.f315993l;
        boolean z19 = eVar.f315991j;
        if (!((eVar.f315990i || (f17 >= 0.1f && f17 < 0.9f)) && java.lang.System.currentTimeMillis() - eVar.f315993l > 200)) {
            eVar.b();
            return;
        }
        if (!eVar.f315991j) {
            eVar.d();
        }
        if (!eVar.f315990i) {
            if (eVar.f315996o == -1) {
                eVar.f315996o = eVar.f315995n;
            }
            android.view.ViewGroup a17 = eVar.f315983b.a();
            int width = a17 != null ? a17.getWidth() : i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            float f18 = eVar.f315995n;
            long j18 = eVar.f315996o;
            float f19 = width;
            float f27 = (f18 - ((float) j18)) / f19;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232022f;
            float f28 = ((float) ((width - i17) - j18)) / f19;
            if (f28 < 0.0f) {
                f28 = f27;
            }
            float f29 = f27 / f28;
            float f37 = f29 >= 0.0f ? f29 : 0.0f;
            if (f37 > 1.0f) {
                f37 = 1.0f;
            }
            int i18 = (int) (f37 * i17);
            if (eVar.f315989h) {
                eVar.f315987f = (-i17) + i18;
                eVar.f315986e = (eVar.a() - i17) + i18;
            } else {
                eVar.f315986e = (-i17) + i18;
                eVar.f315987f = (eVar.a() - i17) + i18;
            }
            android.widget.FrameLayout.LayoutParams layoutParams = eVar.f315988g;
            if (layoutParams != null) {
                layoutParams.bottomMargin = eVar.f315987f;
            }
            if (layoutParams != null) {
                layoutParams.rightMargin = eVar.f315986e;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2 c16600x72af54f22 = eVar.f315985d;
            if (c16600x72af54f22 != null) {
                c16600x72af54f22.setLayoutParams(layoutParams);
            }
        }
        if (eVar.f315991j || (c16600x72af54f2 = eVar.f315985d) == null) {
            return;
        }
        c16600x72af54f2.setVisibility(0);
        eVar.f315991j = true;
    }

    @Override // ak3.a
    public boolean g() {
        return false;
    }

    @Override // ak3.a
    public int h(boolean z17) {
        android.graphics.Point point;
        int i17;
        dk3.e eVar = this.f315980a;
        if (eVar.f315982a.a()) {
            return 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "onSwipeReleased, willSwipeBack:%s, isIndicatorHit:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(eVar.f315990i));
        eVar.f315995n = 0.0f;
        eVar.f315996o = -1L;
        eVar.f315993l = -1L;
        eVar.f315992k = z17;
        eVar.b();
        if (!z17) {
            eVar.f315990i = false;
            return 1;
        }
        if (!eVar.f315990i) {
            return 1;
        }
        eVar.f315990i = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "onSwipeReleased, swipe to float ball");
        kk3.g gVar = eVar.f315984c;
        java.lang.Integer num = null;
        if (gVar != null) {
            float f17 = eVar.f315994m;
            jk3.v vVar = ((jk3.l) gVar).f381625a;
            if (vVar.a() && vVar.s()) {
                i17 = 1;
            } else {
                vVar.j();
                if (vVar.Z()) {
                    r45.kr4 kr4Var = vVar.f381612c;
                    r45.er4 er4Var = kr4Var != null ? (r45.er4) kr4Var.m75936x14adae67(6) : null;
                    if (er4Var != null) {
                        er4Var.set(0, 7L);
                    }
                    r45.kr4 kr4Var2 = vVar.f381612c;
                    r45.er4 er4Var2 = kr4Var2 != null ? (r45.er4) kr4Var2.m75936x14adae67(6) : null;
                    if (er4Var2 != null) {
                        er4Var2.set(1, java.lang.Long.valueOf(vVar.s() ? 1L : 2L));
                    }
                    android.graphics.Point Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Bi();
                    vVar.f381661u = true;
                    ak3.c cVar = vVar.f381644d;
                    if (cVar != null) {
                        android.graphics.Bitmap bitmap = vVar.f381656p;
                        kk3.d dVar = vVar.f381645e;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f575202l73);
                        if (cVar.c()) {
                            point = Bi;
                            cVar.f(new ck3.o(dVar, Bi, cVar, bitmap, false, f17, true, false));
                        } else {
                            point = Bi;
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ck3.p(dVar));
                        }
                    } else {
                        point = Bi;
                    }
                    jk3.v.N(vVar, 7);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "swipePageToMultiTask ballPosition: {" + java.lang.Integer.valueOf(point.x) + ' ' + java.lang.Integer.valueOf(point.y) + '}');
                    i17 = 3;
                } else {
                    i17 = 2;
                }
            }
            num = java.lang.Integer.valueOf(i17);
        }
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue != 2) {
            return intValue;
        }
        eVar.f315992k = false;
        return 2;
    }
}
