package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class l extends db0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.n f67345a;

    public l(com.tencent.mm.feature.openmsg.uic.n nVar) {
        this.f67345a = nVar;
    }

    @Override // l81.e1
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgByAppBrandClickUIC", "onStartAppBrandUI");
        this.f67345a.getActivity().finish();
    }
}
