package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class b30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c30 f106344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f106345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f106346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader f106347g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f106348h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f106349i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(com.tencent.mm.plugin.finder.feed.c30 c30Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader nativeDramaGridLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f106344d = c30Var;
        this.f106345e = y0Var;
        this.f106346f = s3Var;
        this.f106347g = nativeDramaGridLoader;
        this.f106348h = lVar;
        this.f106349i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.c30 c30Var = this.f106344d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f106345e;
        ym5.s3 s3Var = this.f106346f;
        c30Var.convertOpToReason(y0Var, s3Var);
        this.f106347g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f106348h;
        if (lVar != null) {
            lVar.invoke(this.f106349i);
        }
        return jz5.f0.f302826a;
    }
}
