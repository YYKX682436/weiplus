package in2;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f374353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.a1 f374354e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(in2.s sVar, in2.a1 a1Var) {
        super(2);
        this.f374353d = sVar;
        this.f374354e = a1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        dk2.yg musicItem = (dk2.yg) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicItem, "musicItem");
        sf2.x xVar = this.f374353d.I;
        xVar.getClass();
        xVar.t7(musicItem);
        this.f374354e.m8147xed6e4d18(intValue);
        return jz5.f0.f384359a;
    }
}
