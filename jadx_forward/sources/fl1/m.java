package fl1;

/* loaded from: classes7.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.o f345336d;

    public m(fl1.o oVar) {
        this.f345336d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        fl1.h1 h1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeRequestDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fl1.o oVar = this.f345336d;
        if (!oVar.k()) {
            if (oVar.f345363u.c() && !oVar.f345363u.a()) {
                ((android.widget.ScrollView) oVar.f345350e.findViewById(com.p314xaae8f345.mm.R.id.mcm)).fullScroll(130);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeRequestDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.util.ArrayList c17 = fl1.o.c(oVar, true);
        ui1.y yVar = oVar.f345366x;
        java.util.Iterator it = oVar.f345367y.f345384d.iterator();
        while (true) {
            if (!it.hasNext()) {
                h1Var = null;
                break;
            } else {
                h1Var = (fl1.h1) it.next();
                if (h1Var != null && h1Var.f345317f) {
                    break;
                }
            }
        }
        yVar.a(1, c17, h1Var != null ? h1Var.f345319h : 0, oVar.f345363u.d());
        fl1.g2 g2Var = oVar.f345365w;
        if (g2Var != null) {
            g2Var.a(oVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeRequestDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
