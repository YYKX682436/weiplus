package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class v4 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f98523d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f98524e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f98525f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.ves);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f98523d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.veq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f98524e = findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.f485157u02);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f98525f = (android.widget.TextView) findViewById3;
    }
}
