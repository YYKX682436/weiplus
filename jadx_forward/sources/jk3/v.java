package jk3;

/* loaded from: classes8.dex */
public abstract class v extends jk3.b implements kk3.e {

    /* renamed from: d, reason: collision with root package name */
    public final ak3.c f381644d;

    /* renamed from: e, reason: collision with root package name */
    public kk3.d f381645e;

    /* renamed from: f, reason: collision with root package name */
    public kk3.d f381646f;

    /* renamed from: g, reason: collision with root package name */
    public kk3.g f381647g;

    /* renamed from: h, reason: collision with root package name */
    public dk3.f f381648h;

    /* renamed from: i, reason: collision with root package name */
    public ek3.a f381649i;

    /* renamed from: j, reason: collision with root package name */
    public kk3.d f381650j;

    /* renamed from: k, reason: collision with root package name */
    public jk3.d f381651k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f381652l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381653m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f381654n;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Bitmap f381656p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f381657q;

    /* renamed from: r, reason: collision with root package name */
    public jk3.f f381658r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f381659s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f381660t;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.m0 f381662v;

    /* renamed from: w, reason: collision with root package name */
    public int f381663w;

    /* renamed from: o, reason: collision with root package name */
    public int f381655o = -1;

    /* renamed from: u, reason: collision with root package name */
    public boolean f381661u = true;

    public v(ak3.c cVar) {
        this.f381644d = cVar;
    }

    public static final void M(jk3.v vVar) {
        android.graphics.Bitmap bitmap;
        ak3.c cVar = vVar.f381644d;
        if ((cVar != null ? ((ak3.i) cVar).f87121m : null) != null) {
            if (cVar != null && (bitmap = ((ak3.i) cVar).f87121m) != null) {
                bitmap.recycle();
            }
            if (cVar == null) {
                return;
            }
            ((ak3.i) cVar).f87121m = null;
        }
    }

    public static final void N(jk3.v vVar, int i17) {
        if (vVar.T()) {
            switch (i17) {
                case 7:
                    vVar.f381663w = 1;
                    break;
                case 8:
                    vVar.f381663w = 2;
                    break;
                case 9:
                    vVar.f381663w = 3;
                    break;
                case 10:
                    vVar.f381663w = 4;
                    break;
                default:
                    vVar.f381663w = 0;
                    break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.m0 m0Var = vVar.f381662v;
            if (m0Var != null) {
                m0Var.e(vVar.f381663w);
            }
        }
    }

    @Override // jk3.b
    public void C(boolean z17, int i17) {
        W(z17, i17, jk3.c.f381613d);
    }

    public void O(jk3.g gVar) {
        if (gVar != null) {
            gVar.a();
        }
    }

    public final android.graphics.Bitmap P(android.graphics.Bitmap bitmap, boolean z17) {
        r45.lr4 v07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        ak3.c cVar = this.f381644d;
        android.app.Activity mo2157x19263085 = cVar != null ? cVar.mo2157x19263085() : null;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).getClass();
        if (mo2157x19263085 == null ? false : ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Di(mo2157x19263085)) {
            return null;
        }
        if (!v()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
            v07 = c16601x7ed0e40c != null ? c16601x7ed0e40c.v0() : null;
            if (v07 != null) {
                v07.set(9, 0);
            }
            return bitmap;
        }
        if (bitmap != null) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = this.f381610a;
                r45.lr4 v08 = c16601x7ed0e40c2 != null ? c16601x7ed0e40c2.v0() : null;
                if (v08 != null) {
                    v08.set(9, 90);
                }
                if (cVar == null || al3.a.f87378a.a(((ak3.i) cVar).f87122n)) {
                    return null;
                }
                try {
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    float f17 = 2;
                    matrix.setRotate(90, width / f17, height / f17);
                    zj0.a aVar = new zj0.a();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    aVar.c(java.lang.Boolean.TRUE);
                    aVar.c(matrix);
                    aVar.c(java.lang.Integer.valueOf((int) height));
                    aVar.c(java.lang.Integer.valueOf((int) width));
                    aVar.c(0);
                    aVar.c(0);
                    aVar.c(bitmap);
                    java.lang.Object obj = new java.lang.Object();
                    yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/multitask/adapter/MultiTaskPageAdapter", "getBitmap", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                    yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/multitask/adapter/MultiTaskPageAdapter", "getBitmap", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                    return createBitmap;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTaskPageAdapter", "get rotate bitmap failed", th6);
                    return null;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c3 = this.f381610a;
            v07 = c16601x7ed0e40c3 != null ? c16601x7ed0e40c3.v0() : null;
            if (v07 != null) {
                v07.set(9, 0);
            }
        }
        return bitmap;
    }

