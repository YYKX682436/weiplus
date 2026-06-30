package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzgk */
/* loaded from: classes16.dex */
public final class C2246x394c24 extends java.lang.Thread {

    /* renamed from: zzalz */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 f6727x6f0226f;

    /* renamed from: zzamc */
    private final java.lang.Object f6728x6f02277;

    /* renamed from: zzamd */
    private final java.util.concurrent.BlockingQueue<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2245x394c23<?>> f6729x6f02278;

    public C2246x394c24(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 c2242x394c20, java.lang.String str, java.util.concurrent.BlockingQueue<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2245x394c23<?>> blockingQueue) {
        this.f6727x6f0226f = c2242x394c20;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(blockingQueue);
        this.f6728x6f02277 = new java.lang.Object();
        this.f6729x6f02278 = blockingQueue;
        setName(str);
    }

    private final void zza(java.lang.InterruptedException interruptedException) {
        this.f6727x6f0226f.mo18976x394c1e().m19111x394c67().zzg(java.lang.String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        java.util.concurrent.Semaphore semaphore;
        java.lang.Object obj2;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2246x394c24 c2246x394c24;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2246x394c24 c2246x394c242;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.util.concurrent.Semaphore semaphore2;
        java.lang.Object obj5;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2246x394c24 c2246x394c243;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2246x394c24 c2246x394c244;
        boolean z17;
        java.util.concurrent.Semaphore semaphore3;
        boolean z18 = false;
        while (!z18) {
            try {
                semaphore3 = this.f6727x6f0226f.f6719x6f0226b;
                semaphore3.acquire();
                z18 = true;
            } catch (java.lang.InterruptedException e17) {
                zza(e17);
            }
        }
        try {
            int threadPriority = android.os.Process.getThreadPriority(android.os.Process.myTid());
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2245x394c23<?> poll = this.f6729x6f02278.poll();
                if (poll == null) {
                    synchronized (this.f6728x6f02277) {
                        if (this.f6729x6f02278.peek() == null) {
                            z17 = this.f6727x6f0226f.f6720x6f0226c;
                            if (!z17) {
                                try {
                                    this.f6728x6f02277.wait(30000L);
                                } catch (java.lang.InterruptedException e18) {
                                    zza(e18);
                                }
                            }
                        }
                    }
                    obj3 = this.f6727x6f0226f.f6718x6f0226a;
                    synchronized (obj3) {
                        if (this.f6729x6f02278.peek() == null) {
                            break;
                        }
                    }
                } else {
                    android.os.Process.setThreadPriority(poll.f6726x6f02276 ? threadPriority : 10);
                    poll.run();
                }
            }
            obj4 = this.f6727x6f0226f.f6718x6f0226a;
            synchronized (obj4) {
                semaphore2 = this.f6727x6f0226f.f6719x6f0226b;
                semaphore2.release();
                obj5 = this.f6727x6f0226f.f6718x6f0226a;
                obj5.notifyAll();
                c2246x394c243 = this.f6727x6f0226f.f6712x6f02264;
                if (this == c2246x394c243) {
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20.zza(this.f6727x6f0226f, null);
                } else {
                    c2246x394c244 = this.f6727x6f0226f.f6713x6f02265;
                    if (this == c2246x394c244) {
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20.zzb(this.f6727x6f0226f, null);
                    } else {
                        this.f6727x6f0226f.mo18976x394c1e().m19108x394c64().log("Current scheduler thread is neither worker nor network");
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            obj = this.f6727x6f0226f.f6718x6f0226a;
            synchronized (obj) {
                semaphore = this.f6727x6f0226f.f6719x6f0226b;
                semaphore.release();
                obj2 = this.f6727x6f0226f.f6718x6f0226a;
                obj2.notifyAll();
                c2246x394c24 = this.f6727x6f0226f.f6712x6f02264;
                if (this != c2246x394c24) {
                    c2246x394c242 = this.f6727x6f0226f.f6713x6f02265;
                    if (this == c2246x394c242) {
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20.zzb(this.f6727x6f0226f, null);
                    } else {
                        this.f6727x6f0226f.mo18976x394c1e().m19108x394c64().log("Current scheduler thread is neither worker nor network");
                    }
                } else {
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20.zza(this.f6727x6f0226f, null);
                }
                throw th6;
            }
        }
    }

    /* renamed from: zzjn */
    public final void m19159x394c84() {
        synchronized (this.f6728x6f02277) {
            this.f6728x6f02277.notifyAll();
        }
    }
}
