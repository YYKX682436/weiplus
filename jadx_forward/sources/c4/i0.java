package c4;

/* loaded from: classes15.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f119840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c f119842f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f119843g;

    public i0(c4.k0 k0Var, c4.l0 l0Var, java.lang.String str, android.os.Bundle bundle, p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c) {
        this.f119843g = k0Var;
        this.f119840d = l0Var;
        this.f119841e = str;
        this.f119842f = c0050x5b3754c;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.IBinder a17 = ((c4.m0) this.f119840d).a();
        c4.k0 k0Var = this.f119843g;
        if (((c4.n) k0Var.f119850a.f93238g.m174751x4aabfc28(a17, null)) == null) {
            return;
        }
        p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 abstractServiceC1134x1ae0da33 = k0Var.f119850a;
        abstractServiceC1134x1ae0da33.getClass();
        java.lang.String str = this.f119841e;
        c4.k kVar = new c4.k(abstractServiceC1134x1ae0da33, str, this.f119842f);
        kVar.f119885d = 4;
        kVar.d(null);
        if (kVar.b()) {
            return;
        }
        throw new java.lang.IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }
}
