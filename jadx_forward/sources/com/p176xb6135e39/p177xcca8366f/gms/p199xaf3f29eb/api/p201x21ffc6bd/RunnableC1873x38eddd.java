package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.zacy */
/* loaded from: classes13.dex */
final class RunnableC1873x38eddd implements java.lang.Runnable {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d zaa;
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 zab;

    public RunnableC1873x38eddd(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 c1875x38ede4, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d interfaceC1758x91b2b43d) {
        this.zab = c1875x38ede4;
        this.zaa = interfaceC1758x91b2b43d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ref.WeakReference weakReference;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.HandlerC1874x38edde handlerC1874x38edde;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.HandlerC1874x38edde handlerC1874x38edde2;
        java.lang.ref.WeakReference weakReference2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1761xc5c84baf abstractC1761xc5c84baf;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.HandlerC1874x38edde handlerC1874x38edde3;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.HandlerC1874x38edde handlerC1874x38edde4;
        java.lang.ref.WeakReference weakReference3;
        try {
            try {
                java.lang.ThreadLocal threadLocal = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523.zaa;
                threadLocal.set(java.lang.Boolean.TRUE);
                abstractC1761xc5c84baf = this.zab.zaa;
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074 m17839xe05b4124 = ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1761xc5c84baf) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(abstractC1761xc5c84baf)).m17839xe05b4124(this.zaa);
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 c1875x38ede4 = this.zab;
                handlerC1874x38edde3 = c1875x38ede4.zah;
                handlerC1874x38edde4 = c1875x38ede4.zah;
                handlerC1874x38edde3.sendMessage(handlerC1874x38edde4.obtainMessage(0, m17839xe05b4124));
                threadLocal.set(java.lang.Boolean.FALSE);
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 c1875x38ede42 = this.zab;
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4.zan(this.zaa);
                weakReference3 = this.zab.zag;
                abstractC1748xd28d482c = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c) weakReference3.get();
                if (abstractC1748xd28d482c == null) {
                    return;
                }
            } catch (java.lang.RuntimeException e17) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 c1875x38ede43 = this.zab;
                handlerC1874x38edde = c1875x38ede43.zah;
                handlerC1874x38edde2 = c1875x38ede43.zah;
                handlerC1874x38edde.sendMessage(handlerC1874x38edde2.obtainMessage(1, e17));
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523.zaa.set(java.lang.Boolean.FALSE);
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 c1875x38ede44 = this.zab;
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4.zan(this.zaa);
                weakReference2 = this.zab.zag;
                abstractC1748xd28d482c = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c) weakReference2.get();
                if (abstractC1748xd28d482c == null) {
                    return;
                }
            }
            abstractC1748xd28d482c.zap(this.zab);
        } catch (java.lang.Throwable th6) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523.zaa.set(java.lang.Boolean.FALSE);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 c1875x38ede45 = this.zab;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4.zan(this.zaa);
            weakReference = this.zab.zag;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c2 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c) weakReference.get();
            if (abstractC1748xd28d482c2 != null) {
                abstractC1748xd28d482c2.zap(this.zab);
            }
            throw th6;
        }
    }
}
