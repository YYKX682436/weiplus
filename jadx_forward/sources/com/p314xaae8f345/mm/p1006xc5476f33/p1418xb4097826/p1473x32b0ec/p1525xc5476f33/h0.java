package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q0 f194278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q0 q0Var) {
        super(2);
        this.f194278d = q0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        int i18;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q0 q0Var = this.f194278d;
        ((mm2.w) q0Var.P0(mm2.w.class)).f411038q = intValue;
        ((mm2.w) q0Var.P0(mm2.w.class)).f411039r = intValue2;
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = q0Var.f195473p.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int i19 = ((mm2.c1) q0Var.P0(mm2.c1.class)).f410412s2;
        int i27 = ((mm2.c1) q0Var.P0(mm2.c1.class)).f410418t2;
        int i28 = com.p314xaae8f345.mm.ui.bl.b(context).x;
        int i29 = com.p314xaae8f345.mm.ui.bl.b(context).y;
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, i28, i29);
        if (intValue2 <= 0 || intValue <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveUtil", "getTargetLiveViewRect video size = 0");
        } else {
            int i37 = context.getResources().getConfiguration().orientation;
            boolean Z1 = r4Var.Z1(intValue, intValue2);
            if (Z1 && 1 == i37) {
                i17 = (int) (i28 * ((intValue2 * 1.0f) / intValue));
                if (i17 <= i29 * 0.68799996f) {
                    i18 = r4Var.B0(i19, i27);
                    rect.left = 0;
                    rect.top = i18;
                    rect.right = i28;
                    rect.bottom = i17 + i18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "getTargetLiveViewRect fitLandscapeVideo:" + Z1 + ",curOrientation:" + i37 + " screenSize:" + i28 + " x " + i29 + " targetRect:" + rect);
                }
            }
            i17 = i29;
            i18 = 0;
            rect.left = 0;
            rect.top = i18;
            rect.right = i28;
            rect.bottom = i17 + i18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "getTargetLiveViewRect fitLandscapeVideo:" + Z1 + ",curOrientation:" + i37 + " screenSize:" + i28 + " x " + i29 + " targetRect:" + rect);
        }
        if (r4Var.Z1(intValue, intValue2)) {
            mm2.h v17 = q0Var.v1();
            if (v17 != null) {
                v17.m66756xebd28962(1);
            }
        } else {
            mm2.h v18 = q0Var.v1();
            if (v18 != null) {
                v18.m66756xebd28962(0);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAdVideoPlugin", "onVideoSizeChange [" + intValue + " x " + intValue2 + "] targetRect:" + rect);
        android.widget.FrameLayout frameLayout = q0Var.f195475r;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = rect.width();
        layoutParams2.height = rect.height();
        layoutParams2.topMargin = rect.top;
        frameLayout.requestLayout();
        return jz5.f0.f384359a;
    }
}
