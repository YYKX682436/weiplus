package al5;

/* loaded from: classes8.dex */
public class m4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f87489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.z8 f87490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ al5.p4 f87491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f87492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f87493h;

    public m4(boolean z17, com.p314xaae8f345.mm.ui.p2740x696c9db.z8 z8Var, al5.p4 p4Var, android.app.Activity activity, android.view.MenuItem menuItem) {
        this.f87489d = z17;
        this.f87490e = z8Var;
        this.f87491f = p4Var;
        this.f87492g = activity;
        this.f87493h = menuItem;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/WXActionMenuView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f87489d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXActionMenuView", "makeMMActionSearchMenuView, onclick, isSearchViewIsSameUI: %s.", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.z8 z8Var = this.f87490e;
            if (z8Var != null) {
                z8Var.mo81133xaaf2e435();
            }
        } else {
            al5.p4 p4Var = this.f87491f;
            if (p4Var != null) {
                p4Var.a(this.f87492g, this.f87493h);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/WXActionMenuView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
