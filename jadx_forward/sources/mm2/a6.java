package mm2;

/* loaded from: classes3.dex */
public final class a6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f410282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(so2.j5 j5Var) {
        super(1);
        this.f410282d = j5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        so2.j5 local = (so2.j5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(local, "local");
        return java.lang.Boolean.valueOf((local instanceof cm2.m0) && ((cm2.m0) local).f124902w == ((cm2.m0) this.f410282d).f124902w);
    }
}
