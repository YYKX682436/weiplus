package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class c6 extends com.tencent.mm.plugin.finder.storage.jj0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.p6 f109743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(com.tencent.mm.plugin.finder.feed.ui.p6 p6Var) {
        super(0, null, 3, null);
        this.f109743d = p6Var;
    }

    @Override // com.tencent.mm.plugin.finder.storage.jj0, com.tencent.mm.plugin.finder.storage.vj0
    public in5.s b(yz5.l lVar) {
        final com.tencent.mm.plugin.finder.storage.FinderStaggeredConfig$getItemConvertFactory$1 finderStaggeredConfig$getItemConvertFactory$1 = new com.tencent.mm.plugin.finder.storage.FinderStaggeredConfig$getItemConvertFactory$1(this, lVar);
        final com.tencent.mm.plugin.finder.feed.ui.p6 p6Var = this.f109743d;
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract$ViewCallback$config$1$getItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type != 2) {
                    if (type != 4) {
                        if (type != 3001) {
                            if (type != 3002) {
                                return finderStaggeredConfig$getItemConvertFactory$1.getItemConvert(type);
                            }
                        }
                    }
                    return new com.tencent.mm.plugin.finder.convert.kk(com.tencent.mm.plugin.finder.feed.ui.p6.this.f110399e.f109660q, this.f127017b);
                }
                return new com.tencent.mm.plugin.finder.convert.jk(com.tencent.mm.plugin.finder.feed.ui.p6.this.f110399e.f109660q, this.f127017b);
            }
        };
    }
}
