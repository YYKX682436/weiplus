package kx5;

/* loaded from: classes15.dex */
public class c implements kx5.m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f394818a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f394819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e f394820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kx5.n f394821d;

    public c(kx5.n nVar, int i17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        this.f394821d = nVar;
        this.f394819b = i17;
        this.f394820c = c28580x69eec95e;
    }

    public void a() {
        nx5.c.c("WxaRouter.WxaRouter", "destroy engine: %d", java.lang.Integer.valueOf(this.f394819b));
        if (this.f394818a) {
            return;
        }
        kx5.n.a(this.f394821d, this.f394820c);
        this.f394818a = true;
    }
}
