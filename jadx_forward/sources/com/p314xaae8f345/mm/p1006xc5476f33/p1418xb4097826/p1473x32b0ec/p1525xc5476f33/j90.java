package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class j90 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f194604p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f194605q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f194606r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f194607s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(android.view.ViewGroup root, qo0.c statueMonitor) {
        super(root, statueMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statueMonitor, "statueMonitor");
        this.f194604p = statueMonitor;
        this.f194605q = "FinderLiveShadowPlugin";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.ien);
        this.f194606r = findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.iep);
        this.f194607s = findViewById2;
        if (!x0()) {
            findViewById.getLayoutParams().height = (int) (com.p314xaae8f345.mm.ui.bl.b(root.getContext()).y * 0.463d);
            return;
        }
        int i17 = com.p314xaae8f345.mm.ui.bl.b(root.getContext()).y;
        double d17 = i17;
        findViewById.getLayoutParams().height = (int) (0.463d * d17);
        findViewById2.getLayoutParams().height = (int) (d17 * 0.232d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveShadowPlugin", "screenHeight:" + i17 + ",shadowDown.height:" + findViewById.getLayoutParams().height + ",shadowUp.height:" + findViewById2.getLayoutParams().height);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        this.f194860i = i17;
        android.view.ViewGroup viewGroup = this.f446856d;
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean z17 = ((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class)).f438216f;
        int i18 = 8;
        if (z17) {
            i17 = 0;
        } else if (this.f194861m == 8) {
            i17 = 8;
        }
        if (pm0.v.z(((mm2.e1) P0(mm2.e1.class)).f410521r.m75939xb282bd08(37), 4096)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f194605q, "flag check Live_Flag_Weakening_Shadows = true, gone");
        } else {
            i18 = i17;
        }
        viewGroup.setVisibility(i18);
        if (i18 == 0) {
            viewGroup.setAlpha(1.0f);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 5) {
            if (ordinal == 6) {
                if (this.f194604p.mo11219xd0598cf8() != 1) {
                    K0(4);
                    return;
                }
                return;
            } else {
                if (ordinal == 7) {
                    K0(0);
                    if (((mm2.e1) P0(mm2.e1.class)).g7()) {
                        this.f194606r.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f80485x551bd17e);
                        return;
                    }
                    return;
                }
                if (ordinal != 27 && ordinal != 28) {
                    return;
                }
            }
        }
        K0(4);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void c1(boolean z17) {
        K0(this.f194860i);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        android.view.View view = this.f194606r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveShadowPlugin", "playEnterAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveShadowPlugin", "playEnterAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f194607s;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveShadowPlugin", "playEnterAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveShadowPlugin", "playEnterAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        K0(0);
        this.f446856d.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i90(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        ((mm2.e1) S0().a(mm2.e1.class)).f410519p.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h90(this));
    }
}
