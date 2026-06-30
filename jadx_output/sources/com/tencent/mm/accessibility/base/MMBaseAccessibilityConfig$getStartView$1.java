package com.tencent.mm.accessibility.base;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Ljz5/f0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class MMBaseAccessibilityConfig$getStartView$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ kotlin.jvm.internal.c0 $hasFound;
    final /* synthetic */ kotlin.jvm.internal.h0 $target;
    final /* synthetic */ com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMBaseAccessibilityConfig$getStartView$1(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig mMBaseAccessibilityConfig, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.$hasFound = c0Var;
        this.this$0 = mMBaseAccessibilityConfig;
        this.$target = h0Var;
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((android.view.View) obj);
        return jz5.f0.f302826a;
    }

    public final void invoke(android.view.View it) {
        java.lang.Integer layoutId;
        java.lang.Integer layoutId2;
        kotlin.jvm.internal.o.g(it, "it");
        if (this.$hasFound.f310112d) {
            return;
        }
        java.util.List<java.lang.Integer> list = this.this$0.getStartViewRootMap$plugin_autoaccessibility_release().get(java.lang.Integer.valueOf(it.getId()));
        if (list != null) {
            com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig mMBaseAccessibilityConfig = this.this$0;
            kotlin.jvm.internal.h0 h0Var = this.$target;
            kotlin.jvm.internal.c0 c0Var = this.$hasFound;
            java.util.Iterator<T> it6 = list.iterator();
            if (it6.hasNext()) {
                int intValue = ((java.lang.Number) it6.next()).intValue();
                layoutId2 = mMBaseAccessibilityConfig.getLayoutId(it);
                if (layoutId2 != null && layoutId2.intValue() == intValue) {
                    h0Var.f310123d = it;
                    c0Var.f310112d = true;
                    return;
                }
                return;
            }
        }
        int id6 = it.getId();
        java.lang.Integer startViewId = this.this$0.getStartViewId();
        if (startViewId != null && id6 == startViewId.intValue()) {
            layoutId = this.this$0.getLayoutId(it);
            if (kotlin.jvm.internal.o.b(layoutId, this.this$0.getStartViewLayoutId())) {
                this.$target.f310123d = it;
                this.$hasFound.f310112d = true;
            }
        }
    }
}
