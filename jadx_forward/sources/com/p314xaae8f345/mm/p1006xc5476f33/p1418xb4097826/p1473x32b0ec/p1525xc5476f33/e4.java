package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class e4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 f193899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f193900e;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var, android.view.ViewGroup viewGroup) {
        this.f193899d = a5Var;
        this.f193900e = viewGroup;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        df2.w5 w5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var = this.f193899d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5.u1(a5Var, false);
        df2.d6 d6Var = (df2.d6) a5Var.U0(df2.d6.class);
        if (d6Var != null) {
            android.content.Context context = this.f193900e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d4 d4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d4(a5Var);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            df2.n5 n5Var = (df2.n5) d6Var.m56789x25fe639c(df2.n5.class);
            linkedHashMap.put("switch_type", java.lang.Integer.valueOf((n5Var == null || !n5Var.f312367n) ? 0 : 1));
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Nj("live_anchor_gesture_features_switch", "view_exp", linkedHashMap);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
            android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
            android.view.View view = y1Var.f293560f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            y1Var.l(from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.alw, (android.view.ViewGroup) view, false), new android.widget.FrameLayout.LayoutParams(-1, -1));
            y1Var.a();
            android.view.View view2 = y1Var.f293560f;
            view2.setPadding(view2.getPaddingLeft(), y1Var.f293560f.getPaddingTop(), y1Var.f293560f.getPaddingRight(), y1Var.f293560f.getPaddingBottom() + a5Var.f193331p0);
            y1Var.f293570s = new df2.x5(d4Var, d6Var);
            y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2).setOnClickListener(new df2.y5(y1Var));
            sg2.a0 a0Var = sg2.a0.f489415a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(sg2.a0.f489417c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GestureEffectAnchorSettingController", "gestureInfoList size:" + arrayList.size());
            android.view.View rootView = y1Var.f293560f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView, "rootView");
            df2.w5 w5Var2 = new df2.w5(d6Var, rootView, arrayList);
            d6Var.f311478m = w5Var2;
            android.view.View view3 = w5Var2.f313193c;
            if (view3 != null) {
                view3.setOnClickListener(new df2.z5(y1Var));
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.d_0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(new df2.s5((r45.ir1) it.next()));
            }
            arrayList2.addAll(arrayList3);
            c22849x81a93d25.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.controller.GestureEffectAnchorSettingController$showSettingPanel$1$adapter$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return new df2.q5();
                }
            }, arrayList2, false));
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, java.lang.Math.max(java.lang.Integer.min(arrayList2.size(), 3), 1)));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.ntc);
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(df2.d6.f311477n.c(d6Var.getStore().getLiveRoomData()));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                ((df2.s5) it6.next()).f312824e = viewOnClickListenerC22631x1cc07cc8.f292896x;
            }
            if (viewOnClickListenerC22631x1cc07cc8.f292896x && (w5Var = d6Var.f311478m) != null) {
                w5Var.b();
            }
            viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new df2.b6(d6Var, viewOnClickListenerC22631x1cc07cc8, context, arrayList2, c22849x81a93d25));
            y1Var.s();
        }
    }
}
