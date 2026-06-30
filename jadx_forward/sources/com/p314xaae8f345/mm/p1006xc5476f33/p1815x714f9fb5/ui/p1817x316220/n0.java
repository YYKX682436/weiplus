package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes12.dex */
public class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0 f226387d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0 p0Var) {
        this.f226387d = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        za3.b1 b1Var = this.f226387d.Z;
        android.content.Context context = b1Var.f552425a;
        android.content.res.Resources resources = b1Var.f552427c;
        db5.e1.A(context, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggz), "", resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571921tl), resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new za3.x0(b1Var), new za3.y0(b1Var));
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
