package va3;

/* loaded from: classes9.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q21.c f515922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f515923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f515924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f515925g;

    public y0(va3.z0 z0Var, q21.c cVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f515922d = cVar;
        this.f515923e = str;
        this.f515924f = str2;
        this.f515925g = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f515922d.d(this.f515923e, this.f515924f, this.f515925g);
    }
}
