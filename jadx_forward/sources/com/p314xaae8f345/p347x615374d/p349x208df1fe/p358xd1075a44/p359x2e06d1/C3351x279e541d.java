package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKScrollView */
/* loaded from: classes9.dex */
public class C3351x279e541d extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a<com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3521x19c6a1bd {
    protected static final java.lang.String TAG = "MMKScrollView";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a, com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: addView */
    public void mo26894xbb8aeee6(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190, int i17) {
        if (interfaceC3545x4499190 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(TAG, "%s addView: %s, childCount: %s %s", this, interfaceC3545x4499190, java.lang.Integer.valueOf(((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a) interfaceC3545x4499190).f13249xfa502bda.size()), java.lang.Integer.valueOf(this.f13249xfa502bda.size()));
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(TAG, "%s addView: %s, childCount: %s", this, interfaceC3545x4499190, java.lang.Integer.valueOf(this.f13249xfa502bda.size()));
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 c3352x70ee8bf0 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0) interfaceC3545x4499190;
        this.f13249xfa502bda.add(c3352x70ee8bf0);
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).addView(c3352x70ee8bf0.mo27110xfb86a31b());
        float mo26223x63bacacb = interfaceC3545x4499190.mo26223x63bacacb();
        float mo26225x13f4efd8 = interfaceC3545x4499190.mo26225x13f4efd8();
        float mo26227xc1272e11 = interfaceC3545x4499190.mo26227xc1272e11();
        float mo26221x4fb623ef = interfaceC3545x4499190.mo26221x4fb623ef();
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 c3352x70ee8bf02 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0) interfaceC3545x4499190;
        if (c3352x70ee8bf02.mo27110xfb86a31b().getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) c3352x70ee8bf02.mo27110xfb86a31b().getLayoutParams();
            marginLayoutParams.topMargin = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(this.f13206xd6cfe882, mo26227xc1272e11);
            marginLayoutParams.bottomMargin = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(this.f13206xd6cfe882, mo26221x4fb623ef);
            marginLayoutParams.leftMargin = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(this.f13206xd6cfe882, mo26223x63bacacb);
            marginLayoutParams.rightMargin = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(this.f13206xd6cfe882, mo26225x13f4efd8);
            c3352x70ee8bf02.mo27110xfb86a31b().setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3521x19c6a1bd
    /* renamed from: getContentOffset */
    public com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05 mo27077xa24e42b6() {
        int c17 = i65.a.c(((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).getContext(), ((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).getScrollX());
        int c18 = i65.a.c(((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).getContext(), ((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).getScrollY());
        com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05 c3503x8496dc05 = new com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05(c17, c18);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(TAG, "getContentOffset  X: %s, Y: %s", java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(c18));
        return c3503x8496dc05;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getHeight */
    public float mo26216x1c4fb41d() {
        int i17;
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get() != null) {
            android.util.DisplayMetrics displayMetrics = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get().getResources().getDisplayMetrics();
            int m27359xc5e1a28f = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27359xc5e1a28f(((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).getContext(), ((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).getHeight());
            int m27359xc5e1a28f2 = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27359xc5e1a28f(((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).getContext(), displayMetrics.heightPixels);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(TAG, "getView() - %s scroolviewheight: %s,screenheight: %s", this, java.lang.Integer.valueOf(m27359xc5e1a28f), java.lang.Integer.valueOf(m27359xc5e1a28f2));
            i17 = java.lang.Math.min(m27359xc5e1a28f, m27359xc5e1a28f2);
        } else {
            i17 = 0;
        }
        return i17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3521x19c6a1bd
    /* renamed from: getScrollToDimissKeyboardEnabled */
    public boolean mo27078xea804b1b() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3521x19c6a1bd
    /* renamed from: getScrollWhenViewSizeEnough */
    public boolean mo27079xf10ae253() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3521x19c6a1bd
    /* renamed from: getShowScrollBar */
    public boolean mo27080xb00c9bd3() {
        return ((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).isVerticalScrollBarEnabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a, com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: removeView */
    public void mo27081x417bc549(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 c3352x70ee8bf0 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0) interfaceC3545x4499190;
        this.f13249xfa502bda.remove(c3352x70ee8bf0.mo27110xfb86a31b());
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).removeView(c3352x70ee8bf0.mo27110xfb86a31b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3521x19c6a1bd
    /* renamed from: scrollTo */
    public void mo27082xe8077228(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190, float f17, float f18, boolean z17) {
        android.view.View mo27110xfb86a31b = ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0) interfaceC3545x4499190).mo27110xfb86a31b();
        int m27357xb0f6c08f = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(this.f13206xd6cfe882, f17);
        int m27357xb0f6c08f2 = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(this.f13206xd6cfe882, f18);
        if (this.f13249xfa502bda.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "has not contentView");
            return;
        }
        com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05 mo26188x994be9bd = interfaceC3545x4499190.mo26188x994be9bd(new com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05(0.0f, 0.0f), this.f13249xfa502bda.get(0));
        float a17 = i65.a.a(this.f13206xd6cfe882, interfaceC3545x4499190.mo26188x994be9bd(new com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05(0.0f, 0.0f), this).mY);
        float height = mo27110xfb86a31b.getHeight() + a17;
        if (a17 >= 0.0f && height <= ((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).getHeight()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "view is perfect visible, no need scroll to");
            return;
        }
        int a18 = i65.a.a(this.f13206xd6cfe882, mo26188x994be9bd.mX);
        int a19 = m27357xb0f6c08f2 + i65.a.a(this.f13206xd6cfe882, mo26188x994be9bd.mY);
        int i17 = m27357xb0f6c08f + a18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "scrollTo x:%s y:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a19));
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).scrollTo(java.lang.Math.max(i17, 0), java.lang.Math.max(a19, 0));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3521x19c6a1bd
    /* renamed from: setContent */
    public void mo27083xe9f5bdb7(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3521x19c6a1bd
    /* renamed from: setContentInsect */
    public void mo27084x2b5e057f(float f17, float f18, float f19, float f27) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3521x19c6a1bd
    /* renamed from: setContentOffset */
    public void mo27085x3524a92a(com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05 c3503x8496dc05) {
        final int m27357xb0f6c08f = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).getContext(), (int) c3503x8496dc05.m28092x305bc2());
        final int m27357xb0f6c08f2 = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).getContext(), (int) c3503x8496dc05.m28093x305bc3());
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).postDelayed(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKScrollView.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                ((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3351x279e541d.this.mo27110xfb86a31b()).scrollBy(m27357xb0f6c08f, m27357xb0f6c08f2);
            }
        }, 150L);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(TAG, "setContentOffset  X: %s, Y: %s", java.lang.Integer.valueOf(m27357xb0f6c08f), java.lang.Integer.valueOf(m27357xb0f6c08f2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3521x19c6a1bd
    /* renamed from: setOnScrollCallback */
    public void mo27087xbfa5f273(final com.p314xaae8f345.p347x615374d.gen.AbstractC3522x7162c1ce abstractC3522x7162c1ce) {
        if (abstractC3522x7162c1ce != null) {
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).m83082x1a2696e2(new com.p314xaae8f345.mm.p2802xd031a825.ui.o() { // from class: com.tencent.kinda.framework.widget.base.MMKScrollView.1
                @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.o
                /* renamed from: onScrollChange */
                public void mo27091x2d3d645c(android.view.View view, int i17, int i18, int i19, int i27) {
                    abstractC3522x7162c1ce.mo28138x58dabd8c(i65.a.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3351x279e541d.this.f13206xd6cfe882, i17), i65.a.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3351x279e541d.this.f13206xd6cfe882, i18));
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3521x19c6a1bd
    /* renamed from: setScrollToDimissKeyboardEnabled */
    public void mo27088x4cc3498f(boolean z17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3521x19c6a1bd
    /* renamed from: setScrollWhenViewSizeEnough */
    public void mo27089xa0d7ab5f(boolean z17) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3521x19c6a1bd
    /* renamed from: setShowScrollBar */
    public void mo27090x42e30247(boolean z17) {
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) mo27110xfb86a31b()).setVerticalScrollBarEnabled(z17);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2 mo26107x519d71c1(android.content.Context context) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2 viewOnFocusChangeListenerC22901x93fec4d2 = new com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2(context);
        viewOnFocusChangeListenerC22901x93fec4d2.setOverScrollMode(2);
        viewOnFocusChangeListenerC22901x93fec4d2.setFillViewport(true);
        return viewOnFocusChangeListenerC22901x93fec4d2;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3521x19c6a1bd
    /* renamed from: setContentOffset */
    public void mo27086x3524a92a(com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05 c3503x8496dc05, boolean z17) {
        mo27085x3524a92a(c3503x8496dc05);
    }
}
