package bd2;

/* loaded from: classes2.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f100803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f100804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f100807h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f100808i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, long j17, java.lang.String str, java.lang.String str2, boolean z17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        super(1);
        this.f100803d = context;
        this.f100804e = j17;
        this.f100805f = str;
        this.f100806g = str2;
        this.f100807h = z17;
        this.f100808i = y1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.qw4 it = (r45.qw4) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        bd2.r rVar = bd2.r.f100817a;
        rVar.d(this.f100803d, this.f100804e, true);
        rVar.c(this.f100803d, this.f100804e, this.f100805f, this.f100806g, java.lang.Boolean.valueOf(this.f100807h), kz5.b0.c(it));
        this.f100808i.q();
        return jz5.f0.f384359a;
    }
}
