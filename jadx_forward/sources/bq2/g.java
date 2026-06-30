package bq2;

/* loaded from: classes2.dex */
public final class g extends bq2.b {

    /* renamed from: e, reason: collision with root package name */
    public final long f105102e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f105103f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 belongRecyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf belongAdapter) {
        super(i17, belongRecyclerView, belongAdapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(belongRecyclerView, "belongRecyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(belongAdapter, "belongAdapter");
        this.f105102e = j17;
        this.f105103f = gVar;
    }

    /* renamed from: toString */
    public java.lang.String m11033x9616526c() {
        return "id=" + pm0.v.u(this.f105102e) + ", lastBuffer=" + this.f105103f + ", itemPosition=" + this.f105093a + ", belongRecyclerView=" + this.f105094b + ", belongAdapter=" + this.f105095c;
    }
}
