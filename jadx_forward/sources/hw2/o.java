package hw2;

/* loaded from: classes5.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.t f367078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os5.p f367079e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hw2.t tVar, os5.p pVar) {
        super(1);
        this.f367078d = tVar;
        this.f367079e = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        os5.p pVar = this.f367079e;
        return java.lang.Integer.valueOf(this.f367078d.a(pVar != null ? pVar.getSuit() : 0, intValue));
    }
}
