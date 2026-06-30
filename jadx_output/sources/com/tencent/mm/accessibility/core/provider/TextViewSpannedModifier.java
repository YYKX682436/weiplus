package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/TextViewSpannedModifier;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Landroid/text/style/ClickableSpan;", "getIfOnlyClickableSpan", "Landroid/view/accessibility/AccessibilityEvent;", "event", "Ljz5/f0;", "dealAccEvent", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class TextViewSpannedModifier extends com.tencent.mm.accessibility.core.provider.Provider {
    public static final int $stable = 0;
    public static final com.tencent.mm.accessibility.core.provider.TextViewSpannedModifier INSTANCE = new com.tencent.mm.accessibility.core.provider.TextViewSpannedModifier();
    public static final java.lang.String TAG = "MicroMsg.Acc.TextViewSpannedModifier";

    private TextViewSpannedModifier() {
    }

    private final android.text.style.ClickableSpan getIfOnlyClickableSpan(android.view.View view) {
        java.lang.CharSequence a17;
        boolean z17 = view instanceof com.tencent.neattextview.textview.view.NeatTextView;
        if (!z17 && !(view instanceof android.widget.TextView)) {
            return null;
        }
        if (!(view instanceof android.widget.TextView)) {
            if (z17) {
                a17 = ((com.tencent.neattextview.textview.view.NeatTextView) view).a();
                kotlin.jvm.internal.o.d(a17);
            }
            return null;
        }
        a17 = ((android.widget.TextView) view).getText();
        kotlin.jvm.internal.o.d(a17);
        if (!(a17 instanceof android.text.Spanned)) {
            logMsg(TAG, view, "TextViewSpannedModifier," + ((java.lang.Object) a17) + " type wrong:" + a17.getClass() + ' ');
            return null;
        }
        android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) ((android.text.Spanned) a17).getSpans(0, a17.length(), android.text.style.ClickableSpan.class);
        if (clickableSpanArr.length == 1 && clickableSpanArr[0] != null) {
            logMsg(TAG, view, "TextViewSpannedModifier," + ((java.lang.Object) a17) + " success get Span");
            android.text.style.ClickableSpan clickableSpan = clickableSpanArr[0];
            kotlin.jvm.internal.o.e(clickableSpan, "null cannot be cast to non-null type android.text.style.ClickableSpan");
            return clickableSpan;
        }
        return null;
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealAccEvent(android.view.View view, android.view.accessibility.AccessibilityEvent event) {
        android.text.style.ClickableSpan ifOnlyClickableSpan;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(event, "event");
        if (event.getEventType() == 1 && com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isTouchExplorationEnable() && (ifOnlyClickableSpan = getIfOnlyClickableSpan(view)) != null) {
            ifOnlyClickableSpan.onClick(view);
        }
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public int getAuthority() {
        return 4;
    }
}
