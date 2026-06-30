package ad5;

/* loaded from: classes10.dex */
public final class i0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zc5.g f3269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f3270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ad5.j0 f3271g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3272h;

    public i0(android.content.Context context, zc5.g gVar, yz5.q qVar, ad5.j0 j0Var, java.util.List list) {
        this.f3268d = context;
        this.f3269e = gVar;
        this.f3270f = qVar;
        this.f3271g = j0Var;
        this.f3272h = list;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            android.content.Context context = this.f3268d;
            zc5.g gVar = this.f3269e;
            boolean z17 = gVar.f471446c;
            ad5.f0 f0Var = new ad5.f0(gVar, this.f3270f, this.f3271g, this.f3272h, context);
            kotlin.jvm.internal.o.g(context, "context");
            if (z17) {
                db5.e1.y(context, context.getString(com.tencent.mm.R.string.pbd), "", context.getString(com.tencent.mm.R.string.l_e), new ad5.k0(f0Var));
                return;
            } else {
                f0Var.invoke();
                return;
            }
        }
        if (itemId != 2) {
            return;
        }
        android.content.Context context2 = this.f3268d;
        zc5.g gVar2 = this.f3269e;
        boolean z18 = gVar2.f471446c;
        ad5.h0 h0Var = new ad5.h0(gVar2, this.f3270f, this.f3271g, this.f3272h, context2);
        kotlin.jvm.internal.o.g(context2, "context");
        if (z18) {
            db5.e1.y(context2, context2.getString(com.tencent.mm.R.string.pbc), "", context2.getString(com.tencent.mm.R.string.l_e), new ad5.k0(h0Var));
        } else {
            h0Var.invoke();
        }
    }
}
