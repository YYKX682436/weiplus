package i84;

/* loaded from: classes13.dex */
public final class f implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2133xbc1081a1.C17776xe08da3a0 f371189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f371190e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2133xbc1081a1.C17776xe08da3a0 c17776xe08da3a0, yz5.p pVar) {
        this.f371189d = c17776xe08da3a0;
        this.f371190e = pVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$initDragControl$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/admedia/SeekBarView$initDragControl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2133xbc1081a1.C17776xe08da3a0 c17776xe08da3a0 = this.f371189d;
        if (action == 0) {
            c17776xe08da3a0.requestDisallowInterceptTouchEvent(true);
            float m69522x402effa3 = c17776xe08da3a0.m69522x402effa3();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setDragBeginProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            c17776xe08da3a0.f244845v = m69522x402effa3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setDragBeginProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float rawX = motionEvent.getRawX();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setDragBeginPosition$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            c17776xe08da3a0.f244844u = rawX;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setDragBeginPosition$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        } else if (action != 2) {
            c17776xe08da3a0.requestDisallowInterceptTouchEvent(false);
            this.f371190e.mo149xb9724478(java.lang.Float.valueOf(c17776xe08da3a0.m69522x402effa3()), new i84.e(c17776xe08da3a0));
        } else {
            c17776xe08da3a0.m69525x9365929(false);
            float rawX2 = motionEvent.getRawX();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getDragBeginPosition$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float f17 = c17776xe08da3a0.f244844u;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getDragBeginPosition$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float f18 = rawX2 - f17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getLineWidth$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            int i17 = c17776xe08da3a0.f244841r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getLineWidth$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getConvertToXmlPxInt", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            yz5.a a17 = c17776xe08da3a0.a(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getConvertToXmlPxInt", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float floatValue = f18 / ((java.lang.Number) ((i84.d) a17).mo152xb9724478()).floatValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getDragBeginProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float f19 = c17776xe08da3a0.f244845v;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getDragBeginProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTotalProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float f27 = c17776xe08da3a0.f244837n;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTotalProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            c17776xe08da3a0.m69524x3ae760af(f19 + (floatValue * f27));
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ad/widget/admedia/SeekBarView$initDragControl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$initDragControl$1");
        return true;
    }
}
