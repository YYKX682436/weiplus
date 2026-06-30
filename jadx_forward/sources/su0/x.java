package su0;

/* loaded from: classes5.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su0.a0 f494242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f494243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f494244f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f494245g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f494246h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f494247i;

    public x(su0.a0 a0Var, java.lang.String str, long j17, float f17, java.nio.ByteBuffer byteBuffer, yz5.l lVar) {
        this.f494242d = a0Var;
        this.f494243e = str;
        this.f494244f = j17;
        this.f494245g = f17;
        this.f494246h = byteBuffer;
        this.f494247i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        su0.a0 a0Var = this.f494242d;
        java.lang.String submitTaskID = this.f494243e;
        long j17 = this.f494244f;
        float f17 = this.f494245g;
        java.nio.ByteBuffer contextBuff = this.f494246h;
        yz5.l lVar = this.f494247i;
        a0Var.getClass();
        com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 c4197x7df5f634 = new com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634();
        c4197x7df5f634.f130092h.add("commandID");
        c4197x7df5f634.f130085a = 4502;
        c4197x7df5f634.f130092h.add("URL");
        c4197x7df5f634.f130087c = "/ilink/ilinkapp/maas/materials/list";
        c4197x7df5f634.f130092h.add("timeoutMillis");
        c4197x7df5f634.f130086b = 10000;
        c4197x7df5f634.f130092h.add("retryCount");
        c4197x7df5f634.f130088d = 0;
        c4197x7df5f634.f130092h.add("limitFlow");
        c4197x7df5f634.f130089e = false;
        c4197x7df5f634.f130092h.add("limitFrequency");
        c4197x7df5f634.f130090f = false;
        com.p314xaae8f345.p457x3304c6.p482xca9708e2.a aVar = com.p314xaae8f345.p457x3304c6.p482xca9708e2.a.LongLink;
        c4197x7df5f634.f130092h.add(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37);
        c4197x7df5f634.f130091g = aVar;
        pp0.s0 s0Var = a0Var.f494155a;
        su0.t tVar = new su0.t(lVar, a0Var, submitTaskID, j17, f17);
        dz0.s2 s2Var = (dz0.s2) s0Var;
        s2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(submitTaskID, "submitTaskID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextBuff, "contextBuff");
        synchronized (s2Var) {
            if (s2Var.f326539b) {
                return;
            }
            s2Var.f326538a.c(submitTaskID, c4197x7df5f634, "queryasyncvrlftransv2", contextBuff, tVar);
        }
    }
}
