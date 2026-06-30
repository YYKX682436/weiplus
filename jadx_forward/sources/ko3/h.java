package ko3;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f391495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean[] f391496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ko3.u f391497f;

    public h(ko3.u uVar, java.lang.Throwable th6, boolean[] zArr) {
        this.f391497f = uVar;
        this.f391495d = th6;
        this.f391496e = zArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f391497f.f(this.f391495d);
        synchronized (this.f391496e) {
            boolean[] zArr = this.f391496e;
            zArr[0] = true;
            zArr.notifyAll();
        }
    }
}
