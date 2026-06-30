package f65;

/* loaded from: classes12.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f341428e;

    public l0(java.lang.String str, int i17) {
        this.f341427d = str;
        this.f341428e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f65.y0.c(f65.y0.f341552a, this.f341427d, new f65.k0(this.f341428e));
    }
}
