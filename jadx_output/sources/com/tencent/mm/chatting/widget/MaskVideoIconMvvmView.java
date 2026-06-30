package com.tencent.mm.chatting.widget;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/chatting/widget/MaskVideoIconMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "f", "Ljz5/g;", "getIcon", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "icon", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "feature-chatting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MaskVideoIconMvvmView extends com.tencent.mm.mvvm.MvvmView<java.lang.Object> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g icon;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskVideoIconMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final com.tencent.mm.ui.widget.imageview.WeImageView getIcon() {
        java.lang.Object value = ((jz5.n) this.icon).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public boolean b() {
        return true;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.e2c, (android.view.ViewGroup) this, true);
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public /* bridge */ /* synthetic */ void e(q31.p pVar, q31.p pVar2) {
        android.support.v4.media.f.a(pVar);
        android.support.v4.media.f.a(pVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskVideoIconMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.icon = jz5.h.b(new jo.e(this));
    }
}
