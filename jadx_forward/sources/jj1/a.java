package jj1;

/* loaded from: classes15.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1188x6854fdf.p1189xd1075a44.C12589x40ea1b77 f381497d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1188x6854fdf.p1189xd1075a44.C12589x40ea1b77 c12589x40ea1b77) {
        this.f381497d = c12589x40ea1b77;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/share/widget/WxaShareMessagePage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k01.t0 t0Var = this.f381497d.f170394q;
        if (t0Var != null) {
            t0Var.b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/share/widget/WxaShareMessagePage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
