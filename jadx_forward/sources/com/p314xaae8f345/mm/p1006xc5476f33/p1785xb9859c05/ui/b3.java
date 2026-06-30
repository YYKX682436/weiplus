package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes15.dex */
public class b3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.p57 f224293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.d3 f224294e;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.d3 d3Var, r45.p57 p57Var) {
        this.f224294e = d3Var;
        this.f224293d = p57Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16141x4dcd32b5 activityC16141x4dcd32b5 = this.f224294e.f224313d.f224359e;
        activityC16141x4dcd32b5.f224182n.f442291d++;
        java.lang.String str = this.f224293d.f464314m;
        activityC16141x4dcd32b5.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallPackageUI", "startPurchasePackage productID:%s", str);
        android.app.ProgressDialog progressDialog = activityC16141x4dcd32b5.f224178g;
        if (progressDialog == null) {
            activityC16141x4dcd32b5.f224178g = db5.e1.Q(activityC16141x4dcd32b5.mo55332x76847179(), activityC16141x4dcd32b5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16141x4dcd32b5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5w), true, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.y2(activityC16141x4dcd32b5));
        } else {
            progressDialog.show();
        }
        activityC16141x4dcd32b5.f224181m = new p83.j(str);
        c01.d9.e().g(activityC16141x4dcd32b5.f224181m);
    }
}
