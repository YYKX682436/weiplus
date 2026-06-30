package bq2;

/* loaded from: classes2.dex */
public final class f extends bq2.b {

    /* renamed from: e, reason: collision with root package name */
    public final long f105100e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.ea2 f105101f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j17, r45.ea2 streamCard, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 belongRecyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf belongAdapter) {
        super(i17, belongRecyclerView, belongAdapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamCard, "streamCard");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(belongRecyclerView, "belongRecyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(belongAdapter, "belongAdapter");
        this.f105100e = j17;
        this.f105101f = streamCard;
    }

    /* renamed from: toString */
    public java.lang.String m11032x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id=");
        sb6.append(pm0.v.u(this.f105100e));
        sb6.append(", type=");
        r45.qa2 qa2Var = (r45.qa2) this.f105101f.m75936x14adae67(15);
        sb6.append(qa2Var != null ? java.lang.Integer.valueOf(qa2Var.m75939xb282bd08(0)) : null);
        sb6.append(", itemPosition=");
        sb6.append(this.f105093a);
        sb6.append(", belongRecyclerView=");
        sb6.append(this.f105094b);
        sb6.append(", belongAdapter=");
        sb6.append(this.f105095c);
        return sb6.toString();
    }
}
