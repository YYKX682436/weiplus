package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/OrderProvider;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Ljz5/f0;", "dealOnViewInflateAsync", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class OrderProvider extends com.tencent.mm.accessibility.core.provider.Provider {
    public static final int $stable = 0;
    public static final com.tencent.mm.accessibility.core.provider.OrderProvider INSTANCE = new com.tencent.mm.accessibility.core.provider.OrderProvider();
    public static final java.lang.String TAG = "MicroMsg.Acc.OrderProvider";

    private OrderProvider() {
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealOnViewInflateAsync(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        getConfig(view, new com.tencent.mm.accessibility.core.provider.OrderProvider$dealOnViewInflateAsync$1(view));
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public int getAuthority() {
        return 2;
    }
}
