package qj3;

/* loaded from: classes10.dex */
public final class c implements qk.y7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qj3.g f445405a;

    public c(qj3.g gVar) {
        this.f445405a = gVar;
    }

    @Override // qk.y7
    public void a(qk.g6 features) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(features, "features");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkEditPhotoContainerPlugin", "[onSelectedFeature] features:%s", features.name());
        if (features == qk.g6.DEFAULT) {
            ju3.d0.k(this.f445405a.f445410e, ju3.c0.V1, null, 2, null);
        }
    }

    @Override // qk.y7
    public void b(qk.g6 features, int i17, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(features, "features");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkEditPhotoContainerPlugin", "[onSelectedDetailFeature] features:%s index:%s", features.name(), java.lang.Integer.valueOf(i17));
    }

    @Override // qk.y7
    public void c(boolean z17) {
    }
}
