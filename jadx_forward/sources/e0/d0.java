package e0;

/* loaded from: classes14.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.r f327064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f327065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f327066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f327067g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.r rVar, long j17, int i17, int i18) {
        super(3);
        this.f327064d = rVar;
        this.f327065e = j17;
        this.f327066f = i17;
        this.f327067g = i18;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        yz5.l placement = (yz5.l) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(placement, "placement");
        int i17 = intValue + this.f327066f;
        long j17 = this.f327065e;
        return ((p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.s) this.f327064d).W(p2.d.e(j17, i17), p2.d.d(j17, intValue2 + this.f327067g), kz5.q0.f395534d, placement);
    }
}
