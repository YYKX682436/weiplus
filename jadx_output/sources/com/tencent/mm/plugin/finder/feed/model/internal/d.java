package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.h f107964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f107965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f107966f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107967g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107968h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.finder.feed.model.internal.h hVar, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f107964d = hVar;
        this.f107965e = y0Var;
        this.f107966f = s3Var;
        this.f107967g = lVar;
        this.f107968h = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f107964d.convertOpToReason(this.f107965e, this.f107966f);
        yz5.l lVar = this.f107967g;
        if (lVar != null) {
            lVar.invoke(this.f107968h);
        }
        return jz5.f0.f302826a;
    }
}
