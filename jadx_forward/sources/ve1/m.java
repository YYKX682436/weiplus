package ve1;

/* loaded from: classes13.dex */
public class m extends java.util.concurrent.FutureTask implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public volatile long f517620d;

    public m(java.lang.Runnable runnable, java.lang.Object obj, long j17) {
        super(runnable, obj);
        this.f517620d = 0L;
        this.f517620d = j17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return java.lang.Long.valueOf(this.f517620d).compareTo(java.lang.Long.valueOf(((ve1.m) obj).f517620d));
    }
}
