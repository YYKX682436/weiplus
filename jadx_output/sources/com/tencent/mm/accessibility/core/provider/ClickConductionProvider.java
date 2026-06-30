package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/ClickConductionProvider;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Ljz5/f0;", "dealOnViewInflateAsync", "Landroid/view/accessibility/AccessibilityEvent;", "event", "dealAccEvent", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class ClickConductionProvider extends com.tencent.mm.accessibility.core.provider.Provider {
    public static final int $stable = 0;
    public static final com.tencent.mm.accessibility.core.provider.ClickConductionProvider INSTANCE = new com.tencent.mm.accessibility.core.provider.ClickConductionProvider();
    public static final java.lang.String TAG = "MicroMsg.Acc.ClickConductionProvider";

    private ClickConductionProvider() {
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealAccEvent(android.view.View view, android.view.accessibility.AccessibilityEvent event) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(event, "event");
        if ((event.getEventType() & 1) == 1 && com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
            logMsg(TAG, view, "ClickEvent get");
            getConfig(view, new com.tencent.mm.accessibility.core.provider.ClickConductionProvider$dealAccEvent$1(view));
        }
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealOnViewInflateAsync(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        getConfig(view, new com.tencent.mm.accessibility.core.provider.ClickConductionProvider$dealOnViewInflateAsync$1(view));
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public int getAuthority() {
        return 6;
    }
}
