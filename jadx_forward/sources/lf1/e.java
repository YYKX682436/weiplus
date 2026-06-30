package lf1;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf1.j f399779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf.f f399780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f399781f;

    public e(lf1.j jVar, sf.f fVar, java.lang.Runnable runnable) {
        this.f399779d = jVar;
        this.f399780e = fVar;
        this.f399781f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf1.j jVar = this.f399779d;
        if (jVar.f399797g != null) {
            this.f399781f.run();
            return;
        }
        ((java.util.ArrayList) jVar.f399799i).add(this.f399780e);
    }
}
