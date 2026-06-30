package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.card.ui.v3.e1 f95315d = new com.tencent.mm.plugin.card.ui.v3.e1();

    public e1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.bwc);
        android.widget.TextView textView2 = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.f483733bw5);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) it.findViewById(com.tencent.mm.R.id.bw9);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(textView.getText());
        sb6.append(textView2.getText());
        kotlin.jvm.internal.o.d(viewGroup);
        com.tencent.mm.accessibility.base.MapExpandKt.visitChild(viewGroup, new com.tencent.mm.plugin.card.ui.v3.d1(sb6));
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
