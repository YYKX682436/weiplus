package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-B#\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b,\u00100R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'¨\u00061"}, d2 = {"Lcom/tencent/mm/plugin/gallery/picker/view/MMMediaCropLayout;", "Landroid/widget/FrameLayout;", "Landroid/widget/ImageView;", "d", "Ljz5/g;", "getImageView", "()Landroid/widget/ImageView;", "imageView", "Lcom/tencent/mm/pluginsdk/ui/CommonVideoView;", "e", "getVideoView", "()Lcom/tencent/mm/pluginsdk/ui/CommonVideoView;", "videoView", "Lcom/tencent/mm/ui/widget/cropview/CropLayout;", "f", "getLayout", "()Lcom/tencent/mm/ui/widget/cropview/CropLayout;", "layout", "Lml5/k;", "g", "Lml5/k;", "getDefaultScaleType", "()Lml5/k;", "setDefaultScaleType", "(Lml5/k;)V", "defaultScaleType", "", "h", "J", "getCurrentPreviewMediaId", "()J", "setCurrentPreviewMediaId", "(J)V", "currentPreviewMediaId", "", "isLockCropWindow", "Z", "()Z", "setLockCropWindow", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gallery.picker.view.MMMediaCropLayout */
/* loaded from: classes4.dex */
public final class C15648xa9786f1e extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g imageView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g videoView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g layout;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public ml5.k defaultScaleType;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public long currentPreviewMediaId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15648xa9786f1e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.imageView = jz5.h.b(new d33.p0(this));
        this.videoView = jz5.h.b(new d33.r0(this));
        this.layout = jz5.h.b(new d33.q0(this));
        this.defaultScaleType = ml5.k.f409964e;
        new android.util.LongSparseArray();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(m63676x22f21e20(), layoutParams);
    }

    public final long getCurrentPreviewMediaId() {
        return this.currentPreviewMediaId;
    }

    public final ml5.k getDefaultScaleType() {
        return this.defaultScaleType;
    }

    /* renamed from: getImageView */
    public final android.widget.ImageView m63675xcb16a3ea() {
        return (android.widget.ImageView) this.imageView.mo141623x754a37bb();
    }

    /* renamed from: getLayout */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa m63676x22f21e20() {
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa) this.layout.mo141623x754a37bb();
    }

    /* renamed from: getVideoView */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5 m63677x4ee17f0a() {
        return (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5) this.videoView.mo141623x754a37bb();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m63677x4ee17f0a().d();
    }

    /* renamed from: setCurrentPreviewMediaId */
    public final void m63678x3a0ff9ce(long j17) {
        this.currentPreviewMediaId = j17;
    }

    /* renamed from: setDefaultScaleType */
    public final void m63679x47db16e5(ml5.k kVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<set-?>");
        this.defaultScaleType = kVar;
    }

    /* renamed from: setLockCropWindow */
    public final void m63680x5fb7f32d(boolean z17) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15648xa9786f1e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.imageView = jz5.h.b(new d33.p0(this));
        this.videoView = jz5.h.b(new d33.r0(this));
        this.layout = jz5.h.b(new d33.q0(this));
        this.defaultScaleType = ml5.k.f409964e;
        new android.util.LongSparseArray();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(m63676x22f21e20(), layoutParams);
    }
}
