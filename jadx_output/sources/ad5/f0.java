package ad5;

/* loaded from: classes10.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zc5.g f3250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f3251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ad5.j0 f3252f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3253g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3254h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(zc5.g gVar, yz5.q qVar, ad5.j0 j0Var, java.util.List list, android.content.Context context) {
        super(0);
        this.f3250d = gVar;
        this.f3251e = qVar;
        this.f3252f = j0Var;
        this.f3253g = list;
        this.f3254h = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zc5.g gVar = this.f3250d;
        long j17 = gVar.f471444a;
        java.util.List list = this.f3253g;
        ad5.j0 j0Var = this.f3252f;
        yz5.q qVar = this.f3251e;
        if (j17 != 0 || gVar.f471445b != 0) {
            yc5.m mVar = yc5.m.f460914a;
            android.content.Context context = this.f3254h;
            mVar.c(context, com.tencent.mm.R.string.pcp, j17, gVar.f471445b, new ad5.e0(qVar, j0Var, list, context));
        } else if (qVar != null) {
            qVar.invoke(j0Var, new ad5.h(0, "all media expired", 1, null), list);
        }
        return jz5.f0.f302826a;
    }
}
