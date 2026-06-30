package dy4;

/* loaded from: classes15.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf.f f326272e;

    public z(dy4.f1 f1Var, sf.f fVar) {
        this.f326271d = f1Var;
        this.f326272e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f326271d.w(this.f326272e);
    }
}
