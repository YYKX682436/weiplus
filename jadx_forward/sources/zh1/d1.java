package zh1;

/* loaded from: classes8.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh1.e1 f554407d;

    public d1(zh1.e1 e1Var) {
        this.f554407d = e1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/openmaterial/ListBottomSheetEnhanceLogic$buildMoreOpenWaysView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ListBottomSheetEnhanceLogic", "buildMoreOpenWaysView#onClick");
        zh1.e1 e1Var = this.f554407d;
        e1Var.f554481f.u();
        zh1.v0 v0Var = e1Var.f554483h;
        if (v0Var == null) {
            zh1.a aVar = zh1.n.f554442o;
            zh1.n.f554444q = e1Var.f554479d;
            v0Var = aVar.b(e1Var.f554480e, e1Var.f554481f, e1Var.f554482g, e1Var.f554484i, e1Var.f554485m);
            e1Var.f554483h = v0Var;
        }
        v0Var.mo178969x35dafd();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/openmaterial/ListBottomSheetEnhanceLogic$buildMoreOpenWaysView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
