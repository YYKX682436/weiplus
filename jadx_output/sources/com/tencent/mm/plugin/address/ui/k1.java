package com.tencent.mm.plugin.address.ui;

/* loaded from: classes14.dex */
public final class k1 implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.l1 f74572d;

    public k1(com.tencent.mm.plugin.address.ui.l1 l1Var) {
        this.f74572d = l1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View v17, android.view.WindowInsets insets) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(insets, "insets");
        android.view.View view = this.f74572d.f281401g;
        if (view != null) {
            view.setPadding(insets.getSystemWindowInsetLeft(), 0, insets.getSystemWindowInsetRight(), 0);
        }
        return insets;
    }
}
