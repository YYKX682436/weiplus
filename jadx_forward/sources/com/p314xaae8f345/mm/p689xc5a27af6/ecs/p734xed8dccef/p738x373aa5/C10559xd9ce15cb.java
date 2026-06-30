package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/view/EcsIconLabelView;", "Landroid/widget/ImageView;", "Lbw5/c7;", "d", "Lbw5/c7;", "getIcon", "()Lbw5/c7;", "setIcon", "(Lbw5/c7;)V", "icon", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.product.view.EcsIconLabelView */
/* loaded from: classes9.dex */
public final class C10559xd9ce15cb extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public bw5.c7 icon;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10559xd9ce15cb(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final bw5.c7 getIcon() {
        return this.icon;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        bw5.c7 c7Var = this.icon;
        int i19 = c7Var != null ? c7Var.f107488f : 0;
        int i27 = c7Var != null ? c7Var.f107487e : 0;
        if (i19 <= 0 || i27 <= 0) {
            super.onMeasure(i17, i18);
        } else {
            setMeasuredDimension(android.view.View.resolveSize(i19 + getPaddingLeft() + getPaddingRight(), i17), android.view.View.resolveSize(i27 + getPaddingTop() + getPaddingBottom(), i18));
        }
    }

    /* renamed from: setIcon */
    public final void m44402x764b6bfb(bw5.c7 c7Var) {
        this.icon = c7Var;
    }

    public /* synthetic */ C10559xd9ce15cb(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10559xd9ce15cb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
