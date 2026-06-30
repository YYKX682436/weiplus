package zl1;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f555133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zl1.t f555134e;

    public n(zl1.t tVar, boolean z17) {
        this.f555134e = tVar;
        this.f555133d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f555134e.i(this.f555133d);
    }
}
