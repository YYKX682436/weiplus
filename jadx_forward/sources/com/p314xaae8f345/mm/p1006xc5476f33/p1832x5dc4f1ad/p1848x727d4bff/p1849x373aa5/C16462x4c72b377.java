package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R6\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/scldemo/view/MagicBrushSclDemoView;", "Lcom/tencent/mm/magicbrush/plugin/scl/view/MagicSclViewContainer;", "Landroid/view/ViewGroup$LayoutParams;", "params", "Ljz5/f0;", "setLayoutParams", "Lkotlin/Function2;", "", "u", "Lyz5/p;", "getOnSizeChangeListener", "()Lyz5/p;", "setOnSizeChangeListener", "(Lyz5/p;)V", "onSizeChangeListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView */
/* loaded from: classes7.dex */
public final class C16462x4c72b377 extends com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d {

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public yz5.p onSizeChangeListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16462x4c72b377(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final yz5.p getOnSizeChangeListener() {
        return this.onSizeChangeListener;
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        yz5.p pVar;
        super.setLayoutParams(layoutParams);
        if (layoutParams == null || layoutParams.height <= 0 || (pVar = this.onSizeChangeListener) == null) {
            return;
        }
        pVar.mo149xb9724478(java.lang.Integer.valueOf(layoutParams.width), java.lang.Integer.valueOf(layoutParams.height));
    }

    /* renamed from: setOnSizeChangeListener */
    public final void m66500xbe0c3ea6(yz5.p pVar) {
        this.onSizeChangeListener = pVar;
    }

    public /* synthetic */ C16462x4c72b377(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16462x4c72b377(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        setBackgroundColor(-7829368);
    }
}
