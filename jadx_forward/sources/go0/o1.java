package go0;

/* loaded from: classes14.dex */
public final class o1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.q1 f355342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f355343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f355344f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(go0.q1 q1Var, int i17, int i18) {
        super(0);
        this.f355342d = q1Var;
        this.f355343e = i17;
        this.f355344f = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        go0.s1 s1Var = this.f355342d.f355361o;
        if (s1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateDrawSize: [");
            int i17 = this.f355343e;
            sb6.append(i17);
            sb6.append(',');
            int i18 = this.f355344f;
            sb6.append(i18);
            sb6.append(']');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorRenderer", sb6.toString());
            s1Var.f355378e = i17;
            s1Var.f355379f = i18;
        }
        return jz5.f0.f384359a;
    }
}
