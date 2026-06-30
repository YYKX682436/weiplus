package ad5;

/* loaded from: classes10.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f84789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad5.j0 f84790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f84791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f84792g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(yz5.q qVar, ad5.j0 j0Var, java.util.List list, android.content.Context context) {
        super(1);
        this.f84789d = qVar;
        this.f84790e = j0Var;
        this.f84791f = list;
        this.f84792g = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.List list = this.f84791f;
        yz5.q qVar = this.f84789d;
        if (qVar != null) {
            qVar.mo147xb9724478(this.f84790e, ad5.i.f84800a, list);
        }
        ad5.j0.e(ad5.j0.f84806a, this.f84792g, list, false, booleanValue);
        return jz5.f0.f384359a;
    }
}
