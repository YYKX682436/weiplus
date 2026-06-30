package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/gallery/view/AlbumScrollBarContainer;", "Landroid/widget/FrameLayout;", "Lk33/d;", "getUICore", "", "translationY", "Ljz5/f0;", "setTranslationY", "Lcom/tencent/mm/plugin/gallery/view/TouchableGalleryScrollBar;", "e", "Ljz5/g;", "getSliderView", "()Lcom/tencent/mm/plugin/gallery/view/TouchableGalleryScrollBar;", "sliderView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gallery.view.AlbumScrollBarContainer */
/* loaded from: classes5.dex */
public final class C15673xa51c39ca extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f220182d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g sliderView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15673xa51c39ca(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f220182d = "MicroMsg.AlbumScrollBarContainer-[" + hashCode() + ']';
        this.sliderView = jz5.h.b(new k33.c(this));
    }

    /* renamed from: getSliderView */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15676xd39461ed m63724x3030871c() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15676xd39461ed) this.sliderView.mo141623x754a37bb();
    }

    /* renamed from: getUICore */
    public final k33.d m63725x30e2fb29() {
        return m63724x3030871c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.util.Size d17 = m63724x3030871c().d(com.p314xaae8f345.mm.ui.q2.NORMAL);
        boolean z17 = m63724x3030871c().getParent() != null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f220182d, "onAttachedToWindow: " + z17);
        if (z17) {
            android.view.ViewParent parent = m63724x3030871c().getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(m63724x3030871c());
            }
        }
        addView(m63724x3030871c(), d17.getWidth(), d17.getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f220182d, "onDetachedFromWindow: ");
        removeView(m63724x3030871c());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        measureChildren(i17, i18);
        int childCount = getChildCount();
        int i19 = 0;
        int i27 = 0;
        for (int i28 = 0; i28 < childCount; i28++) {
            android.view.View childAt = getChildAt(i28);
            int measuredWidth = childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight();
            int measuredHeight = childAt.getMeasuredHeight() + childAt.getPaddingTop() + childAt.getPaddingBottom();
            if (measuredWidth > i19) {
                i19 = measuredWidth;
            }
            if (measuredHeight > i27) {
                i27 = measuredHeight;
            }
        }
        setMeasuredDimension(android.view.View.resolveSize(i19 + getPaddingLeft() + getPaddingRight(), i17), android.view.View.resolveSize(i27 + getPaddingTop() + getPaddingBottom(), i18));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    @Override // android.view.View
    public void setTranslationY(float f17) {
        getTranslationY();
        super.setTranslationY(f17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15673xa51c39ca(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f220182d = "MicroMsg.AlbumScrollBarContainer-[" + hashCode() + ']';
        this.sliderView = jz5.h.b(new k33.c(this));
    }
}
