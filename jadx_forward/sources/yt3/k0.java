package yt3;

/* loaded from: classes10.dex */
public final class k0 implements qk.y7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.p0 f547043a;

    public k0(yt3.p0 p0Var) {
        this.f547043a = p0Var;
    }

    @Override // qk.y7
    public void a(qk.g6 features) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(features, "features");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "[onSelectedFeature] features:%s", features.name());
        if (features == qk.g6.DEFAULT) {
            ju3.d0.k(this.f547043a.f547113e, ju3.c0.V1, null, 2, null);
        }
    }

    @Override // qk.y7
    public void b(qk.g6 features, int i17, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(features, "features");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "[onSelectedDetailFeature] features:%s index:%s", features.name(), java.lang.Integer.valueOf(i17));
    }

    @Override // qk.y7
    public void c(boolean z17) {
    }
}
