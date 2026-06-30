package com.tencent.mm.live.core.core.trtc.widget;

/* loaded from: classes13.dex */
public class MultiLineRadioGroup extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public int f68567d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.CompoundButton.OnCheckedChangeListener f68568e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f68569f;

    /* renamed from: g, reason: collision with root package name */
    public bo0.e f68570g;

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

    public MultiLineRadioGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68569f = false;
        this.f68567d = -1;
        setOrientation(1);
        this.f68568e = new bo0.c(this, null);
        bo0.e eVar = new bo0.e(this, null);
        this.f68570g = eVar;
        super.setOnHierarchyChangeListener(eVar);
    }

    public static void a(com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup multiLineRadioGroup, android.widget.RadioButton radioButton) {
        android.widget.RadioButton radioButton2;
        int childCount = multiLineRadioGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = multiLineRadioGroup.getChildAt(i17);
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
    public void setCheckedId(int i17) {
        this.f68567d = i17;
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
        return layoutParams instanceof com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup.LayoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup.LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedRadioButtonId() {
        return this.f68567d;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        int i17 = this.f68567d;
        if (i17 != -1) {
            this.f68569f = true;
            android.view.View findViewById = findViewById(i17);
            if (findViewById != null && (findViewById instanceof android.widget.RadioButton)) {
                ((android.widget.RadioButton) findViewById).setChecked(true);
            }
            this.f68569f = false;
            setCheckedId(this.f68567d);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup.class.getName());
    }

    public void setOnCheckedChangeListener(bo0.d dVar) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f68570g.f22973d = onHierarchyChangeListener;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup.LayoutParams(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.widget.LinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup.LayoutParams(getContext(), attributeSet);
    }
}
