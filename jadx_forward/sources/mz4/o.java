package mz4;

/* loaded from: classes10.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f414855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz4.s f414856f;

    public o(mz4.s sVar, java.lang.String str, int i17) {
        this.f414856f = sVar;
        this.f414854d = str;
        this.f414855e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        mz4.s sVar = this.f414856f;
        sVar.f414877i.b(this.f414854d, sVar.f414878m);
        if (sVar.f414882q || this.f414855e != -50006) {
            gm0.j1.e().k(new mz4.n(this), 80L);
        }
    }
}
