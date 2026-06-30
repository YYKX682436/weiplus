package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class os extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15365x472b1ba2 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt f217016g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar, android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f217016g = ptVar;
        int dimension = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.topMargin = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        layoutParams.setMarginStart((int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
        layoutParams.gravity = 8388611;
        getIconLayout().setLayoutParams(layoutParams);
        getIconLayout().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ks(ptVar));
        getIconLayout();
        float f17 = dimension / 2.0f;
        getIconLayout().setPivotX(f17);
        getIconLayout().setPivotY(f17);
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.os osVar, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17) {
        osVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.js jsVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.js.f216423h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar = osVar.f217016g;
        ptVar.f217157y = jsVar;
        ptVar.c7(s0Var, abstractC14490x69736cb5);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = s0Var.f374655f;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = f2Var instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) f2Var : null;
        java.lang.Object w07 = c22848x6ddd90cf != null ? c22848x6ddd90cf.w0(s0Var.m8185xcdaf1228()) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar = w07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf) w07 : null;
        if (zfVar != null) {
            android.view.View itemView = s0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObj = abstractC14490x69736cb5.getFeedObject().getFeedObject();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FEED_ENTER_CLICK_AREA", i17);
            intent.putExtra("KEY_ENTER_LIVE_ON_LANDSCAPE", true);
            zfVar.s0(s0Var, itemView, finderObj, null, intent);
        }
    }

    /* renamed from: setLandscapeLiveBullet */
    private final void m63207x6b451e67(in5.s0 s0Var) {
        cg2.k kVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = s0Var.f374655f;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = f2Var instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) f2Var : null;
        java.lang.Object w07 = c22848x6ddd90cf != null ? c22848x6ddd90cf.w0(s0Var.m8185xcdaf1228()) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar = w07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf) w07 : null;
        if (zfVar != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.uah);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar = this.f217016g;
            ptVar.I = frameLayout;
            if (frameLayout != null) {
                android.view.ViewParent parent = frameLayout.getParent();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                ptVar.F = viewGroup;
                ptVar.G = viewGroup.indexOfChild(ptVar.I);
                android.widget.FrameLayout frameLayout2 = ptVar.I;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout2);
                ptVar.H = frameLayout2.getLayoutParams();
                uc2.b bVar = (uc2.b) zfVar.f186384e.a(s0Var, uc2.b.class);
                if (bVar != null) {
                    bg2.x0 x0Var = (bg2.x0) bVar;
                    if (x0Var.f102152n && (kVar = x0Var.f102149h) != null) {
                        kVar.mo14788x53a1e732(true);
                    }
                }
                android.view.ViewGroup viewGroup2 = ptVar.F;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(frameLayout);
                }
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                layoutParams.topMargin = getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                addView(frameLayout, 2, layoutParams);
                zfVar.R1(s0Var, frameLayout, false);
            }
        }
    }

    public final boolean b(in5.s0 focusHolder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item) {
        java.lang.String valueOf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusHolder, "focusHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) focusHolder.p(com.p314xaae8f345.mm.R.id.e_k);
        if (c15196x85976f5f != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderVideoOrientationUIC addPreview: videoView = ");
            sb6.append(c15196x85976f5f.getVideoView());
            sb6.append(", activity = ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar = this.f217016g;
            sb6.append(ptVar.m158354x19263085().getClass().getSimpleName());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HorizontalLivePreviewLayout", sb6.toString());
            if (!(c15196x85976f5f.getVideoView() instanceof cw2.u9)) {
                c15196x85976f5f = null;
            }
            if (c15196x85976f5f != null) {
                c15196x85976f5f.getPlayInfo();
                ptVar.getClass();
                dw2.c0 v17 = c15196x85976f5f.m61487x4ed8f404().v();
                if (v17 != null) {
                    dw2.c0.h(v17, "FinderHDRVideoOrientationUIC", true, false, 4, null);
                }
                cw2.da videoView = c15196x85976f5f.getVideoView();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(videoView);
                ptVar.f217146n = videoView.mo56698x4ee17f0a();
                focusHolder.o().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ns(focusHolder, ptVar));
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = ptVar.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                qt2.b0 b0Var = (qt2.b0) pf5.z.f435481a.a(activity).e(qt2.b0.class);
                if (b0Var != null) {
                    b0Var.b7();
                }
                videoView.mo56712x9e476d06(true);
                videoView.mo56705x49dc7633(true);
                ptVar.P6(false);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17 = focusHolder.o();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea = o17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) o17 : null;
                if (c13728x20aad6ea != null) {
                    c13728x20aad6ea.V0(c13728x20aad6ea.m55757xdfe058b8());
                }
                android.view.ViewParent parent = videoView.mo56698x4ee17f0a().getParent();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                ptVar.f217143h = viewGroup;
                ptVar.f217144i = viewGroup.indexOfChild(videoView.mo56698x4ee17f0a());
                ptVar.f217145m = new android.view.ViewGroup.LayoutParams(videoView.mo56698x4ee17f0a().getWidth(), videoView.mo56698x4ee17f0a().getHeight());
                android.view.ViewGroup viewGroup2 = ptVar.f217143h;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(videoView.mo56698x4ee17f0a());
                }
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                float mo61342x8d129846 = ((cw2.u9) videoView).mo61342x8d129846();
                int i17 = ptVar.m158354x19263085().getResources().getDisplayMetrics().widthPixels;
                int i18 = ptVar.m158354x19263085().getResources().getDisplayMetrics().heightPixels;
                if (i17 < i18) {
                    i17 = i18;
                }
                int i19 = ptVar.m158354x19263085().getResources().getDisplayMetrics().widthPixels;
                int i27 = ptVar.m158354x19263085().getResources().getDisplayMetrics().heightPixels;
                if (i19 > i27) {
                    i19 = i27;
                }
                float f17 = i17;
                float f18 = i19;
                float f19 = (1.0f * f17) / f18;
                if ((mo61342x8d129846 == 0.0f) || mo61342x8d129846 >= f19) {
                    layoutParams.width = i17;
                    layoutParams.height = a06.d.b(f17 / mo61342x8d129846);
                } else {
                    layoutParams.width = a06.d.b(f18 * mo61342x8d129846);
                    layoutParams.height = i19;
                }
                addView(videoView.mo56698x4ee17f0a(), 1, layoutParams);
                getLiveRecommendView().setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51 liveRecommendView = getLiveRecommendView();
                r45.nw1 m59258xd0557130 = item.getFeedObject().m59258xd0557130();
                r45.nw1 m59258xd05571302 = item.getFeedObject().m59258xd0557130();
                liveRecommendView.b(m59258xd0557130, m59258xd05571302 != null ? m59258xd05571302.m75939xb282bd08(2) : 2);
                getLiveRecommendView().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ls(this, focusHolder, item));
                getBgView().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ms(this, focusHolder, item));
                m63207x6b451e67(focusHolder);
                ml2.t1 t1Var = ml2.t1.f409502n3;
                jz5.l[] lVarArr = new jz5.l[2];
                r45.nw1 m59258xd05571303 = item.getFeedObject().m59258xd0557130();
                lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(m59258xd05571303 != null ? java.lang.Long.valueOf(m59258xd05571303.m75942xfb822ef2(0)) : null));
                if (ptVar.A) {
                    ml2.z2[] z2VarArr = ml2.z2.f409874d;
                    valueOf = java.lang.String.valueOf(1);
                } else {
                    ml2.z2[] z2VarArr2 = ml2.z2.f409874d;
                    valueOf = java.lang.String.valueOf(2);
                }
                lVarArr[1] = new jz5.l("mode_type", valueOf);
                ptVar.d7(focusHolder, item, t1Var, kz5.c1.l(lVarArr));
                return true;
            }
        }
        return false;
    }
}
