package com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/magicbrush/plugin/scl/jsapi/touch/d;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/magicbrush/plugin/scl/jsapi/touch/MBJsApiSetGestureRects$IPCData;", "Lcom/tencent/mm/magicbrush/plugin/scl/jsapi/touch/MBJsApiSetGestureRects$IPCCallback;", "<init>", "()V", "mb-plugin-scl-impl_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
final class d implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.C10864xb81f9ece c10864xb81f9ece = (com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.C10864xb81f9ece) obj;
        if (c10864xb81f9ece != null) {
            fq0.z zVar = (fq0.z) ((gq0.r) i95.n0.c(gq0.r.class));
            java.lang.String str = c10864xb81f9ece.f150202d;
            fq0.x Ai = zVar.Ai(str);
            if (Ai != null) {
                java.lang.String viewId = str + '-' + c10864xb81f9ece.f150203e;
                com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.c cVar = new com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.c(rVar);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
                java.lang.String rects = c10864xb81f9ece.f150204f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rects, "rects");
                ym5.a1.f(new fq0.u(viewId, rects, Ai, cVar));
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                if (rVar != null) {
                    rVar.a(new com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.C10863xd9b89d69(-1L, "frameSet not found!"));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiSetGestureRects", "frameSet not found!");
            }
        }
    }
}
