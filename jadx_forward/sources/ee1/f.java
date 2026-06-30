package ee1;

/* loaded from: classes4.dex */
public final class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ee1.e[] f333110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f333111b;

    public f(ee1.e[] eVarArr, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f333110a = eVarArr;
        this.f333111b = countDownLatch;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        ee1.e[] eVarArr = this.f333110a;
        java.util.concurrent.CountDownLatch countDownLatch = this.f333111b;
        try {
            ee1.g gVar = ee1.g.f333112a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
            eVarArr[0] = ee1.g.a(gVar, fVar);
        } finally {
            try {
                countDownLatch.countDown();
                return jz5.f0.f384359a;
            } catch (java.lang.Throwable th6) {
            }
        }
        countDownLatch.countDown();
        return jz5.f0.f384359a;
    }
}
