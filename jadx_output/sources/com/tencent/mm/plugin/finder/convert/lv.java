package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class lv extends com.tencent.mm.plugin.finder.feed.model.n1 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$fetchContent$loader$1 f103949f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.vd6 f103950g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$fetchContent$loader$1 finderStreamCardAlbumConvert$fetchContent$loader$1, r45.vd6 vd6Var) {
        super(finderStreamCardAlbumConvert$fetchContent$loader$1);
        this.f103949f = finderStreamCardAlbumConvert$fetchContent$loader$1;
        this.f103950g = vd6Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.n1, com.tencent.mm.plugin.finder.feed.model.l1, com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$fetchContent$loader$1 finderStreamCardAlbumConvert$fetchContent$loader$1 = this.f103949f;
        r45.qt2 contextObj = finderStreamCardAlbumConvert$fetchContent$loader$1.getContextObj();
        r45.z91 z91Var = finderStreamCardAlbumConvert$fetchContent$loader$1.f107426q;
        if (z91Var == null) {
            z91Var = new r45.z91();
        }
        db2.t0 t0Var = new db2.t0(this.f103950g, contextObj, z91Var);
        t0Var.f228162z = 0;
        return t0Var;
    }
}
