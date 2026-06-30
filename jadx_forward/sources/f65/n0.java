package f65;

/* loaded from: classes12.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f65.y f341444e;

    public n0(java.lang.String str, f65.y yVar) {
        this.f341443d = str;
        this.f341444e = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f65.y0.c(f65.y0.f341552a, this.f341443d, new f65.m0(this.f341444e));
    }
}
