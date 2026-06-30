package f65;

/* loaded from: classes12.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f341422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f341423f;

    public j0(java.lang.String str, int i17, boolean z17) {
        this.f341421d = str;
        this.f341422e = i17;
        this.f341423f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f65.y0.c(f65.y0.f341552a, this.f341421d, new f65.i0(this.f341422e, this.f341423f));
    }
}
