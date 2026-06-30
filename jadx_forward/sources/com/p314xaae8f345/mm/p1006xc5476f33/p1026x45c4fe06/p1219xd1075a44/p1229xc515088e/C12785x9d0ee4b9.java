package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker */
/* loaded from: classes15.dex */
public final class C12785x9d0ee4b9 extends android.widget.FrameLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f173326d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f173327e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f173328f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f173329g;

    /* renamed from: h, reason: collision with root package name */
    public tl1.v f173330h;

    /* renamed from: i, reason: collision with root package name */
    public final tl1.g0 f173331i;

    public C12785x9d0ee4b9(android.content.Context context) {
        super(context);
        this.f173331i = new tl1.f(this);
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562333cv);
        this.f173326d = drawable;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        this.f173327e = linearLayout;
        linearLayout.setPadding(i65.a.b(context, 2), 0, i65.a.b(context, 2), 0);
        linearLayout.setOrientation(0);
        addView(linearLayout, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        linearLayout.setDividerDrawable(drawable);
        linearLayout.setShowDividers(2);
    }

    /* renamed from: getPickersCount */
    private int m53556x93f828e0() {
        android.widget.LinearLayout linearLayout = this.f173327e;
        if (linearLayout == null) {
            return 0;
        }
        return linearLayout.getChildCount();
    }

    public void a(tl1.h[] hVarArr) {
        int length;
        if (hVarArr == null || hVarArr.length <= 0) {
            return;
        }
        int m53556x93f828e0 = m53556x93f828e0();
        m53557xf161ffec(true);
        int length2 = hVarArr.length;
        tl1.g0 g0Var = this.f173331i;
        android.widget.LinearLayout linearLayout = this.f173327e;
        if (m53556x93f828e0 < length2) {
            int length3 = hVarArr.length - m53556x93f828e0;
            if (length3 > 0) {
                while (length3 > 0) {
                    tl1.g gVar = new tl1.g(this, getContext());
                    gVar.m53599x5dc03d58(g0Var);
                    gVar.m53588xbbe0d225("end");
                    gVar.m53587x6c813c5e(i65.a.b(getContext(), 1));
                    gVar.setTag(com.p314xaae8f345.mm.R.id.f564705ym, java.lang.Integer.valueOf(linearLayout.getChildCount()));
                    linearLayout.addView(gVar, new android.widget.LinearLayout.LayoutParams(0, -1, 1.0f));
                    length3--;
                }
            }
        } else if (m53556x93f828e0 > hVarArr.length && (length = m53556x93f828e0 - hVarArr.length) > 0) {
            int m53556x93f828e02 = m53556x93f828e0() - 1;
            for (length = m53556x93f828e0 - hVarArr.length; length > 0; length--) {
                linearLayout.removeViewAt(m53556x93f828e02);
                m53556x93f828e02--;
            }
        }
        for (int i17 = 0; i17 < hVarArr.length; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12788x831bcd82 b17 = b(i17);
            tl1.h hVar = hVarArr[i17];
            b17.m53565x203ffbdd(hVar.f501738a);
            b17.m53604x53d8522f(hVar.f501739b);
            b17.m53599x5dc03d58(g0Var);
        }
        linearLayout.setWeightSum(m53556x93f828e0());
        m53557xf161ffec(false);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12788x831bcd82 b(int i17) {
        android.widget.LinearLayout linearLayout;
        if (i17 >= 0 && (linearLayout = this.f173327e) != null) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12788x831bcd82) linearLayout.getChildAt(i17);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: currentValue */
    public java.lang.Object mo51206x57066778() {
        int m53556x93f828e0 = m53556x93f828e0();
        if (m53556x93f828e0 <= 0) {
            return new int[0];
        }
        int[] iArr = new int[m53556x93f828e0];
        for (int i17 = 0; i17 < m53556x93f828e0; i17++) {
            iArr[i17] = b(i17).m53581x754a37bb();
        }
        return iArr;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: getView */
    public android.view.View mo51207xfb86a31b() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onAttach */
    public void mo51208x3b13c504(tl1.v vVar) {
        this.f173330h = vVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onDetach */
    public void mo51209x3f5eee52(tl1.v vVar) {
        this.f173330h = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onHide */
    public void mo51210xc39a57c1(tl1.v vVar) {
        int m53556x93f828e0 = m53556x93f828e0();
        for (int i17 = 0; i17 < m53556x93f828e0; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12788x831bcd82 b17 = b(i17);
            if (b17 != null) {
                b17.q();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = b17.C1;
                if (n3Var != null) {
                    n3Var.mo50311x7ab51103(b17.g(1, 0, 0, null), 0L);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f173328f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onShow */
    public void mo51211xc39f557c(tl1.v vVar) {
        this.f173330h = vVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f173328f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f173328f) {
            this.f173329g = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: setLayoutFrozen */
    public void m53557xf161ffec(boolean z17) {
        if (this.f173328f != z17) {
            this.f173328f = z17;
            if (z17) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                onTouchEvent(android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            } else if (this.f173329g) {
                requestLayout();
            }
        }
    }
}
