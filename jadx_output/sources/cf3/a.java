package cf3;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cf3.d f40912d;

    public a(cf3.d dVar) {
        this.f40912d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cf3.d dVar = this.f40912d;
        if (dVar.f40916a.d(dVar.f40925j, dVar)) {
            dVar.f40917b.removeCallbacks(dVar.f40929n);
            dVar.f40921f = true;
        }
    }
}
