package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2119xf495eb85.ui;

/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup */
/* loaded from: classes4.dex */
public class C17754x6e693826 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f244736d;

    /* renamed from: e, reason: collision with root package name */
    public int f244737e;

    public C17754x6e693826(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayoutInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        java.util.List list = this.f244736d;
        int childCount = getChildCount();
        int i28 = this.f244737e;
        java.util.Iterator it = list.iterator();
        int i29 = 0;
        int i37 = 0;
        int i38 = 0;
        while (it.hasNext()) {
            int i39 = ((m74.a) it.next()).f406045a;
            int i47 = 0;
            int i48 = 0;
            while (i47 < i39 && i29 < childCount) {
                android.view.View childAt = getChildAt(i29);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                childAt.layout(i48, i37, measuredWidth + i48, measuredHeight + i37);
                i29++;
                i48 += measuredWidth + i28;
                i47++;
                i38 = measuredHeight;
            }
            i37 += i38 + i28;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
    }

    public final void b(int i17, int i18) {
        m74.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasureInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        measureChildren(i17, i18);
        int i19 = this.f244737e;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initRows", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        java.util.List list = this.f244736d;
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        linkedList.clear();
        for (int i27 = 0; i27 < childCount; i27++) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newRow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup$Row");
            m74.a aVar2 = new m74.a();
            aVar2.f406045a = 0;
            aVar2.f406046b = measuredWidth;
            aVar2.f406047c = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newRow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup$Row");
            linkedList.add(aVar2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initRows", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        int i28 = 0;
        for (int i29 = 0; i29 < childCount; i29++) {
            android.view.View childAt = getChildAt(i29);
            int min = java.lang.Math.min(childAt.getMeasuredWidth(), measuredWidth);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findRowWithSufficientWidth", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findRowWithSufficientWidth", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
                    aVar = null;
                    break;
                }
                aVar = (m74.a) it.next();
                if (aVar != null && !aVar.f406047c) {
                    if (aVar.f406046b >= min) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findRowWithSufficientWidth", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
                        break;
                    }
                    aVar.f406047c = true;
                }
            }
            if (aVar != null) {
                aVar.f406045a++;
                aVar.f406046b -= min + i19;
            }
            if (i28 == 0) {
                i28 = childAt.getMeasuredHeight();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeInvalidRow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            m74.a aVar3 = (m74.a) it6.next();
            if (aVar3 == null || aVar3.f406045a == 0) {
                it6.remove();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeInvalidRow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        int size = ((java.util.LinkedList) list).size();
        int i37 = i28 * size;
        if (size > 1) {
            i37 += (size - 1) * i19;
        }
        setMeasuredDimension(measuredWidth, i37);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasureInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        try {
            a(z17, i17, i18, i19, i27);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasure", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        super.onMeasure(i17, i18);
        try {
            b(i17, i18);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
    }

    public C17754x6e693826(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f244736d = new java.util.LinkedList();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initialize", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
            this.f244737e = i65.a.b(getContext(), 12);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initialize", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        } catch (java.lang.Throwable unused) {
        }
    }
}
