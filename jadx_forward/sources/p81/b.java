package p81;

/* loaded from: classes7.dex */
public class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f434247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f434248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f434249c;

    public b(p81.e eVar, km5.b bVar, boolean z17, int i17) {
        this.f434247a = bVar;
        this.f434248b = z17;
        this.f434249c = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (th1.a.b(fVar)) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) fVar.f152152e.mo47948x7f0c4558();
            return nm5.j.c((r45.os3) oVar.f152243a.f152217a, (r45.ps3) oVar.f152244b.f152233a);
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f434247a.c(bool);
        km5.u.b().a(bool);
        r81.f.INSTANCE.b(this.f434249c, this.f434248b ? 50 : 49);
        return null;
    }
}
