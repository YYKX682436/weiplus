package tz0;

/* loaded from: classes14.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f504735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(n0.v2 v2Var, float f17) {
        super(3);
        this.f504735d = v2Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        s1.x0 layout = (s1.x0) obj;
        s1.r0 measurable = (s1.r0) obj2;
        long j17 = ((p2.c) obj3).f432910a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "$this$layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(j17);
        this.f504735d.mo148714x53d8522f(java.lang.Integer.valueOf(m17.f483583d));
        return s1.v0.b(layout, m17.f483583d, m17.f483584e, null, new tz0.m(m17), 4, null);
    }
}
