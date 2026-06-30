package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class b8 extends com.tencent.mm.plugin.fav.ui.c8 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f100519d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f100520e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f100521f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.dws);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f100519d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.dwt);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f100520e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f484316du4);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f100521f = findViewById3;
    }
}
