package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002J'\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/ContentDescProvider;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Ljz5/f0;", "dealNodeInfo", "", "getContentDesc", "", "outRootView", "", "findDescList", "(Landroid/view/View;[Landroid/view/View;)Ljava/lang/Object;", "", "getAuthority", "TAG", "Ljava/lang/String;", "curConfigName", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class ContentDescProvider extends com.tencent.mm.accessibility.core.provider.Provider {
    public static final int $stable;
    public static final com.tencent.mm.accessibility.core.provider.ContentDescProvider INSTANCE;
    public static final java.lang.String TAG = "MicroMsg.Acc.ContentDescProvider";
    private static java.lang.String curConfigName;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "view", "Landroid/view/View;", "config", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.provider.ContentDescProvider$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.p {
        public static final com.tencent.mm.accessibility.core.provider.ContentDescProvider.AnonymousClass1 INSTANCE = new com.tencent.mm.accessibility.core.provider.ContentDescProvider.AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // yz5.p
        public final java.util.List<java.lang.Integer> invoke(android.view.View view, com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig config) {
            java.util.Set<java.lang.Integer> keySet;
            kotlin.jvm.internal.o.g(view, "view");
            kotlin.jvm.internal.o.g(config, "config");
            java.util.Map<java.lang.Integer, java.lang.Object> map = config.getViewRootDescMap$plugin_autoaccessibility_release().get(java.lang.Integer.valueOf(view.getId()));
            if (map == null || (keySet = map.keySet()) == null) {
                return null;
            }
            return kz5.n0.S0(keySet);
        }
    }

    static {
        com.tencent.mm.accessibility.core.provider.ContentDescProvider contentDescProvider = new com.tencent.mm.accessibility.core.provider.ContentDescProvider();
        INSTANCE = contentDescProvider;
        curConfigName = "";
        contentDescProvider.addRootIdMapper$plugin_autoaccessibility_release(com.tencent.mm.accessibility.core.provider.ContentDescProvider.AnonymousClass1.INSTANCE);
        $stable = 8;
    }

    private ContentDescProvider() {
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo nodeInfo) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(nodeInfo, "nodeInfo");
        java.lang.String contentDesc = getContentDesc(view);
        if (contentDesc != null) {
            nodeInfo.setContentDescription(contentDesc);
        }
    }

    public final java.lang.Object findDescList(android.view.View view, android.view.View[] outRootView) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outRootView, "outRootView");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        getConfig(view, new com.tencent.mm.accessibility.core.provider.ContentDescProvider$findDescList$1(view, outRootView, h0Var));
        return h0Var.f310123d;
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public int getAuthority() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x024b, code lost:
    
        if (r0 != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fc, code lost:
    
        if (r3 != null) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getContentDesc(android.view.View r19) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.accessibility.core.provider.ContentDescProvider.getContentDesc(android.view.View):java.lang.String");
    }
}
