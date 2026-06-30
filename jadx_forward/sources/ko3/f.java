package ko3;

/* loaded from: classes13.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f391483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f391484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f391485f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean[] f391486g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ko3.u f391487h;

    public f(ko3.u uVar, int i17, android.view.View view, java.util.List list, boolean[] zArr) {
        this.f391487h = uVar;
        this.f391483d = i17;
        this.f391484e = view;
        this.f391485f = list;
        this.f391486g = zArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f391487h.g(this.f391483d, this.f391484e, this.f391485f);
        synchronized (this.f391486g) {
            boolean[] zArr = this.f391486g;
            zArr[0] = true;
            zArr.notifyAll();
        }
    }
}
