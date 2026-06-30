package wu;

/* loaded from: classes9.dex */
public final class f1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f531105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f531106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f531107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wu.j1 f531108g;

    public f1(android.widget.TextView textView, android.content.Context context, android.text.SpannableString spannableString, wu.j1 j1Var) {
        this.f531105d = textView;
        this.f531106e = context;
        this.f531107f = spannableString;
        this.f531108g = j1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(this.f531105d.getText());
            android.content.Context context = this.f531106e;
            db5.e1.W(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
        } else {
            if (itemId != 101) {
                return;
            }
            int i18 = ct.r2.B0;
            i95.m c17 = i95.n0.c(ct.r2.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.content.Context context2 = this.f531106e;
            android.text.SpannableString spannableString = this.f531107f;
            wu.j1 j1Var = this.f531108g;
            java.lang.String q17 = j1Var.f531143e.q();
            java.lang.String o17 = j1Var.f531143e.o();
            java.lang.Long p17 = j1Var.f531143e.p();
            te5.x0.b(context2, spannableString, q17, o17, p17 != null ? p17.longValue() : 0L, 2, true);
        }
    }
}
