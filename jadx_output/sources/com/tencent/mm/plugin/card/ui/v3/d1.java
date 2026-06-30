package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f95308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(java.lang.StringBuilder sb6) {
        super(1);
        this.f95308d = sb6;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View labelView = (android.view.View) obj;
        kotlin.jvm.internal.o.g(labelView, "labelView");
        if (labelView instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) labelView;
            if (textView.isShown()) {
                this.f95308d.append(textView.getText());
            }
        }
        return jz5.f0.f302826a;
    }
}
