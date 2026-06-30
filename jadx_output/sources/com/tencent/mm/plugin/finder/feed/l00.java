package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class l00 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f107264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.v00 f107265e;

    public l00(android.view.View view, com.tencent.mm.plugin.finder.feed.v00 v00Var) {
        this.f107264d = view;
        this.f107265e = v00Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f107264d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.finder.feed.v00 v00Var = this.f107265e;
        view.setPadding(0, com.tencent.mm.ui.bl.h(v00Var.f110846d) + (com.tencent.mm.ui.bl.a(v00Var.f110846d) / 2), 0, 0);
        return true;
    }
}
