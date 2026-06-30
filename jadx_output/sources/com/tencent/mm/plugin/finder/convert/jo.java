package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes3.dex */
public final class jo extends android.view.ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        int a17 = ym5.x.a(view.getContext(), 2.0f);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + a17, a17);
    }
}
