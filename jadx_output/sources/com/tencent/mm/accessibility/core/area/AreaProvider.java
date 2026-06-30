package com.tencent.mm.accessibility.core.area;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0002J\b\u0010\u0015\u001a\u00020\nH\u0016R\u0014\u0010\u0017\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/accessibility/core/area/AreaProvider;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "", "isDisExpand", "Ljz5/f0;", "defaultDealExpand", "", "findConfigRect", "", "dp", "getPx", "px", "getDp", "dealOnViewInflateAsync", "expand", "getDefaultViewExpand", "host", "Landroid/view/accessibility/AccessibilityNodeProvider;", "buildAccessibilityProvider", "getAuthority", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class AreaProvider extends com.tencent.mm.accessibility.core.provider.Provider {
    public static final int $stable = 0;
    public static final com.tencent.mm.accessibility.core.area.AreaProvider INSTANCE = new com.tencent.mm.accessibility.core.area.AreaProvider();
    public static final java.lang.String TAG = "MicroMsg.Acc.AreaProvider";

    private AreaProvider() {
    }

    private final void defaultDealExpand(android.view.View view) {
        int[] defaultViewExpand = getDefaultViewExpand(view);
        if (defaultViewExpand == null) {
            return;
        }
        logMsg(TAG, view, "expand " + java.util.Arrays.toString(defaultViewExpand) + " defaultDealExpand");
        com.tencent.mm.accessibility.core.area.ViewTouchAreaExpander.INSTANCE.expand(view, defaultViewExpand[0], defaultViewExpand[1], defaultViewExpand[2], defaultViewExpand[3]);
    }

    private final int[] findConfigRect(android.view.View view) {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        getConfig(view, new com.tencent.mm.accessibility.core.area.AreaProvider$findConfigRect$1(view, h0Var));
        return (int[]) h0Var.f310123d;
    }

    private final int getDp(int px6) {
        return i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, px6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPx(int dp6) {
        return i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, dp6);
    }

    private final boolean isDisExpand(android.view.View view) {
        return getConfig(view, new com.tencent.mm.accessibility.core.area.AreaProvider$isDisExpand$1(view));
    }

    public final android.view.accessibility.AccessibilityNodeProvider buildAccessibilityProvider(android.view.View host) {
        kotlin.jvm.internal.o.g(host, "host");
        if (isDisExpand(host) || !com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.canExpand()) {
            return null;
        }
        int[] findConfigRect = findConfigRect(host);
        if (findConfigRect == null && (findConfigRect = getDefaultViewExpand(host)) == null) {
            return null;
        }
        return new com.tencent.mm.accessibility.core.area.VisualAreaNodeProvider(host, findConfigRect[0], findConfigRect[1], findConfigRect[2], findConfigRect[3]);
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealOnViewInflateAsync(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        if (com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.canExpand()) {
            if (view.isClickable() || view.isLongClickable()) {
                expand(view);
            }
        }
    }

    public final void expand(android.view.View view) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(view, "view");
        if (view.getVisibility() == 0 && !isDisExpand(view)) {
            int[] findConfigRect = findConfigRect(view);
            if (findConfigRect != null) {
                com.tencent.mm.accessibility.core.area.ViewTouchAreaExpander.INSTANCE.expand(view, findConfigRect[0], findConfigRect[1], findConfigRect[2], findConfigRect[3]);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                defaultDealExpand(view);
            }
        }
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public int getAuthority() {
        return com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.canExpand() ? 2 : 0;
    }

    public final int[] getDefaultViewExpand(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getHitRect(rect);
        int[] iArr = new int[4];
        for (int i17 = 0; i17 < 4; i17++) {
            iArr[i17] = 0;
        }
        int dp6 = getDp(rect.width());
        int dp7 = getDp(rect.height());
        if (dp6 < 44) {
            int i18 = (44 - dp6) / 2;
            iArr[0] = getPx(i18);
            iArr[2] = getPx(i18);
        }
        if (dp7 < 44) {
            int i19 = (44 - dp7) / 2;
            iArr[1] = getPx(i19);
            iArr[3] = getPx(i19);
        }
        for (int i27 = 0; i27 < 4; i27++) {
            if (iArr[i27] != 0) {
                return iArr;
            }
        }
        return null;
    }
}
