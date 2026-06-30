package mz;

/* loaded from: classes5.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f414394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f414395e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.CountDownLatch countDownLatch) {
        super(1);
        this.f414394d = atomicReference;
        this.f414395e = countDownLatch;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ipc.C10744xea8b52e2 it = (com.p314xaae8f345.mm.ipc.C10744xea8b52e2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f414394d.set(it.f149857d.toArray(new java.lang.String[0]));
        this.f414395e.countDown();
        return jz5.f0.f384359a;
    }
}
