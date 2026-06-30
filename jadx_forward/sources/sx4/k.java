package sx4;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f495154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx4.n f495155e;

    public k(sx4.n nVar, android.os.Bundle bundle) {
        this.f495155e = nVar;
        this.f495154d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f495154d.putInt("height", this.f495155e.f495165e.f495171b.Y8());
    }
}
