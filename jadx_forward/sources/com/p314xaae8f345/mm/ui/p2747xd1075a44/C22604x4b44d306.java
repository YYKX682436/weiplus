package com.p314xaae8f345.mm.ui.p2747xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0002\"#B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/tencent/mm/ui/widget/FlowTextMixView;", "Landroid/widget/FrameLayout;", "", "size", "Ljz5/f0;", "setItemSpacing", "maxPixels", "setMaxWidth", "", "enable", "setOneLineMode", "Lkotlin/Function0;", "i", "Lyz5/a;", "getMeasuredListener", "()Lyz5/a;", "setMeasuredListener", "(Lyz5/a;)V", "measuredListener", "m", "Z", "getIgnoreLastLineSpace", "()Z", "setIgnoreLastLineSpace", "(Z)V", "ignoreLastLineSpace", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al5/x", "al5/y", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.FlowTextMixView */
/* loaded from: classes14.dex */
public class C22604x4b44d306 extends android.widget.FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final al5.x f292789n = new al5.x(null);

    /* renamed from: d, reason: collision with root package name */
    public int f292790d;

    /* renamed from: e, reason: collision with root package name */
    public int f292791e;

    /* renamed from: f, reason: collision with root package name */
    public int f292792f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f292793g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f292794h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public yz5.a measuredListener;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean ignoreLastLineSpace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22604x4b44d306(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f292793g = new java.util.ArrayList();
        c(context, attributeSet);
    }

    public final al5.y a(int i17) {
        java.util.ArrayList arrayList = this.f292793g;
        if (arrayList.size() <= i17) {
            al5.y yVar = new al5.y(i17, this.f292790d, this.f292791e);
            arrayList.add(yVar);
            return yVar;
        }
        java.lang.Object obj = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        return (al5.y) obj;
    }

    public final int b() {
        java.util.Iterator it = this.f292793g.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            int i18 = 0;
            for (android.view.View view : ((al5.y) it.next()).f87626d) {
                if (view instanceof android.widget.TextView) {
                    android.widget.TextView textView = (android.widget.TextView) view;
                    if (textView.getLineCount() > 1 && i18 < textView.getLineCount()) {
                        i18 = textView.getLineCount();
                    }
                }
                if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
                    com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view;
                    if (c23001x9d3a0bdc.m84154x92d2fac5() > 1 && i18 < c23001x9d3a0bdc.m84154x92d2fac5()) {
                        i18 = c23001x9d3a0bdc.m84154x92d2fac5();
                    }
                }
            }
            if (i18 > 1) {
                i17 += i18 - 1;
            }
            i17++;
        }
        return i17;
    }

    public final void c(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f528724i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f292790d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f292791e = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.f292792f = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.ignoreLastLineSpace = obtainStyledAttributes.getBoolean(0, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final boolean getIgnoreLastLineSpace() {
        return this.ignoreLastLineSpace;
    }

    public final yz5.a getMeasuredListener() {
        return this.measuredListener;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int d17;
        int e17;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        java.util.Iterator it = this.f292793g.iterator();
        while (it.hasNext()) {
            al5.y yVar = (al5.y) it.next();
            java.util.Iterator it6 = yVar.f87626d.iterator();
            int i28 = 0;
            int i29 = 0;
            int i37 = 0;
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                int i38 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                android.view.View view = (android.view.View) next;
                if (i28 > 0) {
                    paddingStart += this.f292790d;
                }
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                int marginStart = ((android.widget.FrameLayout.LayoutParams) layoutParams).getMarginStart();
                android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                int i39 = marginStart + paddingStart;
                int measuredHeight = (i29 <= 0 ? ((yVar.f87629g - view.getMeasuredHeight()) / 2) + paddingTop : paddingTop + i29 + ((i37 - view.getMeasuredHeight()) / 2)) + ((android.widget.FrameLayout.LayoutParams) layoutParams2).topMargin;
                view.layout(i39, measuredHeight, view.getMeasuredWidth() + i39, view.getMeasuredHeight() + measuredHeight);
                al5.x xVar = f292789n;
                paddingStart += al5.x.a(xVar, view);
                if (view instanceof android.widget.TextView) {
                    android.widget.TextView textView = (android.widget.TextView) view;
                    d17 = textView.getLayout() == null ? 0 : textView.getLayout().getLineTop(textView.getLineCount() - 1);
                    if (textView.getLayout() != null) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        textView.getLayout().getLineBounds(textView.getLineCount() - 1, rect);
                        e17 = rect.height();
                        i37 = e17;
                        i29 = d17;
                    }
                    i29 = d17;
                    i37 = 0;
                } else if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
                    com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view;
                    d17 = al5.x.d(xVar, c23001x9d3a0bdc);
                    if (c23001x9d3a0bdc.mo84153x22f21e20() != null) {
                        int d18 = c23001x9d3a0bdc.mo84153x22f21e20().d() - 1;
                        e17 = c23001x9d3a0bdc.mo84153x22f21e20().e(d18) - c23001x9d3a0bdc.mo84153x22f21e20().a(d18);
                        i37 = e17;
                        i29 = d17;
                    }
                    i29 = d17;
                    i37 = 0;
                }
                i28 = i38;
            }
            paddingStart = getPaddingStart();
            paddingTop += yVar.f87628f;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        al5.x xVar;
        al5.y a17;
        int i19;
        int i27 = this.f292792f;
        if (i27 > 0) {
            int size = android.view.View.MeasureSpec.getSize(i17);
            if (i27 > size) {
                i27 = size;
            }
        } else {
            i27 = android.view.View.MeasureSpec.getSize(i17);
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i27, Integer.MIN_VALUE), i18);
        java.util.ArrayList<al5.y> arrayList = this.f292793g;
        arrayList.clear();
        int childCount = getChildCount();
        int i28 = 0;
        int i29 = 0;
        int i37 = 0;
        while (true) {
            xVar = f292789n;
            if (i29 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i29);
            if (childAt.getVisibility() != 8) {
                al5.y a18 = a(i37);
                int a19 = al5.x.a(xVar, childAt);
                if (a19 > i27) {
                    if (a18.f87627e > 0) {
                        i37++;
                        a18 = a(i37);
                    }
                    a18.a(childAt);
                } else if (a18.f87630h + a19 <= i27) {
                    a18.a(childAt);
                } else {
                    i37++;
                    a(i37).a(childAt);
                }
            }
            i29++;
        }
        if (this.ignoreLastLineSpace && arrayList.size() != 0 && (i19 = (a17 = a(arrayList.size() - 1)).f87625c) != 0) {
            a17.f87628f -= i19;
            a17.f87625c = 0;
        }
        if (this.f292794h && arrayList.size() > 0) {
            java.lang.Object obj = arrayList.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            al5.y yVar = (al5.y) obj;
            if (arrayList.size() > 1) {
                int size2 = arrayList.size();
                for (int i38 = 1; i38 < size2; i38++) {
                    java.util.Iterator it = ((al5.y) arrayList.get(i38)).f87626d.iterator();
                    while (it.hasNext()) {
                        yVar.a((android.view.View) it.next());
                    }
                }
                arrayList.subList(1, arrayList.size()).clear();
            }
            if (yVar.f87627e > i27) {
                java.util.ArrayList arrayList2 = yVar.f87626d;
                if (arrayList2.size() > 1) {
                    java.lang.Object obj2 = arrayList2.get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    android.view.View view = (android.view.View) obj2;
                    int c17 = i27 - (yVar.f87627e - al5.x.c(xVar, view));
                    if (c17 > 0) {
                        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(c17, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(al5.x.b(xVar, view), 1073741824));
                        yVar.f87627e = 0;
                        yVar.f87630h = 0;
                        java.util.List V0 = kz5.n0.V0(arrayList2);
                        arrayList2.clear();
                        java.util.Iterator it6 = V0.iterator();
                        while (it6.hasNext()) {
                            yVar.a((android.view.View) it6.next());
                        }
                    }
                }
            }
        }
        int i39 = 0;
        for (al5.y yVar2 : arrayList) {
            i39 += yVar2.f87628f;
            int i47 = yVar2.f87627e;
            if (i28 < i47) {
                i28 = i47;
            }
        }
        setMeasuredDimension(java.lang.Math.min(i27, i28) + getPaddingStart() + getPaddingEnd(), i39 + getPaddingTop() + getPaddingBottom());
        yz5.a aVar = this.measuredListener;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    /* renamed from: setIgnoreLastLineSpace */
    public final void m81266x86d9308(boolean z17) {
        this.ignoreLastLineSpace = z17;
    }

    /* renamed from: setItemSpacing */
    public final void m81267xd879afee(int i17) {
        this.f292790d = i17;
        requestLayout();
        invalidate();
    }

    /* renamed from: setMaxWidth */
    public void m81268x8e6ff544(int i17) {
        this.f292792f = i17;
        requestLayout();
        invalidate();
    }

    /* renamed from: setMeasuredListener */
    public final void m81269xf63b061c(yz5.a aVar) {
        this.measuredListener = aVar;
    }

    /* renamed from: setOneLineMode */
    public final void m81270xc0a44a7b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlowTextMixView", "@" + hashCode() + " setOneLineMode: " + z17);
        this.f292794h = z17;
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22604x4b44d306(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f292793g = new java.util.ArrayList();
        c(context, attributeSet);
    }
}