    public void Q(boolean z17) {
        this.f381645e = new jk3.j(this, z17);
    }

    public final void R() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2 c16600x72af54f2;
        android.widget.ImageView imageView;
        java.lang.String m9713x2fec8307;
        boolean a17 = a();
        ak3.c cVar = this.f381644d;
        if (a17 && s()) {
            if (x() || c(0)) {
                if ((cVar != null ? cVar.mo2157x19263085() : null) instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                    if (this.f381649i == null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
                        fk3.o oVar = new fk3.o();
                        this.f381649i = oVar;
                        if (cVar != null) {
                            oVar.e(cVar, this, this.f381646f);
                        }
                    }
                    this.f381659s = x();
                    return;
                }
                if ((cVar != null ? cVar.mo2157x19263085() : null) instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
                    if (this.f381649i == null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
                        gk3.m mVar = new gk3.m();
                        this.f381649i = mVar;
                        if (cVar != null) {
                            mVar.d(cVar, this, this.f381646f);
                        }
                    }
                    this.f381659s = x();
                    return;
                }
                return;
            }
            return;
        }
        if (x() && this.f381648h == null) {
            if (cVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
                kk3.g gVar = this.f381647g;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).getClass();
                this.f381648h = new dk3.e(this, cVar, gVar);
            }
            dk3.f fVar = this.f381648h;
            if (fVar != null) {
                ((dk3.e) fVar).c();
            }
            dk3.f fVar2 = this.f381648h;
            if (fVar2 == null || (c16600x72af54f2 = ((dk3.e) fVar2).f315985d) == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMultiTaskIndicatorView", "onFloatBallInfoCountChanged");
            android.widget.TextView textView = c16600x72af54f2.indicatorTextView;
            if (textView != null) {
                android.content.Context context = c16600x72af54f2.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai()) {
                    m9713x2fec8307 = b3.l.m9713x2fec8307(context, com.p314xaae8f345.mm.R.C30867xcad56011.c0x);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m9713x2fec8307);
                } else {
                    m9713x2fec8307 = b3.l.m9713x2fec8307(context, com.p314xaae8f345.mm.R.C30867xcad56011.h0u);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m9713x2fec8307);
                }
                textView.setText(m9713x2fec8307);
            }
            android.widget.TextView textView2 = c16600x72af54f2.indicatorTextView;
            if (textView2 != null) {
                textView2.setTextColor(b3.l.m9702x7444d5ad(c16600x72af54f2.getContext(), c16600x72af54f2.a() ? com.p314xaae8f345.mm.R.C30859x5a72f63.adh : com.p314xaae8f345.mm.R.C30859x5a72f63.f560662qs));
            }
            android.widget.ImageView imageView2 = c16600x72af54f2.f231945d;
            if (imageView2 != null) {
                imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562417en);
            }
            android.widget.ImageView imageView3 = c16600x72af54f2.indicatorImageView;
            if (imageView3 != null) {
                imageView3.setImageDrawable(m95.a.e(c16600x72af54f2.getResources(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() ? com.p314xaae8f345.mm.R.raw.f79989x906fa3af : com.p314xaae8f345.mm.R.raw.f80681xd9394cca, 0.0f));
            }
            if (!c16600x72af54f2.a() || (imageView = c16600x72af54f2.indicatorImageView) == null) {
                return;
            }
            imageView.setColorFilter(new android.graphics.PorterDuffColorFilter(b3.l.m9702x7444d5ad(c16600x72af54f2.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.adh), android.graphics.PorterDuff.Mode.SRC_IN));
        }
    }

    public final void S(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "finishPage");
        if (T() && !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "is not need to finish page");
            return;
        }
        ak3.c cVar = this.f381644d;
        if ((cVar != null ? cVar.mo2157x19263085() : null) instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new jk3.p(this), 200L);
        }
        if (cVar != null) {
            cVar.j(false, this);
        }
    }

    public final boolean T() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U(int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jk3.v.U(int, boolean):boolean");
    }

    public void V(boolean z17, int i17, jk3.c animType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animType, "animType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "animType: %s", animType.toString());
        W(z17, i17, animType);
    }

    public final void W(boolean z17, int i17, jk3.c cVar) {
        r45.kr4 kr4Var = this.f381612c;
        r45.er4 er4Var = kr4Var != null ? (r45.er4) kr4Var.m75936x14adae67(6) : null;
        if (er4Var != null) {
            er4Var.set(0, java.lang.Long.valueOf(i17));
        }
        if (!a() || !s()) {
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "onMenuMultiTaskSelected, enter multiTask, type: %d", java.lang.Integer.valueOf(i17));
                O(new jk3.r(this, cVar, i17));
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "onMenuMultiTaskSelected, do nothing");
                a0();
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "onMenuMultiTaskSelected, has info, type: %d", java.lang.Integer.valueOf(i17));
        r45.kr4 kr4Var2 = this.f381612c;
        r45.er4 er4Var2 = kr4Var2 != null ? (r45.er4) kr4Var2.m75936x14adae67(6) : null;
        if (er4Var2 != null) {
            er4Var2.set(1, 1L);
        }
        if (!z17) {
            a0();
        }
        U(4, false);
    }

    public final void X(android.graphics.Bitmap bitmap, boolean z17, boolean z18, boolean z19, boolean z27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "onMultiTaskAnimDone, forceUpdate:" + z17 + ", needUpdateInfo:" + z18 + ", needShowTip:" + z19);
        if (z18) {
            l(bitmap, z17);
        }
        if (!z19) {
            S(z27);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        jk3.s sVar = new jk3.s(this, z27);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).getClass();
        ak3.c cVar = this.f381644d;
        if (cVar != null) {
            cVar.mo2157x19263085();
        }
        boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("multitask_tips_config").getBoolean(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).Di() ? "multitask_new_tips_show" : "multitask_tips_show", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskTipsHelper", "showTips, flag: " + z28);
        if (z28) {
            S(z27);
            return;
        }
        ok3.a aVar = new ok3.a(sVar);
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(aVar, 0L);
    }

    public void Y(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
    }

    public boolean Z() {
        return true;
    }

    @Override // jk3.b, jk3.e
    public boolean a() {
        r45.fr4 fr4Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f381652l)) {
            r45.w60 w60Var = this.f381611b;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((w60Var == null || (fr4Var = (r45.fr4) w60Var.m75936x14adae67(0)) == null) ? null : fr4Var.m75945x2fec8307(0)) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f381653m)) {
                return false;
            }
        }
        return true;
    }

    public final void a0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
        if (c16601x7ed0e40c != null) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ri(c16601x7ed0e40c) : false) {
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) c17;
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = this.f381610a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16601x7ed0e40c2);
                java.lang.String str = c16601x7ed0e40c2.f66791xc8a07680;
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c3 = this.f381610a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16601x7ed0e40c3);
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.C7(l0Var, str, c16601x7ed0e40c3.f66793x2262335f, false, 4, null);
                ak3.c cVar = this.f381644d;
                if ((cVar != null ? cVar.mo2157x19263085() : null) != null) {
                    android.app.Activity mo2157x19263085 = cVar != null ? cVar.mo2157x19263085() : null;
                    int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo2157x19263085);
                    e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.oa8);
                    e4Var.c();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c4 = this.f381610a;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var2).getClass();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class))).getClass();
                java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.f231977x.iterator();
                while (it.hasNext()) {
                    ((jk3.d) it.next()).a(0, c16601x7ed0e40c4);
                }
            }
        }
    }

    @Override // jk3.b, jk3.e
    public android.graphics.Bitmap b() {
        android.graphics.Bitmap a17;
        r45.fr4 fr4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        r45.w60 w60Var = this.f381611b;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            a17 = al3.b.f87382a.a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232039a.b("Home"), null);
        } else {
            a17 = al3.b.f87382a.a((w60Var == null || (fr4Var = (r45.fr4) w60Var.m75936x14adae67(0)) == null) ? null : fr4Var.m75945x2fec8307(3), null);
        }
        ((ku5.t0) ku5.t0.f394148d).q(new jk3.q(this));
        return a17;
    }

    public void b0(r45.w60 w60Var) {
        r45.kr4 kr4Var;
        r45.fr4 fr4Var;
        r45.fr4 fr4Var2;
        r45.fr4 fr4Var3;
        r45.fr4 fr4Var4;
        r45.fr4 fr4Var5;
        this.f381652l = (w60Var == null || (fr4Var5 = (r45.fr4) w60Var.m75936x14adae67(0)) == null) ? null : fr4Var5.m75945x2fec8307(1);
        this.f381653m = (w60Var == null || (fr4Var4 = (r45.fr4) w60Var.m75936x14adae67(0)) == null) ? null : fr4Var4.m75945x2fec8307(4);
        if (w60Var != null && (fr4Var3 = (r45.fr4) w60Var.m75936x14adae67(0)) != null) {
            fr4Var3.m75933x41a8a7f2(5);
        }
        if (w60Var != null && (fr4Var2 = (r45.fr4) w60Var.m75936x14adae67(0)) != null) {
            fr4Var2.m75933x41a8a7f2(6);
        }
        this.f381655o = (w60Var == null || (fr4Var = (r45.fr4) w60Var.m75936x14adae67(0)) == null) ? -1 : fr4Var.m75939xb282bd08(7);
        this.f381654n = w60Var != null && w60Var.m75933x41a8a7f2(2);
        this.f381611b = w60Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "commoninfo position: " + this.f381652l + ",ori_position: " + this.f381653m + ", itemPos:" + this.f381655o + ", fromTaskBar:" + java.lang.Boolean.valueOf(this.f381654n).booleanValue());
        if (a()) {
            pm0.v.V(n(), new jk3.t(this, w60Var));
            if (v()) {
                ak3.c cVar = this.f381644d;
                android.app.Activity mo2157x19263085 = cVar != null ? cVar.mo2157x19263085() : null;
                if (mo2157x19263085 != null) {
                    mo2157x19263085.setRequestedOrientation(-1);
                }
            }
        }
        if (w60Var == null && (kr4Var = this.f381612c) != null) {
            kr4Var.set(0, "");
        }
        if (w60Var != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w60Var.m75945x2fec8307(1))) {
                r45.kr4 kr4Var2 = this.f381612c;
                if (kr4Var2 != null) {
                    kr4Var2.set(0, w60Var.m75945x2fec8307(1));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
                if (c16601x7ed0e40c != null) {
                    r45.kr4 kr4Var3 = this.f381612c;
                    if (kr4Var3 != null) {
                        kr4Var3.set(3, java.lang.Integer.valueOf(c16601x7ed0e40c.f66793x2262335f));
                    }
                    r45.kr4 kr4Var4 = this.f381612c;
                    if (kr4Var4 != null) {
                        kr4Var4.set(2, c16601x7ed0e40c.f66791xc8a07680);
                    }
                }
                r45.kr4 kr4Var5 = this.f381612c;
                r45.gr4 gr4Var = kr4Var5 != null ? (r45.gr4) kr4Var5.m75936x14adae67(5) : null;
                if (gr4Var != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
                    gr4Var.set(0, java.lang.Long.valueOf(c01.id.c()));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "secdata multitask scene enter contextId: %s", w60Var.m75945x2fec8307(1));
            }
            r45.fr4 fr4Var6 = (r45.fr4) w60Var.m75936x14adae67(0);
            if (fr4Var6 != null) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (currentTimeMillis < fr4Var6.m75942xfb822ef2(8) || fr4Var6.m75942xfb822ef2(8) == 0) {
                    return;
                }
                r45.kr4 kr4Var6 = this.f381612c;
                r45.jr4 jr4Var = kr4Var6 != null ? (r45.jr4) kr4Var6.m75936x14adae67(8) : null;
                if (jr4Var != null) {
                    jr4Var.set(0, java.lang.Long.valueOf(currentTimeMillis - fr4Var6.m75942xfb822ef2(8)));
                }
                fr4Var6.set(8, 0L);
            }
        }
    }

    @Override // jk3.b, jk3.e
    public boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        ak3.c cVar = this.f381644d;
        android.app.Activity mo2157x19263085 = cVar != null ? cVar.mo2157x19263085() : null;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).getClass();
        if ((mo2157x19263085 == null ? false : ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Di(mo2157x19263085)) || T()) {
            return false;
        }
        return this.f381659s;
    }

    @Override // jk3.b, jk3.e
    public java.lang.String e() {
        return this.f381653m;
    }

    @Override // jk3.b, jk3.e
    public boolean f() {
        android.app.Activity mo2157x19263085;
        android.content.res.Resources resources;
        android.content.res.Configuration configuration;
        ak3.c cVar = this.f381644d;
        return (cVar == null || (mo2157x19263085 = cVar.mo2157x19263085()) == null || (resources = mo2157x19263085.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) ? false : true;
    }

    @Override // jk3.b, jk3.e
    /* renamed from: getPosition */
    public java.lang.String mo141063xa86cd69f() {
        return this.f381652l;
    }

    @Override // jk3.b, jk3.e
    public android.graphics.Bitmap h(android.graphics.Bitmap bitmap) {
        return P(bitmap, f());
    }

    @Override // jk3.b, jk3.e
    public void k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "showHome");
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.Bd((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) c17, 1, null, 0, null, 14, null);
        pm0.v.V(50L, new jk3.u(this));
    }

    @Override // kk3.e
    /* renamed from: onOrientationChange */
    public void mo141067x15072581(int i17) {
    }

    @Override // jk3.b
    public int p() {
        return this.f381655o;
    }

    @Override // jk3.b
    public void y(int i17, java.lang.String str) {
        android.app.Activity mo2157x19263085;
        r45.kr4 kr4Var;
        android.content.Intent mo2160x1e885992;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf222;
        java.lang.String str2;
        boolean z17;
        java.util.Collection collection;
        super.y(i17, str);
        ak3.c cVar = this.f381644d;
        if (cVar != null) {
            ak3.i iVar = (ak3.i) cVar;
            iVar.f87122n = i17;
            try {
                str2 = j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2553xb81dc63e.C20563xb0e4db7());
            } catch (java.lang.Exception unused) {
                str2 = null;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.f7430xad573197, str2)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    java.util.List g17 = new r26.t(",").g(str2, 0);
                    if (!g17.isEmpty()) {
                        java.util.ListIterator listIterator = g17.listIterator(g17.size());
                        while (listIterator.hasPrevious()) {
                            if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                                collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    collection = kz5.p0.f395529d;
                    if (kz5.z.G((java.lang.String[]) collection.toArray(new java.lang.String[0]), java.lang.String.valueOf(i17))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskPageAdapter", "enable expand edgeSize. type: " + i17);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskPageAdapter", "disable expand edgeSize. type: " + i17);
                    }
                }
                z17 = true;
                iVar.f87124p = z17;
            }
            z17 = false;
            iVar.f87124p = z17;
        }
        Q(false);
        this.f381646f = new jk3.o(this);
        this.f381647g = new jk3.l(this);
        if ((this instanceof pa3.p) && T()) {
            this.f381651k = new jk3.k(this);
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
            jk3.d dVar = this.f381651k;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).getClass();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class))).getClass();
            if (dVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.f231977x.add(dVar);
            }
        }
        this.f381662v = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ni();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
        pk3.l lVar = new pk3.l();
        lVar.f437992e = cVar;
        pk3.e eVar = lVar.f437991d;
        if ((eVar != null) && eVar != null && (c16602xcd2cf222 = eVar.f437974a) != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) c16602xcd2cf222.f232044g).add(this);
        }
        this.f381658r = lVar;
        if (cVar != null && (mo2160x1e885992 = cVar.mo2160x1e885992()) != null) {
            byte[] byteArrayExtra = mo2160x1e885992.getByteArrayExtra("key_multi_task_common_info");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initData: commonDataBytes size ");
            sb6.append(byteArrayExtra != null ? java.lang.Integer.valueOf(byteArrayExtra.length) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", sb6.toString());
            if (byteArrayExtra != null) {
                r45.w60 w60Var = new r45.w60();
                try {
                    w60Var.mo11468x92b714fd(byteArrayExtra);
                } catch (java.lang.Exception unused2) {
                }
                b0(w60Var);
                r45.fr4 fr4Var = (r45.fr4) w60Var.m75936x14adae67(0);
                if (fr4Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fr4Var.m75945x2fec8307(1))) {
                    fr4Var.m75945x2fec8307(0);
                }
            }
        }
        if (w() && a() && cVar != null) {
            cVar.k(this);
        }
        R();
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        r45.kr4 kr4Var2 = this.f381612c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1 p1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var2;
        p1Var.getClass();
        if (cVar == null || (mo2157x19263085 = cVar.mo2157x19263085()) == null || (kr4Var = (r45.kr4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ri(mo2157x19263085, 1, 5, r45.kr4.class)) == null) {
            return;
        }
        if (c16601x7ed0e40c != null) {
            if (kr4Var2 != null) {
                kr4Var2.set(3, java.lang.Integer.valueOf(c16601x7ed0e40c.f66793x2262335f));
            }
            if (kr4Var2 != null) {
                kr4Var2.set(2, c16601x7ed0e40c.f66791xc8a07680);
            }
        }
        if (kr4Var2 != null) {
            kr4Var2.set(0, kr4Var.m75945x2fec8307(0));
        }
        r45.gr4 gr4Var = kr4Var2 != null ? (r45.gr4) kr4Var2.m75936x14adae67(5) : null;
        if (gr4Var != null) {
            gr4Var.set(0, java.lang.Long.valueOf(c01.id.c()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p1Var.f232012d, "SecData multitask scene enter contextId: %s", kr4Var.m75945x2fec8307(0));
    }
}
