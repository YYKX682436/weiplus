package com.tencent.mm.accessibility.core.area;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class ExpandTouchDelegate$Companion$expand$2 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ android.view.View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandTouchDelegate$Companion$expand$2(android.view.View view) {
        super(0);
        this.$view = view;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m52invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m52invoke() {
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate$Companion$layoutChangeListener$1 expandTouchDelegate$Companion$layoutChangeListener$1;
        android.view.View view = this.$view;
        expandTouchDelegate$Companion$layoutChangeListener$1 = com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.layoutChangeListener;
        view.addOnLayoutChangeListener(expandTouchDelegate$Companion$layoutChangeListener$1);
    }
}
