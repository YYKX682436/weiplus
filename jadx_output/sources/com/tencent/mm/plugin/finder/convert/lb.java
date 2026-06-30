package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class lb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103910f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f103911g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(android.view.View view, com.tencent.mm.plugin.finder.convert.qe qeVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17) {
        super(0);
        this.f103908d = view;
        this.f103909e = qeVar;
        this.f103910f = baseFinderFeed;
        this.f103911g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f103908d.setTag(java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.finder.report.x3.f125432a.d(this.f103909e.f104358f.getF122643d(), this.f103910f.getItemId(), this.f103911g);
        return jz5.f0.f302826a;
    }
}
