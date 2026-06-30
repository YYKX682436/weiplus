package qt2;

/* loaded from: classes2.dex */
public final class m extends qt2.j {

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Runnable f448133r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f448134s;

    /* renamed from: t, reason: collision with root package name */
    public float f448135t;

    /* renamed from: u, reason: collision with root package name */
    public final int f448136u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f448135t = -1.0f;
        this.f448136u = android.view.ViewConfiguration.getTouchSlop();
    }

    @Override // qt2.j
    public int Q6() {
        return com.p314xaae8f345.mm.R.id.fvq;
    }

    @Override // qt2.j
    public void S6(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.S6(recyclerView);
        android.view.View view = this.f448121e;
        if (view != null) {
            view.setOnClickListener(new qt2.k(this));
        }
    }

    @Override // qt2.j
    public boolean X6() {
        if (this.f448134s) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.W3).mo141623x754a37bb()).r()).intValue() == 1 || ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).f120759d) {
            return false;
        }
        ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209222f3).mo141623x754a37bb()).r()).intValue();
        return false;
    }

    @Override // qt2.j
    public void Y6() {
        android.view.View view;
        if (this.f448122f || T6() || (view = this.f448121e) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC", "popupEntrance", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC", "popupEntrance", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC", "popupEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC", "popupEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        W6(i65.a.b(m80379x76847179(), 80), 300L);
        view.animate().alpha(1.0f).setDuration(300L).start();
        this.f448122f = true;
        view.removeCallbacks(this.f448133r);
        qt2.l lVar = new qt2.l(this);
        this.f448133r = lVar;
        view.postDelayed(lVar, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        java.lang.String m158362x2fec8307 = m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.cmp);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3 y3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3.f207005a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        long c17 = c01.id.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158362x2fec8307);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3.a(y3Var, V6, 1, c17, 0, 2, m158362x2fec8307, 0, null, 128, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f448134s = m158359x1e885992().getBooleanExtra("is_from_ad", false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        android.view.View view = this.f448121e;
        if (view != null) {
            view.removeCallbacks(this.f448133r);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f448135t = -1.0f;
        this.f448136u = android.view.ViewConfiguration.getTouchSlop();
    }
}
