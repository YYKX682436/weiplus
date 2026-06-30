package vr0;

/* loaded from: classes14.dex */
public final class r implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.SurfaceProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nr0.y f521036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vr0.z f521037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nr0.x f521038c;

    public r(nr0.y yVar, vr0.z zVar, nr0.x xVar) {
        this.f521036a = yVar;
        this.f521037b = zVar;
        this.f521038c = xVar;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.SurfaceProvider
    /* renamed from: onSurfaceRequested */
    public final void mo4731x35527140(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        nr0.y yVar = this.f521036a;
        ((pr0.n) yVar).l("SurfaceProviderCallback", new vr0.q(request, this.f521037b, this.f521038c, yVar, null));
    }
}
