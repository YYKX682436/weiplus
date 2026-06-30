package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/CallbackCaller;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Ljz5/f0;", "dealNodeInfo", "Landroid/view/accessibility/AccessibilityEvent;", "event", "dealAccEvent", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "", "CLEAR_DELAY_TIME", "J", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "clearTask", "Ljava/lang/Runnable;", "hoverViewId", "I", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class CallbackCaller extends com.tencent.mm.accessibility.core.provider.Provider {
    public static final int $stable;
    private static final long CLEAR_DELAY_TIME = 500;
    public static final com.tencent.mm.accessibility.core.provider.CallbackCaller INSTANCE;
    public static final java.lang.String TAG = "MicroMsg.Acc.CallbackCaller";
    private static final java.lang.Runnable clearTask;
    private static final android.os.Handler handler;
    private static int hoverViewId;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "view", "Landroid/view/View;", "config", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.provider.CallbackCaller$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.p {
        public static final com.tencent.mm.accessibility.core.provider.CallbackCaller.AnonymousClass1 INSTANCE = new com.tencent.mm.accessibility.core.provider.CallbackCaller.AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // yz5.p
        public final java.util.List<java.lang.Integer> invoke(android.view.View view, com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig config) {
            java.util.Set<java.lang.Integer> keySet;
            kotlin.jvm.internal.o.g(view, "view");
            kotlin.jvm.internal.o.g(config, "config");
            java.util.Map<java.lang.Integer, yz5.l> map = config.getViewRootCallbackMap$plugin_autoaccessibility_release().get(java.lang.Integer.valueOf(view.getId()));
            if (map == null || (keySet = map.keySet()) == null) {
                return null;
            }
            return kz5.n0.S0(keySet);
        }
    }

    static {
        com.tencent.mm.accessibility.core.provider.CallbackCaller callbackCaller = new com.tencent.mm.accessibility.core.provider.CallbackCaller();
        INSTANCE = callbackCaller;
        handler = new android.os.Handler(android.os.Looper.getMainLooper());
        clearTask = new java.lang.Runnable() { // from class: com.tencent.mm.accessibility.core.provider.CallbackCaller$clearTask$1
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.accessibility.core.provider.CallbackCaller.hoverViewId = -1;
            }
        };
        hoverViewId = -1;
        callbackCaller.addRootIdMapper$plugin_autoaccessibility_release(com.tencent.mm.accessibility.core.provider.CallbackCaller.AnonymousClass1.INSTANCE);
        $stable = 8;
    }

    private CallbackCaller() {
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealAccEvent(android.view.View view, android.view.accessibility.AccessibilityEvent event) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(event, "event");
        if ((event.getEventType() & 128) == 128) {
            hoverViewId = view.hashCode();
        }
        if ((event.getEventType() & 32768) == 32768) {
            hoverViewId = view.hashCode();
            logMsg(TAG, view, "TYPE_VIEW_ACCESSIBILITY_FOCUSED");
        }
        if ((event.getEventType() & 32768) == 32768) {
            hoverViewId = view.hashCode();
        }
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo nodeInfo) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(nodeInfo, "nodeInfo");
        if (view.hashCode() != hoverViewId) {
            com.tencent.mm.accessibility.uitl.AccUtil accUtil = com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE;
            if (!accUtil.isCoolAssistRunning() && !accUtil.isEnableCallbackRealtime()) {
                return;
            }
        }
        getConfig(view, new com.tencent.mm.accessibility.core.provider.CallbackCaller$dealNodeInfo$1(view, nodeInfo));
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public int getAuthority() {
        return 5;
    }
}
