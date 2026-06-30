package com.tencent.mm.plugin.appbrand.widget.picker;

/* loaded from: classes15.dex */
public final class AppBrandMultiOptionsPicker extends android.widget.FrameLayout implements com.tencent.mm.plugin.appbrand.jsapi.picker.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f91793d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f91794e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f91795f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f91796g;

    /* renamed from: h, reason: collision with root package name */
    public tl1.v f91797h;

    /* renamed from: i, reason: collision with root package name */
    public final tl1.g0 f91798i;

    public AppBrandMultiOptionsPicker(android.content.Context context) {
        super(context);
        this.f91798i = new tl1.f(this);
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.drawable.f480800cv);
        this.f91793d = drawable;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        this.f91794e = linearLayout;
        linearLayout.setPadding(i65.a.b(context, 2), 0, i65.a.b(context, 2), 0);
        linearLayout.setOrientation(0);
        addView(linearLayout, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        linearLayout.setDividerDrawable(drawable);
        linearLayout.setShowDividers(2);
    }

    private int getPickersCount() {
        android.widget.LinearLayout linearLayout = this.f91794e;
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
        int pickersCount = getPickersCount();
        setLayoutFrozen(true);
        int length2 = hVarArr.length;
        tl1.g0 g0Var = this.f91798i;
        android.widget.LinearLayout linearLayout = this.f91794e;
        if (pickersCount < length2) {
            int length3 = hVarArr.length - pickersCount;
            if (length3 > 0) {
                while (length3 > 0) {
                    tl1.g gVar = new tl1.g(this, getContext());
                    gVar.setOnValueChangedListener(g0Var);
                    gVar.setEllipsizeType("end");
                    gVar.setDividerHeight(i65.a.b(getContext(), 1));
                    gVar.setTag(com.tencent.mm.R.id.f483172ym, java.lang.Integer.valueOf(linearLayout.getChildCount()));
                    linearLayout.addView(gVar, new android.widget.LinearLayout.LayoutParams(0, -1, 1.0f));
                    length3--;
                }
            }
        } else if (pickersCount > hVarArr.length && (length = pickersCount - hVarArr.length) > 0) {
            int pickersCount2 = getPickersCount() - 1;
            for (length = pickersCount - hVarArr.length; length > 0; length--) {
                linearLayout.removeViewAt(pickersCount2);
                pickersCount2--;
            }
        }
        for (int i17 = 0; i17 < hVarArr.length; i17++) {
            com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV2 b17 = b(i17);
            tl1.h hVar = hVarArr[i17];
            b17.setOptionsArray(hVar.f420205a);
            b17.setValue(hVar.f420206b);
            b17.setOnValueChangedListener(g0Var);
        }
        linearLayout.setWeightSum(getPickersCount());
        setLayoutFrozen(false);
    }

    public final com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV2 b(int i17) {
        android.widget.LinearLayout linearLayout;
        if (i17 >= 0 && (linearLayout = this.f91794e) != null) {
            return (com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV2) linearLayout.getChildAt(i17);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public java.lang.Object currentValue() {
        int pickersCount = getPickersCount();
        if (pickersCount <= 0) {
            return new int[0];
        }
        int[] iArr = new int[pickersCount];
        for (int i17 = 0; i17 < pickersCount; i17++) {
            iArr[i17] = b(i17).getValue();
        }
        return iArr;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public android.view.View getView() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onAttach(tl1.v vVar) {
        this.f91797h = vVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onDetach(tl1.v vVar) {
        this.f91797h = null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onHide(tl1.v vVar) {
        int pickersCount = getPickersCount();
        for (int i17 = 0; i17 < pickersCount; i17++) {
            com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV2 b17 = b(i17);
            if (b17 != null) {
                b17.q();
                com.tencent.mm.sdk.platformtools.n3 n3Var = b17.C1;
                if (n3Var != null) {
                    n3Var.sendMessageDelayed(b17.g(1, 0, 0, null), 0L);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f91795f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onShow(tl1.v vVar) {
        this.f91797h = vVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f91795f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f91795f) {
            this.f91796g = true;
        } else {
            super.requestLayout();
        }
    }

    public void setLayoutFrozen(boolean z17) {
        if (this.f91795f != z17) {
            this.f91795f = z17;
            if (z17) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                onTouchEvent(android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            } else if (this.f91796g) {
                requestLayout();
            }
        }
    }
}
