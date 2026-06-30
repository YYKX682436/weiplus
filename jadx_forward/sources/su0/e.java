package su0;

/* loaded from: classes5.dex */
public final class e implements com.p314xaae8f345.p457x3304c6.p482xca9708e2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ su0.j f494173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yu0.p f494174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f494175c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f494176d;

    public e(su0.j jVar, yu0.p pVar, yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f494173a = jVar;
        this.f494174b = pVar;
        this.f494175c = lVar;
        this.f494176d = c0Var;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p482xca9708e2.c
    public void a(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4195xcab2df48 c4195xcab2df48, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f494176d;
        synchronized (this) {
            if (c0Var.f391645d) {
                return;
            }
            c0Var.f391645d = true;
            su0.j jVar = this.f494173a;
            java.lang.Object obj = this.f494174b.f547362d;
            java.util.concurrent.locks.ReentrantLock reentrantLock = jVar.f494192c;
            reentrantLock.lock();
            try {
                jVar.f494195f.remove(obj);
                java.lang.Runnable runnable = (java.lang.Runnable) jVar.f494196g.remove(obj);
                if (runnable != null) {
                    jVar.f494193d.removeCallbacksAndMessages(runnable);
                }
                if (c4093x6b88526b == null && c4195xcab2df48 != null) {
                    this.f494175c.mo146xb9724478(c4195xcab2df48);
                    return;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onComplete: message ");
                sb6.append(c4093x6b88526b != null ? c4093x6b88526b.f16057x38eb0007 : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJTTSTaskExecutor", sb6.toString());
                su0.a aVar = this.f494173a.f494191b;
                yu0.p pVar = this.f494174b;
                ((vu0.r) aVar).b(pVar.f547362d, pVar.f547360b);
                this.f494175c.mo146xb9724478(null);
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
