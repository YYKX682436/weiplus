package ze2;

/* loaded from: classes3.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f553306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f553307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f553308f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, int i18, r45.nw1 nw1Var) {
        super(0);
        this.f553306d = i17;
        this.f553307e = i18;
        this.f553308f = nw1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errCode:");
        sb6.append(this.f553306d);
        sb6.append(" errType:");
        sb6.append(this.f553307e);
        sb6.append(" svrId:");
        r45.nw1 nw1Var = this.f553308f;
        sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)) : null);
        return sb6.toString();
    }
}
