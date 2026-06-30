package yx;

/* loaded from: classes14.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f548616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f548617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f.r f548618f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f548619g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, yz5.a aVar, f.r rVar, n0.v2 v2Var) {
        super(0);
        this.f548616d = context;
        this.f548617e = aVar;
        this.f548618f = rVar;
        this.f548619g = v2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f548619g.mo148714x53d8522f(java.lang.Boolean.TRUE);
        android.content.Context context = this.f548616d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (b3.l.m9698x3fed0563(context, "android.permission.RECORD_AUDIO") == 0) {
            this.f548617e.mo152xb9724478();
        } else {
            this.f548618f.a("android.permission.RECORD_AUDIO", null);
        }
        return jz5.f0.f384359a;
    }
}
