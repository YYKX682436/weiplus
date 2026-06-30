package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes3.dex */
public final class pw extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104297a;

    public pw(in5.s0 s0Var) {
        this.f104297a = s0Var;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f104297a.f293121e.getResources().getDimension(com.tencent.mm.R.dimen.f480420xf));
    }
}
