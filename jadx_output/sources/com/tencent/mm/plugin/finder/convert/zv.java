package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class zv extends com.tencent.mm.plugin.finder.feed.model.n1 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$preloadContent$1$loader$1 f105127f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.vd6 f105128g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$preloadContent$1$loader$1 finderStreamCardAlbumConvert$preloadContent$1$loader$1, r45.vd6 vd6Var) {
        super(finderStreamCardAlbumConvert$preloadContent$1$loader$1);
        this.f105127f = finderStreamCardAlbumConvert$preloadContent$1$loader$1;
        this.f105128g = vd6Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.n1, com.tencent.mm.plugin.finder.feed.model.l1, com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$preloadContent$1$loader$1 finderStreamCardAlbumConvert$preloadContent$1$loader$1 = this.f105127f;
        r45.qt2 contextObj = finderStreamCardAlbumConvert$preloadContent$1$loader$1.getContextObj();
        r45.z91 z91Var = finderStreamCardAlbumConvert$preloadContent$1$loader$1.f107426q;
        if (z91Var == null) {
            z91Var = new r45.z91();
        }
        db2.t0 t0Var = new db2.t0(this.f105128g, contextObj, z91Var);
        t0Var.f228162z = 0;
        return t0Var;
    }
}
