package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class f extends db0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.h f67332a;

    public f(com.tencent.mm.feature.openmsg.uic.h hVar) {
        this.f67332a = hVar;
    }

    @Override // l81.e1
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgByAppBrandClickForOpenMaterialUIC", "onStartAppBrandUI");
        this.f67332a.getActivity().finish();
    }
}
