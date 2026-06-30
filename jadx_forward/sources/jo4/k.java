package jo4;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jo4.l f382452d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(jo4.l lVar) {
        super(1);
        this.f382452d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        d11.m mVar;
        float floatValue = ((java.lang.Number) obj).floatValue();
        d11.n nVar = this.f382452d.f382454b;
        if (nVar == null || (mVar = ((d11.d) nVar).f307192d) == null) {
            return null;
        }
        yz5.l lVar = ((zf0.w0) mVar).f554109a;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Float.valueOf(floatValue));
        }
        return jz5.f0.f384359a;
    }
}
