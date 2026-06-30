package vw2;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f522399e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f522400f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f522401g = new java.util.LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final vw2.g f522402a;

    /* renamed from: b, reason: collision with root package name */
    public final vw2.d f522403b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f522404c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f522405d;

    public n(vw2.g playStrategy, vw2.d conflictStrategy, java.util.List interceptors, p012xc85e97e9.p093xedfae76a.o lifecycle, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i17 & 1) != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209487te).mo141623x754a37bb()).r()).intValue();
            playStrategy = intValue != 0 ? intValue != 1 ? vw2.g.f522375f : vw2.g.f522374e : vw2.g.f522373d;
        }
        if ((i17 & 2) != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            conflictStrategy = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209505ue).mo141623x754a37bb()).r()).intValue() == 0 ? vw2.d.f522368d : vw2.d.f522369e;
        }
        interceptors = (i17 & 4) != 0 ? kz5.p0.f395529d : interceptors;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playStrategy, "playStrategy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conflictStrategy, "conflictStrategy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interceptors, "interceptors");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycle, "lifecycle");
        this.f522402a = playStrategy;
        this.f522403b = conflictStrategy;
        this.f522404c = true;
        this.f522405d = new java.util.ArrayList();
        pm0.v.X(new vw2.a(lifecycle, this, interceptors));
    }

    public static final void a(vw2.n nVar, ww2.b bVar, java.util.List list, in5.s0 s0Var) {
        int i17;
        int i18;
        vw2.n nVar2 = nVar;
        in5.s0 s0Var2 = s0Var;
        nVar.getClass();
        int hashCode = s0Var.hashCode();
        vw2.d dVar = vw2.d.f522369e;
        java.util.Map map = f522401g;
        if (nVar2.f522403b == dVar) {
            android.animation.Animator animator = (android.animation.Animator) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(hashCode));
            if (animator != null) {
                animator.cancel();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ToolbarButtonCarouselAnimationHelper", "startButtonEduAnimation: lastAnimator is null");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var2.f374658i;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            vw2.c cVar = ((vw2.b) it.next()).f522364c;
            arrayList.add(new jz5.l(cVar, nVar2.b(cVar, s0Var2)));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC14490x69736cb5);
        bVar.b(arrayList, abstractC14490x69736cb5);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (java.util.Iterator it6 = list.iterator(); it6.hasNext(); it6 = it6) {
            vw2.b bVar2 = (vw2.b) it6.next();
            long j17 = bVar2.f522362a;
            vw2.c cVar2 = bVar2.f522364c;
            int ordinal = cVar2.ordinal();
            if (ordinal == 0) {
                i17 = com.p314xaae8f345.mm.R.id.f568621ng5;
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                i17 = com.p314xaae8f345.mm.R.id.a_x;
            }
            android.view.View p17 = s0Var2.p(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) p17;
            int ordinal2 = cVar2.ordinal();
            if (ordinal2 == 0) {
                i18 = com.p314xaae8f345.mm.R.id.f568619ng3;
            } else {
                if (ordinal2 != 1) {
                    throw new jz5.j();
                }
                i18 = com.p314xaae8f345.mm.R.id.i1g;
            }
            android.view.View p18 = s0Var2.p(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
            android.widget.TextView b17 = nVar2.b(cVar2, s0Var2);
            int i19 = viewGroup.getLayoutParams().height;
            int height = viewGroup.getHeight();
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = height;
            viewGroup.setLayoutParams(layoutParams);
            int height2 = p18.getHeight();
            b17.setVisibility(0);
            b17.setAlpha(0.0f);
            android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(j17);
            duration.addUpdateListener(new vw2.i(p18, height2, b17));
            android.animation.ValueAnimator duration2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(j17);
            duration2.addUpdateListener(new vw2.j(p18, height2, b17));
            duration2.setStartDelay(bVar2.f522363b);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.playSequentially(duration, duration2);
            vw2.k kVar = new vw2.k(p18, b17, viewGroup, i19);
            animatorSet2.addListener(new vw2.h(kVar, s0Var, bVar2, kVar, s0Var, bVar2));
            arrayList2.add(animatorSet2);
            nVar2 = nVar;
            s0Var2 = s0Var;
            hashCode = hashCode;
        }
        int i27 = hashCode;
        animatorSet.playTogether(arrayList2);
        animatorSet.addListener(new vw2.m(i27, s0Var, i27, s0Var));
        map.put(java.lang.Integer.valueOf(i27), animatorSet);
        animatorSet.start();
    }

    public final android.widget.TextView b(vw2.c cVar, in5.s0 s0Var) {
        int i17;
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            i17 = com.p314xaae8f345.mm.R.id.s77;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            i17 = com.p314xaae8f345.mm.R.id.rts;
        }
        android.view.View p17 = s0Var.p(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        return (android.widget.TextView) p17;
    }
}
