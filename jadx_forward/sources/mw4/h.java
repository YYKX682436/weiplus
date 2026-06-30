package mw4;

/* loaded from: classes5.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f413301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f413302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f413303f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.util.concurrent.CountDownLatch countDownLatch) {
        super(1);
        this.f413301d = atomicBoolean;
        this.f413302e = h0Var;
        this.f413303f = countDownLatch;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (this.f413301d.compareAndSet(false, true)) {
            this.f413302e.f391656d = str;
            this.f413303f.countDown();
        }
        return jz5.f0.f384359a;
    }
}
