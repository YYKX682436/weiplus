package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0017J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\b\u0010\t\u001a\u0004\u0018\u00010\u0005R\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveRoomBanner;", "Lcom/tencent/mm/plugin/finder/view/FinderBaseMediaBanner;", "Landroid/view/ViewGroup;", "", "getContentDescription", "Luc2/d;", "controller", "Ljz5/f0;", "setLiveRoomController", "getLiveRoomController", "Lcom/tencent/mm/plugin/finder/view/qr;", "n", "Lcom/tencent/mm/plugin/finder/view/qr;", "getMediaType", "()Lcom/tencent/mm/plugin/finder/view/qr;", "setMediaType", "(Lcom/tencent/mm/plugin/finder/view/qr;)V", "mediaType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderLiveRoomBanner */
/* loaded from: classes2.dex */
public final class C15316x68272fd9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379<android.view.ViewGroup> {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr mediaType;

    /* renamed from: o, reason: collision with root package name */
    public uc2.d f212753o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15316x68272fd9(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.mediaType = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr.f214442h;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(com.p314xaae8f345.mm.R.id.toe);
        addView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        m61657xdb56be67(frameLayout);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379
    public android.view.View b() {
        return m61652x7f02fdf3();
    }

    @Override // android.view.View
    public java.lang.CharSequence getContentDescription() {
        return "";
    }

    /* renamed from: getLiveRoomController, reason: from getter */
    public final uc2.d getF212753o() {
        return this.f212753o;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr getMediaType() {
        return this.mediaType;
    }

    /* renamed from: setLiveRoomController */
    public final void m62168x369dfee5(uc2.d dVar) {
        this.f212753o = dVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379
    /* renamed from: setMediaType */
    public void mo61656xdb5612fc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr qrVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qrVar, "<set-?>");
        this.mediaType = qrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15316x68272fd9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.mediaType = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr.f214442h;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(com.p314xaae8f345.mm.R.id.toe);
        addView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        m61657xdb56be67(frameLayout);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15316x68272fd9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.mediaType = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr.f214442h;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(com.p314xaae8f345.mm.R.id.toe);
        addView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        m61657xdb56be67(frameLayout);
    }
}
