package com.tencent.mm.accessibility.uitl;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R)\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001b\u0012\u0004\u0012\u00020\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0016\u0010 \u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0012R\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0013\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0019R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0013\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0013\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010\u0019R\"\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0013\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010\u0019¨\u0006-"}, d2 = {"Lcom/tencent/mm/accessibility/uitl/AccUtil;", "", "", "enable", "Ljz5/f0;", "notifyTouchExplorationChange", "isAccessibilityEnabled", "isCoolAssistRunning", "isEnableCallbackRealtime", "isEnableNodeInfoCache", "canPreDeal", "canExpand", "isEnableShowTextLinespace", "", "TAG", "Ljava/lang/String;", "", "CACHE_TIME", "J", "Z", "lastTimeEnabled", "value", "isTouchExplorationEnable", "()Z", "setTouchExplorationEnable", "(Z)V", "Le75/g;", "Le75/a;", "listenersOwner", "Le75/g;", "getListenersOwner", "()Le75/g;", "lastTimeCoolAssist", "isGlobalDisableAcc", "setGlobalDisableAcc", "isEnableExpand", "setEnableExpand", "isEnableAccEnableForced", "setEnableAccEnableForced", "isDisableAccClick", "setDisableAccClick", "isDisableAllIllegalActon", "setDisableAllIllegalActon", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class AccUtil {
    private static final long CACHE_TIME = 3000;
    public static final java.lang.String TAG = "MicroMsg.Acc.AccUtil";
    private static boolean isAccessibilityEnabled;
    private static boolean isCoolAssistRunning;
    private static boolean isDisableAccClick;
    private static boolean isDisableAllIllegalActon;
    private static boolean isEnableAccEnableForced;
    private static boolean isGlobalDisableAcc;
    private static boolean isTouchExplorationEnable;
    private static long lastTimeCoolAssist;
    private static long lastTimeEnabled;
    public static final com.tencent.mm.accessibility.uitl.AccUtil INSTANCE = new com.tencent.mm.accessibility.uitl.AccUtil();
    private static final e75.g listenersOwner = new e75.g() { // from class: com.tencent.mm.accessibility.uitl.AccUtil$listenersOwner$1
        @Override // e75.g
        public java.lang.String getLogTag() {
            return com.tencent.mm.accessibility.uitl.AccUtil.TAG;
        }
    };
    private static boolean isEnableExpand = true;
    public static final int $stable = 8;

    private AccUtil() {
    }

    private final void notifyTouchExplorationChange(boolean z17) {
        listenersOwner.notify(java.lang.Boolean.valueOf(z17));
        com.tencent.mars.xlog.Log.i(TAG, "notifyTouchExplorationChange " + z17 + ' ');
    }

    public final boolean canExpand() {
        return isEnableExpand;
    }

    public final boolean canPreDeal() {
        return (isAccessibilityEnabled() || isEnableAccEnableForced || canExpand()) && !isGlobalDisableAcc;
    }

    public final e75.g getListenersOwner() {
        return listenersOwner;
    }

    public final boolean isAccessibilityEnabled() {
        if (com.tencent.mm.sdk.platformtools.s9.f192974b) {
            return true;
        }
        if (((com.tencent.mm.accessibility.feature.IAccExptService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccExptService.class)).getIsForceStrike()) {
            return false;
        }
        if (isTouchExplorationEnable()) {
            isAccessibilityEnabled = true;
            return true;
        }
        if (java.lang.System.currentTimeMillis() - lastTimeEnabled < CACHE_TIME) {
            return isAccessibilityEnabled;
        }
        lastTimeEnabled = java.lang.System.currentTimeMillis();
        boolean hasAccServiceInWhiteList = ((com.tencent.mm.accessibility.feature.IAccExptService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccExptService.class)).hasAccServiceInWhiteList();
        isAccessibilityEnabled = hasAccServiceInWhiteList;
        if (hasAccServiceInWhiteList) {
            return true;
        }
        boolean isWhiteUser = ((com.tencent.mm.accessibility.feature.IAccExptService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccExptService.class)).getIsWhiteUser();
        isAccessibilityEnabled = isWhiteUser;
        return isWhiteUser;
    }

    public final boolean isCoolAssistRunning() {
        if (java.lang.System.currentTimeMillis() - lastTimeCoolAssist < CACHE_TIME) {
            return isCoolAssistRunning;
        }
        lastTimeCoolAssist = java.lang.System.currentTimeMillis();
        android.content.ContentResolver contentResolver = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("enabled_accessibility_services");
        arrayList.add(contentResolver);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        java.lang.String str = (java.lang.String) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/accessibility/uitl/AccUtil", "isCoolAssistRunning", "()Z", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        if (str != null) {
            android.text.TextUtils.SimpleStringSplitter simpleStringSplitter = new android.text.TextUtils.SimpleStringSplitter(':');
            simpleStringSplitter.setString(str);
            while (simpleStringSplitter.hasNext()) {
                java.lang.String next = simpleStringSplitter.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                if (r26.n0.B(next, "MMAccessibilityService", false)) {
                    isCoolAssistRunning = true;
                    return true;
                }
            }
        }
        isCoolAssistRunning = false;
        return false;
    }

    public final boolean isDisableAccClick() {
        return isDisableAccClick;
    }

    public final boolean isDisableAllIllegalActon() {
        return isDisableAllIllegalActon;
    }

    public final boolean isEnableAccEnableForced() {
        return isEnableAccEnableForced;
    }

    public final boolean isEnableCallbackRealtime() {
        return bm5.o1.f22719a.g(bm5.h0.RepairerConfig_AutoAccessibility_CallbackRealtime_Int, 0) == 1;
    }

    public final boolean isEnableExpand() {
        return isEnableExpand;
    }

    public final boolean isEnableNodeInfoCache() {
        return bm5.o1.f22719a.g(bm5.h0.RepairerConfig_AutoAccessibility_NodeCacheEnable_Int, 0) == 1;
    }

    public final boolean isEnableShowTextLinespace() {
        return true;
    }

    public final boolean isGlobalDisableAcc() {
        return isGlobalDisableAcc;
    }

    public boolean isTouchExplorationEnable() {
        ((com.tencent.mm.accessibility.feature.IAccessibilityService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccessibilityService.class)).triggerOnCreate();
        return isTouchExplorationEnable;
    }

    public final void setDisableAccClick(boolean z17) {
        isDisableAccClick = z17;
    }

    public final void setDisableAllIllegalActon(boolean z17) {
        isDisableAllIllegalActon = z17;
    }

    public final void setEnableAccEnableForced(boolean z17) {
        isEnableAccEnableForced = z17;
    }

    public final void setEnableExpand(boolean z17) {
        isEnableExpand = z17;
    }

    public final void setGlobalDisableAcc(boolean z17) {
        isGlobalDisableAcc = z17;
    }

    public void setTouchExplorationEnable(boolean z17) {
        isTouchExplorationEnable = z17;
        notifyTouchExplorationChange(z17);
    }
}
