package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1499x306930.p1500xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/gift/widget/FinderRandomAnimTextView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "", "dataList", "Ljz5/f0;", "setDataList", "", "textSize", "setTextSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "vg2/o", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView */
/* loaded from: classes3.dex */
public final class C14224x1cce21ec extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name */
    public final java.util.LinkedList f193186b2;

    /* renamed from: c2, reason: collision with root package name */
    public final vg2.o f193187c2;

    /* renamed from: d2, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f193188d2;

    /* renamed from: e2, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f193189e2;

    /* renamed from: f2, reason: collision with root package name */
    public float f193190f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14224x1cce21ec(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f193186b2 = linkedList;
        vg2.o oVar = new vg2.o(this, linkedList);
        this.f193187c2 = oVar;
        this.f193188d2 = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f193190f2 = 17.0f;
        mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext()));
        setVerticalFadingEdgeEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        mo7960x6cab2c8d(oVar);
    }

    /* renamed from: setDataList */
    private final void m56829xe131cdea(java.util.List<java.lang.String> list) {
        java.util.LinkedList linkedList = this.f193186b2;
        linkedList.clear();
        linkedList.addAll(list);
        this.f193187c2.m8151xc67946d3(0, list.size());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    public final void g1(int i17, int i18, java.util.LinkedList linkedList) {
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        java.lang.String str = "";
        for (int i19 = 0; i19 < i18 - valueOf.length(); i19++) {
            str = str + '0';
        }
        linkedList.add(str + valueOf);
    }

    public final void h1(int i17) {
        int length = java.lang.String.valueOf(i17).length();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        g1(0, length, linkedList);
        for (int i18 = 0; i18 < 8; i18++) {
            g1(new java.util.Random().nextInt(i17), length, linkedList);
        }
        g1(i17, length, linkedList);
        m56829xe131cdea(linkedList);
        this.f193189e2 = p3325xe03a0797.p3326xc267989b.l.d(this.f193188d2, null, null, new vg2.p(this, null), 3, null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f193189e2;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public void onMeasure(int i17, int i18) {
        if (getChildCount() == 0) {
            super.onMeasure(i17, i18);
            return;
        }
        int childCount = getChildCount();
        int i19 = 0;
        int i27 = 0;
        for (int i28 = 0; i28 < childCount; i28++) {
            android.view.View childAt = getChildAt(i28);
            measureChild(childAt, i17, i18);
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredWidth = childAt.getMeasuredWidth();
            if (measuredHeight > i27) {
                i27 = measuredHeight;
            }
            if (measuredWidth > i19) {
                i19 = measuredWidth;
            }
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i27, 1073741824));
    }

    /* renamed from: setTextSize */
    public final void m56830x3abfd950(float f17) {
        this.f193190f2 = f17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14224x1cce21ec(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f193186b2 = linkedList;
        vg2.o oVar = new vg2.o(this, linkedList);
        this.f193187c2 = oVar;
        this.f193188d2 = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f193190f2 = 17.0f;
        mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext()));
        setVerticalFadingEdgeEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        mo7960x6cab2c8d(oVar);
    }
}
