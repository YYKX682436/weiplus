package sx4;

/* loaded from: classes8.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f495158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f495159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sx4.n f495160f;

    public l(sx4.n nVar, java.lang.String str, int i17) {
        this.f495160f = nVar;
        this.f495158d = str;
        this.f495159e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx4.n nVar = this.f495160f;
        java.lang.String str = this.f495158d;
        if (str != null) {
            nVar.f495165e.f495171b.mo54450xbf7c1df6(str);
        }
        nVar.f495165e.f495171b.mo54451xb23a6b0d(this.f495159e);
    }
}
