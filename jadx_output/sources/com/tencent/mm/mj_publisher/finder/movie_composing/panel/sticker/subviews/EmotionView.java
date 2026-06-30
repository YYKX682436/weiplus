package com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\u0012\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/subviews/EmotionView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "Lcom/tencent/mm/api/IEmojiInfo;", "Ljz5/f0;", "selectedCallback", "setEmotionTabData", "Lcom/tencent/mm/api/SmileyPanel;", "d", "Ljz5/g;", "getSmileyPanel", "()Lcom/tencent/mm/api/SmileyPanel;", "smileyPanel", "Lqk/v9;", "kotlin.jvm.PlatformType", "e", "getCallbackWrapper", "()Lqk/v9;", "callbackWrapper", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EmotionView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g smileyPanel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g callbackWrapper;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f69309f;

    /* renamed from: g, reason: collision with root package name */
    public final mw0.b f69310g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmotionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final qk.v9 getCallbackWrapper() {
        return (qk.v9) ((jz5.n) this.callbackWrapper).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.api.SmileyPanel getSmileyPanel() {
        java.lang.Object value = ((jz5.n) this.smileyPanel).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.api.SmileyPanel) value;
    }

    public final void b() {
        getSmileyPanel().a();
    }

    public final void c(com.tencent.mm.api.SmileyPanel smileyPanel) {
        smileyPanel.setBackgroundColor(i65.a.d(getContext(), com.tencent.mm.R.color.a9e));
        int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        smileyPanel.setEntranceScene(3);
        smileyPanel.setSearchSource(6);
        smileyPanel.setShowSmiley(false);
        smileyPanel.setShowClose(false);
        smileyPanel.setTabBackgroundResource(com.tencent.mm.R.drawable.u_);
        smileyPanel.setEmojiPanelBackground(com.tencent.mm.R.drawable.u_);
        smileyPanel.i();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.g3 a17 = n3.b1.a(this);
        e3.d a18 = a17 != null ? a17.a(2) : null;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(a18 != null ? a18.f247047d - a18.f247045b : com.tencent.mm.ui.bl.c(getContext()));
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : j65.q.a(getContext()).getDimensionPixelSize(com.tencent.mm.R.dimen.ajd);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.view.ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i18 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        android.view.ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i19 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        android.view.ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
        layoutParams.setMargins(i18, i19, marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0, intValue);
        addView(smileyPanel, layoutParams);
        getCallbackWrapper().f364351a = this.f69310g;
        smileyPanel.setCallback(getCallbackWrapper());
    }

    public final void setEmotionTabData(yz5.l selectedCallback) {
        kotlin.jvm.internal.o.g(selectedCallback, "selectedCallback");
        this.f69309f = selectedCallback;
    }

    public /* synthetic */ EmotionView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmotionView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.smileyPanel = jz5.h.b(new mw0.c(context));
        this.callbackWrapper = jz5.h.b(mw0.a.f331676d);
        this.f69310g = new mw0.b(this);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            c(getSmileyPanel());
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }
}
