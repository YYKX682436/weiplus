package com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0013R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewChangeMode;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "", "Ljz5/f0;", "d", "Lyz5/l;", "getOnModeSelected", "()Lyz5/l;", "setOnModeSelected", "(Lyz5/l;)V", "onModeSelected", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewChangeMode */
/* loaded from: classes5.dex */
public final class C13406x1f846bbe extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.l onModeSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13406x1f846bbe(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cvv, this);
        findViewById(com.p314xaae8f345.mm.R.id.f568647nj4).setOnClickListener(new f32.a(this));
        findViewById(com.p314xaae8f345.mm.R.id.nj6).setOnClickListener(new f32.b(this));
        findViewById(com.p314xaae8f345.mm.R.id.f568648nj5).setOnClickListener(new f32.c(this));
    }

    public final yz5.l getOnModeSelected() {
        return this.onModeSelected;
    }

    /* renamed from: setOnModeSelected */
    public final void m54966x382dfddf(yz5.l lVar) {
        this.onModeSelected = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13406x1f846bbe(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
