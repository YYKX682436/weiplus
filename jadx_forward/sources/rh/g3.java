package rh;

/* loaded from: classes12.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476935f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f476936g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rh.j3 f476937h;

    public g3(rh.j3 j3Var, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17) {
        this.f476937h = j3Var;
        this.f476933d = str;
        this.f476934e = str2;
        this.f476935f = str3;
        this.f476936g = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        rh.h3 h3Var = new rh.h3();
        h3Var.f476943a = this.f476933d;
        h3Var.f476944b = this.f476934e;
        h3Var.f476945c = this.f476935f;
        h3Var.f476946d = this.f476936g;
        this.f476937h.f476827a.a(h3Var);
    }
}
