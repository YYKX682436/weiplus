package com.tencent.mm.plugin.appbrand.widget.picker;

/* loaded from: classes15.dex */
public final class AppBrandMultiOptionsPickerV2 extends android.widget.LinearLayout implements com.tencent.mm.plugin.appbrand.jsapi.picker.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f91799d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f91800e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f91801f;

    /* renamed from: g, reason: collision with root package name */
    public tl1.v f91802g;

    public AppBrandMultiOptionsPickerV2(android.content.Context context) {
        super(context);
        setOrientation(0);
        this.f91799d = new java.util.ArrayList();
    }

    private int getPickersCount() {
        return getChildCount();
    }

    public void a(tl1.j[] jVarArr) {
        int length;
        if (jVarArr == null || jVarArr.length <= 0) {
            return;
        }
        int pickersCount = getPickersCount();
        setLayoutFrozen(true);
        if (pickersCount < jVarArr.length) {
            int length2 = jVarArr.length - pickersCount;
            if (length2 > 0) {
                for (int i17 = 0; i17 < length2; i17++) {
                    int i18 = jVarArr[i17].f420210b;
                    com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3 appBrandOptionsPickerV3 = new com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3(getContext());
                    appBrandOptionsPickerV3.f91811h = i18;
                    appBrandOptionsPickerV3.b();
                    float dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480137pc);
                    w51.e eVar = appBrandOptionsPickerV3.f91808e;
                    eVar.f442972p.f442981b.setDividerHeight(dimensionPixelSize);
                    getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a7c);
                    eVar.f442972p.getClass();
                    ((java.util.ArrayList) this.f91799d).add(appBrandOptionsPickerV3);
                    addView(appBrandOptionsPickerV3.getView(), new android.widget.LinearLayout.LayoutParams(-1, -2, 1.0f));
                }
                b();
            }
        } else if (pickersCount > jVarArr.length && (length = pickersCount - jVarArr.length) > 0) {
            int pickersCount2 = getPickersCount() - 1;
            for (length = pickersCount - jVarArr.length; length > 0; length--) {
                removeViewAt(pickersCount2);
                pickersCount2--;
            }
            b();
        }
        for (int i19 = 0; i19 < jVarArr.length; i19++) {
            com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3 c17 = c(i19);
            tl1.j jVar = jVarArr[i19];
            java.lang.String[] strArr = jVar.f420209a;
            c17.f91807d = strArr;
            c17.f91808e.f(java.util.Arrays.asList(strArr));
            c17.f91811h = jVar.f420210b;
            tl1.i iVar = new tl1.i(this, i19);
            w51.e eVar2 = c17.f91808e;
            eVar2.f442966g.f424783d = iVar;
            eVar2.f442972p.f442983d = iVar;
        }
        setWeightSum(getPickersCount());
        setLayoutFrozen(false);
    }

    public final void b() {
        java.util.List list = this.f91799d;
        if (((java.util.ArrayList) list).size() == 1) {
            ((com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3) ((java.util.ArrayList) list).get(0)).getView().setPadding(0, getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
            return;
        }
        if (((java.util.ArrayList) list).size() == 2) {
            ((com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3) ((java.util.ArrayList) list).get(0)).getView().setPadding(0, getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
            ((com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3) ((java.util.ArrayList) list).get(1)).getView().setPadding(getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        } else if (((java.util.ArrayList) list).size() == 3) {
            ((com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3) ((java.util.ArrayList) list).get(0)).getView().setPadding(0, getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl), getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
            ((com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3) ((java.util.ArrayList) list).get(1)).getView().setPadding(getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl), getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl), getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
            ((com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3) ((java.util.ArrayList) list).get(2)).getView().setPadding(getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl), getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        }
    }

    public final com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3 c(int i17) {
        if (i17 < 0) {
            return null;
        }
        return (com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3) ((java.util.ArrayList) this.f91799d).get(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public java.lang.Object currentValue() {
        int pickersCount = getPickersCount();
        if (pickersCount <= 0) {
            return new int[0];
        }
        int[] iArr = new int[pickersCount];
        for (int i17 = 0; i17 < pickersCount; i17++) {
            com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3 c17 = c(i17);
            c17.f91808e.e();
            iArr[i17] = c17.f91810g;
        }
        return iArr;
    }

    public void d(int i17, tl1.j jVar) {
        if (i17 >= 0 && i17 < getPickersCount() && jVar != null) {
            setLayoutFrozen(true);
            com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV3 c17 = c(i17);
            java.lang.String[] strArr = jVar.f420209a;
            c17.f91807d = strArr;
            c17.f91808e.f(java.util.Arrays.asList(strArr));
            if (!com.tencent.mm.sdk.platformtools.t8.N0(strArr)) {
                c(i17).f91808e.d().setCurrentItem(jVar.f420210b);
            }
            setLayoutFrozen(false);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public android.view.View getView() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onAttach(tl1.v vVar) {
        this.f91802g = vVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onDetach(tl1.v vVar) {
        this.f91802g = null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onHide(tl1.v vVar) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f91800e) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onShow(tl1.v vVar) {
        this.f91802g = vVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f91800e) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f91800e) {
            this.f91801f = true;
        } else {
            super.requestLayout();
        }
    }

    public void setLayoutFrozen(boolean z17) {
        if (this.f91800e != z17) {
            this.f91800e = z17;
            if (z17) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                onTouchEvent(android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            } else if (this.f91801f) {
                requestLayout();
            }
        }
    }
}
