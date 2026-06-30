package com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/SideBarItemView;", "Landroid/widget/FrameLayout;", "", "resId", "Ljz5/f0;", "setImageResource", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "setText", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "d", "Ljz5/g;", "getImageView", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "imageView", "Landroid/widget/TextView;", "e", "getTextView", "()Landroid/widget/TextView;", "textView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SideBarItemView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g imageView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g textView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SideBarItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final com.tencent.mm.ui.widget.imageview.WeImageView getImageView() {
        java.lang.Object value = this.imageView.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    private final android.widget.TextView getTextView() {
        java.lang.Object value = this.textView.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final void a() {
        com.tencent.mm.ui.fk.a(getTextView());
    }

    public final void setImageResource(int i17) {
        getImageView().setImageResource(i17);
    }

    public final void setText(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        getTextView().setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SideBarItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        jz5.i iVar = jz5.i.f302831f;
        this.imageView = jz5.h.a(iVar, new wx0.e1(this));
        this.textView = jz5.h.a(iVar, new wx0.f1(this));
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.eo6, this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mo4.a.f330423a);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            getImageView().setImageResource(resourceId);
        } else {
            getImageView().setBackgroundColor(obtainStyledAttributes.getColor(1, 0));
        }
        getImageView().setEnableColorFilter(false);
        int dimension = (int) obtainStyledAttributes.getDimension(2, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        android.view.ViewGroup.LayoutParams layoutParams = getImageView().getLayoutParams();
        if (dimension > 0) {
            layoutParams.width = dimension;
        }
        if (dimension2 > 0) {
            layoutParams.height = dimension2;
        }
        getImageView().setLayoutParams(layoutParams);
        getTextView().setText(obtainStyledAttributes.getString(3));
        obtainStyledAttributes.recycle();
    }
}
