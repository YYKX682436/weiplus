package cf3;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cf3.d f122445d;

    public a(cf3.d dVar) {
        this.f122445d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cf3.d dVar = this.f122445d;
        if (dVar.f122449a.d(dVar.f122458j, dVar)) {
            dVar.f122450b.removeCallbacks(dVar.f122462n);
            dVar.f122454f = true;
        }
    }
}
