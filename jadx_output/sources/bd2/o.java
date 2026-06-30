package bd2;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f19270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f19271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19273g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f19274h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f19275i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, long j17, java.lang.String str, java.lang.String str2, boolean z17, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        super(1);
        this.f19270d = context;
        this.f19271e = j17;
        this.f19272f = str;
        this.f19273g = str2;
        this.f19274h = z17;
        this.f19275i = y1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.qw4 it = (r45.qw4) obj;
        kotlin.jvm.internal.o.g(it, "it");
        bd2.r rVar = bd2.r.f19284a;
        rVar.d(this.f19270d, this.f19271e, true);
        rVar.c(this.f19270d, this.f19271e, this.f19272f, this.f19273g, java.lang.Boolean.valueOf(this.f19274h), kz5.b0.c(it));
        this.f19275i.q();
        return jz5.f0.f302826a;
    }
}
