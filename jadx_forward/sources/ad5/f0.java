package ad5;

/* loaded from: classes10.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zc5.g f84783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f84784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ad5.j0 f84785f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f84786g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f84787h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(zc5.g gVar, yz5.q qVar, ad5.j0 j0Var, java.util.List list, android.content.Context context) {
        super(0);
        this.f84783d = gVar;
        this.f84784e = qVar;
        this.f84785f = j0Var;
        this.f84786g = list;
        this.f84787h = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zc5.g gVar = this.f84783d;
        long j17 = gVar.f552977a;
        java.util.List list = this.f84786g;
        ad5.j0 j0Var = this.f84785f;
        yz5.q qVar = this.f84784e;
        if (j17 != 0 || gVar.f552978b != 0) {
            yc5.m mVar = yc5.m.f542447a;
            android.content.Context context = this.f84787h;
            mVar.c(context, com.p314xaae8f345.mm.R.C30867xcad56011.pcp, j17, gVar.f552978b, new ad5.e0(qVar, j0Var, list, context));
        } else if (qVar != null) {
            qVar.mo147xb9724478(j0Var, new ad5.h(0, "all media expired", 1, null), list);
        }
        return jz5.f0.f384359a;
    }
}
