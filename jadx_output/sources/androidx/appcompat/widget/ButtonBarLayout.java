package androidx.appcompat.widget;

/* loaded from: classes5.dex */
public class ButtonBarLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f9390d;

    /* renamed from: e, reason: collision with root package name */
    public int f9391e;

    public ButtonBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9391e = -1;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f296184l);
        this.f9390d = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z17) {
        setOrientation(z17 ? 1 : 0);
        setGravity(z17 ? 5 : 80);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nei);
        if (findViewById != null) {
            int i17 = z17 ? 8 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "androidx/appcompat/widget/ButtonBarLayout", "setStacked", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "androidx/appcompat/widget/ButtonBarLayout", "setStacked", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return java.lang.Math.max(0, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        boolean z17;
        int i27;
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (this.f9390d) {
            if (size > this.f9391e) {
                if (getOrientation() == 1) {
                    setStacked(false);
                }
            }
            this.f9391e = size;
        }
        if ((getOrientation() == 1) || android.view.View.MeasureSpec.getMode(i17) != 1073741824) {
            i19 = i17;
            z17 = false;
        } else {
            i19 = android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z17 = true;
        }
        super.onMeasure(i19, i18);
        if (this.f9390d) {
            if (!(getOrientation() == 1)) {
                if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                    setStacked(true);
                    z17 = true;
                }
            }
        }
        if (z17) {
            super.onMeasure(i17, i18);
        }
        int childCount = getChildCount();
        int i28 = 0;
        while (true) {
            i27 = -1;
            if (i28 >= childCount) {
                i28 = -1;
                break;
            } else if (getChildAt(i28).getVisibility() == 0) {
                break;
            } else {
                i28++;
            }
        }
        if (i28 >= 0) {
            android.view.View childAt = getChildAt(i28);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if ((getOrientation() == 1 ? 1 : 0) != 0) {
                int i29 = i28 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i29 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i29).getVisibility() == 0) {
                        i27 = i29;
                        break;
                    }
                    i29++;
                }
                if (i27 >= 0) {
                    paddingTop += getChildAt(i27).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                r3 = paddingTop;
            } else {
                r3 = paddingTop + getPaddingBottom();
            }
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.u0.d(this) != r3) {
            setMinimumHeight(r3);
        }
    }

    public void setAllowStacking(boolean z17) {
        if (this.f9390d != z17) {
            this.f9390d = z17;
            if (!z17 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
