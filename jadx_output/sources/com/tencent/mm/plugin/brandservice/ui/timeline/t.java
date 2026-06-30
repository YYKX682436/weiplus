package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes.dex */
public final class t implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f94507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f94508e;

    public t(java.util.List list, yz5.a aVar) {
        this.f94507d = list;
        this.f94508e = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        ((com.tencent.mm.plugin.brandservice.ui.timeline.a) this.f94507d.get(i17)).f94096b.invoke();
        this.f94508e.invoke();
    }
}
