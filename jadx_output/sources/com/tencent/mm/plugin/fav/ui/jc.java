package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class jc extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.nc f101210d;

    public jc(com.tencent.mm.plugin.fav.ui.nc ncVar) {
        this.f101210d = ncVar;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.ic(this));
    }
}
