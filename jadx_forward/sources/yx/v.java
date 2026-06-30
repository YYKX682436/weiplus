package yx;

/* loaded from: classes5.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f548620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f548621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f548622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f548623g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, yz5.a aVar, n0.v2 v2Var, n0.v2 v2Var2) {
        super(0);
        this.f548620d = context;
        this.f548621e = aVar;
        this.f548622f = v2Var;
        this.f548623g = v2Var2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f548622f.mo148714x53d8522f(bool);
        this.f548623g.mo148714x53d8522f(bool);
        android.content.Context context = this.f548620d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (b3.l.m9698x3fed0563(context, "android.permission.RECORD_AUDIO") == 0) {
            this.f548621e.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
