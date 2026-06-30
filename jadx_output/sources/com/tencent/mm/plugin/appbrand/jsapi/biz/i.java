package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/biz/i;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$BizPoiTaskRequest;", "Lcom/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$BizPoiResponse;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class i implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskRequest data = (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskRequest) obj;
        kotlin.jvm.internal.o.g(data, "data");
        dw5.p pVar = new dw5.p();
        pVar.f244404d = data.f79912d;
        boolean[] zArr = pVar.f244407g;
        zArr[1] = true;
        dw5.g gVar = new dw5.g();
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo jsApiChooseBizPoi$BizPoiGpsInfo = data.f79913e;
        gVar.f244358e = (float) jsApiChooseBizPoi$BizPoiGpsInfo.f79906d;
        boolean[] zArr2 = gVar.f244359f;
        zArr2[2] = true;
        gVar.f244357d = (float) jsApiChooseBizPoi$BizPoiGpsInfo.f79907e;
        zArr2[1] = true;
        pVar.f244405e = gVar;
        zArr[2] = true;
        for (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo jsApiChooseBizPoi$BizPoiGpsInfo2 : data.f79914f) {
            dw5.g gVar2 = new dw5.g();
            gVar2.f244358e = (float) jsApiChooseBizPoi$BizPoiGpsInfo2.f79906d;
            boolean[] zArr3 = gVar2.f244359f;
            zArr3[2] = true;
            gVar2.f244357d = (float) jsApiChooseBizPoi$BizPoiGpsInfo2.f79907e;
            zArr3[1] = true;
            pVar.f244406f.add(gVar2);
            zArr[3] = true;
        }
        rv.k3 k3Var = (rv.k3) i95.n0.c(rv.k3.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.plugin.appbrand.jsapi.biz.g gVar3 = new com.tencent.mm.plugin.appbrand.jsapi.biz.g(rVar);
        com.tencent.mm.plugin.appbrand.jsapi.biz.h hVar = new com.tencent.mm.plugin.appbrand.jsapi.biz.h(rVar);
        vw.m2 m2Var = (vw.m2) k3Var;
        m2Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        m2Var.ij();
        kotlinx.coroutines.l.d(m2Var.f440685e, null, null, new vw.c1(pVar, context, hVar, gVar3, null), 3, null);
    }
}
