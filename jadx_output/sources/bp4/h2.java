package bp4;

/* loaded from: classes10.dex */
public final class h2 implements qk.y7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.k2 f23187a;

    public h2(bp4.k2 k2Var) {
        this.f23187a = k2Var;
    }

    @Override // qk.y7
    public void a(qk.g6 features) {
        kotlin.jvm.internal.o.g(features, "features");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", "[onSelectedFeature] features:%s", features.name());
        if (features == qk.g6.DEFAULT) {
            ju3.d0.k(this.f23187a.f465332d, ju3.c0.V1, null, 2, null);
        }
    }

    @Override // qk.y7
    public void b(qk.g6 features, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(features, "features");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiPhotoEditContainerPlugin", "[onSelectedDetailFeature] features:%s index:%s", features.name(), java.lang.Integer.valueOf(i17));
    }

    @Override // qk.y7
    public void c(boolean z17) {
    }
}
