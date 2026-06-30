package nf2;

/* loaded from: classes10.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d1 f418315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(nf2.d1 d1Var) {
        super(2);
        this.f418315d = d1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        jz5.l lVar = new jz5.l(java.lang.Float.valueOf(((java.lang.Number) obj).floatValue()), java.lang.Float.valueOf(((java.lang.Number) obj2).floatValue()));
        nf2.d1 d1Var = this.f418315d;
        d1Var.D = lVar;
        nf2.d1.a(d1Var);
        return jz5.f0.f384359a;
    }
}
