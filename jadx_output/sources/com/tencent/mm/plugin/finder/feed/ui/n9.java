package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class n9 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f110332d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f110333e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(com.tencent.mm.plugin.finder.feed.ui.o9 o9Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.a_4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f110332d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.kbq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f110333e = (android.widget.TextView) findViewById2;
    }
}
