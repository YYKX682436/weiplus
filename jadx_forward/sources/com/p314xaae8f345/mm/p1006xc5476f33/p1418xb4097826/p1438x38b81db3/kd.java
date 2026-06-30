package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class kd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f185356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f185357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f185358g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f185359h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f185360i;

    public kd(in5.s0 s0Var, java.util.List list, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, java.util.List list2, float f17) {
        this.f185355d = s0Var;
        this.f185356e = list;
        this.f185357f = i17;
        this.f185358g = qeVar;
        this.f185359h = list2;
        this.f185360i = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView;
        int intValue;
        in5.s0 holder = this.f185355d;
        java.lang.Object tag = holder.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.edv);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null, java.lang.Boolean.FALSE)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "no focus, no avatarAnimator");
            return;
        }
        java.util.List list = this.f185359h;
        float f17 = this.f185360i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f185358g;
        java.util.List avatarLayoutList = this.f185356e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jd jdVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jd(qeVar, list, avatarLayoutList, f17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarLayoutList, "avatarLayoutList");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d c13821x319c273d = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d) holder.p(com.p314xaae8f345.mm.R.id.i1_);
        if (c13821x319c273d == null || (imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.i19)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) holder.f374658i;
        java.util.LinkedList h17 = nv2.n1.f422084h.h(abstractC14490x69736cb5.getFeedObject().getFeedObject());
        c13821x319c273d.m56020x205ac394(0.1f);
        c13821x319c273d.getChildAt(0).setBackground(null);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, c01.z1.r(), 0.0f);
        c13821x319c273d.setVisibility(0);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.lkg);
        if (viewGroup == null) {
            return;
        }
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.h6i);
        android.graphics.Rect rect = new android.graphics.Rect();
        viewGroup.getGlobalVisibleRect(rect);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        p17.getGlobalVisibleRect(rect2);
        int i17 = rect2.top - rect.top;
        int i18 = rect2.left - rect.left;
        int size = h17.size();
        int i19 = this.f185357f;
        int size2 = size <= 3 ? (h17.size() - 1) * i19 : h17.size() > 3 ? i19 * 2 : 0;
        int i27 = (int) (rect2.left - (i18 * 0.5f));
        int i28 = (int) (rect2.top - (i17 * 2.0f));
        int i29 = rect.left + size2;
        if (gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIKE_ANIMATION_SVR_DISABLE_BOOLEAN_SYNC, false)) {
            intValue = 0;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.T7).mo141623x754a37bb()).r()).intValue();
        }
        android.content.Context context = holder.f374654e;
        int dimension = i29 + ((intValue != 1 || h17.size() < 1) ? 0 : (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
        int i37 = rect.top;
        int b17 = h17.size() != 1 ? i65.a.b(context, 2) : 0;
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(rect2.left, rect2.top);
        path.quadTo(i27, i28, dimension, i37 + b17);
        android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(path, false);
        c13821x319c273d.setVisibility(0);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
        ofFloat.setDuration(470L);
        ofFloat.setInterpolator(new uw2.a(0.6f));
        float[] fArr = new float[2];
        yz5.a aVar = uw2.h0.f513209c;
        if (aVar != null) {
            holder.f3639x46306858.removeCallbacks(new uw2.c0(aVar));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LikeIconAnimationHelper", "register runnable");
        uw2.c cVar = new uw2.c(abstractC14490x69736cb5, avatarLayoutList, jdVar, holder);
        uw2.h0.f513209c = cVar;
        holder.f3639x46306858.postDelayed(new uw2.c0(cVar), 250L);
        ofFloat.addUpdateListener(new uw2.d(pathMeasure, fArr, c13821x319c273d));
        ofFloat.addListener(new uw2.e(c13821x319c273d, avatarLayoutList, abstractC14490x69736cb5, holder, viewGroup));
        ofFloat.start();
        uw2.h0.f513208b = ofFloat;
    }
}
