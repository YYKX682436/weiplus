package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes7.dex */
public class d0 extends em1.t {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e0 f170182j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e0 e0Var, cl.m3 m3Var) {
        super(m3Var);
        this.f170182j = e0Var;
    }

    @Override // em1.d, cl.l3
    public void e(int i17, final cl.q0 q0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e0 e0Var = this.f170182j;
        if ((e0Var.f173914a.t3() instanceof ze.n) && ((ze.n) e0Var.f173914a.t3()).b2()) {
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8WorkerManagerWC", "post report coverage task for appId:%s workerId:%d", e0Var.f173914a.mo48798x74292566(), java.lang.Integer.valueOf(i17));
            q0Var.d("\n        ;(function() {\n            let data = (globalThis || {}).__coverage__ || new Function(\"return this\")().__coverage__;\n            if (typeof data === 'string' || typeof data === 'undefined') {\n                return data;\n            } else {\n                return JSON.stringify(data);\n            }\n        })();\n    ", new cl.j1() { // from class: com.tencent.mm.plugin.appbrand.service.d0$$a
                @Override // cl.j1
                public final void a(java.lang.String str, cl.k1 k1Var) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x1.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.d0.this.f170182j.f173914a, q0Var, str);
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(3L, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.V8WorkerManagerWC", "post report coverage task for appId:%s workerId:%d latch await failed:%s", e0Var.f173914a.mo48798x74292566(), java.lang.Integer.valueOf(i17), e17);
            } finally {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8WorkerManagerWC", "post report coverage task for appId:%s workerId:%d latch await end", e0Var.f173914a.mo48798x74292566(), java.lang.Integer.valueOf(i17));
            }
        }
        super.e(i17, q0Var);
    }
}
