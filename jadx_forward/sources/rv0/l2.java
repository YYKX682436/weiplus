package rv0;

/* loaded from: classes5.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.j7 f481632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.r f481633e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(rv0.j7 j7Var, ex0.r rVar) {
        super(0);
        this.f481632d = j7Var;
        this.f481633e = rVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        double d17;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = this.f481633e.f338700a;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
        if (c4181x2248e1a3 != null) {
            java.lang.Double valueOf = java.lang.Double.valueOf(c4181x2248e1a3.v1());
            java.lang.Double d18 = java.lang.Double.isNaN(valueOf.doubleValue()) ^ true ? valueOf : null;
            if (d18 != null) {
                d17 = d18.doubleValue();
                this.f481632d.m163188x53b4c105(d17);
                return jz5.f0.f384359a;
            }
        }
        d17 = 1.0d;
        this.f481632d.m163188x53b4c105(d17);
        return jz5.f0.f384359a;
    }
}
