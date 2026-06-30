package xn5;

/* loaded from: classes13.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f537222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.y f537223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f537224f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, p012xc85e97e9.p093xedfae76a.y yVar, java.lang.String str) {
        super(0);
        this.f537222d = context;
        this.f537223e = yVar;
        this.f537224f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xn5.p0 p0Var = xn5.q0.f537235a;
        if (!(p0Var.b() instanceof xn5.n)) {
            p0Var.b().b().d(this.f537222d, this.f537223e, this.f537224f);
            xn5.q0.f537242h = null;
        }
        return jz5.f0.f384359a;
    }
}
