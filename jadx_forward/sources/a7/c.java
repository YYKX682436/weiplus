package a7;

/* loaded from: classes13.dex */
public class c implements a7.q0, a7.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.AssetManager f83339a;

    public c(android.content.res.AssetManager assetManager) {
        this.f83339a = assetManager;
    }

    @Override // a7.a
    public u6.e a(android.content.res.AssetManager assetManager, java.lang.String str) {
        return new u6.s(assetManager, str);
    }

    @Override // a7.q0
    public a7.p0 b(a7.z0 z0Var) {
        return new a7.d(this.f83339a, this);
    }
}
