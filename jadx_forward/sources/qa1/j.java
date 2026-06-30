package qa1;

/* loaded from: classes14.dex */
public class j implements qa1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa1.k f442535a;

    public j(qa1.k kVar) {
        this.f442535a = kVar;
    }

    @Override // qa1.o
    /* renamed from: onDone */
    public void mo159669xc3989e01() {
        qa1.k kVar = this.f442535a;
        qa1.m mVar = kVar.f442536a.f442537a;
        if (mVar.f442542h.f442544g.g(mVar.f442538d)) {
            kVar.f442536a.f442537a.f442540f.mo146xb9724478(java.lang.Boolean.TRUE);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameGLSurfaceView", "switch record not support!");
            kVar.f442536a.f442537a.f442540f.mo146xb9724478(java.lang.Boolean.FALSE);
        }
    }
}
