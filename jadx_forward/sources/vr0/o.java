package vr0;

/* loaded from: classes10.dex */
public final class o implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nr0.y f521024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vr0.z f521025b;

    public o(nr0.y yVar, vr0.z zVar) {
        this.f521024a = yVar;
        this.f521025b = zVar;
    }

    @Override // m3.a
    /* renamed from: accept */
    public void mo3938xab27b508(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraXImpl", "provideSurface result:" + ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result) obj));
        ((pr0.n) this.f521024a).l("ProvideSurfaceCallback", new vr0.n(this.f521025b, null));
    }
}
