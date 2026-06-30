package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class kd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f103823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f103824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103825g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f103826h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f103827i;

    public kd(in5.s0 s0Var, java.util.List list, int i17, com.tencent.mm.plugin.finder.convert.qe qeVar, java.util.List list2, float f17) {
        this.f103822d = s0Var;
        this.f103823e = list;
        this.f103824f = i17;
        this.f103825g = qeVar;
        this.f103826h = list2;
        this.f103827i = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView;
        int intValue;
        in5.s0 holder = this.f103822d;
        java.lang.Object tag = holder.itemView.getTag(com.tencent.mm.R.id.edv);
        if (kotlin.jvm.internal.o.b(tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null, java.lang.Boolean.FALSE)) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "no focus, no avatarAnimator");
            return;
        }
        java.util.List list = this.f103826h;
        float f17 = this.f103827i;
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f103825g;
        java.util.List avatarLayoutList = this.f103823e;
        com.tencent.mm.plugin.finder.convert.jd jdVar = new com.tencent.mm.plugin.finder.convert.jd(qeVar, list, avatarLayoutList, f17);
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(avatarLayoutList, "avatarLayoutList");
        com.tencent.mm.plugin.finder.feed.RoundLinearLayout roundLinearLayout = (com.tencent.mm.plugin.finder.feed.RoundLinearLayout) holder.p(com.tencent.mm.R.id.i1_);
        if (roundLinearLayout == null || (imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.i19)) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
        java.util.LinkedList h17 = nv2.n1.f340551h.h(baseFinderFeed.getFeedObject().getFeedObject());
        roundLinearLayout.setRadius(0.1f);
        roundLinearLayout.getChildAt(0).setBackground(null);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, c01.z1.r(), 0.0f);
        roundLinearLayout.setVisibility(0);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.lkg);
        if (viewGroup == null) {
            return;
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.h6i);
        android.graphics.Rect rect = new android.graphics.Rect();
        viewGroup.getGlobalVisibleRect(rect);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        p17.getGlobalVisibleRect(rect2);
        int i17 = rect2.top - rect.top;
        int i18 = rect2.left - rect.left;
        int size = h17.size();
        int i19 = this.f103824f;
        int size2 = size <= 3 ? (h17.size() - 1) * i19 : h17.size() > 3 ? i19 * 2 : 0;
        int i27 = (int) (rect2.left - (i18 * 0.5f));
        int i28 = (int) (rect2.top - (i17 * 2.0f));
        int i29 = rect.left + size2;
        if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIKE_ANIMATION_SVR_DISABLE_BOOLEAN_SYNC, false)) {
            intValue = 0;
        } else {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.T7).getValue()).r()).intValue();
        }
        android.content.Context context = holder.f293121e;
        int dimension = i29 + ((intValue != 1 || h17.size() < 1) ? 0 : (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl));
        int i37 = rect.top;
        int b17 = h17.size() != 1 ? i65.a.b(context, 2) : 0;
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(rect2.left, rect2.top);
        path.quadTo(i27, i28, dimension, i37 + b17);
        android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(path, false);
        roundLinearLayout.setVisibility(0);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
        ofFloat.setDuration(470L);
        ofFloat.setInterpolator(new uw2.a(0.6f));
        float[] fArr = new float[2];
        yz5.a aVar = uw2.h0.f431676c;
        if (aVar != null) {
            holder.itemView.removeCallbacks(new uw2.c0(aVar));
        }
        com.tencent.mars.xlog.Log.i("LikeIconAnimationHelper", "register runnable");
        uw2.c cVar = new uw2.c(baseFinderFeed, avatarLayoutList, jdVar, holder);
        uw2.h0.f431676c = cVar;
        holder.itemView.postDelayed(new uw2.c0(cVar), 250L);
        ofFloat.addUpdateListener(new uw2.d(pathMeasure, fArr, roundLinearLayout));
        ofFloat.addListener(new uw2.e(roundLinearLayout, avatarLayoutList, baseFinderFeed, holder, viewGroup));
        ofFloat.start();
        uw2.h0.f431675b = ofFloat;
    }
}
