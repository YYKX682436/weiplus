package com.tencent.mm.matrix.dice;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.matrix.dice.c f68706f = new com.tencent.mm.matrix.dice.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f68707d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f68708e;

    public synchronized void a(com.tencent.mm.matrix.dice.a aVar) {
        if (((java.util.concurrent.ConcurrentHashMap) this.f68707d).containsKey(aVar.key())) {
            throw new java.lang.IllegalArgumentException(aVar.key() + " dice already exists");
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f68707d).put(aVar.key(), aVar);
        b(aVar);
        if (this.f68708e == null) {
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PostSyncTaskEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PostSyncTaskEvent>(a0Var) { // from class: com.tencent.mm.matrix.dice.DiceCup$1
                {
                    this.__eventId = -790196534;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.PostSyncTaskEvent postSyncTaskEvent) {
                    ((ku5.t0) ku5.t0.f312615d).h(com.tencent.mm.matrix.dice.c.this, "MicroMsg.DiceCup");
                    com.tencent.mm.matrix.dice.c.this.f68708e.dead();
                    return false;
                }
            };
            this.f68708e = iListener;
            iListener.alive();
        }
    }

    public final void b(com.tencent.mm.matrix.dice.a aVar) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.DiceCup", "dice [%s]", aVar.key());
            com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.matrix.dice.b.f68703a;
            com.tencent.mm.matrix.dice.b.f68704b = bm5.f1.a() + "_" + aVar.key();
            com.tencent.mm.matrix.dice.b.f68705c.getClass();
            java.lang.String str = com.tencent.mm.matrix.dice.b.f68704b;
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = com.tencent.mm.matrix.dice.b.f68703a;
            long q17 = o4Var2.q(str, 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - q17 < java.util.concurrent.TimeUnit.MINUTES.toMillis(aVar.V3())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DiceCup", "dice [%s] pass cycle", aVar.key());
                return;
            }
            o4Var2.B(com.tencent.mm.matrix.dice.b.f68704b, currentTimeMillis);
            double random = java.lang.Math.random();
            if (random > aVar.A4() || aVar.A4() < 0.0d) {
                return;
            }
            aVar.Sg(random);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DiceCup", th6, "", new java.lang.Object[0]);
        }
    }

    public synchronized void c(com.tencent.mm.matrix.dice.a aVar) {
        com.tencent.mm.sdk.event.IListener iListener;
        a(aVar);
        synchronized (this) {
            ((java.util.concurrent.ConcurrentHashMap) this.f68707d).remove(aVar.key());
            if (((java.util.concurrent.ConcurrentHashMap) this.f68707d).isEmpty() && (iListener = this.f68708e) != null) {
                iListener.dead();
                this.f68708e = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f68707d).entrySet().iterator();
        while (it.hasNext()) {
            b((com.tencent.mm.matrix.dice.a) ((java.util.Map.Entry) it.next()).getValue());
        }
    }
}
