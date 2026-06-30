package androidx.fragment.app;

/* loaded from: classes14.dex */
public class m extends androidx.fragment.app.n {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11388c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11389d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.fragment.app.p0 f11390e;

    public m(androidx.fragment.app.m3 m3Var, j3.h hVar, boolean z17) {
        super(m3Var, hVar);
        this.f11389d = false;
        this.f11388c = z17;
    }

    public androidx.fragment.app.p0 c(android.content.Context context) {
        if (this.f11389d) {
            return this.f11390e;
        }
        androidx.fragment.app.m3 m3Var = this.f11407a;
        androidx.fragment.app.p0 a17 = androidx.fragment.app.r0.a(context, m3Var.f11402c, m3Var.f11400a == androidx.fragment.app.l3.VISIBLE, this.f11388c);
        this.f11390e = a17;
        this.f11389d = true;
        return a17;
    }
}
