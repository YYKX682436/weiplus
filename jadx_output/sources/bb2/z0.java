package bb2;

/* loaded from: classes5.dex */
public final class z0 extends yp.p {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f19091e = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f19092a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.q f19093b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.p f19094c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.p f19095d;

    public z0(android.content.Context bulletViewContext) {
        kotlin.jvm.internal.o.g(bulletViewContext, "bulletViewContext");
        this.f19092a = bulletViewContext;
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
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            java.lang.Integer num = null;
            bb2.r0 r0Var = iVar instanceof bb2.r0 ? (bb2.r0) iVar : null;
            if (r0Var != null) {
                bb2.q0 q0Var = oVar instanceof bb2.q0 ? (bb2.q0) oVar : null;
                if (q0Var != null) {
                    java.lang.Object obj = r0Var.f448354y;
                    bb2.o oVar2 = obj instanceof bb2.o ? (bb2.o) obj : null;
                    if (oVar2 != null) {
                        java.util.HashMap hashMap = f19091e;
                        java.lang.Long valueOf = java.lang.Long.valueOf(oVar2.a());
                        java.lang.Object obj2 = hashMap.get(valueOf);
                        if (obj2 == null) {
                            obj2 = new bb2.s0(false, 0, 3, null);
                            hashMap.put(valueOf, obj2);
                        }
                        bb2.s0 s0Var = (bb2.s0) obj2;
                        android.animation.AnimatorSet animatorSet = q0Var.f18957j;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        android.animation.ObjectAnimator objectAnimator = q0Var.f18955h;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        q0Var.f18957j = null;
                        q0Var.f18955h = null;
                        r45.mo moVar = (r45.mo) oVar2.f18926a.getCustom(10);
                        if (moVar != null && (n6Var = (r45.n6) moVar.getCustom(0)) != null) {
                            num = java.lang.Integer.valueOf(n6Var.getInteger(0));
                        }
                        com.tencent.mm.plugin.finder.view.StrokeTextView strokeTextView = q0Var.f18953f;
                        if (num == null || num.intValue() <= 1) {
                            strokeTextView.setVisibility(8);
                        } else if (!r0Var.I || s0Var.f18989b >= num.intValue()) {
                            t(r0Var, q0Var);
                        } else {
                            strokeTextView.setVisibility(0);
                            strokeTextView.setText(" x" + s0Var.f18989b + ' ');
                            android.animation.ValueAnimator r17 = r(r0Var);
                            q0Var.f18956i = r17;
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
            java.lang.Object obj = r0Var.f448354y;
            bb2.o oVar2 = obj instanceof bb2.o ? (bb2.o) obj : null;
            if (oVar2 != null) {
                bb2.q0 q0Var = oVar instanceof bb2.q0 ? (bb2.q0) oVar : null;
                if (q0Var != null) {
                    java.util.HashMap hashMap = f19091e;
                    java.lang.Long valueOf = java.lang.Long.valueOf(oVar2.a());
                    java.lang.Object obj2 = hashMap.get(valueOf);
                    if (obj2 == null) {
                        obj2 = new bb2.s0(false, 0, 3, null);
                        hashMap.put(valueOf, obj2);
                    }
                    bb2.s0 s0Var = (bb2.s0) obj2;
                    boolean z17 = s0Var.f18988a;
                    android.view.View view = q0Var.f18951d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender", "onBindViewHolder", "(ILcom/tencent/mm/danmaku/render/ViewDanmakuRender$ViewHolder;Lcom/tencent/mm/danmaku/data/ViewDanmaku;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender", "onBindViewHolder", "(ILcom/tencent/mm/danmaku/render/ViewDanmakuRender$ViewHolder;Lcom/tencent/mm/danmaku/data/ViewDanmaku;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int q17 = q();
                    com.tencent.mm.plugin.finder.view.StrokeTextView strokeTextView = q0Var.f18952e;
                    strokeTextView.setStrokeColor(q17);
                    int q18 = q();
                    com.tencent.mm.plugin.finder.view.StrokeTextView strokeTextView2 = q0Var.f18953f;
                    strokeTextView2.setStrokeColor(q18);
                    android.text.SpannableString spannableString = r0Var.f18970J;
                    r45.oo ooVar = oVar2.f18926a;
                    if (spannableString == null) {
                        i95.m c17 = i95.n0.c(le0.x.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        spannableString = com.tencent.mm.pluginsdk.ui.span.c0.i(strokeTextView.getContext(), ooVar.getString(2));
                    }
                    strokeTextView.setText(spannableString);
                    android.view.View view2 = q0Var.f18954g;
                    int i18 = 8;
                    if (!z17) {
                        yz5.p pVar = this.f19095d;
                        if (pVar != null) {
                            pVar.invoke(java.lang.Long.valueOf(oVar2.a()), kz5.c1.l(new jz5.l("bc_id", pm0.v.u(oVar2.a())), new jz5.l("bc_content", ooVar.getString(2)), new jz5.l("bc_like_cnt", java.lang.Integer.valueOf(ooVar.getInteger(8)))));
                        }
                        i18 = 0;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender", "onBindViewHolder", "(ILcom/tencent/mm/danmaku/render/ViewDanmakuRender$ViewHolder;Lcom/tencent/mm/danmaku/data/ViewDanmaku;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender", "onBindViewHolder", "(ILcom/tencent/mm/danmaku/render/ViewDanmakuRender$ViewHolder;Lcom/tencent/mm/danmaku/data/ViewDanmaku;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    hc2.f1.A(strokeTextView2);
                    q0Var.f18954g.setOnClickListener(new bb2.w0(s0Var, this, oVar2, q0Var, r0Var));
                    t(r0Var, q0Var);
                }
            }
        }
    }

    @Override // yp.p
    public yp.o m(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.view.View inflate = android.view.LayoutInflater.from(this.f19092a).inflate(com.tencent.mm.R.layout.ejt, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        bb2.q0 q0Var = new bb2.q0(inflate);
        com.tencent.mars.xlog.Log.i("FixedCenterDanmakuRender", "onCreateViewHolder: cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
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
                java.lang.Object obj = r0Var.f448354y;
                bb2.o oVar2 = obj instanceof bb2.o ? (bb2.o) obj : null;
                if (oVar2 != null) {
                    android.view.View view = q0Var.f18951d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender", "onFirstDraw", "(Lcom/tencent/mm/danmaku/data/ViewDanmaku;Lcom/tencent/mm/danmaku/inject/DanmakuContext;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender", "onFirstDraw", "(Lcom/tencent/mm/danmaku/data/ViewDanmaku;Lcom/tencent/mm/danmaku/inject/DanmakuContext;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(q0Var.f18951d, "alpha", 0.0f, 1.0f);
                    ofFloat.setDuration(300L);
                    q0Var.f18955h = ofFloat;
                    android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                    android.animation.AnimatorSet animatorSet2 = q0Var.f18957j;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    q0Var.f18957j = animatorSet;
                    android.animation.AnimatorSet.Builder play = animatorSet.play(ofFloat);
                    r45.oo ooVar = oVar2.f18926a;
                    r45.mo moVar = (r45.mo) ooVar.getCustom(10);
                    if (moVar != null && (n6Var = (r45.n6) moVar.getCustom(0)) != null) {
                        num = java.lang.Integer.valueOf(n6Var.getInteger(0));
                    }
                    if (num != null && num.intValue() > 1) {
                        q0Var.f18953f.setText(" x1 ");
                        android.animation.ValueAnimator r17 = r(r0Var);
                        if (r17 != null) {
                            if (play != null) {
                                play.with(r17);
                            }
                            q0Var.f18956i = r17;
                        }
                    }
                    animatorSet.start();
                    yz5.p pVar = this.f19094c;
                    if (pVar != null) {
                        pVar.invoke(java.lang.Long.valueOf(oVar2.a()), ooVar.getString(11));
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
                    android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(q0Var.f18951d, "alpha", 1.0f, 0.0f);
                    ofFloat.setDuration(((float) 300) / xp.d.f().f455860q);
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
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.R().r()).intValue();
        android.content.Context context = this.f19092a;
        return intValue != 1 ? intValue != 2 ? intValue != 3 ? context.getResources().getColor(com.tencent.mm.R.color.f479246ty) : context.getResources().getColor(com.tencent.mm.R.color.f479245tx) : context.getResources().getColor(com.tencent.mm.R.color.f479244al4) : context.getResources().getColor(com.tencent.mm.R.color.f479243tv);
    }

    public final android.animation.ValueAnimator r(bb2.r0 r0Var) {
        r45.n6 n6Var;
        yp.o oVar = r0Var.H;
        bb2.q0 q0Var = oVar instanceof bb2.q0 ? (bb2.q0) oVar : null;
        if (q0Var != null) {
            java.lang.Object obj = r0Var.f448354y;
            bb2.o oVar2 = obj instanceof bb2.o ? (bb2.o) obj : null;
            if (oVar2 != null) {
                java.util.HashMap hashMap = f19091e;
                java.lang.Long valueOf = java.lang.Long.valueOf(oVar2.a());
                java.lang.Object obj2 = hashMap.get(valueOf);
                if (obj2 == null) {
                    obj2 = new bb2.s0(false, 0, 3, null);
                    hashMap.put(valueOf, obj2);
                }
                bb2.s0 s0Var = (bb2.s0) obj2;
                r45.mo moVar = (r45.mo) oVar2.f18926a.getCustom(10);
                if (moVar != null && (n6Var = (r45.n6) moVar.getCustom(0)) != null) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(n6Var.getInteger(0));
                    if (!(valueOf2.intValue() > 0)) {
                        valueOf2 = null;
                    }
                    if (valueOf2 != null) {
                        int intValue = valueOf2.intValue();
                        int i17 = ((int) r0Var.f448334e.f474913a) / 100;
                        double d17 = (intValue - 1) / i17;
                        int i18 = s0Var.f18989b;
                        q0Var.f18953f.setText(" x" + i18 + ' ');
                        com.tencent.mars.xlog.Log.i("FixedCenterDanmakuRender", i18 + ", yikezhai");
                        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt((int) ((((float) i18) * ((float) i17)) / ((float) intValue)), i17);
                        ofInt.setDuration((((float) 3000) * (1 - (r2 / r3))) / xp.d.f().f455860q);
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
        yp.f.f464378a.c(5, q0Var);
        r0Var.H = null;
    }

    public final void t(bb2.r0 r0Var, bb2.q0 q0Var) {
        r45.n6 n6Var;
        java.lang.Object obj = r0Var.f448354y;
        java.lang.Integer num = null;
        bb2.o oVar = obj instanceof bb2.o ? (bb2.o) obj : null;
        if (oVar != null) {
            java.util.HashMap hashMap = f19091e;
            java.lang.Long valueOf = java.lang.Long.valueOf(oVar.a());
            java.lang.Object obj2 = hashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new bb2.s0(false, 0, 3, null);
                hashMap.put(valueOf, obj2);
            }
            bb2.s0 s0Var = (bb2.s0) obj2;
            r45.mo moVar = (r45.mo) oVar.f18926a.getCustom(10);
            if (moVar != null && (n6Var = (r45.n6) moVar.getCustom(0)) != null) {
                num = java.lang.Integer.valueOf(n6Var.getInteger(0));
            }
            if (num == null || num.intValue() <= 1) {
                q0Var.f18953f.setVisibility(8);
                return;
            }
            int intValue = s0Var.f18988a ? num.intValue() + 1 : num.intValue();
            if (s0Var.f18989b == num.intValue()) {
                s0Var.f18989b = intValue;
            }
            q0Var.f18953f.setText(" x" + intValue + ' ');
            com.tencent.mars.xlog.Log.i("FixedCenterDanmakuRender", intValue + ", yikezhai");
        }
    }
}
