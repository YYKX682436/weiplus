package com.tencent.mm.accessibility.core;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\b\u0017\u0018\u0000 $2\u00020\u0001:\u0001$B\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\"\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/tencent/mm/accessibility/core/MMAccessibilityDelegateWrap;", "Landroid/view/View$AccessibilityDelegate;", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "Ljz5/f0;", "saveCache", "getCache", "Landroid/view/View;", "host", "onInitializeAccessibilityNodeInfo", "Landroid/view/accessibility/AccessibilityEvent;", "event", "onInitializeAccessibilityEvent", "Landroid/view/accessibility/AccessibilityNodeProvider;", "getAccessibilityNodeProvider", "", "action", "Landroid/os/Bundle;", "args", "", "performAccessibilityAction", "eventType", "sendAccessibilityEvent", "sendAccessibilityEventUnchecked", "onPopulateAccessibilityEvent", ya.b.ORIGIN, "Landroid/view/View$AccessibilityDelegate;", "getOrigin", "()Landroid/view/View$AccessibilityDelegate;", "", "nodeCacheTime", "J", "nodeCache", "Landroid/view/accessibility/AccessibilityNodeInfo;", "<init>", "(Landroid/view/View$AccessibilityDelegate;)V", "Companion", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public class MMAccessibilityDelegateWrap extends android.view.View.AccessibilityDelegate {
    public static final long CACHE_TIME = 100;
    public static final java.lang.String TAG = "MicroMsg.Acc.MMAccessibilityDelegateWrap";
    private android.view.accessibility.AccessibilityNodeInfo nodeCache;
    private long nodeCacheTime;
    private final android.view.View.AccessibilityDelegate origin;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public MMAccessibilityDelegateWrap() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final android.view.accessibility.AccessibilityNodeInfo getCache() {
        if (java.lang.System.currentTimeMillis() - this.nodeCacheTime >= 100 || !com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isEnableNodeInfoCache()) {
            return null;
        }
        return this.nodeCache;
    }

    private final void saveCache(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        if (com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isEnableNodeInfoCache()) {
            android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2 = this.nodeCache;
            if (accessibilityNodeInfo2 != null && accessibilityNodeInfo2 != null) {
                accessibilityNodeInfo2.recycle();
            }
            this.nodeCache = android.view.accessibility.AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            this.nodeCacheTime = java.lang.System.currentTimeMillis();
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View host) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider;
        kotlin.jvm.internal.o.g(host, "host");
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate != null && (accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(host)) != null) {
            return accessibilityNodeProvider;
        }
        com.tencent.mm.accessibility.uitl.AccUtil accUtil = com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE;
        if (!accUtil.canPreDeal() || !accUtil.isAccessibilityEnabled()) {
            return null;
        }
        if (host.isClickable() || host.isLongClickable()) {
            return com.tencent.mm.accessibility.core.area.AreaProvider.INSTANCE.buildAccessibilityProvider(host);
        }
        return null;
    }

    public final android.view.View.AccessibilityDelegate getOrigin() {
        return this.origin;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(android.view.View host, android.view.accessibility.AccessibilityEvent event) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(event, "event");
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.onInitializeAccessibilityEvent(host, event);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.onInitializeAccessibilityEvent(host, event);
        }
        com.tencent.mm.accessibility.uitl.AccUtil accUtil = com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE;
        if (accUtil.isAccessibilityEnabled() || accUtil.isEnableAccEnableForced()) {
            com.tencent.mm.accessibility.core.provider.AccProviderFactory.INSTANCE.dispatchAccEvent(host, event);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View host, android.view.accessibility.AccessibilityNodeInfo info) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(info, "info");
        try {
            if (((com.tencent.mm.accessibility.feature.IAccExptService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccExptService.class)).needClearNodeInfo()) {
                ((com.tencent.mm.accessibility.feature.IAccessibilityService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccessibilityService.class)).onClearNodeInfo();
                return;
            }
            android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
            if (accessibilityDelegate != null) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(host, info);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                super.onInitializeAccessibilityNodeInfo(host, info);
            }
            android.view.accessibility.AccessibilityNodeInfo cache = getCache();
            if (cache != null) {
                com.tencent.mm.accessibility.uitl.AccNodeUtil.INSTANCE.copy(cache, info);
                return;
            }
            com.tencent.mm.accessibility.uitl.AccUtil accUtil = com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE;
            if (accUtil.isAccessibilityEnabled() || accUtil.isEnableAccEnableForced()) {
                ((com.tencent.mm.accessibility.feature.IAccessibilityService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccessibilityService.class)).onInitNodeInfo();
                com.tencent.mm.accessibility.core.provider.AccProviderFactory.INSTANCE.dispatchNodeInfo(host, info);
                saveCache(info);
            }
            android.content.Context context = host.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.accessibility.base.MapExpandKt.recordText(info, context);
            if (((com.tencent.mm.accessibility.feature.IAccExptService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccExptService.class)).needUseFakeInfo()) {
                info.getViewIdResourceName();
                java.util.Objects.toString(info.getText());
                java.util.Objects.toString(info.getContentDescription());
                android.content.Context context2 = host.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                com.tencent.mm.accessibility.base.MapExpandKt.toFakeInfo(info, context2);
                ((com.tencent.mm.accessibility.feature.IAccessibilityService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccessibilityService.class)).onFakeNodeInfo();
                info.getViewIdResourceName();
                java.util.Objects.toString(info.getText());
                java.util.Objects.toString(info.getContentDescription());
            } else {
                info.getViewIdResourceName();
                java.util.Objects.toString(info.getText());
                java.util.Objects.toString(info.getContentDescription());
            }
            if (((com.tencent.mm.accessibility.feature.IAccExptService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccExptService.class)).needClearNodeInfo()) {
                com.tencent.mm.accessibility.base.MapExpandKt.clearInfo(info);
                ((com.tencent.mm.accessibility.feature.IAccessibilityService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccessibilityService.class)).onClearNodeInfo();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(android.view.View host, android.view.accessibility.AccessibilityEvent event) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(event, "event");
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.onPopulateAccessibilityEvent(host, event);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.onPopulateAccessibilityEvent(host, event);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(android.view.View host, int action, android.os.Bundle args) {
        kotlin.jvm.internal.o.g(host, "host");
        if (!com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled() && action == 16) {
            ((com.tencent.mm.accessibility.feature.IAccessibilityService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccessibilityService.class)).onPerformAccAction();
        }
        if (((com.tencent.mm.accessibility.feature.IAccExptService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccExptService.class)).needInterceptAccAction()) {
            com.tencent.mars.xlog.Log.i(TAG, "performAccessibilityAction skip");
            ((com.tencent.mm.accessibility.feature.IAccessibilityService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccessibilityService.class)).needInterceptAccAction();
            return true;
        }
        com.tencent.mm.accessibility.core.provider.AccProviderFactory.INSTANCE.dispatchOnAction(host, action, args);
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate instanceof com.tencent.mm.accessibility.core.IMMAccessibilityPerformMark ? accessibilityDelegate.performAccessibilityAction(host, action, args) : super.performAccessibilityAction(host, action, args);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(android.view.View host, int i17) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(host, "host");
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.sendAccessibilityEvent(host, i17);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.sendAccessibilityEvent(host, i17);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEventUnchecked(android.view.View host, android.view.accessibility.AccessibilityEvent event) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(event, "event");
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.sendAccessibilityEventUnchecked(host, event);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.sendAccessibilityEventUnchecked(host, event);
        }
    }

    public /* synthetic */ MMAccessibilityDelegateWrap(android.view.View.AccessibilityDelegate accessibilityDelegate, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : accessibilityDelegate);
    }

    public MMAccessibilityDelegateWrap(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.origin = accessibilityDelegate;
    }
}
