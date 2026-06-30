package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.gallery.u f111406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f111407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f111408f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader f111409g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f111410h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f111411i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.finder.gallery.u uVar, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader finderGalleryLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f111406d = uVar;
        this.f111407e = y0Var;
        this.f111408f = s3Var;
        this.f111409g = finderGalleryLoader;
        this.f111410h = lVar;
        this.f111411i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.gallery.u uVar = this.f111406d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f111407e;
        ym5.s3 s3Var = this.f111408f;
        uVar.convertOpToReason(y0Var, s3Var);
        this.f111409g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f111410h;
        if (lVar != null) {
            lVar.invoke(this.f111411i);
        }
        return jz5.f0.f302826a;
    }
}
