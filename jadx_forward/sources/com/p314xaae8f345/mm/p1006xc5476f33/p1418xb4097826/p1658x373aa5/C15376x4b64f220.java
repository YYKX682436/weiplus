package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B!\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/ReboundChildLinearLayout;", "Landroid/widget/LinearLayout;", "", "orientation", "Ljz5/f0;", "setOrientation", "e", "I", "getReboundChildId", "()I", "setReboundChildId", "(I)V", "reboundChildId", "f", "getSubOrientation", "setSubOrientation", "subOrientation", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "finder-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.ReboundChildLinearLayout */
/* loaded from: classes3.dex */
public final class C15376x4b64f220 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f213103d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int reboundChildId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int subOrientation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15376x4b64f220(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f213103d = "Finder.ReboundChildLinearLayout";
        this.reboundChildId = -1;
        a(attrs, 0);
    }

    public final void a(android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ei0.a.f334521b, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.reboundChildId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f213103d, "[initAttribute],reboundId:" + this.reboundChildId);
    }

    public final int getReboundChildId() {
        return this.reboundChildId;
    }

    public final int getSubOrientation() {
        return this.subOrientation;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.reboundChildId == -1) {
            return;
        }
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt = getChildAt(i19);
            if (childAt != null && childAt.getId() == this.reboundChildId) {
                int i27 = this.subOrientation;
                java.lang.String str = this.f213103d;
                if (i27 == 1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(childAt);
                    android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                    if (layoutParams2.height != 0 || layoutParams2.weight <= 0.0f) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "tryToReboundChildVertical " + childAt.getContext().getResources().getResourceEntryName(childAt.getId()) + ",height:" + layoutParams2.height + ",weight:" + layoutParams2.weight + '!');
                        return;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "tryToReboundChildVertical " + childAt.getContext().getResources().getResourceEntryName(childAt.getId()) + ",oldReboundChildMeasureHeight:" + measuredHeight + ",measuredHeight:" + getMeasuredHeight() + '!');
                        return;
                    }
                    layoutParams2.height = -2;
                    measureChildWithMargins(childAt, i17, 0, android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824), 0);
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    layoutParams2.height = 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "tryToReboundChildVertical " + childAt.getContext().getResources().getResourceEntryName(childAt.getId()) + ",oldReboundChildMeasureHeight:" + measuredHeight + ",measuredHeight:" + getMeasuredHeight() + ",newReboundChildMeasureHeight:" + measuredHeight2 + '!');
                    if (measuredHeight2 <= 0 || measuredHeight2 <= measuredHeight) {
                        return;
                    }
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                    return;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(childAt);
                android.view.ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
                if (layoutParams4.width != 0 || layoutParams4.weight <= 0.0f) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "tryToReboundChildHorizontal " + childAt.getContext().getResources().getResourceEntryName(childAt.getId()) + ",width:" + layoutParams4.width + ",weight:" + layoutParams4.weight + '!');
                    return;
                }
                int measuredWidth = childAt.getMeasuredWidth();
                if (measuredWidth <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "tryToReboundChildHorizontal " + childAt.getContext().getResources().getResourceEntryName(childAt.getId()) + ",oldReboundChildMeasureWidth:" + measuredWidth + ",measuredWidth:" + getMeasuredWidth() + '!');
                    return;
                }
                layoutParams4.width = -2;
                measureChildWithMargins(childAt, android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), 0, i18, 0);
                int measuredWidth2 = childAt.getMeasuredWidth();
                layoutParams4.width = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "tryToReboundChildHorizontal " + childAt.getContext().getResources().getResourceEntryName(childAt.getId()) + ",oldReboundChildMeasureWidth:" + measuredWidth + ",measuredWidth:" + getMeasuredWidth() + ",newReboundChildMeasureWidth:" + measuredWidth2 + '!');
                if (measuredWidth2 <= 0 || measuredWidth2 <= measuredWidth) {
                    return;
                }
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                return;
            }
        }
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i17) {
        super.setOrientation(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f213103d, "[setOrientation],orientation:" + i17);
        this.subOrientation = i17;
    }

    /* renamed from: setReboundChildId */
    public final void m62467x64d00aae(int i17) {
        this.reboundChildId = i17;
    }

    /* renamed from: setSubOrientation */
    public final void m62468x2eafac72(int i17) {
        this.subOrientation = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15376x4b64f220(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f213103d = "Finder.ReboundChildLinearLayout";
        this.reboundChildId = -1;
        a(attrs, i17);
    }
}
