package su0;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su0.j f494177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4195xcab2df48 f494178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f494179f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f494180g;

    public f(su0.j jVar, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4195xcab2df48 c4195xcab2df48, java.lang.Object obj, yz5.l lVar) {
        this.f494177d = jVar;
        this.f494178e = c4195xcab2df48;
        this.f494179f = obj;
        this.f494180g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4195xcab2df48 c4195xcab2df48 = this.f494178e;
        java.lang.Object obj = this.f494179f;
        yz5.l lVar = this.f494180g;
        su0.j jVar = this.f494177d;
        java.util.concurrent.locks.ReentrantLock reentrantLock = jVar.f494192c;
        reentrantLock.lock();
        try {
            if (jVar.f494196g.containsKey(obj)) {
                java.lang.String str = c4195xcab2df48.f130076a;
                java.nio.ByteBuffer byteBuffer = c4195xcab2df48.f130079d;
                com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 c4197x7df5f634 = new com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634();
                java.util.HashSet hashSet = c4197x7df5f634.f130092h;
                hashSet.add("commandID");
                c4197x7df5f634.f130085a = 4481;
                hashSet.add("URL");
                c4197x7df5f634.f130087c = "/ilink/ilinkapp/tts/query_asynctts";
                hashSet.add("timeoutMillis");
                c4197x7df5f634.f130086b = 10000;
                hashSet.add("retryCount");
                c4197x7df5f634.f130088d = 0;
                hashSet.add("limitFlow");
                c4197x7df5f634.f130089e = false;
                hashSet.add("limitFrequency");
                c4197x7df5f634.f130090f = false;
                com.p314xaae8f345.p457x3304c6.p482xca9708e2.a aVar = com.p314xaae8f345.p457x3304c6.p482xca9708e2.a.LongLink;
                hashSet.add(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37);
                c4197x7df5f634.f130091g = aVar;
                pp0.s0 s0Var = jVar.f494190a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(byteBuffer);
                ((dz0.s2) s0Var).b(str, c4197x7df5f634, "", byteBuffer, new su0.b(lVar, jVar, c4195xcab2df48, obj));
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
