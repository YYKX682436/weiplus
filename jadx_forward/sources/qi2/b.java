package qi2;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f445027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f445028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f445029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qi2.n f445030g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, int i17, qf2.y1 y1Var, qi2.n nVar) {
        super(1);
        this.f445027d = context;
        this.f445028e = i17;
        this.f445029f = y1Var;
        this.f445030g = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            android.content.Context context = this.f445027d;
            db5.t7.m123883x26a183b(context, context.getResources().getString(this.f445028e == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.dkh : com.p314xaae8f345.mm.R.C30867xcad56011.f573008dk3), 0).show();
            qi2.n nVar = this.f445030g;
            this.f445029f.k7(((mm2.o4) nVar.f445110h.g().a(mm2.o4.class)).Z, "micLayoutSelectChange");
            nVar.a();
        }
        return jz5.f0.f384359a;
    }
}
