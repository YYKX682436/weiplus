package im1;

/* loaded from: classes14.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f373742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f373743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ im1.x f373744f;

    public s(im1.x xVar, java.lang.String str, float f17) {
        this.f373744f = xVar;
        this.f373742d = str;
        this.f373743e = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        im1.x xVar = this.f373744f;
        if (xVar.f373754c) {
            rh0.d0 d0Var = xVar.f373753b;
            float f17 = this.f373743e;
            java.lang.String str = this.f373742d;
            ((p05.l4) d0Var).g(str, f17);
            xVar.f373759h = str;
        }
    }
}
