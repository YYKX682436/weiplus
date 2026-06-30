package gp3;

/* loaded from: classes9.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f355901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 f355902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gp3.k f355903f;

    public f(gp3.k kVar, android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9) {
        this.f355903f = kVar;
        this.f355901d = bitmap;
        this.f355902e = c16774xbacd37e9;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gp3.k kVar = this.f355903f;
        com.p314xaae8f345.mm.p2802xd031a825.ui.w wVar = kVar.f355913a;
        if (wVar != null) {
            wVar.f295782e = this.f355902e.f234337y;
            android.graphics.Bitmap bitmap = this.f355901d;
            wVar.f295779b = bitmap;
            wVar.f295780c = bitmap;
            db5.d5 d5Var = wVar.f295785h;
            if (d5Var != null && d5Var.isShowing()) {
                wVar.d();
            }
            kVar.f355913a.c(view, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
