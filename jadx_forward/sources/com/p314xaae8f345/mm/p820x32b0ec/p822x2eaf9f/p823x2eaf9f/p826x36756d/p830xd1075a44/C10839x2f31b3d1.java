package com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44;

/* renamed from: com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup */
/* loaded from: classes13.dex */
public class C10839x2f31b3d1 extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public int f150100d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.CompoundButton.OnCheckedChangeListener f150101e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f150102f;

    /* renamed from: g, reason: collision with root package name */
    public bo0.e f150103g;

    /* renamed from: com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup$LayoutParams */
    /* loaded from: classes13.dex */
    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.view.ViewGroup.LayoutParams
        public void setBaseAttributes(android.content.res.TypedArray typedArray, int i17, int i18) {
            if (typedArray.hasValue(i17)) {
                ((android.widget.LinearLayout.LayoutParams) this).width = typedArray.getLayoutDimension(i17, "layout_width");
            } else {
                ((android.widget.LinearLayout.LayoutParams) this).width = -2;
            }
            if (typedArray.hasValue(i18)) {
                ((android.widget.LinearLayout.LayoutParams) this).height = typedArray.getLayoutDimension(i18, "layout_height");
            } else {
                ((android.widget.LinearLayout.LayoutParams) this).height = -2;
            }
        }
    }

    public C10839x2f31b3d1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150102f = false;
        this.f150100d = -1;
        setOrientation(1);
        this.f150101e = new bo0.c(this, null);
        bo0.e eVar = new bo0.e(this, null);
        this.f150103g = eVar;
        super.setOnHierarchyChangeListener(eVar);
    }

    public static void a(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1 c10839x2f31b3d1, android.widget.RadioButton radioButton) {
        android.widget.RadioButton radioButton2;
        int childCount = c10839x2f31b3d1.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c10839x2f31b3d1.getChildAt(i17);
            if (childAt instanceof android.widget.RadioButton) {
                if (childAt != radioButton) {
                    ((android.widget.RadioButton) childAt).setChecked(false);
                }
            } else if (childAt instanceof android.widget.LinearLayout) {
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) childAt;
                int childCount2 = linearLayout.getChildCount();
                for (int i18 = 0; i18 < childCount2; i18++) {
                    android.view.View childAt2 = linearLayout.getChildAt(i18);
                    if ((childAt2 instanceof android.widget.RadioButton) && (radioButton2 = (android.widget.RadioButton) childAt2) != radioButton) {
                        radioButton2.setChecked(false);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCheckedId */
    public void m46505x738abce0(int i17) {
        this.f150100d = i17;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view instanceof android.widget.RadioButton) {
            view.setOnTouchListener(new bo0.a(this, view));
        } else if (view instanceof android.widget.LinearLayout) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
            int childCount = linearLayout.getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = linearLayout.getChildAt(i18);
                if (childAt instanceof android.widget.RadioButton) {
                    android.widget.RadioButton radioButton = (android.widget.RadioButton) childAt;
                    radioButton.setOnTouchListener(new bo0.b(this, radioButton));
                }
            }
        }
        super.addView(view, i17, layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1.LayoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1.LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: getCheckedRadioButtonId */
    public int m46506x3b3c7d17() {
        return this.f150100d;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        int i17 = this.f150100d;
        if (i17 != -1) {
            this.f150102f = true;
            android.view.View findViewById = findViewById(i17);
            if (findViewById != null && (findViewById instanceof android.widget.RadioButton)) {
                ((android.widget.RadioButton) findViewById).setChecked(true);
            }
            this.f150102f = false;
            m46505x738abce0(this.f150100d);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1.class.getName());
    }

    /* renamed from: setOnCheckedChangeListener */
    public void m46507x405278aa(bo0.d dVar) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f150103g.f104506d = onHierarchyChangeListener;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1.LayoutParams(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.widget.LinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1.LayoutParams(getContext(), attributeSet);
    }
}
