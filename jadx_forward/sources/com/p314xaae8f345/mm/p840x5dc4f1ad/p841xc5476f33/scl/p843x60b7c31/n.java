package com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/magicbrush/plugin/scl/jsapi/n;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/magicbrush/plugin/scl/jsapi/MBJsApiSetCanvasStatus$IPCData;", "Ljz5/f0;", "<init>", "()V", "mb-plugin-scl-impl_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
final class n implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.C10861xec608ef2 c10861xec608ef2 = (com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.C10861xec608ef2) obj;
        if (c10861xec608ef2 != null) {
            fq0.x Ai = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(c10861xec608ef2.f150184d);
            if (Ai != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindWithCanvasId ");
                sb6.append(Ai);
                sb6.append(' ');
                int i17 = c10861xec608ef2.f150185e;
                sb6.append(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclFrameSet.SCL", sb6.toString());
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = Ai.f347014e;
                copyOnWriteArraySet.add(valueOf);
                hq0.e0 e0Var = Ai.f347012c;
                if (e0Var != null) {
                    hq0.i0 i0Var = e0Var.f364521i;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.m133876xb5887064(), "notifyCanvasAndFrameSet " + Ai + " ids:" + fq0.a0.a(copyOnWriteArraySet) + " canvasViews size:" + i0Var.f364531m.f364561a.size());
                    d75.b.g(new hq0.d0(copyOnWriteArraySet, i0Var, Ai));
                }
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MBJsApiSetCanvasStatus", "frameSet not found!");
            }
        }
    }
}
