package cg2;

/* loaded from: classes5.dex */
public final class w extends yp.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f41142a;

    /* renamed from: b, reason: collision with root package name */
    public long f41143b;

    /* renamed from: c, reason: collision with root package name */
    public long f41144c;

    /* renamed from: d, reason: collision with root package name */
    public final long f41145d;

    public w(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f41142a = context;
        this.f41143b = 300L;
        this.f41144c = 300L;
        this.f41145d = 100L;
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
        java.lang.Object obj = iVar != null ? iVar.f448354y : null;
        r45.ai1 ai1Var = obj instanceof r45.ai1 ? (r45.ai1) obj : null;
        if (!(qVar == null)) {
            if (!(rVar == null)) {
                if (!(ai1Var == null)) {
                    com.tencent.mars.xlog.Log.i("LiveFeedCenterDanmakuRender", "[onBindViewHolder] content:" + ai1Var.getString(1) + ", from " + ai1Var.getInteger(3) + " to " + ai1Var.getInteger(4));
                    android.view.View view = rVar.f41122d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/danmaku/LiveFeedCenterDanmakuRender", "onBindViewHolder", "(ILcom/tencent/mm/danmaku/render/ViewDanmakuRender$ViewHolder;Lcom/tencent/mm/danmaku/data/ViewDanmaku;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/convert/danmaku/LiveFeedCenterDanmakuRender", "onBindViewHolder", "(ILcom/tencent/mm/danmaku/render/ViewDanmakuRender$ViewHolder;Lcom/tencent/mm/danmaku/data/ViewDanmaku;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int r17 = r();
                    com.tencent.mm.plugin.finder.view.StrokeTextView strokeTextView = rVar.f41123e;
                    strokeTextView.setStrokeColor(r17);
                    int r18 = r();
                    com.tencent.mm.plugin.finder.view.StrokeTextView strokeTextView2 = rVar.f41124f;
                    strokeTextView2.setStrokeColor(r18);
                    hc2.f1.A(strokeTextView2);
                    strokeTextView2.setText(" x" + r26.i0.s("8", java.lang.String.valueOf(java.lang.Math.abs(ai1Var.getInteger(4))).length()));
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String string = ai1Var.getString(1);
                    ((ke0.e) xVar).getClass();
                    strokeTextView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this.f41142a, string));
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.w("LiveFeedCenterDanmakuRender", "[onBindViewHolder] return for null: " + iVar + ", " + rVar + ", " + ai1Var + ',');
    }

    @Override // yp.p
    public yp.o m(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.view.View inflate = android.view.LayoutInflater.from(this.f41142a).inflate(com.tencent.mm.R.layout.e_8, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        cg2.r rVar = new cg2.r(inflate);
        com.tencent.mm.ui.bk.r0(rVar.f41123e.getPaint(), 0.8f);
        com.tencent.mars.xlog.Log.i("LiveFeedCenterDanmakuRender", "[onCreateViewHolder] cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return rVar;
    }

    @Override // yp.p
    public void o(wp.i iVar, xp.d dVar) {
        cg2.q qVar = iVar instanceof cg2.q ? (cg2.q) iVar : null;
        yp.o oVar = qVar != null ? qVar.H : null;
        cg2.r rVar = oVar instanceof cg2.r ? (cg2.r) oVar : null;
        java.lang.Object obj = qVar != null ? qVar.f448354y : null;
        r45.ai1 ai1Var = obj instanceof r45.ai1 ? (r45.ai1) obj : null;
        if (!(qVar == null)) {
            if (!(rVar == null)) {
                if (!(ai1Var == null)) {
                    com.tencent.mars.xlog.Log.i("LiveFeedCenterDanmakuRender", "[startCenterDanmakuAnimation] start anim with " + qVar + ", " + rVar);
                    android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(rVar.f41122d, "alpha", 0.0f, 1.0f);
                    ofFloat.setDuration(this.f41143b);
                    long j17 = qVar.f448334e.f474913a;
                    long max = java.lang.Math.max(1L, j17 / this.f41145d);
                    android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(1, (int) max);
                    ofInt.setDuration(j17);
                    ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
                    ofInt.addUpdateListener(new cg2.u(ai1Var, (ai1Var.getInteger(4) - ai1Var.getInteger(3)) / max, rVar));
                    ofInt.addListener(new cg2.v(rVar, ai1Var));
                    android.animation.AnimatorSet animatorSet = rVar.f41125g;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                    animatorSet2.play(ofFloat).with(ofInt);
                    animatorSet2.start();
                    rVar.f41125g = animatorSet2;
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.w("LiveFeedCenterDanmakuRender", "[startCenterDanmakuAnimation] return for null: " + qVar + ", " + rVar + ", " + ai1Var + ',');
    }

    @Override // yp.p, yp.a
    /* renamed from: p */
    public void h(wp.i iVar, boolean z17, java.lang.Runnable runnable) {
        cg2.q qVar = iVar instanceof cg2.q ? (cg2.q) iVar : null;
        java.lang.Object obj = iVar != null ? iVar.H : null;
        cg2.r rVar = obj instanceof cg2.r ? (cg2.r) obj : null;
        cg2.s sVar = new cg2.s(qVar, rVar, this, iVar, z17, runnable);
        com.tencent.mars.xlog.Log.i("LiveFeedCenterDanmakuRender", "[recycleDanmaku] with " + qVar + ", " + rVar + ", " + z17);
        if (qVar != null) {
            if ((rVar != null) && z17) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(rVar.f41122d, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(this.f41144c);
                ofFloat.addListener(new cg2.t(rVar, sVar));
                android.animation.AnimatorSet animatorSet = rVar.f41126h;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                animatorSet2.play(ofFloat);
                animatorSet2.start();
                rVar.f41126h = animatorSet2;
                return;
            }
        }
        sVar.invoke();
    }

    public final int r() {
        int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.R().r()).intValue();
        return intValue != 1 ? intValue != 2 ? intValue != 3 ? android.graphics.Color.parseColor("#99000000") : android.graphics.Color.parseColor("#7f000000") : android.graphics.Color.parseColor("#66000000") : android.graphics.Color.parseColor("#4d000000");
    }
}
