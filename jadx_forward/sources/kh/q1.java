package kh;

/* loaded from: classes12.dex */
public final class q1 extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kh.r1 f389425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(kh.r1 r1Var, kh.r1 r1Var2) {
        super(r1Var, r1Var2);
        this.f389425e = r1Var;
    }

    @Override // rh.o2
    public rh.d3 a() {
        kh.r1 r1Var = (kh.r1) this.f477018b;
        java.lang.String str = r1Var.f389435d;
        kh.r1 r1Var2 = this.f389425e;
        java.lang.Number number = rh.p2.a(r1Var2.f389436e, r1Var.f389436e).f477085a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
        int intValue = number.intValue();
        java.lang.Number number2 = rh.p2.a(r1Var2.f389437f, r1Var.f389437f).f477085a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number2, "get(...)");
        return new kh.r1(str, intValue, number2.longValue());
    }
}
