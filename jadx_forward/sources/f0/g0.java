package f0;

/* loaded from: classes14.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.r f339622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f339623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f339624f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f339625g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.r rVar, long j17, int i17, int i18) {
        super(3);
        this.f339622d = rVar;
        this.f339623e = j17;
        this.f339624f = i17;
        this.f339625g = i18;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        yz5.l placement = (yz5.l) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(placement, "placement");
        int i17 = intValue + this.f339624f;
        long j17 = this.f339623e;
        return ((p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.s) this.f339622d).W(p2.d.e(j17, i17), p2.d.d(j17, intValue2 + this.f339625g), kz5.q0.f395534d, placement);
    }
}
