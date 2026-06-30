package com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/autofill/realname_auth/HorizontalWidthAdaptLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LayoutParams", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HorizontalWidthAdaptLayout extends android.view.ViewGroup {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/autofill/realname_auth/HorizontalWidthAdaptLayout$LayoutParams;", "Landroid/view/ViewGroup$MarginLayoutParams;", "Landroid/content/Context;", "c", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalWidthAdaptLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(java.util.ArrayList arrayList, int i17) {
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        int i19 = 0;
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams");
            com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams layoutParams2 = (com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams) layoutParams;
            i18 += view.getMeasuredWidth() + layoutParams2.getMarginStart() + layoutParams2.getMarginEnd();
            int measuredHeight = view.getMeasuredHeight();
            if (i19 < measuredHeight) {
                i19 = measuredHeight;
            }
        }
        int measuredWidth = (getMeasuredWidth() - i18) / 2;
        int paddingStart = getPaddingStart();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            android.view.View view2 = (android.view.View) it6.next();
            android.view.ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams");
            com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams layoutParams4 = (com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams) layoutParams3;
            int measuredHeight2 = (i19 - view2.getMeasuredHeight()) / 2;
            int i27 = measuredWidth + paddingStart;
            view2.layout(((android.view.ViewGroup.MarginLayoutParams) layoutParams4).leftMargin + i27, ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).topMargin + i17 + measuredHeight2, i27 + view2.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).leftMargin, view2.getMeasuredHeight() + i17 + ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).topMargin + measuredHeight2);
            paddingStart += view2.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).rightMargin;
        }
    }

    public final int b(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i18);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return i17;
            }
        } else if (i17 <= size) {
            return i17;
        }
        return size;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int childCount = getChildCount();
        for (int i28 = 0; i28 < childCount; i28++) {
            android.view.View childAt = getChildAt(i28);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams");
            com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams layoutParams2 = (com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams) layoutParams;
            if (paddingStart + measuredWidth + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin > getMeasuredWidth()) {
                a(arrayList, paddingTop);
                arrayList.clear();
                paddingTop += measuredHeight + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                paddingStart = getPaddingStart();
            }
            arrayList.add(childAt);
            paddingStart += measuredWidth + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
        }
        a(arrayList, paddingTop);
        arrayList.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int b17 = b(0, i17);
        int childCount = getChildCount();
        int i19 = 0;
        int i27 = 0;
        for (int i28 = 0; i28 < childCount; i28++) {
            android.view.View childAt = getChildAt(i28);
            if (childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, i17, 0, i18, 0);
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams");
                com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams layoutParams2 = (com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams) layoutParams;
                if (i28 == 0) {
                    i19 = childAt.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                }
                if (childAt.getMeasuredWidth() + i27 + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin > b17) {
                    i19 += childAt.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    i27 = 0;
                }
                i27 += childAt.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
            }
        }
        setMeasuredDimension(b(0, i17), b(i19 + getPaddingTop() + getPaddingBottom(), i18));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalWidthAdaptLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
