package cr0;

/* loaded from: classes12.dex */
public final class q extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr0.r f303252e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(cr0.r rVar, cr0.r rVar2) {
        super(rVar, rVar2);
        this.f303252e = rVar;
    }

    @Override // rh.o2
    public rh.d3 a() {
        cr0.r rVar = (cr0.r) this.f477018b;
        java.lang.String str = rVar.f303258d;
        cr0.r rVar2 = this.f303252e;
        java.lang.Number number = rh.p2.a(rVar2.f303259e, rVar.f303259e).f477085a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
        int intValue = number.intValue();
        java.lang.Number number2 = rh.p2.a(rVar2.f303260f, rVar.f303260f).f477085a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number2, "get(...)");
        return new cr0.r(str, intValue, number2.longValue());
    }
}
