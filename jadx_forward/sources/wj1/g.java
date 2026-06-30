package wj1;

/* loaded from: classes14.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.o56 f528119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.C12701xfb956a00 f528120e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.C12701xfb956a00 c12701xfb956a00, r45.o56 o56Var) {
        this.f528120e = c12701xfb956a00;
        this.f528119d = o56Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wj1.m0 m0Var = this.f528120e.f171049d;
        if (m0Var != null) {
            java.lang.String str = ((r45.ic) this.f528119d.f463493r.get(1)).f458455e;
            wj1.c0 c0Var = (wj1.c0) m0Var;
            c0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "url2Jump click");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5.T6(c0Var.f528109a, str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
