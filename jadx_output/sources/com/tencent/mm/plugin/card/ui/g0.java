package com.tencent.mm.plugin.card.ui;

/* loaded from: classes14.dex */
public class g0 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.b0 f95008a;

    public g0(com.tencent.mm.plugin.card.ui.b0 b0Var) {
        this.f95008a = b0Var;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i65.a.h(this.f95008a.f94936e, com.tencent.mm.R.dimen.f479646bl));
    }
}
