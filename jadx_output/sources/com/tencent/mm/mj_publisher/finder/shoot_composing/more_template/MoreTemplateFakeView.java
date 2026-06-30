package com.tencent.mm.mj_publisher.finder.shoot_composing.more_template;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0002R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010%¨\u0006."}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/more_template/MoreTemplateFakeView;", "Landroid/widget/FrameLayout;", "", "marginBottom", "Ljz5/f0;", "setMarginBottom", "Landroid/view/View$OnClickListener;", "onClickListener", "setSwitchOnClickListener", "setShootOnClickListener", "visibility", "setImportVisibility", "Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;", "item", "setImportMediaItem", "setImportOnClickListener", "getFakeShootButtonSize", "Landroid/view/View;", "d", "Ljz5/g;", "getSwitchBtn", "()Landroid/view/View;", "switchBtn", "e", "getShootingBtn", "shootingBtn", "f", "getImportBtn", "importBtn", "Landroid/widget/ImageView;", "g", "getMaterialImg", "()Landroid/widget/ImageView;", "materialImg", "Landroidx/constraintlayout/widget/ConstraintLayout;", "h", "getBottomContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "bottomContainer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MoreTemplateFakeView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g switchBtn;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g shootingBtn;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g importBtn;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g materialImg;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g bottomContainer;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MoreTemplateFakeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final androidx.constraintlayout.widget.ConstraintLayout getBottomContainer() {
        java.lang.Object value = this.bottomContainer.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.constraintlayout.widget.ConstraintLayout) value;
    }

    private final android.view.View getImportBtn() {
        java.lang.Object value = this.importBtn.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.widget.ImageView getMaterialImg() {
        java.lang.Object value = this.materialImg.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    private final android.view.View getShootingBtn() {
        java.lang.Object value = this.shootingBtn.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.view.View getSwitchBtn() {
        java.lang.Object value = this.switchBtn.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final int getFakeShootButtonSize() {
        return getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.air);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(android.view.MotionEvent motionEvent) {
        if (isEnabled()) {
            return onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setImportMediaItem(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        if (galleryItem$MediaItem == null) {
            return;
        }
        e33.m6.d(getMaterialImg(), galleryItem$MediaItem.getType(), galleryItem$MediaItem.o(), galleryItem$MediaItem.f138430e, galleryItem$MediaItem.f138434i, new sx0.d(), galleryItem$MediaItem.f138435m);
    }

    public final void setImportOnClickListener(android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(onClickListener, "onClickListener");
        getImportBtn().setOnClickListener(onClickListener);
    }

    public final void setImportVisibility(int i17) {
        android.view.View importBtn = getImportBtn();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(importBtn, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/more_template/MoreTemplateFakeView", "setImportVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        importBtn.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(importBtn, "com/tencent/mm/mj_publisher/finder/shoot_composing/more_template/MoreTemplateFakeView", "setImportVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void setMarginBottom(int i17) {
        com.tencent.mm.ui.kk.d(getBottomContainer(), i17);
    }

    public final void setShootOnClickListener(android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(onClickListener, "onClickListener");
        getShootingBtn().setOnClickListener(onClickListener);
    }

    public final void setSwitchOnClickListener(android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(onClickListener, "onClickListener");
        getSwitchBtn().setOnClickListener(onClickListener);
    }

    public /* synthetic */ MoreTemplateFakeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreTemplateFakeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        jz5.i iVar = jz5.i.f302831f;
        this.switchBtn = jz5.h.a(iVar, new sx0.f(this));
        this.shootingBtn = jz5.h.a(iVar, new sx0.e(this));
        this.importBtn = jz5.h.a(iVar, new sx0.b(this));
        this.materialImg = jz5.h.a(iVar, new sx0.c(this));
        this.bottomContainer = jz5.h.a(iVar, new sx0.a(this));
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489469dy0, this);
    }
}
