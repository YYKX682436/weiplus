package tr5;

/* loaded from: classes13.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f503031a;

    /* renamed from: b, reason: collision with root package name */
    public final tr5.k f503032b;

    public j(java.util.concurrent.CountDownLatch countDownLatch, tr5.k kVar) {
        if (countDownLatch == null) {
            throw new java.lang.IllegalArgumentException("lookupLatch".concat(" can not be null"));
        }
        if (kVar == null) {
            throw new java.lang.IllegalArgumentException("lookupResultHolder".concat(" can not be null"));
        }
        this.f503031a = countDownLatch;
        this.f503032b = kVar;
    }
}
