package com.tencent.mm.accessibility.core.area;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/accessibility/core/area/ViewTouchAreaExpander;", "", "Landroid/view/View;", "view", "", "eLeft", "eTop", "eRight", "eBottom", "Ljz5/f0;", "expand", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class ViewTouchAreaExpander {
    public static final int $stable = 0;
    public static final com.tencent.mm.accessibility.core.area.ViewTouchAreaExpander INSTANCE = new com.tencent.mm.accessibility.core.area.ViewTouchAreaExpander();
    public static final java.lang.String TAG = "MicroMsg.Acc.ViewTouchAreaExpander";

    private ViewTouchAreaExpander() {
    }

    public final void expand(android.view.View view, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(view, "view");
        long nanoTime = java.lang.System.nanoTime();
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion.expand$default(com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE, view, i17, i18, i19, i27, false, 32, null);
        com.tencent.mars.xlog.Log.i(TAG, "expand: view(" + com.tencent.mm.accessibility.uitl.IdUtil.INSTANCE.getName(view.getId()) + ") cost " + (java.lang.System.nanoTime() - nanoTime));
    }
}
