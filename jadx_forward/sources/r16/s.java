package r16;

/* loaded from: classes16.dex */
public final class s implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o06.g f450202d;

    public s(o06.g gVar) {
        this.f450202d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        o06.d dVar = (o06.d) obj;
        boolean z17 = false;
        if (!o06.f0.e(dVar.mo9617x61f71b08())) {
            o06.g gVar = this.f450202d;
            if (gVar == null) {
                o06.f0.a(3);
                throw null;
            }
            if (o06.f0.c(o06.f0.f423485l, dVar, gVar, false) == null) {
                z17 = true;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
