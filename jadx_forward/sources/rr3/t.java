package rr3;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr3.z f480746d;

    public t(rr3.z zVar) {
        this.f480746d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthScopeUIC$initManageBtnClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rr3.z zVar = this.f480746d;
        if (zVar.f480756f == 1) {
            zVar.f480756f = 2;
            zVar.P6().setText(zVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
        } else {
            zVar.f480756f = 1;
            zVar.P6().setText(zVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573905g93));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewBizInfoAuthScopeUIC", "btn state switched =  " + ((java.lang.Object) zVar.P6().getText()));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = zVar.O6().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthScopeUIC$initManageBtnClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
