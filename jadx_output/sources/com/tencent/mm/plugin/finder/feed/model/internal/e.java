package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.h f107972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.t0 f107973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f107974f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f107975g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f107976h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107977i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107978m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.finder.feed.model.internal.h hVar, com.tencent.mm.plugin.finder.feed.model.internal.t0 t0Var, java.util.List list, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, ym5.s3 s3Var, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f107972d = hVar;
        this.f107973e = t0Var;
        this.f107974f = list;
        this.f107975g = baseFeedLoader;
        this.f107976h = s3Var;
        this.f107977i = lVar;
        this.f107978m = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.internal.h hVar = this.f107972d;
        com.tencent.mm.plugin.finder.feed.model.internal.t0 t0Var = this.f107973e;
        if (hVar.calculateIndex(t0Var) != -1) {
            com.tencent.mm.plugin.finder.feed.model.internal.u0 mergeInsertData = hVar.mergeInsertData(this.f107974f, hVar.calculateIndex(t0Var));
            this.f107975g.getDispatcher().d(mergeInsertData.f108052a, mergeInsertData.f108053b);
            ym5.s3 s3Var = this.f107976h;
            s3Var.f463519d = mergeInsertData;
            s3Var.f463523h = mergeInsertData.f108053b;
            yz5.l lVar = this.f107977i;
            if (lVar != null) {
                lVar.invoke(this.f107978m);
            }
        }
        return jz5.f0.f302826a;
    }
}
