package ad5;

/* loaded from: classes10.dex */
public final class i0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f84801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zc5.g f84802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f84803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ad5.j0 f84804g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f84805h;

    public i0(android.content.Context context, zc5.g gVar, yz5.q qVar, ad5.j0 j0Var, java.util.List list) {
        this.f84801d = context;
        this.f84802e = gVar;
        this.f84803f = qVar;
        this.f84804g = j0Var;
        this.f84805h = list;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            android.content.Context context = this.f84801d;
            zc5.g gVar = this.f84802e;
            boolean z17 = gVar.f552979c;
            ad5.f0 f0Var = new ad5.f0(gVar, this.f84803f, this.f84804g, this.f84805h, context);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (z17) {
                db5.e1.y(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pbd), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), new ad5.k0(f0Var));
                return;
            } else {
                f0Var.mo152xb9724478();
                return;
            }
        }
        if (itemId != 2) {
            return;
        }
        android.content.Context context2 = this.f84801d;
        zc5.g gVar2 = this.f84802e;
        boolean z18 = gVar2.f552979c;
        ad5.h0 h0Var = new ad5.h0(gVar2, this.f84803f, this.f84804g, this.f84805h, context2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        if (z18) {
            db5.e1.y(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pbc), "", context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), new ad5.k0(h0Var));
        } else {
            h0Var.mo152xb9724478();
        }
    }
}
