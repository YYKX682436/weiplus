package wv0;

/* loaded from: classes5.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f531434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wv0.q f531435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ex0.a0 a0Var, wv0.q qVar) {
        super(2);
        this.f531434d = a0Var;
        this.f531435e = qVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vv0.n segment = (vv0.n) obj;
        vv0.n beforeSegment = (vv0.n) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(beforeSegment, "beforeSegment");
        ex0.a0 a0Var = this.f531434d;
        a0Var.getClass();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID = segment.f521931a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 beforeSegmentID = beforeSegment.f521931a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(beforeSegmentID, "beforeSegmentID");
        a0Var.f338625b.v(segmentID, beforeSegmentID);
        java.util.EnumSet of6 = java.util.EnumSet.of(cx0.d.f306043f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(of6, "of(...)");
        a0Var.J(of6, null);
        this.f531435e.J();
        return jz5.f0.f384359a;
    }
}
