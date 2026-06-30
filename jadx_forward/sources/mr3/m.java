package mr3;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mr3.n f412415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(mr3.n nVar) {
        super(1);
        this.f412415d = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        mr3.n nVar = this.f412415d;
        if (intValue < nVar.f412417e.size()) {
            return (mr3.l) nVar.f412417e.get(intValue);
        }
        mr3.l lVar = nVar.f412418f;
        return lVar == null ? new mr3.l(null, null, null, null, null, 1, 0, 95, null) : lVar;
    }
}
