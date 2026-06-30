package i7;

/* loaded from: classes13.dex */
public class b implements i7.e {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources f370923a;

    public b(android.content.res.Resources resources) {
        q7.n.b(resources);
        this.f370923a = resources;
    }

    @Override // i7.e
    public w6.z0 a(w6.z0 z0Var, t6.l lVar) {
        if (z0Var == null) {
            return null;
        }
        return new d7.g0(this.f370923a, z0Var);
    }
}
