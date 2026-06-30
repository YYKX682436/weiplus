package qp5;

/* loaded from: classes9.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f447376d;

    public k(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f447376d = abstractActivityC21394xb3d2c0cf;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f447376d;
        java.lang.String string = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kir);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f447376d;
        db5.e1.A(abstractActivityC21394xb3d2c0cf, string, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kio), abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kiq), abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kis), new qp5.i(this), new qp5.j(this));
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
