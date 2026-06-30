package c4;

/* loaded from: classes15.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f119845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f119846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c f119847f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f119848g;

    public j0(c4.k0 k0Var, c4.l0 l0Var, java.lang.String str, android.os.Bundle bundle, p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c) {
        this.f119848g = k0Var;
        this.f119845d = l0Var;
        this.f119846e = bundle;
        this.f119847f = c0050x5b3754c;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.IBinder a17 = ((c4.m0) this.f119845d).a();
        c4.k0 k0Var = this.f119848g;
        if (((c4.n) k0Var.f119850a.f93238g.m174751x4aabfc28(a17, null)) == null) {
            java.util.Objects.toString(this.f119846e);
        } else {
            k0Var.f119850a.getClass();
            this.f119847f.b(-1, null);
        }
    }
}
