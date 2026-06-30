package ko3;

/* loaded from: classes13.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f391489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f391490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f391491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f391492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ko3.u f391493h;

    public g(ko3.u uVar, boolean[] zArr, int i17, int i18, android.view.View view) {
        this.f391493h = uVar;
        this.f391489d = zArr;
        this.f391490e = i17;
        this.f391491f = i18;
        this.f391492g = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f391489d[0] = this.f391493h.h(this.f391490e, this.f391491f, this.f391492g);
        synchronized (this.f391489d) {
            boolean[] zArr = this.f391489d;
            zArr[1] = true;
            zArr.notifyAll();
        }
    }
}
