package cf3;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cf3.d f40914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f40915e;

    public c(cf3.d dVar, int i17) {
        this.f40914d = dVar;
        this.f40915e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cf3.d dVar = this.f40914d;
        dVar.f40916a.e(this.f40915e, dVar);
    }
}
