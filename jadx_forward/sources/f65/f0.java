package f65;

/* loaded from: classes12.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f341413e;

    public f0(java.lang.String str, int i17) {
        this.f341412d = str;
        this.f341413e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f65.y0.c(f65.y0.f341552a, this.f341412d, new f65.e0(this.f341413e));
    }
}
