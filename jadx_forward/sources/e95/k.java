package e95;

/* loaded from: classes12.dex */
public class k extends e95.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e95.m f331957h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e95.m mVar, boolean z17) {
        super(z17);
        this.f331957h = mVar;
    }

    @Override // e95.b
    public e95.a c() {
        e95.g gVar = this.f331957h.f331965m;
        if (gVar != null) {
            return ((e95.n) gVar).a();
        }
        return null;
    }

    @Override // e95.b
    public java.util.ArrayList i(java.util.ArrayList arrayList) {
        e95.g gVar = this.f331957h.f331965m;
        if (gVar != null) {
            return ((e95.n) gVar).b(arrayList);
        }
        return null;
    }
}
