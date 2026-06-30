package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/SimplifiedLoadingProgressBar;", "Landroid/view/View;", "", "inside", "Ljz5/f0;", "setForegroundInsidePadding", "Landroid/graphics/drawable/Drawable;", "foreground", "setForeground", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "luggage-wxa-app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.SimplifiedLoadingProgressBar */
/* loaded from: classes7.dex */
public final class C12699x37a66562 extends android.view.View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12699x37a66562(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setForegroundInsidePadding */
    private final void m52926x79eec930(boolean z17) {
        try {
            d56.b.h(d56.b.h(this).f("mForegroundInfo")).k("mInsidePadding", java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.SimplifiedLoadingProgressBar", "setForegroundInsidePadding(" + z17 + ") get exception:" + e17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void setForeground(android.graphics.drawable.Drawable drawable) {
        java.lang.Object foreground = getForeground();
        super.setForeground(drawable);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(foreground, drawable)) {
            return;
        }
        android.graphics.drawable.Animatable2 animatable2 = foreground instanceof android.graphics.drawable.Animatable2 ? (android.graphics.drawable.Animatable2) foreground : null;
        if (animatable2 != null) {
            animatable2.clearAnimationCallbacks();
        }
        android.graphics.drawable.Animatable2 animatable22 = drawable instanceof android.graphics.drawable.Animatable2 ? (android.graphics.drawable.Animatable2) drawable : null;
        if (animatable22 != null) {
            animatable22.registerAnimationCallback(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.md(animatable22, this));
        }
        m52926x79eec930(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12699x37a66562(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12699x37a66562(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
