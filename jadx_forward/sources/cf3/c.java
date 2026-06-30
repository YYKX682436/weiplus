package cf3;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cf3.d f122447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f122448e;

    public c(cf3.d dVar, int i17) {
        this.f122447d = dVar;
        this.f122448e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cf3.d dVar = this.f122447d;
        dVar.f122449a.e(this.f122448e, dVar);
    }
}
