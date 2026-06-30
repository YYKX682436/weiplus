package ad5;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.LifecycleScope f3233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f3235g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ad5.d f3236h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope, java.util.List list, yz5.q qVar, ad5.d dVar) {
        super(0);
        this.f3232d = context;
        this.f3233e = lifecycleScope;
        this.f3234f = list;
        this.f3235g = qVar;
        this.f3236h = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        android.content.Context context = this.f3232d;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getResources().getString(com.tencent.mm.R.string.f490604zq);
        e4Var.f211780g = 2;
        e4Var.f211778e = false;
        v65.i.b(this.f3233e, null, new ad5.b(this.f3234f, e4Var.c(), this.f3235g, this.f3236h, null), 1, null);
        return jz5.f0.f302826a;
    }
}
