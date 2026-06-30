package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/jsapi/a0;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "Ljz5/f0;", "a", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "_req", "handleRequest", "d", "Ljava/lang/String;", "TAG", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class a0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String TAG = "MicroMsg.AppBrand.FunctionalDirectApi.ProxyTask";

    private final void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.TAG, "errorReturn reason:" + str);
        m50420x7b736e5c(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.C12404xdf3d1c61 c12404xdf3d1c61 = abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.C12404xdf3d1c61 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.C12404xdf3d1c61) abstractC11887x3610e10c : null;
        if (c12404xdf3d1c61 == null) {
            a("Invalid ProxyRequest");
            return;
        }
        android.util.SparseArray sparseArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.a.f167131a;
        android.util.SparseArray sparseArray2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.a.f167131a;
        int functionHash = c12404xdf3d1c61.getFunctionHash();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sparseArray2, "<this>");
        java.lang.Object obj = sparseArray2.get(functionHash);
        if (obj != null) {
            sparseArray2.remove(functionHash);
        }
        yz5.l lVar = (yz5.l) obj;
        if (lVar == null) {
            a("Invalid functionHash");
            return;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a, "getActivityContext(...)");
        lVar.mo146xb9724478(m50421x3c6fed6a);
    }
}
