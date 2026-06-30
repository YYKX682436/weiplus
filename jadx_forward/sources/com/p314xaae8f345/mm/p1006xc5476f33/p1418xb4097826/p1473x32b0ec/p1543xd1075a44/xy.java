package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class xy extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz f201923e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz dzVar) {
        super(0);
        this.f201922d = str;
        this.f201923e = dzVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showConsumeFailDialog ");
        java.lang.String str = this.f201922d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", sb6.toString());
        android.view.View view = this.f201923e.f199702e;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context != null) {
            if (str == null || str.length() == 0) {
                str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573079dh5);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            u1Var.g(str);
            u1Var.n(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dhn));
            u1Var.q(false);
        }
        return jz5.f0.f384359a;
    }
}
