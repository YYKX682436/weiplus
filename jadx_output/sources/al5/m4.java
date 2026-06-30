package al5;

/* loaded from: classes8.dex */
public class m4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.z8 f5957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ al5.p4 f5958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f5959g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f5960h;

    public m4(boolean z17, com.tencent.mm.ui.tools.z8 z8Var, al5.p4 p4Var, android.app.Activity activity, android.view.MenuItem menuItem) {
        this.f5956d = z17;
        this.f5957e = z8Var;
        this.f5958f = p4Var;
        this.f5959g = activity;
        this.f5960h = menuItem;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/WXActionMenuView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f5956d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "makeMMActionSearchMenuView, onclick, isSearchViewIsSameUI: %s.", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mm.ui.tools.z8 z8Var = this.f5957e;
            if (z8Var != null) {
                z8Var.expandActionView();
            }
        } else {
            al5.p4 p4Var = this.f5958f;
            if (p4Var != null) {
                p4Var.a(this.f5959g, this.f5960h);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/WXActionMenuView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
