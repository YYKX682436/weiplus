package ir;

/* loaded from: classes15.dex */
public final class w extends ir.u0 {

    /* renamed from: b, reason: collision with root package name */
    public final ir.v f375443b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ir.v introInfo) {
        super(10);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(introInfo, "introInfo");
        this.f375443b = introInfo;
    }

    @Override // ir.u0
    /* renamed from: equals */
    public boolean mo139714xb2c87fbf(java.lang.Object obj) {
        return super.mo139714xb2c87fbf(obj) && (obj instanceof ir.w) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ir.w) obj).f375443b, this.f375443b);
    }
}
