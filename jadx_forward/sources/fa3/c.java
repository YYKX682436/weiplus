package fa3;

/* loaded from: classes10.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fa3.d f342284e;

    public c(fa3.d dVar, java.lang.String str) {
        this.f342284e = dVar;
        this.f342283d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        fa3.d dVar = this.f342284e;
        fa3.b.a(dVar.f342287f, this.f342283d, dVar.f342286e);
    }
}
