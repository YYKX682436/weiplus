package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u00100J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u001e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0002J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0019\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005J \u0010\u001f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\u0016\u0010\"\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 J\u0016\u0010$\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010!\u001a\u00020#J\u001a\u0010'\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u00052\b\u0010&\u001a\u0004\u0018\u00010#R\u0014\u0010)\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/AccProviderFactory;", "", "", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "providers", "Landroid/view/View;", "root", "Ljz5/f0;", "dealTagSync", "view", "", "needDelegateTouch", "Lkotlin/Function0;", "runnable", "runInProtect", "onInflateRootAsync", "onMockInflate", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "config", "bindConfig", "unbindConfig", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "dispatchNodeInfo", "dispatchViewInflate", "", "action", "Landroid/os/Bundle;", "args", "dispatchOnAction", "Landroid/view/accessibility/AccessibilityEvent;", "event", "dispatchAccEvent", "Landroid/view/MotionEvent;", "dispatchOnTouchEvent", org.chromium.base.BaseSwitches.V, "motionEvent", "onInterceptTouchEvent", "", "TAG", "Ljava/lang/String;", "Ljava/util/List;", "", "MOCK_INFLATE_DELAY", "J", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class AccProviderFactory {
    public static final int $stable;
    public static final com.tencent.mm.accessibility.core.provider.AccProviderFactory INSTANCE = new com.tencent.mm.accessibility.core.provider.AccProviderFactory();
    private static final long MOCK_INFLATE_DELAY = 200;
    private static final java.lang.String TAG = "MicroMsg.Acc.AccProviderFactory";
    private static final java.util.List<com.tencent.mm.accessibility.core.provider.Provider> providers;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        providers = arrayList;
        arrayList.add(com.tencent.mm.accessibility.core.provider.EventRecorder.INSTANCE);
        arrayList.add(com.tencent.mm.accessibility.core.provider.PreFocusModifier.INSTANCE);
        arrayList.add(com.tencent.mm.accessibility.core.provider.ContentDescProvider.INSTANCE);
        arrayList.add(com.tencent.mm.accessibility.core.provider.CallbackCaller.INSTANCE);
        arrayList.add(com.tencent.mm.accessibility.core.provider.DisableFocusModifier.INSTANCE);
        arrayList.add(com.tencent.mm.accessibility.core.provider.OrderProvider.INSTANCE);
        arrayList.add(com.tencent.mm.accessibility.core.provider.TypeModifier.INSTANCE);
        arrayList.add(com.tencent.mm.accessibility.core.provider.TalkController.INSTANCE);
        arrayList.add(com.tencent.mm.accessibility.core.provider.DisableChildModifier.INSTANCE);
        arrayList.add(com.tencent.mm.accessibility.core.provider.ClickConductionProvider.INSTANCE);
        arrayList.add(com.tencent.mm.accessibility.core.provider.TextViewSpannedModifier.INSTANCE);
        arrayList.add(com.tencent.mm.accessibility.core.provider.CheckableModifier.INSTANCE);
        arrayList.add(com.tencent.mm.accessibility.core.provider.SeekbarCaller.INSTANCE);
        arrayList.add(b85.i.f18352a);
        $stable = 8;
    }

    private AccProviderFactory() {
    }

    private final void dealTagSync(android.view.View view) {
        com.tencent.mm.accessibility.base.MapExpandKt.visitChild(view, com.tencent.mm.accessibility.core.provider.AccProviderFactory$dealTagSync$1.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean needDelegateTouch(android.view.View view) {
        try {
            java.util.Iterator<T> it = providers.iterator();
            while (it.hasNext()) {
                if (((com.tencent.mm.accessibility.core.provider.Provider) it.next()).needDelegateTouch(view)) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "throw in view(%s)", com.tencent.mm.accessibility.uitl.IdUtil.INSTANCE.getName(view.getId()));
            return false;
        }
    }

    private final java.util.List<com.tencent.mm.accessibility.core.provider.Provider> providers() {
        return providers;
    }

    private final void runInProtect(android.view.View view, yz5.a aVar) {
        try {
            aVar.invoke();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "throw in view(%s)", com.tencent.mm.accessibility.uitl.IdUtil.INSTANCE.getName(view.getId()));
        }
    }

    public final void bindConfig(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig config) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(config, "config");
        java.util.Iterator<T> it = providers.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.accessibility.core.provider.Provider) it.next()).bindConfig(activity, config);
        }
        com.tencent.mm.accessibility.core.area.AreaProvider.INSTANCE.bindConfig(activity, config);
    }

    public final void dispatchAccEvent(android.view.View view, android.view.accessibility.AccessibilityEvent event) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(event, "event");
        runInProtect(view, new com.tencent.mm.accessibility.core.provider.AccProviderFactory$dispatchAccEvent$1(view, event));
    }

    public final void dispatchNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo nodeInfo) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(nodeInfo, "nodeInfo");
        runInProtect(view, new com.tencent.mm.accessibility.core.provider.AccProviderFactory$dispatchNodeInfo$1(view, nodeInfo));
    }

    public final void dispatchOnAction(android.view.View view, int i17, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        runInProtect(view, new com.tencent.mm.accessibility.core.provider.AccProviderFactory$dispatchOnAction$1(view, i17, bundle));
    }

    public final void dispatchOnTouchEvent(android.view.View view, android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(event, "event");
        runInProtect(view, new com.tencent.mm.accessibility.core.provider.AccProviderFactory$dispatchOnTouchEvent$1(view, event));
    }

    public final void dispatchViewInflate(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        runInProtect(view, new com.tencent.mm.accessibility.core.provider.AccProviderFactory$dispatchViewInflate$1(view));
    }

    public final void onInflateRootAsync(android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        dealTagSync(root);
        if (com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.canPreDeal()) {
            com.tencent.mm.accessibility.base.ViewTag tagData = com.tencent.mm.accessibility.core.ViewTagManager.INSTANCE.getTagData(root);
            if (tagData != null ? kotlin.jvm.internal.o.b(tagData.getHavenInflate(), java.lang.Boolean.TRUE) : false) {
                return;
            }
            com.tencent.mm.accessibility.base.MapExpandKt.postIfNeed(root, new com.tencent.mm.accessibility.core.provider.AccProviderFactory$onInflateRootAsync$1(new java.lang.ref.WeakReference(root)));
        }
    }

    public final boolean onInterceptTouchEvent(android.view.View v17, android.view.MotionEvent motionEvent) {
        if (v17 == null || motionEvent == null || !kz5.z.F(new int[]{0, 1, 5, 6}, motionEvent.getAction())) {
            return false;
        }
        int i17 = b85.e.f18347e0;
        b85.e eVar = (b85.e) i95.n0.c(b85.e.class);
        if (!(eVar != null && eVar.hasEvilConfig())) {
            return false;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        for (com.tencent.mm.accessibility.core.provider.Provider provider : providers) {
            if ((provider.getAuthority() & 16) == 16) {
                kotlin.jvm.internal.o.d(stackTrace);
                if (provider.onInterceptTouchEvent(v17, motionEvent, stackTrace)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void onMockInflate(android.view.View view) {
        com.tencent.mm.accessibility.base.ViewTag tagData;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.accessibility.uitl.AccUtil accUtil = com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE;
        if (accUtil.isAccessibilityEnabled() || accUtil.isEnableAccEnableForced()) {
            dispatchViewInflate(view);
        }
        if (accUtil.canExpand() && com.tencent.mm.sdk.platformtools.u3.e() && (tagData = com.tencent.mm.accessibility.core.ViewTagManager.INSTANCE.getTagData(view)) != null) {
            java.lang.Boolean havenExpand = tagData.getHavenExpand();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (kotlin.jvm.internal.o.b(havenExpand, bool)) {
                return;
            }
            tagData.setHavenExpand(bool);
            com.tencent.mm.accessibility.core.area.AreaProvider.INSTANCE.dealOnViewInflateAsync(view);
        }
    }

    public final void unbindConfig(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.Iterator<T> it = providers.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.accessibility.core.provider.Provider) it.next()).unbindConfig(activity);
        }
        com.tencent.mm.accessibility.core.area.AreaProvider.INSTANCE.unbindConfig(activity);
    }
}
