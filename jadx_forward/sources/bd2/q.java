package bd2;

/* loaded from: classes2.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f100812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f100813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100815g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f100816h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context, long j17, java.lang.String str, java.lang.String str2, boolean z17) {
        super(0);
        this.f100812d = context;
        this.f100813e = j17;
        this.f100814f = str;
        this.f100815g = str2;
        this.f100816h = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bd2.r rVar = bd2.r.f100817a;
        rVar.d(this.f100812d, this.f100813e, true);
        rVar.c(this.f100812d, this.f100813e, this.f100814f, this.f100815g, java.lang.Boolean.valueOf(this.f100816h), null);
        return jz5.f0.f384359a;
    }
}
