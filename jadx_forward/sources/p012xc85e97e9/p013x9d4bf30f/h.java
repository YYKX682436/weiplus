package p012xc85e97e9.p013x9d4bf30f;

/* loaded from: classes14.dex */
public class h implements p012xc85e97e9.p013x9d4bf30f.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p013x9d4bf30f.g f90570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.i f90571e;

    public h(p012xc85e97e9.p013x9d4bf30f.i iVar, p012xc85e97e9.p013x9d4bf30f.g gVar) {
        this.f90571e = iVar;
        this.f90570d = gVar;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.a
    /* renamed from: cancel */
    public void mo2521xae7a2e7a() {
        java.util.ArrayDeque arrayDeque = this.f90571e.f90573b;
        p012xc85e97e9.p013x9d4bf30f.g gVar = this.f90570d;
        arrayDeque.remove(gVar);
        gVar.m2526x1bae4268(this);
    }
}
