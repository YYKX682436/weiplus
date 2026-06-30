package wq4;

/* loaded from: classes14.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f530175d;

    /* renamed from: e, reason: collision with root package name */
    public final long f530176e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f530177f;

    /* renamed from: g, reason: collision with root package name */
    public final int f530178g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wq4.k0 f530179h;

    public j0(wq4.k0 k0Var, java.lang.String str, long j17, boolean z17, int i17) {
        this.f530179h = k0Var;
        this.f530175d = str;
        this.f530176e = j17;
        this.f530177f = z17;
        this.f530178g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f530179h.d(this.f530175d, this.f530176e, this.f530177f, this.f530178g);
    }
}
