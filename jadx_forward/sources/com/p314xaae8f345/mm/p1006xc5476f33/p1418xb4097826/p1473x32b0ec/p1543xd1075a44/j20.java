package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class j20 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 f200250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f200251e;

    public j20(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var, android.view.ViewGroup viewGroup) {
        this.f200250d = e30Var;
        this.f200251e = viewGroup;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        df2.xw xwVar;
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorLikeWidget$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int actionMasked = motionEvent.getActionMasked();
        android.view.ViewGroup viewGroup = this.f200251e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var = this.f200250d;
        if (actionMasked == 0) {
            e30Var.f199752x.setVisibility(4);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(e30Var.I);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30.t1(e30Var, viewGroup, 1.5f);
            e30Var.v1(false);
            e30Var.w1(true);
            e30Var.f199750v.setAlpha(0.3f);
            e30Var.f199753y.setAlpha(0.0f);
        } else if (actionMasked == 1 || actionMasked == 3) {
            viewGroup.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i20(e30Var, viewGroup), 100L);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(e30Var.I, 200L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e30Var.f199746r, "[ken_stopPostLike]");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(e30Var, null, p3325xe03a0797.p3326xc267989b.a1.UNDISPATCHED, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a30(e30Var, null), 1, null);
            e30Var.f199750v.setAlpha(1.0f);
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m20(e30Var, e30Var.E));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = e30Var.f199745q;
            if (((mm2.c1) lVar.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) lVar.X0(xu2.u.class)) != null && (vVar = uVar.f538765r) != null) {
                vVar.a();
                vVar.c(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46348x908ed654);
            }
            if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.P6).mo141623x754a37bb()).r()).booleanValue() && (xwVar = (df2.xw) e30Var.U0(df2.xw.class)) != null && (j0Var = xwVar.f313346q) != null) {
                j0Var.mo7808x76db6cb1(java.lang.Boolean.valueOf(!xwVar.f313347r));
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorLikeWidget$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
