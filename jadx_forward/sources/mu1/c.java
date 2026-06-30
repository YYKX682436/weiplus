package mu1;

/* loaded from: classes15.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.w50 f412875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mu1.e f412876e;

    public c(mu1.e eVar, r45.w50 w50Var) {
        this.f412876e = eVar;
        this.f412875d = w50Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/widget/CardWidgetCommon$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.w50 w50Var = this.f412875d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w50Var.f470427w);
        mu1.e eVar = this.f412876e;
        if (!K0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w50Var.f470428x)) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vj(eVar.f412868b, w50Var.f470427w, w50Var.f470428x, false, 16, lu1.a0.g(3));
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w50Var.f470420p)) {
            lu1.d.d(eVar.f412867a.g(), w50Var.f470420p, w50Var.f470421q, 1028, 0);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w50Var.f470414g)) {
            lu1.d.j((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) eVar.f412868b, w50Var.f470414g, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/widget/CardWidgetCommon$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
