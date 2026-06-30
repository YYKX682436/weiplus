package com.tencent.mm.magicbrush.plugin.scl.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/magicbrush/plugin/scl/jsapi/n;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/magicbrush/plugin/scl/jsapi/MBJsApiSetCanvasStatus$IPCData;", "Ljz5/f0;", "<init>", "()V", "mb-plugin-scl-impl_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
final class n implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        jz5.f0 f0Var;
        com.tencent.mm.magicbrush.plugin.scl.jsapi.MBJsApiSetCanvasStatus$IPCData mBJsApiSetCanvasStatus$IPCData = (com.tencent.mm.magicbrush.plugin.scl.jsapi.MBJsApiSetCanvasStatus$IPCData) obj;
        if (mBJsApiSetCanvasStatus$IPCData != null) {
            fq0.x Ai = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(mBJsApiSetCanvasStatus$IPCData.f68651d);
            if (Ai != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindWithCanvasId ");
                sb6.append(Ai);
                sb6.append(' ');
                int i17 = mBJsApiSetCanvasStatus$IPCData.f68652e;
                sb6.append(i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclFrameSet.SCL", sb6.toString());
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = Ai.f265481e;
                copyOnWriteArraySet.add(valueOf);
                hq0.e0 e0Var = Ai.f265479c;
                if (e0Var != null) {
                    hq0.i0 i0Var = e0Var.f282988i;
                    com.tencent.mars.xlog.Log.i(i0Var.getTag(), "notifyCanvasAndFrameSet " + Ai + " ids:" + fq0.a0.a(copyOnWriteArraySet) + " canvasViews size:" + i0Var.f282998m.f283028a.size());
                    d75.b.g(new hq0.d0(copyOnWriteArraySet, i0Var, Ai));
                }
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w("MBJsApiSetCanvasStatus", "frameSet not found!");
            }
        }
    }
}
