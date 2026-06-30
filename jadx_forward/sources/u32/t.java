package u32;

/* loaded from: classes13.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f505900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f505901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u32.u f505902f;

    public t(u32.u uVar, java.lang.String str, boolean z17) {
        this.f505902f = uVar;
        this.f505900d = str;
        this.f505901e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (u32.h1.c().f180539a != null) {
            u32.n0 n0Var = u32.h1.c().f180539a;
            ((u32.k1) n0Var).a(this.f505900d, this.f505901e, this.f505902f);
        }
    }
}
