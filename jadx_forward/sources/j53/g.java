package j53;

/* loaded from: classes10.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j53.h f379344d;

    public g(j53.h hVar) {
        this.f379344d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        j53.h hVar = this.f379344d;
        hVar.f379345a.finish();
        hVar.f379345a.overridePendingTransition(0, 0);
    }
}
