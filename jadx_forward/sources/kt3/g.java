package kt3;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt3.l f393517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kt3.l lVar) {
        super(1);
        this.f393517d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kt3.l lVar = this.f393517d;
        if (booleanValue) {
            lVar.z();
            if (st3.t.f494134e) {
                at0.n nVar = lVar.f393529p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar);
                st3.t.a(nVar.f95127b.v(true));
            }
        } else {
            bi3.f fVar = lVar.f393534u;
            if (fVar != null) {
                fVar.a();
            }
        }
        return jz5.f0.f384359a;
    }
}
