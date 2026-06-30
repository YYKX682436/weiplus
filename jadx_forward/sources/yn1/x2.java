package yn1;

/* loaded from: classes11.dex */
public final class x2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f545449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f545450e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(yn1.a4 a4Var, long j17) {
        super(1);
        this.f545449d = a4Var;
        this.f545450e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar = this.f545449d.f545142d;
        if (aVar != null) {
            aVar.r1(this.f545450e, booleanValue);
        }
        return jz5.f0.f384359a;
    }
}
