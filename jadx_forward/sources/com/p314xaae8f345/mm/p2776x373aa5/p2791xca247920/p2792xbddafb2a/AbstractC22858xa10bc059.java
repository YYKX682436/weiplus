package com.p314xaae8f345.mm.p2776x373aa5.p2791xca247920.p2792xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/view/shadow/layout/WxShadowViewGroup;", "Landroid/view/ViewGroup;", "Lvn5/c;", "d", "Ljz5/g;", "getShadowHelper", "()Lvn5/c;", "shadowHelper", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.shadow.layout.WxShadowViewGroup */
/* loaded from: classes5.dex */
public abstract class AbstractC22858xa10bc059 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g shadowHelper;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC22858xa10bc059(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getShadowHelper */
    private final vn5.c m82954xef7eaf64() {
        return (vn5.c) ((jz5.n) this.shadowHelper).mo141623x754a37bb();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        m82954xef7eaf64().a(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC22858xa10bc059(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.shadowHelper = jz5.h.b(new wn5.d(this));
        m82954xef7eaf64().c(context, attributeSet, i17);
    }
}
