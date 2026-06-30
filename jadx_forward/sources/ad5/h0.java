package ad5;

/* loaded from: classes10.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zc5.g f84795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f84796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ad5.j0 f84797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f84798g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f84799h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(zc5.g gVar, yz5.q qVar, ad5.j0 j0Var, java.util.List list, android.content.Context context) {
        super(0);
        this.f84795d = gVar;
        this.f84796e = qVar;
        this.f84797f = j0Var;
        this.f84798g = list;
        this.f84799h = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zc5.g gVar = this.f84795d;
        long j17 = gVar.f552977a;
        java.util.List list = this.f84798g;
        ad5.j0 j0Var = this.f84797f;
        yz5.q qVar = this.f84796e;
        if (j17 != 0 || gVar.f552978b != 0) {
            yc5.m mVar = yc5.m.f542447a;
            android.content.Context context = this.f84799h;
            mVar.c(context, com.p314xaae8f345.mm.R.C30867xcad56011.pb9, j17, gVar.f552978b, new ad5.g0(qVar, j0Var, list, context));
        } else if (qVar != null) {
            qVar.mo147xb9724478(j0Var, new ad5.h(0, "all media expired", 1, null), list);
        }
        return jz5.f0.f384359a;
    }
}
