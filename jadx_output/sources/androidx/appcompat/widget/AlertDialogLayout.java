package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public class AlertDialogLayout extends androidx.appcompat.widget.LinearLayoutCompat {
    public AlertDialogLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int k(android.view.View view) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        int d17 = n3.u0.d(view);
        if (d17 > 0) {
            return d17;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return k(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L39
            r4 = 80
            if (r3 == r4) goto L30
            int r12 = r9.getPaddingTop()
            goto L43
        L30:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L43
        L39:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r3 + r14
        L43:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L4c
            r14 = r0
            goto L50
        L4c:
            int r14 = r14.getIntrinsicHeight()
        L50:
            if (r0 >= r1) goto Lb0
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto Lad
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto Lad
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r6 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r6
            int r7 = r6.f9416b
            if (r7 >= 0) goto L73
            r7 = r2
        L73:
            java.util.WeakHashMap r8 = n3.l1.f334362a
            int r8 = n3.v0.d(r9)
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L8e
            r8 = 5
            if (r7 == r8) goto L89
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L99
        L89:
            int r7 = r11 - r4
            int r8 = r6.rightMargin
            goto L98
        L8e:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
            int r8 = r6.rightMargin
        L98:
            int r7 = r7 - r8
        L99:
            boolean r8 = r9.j(r0)
            if (r8 == 0) goto La0
            int r12 = r12 + r14
        La0:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r5 + r12
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r12 = r12 + r5
        Lad:
            int r0 = r0 + 1
            goto L50
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        int i27;
        int i28;
        int i29;
        int childCount = getChildCount();
        android.view.View view = null;
        boolean z17 = false;
        android.view.View view2 = null;
        android.view.View view3 = null;
        for (int i37 = 0; i37 < childCount; i37++) {
            android.view.View childAt = getChildAt(i37);
            if (childAt.getVisibility() != 8) {
                int id6 = childAt.getId();
                if (id6 == com.tencent.mm.R.id.f487366of4) {
                    view = childAt;
                } else if (id6 == com.tencent.mm.R.id.b37) {
                    view2 = childAt;
                } else if ((id6 != com.tencent.mm.R.id.cgm && id6 != com.tencent.mm.R.id.co_) || view3 != null) {
                    break;
                } else {
                    view3 = childAt;
                }
            }
        }
        int mode = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i18);
        int mode2 = android.view.View.MeasureSpec.getMode(i17);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i17, 0);
            paddingTop += view.getMeasuredHeight();
            i19 = android.view.View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i19 = 0;
        }
        if (view2 != null) {
            view2.measure(i17, 0);
            i27 = k(view2);
            i28 = view2.getMeasuredHeight() - i27;
            paddingTop += i27;
            i19 = android.view.View.combineMeasuredStates(i19, view2.getMeasuredState());
        } else {
            i27 = 0;
            i28 = 0;
        }
        if (view3 != null) {
            view3.measure(i17, mode == 0 ? 0 : android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, size - paddingTop), mode));
            i29 = view3.getMeasuredHeight();
            paddingTop += i29;
            i19 = android.view.View.combineMeasuredStates(i19, view3.getMeasuredState());
        } else {
            i29 = 0;
        }
        int i38 = size - paddingTop;
        if (view2 != null) {
            int i39 = paddingTop - i27;
            int min = java.lang.Math.min(i38, i28);
            if (min > 0) {
                i38 -= min;
                i27 += min;
            }
            view2.measure(i17, android.view.View.MeasureSpec.makeMeasureSpec(i27, 1073741824));
            paddingTop = i39 + view2.getMeasuredHeight();
            i19 = android.view.View.combineMeasuredStates(i19, view2.getMeasuredState());
        }
        if (view3 != null && i38 > 0) {
            view3.measure(i17, android.view.View.MeasureSpec.makeMeasureSpec(i29 + i38, mode));
            paddingTop = (paddingTop - i29) + view3.getMeasuredHeight();
            i19 = android.view.View.combineMeasuredStates(i19, view3.getMeasuredState());
        }
        int i47 = 0;
        for (int i48 = 0; i48 < childCount; i48++) {
            android.view.View childAt2 = getChildAt(i48);
            if (childAt2.getVisibility() != 8) {
                i47 = java.lang.Math.max(i47, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(i47 + getPaddingLeft() + getPaddingRight(), i17, i19), android.view.View.resolveSizeAndState(paddingTop, i18, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i49 = 0; i49 < childCount; i49++) {
                android.view.View childAt3 = getChildAt(i49);
                if (childAt3.getVisibility() != 8) {
                    androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) childAt3.getLayoutParams();
                    if (((android.view.ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
                        int i57 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height;
                        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i18, 0);
                        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height = i57;
                    }
                }
            }
        }
        z17 = true;
        if (z17) {
            return;
        }
        super.onMeasure(i17, i18);
    }
}
