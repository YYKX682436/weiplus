package ad5;

/* loaded from: classes10.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f3256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad5.j0 f3257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3259g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(yz5.q qVar, ad5.j0 j0Var, java.util.List list, android.content.Context context) {
        super(1);
        this.f3256d = qVar;
        this.f3257e = j0Var;
        this.f3258f = list;
        this.f3259g = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.List list = this.f3258f;
        yz5.q qVar = this.f3256d;
        if (qVar != null) {
            qVar.invoke(this.f3257e, ad5.i.f3267a, list);
        }
        ad5.j0.e(ad5.j0.f3273a, this.f3259g, list, false, booleanValue);
        return jz5.f0.f302826a;
    }
}
