package com.tencent.mm.accessibility.core.area;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class ExpandTouchDelegate$Companion$layoutChangeListener$1$onLayoutChange$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ android.view.View $v;
    final /* synthetic */ com.tencent.mm.accessibility.core.area.ExpandTouchDelegate$Companion$layoutChangeListener$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandTouchDelegate$Companion$layoutChangeListener$1$onLayoutChange$1(android.view.View view, com.tencent.mm.accessibility.core.area.ExpandTouchDelegate$Companion$layoutChangeListener$1 expandTouchDelegate$Companion$layoutChangeListener$1) {
        super(0);
        this.$v = view;
        this.this$0 = expandTouchDelegate$Companion$layoutChangeListener$1;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m53invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m53invoke() {
        if (!com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.canExpand()) {
            this.$v.removeOnLayoutChangeListener(this.this$0);
        }
        if (this.$v.getVisibility() != 8 && this.$v.getVisibility() != 4 && this.$v.isShown()) {
            com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE.setDelegate(this.$v);
            return;
        }
        com.tencent.mm.accessibility.base.ViewTag tagData = com.tencent.mm.accessibility.core.ViewTagManager.INSTANCE.getTagData(this.$v);
        if (tagData != null) {
            tagData.setTouchDelegate(null);
        }
    }
}
