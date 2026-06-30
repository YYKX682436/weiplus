package com.tencent.mm.chatting.widget;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/chatting/widget/MaskContentMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "La11/a;", "Landroid/widget/TextView;", "f", "Ljz5/g;", "getTextView", "()Landroid/widget/TextView;", "textView", "Landroid/view/View;", "g", "getMask", "()Landroid/view/View;", "mask", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "h", "getIcon", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "icon", "i", "getContentLl", "contentLl", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "feature-chatting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class MaskContentMvvmView extends com.tencent.mm.mvvm.MvvmView<a11.a> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g textView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g mask;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g icon;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g contentLl;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskContentMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final android.view.View getContentLl() {
        java.lang.Object value = ((jz5.n) this.contentLl).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final com.tencent.mm.ui.widget.imageview.WeImageView getIcon() {
        java.lang.Object value = ((jz5.n) this.icon).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    private final android.view.View getMask() {
        java.lang.Object value = ((jz5.n) this.mask).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.widget.TextView getTextView() {
        java.lang.Object value = ((jz5.n) this.textView).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488582e23, (android.view.ViewGroup) this, true);
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        a11.a aVar = (a11.a) pVar2;
        if (aVar == null) {
            return;
        }
        java.lang.String str = aVar.f495d;
        if (str != null) {
            getTextView().setText(str);
        }
        if (!(aVar.f496e == 0.0f)) {
            getTextView().setTextSize(0, aVar.f496e);
        }
        if (aVar.f497f != 0) {
            android.view.ViewGroup.LayoutParams layoutParams = getContentLl().getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.rightMargin = aVar.f497f;
            }
        }
        if (aVar.f498g != 0) {
            android.view.ViewGroup.LayoutParams layoutParams2 = getContentLl().getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = aVar.f498g;
            }
        }
        if (aVar.f499h != 0) {
            getMask().getLayoutParams().height = aVar.f499h;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView icon = getIcon();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(icon, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(icon, arrayList2.toArray(), "com/tencent/mm/chatting/widget/MaskContentMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/basiswidget/MaskContentViewModel;Lcom/tencent/mm/modelchatting/basiswidget/MaskContentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        icon.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(icon, "com/tencent/mm/chatting/widget/MaskContentMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/basiswidget/MaskContentViewModel;Lcom/tencent/mm/modelchatting/basiswidget/MaskContentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(icon, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getContentLl().setLayoutParams(getContentLl().getLayoutParams());
        getMask().setLayoutParams(getMask().getLayoutParams());
    }

    public /* synthetic */ MaskContentMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskContentMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.textView = jz5.h.b(new jo.d(this));
        this.mask = jz5.h.b(new jo.c(this));
        this.icon = jz5.h.b(new jo.b(this));
        this.contentLl = jz5.h.b(new jo.a(this));
    }
}
