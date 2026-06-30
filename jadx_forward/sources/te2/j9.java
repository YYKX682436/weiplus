package te2;

/* loaded from: classes8.dex */
public final class j9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.m9 f499676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f499677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.p8 f499678f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(te2.m9 m9Var, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25, bm2.p8 p8Var) {
        super(1);
        this.f499676d = m9Var;
        this.f499677e = c22849x81a93d25;
        this.f499678f = p8Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        int intValue = ((java.lang.Number) obj).intValue();
        this.f499676d.getClass();
        if (intValue >= 0 && (c22849x81a93d25 = this.f499677e) != null) {
            c22849x81a93d25.post(new te2.g9(this.f499678f, intValue, c22849x81a93d25));
        }
        return jz5.f0.f384359a;
    }
}
