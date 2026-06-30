package bb2;

/* loaded from: classes5.dex */
public final class z0 extends yp.p {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f100624e = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f100625a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.q f100626b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.p f100627c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.p f100628d;

    public z0(android.content.Context bulletViewContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bulletViewContext, "bulletViewContext");
        this.f100625a = bulletViewContext;
    }

    @Override // yp.p, yp.a
    public boolean a(wp.a aVar) {
        return aVar instanceof bb2.r0;
    }

    @Override // yp.p
    public int j(java.lang.Object obj) {
        return 5;
    }

    @Override // yp.p, yp.a
    /* renamed from: k */
    public wp.b d(wp.i iVar, yp.o oVar) {
        r45.n6 n6Var;
        wp.b d17 = super.d(iVar, oVar);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            java.lang.Integer num = null;
            bb2.r0 r0Var = iVar instanceof bb2.r0 ? (bb2.r0) iVar : null;
            if (r0Var != null) {
                bb2.q0 q0Var = oVar instanceof bb2.q0 ? (bb2.q0) oVar : null;
                if (q0Var != null) {
                    java.lang.Object obj = r0Var.f529887y;
                    bb2.o oVar2 = obj instanceof bb2.o ? (bb2.o) obj : null;
                    if (oVar2 != null) {
                        java.util.HashMap hashMap = f100624e;
                        java.lang.Long valueOf = java.lang.Long.valueOf(oVar2.a());
                        java.lang.Object obj2 = hashMap.get(valueOf);
                        if (obj2 == null) {
                            obj2 = new bb2.s0(false, 0, 3, null);
                            hashMap.put(valueOf, obj2);
                        }
                        bb2.s0 s0Var = (bb2.s0) obj2;
                        android.animation.AnimatorSet animatorSet = q0Var.f100490j;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        android.animation.ObjectAnimator objectAnimator = q0Var.f100488h;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        q0Var.f100490j = null;
                        q0Var.f100488h = null;
                        r45.mo moVar = (r45.mo) oVar2.f100459a.m75936x14adae67(10);
                        if (moVar != null && (n6Var = (r45.n6) moVar.m75936x14adae67(0)) != null) {
                            num = java.lang.Integer.valueOf(n6Var.m75939xb282bd08(0));
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea c15381xac4783ea = q0Var.f100486f;
                        if (num == null || num.intValue() <= 1) {
                            c15381xac4783ea.setVisibility(8);
                        } else if (!r0Var.I || s0Var.f100522b >= num.intValue()) {
                            t(r0Var, q0Var);
                        } else {
                            c15381xac4783ea.setVisibility(0);
                            c15381xac4783ea.setText(" x" + s0Var.f100522b + ' ');
                            android.animation.ValueAnimator r17 = r(r0Var);
                            q0Var.f100489i = r17;
                            if (r17 != null) {
                                r17.start();
                            }
                        }
                    }
                }
            }
        }
        return d17;
    }

    @Override // yp.p
    public void l(int i17, yp.o oVar, wp.i iVar) {
        bb2.r0 r0Var = iVar instanceof bb2.r0 ? (bb2.r0) iVar : null;
        if (r0Var != null) {
            java.lang.Object obj = r0Var.f529887y;
            bb2.o oVar2 = obj instanceof bb2.o ? (bb2.o) obj : null;
            if (oVar2 != null) {
                bb2.q0 q0Var = oVar instanceof bb2.q0 ? (bb2.q0) oVar : null;
                if (q0Var != null) {
                    java.util.HashMap hashMap = f100624e;
                    java.lang.Long valueOf = java.lang.Long.valueOf(oVar2.a());
                    java.lang.Object obj2 = hashMap.get(valueOf);
                    if (obj2 == null) {
                        obj2 = new bb2.s0(false, 0, 3, null);
                        hashMap.put(valueOf, obj2);
                    }
                    bb2.s0 s0Var = (bb2.s0) obj2;
                    boolean z17 = s0Var.f100521a;
                    android.view.View view = q0Var.f100484d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender", "onBindViewHolder", "(ILcom/tencent/mm/danmaku/render/ViewDanmakuRender$ViewHolder;Lcom/tencent/mm/danmaku/data/ViewDanmaku;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender", "onBindViewHolder", "(ILcom/tencent/mm/danmaku/render/ViewDanmakuRender$ViewHolder;Lcom/tencent/mm/danmaku/data/ViewDanmaku;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int q17 = q();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea c15381xac4783ea = q0Var.f100485e;
                    c15381xac4783ea.m62513xe1d3a649(q17);
                    int q18 = q();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea c15381xac4783ea2 = q0Var.f100486f;
                    c15381xac4783ea2.m62513xe1d3a649(q18);
                    android.text.SpannableString spannableString = r0Var.f100503J;
                    r45.oo ooVar = oVar2.f100459a;
                    if (spannableString == null) {
                        i95.m c17 = i95.n0.c(le0.x.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        spannableString = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(c15381xac4783ea.getContext(), ooVar.m75945x2fec8307(2));
                    }
                    c15381xac4783ea.setText(spannableString);
                    android.view.View view2 = q0Var.f100487g;
                    int i18 = 8;
                    if (!z17) {
                        yz5.p pVar = this.f100628d;
                        if (pVar != null) {
                            pVar.mo149xb9724478(java.lang.Long.valueOf(oVar2.a()), kz5.c1.l(new jz5.l("bc_id", pm0.v.u(oVar2.a())), new jz5.l("bc_content", ooVar.m75945x2fec8307(2)), new jz5.l("bc_like_cnt", java.lang.Integer.valueOf(ooVar.m75939xb282bd08(8)))));
                        }
                        i18 = 0;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender", "onBindViewHolder", "(ILcom/tencent/mm/danmaku/render/ViewDanmakuRender$ViewHolder;Lcom/tencent/mm/danmaku/data/ViewDanmaku;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender", "onBindViewHolder", "(ILcom/tencent/mm/danmaku/render/ViewDanmakuRender$ViewHolder;Lcom/tencent/mm/danmaku/data/ViewDanmaku;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    hc2.f1.A(c15381xac4783ea2);
                    q0Var.f100487g.setOnClickListener(new bb2.w0(s0Var, this, oVar2, q0Var, r0Var));
                    t(r0Var, q0Var);
                }
            }
        }
    }

    @Override // yp.p
    public yp.o m(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.view.View inflate = android.view.LayoutInflater.from(this.f100625a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ejt, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        bb2.q0 q0Var = new bb2.q0(inflate);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FixedCenterDanmakuRender", "onCreateViewHolder: cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return q0Var;
    }

    @Override // yp.p
    public void o(wp.i iVar, xp.d dVar) {
        r45.n6 n6Var;
        java.lang.Integer num = null;
        bb2.r0 r0Var = iVar instanceof bb2.r0 ? (bb2.r0) iVar : null;
        if (r0Var != null) {
            yp.o oVar = r0Var.H;
            bb2.q0 q0Var = oVar instanceof bb2.q0 ? (bb2.q0) oVar : null;
            if (q0Var != null) {
                java.lang.Object obj = r0Var.f529887y;
                bb2.o oVar2 = obj instanceof bb2.o ? (bb2.o) obj : null;
                if (oVar2 != null) {
                    android.view.View view = q0Var.f100484d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender", "onFirstDraw", "(Lcom/tencent/mm/danmaku/data/ViewDanmaku;Lcom/tencent/mm/danmaku/inject/DanmakuContext;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender", "onFirstDraw", "(Lcom/tencent/mm/danmaku/data/ViewDanmaku;Lcom/tencent/mm/danmaku/inject/DanmakuContext;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(q0Var.f100484d, "alpha", 0.0f, 1.0f);
                    ofFloat.setDuration(300L);
                    q0Var.f100488h = ofFloat;
                    android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                    android.animation.AnimatorSet animatorSet2 = q0Var.f100490j;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    q0Var.f100490j = animatorSet;
                    android.animation.AnimatorSet.Builder play = animatorSet.play(ofFloat);
                    r45.oo ooVar = oVar2.f100459a;
                    r45.mo moVar = (r45.mo) ooVar.m75936x14adae67(10);
                    if (moVar != null && (n6Var = (r45.n6) moVar.m75936x14adae67(0)) != null) {
                        num = java.lang.Integer.valueOf(n6Var.m75939xb282bd08(0));
                    }
                    if (num != null && num.intValue() > 1) {
                        q0Var.f100486f.setText(" x1 ");
                        android.animation.ValueAnimator r17 = r(r0Var);
                        if (r17 != null) {
                            if (play != null) {
                                play.with(r17);
                            }
                            q0Var.f100489i = r17;
                        }
                    }
                    animatorSet.start();
                    yz5.p pVar = this.f100627c;
                    if (pVar != null) {
                        pVar.mo149xb9724478(java.lang.Long.valueOf(oVar2.a()), ooVar.m75945x2fec8307(11));
                    }
                }
            }
        }
    }

    @Override // yp.p, yp.a
    /* renamed from: p */
    public void h(wp.i iVar, boolean z17, java.lang.Runnable runnable) {
        bb2.r0 r0Var = iVar instanceof bb2.r0 ? (bb2.r0) iVar : null;
        if (r0Var != null) {
            yp.o oVar = r0Var.H;
            bb2.q0 q0Var = oVar instanceof bb2.q0 ? (bb2.q0) oVar : null;
            if (q0Var != null) {
                if (z17) {
                    android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(q0Var.f100484d, "alpha", 1.0f, 0.0f);
                    ofFloat.setDuration(((float) 300) / xp.d.f().f537393q);
                    ofFloat.addListener(new bb2.x0(q0Var, this, r0Var, runnable));
                    ofFloat.start();
                    return;
                }
                s(q0Var, r0Var);
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public final int q() {
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        int intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.R().r()).intValue();
        android.content.Context context = this.f100625a;
        return intValue != 1 ? intValue != 2 ? intValue != 3 ? context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560779ty) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560778tx) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560777al4) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560776tv);
    }

    public final android.animation.ValueAnimator r(bb2.r0 r0Var) {
        r45.n6 n6Var;
        yp.o oVar = r0Var.H;
        bb2.q0 q0Var = oVar instanceof bb2.q0 ? (bb2.q0) oVar : null;
        if (q0Var != null) {
            java.lang.Object obj = r0Var.f529887y;
            bb2.o oVar2 = obj instanceof bb2.o ? (bb2.o) obj : null;
            if (oVar2 != null) {
                java.util.HashMap hashMap = f100624e;
                java.lang.Long valueOf = java.lang.Long.valueOf(oVar2.a());
                java.lang.Object obj2 = hashMap.get(valueOf);
                if (obj2 == null) {
                    obj2 = new bb2.s0(false, 0, 3, null);
                    hashMap.put(valueOf, obj2);
                }
                bb2.s0 s0Var = (bb2.s0) obj2;
                r45.mo moVar = (r45.mo) oVar2.f100459a.m75936x14adae67(10);
                if (moVar != null && (n6Var = (r45.n6) moVar.m75936x14adae67(0)) != null) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(n6Var.m75939xb282bd08(0));
                    if (!(valueOf2.intValue() > 0)) {
                        valueOf2 = null;
                    }
                    if (valueOf2 != null) {
                        int intValue = valueOf2.intValue();
                        int i17 = ((int) r0Var.f529867e.f556446a) / 100;
                        double d17 = (intValue - 1) / i17;
                        int i18 = s0Var.f100522b;
                        q0Var.f100486f.setText(" x" + i18 + ' ');
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FixedCenterDanmakuRender", i18 + ", yikezhai");
                        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt((int) ((((float) i18) * ((float) i17)) / ((float) intValue)), i17);
                        ofInt.setDuration((((float) 3000) * (1 - (r2 / r3))) / xp.d.f().f537393q);
                        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
                        ofInt.addUpdateListener(new bb2.t0(d17, intValue, q0Var, s0Var));
                        ofInt.addListener(new bb2.u0(this, r0Var, q0Var));
                        return ofInt;
                    }
                }
            }
        }
        return null;
    }

    public final void s(bb2.q0 q0Var, bb2.r0 r0Var) {
        pm0.v.X(new bb2.y0(q0Var));
        r0Var.getClass();
        yp.f.f545911a.c(5, q0Var);
        r0Var.H = null;
    }

    public final void t(bb2.r0 r0Var, bb2.q0 q0Var) {
        r45.n6 n6Var;
        java.lang.Object obj = r0Var.f529887y;
        java.lang.Integer num = null;
        bb2.o oVar = obj instanceof bb2.o ? (bb2.o) obj : null;
        if (oVar != null) {
            java.util.HashMap hashMap = f100624e;
            java.lang.Long valueOf = java.lang.Long.valueOf(oVar.a());
            java.lang.Object obj2 = hashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new bb2.s0(false, 0, 3, null);
                hashMap.put(valueOf, obj2);
            }
            bb2.s0 s0Var = (bb2.s0) obj2;
            r45.mo moVar = (r45.mo) oVar.f100459a.m75936x14adae67(10);
            if (moVar != null && (n6Var = (r45.n6) moVar.m75936x14adae67(0)) != null) {
                num = java.lang.Integer.valueOf(n6Var.m75939xb282bd08(0));
            }
            if (num == null || num.intValue() <= 1) {
                q0Var.f100486f.setVisibility(8);
                return;
            }
            int intValue = s0Var.f100521a ? num.intValue() + 1 : num.intValue();
            if (s0Var.f100522b == num.intValue()) {
                s0Var.f100522b = intValue;
            }
            q0Var.f100486f.setText(" x" + intValue + ' ');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FixedCenterDanmakuRender", intValue + ", yikezhai");
        }
    }
}
