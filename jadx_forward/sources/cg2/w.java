package cg2;

/* loaded from: classes5.dex */
public final class w extends yp.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f122675a;

    /* renamed from: b, reason: collision with root package name */
    public long f122676b;

    /* renamed from: c, reason: collision with root package name */
    public long f122677c;

    /* renamed from: d, reason: collision with root package name */
    public final long f122678d;

    public w(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f122675a = context;
        this.f122676b = 300L;
        this.f122677c = 300L;
        this.f122678d = 100L;
    }

    @Override // yp.p, yp.a
    public boolean a(wp.a aVar) {
        return aVar instanceof cg2.q;
    }

    @Override // yp.p
    public int j(java.lang.Object obj) {
        return 6;
    }

    @Override // yp.p
    public void l(int i17, yp.o oVar, wp.i iVar) {
        cg2.q qVar = iVar instanceof cg2.q ? (cg2.q) iVar : null;
        cg2.r rVar = oVar instanceof cg2.r ? (cg2.r) oVar : null;
        java.lang.Object obj = iVar != null ? iVar.f529887y : null;
        r45.ai1 ai1Var = obj instanceof r45.ai1 ? (r45.ai1) obj : null;
        if (!(qVar == null)) {
            if (!(rVar == null)) {
                if (!(ai1Var == null)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFeedCenterDanmakuRender", "[onBindViewHolder] content:" + ai1Var.m75945x2fec8307(1) + ", from " + ai1Var.m75939xb282bd08(3) + " to " + ai1Var.m75939xb282bd08(4));
                    android.view.View view = rVar.f122655d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/danmaku/LiveFeedCenterDanmakuRender", "onBindViewHolder", "(ILcom/tencent/mm/danmaku/render/ViewDanmakuRender$ViewHolder;Lcom/tencent/mm/danmaku/data/ViewDanmaku;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/convert/danmaku/LiveFeedCenterDanmakuRender", "onBindViewHolder", "(ILcom/tencent/mm/danmaku/render/ViewDanmakuRender$ViewHolder;Lcom/tencent/mm/danmaku/data/ViewDanmaku;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int r17 = r();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea c15381xac4783ea = rVar.f122656e;
                    c15381xac4783ea.m62513xe1d3a649(r17);
                    int r18 = r();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea c15381xac4783ea2 = rVar.f122657f;
                    c15381xac4783ea2.m62513xe1d3a649(r18);
                    hc2.f1.A(c15381xac4783ea2);
                    c15381xac4783ea2.setText(" x" + r26.i0.s("8", java.lang.String.valueOf(java.lang.Math.abs(ai1Var.m75939xb282bd08(4))).length()));
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String m75945x2fec8307 = ai1Var.m75945x2fec8307(1);
                    ((ke0.e) xVar).getClass();
                    c15381xac4783ea.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this.f122675a, m75945x2fec8307));
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveFeedCenterDanmakuRender", "[onBindViewHolder] return for null: " + iVar + ", " + rVar + ", " + ai1Var + ',');
    }

    @Override // yp.p
    public yp.o m(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.view.View inflate = android.view.LayoutInflater.from(this.f122675a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e_8, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        cg2.r rVar = new cg2.r(inflate);
        com.p314xaae8f345.mm.ui.bk.r0(rVar.f122656e.getPaint(), 0.8f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFeedCenterDanmakuRender", "[onCreateViewHolder] cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return rVar;
    }

    @Override // yp.p
    public void o(wp.i iVar, xp.d dVar) {
        cg2.q qVar = iVar instanceof cg2.q ? (cg2.q) iVar : null;
        yp.o oVar = qVar != null ? qVar.H : null;
        cg2.r rVar = oVar instanceof cg2.r ? (cg2.r) oVar : null;
        java.lang.Object obj = qVar != null ? qVar.f529887y : null;
        r45.ai1 ai1Var = obj instanceof r45.ai1 ? (r45.ai1) obj : null;
        if (!(qVar == null)) {
            if (!(rVar == null)) {
                if (!(ai1Var == null)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFeedCenterDanmakuRender", "[startCenterDanmakuAnimation] start anim with " + qVar + ", " + rVar);
                    android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(rVar.f122655d, "alpha", 0.0f, 1.0f);
                    ofFloat.setDuration(this.f122676b);
                    long j17 = qVar.f529867e.f556446a;
                    long max = java.lang.Math.max(1L, j17 / this.f122678d);
                    android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(1, (int) max);
                    ofInt.setDuration(j17);
                    ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
                    ofInt.addUpdateListener(new cg2.u(ai1Var, (ai1Var.m75939xb282bd08(4) - ai1Var.m75939xb282bd08(3)) / max, rVar));
                    ofInt.addListener(new cg2.v(rVar, ai1Var));
                    android.animation.AnimatorSet animatorSet = rVar.f122658g;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                    animatorSet2.play(ofFloat).with(ofInt);
                    animatorSet2.start();
                    rVar.f122658g = animatorSet2;
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveFeedCenterDanmakuRender", "[startCenterDanmakuAnimation] return for null: " + qVar + ", " + rVar + ", " + ai1Var + ',');
    }

    @Override // yp.p, yp.a
    /* renamed from: p */
    public void h(wp.i iVar, boolean z17, java.lang.Runnable runnable) {
        cg2.q qVar = iVar instanceof cg2.q ? (cg2.q) iVar : null;
        java.lang.Object obj = iVar != null ? iVar.H : null;
        cg2.r rVar = obj instanceof cg2.r ? (cg2.r) obj : null;
        cg2.s sVar = new cg2.s(qVar, rVar, this, iVar, z17, runnable);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFeedCenterDanmakuRender", "[recycleDanmaku] with " + qVar + ", " + rVar + ", " + z17);
        if (qVar != null) {
            if ((rVar != null) && z17) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(rVar.f122655d, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(this.f122677c);
                ofFloat.addListener(new cg2.t(rVar, sVar));
                android.animation.AnimatorSet animatorSet = rVar.f122659h;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                animatorSet2.play(ofFloat);
                animatorSet2.start();
                rVar.f122659h = animatorSet2;
                return;
            }
        }
        sVar.mo152xb9724478();
    }

    public final int r() {
        int intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.R().r()).intValue();
        return intValue != 1 ? intValue != 2 ? intValue != 3 ? android.graphics.Color.parseColor("#99000000") : android.graphics.Color.parseColor("#7f000000") : android.graphics.Color.parseColor("#66000000") : android.graphics.Color.parseColor("#4d000000");
    }
}
