package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class w4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.w4 f105961d = new com.tencent.mm.plugin.finder.extension.reddot.w4();

    public w4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ys.f fVar = (ys.f) i95.n0.c(ys.f.class);
        il0.h hVar = (il0.h) fVar;
        hVar.getClass();
        com.tencent.mars.xlog.Log.i("Kara.DiscoveryReddotPredict", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_discovery_reddot_predict_open", "0").equals("1")) {
            new il0.d();
            if (!((((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_6d2cb220", "details_json") == null || ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_6d2cb220", "discovery_reddot_model_tflite") == null) ? false : true)) {
                com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
                qVar.c("ilinkres_6d2cb220");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add("details_json");
                arrayList.add("discovery_reddot_model_tflite");
                qVar.f217548e.addAll(arrayList);
                qVar.f217550g[2] = true;
                ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Di(qVar, new il0.g(hVar));
            }
        }
        return fVar;
    }
}
