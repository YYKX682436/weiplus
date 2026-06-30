package t56;

/* loaded from: classes16.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f497427a;

    /* renamed from: b, reason: collision with root package name */
    public final t56.l[] f497428b;

    /* renamed from: c, reason: collision with root package name */
    public long f497429c;

    public k(java.util.concurrent.ThreadFactory threadFactory, int i17) {
        this.f497427a = i17;
        this.f497428b = new t56.l[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            this.f497428b[i18] = new t56.l(threadFactory);
        }
    }
}
