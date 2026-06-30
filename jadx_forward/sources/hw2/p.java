package hw2;

/* loaded from: classes5.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.t f367080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os5.p f367081e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(hw2.t tVar, os5.p pVar) {
        super(1);
        this.f367080d = tVar;
        this.f367081e = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        os5.p pVar = this.f367081e;
        return java.lang.Integer.valueOf(this.f367080d.c(pVar != null ? pVar.getSuit() : 0, intValue));
    }
}
