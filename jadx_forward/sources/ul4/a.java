package ul4;

/* loaded from: classes11.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul4.i f510136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f510137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f510138f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ul4.i iVar, int i17, byte[] bArr) {
        super(0);
        this.f510136d = iVar;
        this.f510137e = i17;
        this.f510138f = bArr;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jm4.e0 e0Var = this.f510136d.f510154i;
        if (e0Var != null) {
            byte[] context = this.f510138f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3380x6a61f93.p3381xf512d0a5.C30472x21b4b59e.m169208x21b39de3(((jm4.f0) e0Var).m105978x2737f10(), this.f510137e, context);
        }
        return jz5.f0.f384359a;
    }
}
