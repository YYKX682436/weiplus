package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class kb implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f103819c;

    public kb(com.tencent.mm.plugin.finder.convert.qe qeVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17) {
        this.f103817a = qeVar;
        this.f103818b = baseFinderFeed;
        this.f103819c = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public final void a() {
        com.tencent.mm.plugin.finder.report.x3.f125432a.c(this.f103817a.f104358f.getF122643d(), "button_cancel", this.f103818b.getItemId(), this.f103819c);
    }
}
