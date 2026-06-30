package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveFoldTextView;", "Lcom/tencent/mm/ui/widget/MMNeat7extView;", "", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2967xc3bba14a, "Z", "isFolding", "()Z", "setFolding", "(Z)V", "Lkotlin/Function0;", "Ljz5/f0;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3049xa147da5f, "Lyz5/a;", "getUnFoldListener", "()Lyz5/a;", "setUnFoldListener", "(Lyz5/a;)V", "unFoldListener", "p0", "getFoldListener", "setFoldListener", "foldListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView */
/* loaded from: classes3.dex */
public final class C14315xbe4ed405 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 {

    /* renamed from: x1, reason: collision with root package name */
    public static final java.lang.String f197426x1 = " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egq);

    /* renamed from: y1, reason: collision with root package name */
    public static final java.lang.String f197427y1 = " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dfc);

    /* renamed from: V, reason: from kotlin metadata */
    public boolean isFolding;

    /* renamed from: W, reason: from kotlin metadata */
    public yz5.a unFoldListener;

    /* renamed from: l1, reason: collision with root package name */
    public int f197428l1;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public yz5.a foldListener;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f197430p1;

    /* renamed from: x0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f197431x0;

    /* renamed from: y0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f197432y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14315xbe4ed405(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.isFolding = true;
        this.f197431x0 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0();
        this.f197432y0 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0();
        this.f197428l1 = 5;
    }

    public final yz5.a getFoldListener() {
        return this.foldListener;
    }

    public final yz5.a getUnFoldListener() {
        return this.unFoldListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0120, code lost:
    
        if (r2 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.lang.CharSequence r17, int r18, int r19, boolean r20, yz5.l r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405.o(java.lang.CharSequence, int, int, boolean, yz5.l, boolean, boolean):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039, com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc, android.view.View
    public void onMeasure(int i17, int i18) {
        java.util.List m17;
        super.onMeasure(i17, i18);
        ks5.a mo84153x22f21e20 = mo84153x22f21e20();
        boolean z17 = false;
        if (mo84153x22f21e20 != null && (m17 = mo84153x22f21e20.m()) != null && (!m17.isEmpty())) {
            z17 = true;
        }
        if (z17) {
            postInvalidate();
        }
    }

    /* renamed from: setFoldListener */
    public final void m57314x84fb3157(yz5.a aVar) {
        this.foldListener = aVar;
    }

    /* renamed from: setFolding */
    public final void m57315x8885097f(boolean z17) {
        this.isFolding = z17;
    }

    /* renamed from: setUnFoldListener */
    public final void m57316x64c31e10(yz5.a aVar) {
        this.unFoldListener = aVar;
    }
}
