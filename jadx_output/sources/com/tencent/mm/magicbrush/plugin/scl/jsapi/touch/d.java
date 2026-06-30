package com.tencent.mm.magicbrush.plugin.scl.jsapi.touch;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/magicbrush/plugin/scl/jsapi/touch/d;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/magicbrush/plugin/scl/jsapi/touch/MBJsApiSetGestureRects$IPCData;", "Lcom/tencent/mm/magicbrush/plugin/scl/jsapi/touch/MBJsApiSetGestureRects$IPCCallback;", "<init>", "()V", "mb-plugin-scl-impl_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
final class d implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        jz5.f0 f0Var;
        com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCData mBJsApiSetGestureRects$IPCData = (com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCData) obj;
        if (mBJsApiSetGestureRects$IPCData != null) {
            fq0.z zVar = (fq0.z) ((gq0.r) i95.n0.c(gq0.r.class));
            java.lang.String str = mBJsApiSetGestureRects$IPCData.f68669d;
            fq0.x Ai = zVar.Ai(str);
            if (Ai != null) {
                java.lang.String viewId = str + '-' + mBJsApiSetGestureRects$IPCData.f68670e;
                com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.c cVar = new com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.c(rVar);
                kotlin.jvm.internal.o.g(viewId, "viewId");
                java.lang.String rects = mBJsApiSetGestureRects$IPCData.f68671f;
                kotlin.jvm.internal.o.g(rects, "rects");
                ym5.a1.f(new fq0.u(viewId, rects, Ai, cVar));
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                if (rVar != null) {
                    rVar.a(new com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCCallback(-1L, "frameSet not found!"));
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiSetGestureRects", "frameSet not found!");
            }
        }
    }
}
