package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class te implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f87129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f87130b;

    public te(o25.y1 y1Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f87129a = y1Var;
        this.f87130b = k0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        if (menuItem instanceof db5.h4) {
            ((com.tencent.mm.pluginsdk.forward.m) this.f87129a).cj(this.f87130b, (db5.h4) menuItem, 3);
        }
    }
}
