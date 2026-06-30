package za3;

/* loaded from: classes15.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f552585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ za3.e0 f552586e;

    public z(za3.e0 e0Var, int i17) {
        this.f552586e = e0Var;
        this.f552585d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f552586e.f552435a.c(this.f552585d);
    }
}
