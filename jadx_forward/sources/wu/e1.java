package wu;

/* loaded from: classes9.dex */
public final class e1 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f531094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rl5.r f531095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f531096c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.j1 f531097d;

    public e1(android.content.Context context, rl5.r rVar, android.text.SpannableString spannableString, wu.j1 j1Var) {
        this.f531094a = context;
        this.f531095b = rVar;
        this.f531096c = spannableString;
        this.f531097d = j1Var;
    }

    @Override // db5.n4
    public void a(db5.g4 contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextMenu, "contextMenu");
        android.content.Context context = this.f531094a;
        contextMenu.c(0, 1, 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
        int i17 = ct.r2.B0;
        i95.m c17 = i95.n0.c(ct.r2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        rl5.r rVar = this.f531095b;
        android.content.res.Resources resources = context.getResources();
        android.text.SpannableString spannableString = this.f531096c;
        wu.j1 j1Var = this.f531097d;
        java.lang.String q17 = j1Var.f531143e.q();
        java.lang.String o17 = j1Var.f531143e.o();
        java.lang.Long p17 = j1Var.f531143e.p();
        te5.x0.a(rVar, contextMenu, resources, spannableString, q17, o17, p17 != null ? p17.longValue() : 0L, 2);
    }
}
