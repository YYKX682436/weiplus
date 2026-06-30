package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes4.dex */
public final class c0 extends com.tencent.mm.pluginsdk.ui.span.a0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f95300e;

    public c0(android.view.View.OnClickListener onClickListener) {
        this.f95300e = onClickListener;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.a0
    public void a(android.view.View view, r35.m3 m3Var) {
        this.f95300e.onClick(view);
    }
}
