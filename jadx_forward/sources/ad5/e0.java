package ad5;

/* loaded from: classes10.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f84778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad5.j0 f84779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f84780f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f84781g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(yz5.q qVar, ad5.j0 j0Var, java.util.List list, android.content.Context context) {
        super(1);
        this.f84778d = qVar;
        this.f84779e = j0Var;
        this.f84780f = list;
        this.f84781g = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.List list = this.f84780f;
        yz5.q qVar = this.f84778d;
        if (qVar != null) {
            qVar.mo147xb9724478(this.f84779e, ad5.i.f84800a, list);
        }
        ad5.j0.e(ad5.j0.f84806a, this.f84781g, list, true, booleanValue);
        return jz5.f0.f384359a;
    }
}
