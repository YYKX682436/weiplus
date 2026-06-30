package yt3;

/* loaded from: classes10.dex */
public final class t1 implements qk.y7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.b2 f547215a;

    public t1(yt3.b2 b2Var) {
        this.f547215a = b2Var;
    }

    @Override // qk.y7
    public void a(qk.g6 features) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(features, "features");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "[onSelectedFeature] features:%s", features.name());
        if (features == qk.g6.DEFAULT) {
            ju3.d0.k(this.f547215a.f546889e, ju3.c0.V1, null, 2, null);
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
