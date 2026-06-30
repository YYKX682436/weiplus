package p012xc85e97e9.p013x9d4bf30f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable */
/* loaded from: classes14.dex */
public class C0058x919a0099 implements p012xc85e97e9.p093xedfae76a.v, p012xc85e97e9.p013x9d4bf30f.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.o f90556d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p013x9d4bf30f.g f90557e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p013x9d4bf30f.a f90558f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.i f90559g;

    public C0058x919a0099(p012xc85e97e9.p013x9d4bf30f.i iVar, p012xc85e97e9.p093xedfae76a.o oVar, p012xc85e97e9.p013x9d4bf30f.g gVar) {
        this.f90559g = iVar;
        this.f90556d = oVar;
        this.f90557e = gVar;
        oVar.a(this);
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.a
    /* renamed from: cancel */
    public void mo2521xae7a2e7a() {
        this.f90556d.c(this);
        this.f90557e.m2526x1bae4268(this);
        p012xc85e97e9.p013x9d4bf30f.a aVar = this.f90558f;
        if (aVar != null) {
            aVar.mo2521xae7a2e7a();
            this.f90558f = null;
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
        if (mVar == p012xc85e97e9.p093xedfae76a.m.ON_START) {
            this.f90558f = this.f90559g.b(this.f90557e);
            return;
        }
        if (mVar != p012xc85e97e9.p093xedfae76a.m.ON_STOP) {
            if (mVar == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
                mo2521xae7a2e7a();
            }
        } else {
            p012xc85e97e9.p013x9d4bf30f.a aVar = this.f90558f;
            if (aVar != null) {
                aVar.mo2521xae7a2e7a();
            }
        }
    }
}
