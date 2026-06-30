package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/EventRecorder;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityEvent;", "event", "Ljz5/f0;", "dealAccEvent", "", "getAuthority", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class EventRecorder extends com.tencent.mm.accessibility.core.provider.Provider {
    public static final int $stable = 0;
    public static final com.tencent.mm.accessibility.core.provider.EventRecorder INSTANCE = new com.tencent.mm.accessibility.core.provider.EventRecorder();

    private EventRecorder() {
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealAccEvent(android.view.View view, android.view.accessibility.AccessibilityEvent event) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(event, "event");
        if ((event.getEventType() & 32768) != 32768) {
            return;
        }
        getConfig(view, new com.tencent.mm.accessibility.core.provider.EventRecorder$dealAccEvent$1(view));
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public int getAuthority() {
        return 4;
    }
}
