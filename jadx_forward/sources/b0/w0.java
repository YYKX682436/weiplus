package b0;

/* loaded from: classes14.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1.f f98103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f98104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(q1.f fVar, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var) {
        super(2);
        this.f98103d = fVar;
        this.f98104e = e0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        p1.s event = (p1.s) obj;
        float floatValue = ((java.lang.Number) obj2).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        q1.g.a(this.f98103d, event);
        event.a();
        this.f98104e.f391648d = floatValue;
        return jz5.f0.f384359a;
    }
}
