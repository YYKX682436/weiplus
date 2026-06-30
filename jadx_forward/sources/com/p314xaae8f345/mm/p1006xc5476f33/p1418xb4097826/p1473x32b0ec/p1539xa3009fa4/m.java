package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.n f198764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout.LayoutParams f198765e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.n nVar, android.widget.LinearLayout.LayoutParams layoutParams) {
        this.f198764d = nVar;
        this.f198765e = layoutParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.n nVar = this.f198764d;
        android.view.View view = nVar.f198794f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("optionRoot");
            throw null;
        }
        view.getLocationInWindow(iArr);
        int i17 = iArr[1];
        android.view.View view2 = nVar.f198794f;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("optionRoot");
            throw null;
        }
        int c17 = (com.p314xaae8f345.mm.ui.bl.b(nVar.m158354x19263085()).y - com.p314xaae8f345.mm.ui.bl.c(nVar.m158354x19263085())) - (i17 + view2.getHeight());
        android.widget.LinearLayout linearLayout = nVar.f198793e;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btnContainer");
            throw null;
        }
        int height = c17 - linearLayout.getHeight();
        if (height >= 0) {
            android.widget.LinearLayout.LayoutParams layoutParams = this.f198765e;
            layoutParams.topMargin = height;
            android.widget.LinearLayout linearLayout2 = nVar.f198793e;
            if (linearLayout2 != null) {
                linearLayout2.setLayoutParams(layoutParams);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btnContainer");
                throw null;
            }
        }
    }
}
