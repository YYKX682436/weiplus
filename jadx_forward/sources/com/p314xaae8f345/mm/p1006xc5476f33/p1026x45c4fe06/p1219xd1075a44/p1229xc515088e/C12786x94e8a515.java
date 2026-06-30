package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPickerV2 */
/* loaded from: classes15.dex */
public final class C12786x94e8a515 extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f173332d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f173333e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f173334f;

    /* renamed from: g, reason: collision with root package name */
    public tl1.v f173335g;

    public C12786x94e8a515(android.content.Context context) {
        super(context);
        setOrientation(0);
        this.f173332d = new java.util.ArrayList();
    }

    /* renamed from: getPickersCount */
    private int m53558x93f828e0() {
        return getChildCount();
    }

    public void a(tl1.j[] jVarArr) {
        int length;
        if (jVarArr == null || jVarArr.length <= 0) {
            return;
        }
        int m53558x93f828e0 = m53558x93f828e0();
        m53559xf161ffec(true);
        if (m53558x93f828e0 < jVarArr.length) {
            int length2 = jVarArr.length - m53558x93f828e0;
            if (length2 > 0) {
                for (int i17 = 0; i17 < length2; i17++) {
                    int i18 = jVarArr[i17].f501743b;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83 c12789x831bcd83 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83(getContext());
                    c12789x831bcd83.f173344h = i18;
                    c12789x831bcd83.b();
                    float dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561670pc);
                    w51.e eVar = c12789x831bcd83.f173341e;
                    eVar.f524505p.f524514b.m48599x6c813c5e(dimensionPixelSize);
                    getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a7c);
                    eVar.f524505p.getClass();
                    ((java.util.ArrayList) this.f173332d).add(c12789x831bcd83);
                    addView(c12789x831bcd83.mo51207xfb86a31b(), new android.widget.LinearLayout.LayoutParams(-1, -2, 1.0f));
                }
                b();
            }
        } else if (m53558x93f828e0 > jVarArr.length && (length = m53558x93f828e0 - jVarArr.length) > 0) {
            int m53558x93f828e02 = m53558x93f828e0() - 1;
            for (length = m53558x93f828e0 - jVarArr.length; length > 0; length--) {
                removeViewAt(m53558x93f828e02);
                m53558x93f828e02--;
            }
            b();
        }
        for (int i19 = 0; i19 < jVarArr.length; i19++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83 c17 = c(i19);
            tl1.j jVar = jVarArr[i19];
            java.lang.String[] strArr = jVar.f501742a;
            c17.f173340d = strArr;
            c17.f173341e.f(java.util.Arrays.asList(strArr));
            c17.f173344h = jVar.f501743b;
            tl1.i iVar = new tl1.i(this, i19);
            w51.e eVar2 = c17.f173341e;
            eVar2.f524499g.f506316d = iVar;
            eVar2.f524505p.f524516d = iVar;
        }
        setWeightSum(m53558x93f828e0());
        m53559xf161ffec(false);
    }

    public final void b() {
        java.util.List list = this.f173332d;
        if (((java.util.ArrayList) list).size() == 1) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83) ((java.util.ArrayList) list).get(0)).mo51207xfb86a31b().setPadding(0, getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            return;
        }
        if (((java.util.ArrayList) list).size() == 2) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83) ((java.util.ArrayList) list).get(0)).mo51207xfb86a31b().setPadding(0, getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83) ((java.util.ArrayList) list).get(1)).mo51207xfb86a31b().setPadding(getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        } else if (((java.util.ArrayList) list).size() == 3) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83) ((java.util.ArrayList) list).get(0)).mo51207xfb86a31b().setPadding(0, getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83) ((java.util.ArrayList) list).get(1)).mo51207xfb86a31b().setPadding(getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83) ((java.util.ArrayList) list).get(2)).mo51207xfb86a31b().setPadding(getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83 c(int i17) {
        if (i17 < 0) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83) ((java.util.ArrayList) this.f173332d).get(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: currentValue */
    public java.lang.Object mo51206x57066778() {
        int m53558x93f828e0 = m53558x93f828e0();
        if (m53558x93f828e0 <= 0) {
            return new int[0];
        }
        int[] iArr = new int[m53558x93f828e0];
        for (int i17 = 0; i17 < m53558x93f828e0; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83 c17 = c(i17);
            c17.f173341e.e();
            iArr[i17] = c17.f173343g;
        }
        return iArr;
    }

    public void d(int i17, tl1.j jVar) {
        if (i17 >= 0 && i17 < m53558x93f828e0() && jVar != null) {
            m53559xf161ffec(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83 c17 = c(i17);
            java.lang.String[] strArr = jVar.f501742a;
            c17.f173340d = strArr;
            c17.f173341e.f(java.util.Arrays.asList(strArr));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(strArr)) {
                c(i17).f173341e.d().m48596x940d026a(jVar.f501743b);
            }
            m53559xf161ffec(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: getView */
    public android.view.View mo51207xfb86a31b() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onAttach */
    public void mo51208x3b13c504(tl1.v vVar) {
        this.f173335g = vVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onDetach */
    public void mo51209x3f5eee52(tl1.v vVar) {
        this.f173335g = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onHide */
    public void mo51210xc39a57c1(tl1.v vVar) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f173333e) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onShow */
    public void mo51211xc39f557c(tl1.v vVar) {
        this.f173335g = vVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f173333e) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f173333e) {
            this.f173334f = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: setLayoutFrozen */
    public void m53559xf161ffec(boolean z17) {
        if (this.f173333e != z17) {
            this.f173333e = z17;
            if (z17) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                onTouchEvent(android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            } else if (this.f173334f) {
                requestLayout();
            }
        }
    }
}
