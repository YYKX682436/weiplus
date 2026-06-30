package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class t9 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f110559d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f110560e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f110561f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(com.tencent.mm.plugin.finder.feed.ui.v9 v9Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.orj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f110559d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.ord);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f110560e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.ork);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f110561f = (android.widget.TextView) findViewById3;
    }
}
