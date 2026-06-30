package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes5.dex */
public final class qa implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f f211260d;

    public qa(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f) {
        this.f211260d = activityC15047x3a53ff1f;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        if (i38 != i27) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f = this.f211260d;
            int dimensionPixelSize = activityC15047x3a53ff1f.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            if (i38 < i27) {
                android.view.View view2 = activityC15047x3a53ff1f.f210166y;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputContainer");
                    throw null;
                }
                if (view2.getHeight() < dimensionPixelSize) {
                    android.view.View view3 = activityC15047x3a53ff1f.f210166y;
                    if (view3 != null) {
                        view3.scrollBy(0, i27 - i38);
                        return;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputContainer");
                        throw null;
                    }
                }
                return;
            }
            android.view.View view4 = activityC15047x3a53ff1f.f210166y;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputContainer");
                throw null;
            }
            if (view4.getScrollY() > 0) {
                android.view.View view5 = activityC15047x3a53ff1f.f210166y;
                if (view5 != null) {
                    view5.scrollBy(0, i27 - i38);
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputContainer");
                    throw null;
                }
            }
        }
    }
}
