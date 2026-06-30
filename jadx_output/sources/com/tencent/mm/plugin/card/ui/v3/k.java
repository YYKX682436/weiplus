package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.card.ui.v3.k f95338d = new com.tencent.mm.plugin.card.ui.v3.k();

    public k() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.bvx);
        android.widget.TextView textView2 = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.bvr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) textView.getText());
        sb6.append((java.lang.Object) textView2.getText());
        return sb6.toString();
    }
}
