package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class mc extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f110303d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f110304e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f110305f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f110303d = view;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.lgw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f110304e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.bub);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f110305f = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
    }
}
