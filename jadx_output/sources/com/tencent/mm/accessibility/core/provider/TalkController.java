package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J \u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0013¨\u0006#"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/TalkController;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Ljz5/f0;", "recordLongTimeGo", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "dealNodeInfo", "talk", "", dm.i4.COL_ID, "", "talkString", "getAuthority", "longTimeGo", "Z", "", "TAG", "Ljava/lang/String;", "", "viewLastValueMap", "Ljava/util/Map;", "", "LONG_TIME_GO", "J", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "longTimeGoTask", "Ljava/lang/Runnable;", "lastTalkString", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class TalkController extends com.tencent.mm.accessibility.core.provider.Provider {
    public static final int $stable;
    public static final com.tencent.mm.accessibility.core.provider.TalkController INSTANCE;
    private static final long LONG_TIME_GO = 1000;
    public static final java.lang.String TAG = "MicroMsg.Acc.TalkController";
    private static final android.os.Handler handler;
    private static java.lang.String lastTalkString;
    private static boolean longTimeGo;
    private static final java.lang.Runnable longTimeGoTask;
    private static final java.util.Map<java.lang.Integer, java.lang.Boolean> viewLastValueMap;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "view", "Landroid/view/View;", "config", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.provider.TalkController$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.p {
        public static final com.tencent.mm.accessibility.core.provider.TalkController.AnonymousClass1 INSTANCE = new com.tencent.mm.accessibility.core.provider.TalkController.AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // yz5.p
        public final java.util.List<java.lang.Integer> invoke(android.view.View view, com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig config) {
            java.util.Set<java.lang.Integer> keySet;
            kotlin.jvm.internal.o.g(view, "view");
            kotlin.jvm.internal.o.g(config, "config");
            java.util.Map<java.lang.Integer, yz5.l> map = config.getTalkMap$plugin_autoaccessibility_release().get(java.lang.Integer.valueOf(view.getId()));
            if (map == null || (keySet = map.keySet()) == null) {
                return null;
            }
            return kz5.n0.S0(keySet);
        }
    }

    static {
        com.tencent.mm.accessibility.core.provider.TalkController talkController = new com.tencent.mm.accessibility.core.provider.TalkController();
        INSTANCE = talkController;
        longTimeGo = true;
        viewLastValueMap = new java.util.LinkedHashMap();
        handler = new android.os.Handler(android.os.Looper.getMainLooper());
        longTimeGoTask = new java.lang.Runnable() { // from class: com.tencent.mm.accessibility.core.provider.TalkController$longTimeGoTask$1
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.accessibility.core.provider.TalkController.longTimeGo = true;
            }
        };
        lastTalkString = "";
        talkController.addRootIdMapper$plugin_autoaccessibility_release(com.tencent.mm.accessibility.core.provider.TalkController.AnonymousClass1.INSTANCE);
        $stable = 8;
    }

    private TalkController() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordLongTimeGo() {
        longTimeGo = false;
        android.os.Handler handler2 = handler;
        java.lang.Runnable runnable = longTimeGoTask;
        handler2.removeCallbacks(runnable);
        handler2.postDelayed(runnable, 1000L);
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo nodeInfo) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(nodeInfo, "nodeInfo");
        getConfig(view, new com.tencent.mm.accessibility.core.provider.TalkController$dealNodeInfo$1(view, nodeInfo));
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public int getAuthority() {
        return 1;
    }

    public final void talk(android.view.View view, android.view.accessibility.AccessibilityNodeInfo nodeInfo) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(nodeInfo, "nodeInfo");
        java.lang.CharSequence contentDescription = nodeInfo.getContentDescription();
        if (contentDescription == null) {
            contentDescription = nodeInfo.getText();
        }
        if (contentDescription == null) {
            contentDescription = "";
        }
        lastTalkString = contentDescription.toString();
        logMsg(TAG, view, "talk self " + ((java.lang.Object) contentDescription));
        view.announceForAccessibility(contentDescription);
    }

    public final boolean talkString(android.view.View view, int id6, android.view.accessibility.AccessibilityNodeInfo nodeInfo) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(nodeInfo, "nodeInfo");
        try {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(id6);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.CharSequence contentDescription = nodeInfo.getContentDescription();
            if (contentDescription == null) {
                contentDescription = nodeInfo.getText();
            }
            if (contentDescription == null) {
                contentDescription = "";
            }
            if (string.length() == 0) {
                return false;
            }
            view.announceForAccessibility(string);
            logMsg(TAG, view, "talk string ".concat(string));
            lastTalkString = contentDescription.toString();
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(TAG, "talkString throw " + th6.getClass().getClass().getName() + ' ' + th6.getMessage() + " viewid:" + view.getId() + " stringid:" + id6 + ' ');
            return false;
        }
    }
}
