package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1446x2f6e0a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/edit/FinderVideoEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditorVideoPluginLayoutNew;", "Landroid/view/View;", "getPlayerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.edit.FinderVideoEditPluginLayout */
/* loaded from: classes10.dex */
public final class C13727xf34e5d5c extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17016x4a873f55 {
    public android.graphics.Matrix D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13727xf34e5d5c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17016x4a873f55, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17009xe70f98fd
    /* renamed from: getPlayerView */
    public android.view.View mo55754x6b2da91c() {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.setBackgroundColor(-16777216);
        dc2.n nVar = new dc2.n(getContext());
        m67973x60536bd9(new yt3.o1(nVar, this, (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oyh)));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(nVar, layoutParams);
        return frameLayout;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17009xe70f98fd, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce
    public void m(it3.y navigator, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        android.view.ViewParent parent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigator, "navigator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        super.m(navigator, configProvider);
        android.os.Bundle bundle = configProvider.M;
        if (bundle != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = m67965xcd7d0565().f547092d;
            android.view.ViewParent parent2 = (c19745xad58a1a4 == null || (parent = c19745xad58a1a4.getParent()) == null) ? null : parent.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent2, "null cannot be cast to non-null type android.widget.RelativeLayout");
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.GestureDetectorOnGestureListenerC17036x2d3a1200 gestureDetectorOnGestureListenerC17036x2d3a1200 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.GestureDetectorOnGestureListenerC17036x2d3a1200(context);
            android.graphics.RectF visibilityRect = gestureDetectorOnGestureListenerC17036x2d3a1200.getVisibilityRect();
            android.os.Parcelable parcelable = bundle.getParcelable("cropRect");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(parcelable);
            visibilityRect.set((android.graphics.Rect) parcelable);
            ((android.widget.RelativeLayout) parent2).addView(gestureDetectorOnGestureListenerC17036x2d3a1200, new android.view.ViewGroup.LayoutParams(-1, -1));
            gestureDetectorOnGestureListenerC17036x2d3a1200.m68099x53b6de6f(ru3.o.f481298f);
            gestureDetectorOnGestureListenerC17036x2d3a1200.bringToFront();
            float[] floatArray = bundle.getFloatArray("matrix");
            float[] floatArray2 = bundle.getFloatArray("offset");
            if (floatArray2 == null) {
                floatArray2 = new float[2];
            }
            float f17 = floatArray2[0];
            float f18 = floatArray2[1];
            if (floatArray != null) {
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.setValues(floatArray);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a42 = m67965xcd7d0565().f547092d;
                if (c19745xad58a1a42 != null) {
                    float f19 = floatArray[0];
                    double d17 = f19 * f19;
                    double d18 = floatArray[3];
                    c19745xad58a1a42.setScaleX((float) java.lang.Math.sqrt(d17 + (d18 * d18)));
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a43 = m67965xcd7d0565().f547092d;
                if (c19745xad58a1a43 != null) {
                    float f27 = floatArray[0];
                    double d19 = floatArray[3];
                    c19745xad58a1a43.setScaleY((float) java.lang.Math.sqrt((f27 * f27) + (d19 * d19)));
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a44 = m67965xcd7d0565().f547092d;
                if (c19745xad58a1a44 != null) {
                    c19745xad58a1a44.setTranslationX(f17);
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a45 = m67965xcd7d0565().f547092d;
                if (c19745xad58a1a45 != null) {
                    c19745xad58a1a45.setTranslationY(f18);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("translationX=");
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a46 = m67965xcd7d0565().f547092d;
                sb6.append(c19745xad58a1a46 != null ? java.lang.Float.valueOf(c19745xad58a1a46.getTranslationX()) : null);
                sb6.append(" translationY=");
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a47 = m67965xcd7d0565().f547092d;
                sb6.append(c19745xad58a1a47 != null ? java.lang.Float.valueOf(c19745xad58a1a47.getTranslationY()) : null);
                sb6.append(" scaleX=");
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a48 = m67965xcd7d0565().f547092d;
                sb6.append(c19745xad58a1a48 != null ? java.lang.Float.valueOf(c19745xad58a1a48.getScaleX()) : null);
                sb6.append(" offsetX=");
                sb6.append(f17);
                sb6.append(" offsetY=");
                sb6.append(f18);
                sb6.append(" matrix=");
                sb6.append(matrix);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoPluginLayoutNew", sb6.toString());
                android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                this.D = matrix2;
                matrix.invert(matrix2);
            }
        }
        getCropVideoPlugin().f95656s = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17016x4a873f55, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17009xe70f98fd, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 63 && ordinal != 65) {
            if (status != ju3.c0.f383418l1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorVideoPluginLayoutNew", "unknown status " + status);
            }
            super.w(status, bundle);
            return;
        }
        java.lang.String b17 = getBgPlugin().b();
        m67965xcd7d0565().mo9065x41012807();
        getItemContainerPlugin().mo11000xb01dfb57();
        m67949x585d574d().mo11000xb01dfb57();
        if (getMoreMenuPlugin().f546965m) {
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            i17 = 1;
        } else {
            i17 = 0;
        }
        ut3.f fVar = ut3.f.f512709c;
        fVar.f512711b.putInt("key_extra_feature_flag", i17);
        int i18 = getMoreMenuPlugin().f546966n;
        android.os.Bundle bundle2 = fVar.f512711b;
        if (i18 == 2) {
            bundle2.putString("key_group_list", getMoreMenuPlugin().a());
        } else if (getMoreMenuPlugin().f546966n == 3) {
            bundle2.putString("key_black_list", getMoreMenuPlugin().a());
        }
        st3.s sVar = new st3.s(m67949x585d574d().c(), m67949x585d574d().f376531n, getItemContainerPlugin().d(this.D), getItemContainerPlugin().c(), getItemContainerPlugin().b(), m67965xcd7d0565().f547100o, m67965xcd7d0565().f547101p, new java.util.ArrayList(), b17, getItemContainerPlugin().b());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoPluginLayoutNew", "edit config: " + sVar);
        getReMuxPlugin().m(sVar);
        nu3.i iVar = nu3.i.f421751a;
        iVar.n("KEY_ADD_EMOJI_COUNT_INT", java.lang.Integer.valueOf(getItemContainerPlugin().e()));
        iVar.n("KEY_ADD_TEXT_COUNT_INT", java.lang.Integer.valueOf(getItemContainerPlugin().f()));
        iVar.n("KEY_SELECT_MUSIC_INT", java.lang.Integer.valueOf(m67949x585d574d().f376531n == null ? 0 : 1));
        iVar.n("KEY_SELECT_ORIGIN_INT", java.lang.Integer.valueOf(!m67949x585d574d().c() ? 1 : 0));
        iVar.n("KEY_AFTER_EDIT_INT", 1);
        iVar.h();
        iVar.d(13);
        nu3.i.f421754d.f142407i = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = getConfigProvider();
        iVar.g(configProvider != null ? configProvider.F : 0);
        wt3.v vVar = wt3.v.f531038i;
        if (vVar != null) {
            vVar.e();
        }
    }
}
