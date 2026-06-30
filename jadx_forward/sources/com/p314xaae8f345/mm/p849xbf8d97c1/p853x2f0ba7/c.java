package com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.c f150239f = new com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f150240d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f150241e;

    public synchronized void a(com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a aVar) {
        if (((java.util.concurrent.ConcurrentHashMap) this.f150240d).containsKey(aVar.key())) {
            throw new java.lang.IllegalArgumentException(aVar.key() + " dice already exists");
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f150240d).put(aVar.key(), aVar);
        b(aVar);
        if (this.f150241e == null) {
            final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5846xa44f96da> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5846xa44f96da>(a0Var) { // from class: com.tencent.mm.matrix.dice.DiceCup$1
                {
                    this.f39173x3fe91575 = -790196534;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5846xa44f96da c5846xa44f96da) {
                    ((ku5.t0) ku5.t0.f394148d).h(com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.c.this, "MicroMsg.DiceCup");
                    com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.c.this.f150241e.mo48814x2efc64();
                    return false;
                }
            };
            this.f150241e = abstractC20980x9b9ad01d;
            abstractC20980x9b9ad01d.mo48813x58998cd();
        }
    }

    public final void b(com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a aVar) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DiceCup", "dice [%s]", aVar.key());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.b.f150236a;
            com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.b.f150237b = bm5.f1.a() + "_" + aVar.key();
            com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.b.f150238c.getClass();
            java.lang.String str = com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.b.f150237b;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.b.f150236a;
            long q17 = o4Var2.q(str, 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - q17 < java.util.concurrent.TimeUnit.MINUTES.toMillis(aVar.V3())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DiceCup", "dice [%s] pass cycle", aVar.key());
                return;
            }
            o4Var2.B(com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.b.f150237b, currentTimeMillis);
            double random = java.lang.Math.random();
            if (random > aVar.A4() || aVar.A4() < 0.0d) {
                return;
            }
            aVar.Sg(random);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DiceCup", th6, "", new java.lang.Object[0]);
        }
    }

    public synchronized void c(com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a aVar) {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d;
        a(aVar);
        synchronized (this) {
            ((java.util.concurrent.ConcurrentHashMap) this.f150240d).remove(aVar.key());
            if (((java.util.concurrent.ConcurrentHashMap) this.f150240d).isEmpty() && (abstractC20980x9b9ad01d = this.f150241e) != null) {
                abstractC20980x9b9ad01d.mo48814x2efc64();
                this.f150241e = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f150240d).entrySet().iterator();
        while (it.hasNext()) {
            b((com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a) ((java.util.Map.Entry) it.next()).getValue());
        }
    }
}
