package a0;

/* loaded from: classes10.dex */
public final class d3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f81643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f81644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.m3 f81645f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(p3325xe03a0797.p3326xc267989b.y0 y0Var, boolean z17, a0.m3 m3Var) {
        super(2);
        this.f81643d = y0Var;
        this.f81644e = z17;
        this.f81645f = m3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        p3325xe03a0797.p3326xc267989b.l.d(this.f81643d, null, null, new a0.c3(this.f81644e, this.f81645f, ((java.lang.Number) obj2).floatValue(), floatValue, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
